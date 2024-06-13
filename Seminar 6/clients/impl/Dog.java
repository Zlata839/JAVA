package clients.impl;

import clients.Animal;
import clients.Owner;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(int id, String name, LocalDate birthdate, Owner owner) {
        super(id, name, birthdate, owner);
    }
}