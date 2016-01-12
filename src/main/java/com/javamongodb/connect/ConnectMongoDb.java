package com.javamongodb.connect;

import javax.ws.rs.Path;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;


public class ConnectMongoDb {
	public void connectDatabases(){
		
		try{
			//to connect to mongodb server
			MongoClient mongoClient = new MongoClient("localhost",27017);
			//connect to the database
			MongoDatabase db = mongoClient.getDatabase("test");
			System.out.println("Connect to the database successfully");
			long count = db.getCollection("testcollection").count();
			System.out.print(count);
			
			/*boolean auth = db.authentication(myUsername, myPassword);
			System.out.println("Authentication"+auth);*/
			
			
		}catch(Exception e){
			System.err.println(e.getClass().getName() +"e : " + e.getMessage());
		}
	}
}
