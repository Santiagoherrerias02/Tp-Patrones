package strategy;

import java.util.List;

public class ExamenExtra implements CalculoNota {
    @Override
    public double calcular(List<Integer> notas) {
        return (notas.stream().mapToInt(Integer::intValue).sum() + 10) / (double) notas.size();
    }
}