class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < tokens.length; i++){
            String s1 = tokens[i];

            if(!(s1.equals("+") ||                                              //number
                s1.equals("-") ||
                s1.equals("*") ||
                s1.equals("/"))){
                    int num = Integer.parseInt(s1);
                    stack.push(num);
                }
            else{   
                int temp;                                                        //operators
                if(s1.equals("+")){
                    int t1 = stack.pop();
                    int t2 = stack.pop();
                    temp = t2 + t1;
                }
                else if(s1.equals("*")){
                    int t1 = stack.pop();
                    int t2 = stack.pop();
                    temp = t2 * t1;
                }
                else if(s1.equals("-")){
                    int t1 = stack.pop();
                    int t2 = stack.pop();
                    temp = t2 - t1;
                }
                else{
                    int t1 = stack.pop();
                    int t2 = stack.pop();
                    temp = t2/t1;
                }
                stack.push(temp);
            }
        }
        return stack.peek();
    }
}
