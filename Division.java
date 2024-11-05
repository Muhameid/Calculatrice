public class Division extends Operation{
    public Division(Nombre operande1,Nombre operande2){
        super(operande1,operande2);
        if (operande2.valeur()==0){
            throw new ArithmeticException("Divison par 0 est impossible");
        }
 
    }
    public int valeur() {
        return this.getOperande1().valeur()/this.getOperande2().valeur();}
    public String toString(){
        return "La valeur du nombre saisi est" + this.getOperande1().valeur() + "/"+ this.getOperande2().valeur();}
 }
 