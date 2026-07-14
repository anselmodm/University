public abstract class PessoalDocente extends Pessoal{


   // Construtor

    public PessoalDocente(String cc, String nome) {
        super(cc, nome);

    }


    //metodos

    public abstract int salarioBase();

    public abstract int salarioTotal();
}
