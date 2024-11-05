
public class Addition extends Operation{


    public Addition(Nombre operande1, Nombre operande2) {
        super(operande1,operande2);
    }
 
    public int valeur(){
        return this.getOperande1().valeur()+this.getOperande2().valeur();
    }
 
    public String toString(){
        return "L'addition" + this.getOperande1().valeur() + "+" + this.getOperande2().valeur() ;
    }
 
 }
 