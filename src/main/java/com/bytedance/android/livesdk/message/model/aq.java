package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.e.b;
import com.bytedance.android.livesdk.chatroom.model.u;
import com.bytedance.android.livesdk.chatroom.model.y;
import com.bytedance.android.livesdk.message.proto.LuckyBoxMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class aq extends c<LuckyBoxMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16476a;
    @SerializedName("user")

    /* renamed from: b  reason: collision with root package name */
    public User f16477b;
    @SerializedName("box_id")

    /* renamed from: c  reason: collision with root package name */
    public long f16478c;
    @SerializedName("send_time")

    /* renamed from: d  reason: collision with root package name */
    public long f16479d;
    @SerializedName("delay_time")

    /* renamed from: e  reason: collision with root package name */
    public int f16480e;
    @SerializedName("box_type")

    /* renamed from: f  reason: collision with root package name */
    public int f16481f;
    @SerializedName("title")
    public String g;
    @SerializedName("diamond_count")
    public int h;
    @SerializedName("priority")
    public int i;
    @SerializedName("large")
    public boolean j;
    @SerializedName("description_list")
    public List<y> k;
    @SerializedName("background")
    public ImageModel l;
    @SerializedName("is_official")
    public boolean m;
    @SerializedName("lucky_icon")
    @Deprecated
    public ImageModel n;
    @IgnoreStyleCheck
    public transient boolean o;
    @IgnoreStyleCheck
    public transient boolean p;
    @IgnoreStyleCheck
    public transient u q;
    @IgnoreStyleCheck
    public transient WeakReference<b> r;

    public boolean canText() {
        return true;
    }

    public aq() {
        this.type = a.LUCKY_BOX;
    }

    public /* synthetic */ c wrap(Message message) {
        LuckyBoxMessage luckyBoxMessage = (LuckyBoxMessage) message;
        if (PatchProxy.isSupport(new Object[]{luckyBoxMessage}, this, f16476a, false, 11070, new Class[]{LuckyBoxMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{luckyBoxMessage}, this, f16476a, false, 11070, new Class[]{LuckyBoxMessage.class}, c.class);
        }
        aq aqVar = new aq();
        aqVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(luckyBoxMessage.common);
        aqVar.f16477b = com.bytedance.android.livesdk.message.a.a.a(luckyBoxMessage.user);
        aqVar.f16478c = ((Long) Wire.get(luckyBoxMessage.box_id, 0L)).longValue();
        aqVar.f16479d = ((Long) Wire.get(luckyBoxMessage.send_time, 0L)).longValue();
        aqVar.f16480e = ((Long) Wire.get(luckyBoxMessage.delay_time, 0L)).intValue();
        aqVar.f16481f = ((Long) Wire.get(luckyBoxMessage.box_type, 0L)).intValue();
        aqVar.g = (String) Wire.get(luckyBoxMessage.title, "");
        aqVar.h = ((Long) Wire.get(luckyBoxMessage.diamond_count, 0L)).intValue();
        aqVar.i = ((Long) Wire.get(luckyBoxMessage.priority, 0L)).intValue();
        aqVar.j = ((Boolean) Wire.get(luckyBoxMessage.large, Boolean.FALSE)).booleanValue();
        aqVar.k = new ArrayList();
        if (luckyBoxMessage.description_list != null) {
            for (LuckyBoxMessage.ImgText next : luckyBoxMessage.description_list) {
                y yVar = new y();
                yVar.f11188b = (String) Wire.get(next.text, "");
                yVar.f11187a = com.bytedance.android.livesdk.message.a.a.a(next.image);
                aqVar.k.add(yVar);
            }
        }
        aqVar.l = com.bytedance.android.livesdk.message.a.a.a(luckyBoxMessage.background);
        aqVar.m = ((Boolean) Wire.get(luckyBoxMessage.is_official, Boolean.FALSE)).booleanValue();
        aqVar.n = com.bytedance.android.livesdk.message.a.a.a(luckyBoxMessage.lucky_icon);
        return aqVar;
    }
}
