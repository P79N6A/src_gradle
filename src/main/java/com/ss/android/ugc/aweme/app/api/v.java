package com.ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import okhttp3.MediaType;
import okio.Buffer;
import okio.BufferedSink;

public final class v<T extends Message<T, ?>> implements Converter<T, TypedOutput> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33909a;

    /* renamed from: b  reason: collision with root package name */
    private static final MediaType f33910b = MediaType.parse("application/x-protobuf");

    /* renamed from: c  reason: collision with root package name */
    private final ProtoAdapter<T> f33911c;

    v(ProtoAdapter<T> protoAdapter) {
        this.f33911c = protoAdapter;
    }

    public final /* synthetic */ Object convert(Object obj) throws IOException {
        Message message = (Message) obj;
        if (PatchProxy.isSupport(new Object[]{message}, this, f33909a, false, 23179, new Class[]{Message.class}, TypedOutput.class)) {
            return (TypedOutput) PatchProxy.accessDispatch(new Object[]{message}, this, f33909a, false, 23179, new Class[]{Message.class}, TypedOutput.class);
        }
        Buffer buffer = new Buffer();
        this.f33911c.encode((BufferedSink) buffer, message);
        return new TypedByteArray(f33910b.type(), buffer.readByteArray(), new String[0]);
    }
}
