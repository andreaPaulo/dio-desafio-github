package one.digitalInnovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    // Retorna o elemento que está no topo da pilha
    public No top() {
        return refNoEntradaPilha;
    }

    // Remove o elemento que está no topo da pilha
    public No pop() {
        if (!isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        }
        return null;
    }

    // Coloca um elemento no topo da pilha
    public void push(No novoNo) {
        No refAux = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAux);
    }

    public Boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "-------------\n";
        stringRetorno+= "   Pilha \n";
        stringRetorno+= "-------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno+= "[{ No Dados = "+noAuxiliar.getDado()+ "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();

            }else {
                break;
            }
        }
        stringRetorno += "==============\n";
        return stringRetorno;

    }
}