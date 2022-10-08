class Duplicate {
    public static boolean[] map = new boolean[26];
    public static void removeduplicate(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.print(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        if(map[currentChar - 'a']) {
            removeduplicate(str, idx+1, newString);
        }
        else {
            newString += currentChar;
            map[currentChar - 'a']  = true;
            removeduplicate(str, idx+1, newString);
        } 
    }
    public static void main(String args[]) {
        String str = "acxbcaxxd";
        removeduplicate(str,0,"");
    }
}