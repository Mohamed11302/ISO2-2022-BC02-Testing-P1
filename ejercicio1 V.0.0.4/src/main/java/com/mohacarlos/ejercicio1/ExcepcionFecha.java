package com.mohacarlos.ejercicio1;

public class ExcepcionFecha extends Exception{
    
    private int codigoError;
     
    public ExcepcionFecha(int codigoError){
        this.codigoError=codigoError;
    }
     
    @Override
    public String getMessage(){
         
        String mensaje="";
        switch(codigoError){
            case 1:
                mensaje="Error, el valor del dia debe estar entre 1 y 31";
                break;
            case 2:
                mensaje="Error, los dias de este mes deben ser 31";
                break;
            case 3:
                mensaje="Error, los dias de este mes deben ser 30";
                break;
            case 4:
                mensaje="Error, los dias de este mes deben ser 28";
                break;
            case 5:
                mensaje="Error, los dias de este mes deben ser 29";
                break;
            case 6:
                mensaje="Error, el valor del mes debe estar entre 1 y 12";
                break;
            case 7:
                mensaje="Error, el valor del año debe ser un numero positivo";
                break;
            default:
            	mensaje="Error, fecha mal introducida";
            	break;
        }
         
        return mensaje;
         
    }
     
}