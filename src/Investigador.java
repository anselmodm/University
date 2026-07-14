public class Investigador extends PessoalDocente{
    private int salBase;
    private int salTotal;

    //Construtor

    public Investigador(String cc, String nome) {
        super(cc, nome);
    }


    //Metodos
    @Override
    public int salarioBase(){
        salBase = 35*700*4;
        return salBase;
    }
    //converter em  salario base em euros
    public double convSalarioBase(){
        double euros = salarioBase()/100.0;
        return euros;
    }


    @Override
    public int salarioTotal(){
        salTotal = salarioBase();
        return salTotal;

    }
    //converter em  salario total em euros
    public double convSalarioTotal(){
        double euros = this.salarioTotal()/100.0;
        return euros;
    }

}
