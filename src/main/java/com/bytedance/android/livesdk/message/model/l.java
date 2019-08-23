package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.SunDailyRankMessage;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.bytedance.android.livesdkapi.h.b;
import com.bytedance.android.livesdkapi.h.e;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class l extends c<SunDailyRankMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16648a;
    @SerializedName("content")

    /* renamed from: b  reason: collision with root package name */
    public String f16649b;
    @SerializedName("after_content")

    /* renamed from: c  reason: collision with root package name */
    public String f16650c;
    @SerializedName("after_display_text")

    /* renamed from: d  reason: collision with root package name */
    public e f16651d;
    @SerializedName("duration")

    /* renamed from: e  reason: collision with root package name */
    public int f16652e;
    @SerializedName("message_type")

    /* renamed from: f  reason: collision with root package name */
    public int f16653f;
    @SerializedName("extra")
    public m g;
    @SerializedName("trace_id")
    public String h;
    @SerializedName("rank")
    public int i;

    public l() {
        this.type = a.DAILY_RANK;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public /* synthetic */ c wrap(Message message) {
        SunDailyRankMessage sunDailyRankMessage = (SunDailyRankMessage) message;
        if (PatchProxy.isSupport(new Object[]{sunDailyRankMessage}, this, f16648a, false, 11031, new Class[]{SunDailyRankMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{sunDailyRankMessage}, this, f16648a, false, 11031, new Class[]{SunDailyRankMessage.class}, c.class);
        }
        l lVar = new l();
        b a2 = com.bytedance.android.livesdk.message.a.a.a(sunDailyRankMessage.common);
        a2.h = sunDailyRankMessage.style;
        lVar.baseMessage = a2;
        lVar.f16650c = sunDailyRankMessage.after_content;
        lVar.f16651d = com.bytedance.android.livesdk.message.a.a.a(sunDailyRankMessage.after_display_text);
        lVar.f16649b = sunDailyRankMessage.content;
        lVar.f16652e = (int) ((Long) Wire.get(sunDailyRankMessage.duration, 0L)).longValue();
        lVar.f16653f = (int) ((Long) Wire.get(sunDailyRankMessage.message_type, 0L)).longValue();
        lVar.i = (int) ((Long) Wire.get(sunDailyRankMessage.rank, 0L)).longValue();
        if (sunDailyRankMessage.extra != null) {
            lVar.g = (m) j.q().c().fromJson(sunDailyRankMessage.extra, m.class);
        }
        return lVar;
    }
}
