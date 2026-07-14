public class Informatico extends PessoalAdministrativo{
    private int salBase;
    private int salTotal;
    private int ht = 30;//horas trabalhadas

    //Construtor

    public Informatico(String cc, String nome) {
        super(cc, nome);
    }



    //Metodos
    @Override
    public int salarioBase(){
        salBase = 40*600*4;
        return salBase;
    }
    //converter em  salario base em euros
    public double convSalarioBase(){
        double euros = salarioBase()/100.0;
        return euros;
    }


    @Override
    public int salarioTotal(){

        salTotal = salBase + super.horasExtras(ht);
        return salTotal;
    }
    //converter em  salario total em euros
    public double convSalarioTotal(){
        double euros = this.salarioTotal()/100.0;
        return euros;
    }

    //getters e setters

    public int getHt() {
        return ht;
    }

    public void setHt(int ht) {
        this.ht = ht;
    }
}
