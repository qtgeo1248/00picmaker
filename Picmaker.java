import java.io.*;
import java.lang.Math;

public class Picmaker {
    public static boolean isElement(double a, double b) { //a + bi
        double x = 0.0;
        double y = 0.0;
        //x + yi
        //x^2 - y^2
        //2xyi
        for (int i = 0; i < 1000; i++) {
            x = x * x - y * y;
            y = 2 * x * y;
            x += a;
            y += b;
            if (x * x + y * y >= 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("mandel.ppm");
            writer.write("P3 400 400 255");
            for (int i = 200; i > -200; i--) { //x coord
                for (int j = 200; j > -200; j--) { //y coord
                    if (isElement(j / 100.0, i / 100.0)) {
                        writer.write(" 0 0 0");
                    } else {
                        writer.write(" 255 0 0");
                    }
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
