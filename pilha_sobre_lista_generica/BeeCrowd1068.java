import java.util.Scanner;

public class BeeCrowd1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Pilha<Character> p = new Pilha<>();
        String s = scanner.nextLine();
        
        boolean estaCorreta = true;
        for (int i = 0; i<s.length() && estaCorreta; i++){
            if(s.charAt(i) == '(') {
                p.push('(');
            } else if(s.charAt(i) == ')'){
                if(p.estaVazia())
                    estaCorreta = false;
                else
                    p.pop();
            }
        }
        if(!p.estaVazia()) {
            estaCorreta = false;
        }
        if(estaCorreta) {
            System.out.println("a colocacao de parenteses esta correta");
        } else {
            System.out.println("a colocacao de perenteses esta incorreta");
        }

        scanner.close();
        } //podemos implementar uma pilha com um int contador, mas continua sendo uma implementação de pilha
}
