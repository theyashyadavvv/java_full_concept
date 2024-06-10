package ALL_JAVA_OOPS.COM;


    class parent{
        //overridden method(jiska method change ho rha hai)
        public void m1(){
            System.out.println("i am m1() from parent");
        }

    }
    class child extends parent {
        public void m1() {
//method overriding method(jo change kr rha hai 
            System.out.println("i am m1 from parent");
        }
    }

        public class inhearit {
        // main class iske ander koi class inherit nhi hoti

    public static void main (String args[]){
        child c1= new child();
        c1.m1();

    }
}
//OVERRIDNING:IT IS A PROCESS WHEN CHILD  CLASS NOT SATICFY METHOD BODY OF THE PARENT CLASS THEN CHILD CLASS OVERIDE  REDIFNE THE BODY PART OF PARENT METHOD
//PARENT CLASS AND CHILD CLASS KI NAME AND ARRGUMENT SAME HONE CHIYA
//RETURN TIME CO-VARIENT ALLOW
//ACESS MODIFIRE (PUBLIC >PROTECTED>DEFAULT>PRIVATE)CHILD CLASS KI ACESSBILITY KAM NHI KAR SAKTE YA TOH BRABER RAKHO YA TOH JADA
