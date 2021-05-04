package br.com.anhembi.batalha.control;

import br.com.anhembi.batalha.model.Monstros;

public class CalculoBatalha {

	public void prioridaDeAtaque(Monstros monstro1, Ataque ataqueJogador1, Monstros monstro2, Ataque ataqueJogador2) {

		if (monstro1.getVelocidade() != monstro2.getVelocidade()) {
			if (monstro1.getVelocidade() > monstro2.getVelocidade()) {
				recebeDano(monstro1, ataqueJogador1, monstro2);
				recebeDano(monstro2, ataqueJogador2, monstro1);
			} else if (monstro1.getVelocidade() < monstro2.getVelocidade()) {
				recebeDano(monstro2, ataqueJogador2, monstro1);
				recebeDano(monstro1, ataqueJogador1, monstro2);
			}
		} else if (monstro1.getForca() != monstro2.getForca()) {
			if (monstro1.getForca() > monstro2.getForca()) {
				recebeDano(monstro1, ataqueJogador1, monstro2);
				recebeDano(monstro2, ataqueJogador2, monstro1);
			} else if (monstro1.getForca() < monstro2.getForca()) {
				recebeDano(monstro2, ataqueJogador2, monstro1);
				recebeDano(monstro1, ataqueJogador1, monstro2);
			}
		} else if (monstro1.getDefesa() != monstro2.getDefesa()) {
			if (monstro1.getDefesa() > monstro2.getDefesa()) {
				recebeDano(monstro1, ataqueJogador1, monstro2);
				recebeDano(monstro2, ataqueJogador2, monstro1);
			} else if (monstro1.getDefesa() < monstro2.getDefesa()) {
				recebeDano(monstro2, ataqueJogador2, monstro1);
				recebeDano(monstro1, ataqueJogador1, monstro2);
			}
		} else {
			System.out.println("Nenhum crit�rio de desempate, a batalha travou!");
		}
	}

	public void recebeDano(Monstros monstroA, Ataque ataque, Monstros monstroB) {
		int vidaMonstro = monstroA.getVida();
		int ataqueMonstro = monstroA.getForca();
		int defesaMonstro = monstroB.getDefesa();
		int poderAtaque = ataque.getPoder();

		if (monstroA.getTipo() == monstroB.getFraqueza()) {
			monstroB.setHp(vidaMonstro -= ((ataqueMonstro - defesaMonstro) * 0.375) + (poderAtaque * 0.1));
		}
		monstroB.setHp(vidaMonstro -= ((ataqueMonstro - defesaMonstro) * 0.75) + (poderAtaque * 0.1));
	}
}
