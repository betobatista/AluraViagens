package alura.com.aluraviagens.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {

    public static final String LINGUA = "pt";
    public static final String PAIS = "br";
    public static final String STRING_TARGET = "R$";
    public static final String STRING_REPLACE = "R$ ";

    public static String formataMoeda(BigDecimal valor) {
        NumberFormat currencyInstance = DecimalFormat.getCurrencyInstance(
                new Locale(LINGUA, PAIS));
        return currencyInstance
                .format(valor)
                .replace(STRING_TARGET, STRING_REPLACE);
    }
}
