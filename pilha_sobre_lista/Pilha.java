public class Pilha {
    private No topo;
    //construtor padrão

    public boolean estaVazio(){
        return topo==null;
    }

    public void push(int i){
        No novo = new No(i);
        if (!estaVazio()) {
            novo.setProximo(topo);
        }
        topo = novo;
    }
    
    public int peek(){
        return topo.getInfo();
    }

    @Override
    public String toString() {
        String s = "pilha: ";
        if(estaVazio()){
            s += "vazia";
        }else{
            No aux = topo;
            while(aux!=null){ // varre a pilha até o fundo
                s = s + aux + "\n";
                aux = aux.getProximo();
            }
            s = s + "\\\\";
        }
        return s;
    }

    public int pop(){
        int temp = topo.getInfo();
        topo = topo.getProximo(); // aqui estamos ajustando o ponteiro
        return temp;
    }

}