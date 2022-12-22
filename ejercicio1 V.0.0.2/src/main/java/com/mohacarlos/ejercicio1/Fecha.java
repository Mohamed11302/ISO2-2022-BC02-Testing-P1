package com.mohacarlos.ejercicio1;

public class Fecha {

    private int dia, mes, año;

    public Fecha(int dia, int mes, int año) throws ExcepcionFecha {
        this.setDia(dia);
        this.setAño(año);
        this.setMes(mes);
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
    
    public void setDia(int dia) throws ExcepcionFecha {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            throw new ExcepcionFecha(1);
        }
    }

    public void setMes(int mes) throws ExcepcionFecha {
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (this.dia == 31) {
                this.mes = mes;
            } else {
                throw new ExcepcionFecha(2);
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (this.dia == 30) {
                this.mes = mes;
            } else {
                throw new ExcepcionFecha(3);
            }
        } else if (mes == 02) {
            if ((this.año % 4 != 0 && this.dia == 28) || (this.año % 4 == 0 && this.dia == 29)) {
                this.mes = mes;
            } else if (this.año % 4 == 0) {
                throw new ExcepcionFecha(5);
            } else {
                throw new ExcepcionFecha(4);
            }
        } else {
            throw new ExcepcionFecha(6);
        }
    }

    public void setAño(int año) throws ExcepcionFecha {
        if (año >= 0) {
            this.año = año;
        } else {
            throw new ExcepcionFecha(7);
        }
    }
    
    public boolean determinarAñoBisiesto(){
        boolean visiesto;
        if((this.getAño() % 4 == 0 && this.getAño() % 100 != 0) || this.getAño() % 400 == 0){
            visiesto = true;
        }else{
            visiesto = false;
        }
        return visiesto;
    }
}
