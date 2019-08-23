package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public interface c<R, T> {

    public static abstract class a {
        @Nullable
        public abstract c<?, ?> a(Type type, Annotation[] annotationArr, n nVar);

        protected static Class<?> a(Type type) {
            return p.a(type);
        }

        protected static Type a(int i, ParameterizedType parameterizedType) {
            return p.a(0, parameterizedType);
        }
    }

    T a(b<R> bVar);

    Type a();
}
