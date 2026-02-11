class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String prev = "";
        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            if (ch != '/') {
                prev += ch;
            } else {
                if (!prev.equals("")) {
                    if (prev.equals("..")) {
                        if (!stack.isEmpty())
                            stack.pop();
                    } else if (!prev.equals(".")) {
                        stack.push(prev);
                    }
                    prev="";
                }
            }
        }
        if(!prev.equals("")){
            if(prev.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if(!prev.equals(".")){
                stack.push(prev);
            }
        }
        String result="";
        for(String dir:stack){
            result+="/"+dir;
        }
        return result.equals("") ? "/":result;
    }
}