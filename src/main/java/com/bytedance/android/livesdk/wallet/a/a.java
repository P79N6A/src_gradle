package com.bytedance.android.livesdk.wallet.a;

import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.live.base.model.Extra;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class a extends com.bytedance.android.live.core.network.response.b<C0126a, b> {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f17861e;

    /* renamed from: f  reason: collision with root package name */
    public int f17862f;
    public String g;
    public Exception h;

    /* renamed from: com.bytedance.android.livesdk.wallet.a.a$a  reason: collision with other inner class name */
    public static class C0126a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17863a;
        @SerializedName("status")
        @IgnoreStyleCheck

        /* renamed from: b  reason: collision with root package name */
        public int f17864b;

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f17863a, false, 14208, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f17863a, false, 14208, new Class[0], String.class);
            }
            return "CheckOrderData{status=" + this.f17864b + '}';
        }
    }

    public static class b extends Extra {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17865a;
        @SerializedName("coupon")
        @IgnoreStyleCheck

        /* renamed from: b  reason: collision with root package name */
        public String f17866b;
        @SerializedName("coupon_description")
        @IgnoreStyleCheck

        /* renamed from: c  reason: collision with root package name */
        public String f17867c;
        @SerializedName("coupon_detail")

        /* renamed from: d  reason: collision with root package name */
        public List<b> f17868d;

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f17865a, false, 14209, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f17865a, false, 14209, new Class[0], String.class);
            }
            return "CheckOrderExtra{coupon='" + this.f17866b + '\'' + ", couponDescription='" + this.f17867c + '\'' + '}';
        }
    }

    public final b b() {
        return (b) this.f7872c;
    }

    public final int a() {
        if (this.f7871b == null) {
            return 0;
        }
        return ((C0126a) this.f7871b).f17864b;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f17861e, false, 14207, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f17861e, false, 14207, new Class[0], String.class);
        }
        return "CheckOrderOriginalResult{data=" + this.f7871b + ", extra=" + this.f7872c + ", retry=" + this.f17862f + ", orderId='" + this.g + '\'' + ", exception=" + this.h + '}';
    }
}
