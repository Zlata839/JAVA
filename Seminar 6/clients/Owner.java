package clients;

public class Owner {
    int phoneNumber;

    public Owner(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "phoneNumber=" + phoneNumber +
                '}';
    }
}
