package util;

import br.com.alura.aluraviagens.model.Pacote;

public class DiasUtil {

    public static final String DIAS_PLURAL = " dias";
    public static final String DIA_SINGULAR = " dia";

    public static String formataDias(int qtdeDias) {
        String diasEmTexto = "";
        if (qtdeDias > 1) {
            diasEmTexto = qtdeDias + DIAS_PLURAL;
        } else {
            diasEmTexto = qtdeDias + DIA_SINGULAR;
        }
        return diasEmTexto;
    }
}
