public class OnBoardComputer implements BurnStream {
    @Override
    public int getNextBurn(DescentEvent status) {

        double currentSpeed = status.getVelocity();
        double currentAltitude = status.getAltitude();

        //a = (speed * speed)/(2 * altitude)
        int burn = (int) ((currentSpeed * currentSpeed) / (2 * currentAltitude));

        if (currentAltitude == 0 && currentSpeed < 1) {
            burn = -1;
        }

        System.out.println(burn); /*hack!*/
        return burn + 100;
    }

}
