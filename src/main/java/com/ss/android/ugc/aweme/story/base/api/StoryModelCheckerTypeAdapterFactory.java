package com.ss.android.ugc.aweme.story.base.api;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.c;
import java.io.IOException;

public final class StoryModelCheckerTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71914a;

    StoryModelCheckerTypeAdapterFactory() {
    }

    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (PatchProxy.isSupport(new Object[]{gson, typeToken}, this, f71914a, false, 82208, new Class[]{Gson.class, TypeToken.class}, TypeAdapter.class)) {
            return (TypeAdapter) PatchProxy.accessDispatch(new Object[]{gson, typeToken}, this, f71914a, false, 82208, new Class[]{Gson.class, TypeToken.class}, TypeAdapter.class);
        } else if (!c.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        } else {
            final TypeAdapter delegateAdapter = gson.getDelegateAdapter(this, typeToken);
            return new TypeAdapter<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71915a;

                public final T read(JsonReader jsonReader) throws IOException {
                    JsonReader jsonReader2 = jsonReader;
                    if (PatchProxy.isSupport(new Object[]{jsonReader2}, this, f71915a, false, 82210, new Class[]{JsonReader.class}, Object.class)) {
                        return PatchProxy.accessDispatch(new Object[]{jsonReader2}, this, f71915a, false, 82210, new Class[]{JsonReader.class}, Object.class);
                    } else if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    } else {
                        T t = (c) delegateAdapter.read(jsonReader2);
                        try {
                            t.checkValid();
                            return t;
                        } catch (JsonParseException e2) {
                            throw e2;
                        } catch (Throwable th) {
                            throw new JsonSyntaxException(th);
                        }
                    }
                }

                public final void write(JsonWriter jsonWriter, T t) throws IOException {
                    JsonWriter jsonWriter2 = jsonWriter;
                    T t2 = t;
                    if (PatchProxy.isSupport(new Object[]{jsonWriter2, t2}, this, f71915a, false, 82209, new Class[]{JsonWriter.class, Object.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{jsonWriter2, t2}, this, f71915a, false, 82209, new Class[]{JsonWriter.class, Object.class}, Void.TYPE);
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
