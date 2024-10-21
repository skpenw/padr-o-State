public class Car {
    private State state;

    public Car() {
        state = new StoppedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressButton() {
        state.pressButton(this);
    }
}
