public class person {
    private int yearOfBirth;
    String name;
    String town;
    private String jobTitle;

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. " + "Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if(yearOfBirth >= 0){
            this.yearOfBirth = yearOfBirth;
        }else if(yearOfBirth < 0){
            this.yearOfBirth = 0;
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle == null || jobTitle.isEmpty()){
            this.jobTitle = "Информация не указана";
        }else {
            this.jobTitle = jobTitle;
        }
    }

    public person(int yearOfBirth, String name, String town, String jobTitle){
        if(yearOfBirth >= 0){
            this.yearOfBirth = yearOfBirth;
        }else {
            throw new IllegalArgumentException("год рождения не может быть отрицательным");
        }
        if(name == null || name.isEmpty()){
            this.name = "Информация не указана";
        }else {
            this.name = name;
        }
        if(town == null || town.isEmpty()){
            this.town = "Информация не указана";
        }else {
            this.town = town;
        }
        if(jobTitle == null || jobTitle.isEmpty()){
            this.jobTitle = "Информация не указана";
        }else {
            this.jobTitle = jobTitle;
        }


    }
    public person(int yearOfBirth, String name, String town){
        this(yearOfBirth,name,town,"Информация не указана");


    }
}
