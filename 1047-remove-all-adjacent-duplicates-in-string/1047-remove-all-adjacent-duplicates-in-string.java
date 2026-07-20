class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i< s.length(); i++) {
            char current = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(current);
            }  else if (current == stack.peek()) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (! stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
        
        
    }
}