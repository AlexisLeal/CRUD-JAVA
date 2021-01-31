/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import Controladores.ControllerAviones;
import Entity.Aviones;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author ALEXIS
 */
@FacesConverter(forClass=Aviones.class)
public class AvionesConverter implements Converter{
    //Preguntar al profe sobre dudas que como sabe java aplicarlo 

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        ControllerAviones controlleraviones = context.getApplication().evaluateExpressionGet(context, "#{controllerAviones}", ControllerAviones.class);
        return controlleraviones.find(Long.parseLong(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        Aviones aviones = (Aviones) value;
        return aviones.getId().toString();
    }
    
}
