/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversornumero;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ConversorNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "BIENVENIDO A CONVERSOR DE NUMERO:");
        int decimalNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero en base decimal: "));

        JOptionPane.showMessageDialog(null, "Numero decimal ingresado: "+decimalNumber+
                "\nNumero en binario: "+Integer.toBinaryString(decimalNumber)+
                "\nNumero en octal: "+Integer.toOctalString(decimalNumber)+
                "\nNumero en hexadecimal: "+Integer.toHexString(decimalNumber));
//        System.out.println("Número decimal ingresado: " + decimalNumber);
//        System.out.println("Número en binario: " + Integer.toBinaryString(decimalNumber));
//        System.out.println("Número en octal: " + Integer.toOctalString(decimalNumber));
//        System.out.println("Número en hexadecimal: " + Integer.toHexString(decimalNumber));
    }
}
