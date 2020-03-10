package day50_inheritance_hiding;

    public class CapitalCity extends City {
        private String country;
        private long population;
        public CapitalCity() {
            super();
        }
        // CapitalCity c = new CapitalCity("Paris", "France", 21000000L);
        public CapitalCity(String name, String country, long population){
            //super(name);
            setName(name);
            this.country = country;
            setCountry(country);
        }
        @Override
        public String toString(){
            //return "name = " + getName()+ ", country = "+ country +", population = " + population;
            return super.toString()+ ", country = "+ country +", population = " + population;
        }
        public String getCountry() {
            return country;
        }
        public void setCountry(String country) {
            //if conditions
            this.country = country;
        }
        public long getPopulation() {
            return population;
        }
        public void setPopulation(long population) {
            this.population = population;
        }
    }

