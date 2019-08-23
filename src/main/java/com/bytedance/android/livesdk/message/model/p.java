package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.message.proto.DiggMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;
import com.ss.android.ugc.aweme.C0906R;

public final class p extends c<DiggMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16664a;
    @SerializedName("digg_count")

    /* renamed from: b  reason: collision with root package name */
    public int f16665b;
    @SerializedName("duration")

    /* renamed from: c  reason: collision with root package name */
    public int f16666c;
    @SerializedName("color")

    /* renamed from: d  reason: collision with root package name */
    public int f16667d;
    @SerializedName("user")

    /* renamed from: e  reason: collision with root package name */
    public User f16668e;
    @SerializedName("icon")

    /* renamed from: f  reason: collision with root package name */
    public String f16669f;

    public p() {
        this.type = a.DIGG;
    }

    public final boolean canText() {
        if (this.f16668e != null) {
            return true;
        }
        return false;
    }

    public final boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f16664a, false, 11034, new Class[0], String.class)) {
            return TTLiveSDKContext.getHostService().a().a().getResources().getString(C0906R.string.de3);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f16664a, false, 11034, new Class[0], String.class);
    }

    public final /* synthetic */ c wrap(Message message) {
        DiggMessage diggMessage = (DiggMessage) message;
        if (PatchProxy.isSupport(new Object[]{diggMessage}, this, f16664a, false, 11036, new Class[]{DiggMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{diggMessage}, this, f16664a, false, 11036, new Class[]{DiggMessage.class}, c.class);
        }
        p pVar = new p();
        pVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(diggMessage.common);
        pVar.f16665b = (int) ((Long) Wire.get(diggMessage.digg_count, 0L)).longValue();
        pVar.f16667d = (int) ((Long) Wire.get(diggMessage.color, 0L)).longValue();
        pVar.f16666c = (int) ((Long) Wire.get(diggMessage.duration, 0L)).longValue();
        pVar.f16668e = com.bytedance.android.livesdk.message.a.a.a(diggMessage.user);
        pVar.f16669f = diggMessage.icon;
        return pVar;
    }
}
