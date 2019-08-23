package com.ss.android.ugc.aweme.common;

import android.support.annotation.NonNull;
import com.bytedance.common.utility.reflect.Reflect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Constructor;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40276a;

    @NonNull
    public static <T> T a(@NonNull String str, @NonNull Class cls) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, cls}, null, f40276a, true, 33325, new Class[]{String.class, Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str2, cls}, null, f40276a, true, 33325, new Class[]{String.class, Class.class}, Object.class);
        }
        T t = null;
        try {
            t = Reflect.on(str).create().get();
        } catch (Throwable unused) {
        }
        if (t == null) {
            Constructor[] declaredConstructors = cls.getDeclaredConstructors();
            int length = declaredConstructors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Constructor constructor = declaredConstructors[i];
                try {
                    constructor.setAccessible(true);
                    t = constructor.newInstance(new Object[0]);
                    break;
                } catch (Throwable unused2) {
                    i++;
                }
            }
        }
        if (t != null) {
            return t;
        }
        throw new RuntimeException("cannot find service in " + str2 + "  or cannot create service through " + cls.getSimpleName());
    }
}
