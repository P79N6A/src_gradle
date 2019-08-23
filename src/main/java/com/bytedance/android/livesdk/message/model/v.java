package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.FansclubMessage;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class v extends c<FansclubMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16690a;
    @SerializedName("action")

    /* renamed from: b  reason: collision with root package name */
    public int f16691b;
    @SerializedName("content")

    /* renamed from: c  reason: collision with root package name */
    public String f16692c;
    @SerializedName("user")

    /* renamed from: d  reason: collision with root package name */
    public User f16693d;

    /* renamed from: e  reason: collision with root package name */
    public a f16694e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16695f;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f16696a;

        /* renamed from: b  reason: collision with root package name */
        public String f16697b;

        /* renamed from: c  reason: collision with root package name */
        public int f16698c;
    }

    public v() {
        this.type = com.bytedance.android.livesdkapi.depend.f.a.FANS_CLUB;
    }

    public boolean canText() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f16690a, false, 11042, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16690a, false, 11042, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!StringUtils.isEmpty(this.f16692c)) {
            z = true;
        }
        return z;
    }

    public /* synthetic */ c wrap(Message message) {
        FansclubMessage fansclubMessage = (FansclubMessage) message;
        if (PatchProxy.isSupport(new Object[]{fansclubMessage}, this, f16690a, false, 11043, new Class[]{FansclubMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{fansclubMessage}, this, f16690a, false, 11043, new Class[]{FansclubMessage.class}, c.class);
        }
        v vVar = new v();
        vVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(fansclubMessage.common);
        vVar.f16691b = ((Integer) Wire.get(fansclubMessage.action, 0)).intValue();
        vVar.f16692c = fansclubMessage.content;
        vVar.f16693d = com.bytedance.android.livesdk.message.a.a.a(fansclubMessage.user);
        a aVar = new a();
        if (fansclubMessage.upgrade_privilege != null) {
            aVar.f16696a = fansclubMessage.upgrade_privilege.content;
            aVar.f16697b = fansclubMessage.upgrade_privilege.description;
            aVar.f16698c = ((Integer) Wire.get(fansclubMessage.upgrade_privilege.button_type, 1)).intValue();
            vVar.f16694e = aVar;
        }
        return vVar;
    }
}
