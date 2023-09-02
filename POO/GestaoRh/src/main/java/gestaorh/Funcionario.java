package gestaorh;

/**
 *
 * @author eliseu.fsantos1
 */
public abstract class Funcionario {
    private int codigo;
    private String nome;
    double salarioBase;

    public Funcionario() {
    }

    public Funcionario(int codigo, String nome, double salarioBase) {
        this.codigo = codigo;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
 
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract double calculaSalario();  

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", nome=" + nome + ", salarioBase=" + salarioBase + '}';
    }
      
    
}
