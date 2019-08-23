package com.bytedance.android.livesdk.message.model;

import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.message.proto.LiveShoppingMessage;
import com.bytedance.android.livesdkapi.d.h;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public final class ao extends c<LiveShoppingMessage> implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16472a;
    @SerializedName("promotion_id")

    /* renamed from: b  reason: collision with root package name */
    long f16473b;
    @SerializedName("msg_type")

    /* renamed from: c  reason: collision with root package name */
    LiveShoppingMessage.MsgType f16474c;

    public ao() {
        this.type = a.LIVE_SHOPPING;
    }

    public final long b() {
        try {
            return this.f16473b;
        } catch (Exception unused) {
            return 0;
        }
    }

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f16472a, false, 11065, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f16472a, false, 11065, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            return this.f16474c.getValue();
        } catch (Exception unused) {
            return LiveShoppingMessage.MsgType.HAS_PROMOTIONS.getValue();
        }
    }

    @NonNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f16472a, false, 11067, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f16472a, false, 11067, new Class[0], String.class);
        }
        return "msgType:" + a();
    }

    public final /* synthetic */ c wrap(Message message) {
        LiveShoppingMessage liveShoppingMessage = (LiveShoppingMessage) message;
        if (PatchProxy.isSupport(new Object[]{liveShoppingMessage}, this, f16472a, false, 11066, new Class[]{LiveShoppingMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{liveShoppingMessage}, this, f16472a, false, 11066, new Class[]{LiveShoppingMessage.class}, c.class);
        }
        ao aoVar = new ao();
        aoVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(liveShoppingMessage.common);
        aoVar.f16474c = (LiveShoppingMessage.MsgType) Wire.get(liveShoppingMessage.msg_type, LiveShoppingMessage.MsgType.HAS_PROMOTIONS);
        aoVar.f16473b = ((Long) Wire.get(liveShoppingMessage.promotion_id, 0L)).longValue();
        return aoVar;
    }
}
