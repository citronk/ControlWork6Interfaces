public class Basovi extends Absolut {
    private String parking;

    private int God;

    Basovi(String parking, int god){
        this.parking = parking;
        this.God = God;
    }

    public int getGod() {
        return God;
    }

    public void setGod(int god) {
            this.God = god;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) throws WrongParkingException {
        if (!parking.equals("")) {
            this.parking = parking;
        }
        else {
            throw new WrongParkingException("Wrong parking name");
        }
    }

    public String Find(Object[] a, int count, int year) {
        for (int i = 0; i < count; i++){
            if ( ((Basovi)a[i]).getGod() == year){
                return this.toString();
            }
        }
        return "-1";
    }

    @Override
    public void RdAvto(Basovi[] cars, int count) {

    }
}