package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.CommentsMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public final class f extends c<CommentsMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16618a;
    @SerializedName("user")

    /* renamed from: b  reason: collision with root package name */
    public User f16619b;
    @SerializedName("content")

    /* renamed from: c  reason: collision with root package name */
    public String f16620c;
    @SerializedName("color")

    /* renamed from: d  reason: collision with root package name */
    public String f16621d;
    @SerializedName("back_ground")

    /* renamed from: e  reason: collision with root package name */
    public ImageModel f16622e;
    @SerializedName("action_type")

    /* renamed from: f  reason: collision with root package name */
    public long f16623f;
    @SerializedName("action_content")
    public String g;

    public final boolean canText() {
        return true;
    }

    public f() {
        this.type = a.COMMENT_IMAGE;
    }

    public final /* synthetic */ c wrap(Message message) {
        CommentsMessage commentsMessage = (CommentsMessage) message;
        if (PatchProxy.isSupport(new Object[]{commentsMessage}, this, f16618a, false, 11024, new Class[]{CommentsMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{commentsMessage}, this, f16618a, false, 11024, new Class[]{CommentsMessage.class}, c.class);
        }
        f fVar = new f();
        fVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(commentsMessage.common);
        fVar.f16619b = com.bytedance.android.livesdk.message.a.a.a(commentsMessage.user);
        fVar.f16620c = commentsMessage.content;
        fVar.f16621d = commentsMessage.color;
        fVar.f16622e = com.bytedance.android.livesdk.message.a.a.a(commentsMessage.back_ground);
        fVar.f16623f = ((Long) Wire.get(commentsMessage.action_type, 0L)).longValue();
        fVar.g = commentsMessage.action_content;
        return fVar;
    }
}
