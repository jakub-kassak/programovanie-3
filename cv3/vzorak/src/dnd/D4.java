package dnd;

import java.util.Random;

class D4 implements NDie {
    MyRandom random;
    private final int NUMBER_OF_SIDES = 4;

    public D4(MyRandom random) {
        this.random = random;
    }

    public int nextValue() {
        return (int)Math.abs(this.random.nextLong() % this.NUMBER_OF_SIDES);
    }

    public int getSidesCount() {
        return this.NUMBER_OF_SIDES;
    }

    @Override
    public void setGenerator(MyRandom newGenerator) {
        this.random = newGenerator;
    }
}