package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.chatroom.model.a.b;
import com.bytedance.android.livesdk.message.proto.LinkMicMethod;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;
import java.util.ArrayList;

public final class al extends c<LinkMicMethod> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16461a;
    @SerializedName("extra")

    /* renamed from: b  reason: collision with root package name */
    public am f16462b;

    public al() {
        this.type = a.LINK_MIC;
    }

    public final /* synthetic */ c wrap(Message message) {
        LinkMicMethod linkMicMethod = (LinkMicMethod) message;
        if (PatchProxy.isSupport(new Object[]{linkMicMethod}, this, f16461a, false, 11062, new Class[]{LinkMicMethod.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{linkMicMethod}, this, f16461a, false, 11062, new Class[]{LinkMicMethod.class}, c.class);
        }
        al alVar = new al();
        alVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(linkMicMethod.common);
        am amVar = new am();
        long longValue = ((Long) Wire.get(linkMicMethod.message_type, 0L)).longValue();
        amVar.f16464b = linkMicMethod.access_key;
        amVar.f16463a = (int) longValue;
        amVar.f16466d = ((Long) Wire.get(linkMicMethod.user_id, 0L)).longValue();
        amVar.f16467e = ((Long) Wire.get(linkMicMethod.fan_ticket, 0L)).longValue();
        amVar.f16468f = ((Long) Wire.get(linkMicMethod.total_linkmic_fan_ticket, 0L)).longValue();
        amVar.r = ((Boolean) Wire.get(linkMicMethod.win, Boolean.FALSE)).booleanValue();
        amVar.i = (int) ((Long) Wire.get(linkMicMethod.vendor, 0L)).longValue();
        amVar.t = ((Long) Wire.get(linkMicMethod.to_user_id, 0L)).longValue();
        amVar.m = (int) ((Long) Wire.get(linkMicMethod.answer, 0L)).longValue();
        amVar.s = linkMicMethod.prompts;
        amVar.q = (int) ((Long) Wire.get(linkMicMethod.match_type, 0L)).longValue();
        amVar.h = (int) ((Long) Wire.get(linkMicMethod.layout, 0L)).longValue();
        amVar.l = ((Long) Wire.get(linkMicMethod.invite_uid, 0L)).longValue();
        amVar.o = (int) ((Long) Wire.get(linkMicMethod.duration, 0L)).longValue();
        amVar.j = (int) ((Long) Wire.get(linkMicMethod.dimension, 0L)).longValue();
        amVar.g = ((Long) Wire.get(linkMicMethod.channel_id, 0L)).longValue();
        amVar.f16465c = (int) ((Long) Wire.get(linkMicMethod.anchor_linkmic_id, 0L)).longValue();
        amVar.k = linkMicMethod.theme;
        if (linkMicMethod.user_scores != null && linkMicMethod.user_scores.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (LinkMicMethod.UserScores next : linkMicMethod.user_scores) {
                b bVar = new b();
                bVar.f11026a = ((Long) Wire.get(next.user_id, 0L)).longValue();
                bVar.f11027b = ((Long) Wire.get(next.score, 0L)).intValue();
                arrayList.add(bVar);
            }
            amVar.p = arrayList;
        }
        amVar.n = ((Long) Wire.get(linkMicMethod.start_time_ms, 0L)).longValue();
        alVar.f16462b = amVar;
        return alVar;
    }
}
