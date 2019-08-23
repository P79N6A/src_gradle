package retrofit2.b.a;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.e;
import retrofit2.n;

public final class a extends e.a {

    /* renamed from: a  reason: collision with root package name */
    private final Gson f84247a;

    private a(Gson gson) {
        this.f84247a = gson;
    }

    public static a a(Gson gson) {
        if (gson != null) {
            return new a(gson);
        }
        throw new NullPointerException("gson == null");
    }

    public final e<ResponseBody, ?> a(Type type, Annotation[] annotationArr, n nVar) {
        return new c(this.f84247a, this.f84247a.getAdapter(TypeToken.get(type)));
    }

    public final e<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, n nVar) {
        return new b(this.f84247a, this.f84247a.getAdapter(TypeToken.get(type)));
    }
}
