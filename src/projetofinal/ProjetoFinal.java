package projetofinal;

import javax.swing.JOptionPane;

public class ProjetoFinal {

    public static void main(String[] args) {
         
         Video video[] = new Video[5];
         Gafanhoto gafanhoto[] = new Gafanhoto[5];
         Visualizacao vis[] = new Visualizacao[5];
         
         video[0] = new Video();
         video[0].setTitulo(JOptionPane.showInputDialog("Titulo:"));
         
         video[1] = new Video();
         video[1].setTitulo(JOptionPane.showInputDialog("Titulo:"));
         
         video[2] = new Video();
         video[2].setTitulo(JOptionPane.showInputDialog("Titulo:"));
         
         gafanhoto[0] = new Gafanhoto("kielkow", "Matheus", 18, "M");
         gafanhoto[1] = new Gafanhoto("matheuskiel", "Matheus Kiel", 17, "M");
         gafanhoto[2] = new Gafanhoto("lucaskiel", "Lucas", 15, "M");
         
         vis[0] = new Visualizacao(gafanhoto[0], video[0]);
         vis[0].avaliar();
         System.out.println(vis[0].toString());
         
         vis[1] = new Visualizacao(gafanhoto[1], video[1]);
         vis[1].avaliar(7);
         System.out.println(vis[1].toString());
         
         vis[2] = new Visualizacao(gafanhoto[2], video[2]);
         vis[2].avaliar(50.5);
         System.out.println(vis[2].toString());
         
         
        } 
         
}