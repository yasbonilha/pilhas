public class Pilha <Info>{
    //estamos criando uma pilha sobre um tipo genérico - mudança de tipo de dados para não haver adaptações para tipos primitivos no meio do código

    private No<Info> topo;
    private int tamanho; //por mais que paguemos o preço de ter mais uma variável e mais uma operação em cada método push e pop, vai ser sempre uma operação. em comparação, quando temos um método de percorrer a lista, o desempenho dele é linear (quanto maior a pilha, maior o processamento)

    //construtor padrão

    public boolean estaVazia() {
        return topo == null;
    }

    public void push (Info info) {
        No<Info> novo = new No<Info>(info);
        if (!estaVazia()){
            novo.setProximo(topo);
        }
        topo = novo;
        tamanho++;
    }

    public Info pop() {
        if (estaVazia()) return null;
        Info info = topo.getInfo();
        topo = topo.getProximo();
        tamanho--;
        return info;
    }

    public Info peek(){ //operações opcionais, o que é essencial para ser uma pilha é o push, o pop e o estavazia;
        if(estaVazia()) return null; //precisamos colocar isso para nao tomar uma nullPointerException
        return topo.getInfo();
    }

    public int getTamanho(){
        return tamanho;
    }

    @Override
    public String toString(){
        if (estaVazia() ) return "pilha vazia";
        String s = "";
        No<Info> aux = topo;
        while (aux != null){
            s += aux + "\n";
            aux = aux.getProximo();
        }
        return s;
    }
}
