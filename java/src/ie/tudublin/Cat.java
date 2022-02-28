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
            System.out.println("I'm dead!");
        }
    }

=======
            System.out.println("Im dead");
        }
    }

    
>>>>>>> 25b711959804c0ede9b303dfca8449c75993fc23
    public int getNumLives() {
        return numLives;
    }

<<<<<<< HEAD
=======

>>>>>>> 25b711959804c0ede9b303dfca8449c75993fc23
    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

<<<<<<< HEAD
=======

>>>>>>> 25b711959804c0ede9b303dfca8449c75993fc23
    public Cat(String name)
    {
        super(name);
        numLives = 9;
    }
}