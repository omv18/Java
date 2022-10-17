class LastChar {
    public static void moveChar(String str,int idx, int count,String newString) {
        if(idx == str.length()) {
            for(int i=0; i<count; i++)
                newString += 'x';
            System.out.print(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        if(currentChar == 'x') {
            count++;
            moveChar(str,idx+1,count,newString);
        }
        else {
            newString += currentChar;
            moveChar(str,idx+1,count,newString);
        } 
    }
    public static void main(String args[]) {
        String str = "acxbxxd";
        moveChar(str,0,0,"");
    }
}