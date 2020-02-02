import java.io.*;
import java.lang.Math;

public class Picmaker {
    public static boolean isElement(int a, int b) { //a + bi
        return true;
    }

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("mandel.ppm");
            String heading = "P3 500 500 255\n";
            for (int i = 250; i > -250; i--) { //x coord
                for (int j = 250; j > -250; j--) { //y coord
                    heading += (Math.abs(j)) % 255 + " ";
                    heading += "0 0 ";
                }
                if (i != -499) {
                    heading += "\n";
                }
            }
            writer.write(heading);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
