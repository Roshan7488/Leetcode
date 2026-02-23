class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] tokens=preorder.split(",");
        Stack<String> stack=new Stack<>();
        for(String token:tokens){
            stack.push(token);
            while(stack.size()>=3 && stack.peek().equals("#")){
                stack.pop();
                if(stack.peek().equals("#")){
                    stack.pop();
                    if(stack.peek().equals("#"))return false;
                    stack.pop();
                    stack.push("#");
                }else{
                stack.push("#");
                break;
                }
            }
        }
        return stack.size()==1 && stack.peek().equals("#");
    }
}