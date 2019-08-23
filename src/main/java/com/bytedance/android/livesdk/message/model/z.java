package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.chatroom.model.o;
import com.bytedance.android.livesdk.message.proto.GamblingStatusChangedMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public final class z extends c<GamblingStatusChangedMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16714a;
    @SerializedName("prev_status")

    /* renamed from: b  reason: collision with root package name */
    public int f16715b;
    @SerializedName("info")

    /* renamed from: c  reason: collision with root package name */
    public o f16716c;

    public z() {
        this.type = a.GAME_QUIZ;
    }

    public final /* synthetic */ c wrap(Message message) {
        GamblingStatusChangedMessage gamblingStatusChangedMessage = (GamblingStatusChangedMessage) message;
        if (PatchProxy.isSupport(new Object[]{gamblingStatusChangedMessage}, this, f16714a, false, 11050, new Class[]{GamblingStatusChangedMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{gamblingStatusChangedMessage}, this, f16714a, false, 11050, new Class[]{GamblingStatusChangedMessage.class}, c.class);
        }
        z zVar = new z();
        zVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(gamblingStatusChangedMessage.common);
        zVar.f16715b = (int) ((Long) Wire.get(gamblingStatusChangedMessage.prev_status, 0L)).longValue();
        o oVar = new o();
        if (gamblingStatusChangedMessage.game_quiz_info != null) {
            oVar.f11144a = ((Long) Wire.get(gamblingStatusChangedMessage.game_quiz_info.id, 0L)).longValue();
            oVar.f11145b = ((Long) Wire.get(gamblingStatusChangedMessage.game_quiz_info.room_id, 0L)).longValue();
            oVar.f11146c = (int) ((Long) Wire.get(gamblingStatusChangedMessage.game_quiz_info.status, 0L)).longValue();
        }
        zVar.f16716c = oVar;
        return zVar;
    }
}
