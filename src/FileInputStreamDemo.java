import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("/home/shruti/Desktop/Practical Submission/IOfile2.txt");
            int j = 0;
            while ((j = fin.read()) != -1) {
                System.out.print((char) j);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
