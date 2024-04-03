package objects;

public class Attack extends Card{


    public Attack(int points) {
        super(points);
    }

    @Override
    public void cardAction(Player player) {
        if (player.getShieldPoint() > 0){ // VEMOS SI TIENE ESCUDO
            int pointsLeft = player.getShieldPoint() - getPoints(); // SIMULAMOS LA RESTA DEL ESCUDO
            if (pointsLeft < 0){ // SI LA SIMULACION NOS DA NEGATIVO // HA RESTADO MAS ESCUDO DEL QUE TENIA, HAY QUE RESTAR VIDA
                pointsLeft = -pointsLeft; // CAMBIAMOS A POSTIVO
                player.setShieldPoint(0); // PONEMOS ESCUDO A 0
                player.substarctHealth(pointsLeft); // QUITAMOS LOS PUNTOS SIMULADOS

            } else {
                player.setShieldPoint(pointsLeft); // QUITAMOS LA SIMULACION YA QUE
            }
        } else {
            player.substarctHealth(getPoints());
        }
    }
}
