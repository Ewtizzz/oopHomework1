public class person {
    final String NO_INFO = "информация не указана";
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. " + "Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }

    public person(int yearOfBirth, String name, String town, String jobTitle){
        if(yearOfBirth >= 0){
            this.yearOfBirth = yearOfBirth;
        }else {
            throw new IllegalArgumentException("год рождения не может быть отрицательным");
        }
        if(name == null || name.isEmpty()){
            this.name = NO_INFO;
        }else {
            this.name = name;
        }
        if(town == null || town.isEmpty()){
            this.town = NO_INFO;
        }else {
            this.town = town;
        }
        if(jobTitle == null || jobTitle.isEmpty()){
            this.jobTitle = NO_INFO;
        }else {
            this.jobTitle = jobTitle;
        }


    }
}
