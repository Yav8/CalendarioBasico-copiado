
/**
 * CalendarioBásico
 *
 * @autor (Javier de Cea Domínguez)
 * @version (31-10-2017)
 */
public class CalendarioBasico {
    // Recoge el día.
    private int dia;
    // Recoge el mes.
    private int mes;
    // Recoge el año.
    private int ano;

    /**
     * Inicializa objetos con la siguiente fecha: día 01, mes 01, año 01.
     */
    public CalendarioBasico() {
        dia = 1;
        mes = 1;
        ano = 1;
    }

    /**
     * Fija el día, mes y año que deseemos.
     */
    public void fijarFecha(int fijaDia, int fijaMes, int fijaAno) {
        dia = fijaDia;
        mes = fijaMes;
        ano = fijaAno;
    }

    /**
     * Avanza un día la fecha actual.
     * Si nos encontramos en el día 30 y avanzamos 1 día,
     * pasará a ser día 01 del mes siguiente.
     * Si estuviésemos en el día 30 y mes 12 y avanzáramos 1 día,
     * pasará a ser día 01 del mes 01 del año siguiente.
     * Si llegáramos al día 30, mes 12 y año 99 y avanzáramos 1 día,
     * pasaríamos al día 01, mes 01 y año 00.
     */
    public void avanzarFecha() {
        dia += 1;
        if(dia == 31) {
            dia = 1;
            mes += 1;
        }
        if(mes == 13) {
            mes = 1;
            ano += 1;
        }
        if(ano == 100) {
            ano = 0;
        }
    }

    /**
     * Permite indicarnos la fecha en la que nos encontramos actualmente,
     * separando día, mes y año con guiones.
     */
    public String obtenerFecha() {
        String fechaEntera;
        if(dia < 10) {
            fechaEntera = "0" + dia;
        }
        else {
            fechaEntera = "" + dia;
        }
        fechaEntera += "-";
        if(mes < 10) {
            fechaEntera += "0" + mes;
        }
        else {
            fechaEntera += "" + mes;
        }
        fechaEntera += "-";
        if(ano < 10) {
            fechaEntera += "0" + ano;
        }
        else {
            fechaEntera += "" + ano;
        }
        return fechaEntera;
    }
} 
