class Solution {
    public String removeDuplicateLetters(String s) {
        HashSet<Character> set=new HashSet<>();
        int[] lastoccur=new int[26];
        for(int i=0;i<s.length();i++){
            lastoccur[s.charAt(i)-'a']=i;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(ch)) continue;
            while(!stack.isEmpty() && lastoccur[stack.peek()-'a']>i && stack.peek()>ch){
                set.remove(stack.pop());
            }
            stack.push(ch);
            set.add(ch);
        }
        String str="";
        for(char c:stack){
            str+=c;
        }
        return str;
        
    }
}