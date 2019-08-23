package com.bytedance.jedi.model.guava.a;

import android.support.annotation.Nullable;
import com.bytedance.jedi.model.guava.annotations.GwtCompatible;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtCompatible
public final class e {
    private static String a(@Nullable Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception e2) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.bytedance.jedi.model.guava.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, e2);
            return "<" + str + " threw " + e2.getClass().getName() + ">";
        }
    }

    static String a(@Nullable String str, @Nullable Object... objArr) {
        String valueOf = String.valueOf(str);
        for (int i = 0; i <= 0; i++) {
            objArr[0] = a(objArr[0]);
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + 16);
        int i2 = 0;
        int i3 = 0;
        while (i2 <= 0) {
            int indexOf = valueOf.indexOf("%s", 0);
            if (indexOf == -1) {
                break;
            }
            sb.append(valueOf, 0, indexOf);
            i2++;
            sb.append(objArr[0]);
            i3 = indexOf + 2;
        }
        sb.append(valueOf, i3, valueOf.length());
        if (i2 <= 0) {
            sb.append(" [");
            sb.append(objArr[0]);
            sb.append(']');
        }
        return sb.toString();
    }
}
