public class SearchLastString {
    public  static void main(String args[]){
        String firstString = "Hello World, Hello Reader";
        int lastIndex= firstString.lastIndexOf("Hello");
        if(lastIndex == -1)
            System.out.println("No Hello String is present");
        else System.out.println("last occurance of Hello: "+lastIndex);
    }
}
