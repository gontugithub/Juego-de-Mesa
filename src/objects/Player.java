package objects;

public class Player {

        private int healthPoint = 100;
        private int shieldPoint = 0;

        public static final int MAX_HP = 100;
        public static final int MAX_SP = 50;

        public int substarctHealth(int points){
               return healthPoint - points;
        }
        public int substarctShield(int points){
                return shieldPoint - points;
        }

        public int getHealthPoint() {
                return healthPoint;
        }

        public void setHealthPoint(int healthPoint) {
                this.healthPoint = healthPoint;
        }

        public int getShieldPoint() {
                return shieldPoint;
        }

        public void setShieldPoint(int shieldPoint) {
                this.shieldPoint = shieldPoint;
        }
}
