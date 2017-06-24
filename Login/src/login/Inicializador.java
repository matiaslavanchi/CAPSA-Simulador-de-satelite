/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author matt
 */
public class Inicializador {
    private Sensor [] sen = new Sensor[4];
    public Inicializador() {
        sen[0] =  new Sensor("Temperatura","12");
        sen[1] =  new Sensor("Bateria","12");
        sen[2] =  new Sensor("Velocidad","12");
        sen[3] =  new Sensor("Almacenamiento","12");
    }
    public  void getRead(){
         for (int i=0 ;i<4 ; i++){
           this.sen[i].getValor();
        }
    }
    
}
