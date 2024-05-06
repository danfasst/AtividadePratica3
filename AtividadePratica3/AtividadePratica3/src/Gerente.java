public class Gerente extends Funcionario {

    private float bonusAnual;
    private String equipeSobGerencia;

    public Gerente() {
    }

    public Gerente(String nome, String matricula, float salario, float bonusAnual, String equipeSobGerencia) {
        super(nome, matricula, salario);
        this.bonusAnual = bonusAnual;
        this.equipeSobGerencia = equipeSobGerencia;
    }

    public float getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(float bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public String getEquipeSobGerencia() {
        return equipeSobGerencia;
    }

    public void setEquipeSobGerencia(String equipeSobGerencia) {
        this.equipeSobGerencia = equipeSobGerencia;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBonus anual: " + bonusAnual + "\nEquipe sob gerência: " + equipeSobGerencia + "\nSalario final: " + calcularSalario();
    }

    @Override
    public float calcularSalario() {
        return getSalario() + bonusAnual;
    }

    @Override
    public String trabalhar() {
        return "\nO gerente " + getNome() + " está trabalhando em algumas planilhas!";
    }

    @Override
    public String relatarProgresso() {
        return "\n" + getNome() + ": Hoje o trabalho foi bom!";
    }

}
