package task3;

public enum Animals {
    SNAKE(13), BIZZON(15), RAVEN(8),SEAL(20);

    int age;
    Animals(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String toString(Animals an) {
        System.out.println("Name of animal: " + an  + ", age: " + an.age);

        return null;
    }
}
