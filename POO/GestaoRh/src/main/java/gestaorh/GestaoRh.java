package gestaorh;

/**
 *
 * @author eliseu.fsantos1
 */
public class GestaoRh {

    public static void main(String[] args) {

        var gerente1 = new Gerente("TI", 100, 1, "Marcos", 20000);
        var engenheiro1 = new Engenheiro("Civil", "Construção", 2, "Matheus", 25000);
        var presidente1 = new Presidente(90000, 3, "Junior", 40000);

        System.out.println(gerente1 + "\n");
        System.out.println(engenheiro1 + "\n");
        System.out.println(presidente1 + "\n");

    }
}
