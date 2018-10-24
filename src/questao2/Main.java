package questao2;
/**
 * @author alunoti
 */
public class Main { 
   
    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
        v.setNome("Capirocilda");
        v.setSalarioBruto(2000);
        v.setQuantidadeDeVendas(99);
        v.calcularSalarioLiquido();
        System.out.println(">>> Vendedor(a) <<<");
        System.out.println("Nome................: " + v.getNome()+ "\nSalario da Vendedora: " +v.calcularSalarioLiquido());
        
        Funcionario f = new Funcionario();
        f.setNome("Astrogildo");
        f.setSalarioBruto(937);
        //f.setQuantidadeDeVendas(99);
        f.calcularSalarioLiquido();
        System.out.println("\n>>> Funcionario(a) <<<");
        System.out.println("Nome..................: " + f.getNome()+ "\nSalario do Funcionario: " + f.calcularSalarioLiquido());
        
        Estagiario e = new Estagiario();
        e.setNome("Peter Pan da Terra do Nunca");
        e.setSalarioBruto(2200);
        //f.setQuantidadeDeVendas(99);
        e.calcularSalarioLiquido();
        System.out.println("\n>>> Estagiario(a) <<<");
        System.out.println("Nome....................: " + e.getNome()+ "\nSalario do Estagiario(a): " + e.calcularSalarioLiquido());
        System.out.println("\n\nByMestre");
    }   
}
