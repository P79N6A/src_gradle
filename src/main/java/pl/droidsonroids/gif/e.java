package pl.droidsonroids.gif;

import android.annotation.SuppressLint;
import android.content.Context;

public final class e {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static Context f84209a;

    static Context a() {
        if (f84209a == null) {
            try {
                f84209a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e2) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e2);
            }
        }
        return f84209a;
    }
}
