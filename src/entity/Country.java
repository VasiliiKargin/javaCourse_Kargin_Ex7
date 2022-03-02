package entity;

public abstract class Country {

    private String name;
    public int people;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    protected String city;


    public Country(String name, int people, String city) {
        this.name = name;
        this.people = people;
        this.city = city;
    }

    public abstract String getLanguage();
}
