package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.LevelUpMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class ag extends c<LevelUpMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16445a;
    @SerializedName("user")

    /* renamed from: b  reason: collision with root package name */
    public User f16446b;
    @SerializedName("pre_level")

    /* renamed from: c  reason: collision with root package name */
    public int f16447c = 3;
    @SerializedName("current_level")

    /* renamed from: d  reason: collision with root package name */
    public int f16448d = 4;

    /* renamed from: e  reason: collision with root package name */
    public transient boolean f16449e;

    public ag() {
        this.type = a.HONOR_LEVEL_UP;
    }

    public /* synthetic */ c wrap(Message message) {
        LevelUpMessage levelUpMessage = (LevelUpMessage) message;
        if (PatchProxy.isSupport(new Object[]{levelUpMessage}, this, f16445a, false, 11057, new Class[]{LevelUpMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{levelUpMessage}, this, f16445a, false, 11057, new Class[]{LevelUpMessage.class}, c.class);
        }
        ag agVar = new ag();
        agVar.f16448d = ((Integer) Wire.get(levelUpMessage.current_level, 0)).intValue();
        agVar.f16447c = ((Integer) Wire.get(levelUpMessage.pre_level, 0)).intValue();
        agVar.f16446b = com.bytedance.android.livesdk.message.a.a.a(levelUpMessage.user);
        agVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(levelUpMessage.common);
        return agVar;
    }
}
