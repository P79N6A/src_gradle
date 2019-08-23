package retrofit2.b.a;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.e;

public final class b<T> implements e<T, RequestBody> {

    /* renamed from: a  reason: collision with root package name */
    private static final MediaType f84248a = MediaType.parse("application/json; charset=UTF-8");

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f84249b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    private final Gson f84250c;

    /* renamed from: d  reason: collision with root package name */
    private final TypeAdapter<T> f84251d;

    public final /* synthetic */ Object a(Object obj) throws IOException {
        Buffer buffer = new Buffer();
        JsonWriter newJsonWriter = this.f84250c.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), f84249b));
        this.f84251d.write(newJsonWriter, obj);
        newJsonWriter.close();
        return RequestBody.create(f84248a, buffer.readByteString());
    }

    b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f84250c = gson;
        this.f84251d = typeAdapter;
    }
}
