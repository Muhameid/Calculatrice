public class Nombre {
   private int valeurNombre;

   public Nombre(int valeurNombre){
        this.valeurNombre=valeurNombre;}
   public int valeur(){
       return this.valeurNombre;
   }
   public String toString(){
    /**
     * @return  Retourne le nombre saisi
     */
       return "La valeur du nombre saisi est" + this.valeurNombre;}  }
