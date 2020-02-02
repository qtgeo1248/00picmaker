import java.io.*;
import java.lang.Math;

public class Picmaker {
    public static boolean isElement(int a, int b) { //a + bi
        double x = 0.0;
        double y = 0.0;
        for (int i = 0; i < 1000; i++) {

        }
        return true;
    }

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("mandel.ppm");
            String current = "P3 500 500 255\n";
            writer.write(current);
            for (int i = 250; i > -250; i--) { //x coord
                for (int j = 250; j > -250; j--) { //y coord
                    current = Math.abs(j) % 255 + " ";
                    current += "0 0 ";
                    writer.write(current);
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
