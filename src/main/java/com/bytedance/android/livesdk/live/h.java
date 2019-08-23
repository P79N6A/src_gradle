package com.bytedance.android.livesdk.live;

import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.mime.TypedInput;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

public final /* synthetic */ class h implements Converter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15854a;

    /* renamed from: b  reason: collision with root package name */
    private final ProtoAdapter f15855b;

    h(ProtoAdapter protoAdapter) {
        this.f15855b = protoAdapter;
    }

    public final Object convert(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f15854a, false, 10286, new Class[]{Object.class}, Object.class)) {
            return (Message) this.f15855b.decode(((TypedInput) obj).in());
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f15854a, false, 10286, new Class[]{Object.class}, Object.class);
    }
}
