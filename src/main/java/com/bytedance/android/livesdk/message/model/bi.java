package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.ScreenChatMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class bi extends c<ScreenChatMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16568a;
    @SerializedName("content")

    /* renamed from: b  reason: collision with root package name */
    public String f16569b;
    @SerializedName("user")

    /* renamed from: c  reason: collision with root package name */
    public User f16570c;
    @SerializedName("screen_chat_type")

    /* renamed from: d  reason: collision with root package name */
    public int f16571d;
    @SerializedName("priority")

    /* renamed from: e  reason: collision with root package name */
    public int f16572e;
    @SerializedName("effect")

    /* renamed from: f  reason: collision with root package name */
    public d f16573f;
    @SerializedName("background_image")
    public ImageModel g;

    public bi() {
        this.type = a.SCREEN;
    }

    public final boolean a() {
        if (this.f16572e != 0) {
            return true;
        }
        return false;
    }

    public boolean canText() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f16568a, false, 11097, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16568a, false, 11097, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f16570c != null && !StringUtils.isEmpty(this.f16569b)) {
            z = true;
        }
        return z;
    }

    public /* synthetic */ c wrap(Message message) {
        ScreenChatMessage screenChatMessage = (ScreenChatMessage) message;
        if (PatchProxy.isSupport(new Object[]{screenChatMessage}, this, f16568a, false, 11098, new Class[]{ScreenChatMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{screenChatMessage}, this, f16568a, false, 11098, new Class[]{ScreenChatMessage.class}, c.class);
        }
        bi biVar = new bi();
        biVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(screenChatMessage.common);
        biVar.f16571d = ((Long) Wire.get(screenChatMessage.screen_chat_type, 0L)).intValue();
        biVar.f16569b = screenChatMessage.content;
        biVar.f16570c = com.bytedance.android.livesdk.message.a.a.a(screenChatMessage.user);
        biVar.g = com.bytedance.android.livesdk.message.a.a.a(screenChatMessage.background_image);
        if (screenChatMessage.effect != null) {
            d dVar = new d();
            dVar.f16611b = com.bytedance.android.livesdk.message.a.a.a(screenChatMessage.effect.avatar_icon);
            dVar.f16610a = com.bytedance.android.livesdk.message.a.a.a(screenChatMessage.effect.icon);
            biVar.f16573f = dVar;
        }
        return biVar;
    }
}
