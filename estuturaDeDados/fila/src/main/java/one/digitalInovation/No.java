package one.digitalInovation;

public class No <T>{

    private T objectNo;
    private No refNo;

    public No() {
    }

    public No(T objectNo) {
        this.refNo = null;
        this.objectNo = objectNo;
    }

    public Object getObjectNo() {
        return objectNo;
    }

    public void setObjectNo(T objectNo) {
        this.objectNo = objectNo;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "objectNo=" + objectNo +
                '}';
    }
}
