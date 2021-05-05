package br.com.anhembi.batalha.control;

/**
 * 
 * Classe que cont�m todos os atributos e m�todos dos ataques dos Monstros, al�m de instanciar os ataques
 * 
 * @author Raphael Scandura
 * @version 0.1
 * @see https://github.com/raphaelscandura
 * 
 *
 */

public class Ataque {
	
	private int poderAtaque;
	private String tipoAtaque;
	private String nomeAtaque;
	
	/**
	 * 
	 * Construtor para instanciar o objeto Ataque, recebendo o valor inteiro do poder do Ataque em quest�o, 
	 * o tipo do ataque e o nome do ataque
	 * 
	 * @param poderAtaque
	 * @param tipoAtaque
	 * @param nomeAtaque
	 */
	
	public Ataque(int poderAtaque, String tipoAtaque, String nomeAtaque){
		this.poderAtaque = poderAtaque;
		this.tipoAtaque = tipoAtaque;
		this.nomeAtaque = nomeAtaque;
		
	}
		
	public int getPoder() {
		return this.poderAtaque;
	}
	
	public String getTipo() {
		return this.tipoAtaque;
	}
	
	public String getNome() {
		return this.nomeAtaque;
	}

}
