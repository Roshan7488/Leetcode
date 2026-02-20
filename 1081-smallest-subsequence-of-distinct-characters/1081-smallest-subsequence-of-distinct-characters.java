class Solution {
    public String smallestSubsequence(String s) {
        int[] lastOccur=new int[26];
        for(int i=0;i<s.length();i++){
            lastOccur[s.charAt(i)-'a']=i;
        }
        HashSet<Character> set=new HashSet<>();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(ch)) continue;
            while(!stack.isEmpty() && lastOccur[stack.peek()-'a']>i && ch<stack.peek()){
                set.remove(stack.pop());
            }
            stack.push(ch);
            set.add(ch);
        }
        String str="";
        for(char ch:stack){
            str+=ch;
        }
        return str;
    }
}