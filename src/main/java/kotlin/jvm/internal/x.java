package kotlin.jvm.internal;

import java.util.List;
import kotlin.SinceKotlin;
import kotlin.reflect.c;
import kotlin.reflect.i;
import kotlin.reflect.j;

public final class x {
    @SinceKotlin
    public static String a(q qVar) {
        String obj = qVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    @SinceKotlin
    public static i a(c cVar, List<j> list, boolean z) {
        return new y(cVar, list, z);
    }
}
