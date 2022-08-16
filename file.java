import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
 
class file
{
    public static void main(String[] args)
    {
        File from = new File("/var/www/src");
        File to = new File("/var/www/dest");
 
        try {
            Files.move(from.toPath(), to.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Directory moved successfully.");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}