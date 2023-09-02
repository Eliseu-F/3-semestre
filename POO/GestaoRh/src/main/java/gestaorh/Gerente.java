package gestaorh;

/**
 *
 * @author eliseu.fsantos1
 */
public class Gerente extends Funcionario {
    private String area;
    private double bonus;

    public Gerente(String area, double bonus) {
        this.area = area;
        this.bonus = bonus;
    }

    public Gerente(String area, double bonus, int codigo, String nome, double salarioBase) {
        super(codigo, nome, salarioBase);
        this.area = area;
        this.bonus = bonus;
    }
    
    @Override
    public double calculaSalario() {
        return this.salarioBase += bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    } 

    @Override
    public String toString() {
        return "Gerente{" + "area=" + area + ", bonus=" + bonus + '}';
    }
    
    
}
