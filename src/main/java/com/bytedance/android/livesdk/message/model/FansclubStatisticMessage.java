package com.bytedance.android.livesdk.message.model;

import android.support.annotation.Keep;
import com.bytedance.android.livesdk.message.proto.FansclubStatisticsMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Wire;

@Keep
public class FansclubStatisticMessage extends c<FansclubStatisticsMessage> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("fans_count")
    public long fansCount;
    @SerializedName("name")
    public String name;

    public FansclubStatisticMessage() {
        this.type = a.FANS_CLUB_STATISTICS;
    }

    public c wrap(FansclubStatisticsMessage fansclubStatisticsMessage) {
        FansclubStatisticsMessage fansclubStatisticsMessage2 = fansclubStatisticsMessage;
        if (PatchProxy.isSupport(new Object[]{fansclubStatisticsMessage2}, this, changeQuickRedirect, false, 11045, new Class[]{FansclubStatisticsMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{fansclubStatisticsMessage2}, this, changeQuickRedirect, false, 11045, new Class[]{FansclubStatisticsMessage.class}, c.class);
        }
        FansclubStatisticMessage fansclubStatisticMessage = new FansclubStatisticMessage();
        fansclubStatisticMessage.baseMessage = com.bytedance.android.livesdk.message.a.a.a(fansclubStatisticsMessage2.common);
        fansclubStatisticMessage.name = fansclubStatisticsMessage2.name;
        fansclubStatisticMessage.fansCount = ((Long) Wire.get(fansclubStatisticsMessage2.fans_count, -1L)).longValue();
        return fansclubStatisticMessage;
    }
}
