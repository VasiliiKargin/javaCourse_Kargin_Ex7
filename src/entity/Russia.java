package entity;

public class Russia extends Country {
private int code;
public  String national;

    @Override
    public String getName() {
        return super.getName();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    protected String cash;

    public Russia(String name, int people, String city) {
        super(name, people, city);
        this.cash =cash;
            }
    public Russia() {
        super("Russ",325,"EKB");
    }
    {
        code= 863;
        national= "Русские";
        cash = "Российский рубль";
        city = "Екатеринбург";
        setName("Российская Федерация");
    }


    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getLanguage() {
        return "Русский";
    }

}
