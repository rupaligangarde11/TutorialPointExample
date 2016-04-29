public class StringOperation {
    public  static void main(String args[]){


        String firstString = "Hello World, Hello Reader";
        String secondString = "I said Hello";

        int position =3;

        searchLastString(firstString);
        System.out.println(removeCharAt(firstString, position));
        reverseString(firstString);
        splitString(firstString);

        matchesRegion(firstString, secondString);
        measureStringLiteralCreationTime();

        unicodeAt(firstString);


    }

    private static void unicodeAt(String firstString) {
        System.out.println("unicode code point at position 5 in string is : " + firstString.codePointAt(5));
    }

    private static void measureStringLiteralCreationTime() {
        long startTime = System.currentTimeMillis();
        for (int i =0;i<50000;i++){
            String str1= "Hie";
            String str2 = "Hello";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("time for string literals creation : " +(endTime-startTime));
    }

    private static void matchesRegion(String firstString, String secondString) {
        System.out.println(firstString.regionMatches(0,secondString,7,5));
    }

    private static void splitString(String firstString) {
        String delimeter = ",";
        String[] spittedString;
        spittedString = firstString.split(delimeter);
        for(String eachString : spittedString)
            System.out.println(eachString);
    }

    private static void reverseString(String firstString) {
        StringBuilder reverseString = new StringBuilder(firstString);
        reverseString.reverse().toString();
        System.out.println(reverseString);
    }

    private static String removeCharAt(String firstString, int position) {
        return firstString.substring(0,position) + firstString.substring(position+1,firstString.length());
    }

    private static void searchLastString(String firstString) {
        int lastIndex= firstString.lastIndexOf("Hello");
        if(lastIndex == -1)
            System.out.println("No Hello String is present");
        else System.out.println("last occurance of Hello: "+lastIndex);
    }
}
