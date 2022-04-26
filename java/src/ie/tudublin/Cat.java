package ie.tudublin;

public class Cat extends Animal
{
    private int numLives;

    public void kill()
    {
        if (numLives > 0)
        {
            System.out.println("Ouch!");
            numLives --;
        }
        else
        {
<<<<<<< HEAD
<<<<<<< HEAD
            System.out.println("I'm dead!");
        }
    }

=======
=======
>>>>>>> 74741885e9318c670d6be4ad6557aea130c7cd11
            System.out.println("Im dead");
        }
    }

    
<<<<<<< HEAD
>>>>>>> 25b711959804c0ede9b303dfca8449c75993fc23
=======
>>>>>>> 74741885e9318c670d6be4ad6557aea130c7cd11
    public int getNumLives() {
        return numLives;
    }

<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 25b711959804c0ede9b303dfca8449c75993fc23
=======

>>>>>>> 74741885e9318c670d6be4ad6557aea130c7cd11
    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 25b711959804c0ede9b303dfca8449c75993fc23
=======

>>>>>>> 74741885e9318c670d6be4ad6557aea130c7cd11
    public Cat(String name)
    {
        super(name);
        numLives = 9;
    }
}