public class Hogwarts {

    private String name;
    private int powerOfMagic;
    private int transgressionDistance;


    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public int sum() {
        return powerOfMagic + transgressionDistance;
    }

    public void compare(Hogwarts other) {
        if (sum() > other.sum()) {
            System.out.println(name + " is much more powerful witch/wizard than " + other.name);
        } else {
            System.out.println(other.name + " is much more powerful witch/wizard than " + name);
        }
    }

    @Override
    public String toString() {
        return name + ": " +
                " powerOfMagic =" + powerOfMagic +
                ", transgressionDistance =" + transgressionDistance;
    }
}
