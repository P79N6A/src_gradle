package com.bytedance.frameworks.baselib.network.http.retrofit.converter.gson;

import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.InputStreamReader;

public final class b<T> implements Converter<TypedInput, T> {

    /* renamed from: a  reason: collision with root package name */
    private final Gson f19866a;

    /* renamed from: b  reason: collision with root package name */
    private final TypeAdapter<T> f19867b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public T convert(TypedInput typedInput) throws IOException {
        String str = "UTF-8";
        if (typedInput.mimeType() != null) {
            str = c.a(typedInput.mimeType(), str);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput.in(), str);
        try {
            return this.f19867b.read(this.f19866a.newJsonReader(inputStreamReader));
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f19866a = gson;
        this.f19867b = typeAdapter;
    }
}
