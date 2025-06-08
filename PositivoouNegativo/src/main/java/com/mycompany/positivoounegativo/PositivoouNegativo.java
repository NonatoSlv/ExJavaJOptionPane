/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.positivoounegativo;

import javax.swing.JOptionPane;

/**
 *
 * @author Andre
 */
public class PositivoouNegativo {

    public static void main(String[] args) {
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, numero + " é POSITIVO.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, numero + " é NEGATIVO.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é ZERO.");
        }
    }
}
