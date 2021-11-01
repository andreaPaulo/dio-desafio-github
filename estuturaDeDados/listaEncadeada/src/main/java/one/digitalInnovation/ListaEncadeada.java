package one.digitalInnovation;

public class ListaEncadeada <T>{
    No<T> refEntrada;

    public ListaEncadeada() {
        this.refEntrada = null;
    }

    public int size(){
        int tamanhoList = 0;
        No<T> refAuxiliar = refEntrada;
        while (true){
            if (refAuxiliar != null ){
                tamanhoList++;
                if (refAuxiliar.getProximoNo() != null){
                    refAuxiliar = refAuxiliar.getProximoNo();
                }else {
                    break;
                }
            }else {
                break;
            }
        }
        return tamanhoList;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (isEmpty()){
            refEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = refEntrada;
        for (int i = 0; i< this.size()-1;i++){
            noAuxiliar= noAuxiliar.getProximoNo();
        }
            noAuxiliar.setProximoNo(novoNo);
    }

    private No<T> getNo(int index){
        validaIndex(index);
        No<T> noAuxiliar = refEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i<= index;i++){
            noRetorno = noAuxiliar;
            noAuxiliar= noAuxiliar.getProximoNo();
        }
            return noRetorno;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public T remove(int index){
        No<T> noRemovido = getNo(index);
        if (index == 0) {
            refEntrada = noRemovido.getProximoNo();
            return noRemovido.getConteudo();
        }
        No<T> noAnterior = getNo(index -1);
        noAnterior.setProximoNo(noRemovido.getProximoNo());
        return noRemovido.getConteudo();
    }

    private void validaIndex(int index){
        if (index >= size()){
            int ultimoIndex= size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no index "+ ultimoIndex+" desta lista. A lista só vai até "+ ultimoIndex);
        }
    }

    public boolean isEmpty(){
        return refEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = refEntrada;
        for (int i = 0; i < this.size(); i++){
            strRetorno+=  "[No{conteúdo = " + noAuxiliar.getConteudo() +" }]-->";
            noAuxiliar= noAuxiliar.getProximoNo();
        }
            strRetorno+= "null";
        return strRetorno;
    }
}
