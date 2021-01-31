/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import Controladores.ControllerVuelos;
import Entity.Vuelos;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author ALEXIS
 */
@FacesConverter(forClass=Vuelos.class)
/*
*simplemente anote el Convertidor con @FacesConverter para enganchar el tipo de objeto en cuestión, 
JSF se encargará automáticamente de la conversión cuando el tipo de Almacén aparezca en la imagen:
*/
public class VuelosConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
       ControllerVuelos controllervuelos = context.getApplication().evaluateExpressionGet(context, "#{controllerVuelos}", ControllerVuelos.class);
       //Checar en el vuelos CONTROLLER 
       return controllervuelos.find(Long.parseLong(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        Vuelos vuelo = (Vuelos) value;
        return vuelo.getId().toString();
    }
    
}
