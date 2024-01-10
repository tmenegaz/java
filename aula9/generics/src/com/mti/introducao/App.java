package com.mti.introducao;
import java.util.ArrayList;

import com.mti.modelo.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("Tiago", 25000);
        Cliente cliente2 = new Cliente("Stela", 25999);

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        var totalFaturamento = 0d;

        for (Cliente cliente : clientes) {
            totalFaturamento += cliente.getFaturamento();            
        }
        
        System.out.println(totalFaturamento);
    }
}
