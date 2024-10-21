public class StoppedState implements State {
    @Override
    public void pressButton(Car car) {
        System.out.println("O carrinho começa a andar para frente.");
        car.setState(new MovingForwardState());
    }
}
