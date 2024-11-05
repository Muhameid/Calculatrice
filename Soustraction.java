


public class Soustraction extends Operation{
    public Soustraction(Nombre operande1,Nombre operande2){
        super(operande1,operande2);
    }
 
    public int valeur() {
        return this.getOperande1().valeur()- this.getOperande2().valeur();}
    public String toString(){
        return "La valeur du nombre saisi est"+ this.getOperande1().valeur() +"- "+this.getOperande2().valeur();}}
 