package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.CommerceSaleMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

@Deprecated
public final class g extends c<CommerceSaleMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16624a;
    @SerializedName("has_commerce_sale")

    /* renamed from: b  reason: collision with root package name */
    public boolean f16625b;

    public final boolean canText() {
        return false;
    }

    public g() {
        this.type = a.COMMERCE_SALE_MESSAGE;
    }

    public final boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ c wrap(Message message) {
        CommerceSaleMessage commerceSaleMessage = (CommerceSaleMessage) message;
        if (PatchProxy.isSupport(new Object[]{commerceSaleMessage}, this, f16624a, false, 11025, new Class[]{CommerceSaleMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{commerceSaleMessage}, this, f16624a, false, 11025, new Class[]{CommerceSaleMessage.class}, c.class);
        }
        g gVar = new g();
        gVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(commerceSaleMessage.common);
        gVar.f16625b = ((Boolean) Wire.get(commerceSaleMessage.has_commerce_sale, Boolean.FALSE)).booleanValue();
        return gVar;
    }
}
