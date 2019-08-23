package com.ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.mime.TypedInput;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;

public final class w<T extends Message<T, ?>> implements Converter<TypedInput, T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33912a;

    /* renamed from: b  reason: collision with root package name */
    private final ProtoAdapter<T> f33913b;

    public w(ProtoAdapter<T> protoAdapter) {
        this.f33913b = protoAdapter;
    }

    /* renamed from: a */
    public final T convert(TypedInput typedInput) throws IOException {
        if (PatchProxy.isSupport(new Object[]{typedInput}, this, f33912a, false, 23180, new Class[]{TypedInput.class}, Message.class)) {
            return (Message) PatchProxy.accessDispatch(new Object[]{typedInput}, this, f33912a, false, 23180, new Class[]{TypedInput.class}, Message.class);
        }
        try {
            return (Message) this.f33913b.decode(typedInput.in());
        } finally {
            typedInput.in().reset();
        }
    }
}
