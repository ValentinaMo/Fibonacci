package Coffes;

public class CoffeeBuilder implements Builder {
    private String size, type;
    private int numberOfCoffees, coffeeTablespoons, iceCubes;
    private Boolean cinnamon, skimmedMilk, sugar, splenda, cream;
    private float coffeeCups, ouncesWater, ouncesMilk, ouncesLicor;

    public CoffeeBuilder(String type, String size, int numberOfCoffees) {
        this.type = type;
        this.size = size;
        this.numberOfCoffees = numberOfCoffees;
    }

    public CoffeeBuilder coffeeCups(float val){
        coffeeCups = val;
        return this;
    }

    public CoffeeBuilder coffeeTablespoons(int val){
        coffeeTablespoons = val;
        return this;
    }

    public CoffeeBuilder ouncesWater(float val){
        ouncesWater = val;
        return this;
    }

    public CoffeeBuilder ouncesMilk(float val){
        ouncesMilk = val;
        return this;
    }

    public CoffeeBuilder oucesLicor(float val){
        ouncesLicor = val;
        return this;
    }

    public CoffeeBuilder iceCubes(int val){
        iceCubes = val;
        return this;
    }

    public CoffeeBuilder cinnamon(Boolean val){
        cinnamon = val;
        return this;
    }

    public CoffeeBuilder skimmedMilk(Boolean val){
        skimmedMilk = val;
        return this;
    }

    public CoffeeBuilder sugar(Boolean val){
        sugar = val;
        return this;
    }

    public CoffeeBuilder splenda(Boolean val){
        splenda = val;
        return this;
    }

    public CoffeeBuilder cream(Boolean val){
        cream = val;
        return this;
    }

    @Override
    public CoffeeIngredients build() {
        CoffeeIngredients coffeeType = new CoffeeIngredients();
        coffeeType.setCinnamon(this.cinnamon);
        coffeeType.setCoffeeTablespoons(this.coffeeTablespoons);
        coffeeType.setCream(this.cream);
        coffeeType.setCoffeeCups(this.coffeeCups);
        coffeeType.setIceCubes(this.iceCubes);
        coffeeType.setOucesLicor(this.ouncesLicor);
        coffeeType.setOuncesMilk(this.ouncesMilk);
        coffeeType.setOuncesWater(this.ouncesWater);
        coffeeType.setSplenda(this.splenda);
        coffeeType.setSkimmedMilk(this.skimmedMilk);
        coffeeType.setSugar(this.sugar);
        coffeeType.setSize(size);
        coffeeType.setNumberOfCoffees(numberOfCoffees);
        coffeeType.setType(type);
        return coffeeType;
    }
}
