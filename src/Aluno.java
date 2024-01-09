//Definicao da class aluno
public class Aluno {
    //Declaracao e inicializacao das variaveis
    String nome="Teste", morada="Tete", contacto="841234567", turma="A", classe="9a", periodo="Manha";

    //Construcao dos metodos get's - retorno dos valores das variaveis da classe
    public String getNome(){
        return this.nome;
    }
    public String getMorada(){
        return this.morada;
    }
    public String getContacto(){
        return this.contacto;
    }
    public String getTurma(){
        return this.turma;
    }
    public String getClasse(){
        return this.classe;
    }
    public String getPeriodo(){
        return this.periodo;
    }

    //Construcao dos metodos set's - guardar os valores nas variaveis da classe
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setMorada(String morada){
        this.morada=morada;
    }
    public void setContacto(String contacto){
        this.contacto=contacto;
    }
    public void setTurma(String turma){
        this.turma=turma;
    }
    public void setClasse(String classe){
        this.classe=classe;
    }
    public void setPeriodo(String periodo){
        this.periodo=periodo;
    }

}
