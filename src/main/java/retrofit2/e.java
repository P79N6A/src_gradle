package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

public interface e<F, T> {

    public static abstract class a {
        @Nullable
        public e<ResponseBody, ?> a(Type type, Annotation[] annotationArr, n nVar) {
            return null;
        }

        @Nullable
        public e<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, n nVar) {
            return null;
        }
    }

    T a(F f2) throws IOException;
}
