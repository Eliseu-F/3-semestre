package gestaorh;

/**
 *
 * @author eliseu.fsantos1
 */
public class Engenheiro extends Funcionario {

    public String departamento;
    public String CREA;

    public Engenheiro(String departamento, String CREA, int codigo, String nome, double salarioBase) {
        super(codigo, nome, salarioBase);
        this.departamento = departamento;
        this.CREA = CREA;   
    }

    @Override
    public double calculaSalario() {
        return this.salarioBase * 1.5;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public String getCREA() {
        return CREA;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setCREA(String CREA) {
        this.CREA = CREA;
    }

    @Override
    public String toString() {
        return "Engenheiro{" + super.toString() + "departamento=" + departamento + ", CREA=" + CREA + '}';
    }
    
     
}
