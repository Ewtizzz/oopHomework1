public class Flower {
    private String flowerName = "тип цветка не указан!";
    private String country = "Россия";
    private double cost = 1;
    int lifeSpan;

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        if (flowerName == null){
            this.flowerName = "белый";
        }else {
            this.flowerName = flowerName;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null){
            this.country = "Россия";
        }else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost <= 0){
            this.cost = 1;
        }else {
            this.cost = cost;
        }
    }


    public Flower(String flowerName, String country, double cost, int lifeSpan){
         if (flowerName == null){
             this.flowerName = "белый";
         }else {
             this.flowerName = flowerName;
         }
        if (country == null){
            this.country = "Россия";
        }else {
            this.country = country;
        }
        if (cost <= 0){
            this.cost = 1;
        }else {
            this.cost = cost;
        }
        if (lifeSpan <= 0){
            this.lifeSpan = 3;
        }else{
            this.lifeSpan = lifeSpan;
        }
    }
    public Flower(String flowerName,String country,double cost){
        this(flowerName, country, cost, 3);
    }

    @Override
    public String toString() {
        return "Название цветка: " + flowerName +
                ", страна: " + country +
                ", цена: " + cost +
                ", срок состояния: " + lifeSpan;
    }
}
