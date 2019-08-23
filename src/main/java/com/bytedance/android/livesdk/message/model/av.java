package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.e.b;
import com.bytedance.android.livesdk.message.proto.CommonLuckyMoneyMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;
import java.lang.ref.WeakReference;

public final class av extends c<CommonLuckyMoneyMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16504a;
    @SerializedName("user")

    /* renamed from: b  reason: collision with root package name */
    public User f16505b;
    @SerializedName("luckymoney_id")

    /* renamed from: c  reason: collision with root package name */
    public long f16506c;
    @SerializedName("diamond_count")

    /* renamed from: d  reason: collision with root package name */
    public int f16507d;
    @SerializedName("send_time")

    /* renamed from: e  reason: collision with root package name */
    public int f16508e;
    @SerializedName("delay_time")

    /* renamed from: f  reason: collision with root package name */
    public int f16509f;
    @SerializedName("style")
    public int g;
    @SerializedName("lucky_icon")
    public ImageModel h;
    @SerializedName("is_official")
    public boolean i;
    @SerializedName("background")
    public ImageModel j;
    public transient boolean k;
    public transient WeakReference<b> l;

    public final boolean canText() {
        return true;
    }

    public av() {
        this.type = a.LUCKY_BOX;
    }

    @Deprecated
    public static av a(aq aqVar) {
        av avVar = new av();
        avVar.baseMessage = aqVar.baseMessage;
        avVar.f16505b = aqVar.f16477b;
        avVar.f16506c = aqVar.f16478c;
        avVar.f16507d = aqVar.h;
        avVar.f16508e = (int) (aqVar.f16479d / 1000);
        avVar.f16509f = aqVar.f16480e;
        avVar.h = aqVar.n;
        avVar.i = aqVar.m;
        avVar.j = aqVar.l;
        return avVar;
    }

    public final /* synthetic */ c wrap(Message message) {
        ImageModel imageModel;
        CommonLuckyMoneyMessage commonLuckyMoneyMessage = (CommonLuckyMoneyMessage) message;
        if (PatchProxy.isSupport(new Object[]{commonLuckyMoneyMessage}, this, f16504a, false, 11086, new Class[]{CommonLuckyMoneyMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{commonLuckyMoneyMessage}, this, f16504a, false, 11086, new Class[]{CommonLuckyMoneyMessage.class}, c.class);
        }
        av avVar = new av();
        avVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(commonLuckyMoneyMessage.common);
        avVar.f16509f = ((Long) Wire.get(commonLuckyMoneyMessage.delay_time, 0L)).intValue();
        avVar.f16507d = ((Long) Wire.get(commonLuckyMoneyMessage.diamond_count, 0L)).intValue();
        avVar.f16506c = ((Long) Wire.get(commonLuckyMoneyMessage.luckymoney_id, 0L)).longValue();
        avVar.f16508e = ((Long) Wire.get(commonLuckyMoneyMessage.send_time, 0L)).intValue();
        avVar.g = ((Long) Wire.get(commonLuckyMoneyMessage.style, 0L)).intValue();
        avVar.f16505b = com.bytedance.android.livesdk.message.a.a.a(commonLuckyMoneyMessage.user);
        avVar.i = ((Boolean) Wire.get(commonLuckyMoneyMessage.is_official, Boolean.FALSE)).booleanValue();
        avVar.j = com.bytedance.android.livesdk.message.a.a.a(commonLuckyMoneyMessage.background);
        CommonLuckyMoneyMessage.LuckyIcon luckyIcon = commonLuckyMoneyMessage.lucky_icon;
        if (PatchProxy.isSupport(new Object[]{luckyIcon}, null, com.bytedance.android.livesdk.message.a.a.f16388a, true, 10968, new Class[]{CommonLuckyMoneyMessage.LuckyIcon.class}, ImageModel.class)) {
            imageModel = (ImageModel) PatchProxy.accessDispatch(new Object[]{luckyIcon}, null, com.bytedance.android.livesdk.message.a.a.f16388a, true, 10968, new Class[]{CommonLuckyMoneyMessage.LuckyIcon.class}, ImageModel.class);
        } else if (luckyIcon == null) {
            imageModel = null;
        } else {
            imageModel = new ImageModel(luckyIcon.uri, luckyIcon.url_list);
        }
        avVar.h = imageModel;
        return avVar;
    }
}
