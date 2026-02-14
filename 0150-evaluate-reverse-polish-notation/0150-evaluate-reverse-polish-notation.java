class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int num1,num2,val;
        for(String str:tokens){
           if(!str.equals("+")&&!str.equals("-")&&!str.equals("*")&&!str.equals("/")){
            stack.push(Integer.parseInt(str));
           }
           else{
            num1=stack.pop();
            num2=stack.pop();
            switch(str){
                case "+":
                val=num1+num2;
                stack.push(val);
                break;
                case "-":
                val=num2-num1;
                stack.push(val);
                break;
                case "*":
                val=num1*num2;
                stack.push(val);
                break;
                case "/":
                val=num2/num1;
                stack.push(val);
                break;
                default:
                System.out.println("invalid!");
            }
           }
        }
        return stack.pop();
    }
}