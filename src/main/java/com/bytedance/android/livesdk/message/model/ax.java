package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.NoticeMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.bytedance.android.livesdkapi.h.e;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class ax extends c<NoticeMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16519a;
    @SerializedName("content")

    /* renamed from: b  reason: collision with root package name */
    public String f16520b;
    @SerializedName("notice_type")

    /* renamed from: c  reason: collision with root package name */
    public int f16521c;
    @SerializedName("style")

    /* renamed from: d  reason: collision with root package name */
    public String f16522d;
    @SerializedName("title")

    /* renamed from: e  reason: collision with root package name */
    public e f16523e;
    @SerializedName("violation_reason")

    /* renamed from: f  reason: collision with root package name */
    public e f16524f;
    @SerializedName("display_text")
    public e g;
    @SerializedName("tips_title")
    public e h;
    @SerializedName("tips_url")
    public String i;

    public ax() {
        this.type = a.REMIND;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public /* synthetic */ c wrap(Message message) {
        NoticeMessage noticeMessage = (NoticeMessage) message;
        if (PatchProxy.isSupport(new Object[]{noticeMessage}, this, f16519a, false, 11088, new Class[]{NoticeMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{noticeMessage}, this, f16519a, false, 11088, new Class[]{NoticeMessage.class}, c.class);
        }
        ax axVar = new ax();
        axVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(noticeMessage.common);
        axVar.f16520b = noticeMessage.content;
        axVar.f16521c = (int) ((Long) Wire.get(noticeMessage.notice_type, 0L)).longValue();
        axVar.f16522d = noticeMessage.style;
        axVar.f16523e = com.bytedance.android.livesdk.message.a.a.a(noticeMessage.title);
        axVar.f16524f = com.bytedance.android.livesdk.message.a.a.a(noticeMessage.violation_reason);
        axVar.g = com.bytedance.android.livesdk.message.a.a.a(noticeMessage.display_text);
        axVar.h = com.bytedance.android.livesdk.message.a.a.a(noticeMessage.tips_title);
        axVar.i = noticeMessage.tips_url;
        return axVar;
    }
}
