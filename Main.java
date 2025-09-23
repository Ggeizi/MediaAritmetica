package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        float nota1, nota2, mediaAritmetica;


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!\n");

        System.out.print("Digite o valor da primeira nota: ");
        nota1 = scanner.nextInt();

        System.out.print("Digite o valor da segunda nota: ");
        nota2 = scanner.nextInt();

        mediaAritmetica = (nota1 + nota2) / 2;

            System.out.println("Primeira nota= " + nota1);
            System.out.println("Segunda nota= " + nota2);
        System.out.println("A media do aluno é= " + mediaAritmetica);


    }
}