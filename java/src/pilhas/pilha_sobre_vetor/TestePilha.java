package pilhas.pilha_sobre_vetor;

import javax.swing.JOptionPane;
import java.util.Random;

public class TestePilha{
    public static void main (String[]args){
        Random random = new Random();
        Pilha pilha = new Pilha();
        do {
            if (random.nextBoolean()){
                if (!pilha.estaCheia()){
                    pilha.empilha(random.nextInt(10));
                }
            }
            else{
                if (!pilha.estaCheia()){
                    JOptionPane.showMessageDialog(null, pilha.desempilha(), "elemento desempilhado", 1);
                    JOptionPane.showMessageDialog(null, pilha);
                }
            }
            JOptionPane.showMessageDialog(null, pilha);
        } while (!pilha.estaVazia());
    }
}
