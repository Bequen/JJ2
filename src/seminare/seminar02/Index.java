package seminare.seminar02;

public class Index {
    Person[] persons;
    Country[] countries;

    public Index(Person[] persons, Country[] countries) {
        this.persons = persons;
        this.countries = countries;
    }

    public int count(String countryName) {
        int resultCount = 0;
        for(Country country : countries) {
            if(country.getName().equals(countryName)) {
                resultCount++;
            }
        }
        return resultCount;
    }

    public int count(String firstname, String lastname) {
        int resultCount = 0;
        for(Person person : persons) {
            if(person.getFirstname().equals(firstname) && person.getLastname().equals(lastname)) {
                resultCount++;
            }
        }
        return resultCount;
    }

    public Person search(int id) {
        for(Person person : persons) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public Person[] search(String firstname, String lastname) {
        Person[] result = new Person[persons.length];
        int i = 0;
        for(Person person : persons) {
            if( person.getFirstname().equals(firstname) &&
                person.getLastname().equals(lastname)) {
                result[i++] = person;
            }
        }

        return result;
    }

    public Country getCountryByPhoneCode(String phoneCode) {
        for(Country country : countries) {
            if(country.getPhoneCode().equals(phoneCode)) {
                return country;
            }
        }
        return null;
    }

    public boolean setPhoneCode(Person person, String phoneCode) {
        Country country = getCountryByPhoneCode(phoneCode);

        if(country == null) {
            return false;
        }

        person.setCountry(country);
        return true;
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rejstrik{");
        for(Person person : persons) {
            person.stringBuilderAppendInfo(stringBuilder);
        }
        stringBuilder.append("}");
        System.out.println(stringBuilder);
    }
}
