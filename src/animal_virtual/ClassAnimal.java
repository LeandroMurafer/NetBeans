package animal_virtual;

public class ClassAnimal {
    
    private String Nome;
    private String Tipo;
    private int Idade;

    public ClassAnimal(String Nome, String Tipo, int Idade) {
        this.Nome = Nome;
        this.Tipo = Tipo;
        this.Idade = Idade;
     
    }
    public String getNOME() {
        return Nome;
    }

    public String getTIPO() {
        return Tipo;
    }

    public int getIDADE() {
        return Idade;
    }

    public void setNOME(String nome) {
        this.Nome = Nome;
    }

    public void setTIPO(String tipo) {
        this.Tipo = Tipo;
    }

    public void setIDADE(int idade) {
        this.Idade = Idade;
    }
}

