class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++){
            char c = arr[i];

            if(c == '(' || c == '{' || c == '[')
                stack.push(c);

            else{

                if(stack.isEmpty())
                    return false;
                
                char top = stack.peek();

                if(c == ')' && top!= '(' || c == '}' && top!= '{' || c == ']' && top!= '[')
                    return false;
                
                stack.pop();
            }
        }
        return stack.isEmpty();
        
    }
}
