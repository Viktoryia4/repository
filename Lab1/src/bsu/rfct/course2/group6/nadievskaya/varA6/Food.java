package bsu.rfct.course2.group6.nadievskaya.varA6;
    public abstract  class Food implements Consumable {

        String name = null;
        public Food(String name)
        {
            this.name = name;
        }

        public boolean equals(Object arg0)
        {
            if (!(arg0 instanceof bsu.rfct.course2.group6.nadievskaya.varA6.Food)) return false; // Шаг 1
            if (name==null || ((bsu.rfct.course2.group6.nadievskaya.varA6.Food)arg0).name==null) return false; // Шаг 2
            return name.equals(((bsu.rfct.course2.group6.nadievskaya.varA6.Food)arg0).name); // Шаг 3
        }

        public String toString() {
            return name;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

    }
