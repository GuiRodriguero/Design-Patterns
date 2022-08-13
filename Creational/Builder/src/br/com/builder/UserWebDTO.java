package br.com.builder;

/**
 * Objeto final que queremos criar
 */
public class UserWebDTO implements UserDTO {
    private String name;
    private String address;
    private String age;

    public UserWebDTO() {
    }

    public UserWebDTO(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                "\nage='" + age + '\'' +
                "\naddress='" + address + '\'';
    }
}
