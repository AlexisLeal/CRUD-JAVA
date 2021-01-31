/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import Controladores.ControllerEstados;
import Entity.Estados;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author ALEXIS
 */
@FacesConverter(forClass=Estados.class)
public class EstadosConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        ControllerEstados controllerestados = context.getApplication().evaluateExpressionGet(context, "#{controllerEstados}", ControllerEstados.class);
        return controllerestados.find(Long.parseLong(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        Estados estados = (Estados) value;
        return estados.getId().toString();
    }
    
}
