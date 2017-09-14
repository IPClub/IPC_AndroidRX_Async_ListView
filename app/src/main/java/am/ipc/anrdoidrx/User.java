package am.ipc.anrdoidrx;

/**
 * Created by haykc on 09/14/2017.
 */

public class User {
    private String name;


    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
