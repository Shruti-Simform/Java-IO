import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            File log = new File("/home/shruti/Desktop/Practical Submission/IOfile2.txt");
            FileOutputStream fout = new FileOutputStream(log, true);
            fout.write(65);
            fout.write(10);
            String s = "Java Language";
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}