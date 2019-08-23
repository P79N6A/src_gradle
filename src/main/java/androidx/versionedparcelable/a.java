package androidx.versionedparcelable;

import android.os.Parcelable;
import android.support.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class a {
    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(int i);

    /* access modifiers changed from: protected */
    public abstract void a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    public abstract void a(String str);

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr);

    /* access modifiers changed from: protected */
    public abstract a b();

    /* access modifiers changed from: protected */
    public abstract boolean b(int i);

    /* access modifiers changed from: protected */
    public abstract int c();

    /* access modifiers changed from: protected */
    public abstract void c(int i);

    /* access modifiers changed from: protected */
    public abstract String d();

    /* access modifiers changed from: protected */
    public abstract byte[] e();

    /* access modifiers changed from: protected */
    public abstract <T extends Parcelable> T f();

    public final void a(byte[] bArr, int i) {
        c(2);
        a(bArr);
    }

    public final void a(String str, int i) {
        c(7);
        a(str);
    }

    /* access modifiers changed from: protected */
    public final <T extends c> T g() {
        String d2 = d();
        if (d2 == null) {
            return null;
        }
        return a(d2, b());
    }

    private static <T extends c> Class c(T t) throws ClassNotFoundException {
        return a(t.getClass());
    }

    private static Class a(Class<? extends c> cls) throws ClassNotFoundException {
        return Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
    }

    private void b(c cVar) {
        try {
            a(a(cVar.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(c cVar) {
        if (cVar == null) {
            a((String) null);
            return;
        }
        b(cVar);
        a b2 = b();
        a((T) cVar, b2);
        b2.a();
    }

    public final void a(int i, int i2) {
        c(i2);
        a(i);
    }

    public final int b(int i, int i2) {
        if (!b(i2)) {
            return i;
        }
        return c();
    }

    public final <T extends Parcelable> T b(T t, int i) {
        if (!b(i)) {
            return t;
        }
        return f();
    }

    private static <T extends c> T a(String str, a aVar) {
        try {
            return (c) Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", new Class[]{a.class}).invoke(null, new Object[]{aVar});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    public final <T extends c> T b(T t, int i) {
        if (!b(1)) {
            return t;
        }
        return g();
    }

    private static <T extends c> void a(T t, a aVar) {
        try {
            c(t).getDeclaredMethod("write", new Class[]{t.getClass(), a.class}).invoke(null, new Object[]{t, aVar});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    public final String b(String str, int i) {
        if (!b(7)) {
            return str;
        }
        return d();
    }

    public final void a(Parcelable parcelable, int i) {
        c(i);
        a(parcelable);
    }

    public final byte[] b(byte[] bArr, int i) {
        if (!b(2)) {
            return bArr;
        }
        return e();
    }

    public final void a(c cVar, int i) {
        c(1);
        a(cVar);
    }
}
