package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.aa;
import com.bytedance.android.livesdk.chatroom.model.z;
import com.bytedance.android.livesdk.message.proto.NotifyMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;
import java.util.ArrayList;

public class bc extends c<NotifyMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16543a;
    @SerializedName("content")

    /* renamed from: b  reason: collision with root package name */
    public String f16544b;
    @SerializedName("notify_type")

    /* renamed from: c  reason: collision with root package name */
    public long f16545c;
    @SerializedName("notify_class")

    /* renamed from: d  reason: collision with root package name */
    public int f16546d;
    @SerializedName("schema")

    /* renamed from: e  reason: collision with root package name */
    public String f16547e;
    @SerializedName("extra")

    /* renamed from: f  reason: collision with root package name */
    public bd f16548f;
    @SerializedName("user")
    public User g;

    public bc() {
        this.type = a.ROOM_NOTIFY;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public /* synthetic */ c wrap(Message message) {
        ImageModel imageModel;
        NotifyMessage notifyMessage = (NotifyMessage) message;
        if (PatchProxy.isSupport(new Object[]{notifyMessage}, this, f16543a, false, 11093, new Class[]{NotifyMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{notifyMessage}, this, f16543a, false, 11093, new Class[]{NotifyMessage.class}, c.class);
        }
        bc bcVar = new bc();
        bcVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(notifyMessage.common);
        bcVar.f16544b = notifyMessage.content;
        bcVar.f16545c = ((Long) Wire.get(notifyMessage.notify_type, 0L)).longValue();
        bcVar.f16547e = notifyMessage.schema;
        bcVar.g = com.bytedance.android.livesdk.message.a.a.a(notifyMessage.user);
        bd bdVar = new bd();
        if (notifyMessage.extra != null) {
            NotifyMessage.Background background = notifyMessage.extra.background;
            if (PatchProxy.isSupport(new Object[]{background}, null, com.bytedance.android.livesdk.message.a.a.f16388a, true, 10966, new Class[]{NotifyMessage.Background.class}, ImageModel.class)) {
                imageModel = (ImageModel) PatchProxy.accessDispatch(new Object[]{background}, null, com.bytedance.android.livesdk.message.a.a.f16388a, true, 10966, new Class[]{NotifyMessage.Background.class}, ImageModel.class);
            } else if (background == null) {
                imageModel = null;
            } else {
                imageModel = new ImageModel(background.uri, background.url_list);
                imageModel.width = ((Integer) Wire.get(background.width, 0)).intValue();
                imageModel.height = ((Integer) Wire.get(background.height, 0)).intValue();
            }
            bdVar.f16549a = imageModel;
            bdVar.f16551c = ((Long) Wire.get(notifyMessage.extra.duration, 0L)).longValue();
            if (notifyMessage.extra.content_list != null) {
                aa aaVar = new aa();
                aaVar.f11077b = notifyMessage.extra.content_list.high_light_color;
                aaVar.f11078c = new ArrayList();
                if (notifyMessage.extra.content_list.contents != null) {
                    for (NotifyMessage.Content next : notifyMessage.extra.content_list.contents) {
                        z zVar = new z();
                        zVar.f11189a = next.content;
                        zVar.f11190b = ((Boolean) Wire.get(next.need_high_light, Boolean.FALSE)).booleanValue();
                        aaVar.f11078c.add(zVar);
                    }
                }
                bdVar.f16550b = aaVar;
            }
        }
        bcVar.f16548f = bdVar;
        return bcVar;
    }
}
