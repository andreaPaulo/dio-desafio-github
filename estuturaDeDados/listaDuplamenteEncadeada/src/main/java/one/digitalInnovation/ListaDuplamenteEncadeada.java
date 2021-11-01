package one.digitalInnovation;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo= null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoAnterior(ultimoNo);
            if (primeiroNo == null){
                primeiroNo= novoNo;
            }
            if (ultimoNo != null){
                ultimoNo.setNoProximo(novoNo);
            }
            ultimoNo = novoNo;

            tamanhoLista++;
    }

    public void add(int index, T elemento){
      NoDuplo<T> noAuxiliar = getNo(index);
      NoDuplo<T> novoNo = new NoDuplo<>(elemento);
      novoNo.setNoProximo(noAuxiliar);

      if (novoNo.getNoProximo()!= null){
          novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
          novoNo.getNoProximo().setNoAnterior(novoNo);
      }else {
          novoNo.setNoAnterior(ultimoNo);
          ultimoNo = novoNo;
      }
        if (index == 0){
            primeiroNo = novoNo;
        }else {
            novoNo.getNoAnterior().setNoProximo(novoNo);
        }
        this.tamanhoLista++;
    }

    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null){
                primeiroNo.setNoAnterior(null);
            }
        }else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoAnterior().setNoProximo(noAuxiliar.getNoProximo());
            if (noAuxiliar != ultimoNo){
                noAuxiliar.getNoProximo().setNoAnterior(noAuxiliar.getNoAnterior());
            }else{
                ultimoNo= noAuxiliar;
            }
        }

        this.tamanhoLista--;
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i=0; (i< index)&& (noAuxiliar != null); i++){
            noAuxiliar= noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size(){
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno= "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i =0; i<size();i++){
           strRetorno+= "[No {Conteúdo: "+ noAuxiliar.getConteudo()+" }]-->";
           noAuxiliar= noAuxiliar.getNoProximo();
        }
        strRetorno+= null;
        return strRetorno;
    }
}
