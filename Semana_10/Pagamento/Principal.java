public class Principal {
    
    public void pagar(Pagamento p){
        p.processarPagamento();
    }

    public static void main(String[] args) {
        Principal p = new Principal();
        Pagamento pagamento = new FormasPagamento();
        Pix pix = new Pix;
        


        p.pagar(pagamento);
    }
}
