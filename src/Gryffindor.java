import java.sql.SQLOutput;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int sum() {
        return courage + honor + nobility;
    }

    public void compare(Gryffindor other) {
        int thisPower = sum();
        int otherPower = other.sum();
        if (thisPower > otherPower) {
            System.out.println(getName() + "is a better student than " + other.getName());
        } else {
            System.out.println(other.getName() + "is a better student than " + getName());
        }
    }


    @Override
    public String toString() {
        return "Gryffindor." + super.toString() + ", nobility =" + nobility + ", honor =" + honor + ", courage =" + courage;
    }
}





