package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.DouplusMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public final class t extends c<DouplusMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16682a;
    @SerializedName("promotion")

    /* renamed from: b  reason: collision with root package name */
    public long f16683b;

    public t() {
        this.type = a.DOU_PLUS_MESSAGE;
    }

    public final /* synthetic */ c wrap(Message message) {
        DouplusMessage douplusMessage = (DouplusMessage) message;
        if (PatchProxy.isSupport(new Object[]{douplusMessage}, this, f16682a, false, 11040, new Class[]{DouplusMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{douplusMessage}, this, f16682a, false, 11040, new Class[]{DouplusMessage.class}, c.class);
        }
        t tVar = new t();
        tVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(douplusMessage.common);
        tVar.f16683b = ((Long) Wire.get(douplusMessage.promotion, 0L)).longValue();
        return tVar;
    }
}
