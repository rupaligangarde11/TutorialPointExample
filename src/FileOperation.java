import java.io.File;
import java.io.IOException;

public class FileOperation {

    public static void main(String[] args) {
        File firstFile = new File("/Users/rupalig/TWU/TutorialPointExamples/src/file1");
        File secondFile = new File("/Users/rupalig/TWU/TutorialPointExamples/src/file2");
        File thirdFile = new File("/Users/rupalig/TWU/TutorialPointExamples/src/file3");

        try {
            isFileCreated(thirdFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        compareFileBasedOnFilePath(firstFile, secondFile);
    }

    private static void isFileCreated(File file) throws IOException {
        if(file.createNewFile())
            System.out.println("file created");
        else
            System.out.println("file didn't create");
    }

    private static void compareFileBasedOnFilePath(File firstFile, File secondFile) {
        if(firstFile.compareTo(secondFile)==0)
            System.out.println("yeah, files are same");
        else
            System.out.println("no, files are not same");
    }
}
