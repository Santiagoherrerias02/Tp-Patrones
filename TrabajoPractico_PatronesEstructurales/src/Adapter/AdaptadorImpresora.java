package Adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class AdaptadorImpresora implements Impresora{
    private ImpresoraTexto impresoraTexto;

    public AdaptadorImpresora(){
        impresoraTexto = new ImpresoraTexto();
    }

    @Override
    public void imprimir(String tipodoc, String nombredoc) {
        if(tipodoc.equalsIgnoreCase(".txt")){
            impresoraTexto.imprimirTextoPlano(nombredoc);
        } else {
            System.out.println("[Adaptador] Formato no soportado: " + tipodoc);

        }
    }
}
