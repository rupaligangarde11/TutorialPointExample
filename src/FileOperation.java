import java.io.File;

public class FileOperation {

    public static void main(String[] args) {
        File firstFile = new File("/Users/rupalig/TWU/TutorialPointExamples/src/file1");
        File secondFile = new File("/Users/rupalig/TWU/TutorialPointExamples/src/file2");
        compareFileBasedOnFilePath(firstFile, secondFile);
    }

    private static void compareFileBasedOnFilePath(File firstFile, File secondFile) {
        if(firstFile.compareTo(secondFile)==0)
            System.out.println("yeah, files are same");
        else
            System.out.println("no, files are not same");
    }
}
