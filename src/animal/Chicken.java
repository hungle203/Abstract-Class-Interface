package animal;

import interFace.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: gâu gâu!";
    }

    @Override
    public String howToEat() {
        return "Thóc ngon vllll";
    }
}
