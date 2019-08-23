package com.ss.android.ugc.aweme.app.api.b;

import android.text.TextUtils;
import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.app.api.w;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class a implements Converter<TypedInput, b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33793a;

    /* renamed from: b  reason: collision with root package name */
    private final Gson f33794b;

    /* renamed from: c  reason: collision with root package name */
    private final TypeAdapter<?> f33795c;

    /* renamed from: d  reason: collision with root package name */
    private final w f33796d;

    private b a(TypedInput typedInput) throws IOException {
        if (PatchProxy.isSupport(new Object[]{typedInput}, this, f33793a, false, 23189, new Class[]{TypedInput.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{typedInput}, this, f33793a, false, 23189, new Class[]{TypedInput.class}, b.class);
        }
        String str = "UTF-8";
        if (typedInput.mimeType() != null) {
            str = c.a(typedInput.mimeType(), str);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput.in(), str);
        try {
            return b.a(this.f33795c.read(this.f33794b.newJsonReader(inputStreamReader)));
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    public final /* synthetic */ Object convert(Object obj) throws IOException {
        TypedInput typedInput = (TypedInput) obj;
        if (PatchProxy.isSupport(new Object[]{typedInput}, this, f33793a, false, 23188, new Class[]{TypedInput.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{typedInput}, this, f33793a, false, 23188, new Class[]{TypedInput.class}, b.class);
        }
        String mimeType = typedInput.mimeType();
        if (TextUtils.isEmpty(mimeType) || !mimeType.contains("json")) {
            return b.a(this.f33796d.convert(typedInput));
        }
        com.ss.android.ugc.aweme.framework.a.a.a("ComposePbAndJson", "response json");
        return a(typedInput);
    }

    public a(ParameterizedType parameterizedType, Gson gson) {
        this.f33794b = gson;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        this.f33796d = new w(ProtoAdapter.get((Class) actualTypeArguments[0]));
        this.f33795c = gson.getAdapter(TypeToken.get(actualTypeArguments[1]));
    }
}
