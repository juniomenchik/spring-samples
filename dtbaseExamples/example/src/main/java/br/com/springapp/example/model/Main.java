package br.com.springapp.example.model;

import br.com.springapp.example.model.exampleOnetoMany.Carro;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {

        Carro carro = new Carro("fiat uno");
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(carro);
        System.out.println(json);
    }
}
