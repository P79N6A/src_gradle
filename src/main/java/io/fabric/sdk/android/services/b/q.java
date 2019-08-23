package io.fabric.sdk.android.services.b;

import android.content.Context;
import java.lang.reflect.Method;

public final class q implements p {

    /* renamed from: a  reason: collision with root package name */
    private final Method f83191a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f83192b;

    public final boolean a() {
        try {
            return ((Boolean) this.f83191a.invoke(this.f83192b, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static p a(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.google.firebase.FirebaseApp");
            return new q(loadClass, loadClass.getDeclaredMethod("getInstance", new Class[0]).invoke(loadClass, new Object[0]));
        } catch (ClassNotFoundException | Exception unused) {
            return null;
        } catch (NoSuchMethodException e2) {
            new StringBuilder("Could not find method: ").append(e2.getMessage());
            return null;
        }
    }

    private q(Class cls, Object obj) throws NoSuchMethodException {
        this.f83192b = obj;
        this.f83191a = cls.getDeclaredMethod("isDataCollectionDefaultEnabled", new Class[0]);
    }
}
