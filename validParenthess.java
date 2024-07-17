class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(current == '(' || current == '{' || current == '[') {
                st.push(current);
            } else {
                if(st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if(current == ')' && top != '(') {
                    return false;
                }
                if(current == ']' && top != '[') {
                    return false;
                }
                if(current == '}' && top != '{') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
