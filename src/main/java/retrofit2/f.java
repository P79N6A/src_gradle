package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.c;

public final class f extends c.a {

    /* renamed from: a  reason: collision with root package name */
    static final c.a f84254a = new f();

    f() {
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr, n nVar) {
        if (a(type) != b.class) {
            return null;
        }
        final Type e2 = p.e(type);
        return new c<Object, b<?>>() {
            public final /* bridge */ /* synthetic */ Object a(b bVar) {
                return bVar;
            }

            public final Type a() {
                return e2;
            }
        };
    }
}
