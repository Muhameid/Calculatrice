

public class Main {
   public static void main(String[ ] args){
       Nombre dix = new Nombre(10);
       Nombre cinq = new Nombre(5);
       Nombre zero= new Nombre(0);

       Operation s1 = new Addition(dix,cinq);
       Operation s2 = new Soustraction(dix,cinq);
       Operation s3 = new Multiplication(dix,cinq);
       Operation s4 = new Division(dix,cinq);

       System.out.println(""+ s1 + "est egale à" + s1.valeur()); // doit afficher (10+5)=15
       System.out.println(" "+s2 + " est egale à" + s2.valeur()); // doit afficher (10-5)=5
       System.out.println(" "+s3 + " qui donne " + s3.valeur()); // doit afficher (10*5)=50
       System.out.println(" "+ s4 + "qui est egale à " + s4.valeur()); // doit afficher (10/5)=2

       try{
           Operation z2 = new Division(dix,zero);
           System.out.println(z2+"="+ z2.valeur());
       }
       catch (ArithmeticException exception_par_0){
           System.out.println("Pas de division par 0");
       }



   }
}
