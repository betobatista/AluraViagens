package util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import br.com.alura.aluraviagens.model.Pacote;

public class ResourceUtil {

    public static final String DRAWABLE = "drawable";

    public static Drawable devolveDrawable(Context context, String recurso) {
        Resources resources = context.getResources();
        int drawable = resources.getIdentifier(recurso, DRAWABLE, context.getPackageName());
        return resources.getDrawable(drawable);
    }

}
