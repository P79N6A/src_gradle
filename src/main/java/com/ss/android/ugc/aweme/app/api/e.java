package com.ss.android.ugc.aweme.app.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;

public final class e<T extends Message<T, ?>> implements retrofit2.e<T, RequestBody> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33827a;

    /* renamed from: b  reason: collision with root package name */
    private static final MediaType f33828b = MediaType.parse("application/x-protobuf");

    /* renamed from: c  reason: collision with root package name */
    private final ProtoAdapter<T> f33829c;

    e(ProtoAdapter<T> protoAdapter) {
        this.f33829c = protoAdapter;
    }

    public final /* synthetic */ Object a(Object obj) throws IOException {
        Message message = (Message) obj;
        if (PatchProxy.isSupport(new Object[]{message}, this, f33827a, false, 23064, new Class[]{Message.class}, RequestBody.class)) {
            return (RequestBody) PatchProxy.accessDispatch(new Object[]{message}, this, f33827a, false, 23064, new Class[]{Message.class}, RequestBody.class);
        }
        Buffer buffer = new Buffer();
        this.f33829c.encode((BufferedSink) buffer, message);
        return RequestBody.create(f33828b, buffer.snapshot());
    }
}
