public class Universidade {

public void imprimir() {


    //Administrativo
    Administrativo a1 = new Administrativo("TG44567H", "Marcos Silva");
    System.out.println("******  ADMINISTRATIVO  *********");
    System.out.println("Nome: " + a1.getNome());
    System.out.println("CC: " + a1.getCc());
    System.out.println("Categoria: " + a1.getClass().getName());
    System.out.println("Salário base: " + a1.convSalarioBase()+ " €");
    System.out.println("Horas extras: " + a1.convHorasExtras(a1.getHt()) + " € correspondete a:" + a1.getHt() + " horas trabalhadas");
    System.out.println("Salário total: " + a1.convSalarioTotal()+ " €");

    //Informático
    Informatico i1 = new Informatico("HK78966L", "José Mário");
    System.out.println("*********************************");
    System.out.println("******  INFORMÁTICO  *********");
    System.out.println("Nome: " + i1.getNome());
    System.out.println("CC: " + i1.getCc());
    System.out.println("Categoria: " + i1.getClass().getName());
    System.out.println("Salário base: " + i1.convSalarioBase()+ " €");
    System.out.println("Horas extras: " + i1.convHorasExtras(i1.getHt()) + " € correspondete a:" + i1.getHt() + " horas trabalhadas");
    System.out.println("Salário total: " + i1.convSalarioTotal()+ " €");

    //Professor
    Professor p1 = new Professor("34567YU", "Alberto Melo");
    System.out.println("*********************************");
    System.out.println("******  PROFESSOR  *********");
    System.out.println("Nome: " + p1.getNome());
    System.out.println("CC: " + p1.getCc());
    System.out.println("Categoria: " + p1.getClass().getName());
    System.out.println("Salário base: " + p1.convSalarioBase()+ " €");
    System.out.println("Complemento salarial: " + p1.convCompSalarial() + " € correspondete a:" + p1.getSex() + " sexénio(s)");
    System.out.println("Salário total: " + p1.convSalarioTotal()+ " €");

    //Investigador
    Investigador iv1 = new Investigador("DF556789A", "Horácio Comissário");
    System.out.println("*********************************");
    System.out.println("******  INVESTIGADOR  *********");
    System.out.println("Nome: " + iv1.getNome());
    System.out.println("CC: " + iv1.getCc());
    System.out.println("Categoria: " + iv1.getClass().getName());
    System.out.println("Salário base: " + iv1.convSalarioBase()+ " €");
    System.out.println("Salário total: " + iv1.convSalarioTotal()+ " €");

    //Total de Salarios gasto pela universidade
    double totalDeSalario = a1.convSalarioTotal() + i1.convSalarioTotal() + p1.convSalarioTotal() + iv1.convSalarioTotal();
    System.out.println("*********************************");
    System.out.println("******  Valor total gasto em salários  *********");
    System.out.println(totalDeSalario+ " €");

}
}
