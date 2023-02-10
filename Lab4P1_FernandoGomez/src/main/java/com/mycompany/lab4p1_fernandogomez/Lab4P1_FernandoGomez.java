package com.mycompany.lab4p1_fernandogomez;

import java.util.Scanner;

public class Lab4P1_FernandoGomez {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int caso = 0;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Substitute");
            System.out.println("2. Palíndromas");
            System.out.println("3. Contenida o no");
            System.out.println("4. Salir");
            caso = entrada.nextInt();

            switch (caso) {
                case 1:
                    entrada = new Scanner(System.in);
                    System.out.print("Ingrese una cadena (con el símbolo %d):");
                    String cadenab = entrada.nextLine();
                    System.out.println("Ingrese cadena que hará la sustitución:");
                    String mas = entrada.nextLine();
                    String ncadena = " ";
                    for (int i = 0; i < cadenab.length(); i++) {
                        if (cadenab.charAt(i) == '%') {
                            ncadena = ncadena + mas;
                            i = i + 1;
                        } else {
                            ncadena = ncadena + cadenab.charAt(i);
                        }
                    }
                    System.out.println(ncadena);
                    break;
                case 2:
                    entrada = new Scanner(System.in);

                    System.out.println("Ingrese una palabra: ");
                    String pali = entrada.nextLine();
                    pali = pali.toLowerCase();
                    int cont = 0;
                    for (int i = 0, j = pali.length() - 1; i <= j; i++, j--) {
                        if (pali.charAt(i) != pali.charAt(j)) {
                            cont = cont + 1;
                        } else {
                        }
                    }

                    if (cont == 0) {
                        System.out.println("La palabra es palíndroma.");
                    } else {
                        System.out.println("La palabra no es palindroma. ");
                    }
                    break;

                case 3:
                    entrada = new Scanner(System.in);
                    System.out.println("Ingrese una cadena (larga)");
                    String larga = entrada.nextLine();
                    System.out.println("Ingrese una cadena (corta)");
                    String corta = entrada.nextLine();
                    int num = 0;
                    for (int i = 0; i < larga.length(); i++) {
                        for (int k = 0; k <= corta.length()-1 ; k++) {        
                        if (larga.charAt(i) == corta.charAt(k)) {
                            num = num + 1;
                        }
                        }
                    }
                    if (num >= corta.length()) {
                        System.out.println("Resultado: La cadena corta está contenida en la cadena larga.");
                    } else {
                        System.out.println("Resultado: La cadena corta no está contenida en la cadena larga.");
                    }
                    break;
                case 4:
                    System.out.println(".....Bye (0-0)/.....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("El numero ingresado no es valido \n *ingrese otro");
                    break;
            }
        }
    }
}
