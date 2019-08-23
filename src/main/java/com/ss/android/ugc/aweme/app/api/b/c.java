package com.ss.android.ugc.aweme.app.api.b;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.app.api.f;
import com.ss.android.ugc.aweme.framework.a.a;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import retrofit2.e;

public final class c implements e<ResponseBody, b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33801a;

    /* renamed from: b  reason: collision with root package name */
    private final Gson f33802b;

    /* renamed from: c  reason: collision with root package name */
    private final TypeAdapter<?> f33803c;

    /* renamed from: d  reason: collision with root package name */
    private final f f33804d;

    /* access modifiers changed from: private */
    public b a(ResponseBody responseBody) throws IOException {
        String str;
        if (PatchProxy.isSupport(new Object[]{responseBody}, this, f33801a, false, 23193, new Class[]{ResponseBody.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{responseBody}, this, f33801a, false, 23193, new Class[]{ResponseBody.class}, b.class);
        }
        MediaType contentType = responseBody.contentType();
        if (contentType != null) {
            str = contentType.toString();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) || !str.contains("json")) {
            return b.a(this.f33804d.a(responseBody));
        }
        a.a("ComposePbAndJson", "response json");
        try {
            return b.a(this.f33803c.read(this.f33802b.newJsonReader(responseBody.charStream())));
        } finally {
            responseBody.close();
        }
    }

    public c(ParameterizedType parameterizedType, Gson gson) {
        this.f33802b = gson;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        this.f33804d = new f(ProtoAdapter.get((Class) actualTypeArguments[0]));
        this.f33803c = gson.getAdapter(TypeToken.get(actualTypeArguments[1]));
    }
}
