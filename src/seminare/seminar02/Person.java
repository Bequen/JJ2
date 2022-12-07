package seminare.seminar02;

public class Person {
    private int id;
    public int getId() { return id; }
    private String firstname;
    public String getFirstname() { return firstname; }
    private String lastname;
    public String getLastname() { return lastname; }
    private int age;
    private String phone;
    private Country country;
    public void setCountry(Country country) { this.country = country; }

    public Person(int id, String firstname, String lastname, int age, String phone, Country country) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.phone = phone;
        this.country = country;
    }

    public String getStatus() {
        return age >= 65 ? "senior" : age < 18 ? "junior" : "dospely";
    }

    public String getPhone() {
        StringBuilder strBuilder = new StringBuilder(15);
        if(country != null) {
            strBuilder.append(country.getPhoneCode());
        }
        strBuilder.append(phone);
        return strBuilder.toString();
    }

    public void stringBuilderAppendInfo(StringBuilder strBuilder) {
        strBuilder.append("Osoba{id=").append(id)
                .append(",jmeno=").append(firstname)
                .append(",prijmeni").append(lastname)
                .append(",vek=").append(age)
                .append(",telefon=").append(getPhone())
                .append(",status=").append(getStatus())
                .append(",stat=").append(country.getName());
    }

    public void print() {
        StringBuilder strBuilder = new StringBuilder();
        stringBuilderAppendInfo(strBuilder);

        System.out.println(strBuilder);
    }
}
