public abstract class PessoalAdministrativo extends Pessoal{
    private int horasEx;


    //Construtor

    public PessoalAdministrativo(String cc, String nome) {
        super(cc, nome);

    }



//metodos

    public abstract int salarioBase();


    public abstract int salarioTotal();


    public  int horasExtras(int horasTrab){
       horasEx = horasTrab*600;
       return horasEx;
    }

    //Converter para euros
    public double convHorasExtras(int horasTrab){
        double euros = horasExtras( horasTrab)/100;
        return euros;
    }

    //getters e setters


    public int getHorasEx() {
        return horasEx;
    }

    public void setHorasEx(int horasEx) {
        this.horasEx = horasEx;
    }

}
