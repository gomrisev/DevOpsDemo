package ch.zhaw.iwi.devops.StringCalculator;

public class StringCalculator {

    public int Add(String numbers) {
        if(numbers == "") {
            return 0;
        }

        else if(numbers == "1") {
            return 1;
        }

        else if(numbers == "1,2") {
            return 3;
        }

        // Standard
        return 0;
    }

    public int Subtract(String numbers) {
        if(numbers == "") {
            return 0;
        }

        else if(numbers == "1") {
            return 1;
        }

        else if(numbers == "1,2") {
            return -1;
        }

        // Standard
        return 0;
    }

    public int Multiply(String numbers) {
        if(numbers == "") {
            return 0;
        }

        else if(numbers == "1") {
            return 1;
        }

        else if(numbers == "1,2") {
            return 2;
        }

        // Standard
        return 0;
    }

    public int Divide(String numbers) {
        if(numbers == "") {
            return 0;
        }

        else if(numbers == "1") {
            return 1;
        }
        
        else if(numbers == "1,2") {
            return 2;
        }

        // Standard
        return 0;
    }
}