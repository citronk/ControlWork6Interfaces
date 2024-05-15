import java.io.FileWriter;
import java.io.IOException;

public class Avto extends Basovi implements Intface {

    private String parking;

    Avto(String parking, int year){
        super(parking, year);
        this.parking = parking;
    }

    public String find(Object[] a, int count, int year) {
        for (int i = 0; i < count; i++){
            if ( ((Basovi) a[i]).getGod() == year){
                return this.toString();
            }
        }
        return "-1";
    }

    @Override
    public String toString(){
        return super.toString() + parking;
    }

    public void rdAvto() {
        try(FileWriter writer = new FileWriter("Avto.txt", false))
        {
            writer.write(this.toString());
            writer.append('\n');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}