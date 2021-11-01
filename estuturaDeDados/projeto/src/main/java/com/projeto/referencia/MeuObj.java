package com.projeto.referencia;

public class MeuObj {

    Integer num;

    public MeuObj(Integer a) {
        this.num = a;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}
