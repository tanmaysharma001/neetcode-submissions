class Solution {
    public boolean isPalindrome(String s) {

        String clean = "";
        String rev = "";

        for(int i=0; i<s.length(); i++){

            char c = s.charAt(i);

            if((c >= 'A' && c <= 'Z') ||
               (c >= 'a' && c <= 'z') ||
               (c >= '0' && c <= '9')){

                clean += Character.toLowerCase(c);
            }
        }

        for(int i=clean.length()-1; i>=0; i--){
            rev += clean.charAt(i);
        }

        return clean.equals(rev);
    }
}