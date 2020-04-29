import java.util.List;
import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private int age;
    private List<String> specializations;
    private String worksFor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSpecializations() {
        return specializations;
    }

    public void setSpecializations(List<String> specializations) {
        this.specializations = specializations;
    }

    public String getWorksFor() {
        return worksFor;
    }

    public void setWorksFor(String worksFor) {
        this.worksFor = worksFor;
    }

    public Person() {
    }

    private void nothing(){}

    public Person(int id, String name, int age, List<String> specializations, String worksFor) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.specializations = specializations;
        this.worksFor = worksFor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(specializations, person.specializations) &&
                Objects.equals(worksFor, person.worksFor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, specializations, worksFor);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", specializations=" + specializations +
                ", worksFor='" + worksFor + '\'' +
                '}';
    }
}
