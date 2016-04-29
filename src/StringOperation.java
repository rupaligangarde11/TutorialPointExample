public class StringOperation {
    public  static void main(String args[]){
        String firstString = "Hello World, Hello Reader";
        int position =3;

        searchLastString(firstString);
        System.out.println(removeCharAt(firstString, position));

        return;
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