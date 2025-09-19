package Assignments.Assignment8.lesson11.Prob1;

import java.util.Objects;

public class Key {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Key(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if( !(obj instanceof Key)) return false;
        Key k = (Key) obj;
        return Objects.equals(firstName, k.firstName) && Objects.equals(lastName, k.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
