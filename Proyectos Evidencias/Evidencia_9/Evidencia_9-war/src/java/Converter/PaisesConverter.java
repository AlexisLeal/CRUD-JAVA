/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import Controladores.ControllerPaises;
import Entity.Paises;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author ALEXIS
 */
@FacesConverter(forClass=Paises.class)
public class PaisesConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        ControllerPaises controllerpaises = context.getApplication().evaluateExpressionGet(context, "#{controllerPaises}", ControllerPaises.class);
        return controllerpaises.find(Long.parseLong(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
       Paises paises = (Paises) value;
       return paises.getId().toString();
    }
    
}
