package web.model;


public class Car {

    private int maxSpeed;

    private String nameModel;

    private String supportElectro;

    public Car() {
    }

    public Car(int maxSpeed, String nameModel, String supportElectro) {
        this.maxSpeed = maxSpeed;
        this.nameModel = nameModel;
        this.supportElectro = supportElectro;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", nameModel='" + nameModel + '\'' +
                ", supportElectro='" + supportElectro + '\'' +
                '}';
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public String getSupportElectro() {
        return supportElectro;
    }

    public void setSupportElectro(String supportElectro) {
        this.supportElectro = supportElectro;
    }
}