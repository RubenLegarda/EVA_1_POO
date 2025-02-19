package com.legrey.eva1_9_television;

public class EVA1_9_TELEVISION {

    public static void main(String[] args) {
        Television tv = new Television();
        tv.imprimirDatos();
        Television tv2 = new Television(true, 9, 3);
        tv2.imprimirDatos();
    }
}
