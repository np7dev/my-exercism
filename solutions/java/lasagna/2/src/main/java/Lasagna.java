public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int minutes){
        int currentMinutes = 40;
        return currentMinutes - minutes;
    }
    public int preparationTimeInMinutes(int camadas){
        int timeCamadas = 2;
        return camadas * timeCamadas;
    }
    public int totalTimeInMinutes(int camadas, int minutos){
        return (camadas * 2) + minutos;
    }
}
