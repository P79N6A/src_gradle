package com.ss.android.ugc.aweme.app.api;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33771a;

    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (PatchProxy.isSupport(new Object[]{gson, typeToken}, this, f33771a, false, 23042, new Class[]{Gson.class, TypeToken.class}, TypeAdapter.class)) {
            return (TypeAdapter) PatchProxy.accessDispatch(new Object[]{gson, typeToken}, this, f33771a, false, 23042, new Class[]{Gson.class, TypeToken.class}, TypeAdapter.class);
        } else if (!Collection.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        } else {
            final TypeAdapter delegateAdapter = gson.getDelegateAdapter(this, typeToken);
            return new TypeAdapter<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33772a;

                public final T read(JsonReader jsonReader) throws IOException {
                    JsonReader jsonReader2 = jsonReader;
                    if (PatchProxy.isSupport(new Object[]{jsonReader2}, this, f33772a, false, 23044, new Class[]{JsonReader.class}, Object.class)) {
                        return PatchProxy.accessDispatch(new Object[]{jsonReader2}, this, f33772a, false, 23044, new Class[]{JsonReader.class}, Object.class);
                    } else if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    } else {
                        T t = (Collection) delegateAdapter.read(jsonReader2);
                        if (t instanceof ArrayList) {
                            T t2 = (ArrayList) t;
                            for (int size = t2.size() - 1; size >= 0; size--) {
                                if (t2.get(size) == null) {
                                    t2.remove(size);
                                }
                            }
                            return t2;
                        }
                        Iterator it2 = t.iterator();
                        while (it2.hasNext()) {
                            if (it2.next() == null) {
                                it2.remove();
                            }
                        }
                        return t;
                    }
                }

                public final void write(JsonWriter jsonWriter, T t) throws IOException {
                    JsonWriter jsonWriter2 = jsonWriter;
                    T t2 = t;
                    if (PatchProxy.isSupport(new Object[]{jsonWriter2, t2}, this, f33772a, false, 23043, new Class[]{JsonWriter.class, Object.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{jsonWriter2, t2}, this, f33772a, false, 23043, new Class[]{JsonWriter.class, Object.class}, Void.TYPE);
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
