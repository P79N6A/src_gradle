package com.bytedance.frameworks.baselib.network.http.retrofit.converter.gson;

import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public final class a<T> implements Converter<T, TypedOutput> {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f19863a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    private final Gson f19864b;

    /* renamed from: c  reason: collision with root package name */
    private final TypeAdapter<T> f19865c;

    public final /* synthetic */ Object convert(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        JsonWriter newJsonWriter = this.f19864b.newJsonWriter(new OutputStreamWriter(byteArrayOutputStream, f19863a));
        this.f19865c.write(newJsonWriter, obj);
        newJsonWriter.close();
        return new TypedByteArray("application/json; charset=UTF-8", byteArrayOutputStream.toByteArray(), new String[0]);
    }

    a(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f19864b = gson;
        this.f19865c = typeAdapter;
    }
}
