import java.lang.Math;
class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int soma = 0, numero = numberToCheck, digito;
        int numDigitos = String.valueOf(numero).length();

        while(numero > 0){
            digito = numero % 10;
            soma += Math.pow(digito, numDigitos);
            numero /= 10;
        }

        return numberToCheck == soma;
    }
}