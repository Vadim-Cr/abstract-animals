package principale;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void dormi(){
        System.out.println("quando dormo faccio Zzzzzz");
    }

    public abstract void verso();
    public abstract void mangia();


}
