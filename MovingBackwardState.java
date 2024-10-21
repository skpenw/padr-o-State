public class MovingBackwardState implements State {
    @Override
    public void pressButton(Car car) {
        System.out.println("O carrinho está indo para frente.");
        car.setState(new MovingForwardState());
    }
}
