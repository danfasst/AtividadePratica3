public class Estagiario extends Funcionario {

    private int horasTrabalho;
    private String supervisor;

    public Estagiario(){
    }

    public Estagiario(String nome, String matricula, float salario, int horasTrabalho, String supervisor) {
        super(nome, matricula, salario);
        this.horasTrabalho = horasTrabalho;
        this.supervisor = supervisor;
    }

    public int getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHoras trabalhadas: " + horasTrabalho + "\nNome do Supervisor: " + supervisor;
    }

    @Override
    public float calcularSalario() {
        return getSalario();
    }

    @Override
    public String trabalhar() {
        return "\nO estagiario " + getNome() + " está trabalhando hoje!";
    }

    @Override
    public String relatarProgresso() {
        return "\n" + getNome() + ": aprendi muita coisa hoje, me senti util!";
    }

}
