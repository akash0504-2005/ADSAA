import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
      
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";
        
      
        copyFile(sourceFile, destinationFile);
    }

  
    public static void copyFile(String sourceFile, String destinationFile) {
        FileInputStream inStream = null;
        FileOutputStream outStream = null;

        try {
            
            inStream = new FileInputStream(sourceFile);
            
            outStream = new FileOutputStream(destinationFile);

            
            int byteRead;

          
            while ((byteRead = inStream.read()) != -1) {
                outStream.write(byteRead);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error occurred during file copy: " + e.getMessage());
        } finally {
        
            try {
                if (inStream != null) {
                    inStream.close();
                }
                if (outStream != null) {
                    outStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing streams: " + e.getMessage());
            }
        }
    }
}

//output
Hello, this is a test file!

