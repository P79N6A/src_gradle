package com.ss.android.ugc.aweme.app.api;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import java.io.IOException;

public class BaseResponseObjectTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33767a;

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (PatchProxy.isSupport(new Object[]{gson, typeToken}, this, f33767a, false, 23039, new Class[]{Gson.class, TypeToken.class}, TypeAdapter.class)) {
            return (TypeAdapter) PatchProxy.accessDispatch(new Object[]{gson, typeToken}, this, f33767a, false, 23039, new Class[]{Gson.class, TypeToken.class}, TypeAdapter.class);
        } else if (!BaseResponse.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        } else {
            final TypeAdapter delegateAdapter = gson.getDelegateAdapter(this, typeToken);
            return new TypeAdapter<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33768a;

                public final T read(JsonReader jsonReader) throws IOException {
                    JsonReader jsonReader2 = jsonReader;
                    if (PatchProxy.isSupport(new Object[]{jsonReader2}, this, f33768a, false, 23041, new Class[]{JsonReader.class}, Object.class)) {
                        return PatchProxy.accessDispatch(new Object[]{jsonReader2}, this, f33768a, false, 23041, new Class[]{JsonReader.class}, Object.class);
                    } else if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    } else {
                        try {
                            T t = (BaseResponse) delegateAdapter.read(jsonReader2);
                            if (t.extra != null && t.extra.now > 0) {
                                p.f33869a = t.extra.now;
                            }
                            return t;
                        } catch (JsonParseException e2) {
                            if (e2.getCause() instanceof a) {
                                throw ((a) e2.getCause());
                            }
                            throw e2;
                        }
                    }
                }

                public final void write(JsonWriter jsonWriter, T t) throws IOException {
                    JsonWriter jsonWriter2 = jsonWriter;
                    T t2 = t;
                    if (PatchProxy.isSupport(new Object[]{jsonWriter2, t2}, this, f33768a, false, 23040, new Class[]{JsonWriter.class, Object.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{jsonWriter2, t2}, this, f33768a, false, 23040, new Class[]{JsonWriter.class, Object.class}, Void.TYPE);
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
