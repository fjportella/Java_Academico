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
public class Funcionario extends Pessoa {
    private int Matricula;
    private String Sexo;
    
    public Funcionario(){
        Matricula = 2500;
        Sexo = "M";
    }
    
    @Override
    public void levantar(){
        JOptionPane.showMessageDialog(null, this.getNome() + " levantou-se!");
    }
    
    public void andar(){
        super.andar();
        JOptionPane.showMessageDialog(null, this.getNome() + " começou a andar.");
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    
    
 
}
