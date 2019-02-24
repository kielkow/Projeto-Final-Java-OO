package projetofinal;

public class Gafanhoto extends Pessoa{

    private String login;
    private int totAssistido;

    public Gafanhoto(String login, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.setExperiencia(0);
        this.setTotAssistido(0);
    }
  
    
    
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
    
    
    
    
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido()+1);
    }
    
    
    @Override
    protected void ganharXp() {
        this.setExperiencia(this.getExperiencia()+50);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
    
    
}
