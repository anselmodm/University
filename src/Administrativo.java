public final class Administrativo extends PessoalAdministrativo  {
    private int salBase;
    private int salTotal;

    private int ht = 12;

    //Construtor

    public Administrativo(String cc, String nome) {
        super(cc, nome);
    }



    //Metodos
    @Override
    public int salarioBase(){
        salBase = 37*750*4;
        return salBase;
    }
    //converter em  salario base em euros
    public double convSalarioBase(){
        double euros = this.salarioBase()/100.0;
        return euros;
    }


    @Override
    public int salarioTotal(){

        salTotal = salBase + super.horasExtras(ht);
        return salTotal;
    }
    //converter em  salario total em euros
    public double convSalarioTotal(){
        double euros = salarioTotal()/100.0;
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
