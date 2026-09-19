package mx.edu.utng;

public class RepasoArreglos2 {
    public static void main(String[] args) {

        String[][] nombres = new String[3][3];

        nombres[0][0] = "Jonatan Venancio";
        nombres[0][1] = "Aguilar Hernandez";
        nombres[0][2] = "18";

        nombres[1][0] = "Jose Emmanuel";
        nombres[1][1] = "Arredondo Escalente";
        nombres[1][2] = "22";

        nombres[2][0] = "Yanelli";
        nombres[2][1] = "Sanchez Cardenas";
        nombres[2][2] = "19";

        System.out.println("Nombres:");

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i][0]);
        }

        System.out.println("\nApellidos:");

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i][1]);
        }
    }
}