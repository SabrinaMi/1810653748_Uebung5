public class Student extends Menschneu
{
    //Attribute
    private int matrikelnummer;
    private String studiengang;
    //Konstruktor
    public Student(String vorname, String nachname, int alter, int matrikelnummer, String studiengang) {
        super(vorname, nachname, alter);
        this.matrikelnummer=matrikelnummer;
        this.studiengang=studiengang;
    }
    @Override
    public void Status(){
        System.out.println(getVorname()+" "+getNachname()+" ist ein Student und ist "+getAlter()+" Jahre alt und studiert "
                +getStudiengang() + ". Die Matrikelnummer lautet: "+getMatrikelnummer());
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }
}