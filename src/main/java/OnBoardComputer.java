public class OnBoardComputer implements BurnStream {
    @Override
    public int getNextBurn(DescentEvent status) {

        double currentSpeed = status.getVelocity();
        double currentAltitude = status.getAltitude();

        //a = (speed * speed)/(2 * altitude)
        int burn = (int) ((currentSpeed * currentSpeed) / (2 * currentAltitude));

        if (currentAltitude <= 100 && currentSpeed < 2) {
            burn = 98;
        }

        System.out.println(burn); /*hack!*/
        return burn;
    }

}
