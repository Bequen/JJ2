package seminare.seminar02;

public class Country {
    private String name;
    public String getName() { return name; }
    private String phoneCode;
    public String getPhoneCode() { return phoneCode; }

    public Country(String name, String phoneCode) {
        this.name = name;
        this.phoneCode = phoneCode;
    }

    public void print() {
        StringBuilder strBuilder = new StringBuilder(32);
        strBuilder.append("Stat{jmeno=");
        strBuilder.append(name).append(",predvolba=").append(phoneCode).append("}");
        System.out.println(strBuilder);
    }
}
