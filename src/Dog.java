/**
 * Created by FlameXander on 09.09.2016.
 */
public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
        this.type = "Dog";
        this.maxSwimDistance = 20.0f;
        this.maxJumpHeight = 0.5f;
        this.maxRunDistance = 1500.0f;
        onDistance = true;
    }
}
