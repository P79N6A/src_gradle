package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.VideoLiveGoodsOrderMessage;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.ss.android.http.a.d.d;

public final class bo extends c<VideoLiveGoodsOrderMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16597a;
    @SerializedName("user")

    /* renamed from: b  reason: collision with root package name */
    public User f16598b;
    @SerializedName("goods_order")

    /* renamed from: c  reason: collision with root package name */
    public a f16599c;

    public static class a {
        @SerializedName("goods_room_order")

        /* renamed from: a  reason: collision with root package name */
        public long f16600a;
        @SerializedName("order_num")

        /* renamed from: b  reason: collision with root package name */
        public long f16601b;
        @SerializedName("order_money")

        /* renamed from: c  reason: collision with root package name */
        public long f16602c;
        @SerializedName("order_id")

        /* renamed from: d  reason: collision with root package name */
        public String f16603d;
    }

    public final boolean canText() {
        return true;
    }

    public bo() {
        this.type = com.bytedance.android.livesdkapi.depend.f.a.GOODS_ORDER;
    }

    public final int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f16597a, false, 11104, new Class[0], Integer.TYPE)) {
            return d.a(17, (Object) Long.valueOf(this.baseMessage.f18777d));
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f16597a, false, 11104, new Class[0], Integer.TYPE)).intValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bo) || this.baseMessage.f18777d != ((bo) obj).baseMessage.f18777d) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ c wrap(Message message) {
        a aVar;
        VideoLiveGoodsOrderMessage videoLiveGoodsOrderMessage = (VideoLiveGoodsOrderMessage) message;
        if (PatchProxy.isSupport(new Object[]{videoLiveGoodsOrderMessage}, this, f16597a, false, 11105, new Class[]{VideoLiveGoodsOrderMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{videoLiveGoodsOrderMessage}, this, f16597a, false, 11105, new Class[]{VideoLiveGoodsOrderMessage.class}, c.class);
        }
        bo boVar = new bo();
        boVar.f16598b = com.bytedance.android.livesdk.message.a.a.a(videoLiveGoodsOrderMessage.user);
        boVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(videoLiveGoodsOrderMessage.common);
        VideoLiveGoodsOrderMessage.GoodsOrder goodsOrder = videoLiveGoodsOrderMessage.goods_order;
        if (PatchProxy.isSupport(new Object[]{goodsOrder}, null, com.bytedance.android.livesdk.message.a.a.f16388a, true, 10982, new Class[]{VideoLiveGoodsOrderMessage.GoodsOrder.class}, a.class)) {
            aVar = (a) PatchProxy.accessDispatch(new Object[]{goodsOrder}, null, com.bytedance.android.livesdk.message.a.a.f16388a, true, 10982, new Class[]{VideoLiveGoodsOrderMessage.GoodsOrder.class}, a.class);
        } else if (goodsOrder == null) {
            aVar = null;
        } else {
            a aVar2 = new a();
            aVar2.f16600a = goodsOrder.goods_room_order.longValue();
            aVar2.f16603d = goodsOrder.order_id;
            aVar2.f16602c = goodsOrder.order_money.longValue();
            aVar2.f16601b = goodsOrder.order_num.longValue();
            aVar = aVar2;
        }
        boVar.f16599c = aVar;
        return boVar;
    }
}
