class Solution {
    public String decodeString(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==']'){
                String str="";
                while(stack.peek()!='['){
                    str=stack.pop()+str;
                }
                stack.pop();
                String num="";
                while(!stack.isEmpty()&&Character.isDigit(stack.peek())){
                    num=stack.pop()+num;
                }
                int repeat=Integer.parseInt(num);
                StringBuilder temp=new StringBuilder();
                for(int j=0;j<repeat;j++){
                    temp.append(str);
                }
                for(char c:temp.toString().toCharArray()){
                    stack.push(c);
                }
            }
            else{
            stack.push(ch);
            }
        }
        String result="";
        while(!stack.isEmpty()){
            result=stack.pop()+result;
        }
        return result;
    }
}