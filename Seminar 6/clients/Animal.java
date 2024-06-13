package clients;

import java.time.LocalDate;
import java.util.Objects;

public class Animal {
    protected int id;
    protected String name;
    protected LocalDate birthdate;
    protected Owner owner;

    public Animal(int id, String name, LocalDate birthdate, Owner owner) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.owner = owner;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public Owner getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && Objects.equals(name, animal.name) && Objects.equals(birthdate, animal.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthdate);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}