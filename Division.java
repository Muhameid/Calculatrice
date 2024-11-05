public class Division extends Operation{
    public Division(Nombre operande1,Nombre operande2){
        
        super(operande1,operande2);
        if (operande2.valeur()==0){
           
            throw new ArithmeticException("Divison par 0 est impossible");
        }
 
    }
     /**
         * @throws ArithmeticException si la valeur de oprande 2 est égale à 0
         * division par zéro interdite
         * @return resultat de la division sous forme d'un entier
         */
    public int valeur() {
        /**
         * @param operande1 opérande numerateur
         * @param operande denominateur
         */
        return this.getOperande1().valeur()/this.getOperande2().valeur();}
    public String toString(){
         /**
         * Une chaine de caractére décrivant l'opération
         */
        return "La valeur du nombre saisi est" + this.getOperande1().valeur() + "/"+ this.getOperande2().valeur();}
 }
 