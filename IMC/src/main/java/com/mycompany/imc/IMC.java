/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imc;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author Andre
 */
public class IMC {

    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso (kg):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura (m):"));

        double imc = peso / (altura * altura);

        DecimalFormat df = new DecimalFormat("#.00"); // Formata com 2 casas decimais

        JOptionPane.showMessageDialog(null, "Seu IMC é: " + df.format(imc));
    }
}
    
