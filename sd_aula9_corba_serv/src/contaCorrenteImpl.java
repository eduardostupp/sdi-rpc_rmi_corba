
import financeiro._contaCorrentePOA;
import financeiro.contaCorrente;
import org.omg.CORBA.ORB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1019708
 */
class contaCorrenteImpl extends _contaCorrentePOA { 
        
    private ORB orb;
    private float saldo;
    
    void setORB(ORB orb_val) {
        orb = orb_val;
        registraOperacao("set ORB");
    }
    
    private void registraOperacao(String operacao) {
        System.out.println(operacao);
    }

    @Override
    public boolean credita(float valor) {
        saldo = saldo + valor;
        registraOperacao("Creditou");
        return true;
    }

    @Override
    public boolean debita(float valor) {
        saldo = saldo - valor;
        registraOperacao("Debitou");
        return true;
    }

    @Override
    public String getSituacao() {
        return ("Pendente");
    }

    @Override
    public boolean setSituacao(String msd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
