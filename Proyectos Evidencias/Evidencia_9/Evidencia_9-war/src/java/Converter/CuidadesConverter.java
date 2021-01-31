/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import Controladores.ControllerCuidades;
import Entity.Cuidades;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author ALEXIS
 */
@FacesConverter(forClass=Cuidades.class)
public class CuidadesConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
       ControllerCuidades controllercuidades = context.getApplication().evaluateExpressionGet(context, "#{controllerCuidades}", ControllerCuidades.class);
       return controllercuidades.find(Long.parseLong(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        Cuidades cuidades = (Cuidades) value;
        return cuidades.getId().toString();
    }
    
}
