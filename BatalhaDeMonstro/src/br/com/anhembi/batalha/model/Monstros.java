package br.com.anhembi.batalha.model;
/**
 * 
 * @author Sabrina Fernandes
 *
 */
public class Monstros {
    private String nomeMonstro;
    private String status;
    private String ataques1;
    private String ataques2;
    private int temvida;
    private int força;
    private int defesa;
    private int velocidade;
    String fraqueza;
    
        public String getNomeMonstro() {
            return nomeMonstro;
        }
    
        public void setNomeMonstro(String nomeMonstro) {
            this.nomeMonstro = nomeMonstro;
        }
    
        public String getstatus() {
            return status;
        }
    
        public void setstatus(String status) {
            this.status = status;
        }
    
        public String getAtaques1() {
            return ataques1;
        }
    
        public void setAtaques1(String ataques1) {
            this.ataques1 = ataques1;
        }
    
        public String getAtaques2() {
            return ataques2;
        }
    
        public void setAtaques2(String ataques2) {
            this.ataques2 = ataques2;
        }
    
        public int gettemVida() {
            return temvida;
        }
    
        public void settemVida(int vida) {
            this.temvida = vida;
        }
    
        public int getForça() {
            return força;
        }
    
        public void setForça(int força) {
            this.força = força;
        }
    
        public int getDefesa() {
            return defesa;
        }
    
        public void setDefesa(int defesa) {
            this.defesa = defesa;
        }
    
        public int getVelocidade() {
            return velocidade;
        }
    
        public void setVelocidade(int velocidade) {
            this.velocidade = velocidade;
        }
        
    }

    public int getVida(){
        return ???;
    }

    public int getAtaques(){
        return ???;
    }

    public String getTipo(){
        return ???;
    }
    
    public class classificaMonstros {
        Monstros Fogareu = new Monstros();
        Monstros Goiabao = new Monstros();
        Monstros Flair = new Monstros();
        Monstros Rockin = new Monstros();
        Monstros Liquides = new Monstros();
        Monstros Satoshi = new Monstros();
         
    }

}
