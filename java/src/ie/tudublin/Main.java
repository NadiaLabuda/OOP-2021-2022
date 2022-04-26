package ie.tudublin;



public class Main
{
    public static void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }

<<<<<<< HEAD
<<<<<<< HEAD
=======
    public static void starMap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new StarMap());
    }

>>>>>>> 74741885e9318c670d6be4ad6557aea130c7cd11
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

<<<<<<< HEAD
=======
>>>>>>> 11c64d0c7d02695b5fa5b206f1e71628adb43544
=======
    public static void life()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Life());
    }

    public static void timing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new TimingExample());
    }


    public static void audio1()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Audio1());
    }

    public static void audio2()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Audio2());
    }

    public static void colorfulLife()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new ColorfulLife());
    }

    public static void YASC()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new YASC());
    }

>>>>>>> 74741885e9318c670d6be4ad6557aea130c7cd11
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
<<<<<<< HEAD
=======
        
>>>>>>> 25b711959804c0ede9b303dfca8449c75993fc23
=======
        
>>>>>>> 74741885e9318c670d6be4ad6557aea130c7cd11
        Cat cat = new Cat("Ginger");

        while(cat.getNumLives() > 0)
        {
            cat.kill();
        }
        cat.kill();
<<<<<<< HEAD
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
=======

    }
    public static void main(String[] args)
    {
        YASC();

>>>>>>> 74741885e9318c670d6be4ad6557aea130c7cd11
        // Tara Misty
        // Tara Tara
        
    }
}