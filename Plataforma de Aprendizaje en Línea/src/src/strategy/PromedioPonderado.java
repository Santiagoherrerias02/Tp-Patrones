package strategy;

import java.util.List;

public class PromedioPonderado implements CalculoNota {
    @Override
    public double calcular(List<Integer> notas) {
        double total = 0;
        int peso = 1;
        for (int n : notas) total += n * peso++;
        return total / (notas.size() * (notas.size() + 1) / 2.0);
    }
}