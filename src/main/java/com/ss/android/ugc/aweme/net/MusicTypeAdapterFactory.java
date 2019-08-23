package com.ss.android.ugc.aweme.net;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.dr;
import java.io.IOException;

public class MusicTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56811a;

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (PatchProxy.isSupport(new Object[]{gson, typeToken}, this, f56811a, false, 60751, new Class[]{Gson.class, TypeToken.class}, TypeAdapter.class)) {
            return (TypeAdapter) PatchProxy.accessDispatch(new Object[]{gson, typeToken}, this, f56811a, false, 60751, new Class[]{Gson.class, TypeToken.class}, TypeAdapter.class);
        } else if (!Music.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        } else {
            final TypeAdapter delegateAdapter = gson.getDelegateAdapter(this, typeToken);
            return new TypeAdapter<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56812a;

                public final T read(JsonReader jsonReader) throws IOException {
                    JsonReader jsonReader2 = jsonReader;
                    if (PatchProxy.isSupport(new Object[]{jsonReader2}, this, f56812a, false, 60753, new Class[]{JsonReader.class}, Object.class)) {
                        return PatchProxy.accessDispatch(new Object[]{jsonReader2}, this, f56812a, false, 60753, new Class[]{JsonReader.class}, Object.class);
                    } else if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    } else {
                        T t = (Music) delegateAdapter.read(jsonReader2);
                        dr.a().a(t.getOwnerId(), t.getSecUid());
                        return t;
                    }
                }

                public final void write(JsonWriter jsonWriter, T t) throws IOException {
                    JsonWriter jsonWriter2 = jsonWriter;
                    T t2 = t;
                    if (PatchProxy.isSupport(new Object[]{jsonWriter2, t2}, this, f56812a, false, 60752, new Class[]{JsonWriter.class, Object.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{jsonWriter2, t2}, this, f56812a, false, 60752, new Class[]{JsonWriter.class, Object.class}, Void.TYPE);
                    } else if (t2 == null) {
                        jsonWriter.nullValue();
                    } else {
                        delegateAdapter.write(jsonWriter2, t2);
                    }
                }
            };
        }
    }
}
