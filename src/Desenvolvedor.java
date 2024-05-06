public class Desenvolvedor extends Funcionario {

    private String tecnoDomina;

    public Desenvolvedor(){
    }

    public Desenvolvedor(String nome, String matricula, float salario, String tecnoDomina) {
        super(nome, matricula, salario);
        this.tecnoDomina = tecnoDomina;
    }

    public String getTecnoDomina() {
        return tecnoDomina;
    }

    public void setTecnoDomina(String tecnoDomina) {
        this.tecnoDomina = tecnoDomina;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTecnologias que domina: " + tecnoDomina;
    }

    @Override
    public float calcularSalario() {
        return getSalario();
    }

    @Override
    public String trabalhar() {
        return "\nO desenvolvedor " + getNome() + " está se esforçando hoje!";
    }

    @Override
    public String relatarProgresso() {
        return "\n" + getNome() + ": hoje consegui desenvolver muitas funções!";
    }

}
