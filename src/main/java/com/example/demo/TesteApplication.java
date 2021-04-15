package com.example.demo;

import com.example.demo.dao.BoloDAO;
import com.example.demo.factory.ConnectionFactory;
import com.example.demo.models.Bolo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class TesteApplication {
// (parametros)
	public static void main(String[] args) throws SQLException {
		//SpringApplication.run(TesteApplication.class, args);

		Bolo baunilha=new Bolo("chocolate","briga","rosa"); // criou um obj seguindo a clase
		Bolo cenoura=new Bolo("chocolate","briga","laranja");

		BoloDAO formiga=new BoloDAO(); //instanciado = criando um obj a partir de uma classe

		formiga.inserirBolo(baunilha);
		formiga.inserirBolo(cenoura);

		Connection c=new ConnectionFactory().getConnection();
		c.close();

	}

}
