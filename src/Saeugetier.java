public abstract class Saeugetier
{
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

    private String name;
    private int alter;
    private String geschlecht;

    public abstract String printAll(); //abstract braucht keinen Körper

    //Konstruktor

    public Saeugetier(String name, int alter, String geschlecht)
    {
        this.alter=alter;
        this.name=name;
        this.geschlecht=geschlecht;
    }


}
