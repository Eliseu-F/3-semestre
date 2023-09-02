package gestaorh;

/**
 *
 * @author eliseu.fsantos1
 */
public final class Presidente extends Funcionario {

    private double cotaAcoes;

    public Presidente(double cotaAcoes) {
        this.cotaAcoes = cotaAcoes;
    }

    public Presidente(double cotaAcoes, int codigo, String nome, double salarioBase) {
        super(codigo, nome, salarioBase);
        this.cotaAcoes = cotaAcoes;
        
    }

    public double getCotaAcoes() {
        return cotaAcoes;
    }

    public void setCotaAcoes(double cotaAcoes) {
        this.cotaAcoes = cotaAcoes;
    }
    
    @Override
    public double calculaSalario() {
        return this.salarioBase += cotaAcoes;
    }

    @Override
    public String toString() {
        return "Presidente{" + "cotaAcoes=" + cotaAcoes + '}';
    }

    
    
   
}
