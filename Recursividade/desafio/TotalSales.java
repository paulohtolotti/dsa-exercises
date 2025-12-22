package Recursividade.desafio;

import java.util.Arrays;
import java.util.List;

public class TotalSales {

    /**
     * Método que calcula a quantidade de vendas e a quantia vendida de um dado departamento
     * em uma lista.
     * Usa uma função auxiliar com recursividade de cauda.
     * @param sales - Lista com registros de vendas
     * @param department - Nome do departamento
     * @return array com a quantidade de vendas na posição 0 e o total vendido na posição 1
     */
    public static double[] totalSales(List<String> sales, String department) {

        double[] salesSummary = new double[2];

        if(sales.size() == 0) return salesSummary;

        return tailTotalSales(sales, department, salesSummary);
    }

    /**
     * Função auxiliar com recursividade de cauda.
     * Recupera a cabeça da lista e instancia um departamento com ela.
     * 
     * @param sales - Lista de departamentos. É atualizada a cada chamada para a cauda da lista atual.
     * @param department - String com o nome do departamento.
     * @param salesSummary - Array com o resumo das vendas. Posição 0 quantidade de vendas e posição 1 total de vendas.
     * @return
     */
    public static double[] tailTotalSales(List<String> sales, String department, double[] salesSummary) {

        if(sales.size() == 0) return salesSummary;

        String head = sales.get(0);

        Department d = new Department(head);

        if(d.getName().equals(department)) {
            salesSummary[0]++;
            salesSummary[1] += d.getPrice();
        }

        List<String> tail = sales.subList(1, sales.size());

        return tailTotalSales(tail, department, salesSummary);

    }

    public static void main(String[] args) {
        List<String> sales = Arrays.asList("8349,14/09/2024,899.9,ESPORTE",
            "4837,17/09/2024,530.0,VESTUARIO",
            "15281,21/09/2024,1253.99,ESPORTE",
            "15344,27/09/2024,1000.9,VESTUARIO",
            "18317,04/10/2024,250.4,VESTUARIO",
            "18972,11/10/2024,385.5,JARDINAGEM");
        
        double[] salesSummary = totalSales(sales, "VESTUARIO");

        System.out.printf("%.2f VENDAS\nTOTAL = $ %.2f", salesSummary[0], salesSummary[1]);
    }
}
