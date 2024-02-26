class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;

        String out = "";
        for(int i = 0; i < s.length(); i++)
        {
            char currentChar = s.charAt(i);

            if(!Character.isLetterOrDigit(currentChar))
                continue;

            else
                out += Character.toLowerCase(currentChar);
        }

        int first = 0;
        int last = out.length() - 1;
        while(first < last)
        {
            if(out.charAt(first) != out.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }

        return true;

    }
}
