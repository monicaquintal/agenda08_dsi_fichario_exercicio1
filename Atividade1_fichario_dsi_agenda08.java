package atividade1_fichario_dsi_agenda08;

import javax.swing.JOptionPane;

public class Atividade1_fichario_dsi_agenda08 {

    public static void main(String[] args) {
        // declaração de variáveis
        int idade;
        int pessoas = 0;
        String nota = "";
        String letraA = "A";
        String letraB = "B";
        String letraC = "C";
        String letraD = "D";
        String letraE = "E";
        int totalA = 0;
        int totalB = 0;
        int totalC = 0;
        int totalD = 0;
        int totalE = 0;
        int idadeD = 0;
        
        while (pessoas < 40) { // início do laço de repetição "enquanto"
              
        //entrada de dados    
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
        nota = JOptionPane.showInputDialog("Insira sua nota, sendo A - Ótimo, B - Bom, C - Regular, D - Ruim e E -  Péssimo.");
        
    if (nota.equals(letraA)) { // comparando conteúdo da variável "nota" com as demais letras
        totalA++;
    } else if (nota.equals(letraB)) {
        totalB++;
    } else if (nota.equals(letraC)) {
        totalC++;
    } else if (nota.equals(letraD)){
        totalD++;
        idadeD += idade; // somar a idade à variável idadeD, para posterior cálculo da média
    } else {
        totalE++; }
       
    pessoas++; // incremento contador pessoas
    
        } //final while
            
            //processamento
            totalE = (totalE*100)/40; // cálculo da porcentagem de respostas E
            idadeD = idadeD/totalD; // cáldulo da média de idade das pessoas que responderam D

            // saída de dados
            JOptionPane.showMessageDialog(null,"A quantidade total de respostas 'ótimo' foi: " + totalA + ";" + "\nA média de idade das pessoas que responderam 'ruim' foi: " + idadeD + ";" + "\nA porcentagem de respostas que responderam 'péssimo' foi: " + totalE + "%.");
   
    } // final main
    
  } // final classe

