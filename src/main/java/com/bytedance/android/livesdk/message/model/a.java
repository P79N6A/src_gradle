package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.AssetMessage;
import com.bytedance.android.livesdkapi.h.e;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class a extends c<AssetMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16419a;
    @SerializedName("asset_id")

    /* renamed from: b  reason: collision with root package name */
    public long f16420b;
    @SerializedName("panel_display_text")

    /* renamed from: c  reason: collision with root package name */
    public e f16421c;
    @SerializedName("show_message")

    /* renamed from: d  reason: collision with root package name */
    public boolean f16422d;
    @SerializedName("show_panel")

    /* renamed from: e  reason: collision with root package name */
    public boolean f16423e;
    @SerializedName("user")

    /* renamed from: f  reason: collision with root package name */
    public User f16424f;
    @SerializedName("to_user")
    public User g;

    public a() {
        this.type = com.bytedance.android.livesdkapi.depend.f.a.ASSET_MESSAGE;
    }

    public boolean canText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public /* synthetic */ c wrap(Message message) {
        AssetMessage assetMessage = (AssetMessage) message;
        if (PatchProxy.isSupport(new Object[]{assetMessage}, this, f16419a, false, 11016, new Class[]{AssetMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{assetMessage}, this, f16419a, false, 11016, new Class[]{AssetMessage.class}, c.class);
        }
        a aVar = new a();
        aVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(assetMessage.common);
        aVar.f16420b = ((Long) Wire.get(assetMessage.asset_id, 0L)).longValue();
        aVar.f16421c = com.bytedance.android.livesdk.message.a.a.a(assetMessage.panel_display_text);
        aVar.f16422d = ((Boolean) Wire.get(assetMessage.show_message, Boolean.FALSE)).booleanValue();
        aVar.f16423e = ((Boolean) Wire.get(assetMessage.show_panel, Boolean.FALSE)).booleanValue();
        aVar.f16424f = com.bytedance.android.livesdk.message.a.a.a(assetMessage.user);
        aVar.g = com.bytedance.android.livesdk.message.a.a.a(assetMessage.to_user);
        return aVar;
    }
}
