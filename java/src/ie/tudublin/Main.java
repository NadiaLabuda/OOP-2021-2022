package ie.tudublin;



public class Main
{
    public static void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }

<<<<<<< HEAD
    public static void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
    }

    public static void loops()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
    }

    public static void arrays()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Arrays());
    }

=======
>>>>>>> 11c64d0c7d02695b5fa5b206f1e71628adb43544
    public void cat()
    {
        System.out.println("Hello world");

        Animal misty = new Animal("Misty");
        Animal lucy = new Animal("Lucy");

        lucy = misty;
        misty.setName("Tara");

        System.out.println(misty);
        System.out.println(lucy);

<<<<<<< HEAD
=======
        
>>>>>>> 25b711959804c0ede9b303dfca8449c75993fc23
        Cat cat = new Cat("Ginger");

        while(cat.getNumLives() > 0)
        {
            cat.kill();
        }
        cat.kill();
    }
    public static void main(String[] args)
    {
        helloProcessing();

<<<<<<< HEAD
=======
    }
    public static void main(String[] args)
    {
        arrays();

>>>>>>> 25b711959804c0ede9b303dfca8449c75993fc23
        // Tara Misty
        // Tara Tara
        
    }
}