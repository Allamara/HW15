public class Hufflepuff extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honest;

    public Hufflepuff(String name, int powerOfMagic, int transgressionDistance, int industriousness, int loyalty, int honest) {
        super(name, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honest = honest;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public int sum() {
        return industriousness + loyalty + honest;
    }

    public void compare(Hufflepuff other) {
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
        return "Hufflepuff. " +
                "industriousness =" + industriousness +
                ", loyalty =" + loyalty +
                " , honest =" + honest +
                '}';
    }
}
