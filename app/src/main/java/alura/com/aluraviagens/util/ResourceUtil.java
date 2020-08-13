package alura.com.aluraviagens.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class ResourceUtil {

    public static final String DRAWABLE = "drawable";

    public static Drawable devolveDrawable(Context context, String recurso) {
        Resources resources = context.getResources();
        int drawable = resources.getIdentifier(recurso, DRAWABLE, context.getPackageName());
        return resources.getDrawable(drawable);
    }

}
