/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepcoes;

/**
 *
 * @author a
 */
public class SinvalidoException extends Exception{
    public SinvalidoException() {
        super();
    }
    public SinvalidoException(String msg){
        super(msg);
    }    
}