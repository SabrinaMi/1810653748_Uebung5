public abstract class Saeugetier
{
    private String name;
    private int alter;
    private String geschlecht;

    //Konstruktor

    public Saeugetier(String name, int alter, String geschlecht)
    {
        this.alter = alter;
        this.name = name;
        this.geschlecht = geschlecht;
    }

    //Abstrakte Methode
    public abstract String printAll();

    //Getter und Setter

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAlter()
    {
        return alter;
    }

    public void setAlter(int alter)
    {
        this.alter = alter;
    }

    public String getGeschlecht()
    {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht)
    {
        this.geschlecht = geschlecht;
    }
}
