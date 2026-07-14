public class Professor extends PessoalDocente{
    private int salBase;
    private int sex = 5;
    private int compSal;
    private int salTotal;

    //Construtor

    public Professor(String cc, String nome) {
        super(cc, nome);
    }


    //Metodos
    @Override
    public int salarioBase(){
        salBase = 37*800*4;
        return salBase;
    }
    //converter em  salario base em euros
    public double convSalarioBase(){
        double euros = this.salarioBase()/100.0;
        return euros;
    }

    public int compSalrial(){
        if (sex > 6){
            sex = 6;
        }
        compSal = sex*10000;
        return compSal;
    }
    //converter em  Compsalario base em euros
    public double convCompSalarial(){
        double euros = compSalrial()/100.0;
        return euros;
    }

    @Override
    public int salarioTotal(){
       salTotal = salBase + compSalrial();
        return salTotal;
    }
    //converter em  salario total em euros
    public double convSalarioTotal(){
        double euros = this.salarioTotal()/100.0;
        return euros;
    }

    //Getters and Setter

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
