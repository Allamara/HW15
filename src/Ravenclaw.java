public class Ravenclaw extends Hogwarts {

    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, powerOfMagic, transgressionDistance);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int sum() {
        return wisdom + wit + creativity;
    }

    public void compare(Ravenclaw other) {
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
        return "Ravenclaw." + super.toString() +
                ", wisdom =" + wisdom +
                ", wit =" + wit +
                ", creativity =" + creativity;
    }
}
