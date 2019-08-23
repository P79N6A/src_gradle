package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.ChatMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class e extends c<ChatMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16612a;
    @SerializedName("chat_id")

    /* renamed from: b  reason: collision with root package name */
    public long f16613b;
    @SerializedName("content")

    /* renamed from: c  reason: collision with root package name */
    public String f16614c;
    @SerializedName("user")

    /* renamed from: d  reason: collision with root package name */
    public User f16615d;
    @SerializedName("visible_to_sender")

    /* renamed from: e  reason: collision with root package name */
    public boolean f16616e;
    @SerializedName("background_image")

    /* renamed from: f  reason: collision with root package name */
    public ImageModel f16617f;
    public transient String g;

    public e() {
        this.type = a.CHAT;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public boolean canText() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f16612a, false, 11022, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16612a, false, 11022, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f16615d != null && !StringUtils.isEmpty(this.f16614c)) {
            z = true;
        }
        return z;
    }

    public /* synthetic */ c wrap(Message message) {
        ChatMessage chatMessage = (ChatMessage) message;
        if (PatchProxy.isSupport(new Object[]{chatMessage}, this, f16612a, false, 11023, new Class[]{ChatMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{chatMessage}, this, f16612a, false, 11023, new Class[]{ChatMessage.class}, c.class);
        }
        e eVar = new e();
        eVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(chatMessage.common);
        eVar.f16614c = chatMessage.content;
        eVar.f16616e = ((Boolean) Wire.get(chatMessage.visible_to_sender, Boolean.FALSE)).booleanValue();
        eVar.f16615d = com.bytedance.android.livesdk.message.a.a.a(chatMessage.user);
        eVar.f16617f = com.bytedance.android.livesdk.message.a.a.a(chatMessage.background_image);
        return eVar;
    }
}
