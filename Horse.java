public class Horse extends Stable {
    String Name;
    Double Weight;
    Boolean isTame;

    public Horse (String horseName, Double horseWeight, Boolean tame){
        this.Name = horseName;
        this.Weight = horseWeight;
        this.isTame = tame;
    }
}
