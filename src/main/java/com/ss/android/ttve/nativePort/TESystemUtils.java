package com.ss.android.ttve.nativePort;

import android.support.annotation.Keep;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Keep
public class TESystemUtils {
    public static int getOutputLatency(int i) {
        try {
            Class<?> cls = Class.forName("android.media.AudioSystem");
            if (cls == null) {
                return 0;
            }
            Method declaredMethod = cls.getDeclaredMethod("getOutputLatency", new Class[]{Integer.TYPE});
            if (declaredMethod == null) {
                return 0;
            }
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(cls, new Object[]{Integer.valueOf(i)})).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }
}
