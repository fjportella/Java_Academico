/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade105102020;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class Alunos extends Pessoa {
    private int Ra;
    private String Nacionalidade;
    
    public Alunos(){
        Ra = 1005;
        Nacionalidade = "Brasileira";
    }
    
    public void levantar(){
        JOptionPane.showMessageDialog(null, this.getNome() + " levantou-se!");
    }
    
    public void andar(){
        super.andar();
        JOptionPane.showMessageDialog(null, this.getNome() + " começou a andar");
    }

    public int getRa() {
        return Ra;
    }

    public void setRa(int Ra) {
        this.Ra = Ra;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }
    
    
    

    
}
