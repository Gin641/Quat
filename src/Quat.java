public class Quat {
    int Slow = 1;
    int Medium = 2;
    int fast = 3;
    int speed = Slow;
    boolean on = false;
    double radius = 5;
    String color = "blue";
    public int setSpeed(int newSp){
        this.speed = newSp;
        return this.speed;
    }
    public boolean setOn(boolean status){
        this.on = status;
        return this.on;
    }
    public double setRasius(int newRa){
        this.radius = newRa;
        return this.radius;
    }
    public String setColor(String newCL){
        this.color = newCL;
        return this.color;
    }
    public String toString(){
        String feedback = "";
        feedback += "Quạt, speed: " + this.speed + " ,Color: " + this.color + " ,Radius: " + this.radius;
        if (this.on){
            feedback += " Quạt bật";
        }else {
            feedback += " Quạt tắt";
        }
        return feedback;
    }

    public static void main(String[] args) {
        Quat fan = new Quat();
        fan.setColor("black");
        fan.setSpeed(fan.fast);
        fan.setRasius(10);
        fan.setOn(true);
        Quat quat = new Quat();
        quat.setColor("white");
        quat.setSpeed(fan.Medium);
        quat.setRasius(5);
        quat.setOn(false);
        System.out.println(fan.toString());
        System.out.println(quat.toString());
    }
}
