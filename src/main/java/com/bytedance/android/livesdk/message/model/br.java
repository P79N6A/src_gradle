package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.VideoLiveGoodsRcmdMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.ss.android.http.a.d.d;

public final class br extends c<VideoLiveGoodsRcmdMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16608a;
    @SerializedName("rcmd_goods_id")

    /* renamed from: b  reason: collision with root package name */
    public long f16609b;

    public br() {
        this.type = a.RECOMMEND_GOODS;
    }

    public final int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f16608a, false, 11109, new Class[0], Integer.TYPE)) {
            return d.a(17, (Object) Long.valueOf(this.baseMessage.f18777d));
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f16608a, false, 11109, new Class[0], Integer.TYPE)).intValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof br) || this.baseMessage.f18777d != ((br) obj).baseMessage.f18777d) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ c wrap(Message message) {
        VideoLiveGoodsRcmdMessage videoLiveGoodsRcmdMessage = (VideoLiveGoodsRcmdMessage) message;
        if (PatchProxy.isSupport(new Object[]{videoLiveGoodsRcmdMessage}, this, f16608a, false, 11110, new Class[]{VideoLiveGoodsRcmdMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{videoLiveGoodsRcmdMessage}, this, f16608a, false, 11110, new Class[]{VideoLiveGoodsRcmdMessage.class}, c.class);
        }
        br brVar = new br();
        brVar.f16609b = videoLiveGoodsRcmdMessage.rcmd_goods_id.longValue();
        brVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(videoLiveGoodsRcmdMessage.common);
        return brVar;
    }
}
