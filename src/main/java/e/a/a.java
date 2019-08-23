package e.a;

import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static volatile C0879a[] f83087a = f83089c;

    /* renamed from: b  reason: collision with root package name */
    public static final C0879a f83088b = new C0879a() {
        /* access modifiers changed from: protected */
        public final void a() {
            throw new AssertionError("Missing override for log method.");
        }

        public final void a(String str, Object... objArr) {
            for (C0879a a2 : a.f83087a) {
                a2.a(str, objArr);
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private static final C0879a[] f83089c = new C0879a[0];

    /* renamed from: d  reason: collision with root package name */
    private static final List<C0879a> f83090d = new ArrayList();

    /* renamed from: e.a.a$a  reason: collision with other inner class name */
    public static abstract class C0879a {

        /* renamed from: a  reason: collision with root package name */
        final ThreadLocal<String> f83091a = new ThreadLocal<>();

        /* access modifiers changed from: protected */
        public abstract void a();

        public void a(String str, Object... objArr) {
            if (this.f83091a.get() != null) {
                this.f83091a.remove();
            }
            if (str != null && str.length() == 0) {
                str = null;
            }
            if (str != null) {
                if (objArr != null && objArr.length > 0) {
                    String.format(str, objArr);
                }
                a();
            }
        }
    }
}
