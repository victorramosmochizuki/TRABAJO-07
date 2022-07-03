
package controller;

import java.io.Serializable;
import javax.inject.Named;

import javax.enterprise.context.SessionScoped;
import model.Message;
import services.Servicios;


@Named(value = "messageC")
@SessionScoped

public class MessageC implements Serializable {

    private Message model;
    private Servicios servicios;

    public MessageC() {
        model = new Message();
        servicios = new Servicios();
        
    }
    
    
    public void leer(){
        try {
            Servicios.escucha(model);
        } catch (Exception e) {
            System.out.println("Error en leer C" + e.getMessage());
        }
    
    }
    
    public Message getModel() {
        return model;
    }

    public void setModel(Message model) {
        this.model = model;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }
    
}
