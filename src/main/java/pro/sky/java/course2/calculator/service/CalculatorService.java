package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface {

    @Override
    public int plus(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public int minus(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public int multiple(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public double divide(Integer a, Integer b) {
        if (b == 0) throw new IllegalArgumentException("Неверное значение");
        return (double)a / b;
    }

    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }
}
