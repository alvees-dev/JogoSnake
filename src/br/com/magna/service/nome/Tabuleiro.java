package br.com.magna.service.nome;

import java.awt.event.KeyEvent;

import br.com.magna.service.jogo.Cobra;

public class Tabuleiro {

    protected char espaco = ' ';
    protected char caracter = 'X';
    protected char[][] nome = new char[55][153];
    public Cobra cobra;

    public Tabuleiro() {
        this.cobra = new Cobra(12, 4); // Inicializa a cobra com posições iniciais
    }

    public void desenhandoNome() {
        for (int linha = 0; linha < nome.length; linha++) {
            for (int coluna = 0; coluna < nome[linha].length; coluna++) {
                if (linha == cobra.getPosicaoAtualLinha() && coluna == cobra.getPosicaoAtualColuna()) {
                    System.out.print(cobra.getSnake());
                    nome[linha][coluna] = cobra.getSnake();
                } else if (
                		
                		// Margem
        			    (linha >= 10 && linha <= 50) && coluna == 1 || (linha >= 10 && linha <= 50) && coluna == 152
        			    || linha == 10 && (coluna >= 2 && coluna <= 152)
        	 		    || linha == 50 && (coluna >= 2 && coluna <= 152)

        				// Letra A
        	 		    || linha == 21 && coluna == 21 || linha == 21 && coluna == 22
        	 		    || linha == 22 && (coluna >= 20 && coluna <= 23) || linha == 23 && coluna == 20
        	 		    || linha == 23 && coluna == 23 || linha == 24 && (coluna >= 19 && coluna <= 20)
        	 		    || linha == 24 && (coluna >= 23 && coluna <= 24) || linha == 25 && coluna == 19
        	 		    || linha == 25 && coluna == 24 || linha == 26 && (coluna >= 18 && coluna <= 19)
        	 		    || linha == 26 && (coluna >= 24 && coluna <= 25) || linha == 27 && coluna == 17
        	 		    || linha == 27 && coluna == 26 || linha == 28 && (coluna >= 16 && coluna <= 17)
        	 		    || linha == 28 && (coluna >= 26 && coluna <= 27) || linha == 29 && coluna == 16
        	 		    || linha == 29 && coluna == 27 || linha == 30 && coluna == 15 || linha == 30 && coluna == 16
        	 		    || linha == 30 && coluna == 27 || linha == 30 && coluna == 28 || linha == 31 && coluna == 15
        	 		    || linha == 31 && coluna == 28 || linha == 32 && (coluna >= 14 && coluna <= 29)
        	 		    || linha == 33 && (coluna >= 13 && coluna <= 30)
        	 		    || linha == 34 && (coluna >= 13 && coluna <= 14)
        	 		    || linha == 34 && (coluna >= 29 && coluna <= 30) || linha == 35 && coluna == 13
        	 		    || linha == 35 && coluna == 30 || linha == 36 && (coluna >= 12 && coluna <= 13)
        	 		    || linha == 36 && (coluna >= 30 && coluna <= 31) || linha == 37 && coluna == 12
        	 		    || linha == 37 && coluna == 31 || linha == 38 && coluna == 11 || linha == 38 && coluna == 12
        	 		    || linha == 38 && coluna == 31 || linha == 38 && coluna == 32 || linha == 39 && coluna == 11
        	 		    || linha == 39 && coluna == 32 || linha == 40 && coluna == 11 || linha == 40 && coluna == 32


       					// Letra M
        	 			|| (linha >= 21 && linha <= 40) && coluna == 36 || linha == 22 && coluna == 37
        	 			|| linha == 22 && coluna == 55 || linha == 23 && coluna == 38 || linha == 23 && coluna == 54
        	 			|| linha == 24 && coluna == 39 || linha == 24 && coluna == 53 || linha == 25 && coluna == 40
        	 			|| linha == 25 && coluna == 52 || linha == 26 && coluna == 41 || linha == 26 && coluna == 51
        	 			|| linha == 27 && coluna == 42 || linha == 27 && coluna == 50 || linha == 28 && coluna == 43
        	 			|| linha == 28 && coluna == 49 || linha == 29 && coluna == 44 || linha == 29 && coluna == 48
        	 		  	|| linha == 30 && coluna == 45 || linha == 30 && coluna == 47 || linha == 31 && coluna == 46
        	 		  	|| (linha >= 21 && linha <= 40) && coluna == 56



       					// Letra O
        	 			|| (linha >= 21 && linha <= 40) && coluna == 60 || linha == 21 && (coluna >= 61 && coluna <= 79)
        	 		    || linha == 40 && (coluna >= 61 && coluna <= 79) || (linha >= 21 && linha <= 40) && coluna == 80


       					// Letra R
        	 		    || (linha >= 21 && linha <= 40) && coluna == 84
        	 		    || linha == 21 && (coluna >= 84 && coluna <= 104)
        	 		    || (linha >= 21 && linha <= 30) && coluna == 104
        	 		    || linha == 30 && (coluna >= 85 && coluna <= 104) || linha == 31 && coluna == 95
        	 		    || linha == 32 && coluna == 96 || linha == 33 && coluna == 97 || linha == 34 && coluna == 98
        	 		    || linha == 35 && coluna == 99 || linha == 36 && coluna == 100 || linha == 37 && coluna == 101
        	 		    || linha == 38 && coluna == 102 || linha == 39 && coluna == 103 || linha == 40 && coluna == 104


       					// Letra I
       					|| (linha >= 21 && linha <= 23) && coluna == 108
       					|| (linha >= 21 && linha <= 23) && coluna == 109
       					|| (linha >= 21 && linha <= 23) && coluna == 110
       					|| (linha >= 25 && linha <= 40) && coluna == 108
       					|| (linha >= 25 && linha <= 40) && coluna == 109
       					|| (linha >= 25 && linha <= 40) && coluna == 110

       					// Letra M
       					|| (linha >= 21 && linha <= 40) && coluna == 114 || linha == 22 && coluna == 115
       					|| linha == 22 && coluna == 133 || linha == 23 && coluna == 116 || linha == 23 && coluna == 132
       					|| linha == 24 && coluna == 117 || linha == 24 && coluna == 131 || linha == 25 && coluna == 118
       					|| linha == 25 && coluna == 130 || linha == 26 && coluna == 119 || linha == 26 && coluna == 129
       					|| linha == 27 && coluna == 120 || linha == 27 && coluna == 128 || linha == 28 && coluna == 121
       					|| linha == 28 && coluna == 127 || linha == 29 && coluna == 122 || linha == 29 && coluna == 126
       					|| linha == 30 && coluna == 123 || linha == 30 && coluna == 125 || linha == 31 && coluna == 124
       					|| (linha >= 21 && linha <= 40) && coluna == 134

                        ) {
                    System.out.print(caracter);
                    nome[linha][coluna] = caracter;
                } else {
                    System.out.print(espaco);
                    nome[linha][coluna] = espaco;
                }
            }
            System.out.println();
        }
    }

    
    public void atualizarPosicaoCobra(int direcao) {
        int novaLinha = cobra.getPosicaoAtualLinha();
        int novaColuna = cobra.getPosicaoAtualColuna();

        // Atualiza a posição com base na direção
        
            // Chave que muda direção para direita
        if (direcao == KeyEvent.VK_RIGHT) { 
            novaColuna++;
            
            // Chave que muda direção para esquerda
        } else if (direcao == KeyEvent.VK_LEFT) {
            novaColuna--;
            
            // Chave que muda direção para baixo
        } else if (direcao == KeyEvent.VK_DOWN) {
            novaLinha++;
            
            // Chave que muda direção para cima
        } else if (direcao == KeyEvent.VK_UP) { 
            novaLinha--;
        }

        // Verifica se a nova posição está dentro dos limites da matriz
        if (novaLinha >= 0 && novaLinha < nome.length && novaColuna >= 0 && novaColuna < nome[0].length) {
        	
            // Verifica se a nova posição contém um caractere que não seja um espaço vazio ou um caractere da margem/letras
            if (nome[novaLinha][novaColuna] != espaco && nome[novaLinha][novaColuna] != cobra.getSnake()) {
                System.out.println("Você Bateu! Game Over");
             // Encerra o programa
                System.exit(0); 
            } else {
            	
                // Atualiza a posição atual da cobra
                cobra.setPosicaoAtualLinha(novaLinha);
                cobra.setPosicaoAtualColuna(novaColuna);

                // Redesenha o tabuleiro e pula 40 linhas
                clear();
                desenhandoNome();
            }
        } else {
            
        }
    }
    
    // Método criado para pular 40 linhas deixando o console mais intuitivo
    public void clear() {
    	for(int espacos = 0; espacos < 40; espacos++) {
    		System.out.println();
    	}
    }


}
