package todo;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        MenuConsola menu = new MenuConsola(gestor, scanner);

        menu.iniciar();

        scanner.close();
    }
}
