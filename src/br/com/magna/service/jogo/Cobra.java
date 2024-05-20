package br.com.magna.service.jogo;

import java.awt.event.KeyEvent;

public class Cobra {
    protected char snake = '*';
    protected int posicaoAtualLinha;
    protected int posicaoAtualColuna;
    protected int direcao = 1; // 1 para direita, -1 para esquerda
    protected boolean pararMovimento = false;

    public Cobra(int posicaoInicialLinha, int posicaoInicialColuna) {
        this.posicaoAtualLinha = posicaoInicialLinha;
        this.posicaoAtualColuna = posicaoInicialColuna;

        // Definir a direção inicial como direita
        this.direcao = KeyEvent.VK_RIGHT;
    }

    public void mover(int direcao) {
        if (direcao == KeyEvent.VK_UP || direcao == KeyEvent.VK_DOWN || 
            direcao == KeyEvent.VK_LEFT || direcao == KeyEvent.VK_RIGHT) {
            this.direcao = direcao;
        } else {
            System.out.println("Direção inválida!");
        }
    }

    // Getters e Setters
    public int getPosicaoAtualLinha() {
        return posicaoAtualLinha;
    }

    public void setPosicaoAtualLinha(int posicaoAtualLinha) {
        this.posicaoAtualLinha = posicaoAtualLinha;
    }

    public int getPosicaoAtualColuna() {
        return posicaoAtualColuna;
    }

    public void setPosicaoAtualColuna(int posicaoAtualColuna) {
        this.posicaoAtualColuna = posicaoAtualColuna;
    }

    public int getDirecao() {
        return direcao;
    }

    public void setDirecao(int direcao) {
        this.direcao = direcao;
    }

    public boolean isPararMovimento() {
        return pararMovimento;
    }

    public void setPararMovimento(boolean pararMovimento) {
        this.pararMovimento = pararMovimento;
    }

    public char getSnake() {
        return snake;
    }
}

