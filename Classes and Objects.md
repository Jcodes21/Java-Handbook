Intro
In OOP ecerything is around objects, in our code we want to model things that are in the real world. We model things with classes which act like a blueprint from which we can create a bunch of objects.
There are different types of classes, there are classes to model the real world, classes for us to perform the business logic, classes for us to store data and so on.

Creating a class
When we create a class we can define it's properties and behaviours. Variables inside a class are usually called fields/attributes and describe the objects state / data / properties. method are the behaviours / actions an onject can do or things to calculate.


Class Panda {
  // attribute / property
  int name;

  // behaviour
  void bite(); {
  System.out.println(name + "Has taken a bite!");
  }
}

If we want to use this class we could call it like below.

public class Main {
    public static void main(String[] args){
    Panda chewy = new panda();
    chewy.setName("Chewy");  
    chewy.bite();


    Panda pennyworth = new panda();
    pennyworth.setName("pennyworth"); 
    pennyworth.bite();

    
    }

// this class could live inside it's own file
  static Class Panda {
    // attribute / property
      private int name;
    
   // behaviour
      public void bite(); {                        // public so anyone that instantiates this will have access to it
        System.out.println(name + "Has taken a bite!");
      }

  public void setName(String name){
      this.name = name;
      }
}
