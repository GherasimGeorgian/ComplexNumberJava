package Complex.ui;
import Complex.service.Service;
import Complex.model.ValidationException;

import java.util.List;
import java.util.Scanner;


public class UIConsole {
    private Service service;

    public void setService(Service srv) {
        this.service = srv;
    }

    public void printCommands() {
        System.out.println("1. Expresie aritmetica");
    }

    private String input(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextLine();
    }

    public void showUI() {
        String cmd = "";
        boolean isRunning = true;

        while (isRunning) {
            printCommands();

            cmd = input("Enter command: ");
            System.out.println();

            switch (cmd) {
                case "1":
                    checkExpresion();
                    break;

                case "0":
                    System.out.println("Bye");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid command!");
                    break;
            }
            System.out.println("\n--------------");

            if (cmd == "0" || isRunning == false)
                break;
        }
    }

    private void checkExpresion() {
        try {
            String expresion = input("Insert expresion = ");

           boolean result = service.checkExpresion(expresion);
            service.Calculeaza(expresion);
            System.out.println(result);
        }
        catch (ValidationException ex) {
            System.out.println("Invalid expresion: " + ex.getMessage());
        }
    }

}
