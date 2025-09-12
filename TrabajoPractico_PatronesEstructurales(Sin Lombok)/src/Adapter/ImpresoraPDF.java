package Adapter;

public class ImpresoraPDF implements Impresora{
    private AdaptadorImpresora adaptadorImpresora;

    @Override
    public void imprimir(String tipodoc, String nombredoc) {
        if(tipodoc.equalsIgnoreCase(".pdf")){
            System.out.println("[Impresora PDF] Documento \"" + nombredoc + "\" enviado a impresión en formato PDF.");
        }else{
            adaptadorImpresora = new AdaptadorImpresora();
            adaptadorImpresora.imprimir(tipodoc,nombredoc);
        }
    }
}
