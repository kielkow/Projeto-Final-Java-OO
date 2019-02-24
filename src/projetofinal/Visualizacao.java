package projetofinal;

public class Visualizacao{
    
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    

        //this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        //this.filme.setViews(this.filme.getViews()+1);

    
    
    
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(double porc){
        if(porc <= 20){
            this.filme.setAvaliacao(3);
        }
        else if(porc <=50){
            this.filme.setAvaliacao(5);
        }
        else if(porc <= 80){
            this.filme.setAvaliacao(8);
        }
        else{
            this.filme.setAvaliacao(10);
        }
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
    
    
}
