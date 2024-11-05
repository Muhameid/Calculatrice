/**
 * Cette classe représente la multiplication de deux opérandes
 * @author Mouhammed Diop
*/
 

public class Multiplication extends Operation {
   
    public Multiplication(Nombre operande1, Nombre operande2) {
        super(operande1, operande2);
    }
 
    public int valeur() {
        /**
         * @param   Operande1  le premier opérande
         * @param   Operande2 la deuxiéme opérande
	     * @return   retourne la valeur de la multiplication   
         */
        return this.getOperande1().valeur() * this.getOperande2().valeur();
    }
      /**
	* Affichage du résultat 
	*/
 
    public String toString() {
        return "La valeur du nombre saisi est" + this.getOperande1().valeur() +"*"+ this.getOperande2().valeur();
    }
 }
 