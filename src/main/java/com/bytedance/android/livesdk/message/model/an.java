package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.chatroom.interact.data.d;
import com.bytedance.android.livesdk.message.proto.LinkMicSignalingMethod;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;

public final class an extends c<LinkMicSignalingMethod> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16469a;
    @SerializedName("content")

    /* renamed from: b  reason: collision with root package name */
    public String f16470b;

    /* renamed from: c  reason: collision with root package name */
    private d f16471c;

    public an() {
        this.type = a.LINK_MIC_SIGNAL;
    }

    public final d a() {
        if (PatchProxy.isSupport(new Object[0], this, f16469a, false, 11063, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, f16469a, false, 11063, new Class[0], d.class);
        } else if (this.f16471c != null) {
            return this.f16471c;
        } else {
            try {
                this.f16471c = (d) j.q().c().fromJson(this.f16470b.replaceAll("\\\\", ""), d.class);
                return this.f16471c;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final /* synthetic */ c wrap(Message message) {
        LinkMicSignalingMethod linkMicSignalingMethod = (LinkMicSignalingMethod) message;
        if (PatchProxy.isSupport(new Object[]{linkMicSignalingMethod}, this, f16469a, false, 11064, new Class[]{LinkMicSignalingMethod.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{linkMicSignalingMethod}, this, f16469a, false, 11064, new Class[]{LinkMicSignalingMethod.class}, c.class);
        }
        an anVar = new an();
        anVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(linkMicSignalingMethod.common);
        anVar.f16470b = linkMicSignalingMethod.content;
        return anVar;
    }
}
