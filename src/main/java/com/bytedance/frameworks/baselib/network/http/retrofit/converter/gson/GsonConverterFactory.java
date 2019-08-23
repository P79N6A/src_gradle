package com.bytedance.frameworks.baselib.network.http.retrofit.converter.gson;

import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public final class GsonConverterFactory extends Converter.Factory {
    private final Gson gson;

    public static GsonConverterFactory create() {
        return create(new Gson());
    }

    public static GsonConverterFactory create(Gson gson2) {
        return new GsonConverterFactory(gson2);
    }

    private GsonConverterFactory(Gson gson2) {
        if (gson2 != null) {
            this.gson = gson2;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    public final Converter<TypedInput, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new b(this.gson, this.gson.getAdapter(TypeToken.get(type)));
    }

    public final Converter<?, TypedOutput> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new a(this.gson, this.gson.getAdapter(TypeToken.get(type)));
    }
}
