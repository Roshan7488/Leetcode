class Solution {
    public int calculate(String s) {
        int len=s.length();
        char sign='+';
        int num=0;
        char c;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<len;i++){
            c=s.charAt(i);
            if(Character.isDigit(c)){
               num=num*10+(c-'0'); 
            }
            if((!Character.isDigit(c) && c!=' ')|| i==len-1){
                if(sign=='+'){
                    stack.push(num);
                }else if(sign=='-'){
                    stack.push(-num);
                }else if(sign=='*'){
                    stack.push(stack.pop()*num);
                }else if(sign=='/'){
                    stack.push(stack.pop()/num);
                }
                sign=c;
                num=0;
            }
        }
        int ans=0;
        for(int val:stack){
            ans+=val;
        }
        return ans;
    }
}