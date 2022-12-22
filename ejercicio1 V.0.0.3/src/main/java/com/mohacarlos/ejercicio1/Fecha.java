package com.mohacarlos.ejercicio1;

public class Fecha {

    private int dia, mes, año;

    public Fecha(int dia, int mes, int año) throws ExcepcionFecha {
        this.setDia(dia,mes);
        this.setMes(mes);
        this.setAño(año);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setDia(int dia,int mes) throws ExcepcionFecha {
        if (dia >= 1 && dia <= 31) {
            if (mes == 2 && dia > 29){
                throw new ExcepcionFecha(4);
            }else{
                this.dia = dia;
            }
        } else {
            throw new ExcepcionFecha(1);
        }
    }

    public void setMes(int mes) throws ExcepcionFecha {
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (this.dia == 31) {
                throw new ExcepcionFecha(3);
            }
        }
        this.mes = mes;
    }

    public void setAño(int año) throws ExcepcionFecha {
        if (año >= 0) {
            this.año = año;
        } else {
            throw new ExcepcionFecha(7);
        }
    }

    public boolean determinarAñoBisiesto() {
        boolean visiesto;
        if ((this.getAño() % 4 == 0 && this.getAño() % 100 != 0) || this.getAño() % 400 == 0) {
            visiesto = true;
        } else {
            visiesto = false;
        }
        return visiesto;
    }
}
