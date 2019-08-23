package com.ss.android.ugc.aweme.app.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.e;

public final class f<T extends Message<T, ?>> implements e<ResponseBody, T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33830a;

    /* renamed from: b  reason: collision with root package name */
    private final ProtoAdapter<T> f33831b;

    public f(ProtoAdapter<T> protoAdapter) {
        this.f33831b = protoAdapter;
    }

    public final T a(ResponseBody responseBody) throws IOException {
        if (PatchProxy.isSupport(new Object[]{responseBody}, this, f33830a, false, 23065, new Class[]{ResponseBody.class}, Message.class)) {
            return (Message) PatchProxy.accessDispatch(new Object[]{responseBody}, this, f33830a, false, 23065, new Class[]{ResponseBody.class}, Message.class);
        }
        try {
            return (Message) this.f33831b.decode(responseBody.source());
        } finally {
            responseBody.close();
        }
    }
}
