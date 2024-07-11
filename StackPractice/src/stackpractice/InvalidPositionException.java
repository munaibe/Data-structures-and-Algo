/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackpractice;

/**
 *
 * @author munai
 */
public class InvalidPositionException extends RuntimeException {
    public InvalidPositionException(String err) {
    	super(err);
  	}

  	public InvalidPositionException() {

  	}
}
