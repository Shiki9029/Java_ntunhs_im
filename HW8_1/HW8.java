public class HW8 {
    public static void main(String arg[]){
        //Character humam=new Character();
        Warrior warrior=new Warrior("戰士A", 100,15,5);
        Mage mage= new Mage("法師B", 80, 10, 50);

        mage.castSpell(warrior);
        warrior.useShield();
        mage.display();
        warrior.display();





    }
    

   
        
    
    
    
}
