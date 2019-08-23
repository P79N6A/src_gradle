package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.VideoLiveCouponRcmdMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.ss.android.http.a.d.d;

public final class bq extends c<VideoLiveCouponRcmdMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16606a;
    @SerializedName("rcmd_coupon_id")

    /* renamed from: b  reason: collision with root package name */
    public long f16607b;

    public bq() {
        this.type = a.RECOMMEND_COUPON;
    }

    public final int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f16606a, false, 11107, new Class[0], Integer.TYPE)) {
            return d.a(17, (Object) Long.valueOf(this.baseMessage.f18777d));
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f16606a, false, 11107, new Class[0], Integer.TYPE)).intValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bq) || this.baseMessage.f18777d != ((bq) obj).baseMessage.f18777d) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ c wrap(Message message) {
        VideoLiveCouponRcmdMessage videoLiveCouponRcmdMessage = (VideoLiveCouponRcmdMessage) message;
        if (PatchProxy.isSupport(new Object[]{videoLiveCouponRcmdMessage}, this, f16606a, false, 11108, new Class[]{VideoLiveCouponRcmdMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{videoLiveCouponRcmdMessage}, this, f16606a, false, 11108, new Class[]{VideoLiveCouponRcmdMessage.class}, c.class);
        }
        bq bqVar = new bq();
        bqVar.f16607b = videoLiveCouponRcmdMessage.rcmd_coupon_id.longValue();
        bqVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(videoLiveCouponRcmdMessage.common);
        return bqVar;
    }
}
