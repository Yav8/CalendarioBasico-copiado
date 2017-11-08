
/**
 * CalendarioBásico
 *
 * @autor (Javier de Cea Domínguez)
 * @version (31-10-2017)
 */
public class CalendarioBasico {
    // Recoge el día desde la clase DisplayDosCaracteres.
    private DisplayDosCaracteres dia;
    // Recoge el mes desde la clase DisplayDosCaracteres.
    private DisplayDosCaracteres mes;
    // Recoge el año desde la clase DisplayDosCaracteres.
    private DisplayDosCaracteres ano;

    /**
     * Inicializa objetos con la siguiente fecha: día 01, mes 01, año 01.
     */
    public CalendarioBasico() {
        dia = new DisplayDosCaracteres(31);
        mes = new DisplayDosCaracteres(13);
        ano = new DisplayDosCaracteres(100);
    }

    /**
     * Fija el día, mes y año que deseemos.
     */
    public void fijarFecha(int fijaDia, int fijaMes, int fijaAno) {
        dia.setValorAlmacenado(fijaDia);
        mes.setValorAlmacenado(fijaMes);
        ano.setValorAlmacenado(fijaAno);
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
        dia.incrementaValorAlmacenado();
        if(dia.getValorAlmacenado() == 1) {
            mes.incrementaValorAlmacenado();
        }
        if(mes.getValorAlmacenado() == 1) {
            ano.incrementaValorAlmacenado();
        }
        if(ano.getValorAlmacenado() == 0) {
            ano.incrementaValorAlmacenado();
        }
    }

    /**
     * Permite indicarnos la fecha en la que nos encontramos actualmente,
     * separando día, mes y año con guiones.
     */
    public String obtenerFecha() {
        String fechaTotal = "";
        if (dia.getValorAlmacenado() < 10) {
            fechaTotal += dia.getTextoDelDisplay();
        }
        else {
            fechaTotal += dia.getValorAlmacenado();
        }
        fechaTotal += "-";
        if (mes.getValorAlmacenado() < 10) {
            fechaTotal += mes.getTextoDelDisplay();
        }
        else {
            fechaTotal += mes.getValorAlmacenado();
        }
        fechaTotal += "-";
        if (ano.getValorAlmacenado() < 10) {
            fechaTotal += ano.getTextoDelDisplay();
        }
        else {
            fechaTotal += ano.getValorAlmacenado();
        }
        return fechaTotal;
    }
} 
