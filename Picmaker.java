import java.io.*;

public class Picmaker {
    public static boolean isElement(int a, int b) { //a + bi
        return true;
    }

    public static void main(String[] args) {
        try {
            File f = new File("mandel.ppm");
            FileWriter writer = new FileWriter(f);
            
        } catch (IOException e) {
            System.out.println("Wrong name");
        }
    }
}
