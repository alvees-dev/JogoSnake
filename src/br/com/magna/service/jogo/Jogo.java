package br.com.magna.service.jogo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import br.com.magna.service.nome.Tabuleiro;

public class Jogo {
	
    private Tabuleiro tabuleiro;
    private JFrame frame;

    public Jogo() {
        this.tabuleiro = new Tabuleiro();
        this.frame = new JFrame();
        configurarFrame();
        configurarKeyListener();
    }

    private void configurarFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setFocusable(true);
        frame.setSize(200, 200); // Ajuste o tamanho conforme necessário
        frame.setVisible(true);
    }

    private void configurarKeyListener() {
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                int direcao = 0;
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        direcao = KeyEvent.VK_UP;
                        break;
                    case KeyEvent.VK_DOWN:
                        direcao = KeyEvent.VK_DOWN;
                        break;
                    case KeyEvent.VK_RIGHT:
                        direcao = KeyEvent.VK_RIGHT;
                        break;
                    case KeyEvent.VK_LEFT:
                        direcao = KeyEvent.VK_LEFT;
                        break;
                    default:
                        break;
                }
                tabuleiro.cobra.mover(direcao);
            }

            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }

    public void iniciar() {
        tabuleiro.desenhandoNome();
        // Inicia o movimento automático da cobra
        Thread movimentoAutomaticoThread = new Thread(() -> {
            while (!tabuleiro.cobra.isPararMovimento()) {
                tabuleiro.atualizarPosicaoCobra(tabuleiro.cobra.getDirecao());
                try {
                    Thread.sleep(250); // Aguarda 250 milissegundos (0.25 segundos)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        movimentoAutomaticoThread.start();
    }

}
