package bsu.rfct.course2.group6.nadievskaya.varA6;

public class Coffee  extends Food  {
    public String aroma;
    public Coffee(String aroma) {
        super("Кофе");
        this.aroma= aroma;
    }
    public void consume() {
        System.out.println(this + " съедено");
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Coffee)) return false;
            return aroma.equals(((Coffee)arg0).aroma);
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " аромата '" + aroma.toUpperCase() + "'";
    }

}
