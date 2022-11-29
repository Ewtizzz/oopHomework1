public class car {
    final String NO_INFO = "default";
    String mark;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public car(String mark,String model,double engineVolume,String color,int year,String country){
        this.mark = mark;
        if(model == null || model.isEmpty()){
            this.model = NO_INFO;
        }else{
            this.model = model;
        }
        if(engineVolume == 0){
            this.engineVolume = 1.5;
        }else{
            this.engineVolume = engineVolume;
        }
        if(color == null || color.isEmpty()){
            this.color = "белый";
        }else{
            this.color = color;
        }
        if(year == 0){
            this.year = 2000;
        }else{
            this.year = year;
        }
        this.country = country;
    }

    @Override
    public String toString() {
        return
                "Марка: " + mark +
                ", Модель: " + model +
                ", Ёмкость двигателя: " + engineVolume +
                ", Цвет: " + color +
                ", Год: " + year +
                ", Страна: " + country;
    }
}
