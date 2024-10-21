public class MovingForwardState implements State {
    @Override
    public void pressButton(Car car) {
        System.out.println("O carrinho para.");
        car.setState(new StoppedState());
    }
}
