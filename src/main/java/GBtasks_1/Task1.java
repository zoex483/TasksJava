package GBtasks_1;

/**
 Given an input string s, reverse the order of the words.

 A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

 Return a string of the words in reverse order concatenated by a single space.
 */
class Task1 {

    public String reverseWords(String s) {
        StringBuffer sb = removeSpace(s);

        reverseString(sb, 0, sb.length()-1);
        reverseEachWord(sb);
        return sb.toString();
    }

    private StringBuffer removeSpace(String s){
        int l = 0;
        int r = s.length() - 1;
        while(s.charAt(l) == ' ') l++;
        while(s.charAt(r) == ' ') r--;
        StringBuffer sb = new StringBuffer();
        while(l <= r) {
            char c = s.charAt(l);
            if(c != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }
            l++;
        }
        return sb;
    }

    private void reverseString(StringBuffer sb, int l, int r) {
        while(l < r) {
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, temp);
            l++;
            r--;
        }
    }

    private void reverseEachWord(StringBuffer sb) {
        int l = 0;
        int r = 1;
        int n = sb.length();
        while (l < n) {
            while (r < n && sb.charAt(r) != ' ') {
                r++;
            }
            reverseString(sb, l, r-1);
            l = r+1;
            r = l+1;
        }
    }
}