package com.bytedance.android.livesdk.gift.model;

import android.support.annotation.Keep;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class Prop {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("count")
    public int count;
    @SerializedName("description")
    public String description;
    @SerializedName("diamond")
    public int diamond;
    @SerializedName("diamond_icon")
    public ImageModel diamondLabel;
    @SerializedName("gift")
    public b gift = new b();
    @SerializedName("icon")
    public ImageModel icon;
    @SerializedName("prop_def_id")
    public long id;
    @SerializedName("is_aweme_free_gift")
    public int isAwemeFreeGift;
    @SerializedName("label_icon")
    public ImageModel labelIcon;
    @SerializedName("manual")
    public String manual;
    @SerializedName("name")
    public String name;
    @SerializedName("next_expire")
    public long nextExpire;
    private long nowTimeDiff;
    @SerializedName("primary_effect_id")
    public int primaryEffectId;
    @SerializedName("reddot_tip")
    public boolean reddotTip;

    public long getNowTimeDiff() {
        return this.nowTimeDiff;
    }

    public void setNowTimeDiff(long j) {
        this.nowTimeDiff = j;
    }

    public static Prop newInstance(Prop prop) {
        Prop prop2 = prop;
        if (PatchProxy.isSupport(new Object[]{prop2}, null, changeQuickRedirect, true, 9831, new Class[]{Prop.class}, Prop.class)) {
            return (Prop) PatchProxy.accessDispatch(new Object[]{prop2}, null, changeQuickRedirect, true, 9831, new Class[]{Prop.class}, Prop.class);
        }
        Prop prop3 = new Prop();
        if (prop2 == null) {
            return prop3;
        }
        prop3.primaryEffectId = prop2.primaryEffectId;
        prop3.nextExpire = prop2.nextExpire;
        prop3.description = prop2.description;
        prop3.id = prop2.id;
        prop3.manual = prop2.manual;
        prop3.diamond = prop2.diamond;
        prop3.reddotTip = prop2.reddotTip;
        prop3.icon = prop2.icon;
        prop3.count = prop2.count;
        prop3.name = prop2.name;
        prop3.gift = prop2.gift;
        prop3.labelIcon = prop2.labelIcon;
        prop3.diamondLabel = prop2.diamondLabel;
        prop3.isAwemeFreeGift = prop2.isAwemeFreeGift;
        prop3.nowTimeDiff = prop2.nowTimeDiff;
        return prop3;
    }
}
