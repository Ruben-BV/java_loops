package org.factoriaf5.java_loops;

public class JavaLoops {

    public String tablaDeMultiplicar(int n) {
        
        String[] tabla = new String[10];
        
        for (int i=0; i<tabla.length; i++) {
            tabla[i] = (n+" x "+(i+1)+" = "+n*(i+1));
        }
        return String.join("\n", tabla);
    }
}
