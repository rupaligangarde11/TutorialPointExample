import java.io.File;
import java.io.IOException;
import java.util.Date;

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

        fileLastModifiedAt(firstFile);
        compareFileBasedOnFilePath(firstFile, secondFile);
    }

    private static void fileLastModifiedAt(File firstFile) {
        Long lastModified = firstFile.lastModified();
        Date date = new Date(lastModified);
        System.out.println("file1 was last modified on" + date);
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
