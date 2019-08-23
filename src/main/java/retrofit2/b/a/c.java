package retrofit2.b.a;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.e;

public final class c<T> implements e<ResponseBody, T> {

    /* renamed from: a  reason: collision with root package name */
    private final Gson f84252a;

    /* renamed from: b  reason: collision with root package name */
    private final TypeAdapter<T> f84253b;

    /* access modifiers changed from: private */
    public T a(ResponseBody responseBody) throws IOException {
        try {
            return this.f84253b.read(this.f84252a.newJsonReader(responseBody.charStream()));
        } finally {
            responseBody.close();
        }
    }

    c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f84252a = gson;
        this.f84253b = typeAdapter;
    }
}
