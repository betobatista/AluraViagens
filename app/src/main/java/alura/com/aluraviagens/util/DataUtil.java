package alura.com.aluraviagens.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtil {

    public static final String DIA_MES = "dd/MM";

    public static String periodoEmTexto(int dias) {
        Calendar dataIda = Calendar.getInstance();
        Calendar dataVolta = Calendar.getInstance();
        dataVolta.add(Calendar.DATE, dias);
        SimpleDateFormat formatoData = new SimpleDateFormat(DIA_MES);
        String dataFormataIda = formatoData.format(dataIda.getTime());
        String dataFormataVolta = formatoData.format(dataVolta.getTime());
        return dataFormataIda + " - " + dataFormataVolta + " de " + dataVolta.get(Calendar.YEAR);
    }
}
