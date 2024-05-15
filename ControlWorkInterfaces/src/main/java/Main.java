import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Avto[] avtos = new Avto[9];
        avtos[0] = new Avto("Parking1", 2010);
        avtos[1] = new Avto("Parking2", 2020);
        for (int i = 0; i < 2; i++) {
            avtos[i].rdAvto();
        }
    }
}