package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.LinkMicBattleTaskMessage;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public final class ak extends c<LinkMicBattleTaskMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16458a;
    @SerializedName("extra")

    /* renamed from: b  reason: collision with root package name */
    public a f16459b;

    public static class a {
        @SerializedName("content")

        /* renamed from: a  reason: collision with root package name */
        public String f16460a;
    }

    public ak() {
        this.type = com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_BATTLE_TASK;
    }

    public final /* synthetic */ c wrap(Message message) {
        LinkMicBattleTaskMessage linkMicBattleTaskMessage = (LinkMicBattleTaskMessage) message;
        if (PatchProxy.isSupport(new Object[]{linkMicBattleTaskMessage}, this, f16458a, false, 11061, new Class[]{LinkMicBattleTaskMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{linkMicBattleTaskMessage}, this, f16458a, false, 11061, new Class[]{LinkMicBattleTaskMessage.class}, c.class);
        }
        ak akVar = new ak();
        akVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(linkMicBattleTaskMessage.common);
        a aVar = new a();
        akVar.f16459b = aVar;
        aVar.f16460a = (String) Wire.get(linkMicBattleTaskMessage.content, "");
        return akVar;
    }
}
