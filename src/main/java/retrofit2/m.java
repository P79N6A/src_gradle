package retrofit2;

import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class m<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Response f84318a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final T f84319b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final ResponseBody f84320c;

    public final int a() {
        return this.f84318a.code();
    }

    public final String b() {
        return this.f84318a.message();
    }

    public final Headers c() {
        return this.f84318a.headers();
    }

    public final boolean d() {
        return this.f84318a.isSuccessful();
    }

    public final String toString() {
        return this.f84318a.toString();
    }

    public static <T> m<T> a(@Nullable T t, Response response) {
        p.a(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new m<>(response, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    m(Response response, @Nullable T t, @Nullable ResponseBody responseBody) {
        this.f84318a = response;
        this.f84319b = t;
        this.f84320c = responseBody;
    }
}
