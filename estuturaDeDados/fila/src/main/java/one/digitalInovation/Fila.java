package one.digitalInovation;

public class Fila<T> {

    private No<T> noRefEntrada;

    public Fila() {
        this.noRefEntrada = null;
    }
    // Enfilerar
    public void enqueue(T object){
        No novoNo = new No(object);
        novoNo.setRefNo(noRefEntrada);
        noRefEntrada = novoNo;
    }

    // Retorna o primeiro da fila, mas não tira da fila
    public T first(){
      if(! isEmpty()){
          No primeiroNo = noRefEntrada;
          while (true){
              if (primeiroNo.getRefNo()!= null){
                  primeiroNo = primeiroNo.getRefNo();
              }else {
                  break;
              }
          }
          return (T) primeiroNo.getObjectNo();
      }
        return null;
    }
    //Desenfilerar, retira o primeiro da fila
    public T denqueue(){
        if(! isEmpty()){
            No primeiroNo = noRefEntrada;
            No noAuxiliar = noRefEntrada;
            while (true){
                if (primeiroNo.getRefNo()!= null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObjectNo();
        }
            return null;
     }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = noRefEntrada;
        if (noRefEntrada != null){
            while (true){
                stringRetorno += "[{ No Object: "+ noAuxiliar.getObjectNo() +"}]\n";
                if (noAuxiliar.getRefNo()!= null){
                    noAuxiliar= noAuxiliar.getRefNo();
                }else{
                    stringRetorno += null;
                    break;
                }
            }
        }else{
            stringRetorno = "null";


        }
        return stringRetorno;
    }

    public boolean isEmpty(){
        return noRefEntrada == null ? true : false;
    }
}
