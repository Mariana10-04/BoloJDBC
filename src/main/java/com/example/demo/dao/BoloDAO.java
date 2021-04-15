package com.example.demo.dao;

import com.example.demo.factory.ConnectionFactory;
import com.example.demo.models.Bolo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoloDAO {
    private Connection connection;

    public BoloDAO(){
        this.connection= new ConnectionFactory().getConnection();
        this.createBoloTable();
    }

    public void createBoloTable(){
        String query= "create table if not exists Bolos (" +
                "id int not null auto_increment, " +
                "cobertura varchar(30), " +
                "recheio varchar (30)," +
                "cor varchar (20), primary key (id));";
        try{  //linha 24- pegar a strig (query) e enviar para o banco de dados mais ainda nao vai executar
            PreparedStatement statement = connection.prepareStatement(query);
            statement.execute();
            statement.close();
        }catch (SQLException exception){
            throw new RuntimeException(exception);
        }

    }
//farinha=obj bolo=tipo
    public void inserirBolo (Bolo Farinha){
        String query= "insert into Bolos (cobertura,recheio, cor) \n" +
                "values (?,?,?);";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,Farinha.getCobertuta());
            statement.setString(2,Farinha.getRecheio());
            statement.setString(3,Farinha.getCor());
            statement.execute();
            statement.close();
        }catch (SQLException exception){
            throw new RuntimeException(exception);
        }
    }
}

