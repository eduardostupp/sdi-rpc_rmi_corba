import financeiro.contaCorrente;
import financeiro.contaCorrenteHelper;
import org.omg.CORBA.ORB;

public class sd_aula9_corba_cli {

    public static void main(String[] args) {
         try {
	    // Create ORB object
	    ORB meuOrb = ORB.init(args,null);
	    // Find hello server
	    org.omg.CORBA.Object objRef = meuOrb.string_to_object("contaCorrente");
	    contaCorrente contaCorrenteRef = contaCorrenteHelper.narrow(objRef);
            
            System.out.println(contaCorrenteRef.toString());
            
	    // Invoke remote service
            if(Integer.parseInt(args[0]) > 0) {
                if(contaCorrenteRef.credita(Integer.parseInt(args[0])) == false) {
                    System.out.println("Operação de Crédito mal sucedida");
                }
            } else {
                System.out.println("Informe uma operação");
            }
            System.out.println(contaCorrenteRef.getSituacao());
	}
	catch(Exception e) {
	    System.out.println(e);
	    e.printStackTrace(System.out);
	}        
    }
    
}