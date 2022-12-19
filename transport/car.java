package transport;

import java.time.LocalDate;

public class car {
    private final String mark;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String Transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int amountOfPlaces;
    private boolean typeOfTire;
    private Key key;
    private Insurance insurance;


    public car(String mark, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int amountOfPlaces, boolean typeOfTire, Key key,Insurance insurance) {
        this.mark = mark;
        if(model == null || model.isEmpty()){
            this.model = "информация не указана";
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
        if(country == null || country.isEmpty()){
            this.country = "Россия";
        }else{
            this.country = country;
        }
        this.bodyType = "седан";
        this.amountOfPlaces = 4;
        this.Transmission = "МКПП";
        this.registrationNumber = "x000xx000";
        this.typeOfTire = true;
        if(key == null){
            this.key = new Key();
        }else{
            this.key = key;
        }
        if(insurance == null){
            this.insurance = new Insurance();
        }else{
            this.insurance = insurance;
        }
    }

    public car(String mark, String model, Double engineVolume, String color, int year, String country){
        this(mark,model,engineVolume,color,year,country,"МКПП","x000xx000","седан",5,true,new Key(),new Insurance());
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return Transmission;
    }

    public void setTransmission(String transmission) {
        if(Transmission == null){
            this.Transmission = "МКПП";
        }else{
            this.Transmission = Transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if(registrationNumber == null){
            this.registrationNumber = "x000xx000";
        }else{
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean isTypeOfTire() {
        return typeOfTire;
    }

    public void setTypeOfTire(boolean typeOfTire) {
        this.typeOfTire = typeOfTire;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getAmountOfPlaces() {
        return amountOfPlaces;
    }
    public void changeTyresType(){
        typeOfTire = !typeOfTire;
    }
    public boolean isCorrectReg(){
        if(registrationNumber.length() != 9){
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if(Character.isAlphabetic(chars[0]) || Character.isAlphabetic(chars[4]) || Character.isAlphabetic(chars[5])){
            return false;
        }
        if(!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])){
            return false;
        }
        return true;
    }
    public static class Key{
        private final boolean remoteEngine;
        private final boolean keyAccess;

        public Key(boolean remoteEngine, boolean keyAccess) {
            this.remoteEngine = remoteEngine;
            this.keyAccess = keyAccess;
        }
        public Key() {
            this(false,false);
        }

        public boolean isRemoteEngine() {
            return remoteEngine;
        }

        public boolean isKeyAccess() {
            return keyAccess;
        }

    }
    public static class Insurance{
        private final LocalDate expiredDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expiredDate, double cost, String number) {
            if(expiredDate == null){
                this.expiredDate = LocalDate.now().plusDays(365);
            }else{
                this.expiredDate = expiredDate;
            }
            this.cost = cost;
            if(number == null){
                this.number = "012345678";
            }else{
                this.number = number;
            }
        }

        public Insurance(){
            this(null,10_000,null);
        }

        public LocalDate getExpiredDate() {
            return expiredDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
        public void checkExpiredDate(){
            if(expiredDate.isBefore(LocalDate.now()) || expiredDate.isEqual(LocalDate.now())){
                System.out.println("нужно оформлять новую страховку");
            }
        }
        public void checkNumber(){
            if(number.length()!=9){
                System.out.println("номер некорректный");
            }
        }
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
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
