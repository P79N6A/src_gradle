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

public class PostConstructTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75448a;

    static class a<T> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75449a;

        /* renamed from: b  reason: collision with root package name */
        private final TypeAdapter<T> f75450b;

        a(TypeAdapter<T> typeAdapter) {
            this.f75450b = typeAdapter;
        }

        public final T read(JsonReader jsonReader) throws IOException {
            JsonReader jsonReader2 = jsonReader;
            if (!PatchProxy.isSupport(new Object[]{jsonReader2}, this, f75449a, false, 88487, new Class[]{JsonReader.class}, Object.class)) {
                return this.f75450b.read(jsonReader2);
            }
            return PatchProxy.accessDispatch(new Object[]{jsonReader2}, this, f75449a, false, 88487, new Class[]{JsonReader.class}, Object.class);
        }

        public final void write(JsonWriter jsonWriter, T t) throws IOException {
            JsonWriter jsonWriter2 = jsonWriter;
            T t2 = t;
            if (PatchProxy.isSupport(new Object[]{jsonWriter2, t2}, this, f75449a, false, 88486, new Class[]{JsonWriter.class, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jsonWriter2, t2}, this, f75449a, false, 88486, new Class[]{JsonWriter.class, Object.class}, Void.TYPE);
                return;
            }
            this.f75450b.write(jsonWriter2, t2);
        }
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Gson gson2 = gson;
        TypeToken<T> typeToken2 = typeToken;
        if (!PatchProxy.isSupport(new Object[]{gson2, typeToken2}, this, f75448a, false, 88485, new Class[]{Gson.class, TypeToken.class}, TypeAdapter.class)) {
            return new a(gson2.getDelegateAdapter(this, typeToken2));
        }
        return (TypeAdapter) PatchProxy.accessDispatch(new Object[]{gson2, typeToken2}, this, f75448a, false, 88485, new Class[]{Gson.class, TypeToken.class}, TypeAdapter.class);
    }
}
