public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int minutes){
        int totalTime = expectedMinutesInOven();
        return totalTime - minutes;
    }
    public int preparationTimeInMinutes(int camadas){
        int timeCamadas = 2;
        return camadas * timeCamadas;
    }
    public int totalTimeInMinutes(int camadas, int minutos){
        int totalCamadas = preparationTimeInMinutes(camadas);
        return totalCamadas + minutos;
    }
}
