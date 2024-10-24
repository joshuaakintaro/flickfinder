package com.flickfinder.controller;

import java.sql.SQLException;

import com.flickfinder.dao.PersonDAO;
import com.flickfinder.model.Person;

import io.javalin.http.Context;

public class PersonController {

	private final PersonDAO personDAO;

	/**
	 * Constructs a MovieController object and initializes the movieDAO.
	 */
	public PersonController(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	/**
	 * Returns a list of all movies in the database.
	 * 
	 * @param ctx the Javalin context
	 */
	public void getAllPeople(Context ctx) {
		try {
			ctx.json(personDAO.getAllPeople());
		} catch (SQLException e) {
			ctx.status(500);
			ctx.result("Database error");
			e.printStackTrace();
		}
	}

	/**
	 * Returns the movie with the specified id.
	 * 
	 * @param ctx the Javalin context
	 */
	public void getPersonById(Context ctx) {

		int id = Integer.parseInt(ctx.pathParam("id"));
		try {
			Person person = personDAO.getPersonById(id);
			if (person == null) {
				ctx.status(404);
				ctx.result("Person not found");
				return;
			}
			ctx.json(personDAO.getPersonById(id));
		} catch (SQLException e) {
			ctx.status(500);
			ctx.result("Database error");
			e.printStackTrace();
		}
	}
	// to complete the must-have requirements you need to add the following methods:
	// getAllPeople
	// getPersonById
	// you will add further methods for the more advanced tasks; however, ensure your have completed 
	// the must have requirements before you start these.  

}