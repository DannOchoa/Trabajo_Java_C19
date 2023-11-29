package co.com.ps.b3;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
public class Actividad1 {

    public static void main(String[] args) {

        int val1=2000000000;
        long val3=2000000000000l;
        float val7=2000000000;
        double val2=3000000000000.000;
        char val4='a';
        byte val5=127;
        short val6=32000;
        boolean val8=true;


        //wrapers
        Integer w1=11;
        Long w2=200L;
        Float w3=5.876F;
        Double w=46457.84774D;
        Character w5='B';
        Byte w6=127;
        Short w7=32000;
        Boolean w8=false;
        String w9="Hola a todos";


        //Date fecha = new Date();
        Date fecha;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        fecha = cal.getTime();
        System.out.println(fecha);

    }
}
