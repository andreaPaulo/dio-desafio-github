package one.digitalInnovation;

public class ListaCircular<T> {
    private No<T> cauda;
    private No<T> cabeca;
    private int tamanhoLista;

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.tamanhoLista ==0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setProximoNo(cauda);
        }else{
            novoNo.setProximoNo(this.cauda);
            this.cabeca.setProximoNo(novoNo);
            this.cauda = novoNo;
        }
            this.tamanhoLista++;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void remove(int index){
        if (index >= this.tamanhoLista)
           throw new IndexOutOfBoundsException("O índice é maior do que a lista");

        No<T> noAuxiliar = this.cauda;

        if (index == 0){
            this.cauda = this.cauda.getProximoNo();
            this.cabeca.setProximoNo(this.cauda);
        }else if (index == 1){
            this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());
        }else {
            for (int i= 0; i< index-1; i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            noAuxiliar.setProximoNo(noAuxiliar.getProximoNo().getProximoNo());
        }
        this.tamanhoLista--;

    }

    private No<T> getNo(int index){
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("Lista está vasia");

        if (index==0){
            return this.cauda;
        }
        No<T> noAuxiliar = cauda;
        for (int i =0; i< index; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

     private boolean isEmpty(){
        return this.tamanhoLista ==0 ? true : false;
    }
    private int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = cauda;
        for (int i=0; i< size(); i++){
            strRetorno+= "[ListaCircular{ Conteúdo: " + noAuxiliar.getConteudo()+" }] -->";
           noAuxiliar= noAuxiliar.getProximoNo();
        }
        strRetorno+= this.size()!= 0 ? "(Retorna ao início)": "[]";
        return strRetorno;
    }
}
