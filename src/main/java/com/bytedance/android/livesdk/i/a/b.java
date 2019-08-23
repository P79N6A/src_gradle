package com.bytedance.android.livesdk.i.a;

import com.bytedance.android.livesdk.message.model.c;
import com.bytedance.android.livesdk.message.proto.LotteryInfo;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import java.util.List;

public class b extends c<LotteryInfo> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15551a;
    @SerializedName("lottery_id")

    /* renamed from: b  reason: collision with root package name */
    public String f15552b;
    @SerializedName("owner_user_id")

    /* renamed from: c  reason: collision with root package name */
    public String f15553c;
    @SerializedName("anchor_id")

    /* renamed from: d  reason: collision with root package name */
    public String f15554d;
    @SerializedName("owner_type")

    /* renamed from: e  reason: collision with root package name */
    public int f15555e;
    @SerializedName("room_id")

    /* renamed from: f  reason: collision with root package name */
    public String f15556f;
    @SerializedName("status")
    public int g;
    @SerializedName("prize_info")
    public d h;
    @SerializedName("conditions")
    public List<a> i;
    @SerializedName("prize_count")
    public String j;
    @SerializedName("lucky_count")
    public String k;
    @SerializedName("start_time")
    public String l;
    @SerializedName("draw_time")
    public String m;
    @SerializedName("extra")
    public String n;
    @SerializedName("current_time")
    public String o;
    @SerializedName("real_lucky_count")
    public String p;
    @SerializedName("total_grant_count")
    public String q;
    @SerializedName("withdraw_count")
    public String r;
    @SerializedName("real_draw_time")
    public String s;
    @SerializedName("lucky_users")
    public List<c> t;

    public /* synthetic */ c wrap(Message message) {
        LotteryInfo lotteryInfo = (LotteryInfo) message;
        if (PatchProxy.isSupport(new Object[]{lotteryInfo}, this, f15551a, false, 10853, new Class[]{LotteryInfo.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{lotteryInfo}, this, f15551a, false, 10853, new Class[]{LotteryInfo.class}, c.class);
        }
        b bVar = new b();
        bVar.f15552b = String.valueOf(lotteryInfo.lottery_id);
        bVar.f15553c = String.valueOf(lotteryInfo.owner_user_id);
        bVar.f15554d = String.valueOf(lotteryInfo.anchor_id);
        bVar.f15555e = lotteryInfo.owner_type.intValue();
        bVar.f15556f = String.valueOf(lotteryInfo.room_id);
        bVar.g = lotteryInfo.status.intValue();
        bVar.j = String.valueOf(lotteryInfo.prize_count);
        bVar.k = String.valueOf(lotteryInfo.lucky_count);
        bVar.l = String.valueOf(lotteryInfo.start_time);
        bVar.m = String.valueOf(lotteryInfo.draw_time);
        bVar.n = String.valueOf(lotteryInfo.extra);
        bVar.p = String.valueOf(this.p);
        bVar.q = String.valueOf(lotteryInfo.total_grant_count);
        bVar.r = String.valueOf(lotteryInfo.withdraw_count);
        bVar.s = String.valueOf(lotteryInfo.real_draw_time);
        return bVar;
    }
}
