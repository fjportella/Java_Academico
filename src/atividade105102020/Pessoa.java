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
public abstract class Pessoa {
    private String Nome;
    private int Idade;
    private int Cpf;
    
    public Pessoa(){
        Nome = "Vazio";
    }
    
   public abstract void levantar();
   
   public void andar(){
         
        JOptionPane.showMessageDialog(null, Nome + " Se preparando para Andar!");
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public int getCpf() {
        return Cpf;
    }

    public void setCpf(int Cpf) {
        this.Cpf = Cpf;
    }
    
    
}
