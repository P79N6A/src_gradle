package com.ss.android.ugc.aweme.utils;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;

public class StringJsonAdapterFactory implements TypeAdapterFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75457a;

    public static class a<T> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75459a;

        /* renamed from: b  reason: collision with root package name */
        private final Gson f75460b;

        /* renamed from: c  reason: collision with root package name */
        private final TypeToken<T> f75461c;

        public final T read(JsonReader jsonReader) throws IOException {
            if (PatchProxy.isSupport(new Object[]{jsonReader}, this, f75459a, false, 88595, new Class[]{JsonReader.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{jsonReader}, this, f75459a, false, 88595, new Class[]{JsonReader.class}, Object.class);
            }
            switch (jsonReader.peek()) {
                case NULL:
                    jsonReader.nextNull();
                    return null;
                case STRING:
                    return this.f75460b.fromJson(jsonReader.nextString(), this.f75461c.getType());
                default:
                    return this.f75460b.fromJson(jsonReader, this.f75461c.getType());
            }
        }

        public a(Gson gson, TypeToken<T> typeToken) {
            this.f75460b = gson;
            this.f75461c = typeToken;
        }

        public final void write(JsonWriter jsonWriter, T t) throws IOException {
            JsonWriter jsonWriter2 = jsonWriter;
            T t2 = t;
            if (PatchProxy.isSupport(new Object[]{jsonWriter2, t2}, this, f75459a, false, 88594, new Class[]{JsonWriter.class, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jsonWriter2, t2}, this, f75459a, false, 88594, new Class[]{JsonWriter.class, Object.class}, Void.TYPE);
                return;
            }
            jsonWriter2.value(this.f75460b.toJson((Object) t2));
        }
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Gson gson2 = gson;
        TypeToken<T> typeToken2 = typeToken;
        if (!PatchProxy.isSupport(new Object[]{gson2, typeToken2}, this, f75457a, false, 88593, new Class[]{Gson.class, TypeToken.class}, TypeAdapter.class)) {
            return new a(gson2, typeToken2);
        }
        return (TypeAdapter) PatchProxy.accessDispatch(new Object[]{gson2, typeToken2}, this, f75457a, false, 88593, new Class[]{Gson.class, TypeToken.class}, TypeAdapter.class);
    }
}
