package entity;

public class USA extends Country {
private float raiting;
public String contine;
protected String cash;

    public float getRaiting() {
        return raiting;
    }

    public void setRaiting(float raiting) {
        this.raiting = raiting;
    }

    public USA(String name, int people, String city) {
        super(name, people, city);
    }
    public USA() {
        super("USA", 6566, "New York");
    }
    {
        raiting=5.5f;
        contine="Севереная Америка";
        cash="Dollar";
        setName("Америка");
    }
    public  String getLanguage() {
        return "Английский";
    }
}
