package com.ss.android.ugc.aweme.commercialize.coupon;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.coupon.model.c;
import com.ss.android.ugc.aweme.commercialize.coupon.model.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38536a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.a$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f38538b = new int[f.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0052 */
        static {
            /*
                com.ss.android.ugc.aweme.commercialize.coupon.model.f[] r0 = com.ss.android.ugc.aweme.commercialize.coupon.model.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38538b = r0
                r0 = 1
                int[] r1 = f38538b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.aweme.commercialize.coupon.model.f r2 = com.ss.android.ugc.aweme.commercialize.coupon.model.f.FREE_COUPON     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f38538b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.aweme.commercialize.coupon.model.f r3 = com.ss.android.ugc.aweme.commercialize.coupon.model.f.PAY_COUPON     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                com.ss.android.ugc.aweme.commercialize.coupon.model.a[] r2 = com.ss.android.ugc.aweme.commercialize.coupon.model.a.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f38537a = r2
                int[] r2 = f38537a     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.ss.android.ugc.aweme.commercialize.coupon.model.a r3 = com.ss.android.ugc.aweme.commercialize.coupon.model.a.StatusUnReceived     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = f38537a     // Catch:{ NoSuchFieldError -> 0x003c }
                com.ss.android.ugc.aweme.commercialize.coupon.model.a r2 = com.ss.android.ugc.aweme.commercialize.coupon.model.a.StatusValid     // Catch:{ NoSuchFieldError -> 0x003c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                int[] r0 = f38537a     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.ss.android.ugc.aweme.commercialize.coupon.model.a r1 = com.ss.android.ugc.aweme.commercialize.coupon.model.a.StatusRedeemed     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = f38537a     // Catch:{ NoSuchFieldError -> 0x0052 }
                com.ss.android.ugc.aweme.commercialize.coupon.model.a r1 = com.ss.android.ugc.aweme.commercialize.coupon.model.a.StatusExpired     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r0 = f38537a     // Catch:{ NoSuchFieldError -> 0x005d }
                com.ss.android.ugc.aweme.commercialize.coupon.model.a r1 = com.ss.android.ugc.aweme.commercialize.coupon.model.a.StatusRefunded     // Catch:{ NoSuchFieldError -> 0x005d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.coupon.a.AnonymousClass1.<clinit>():void");
        }
    }

    public static String a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, null, f38536a, true, 30425, new Class[]{c.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{cVar}, null, f38536a, true, 30425, new Class[]{c.class}, String.class);
        }
        String str = "";
        if (cVar.getCouponSource() == 0) {
            str = "poi_offline";
        } else if (cVar.getCouponSource() == 1 && cVar.getCouponType() == 1) {
            str = "ad_online";
        } else if (cVar.getCouponSource() == 1 && cVar.getCouponType() == 0) {
            str = "ad_offline";
        }
        return str;
    }

    public static String a(Context context, int i, boolean z) {
        String str;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, null, f38536a, true, 30424, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), Byte.valueOf(z)}, null, f38536a, true, 30424, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE}, String.class);
        }
        String str2 = "";
        switch (com.ss.android.ugc.aweme.commercialize.coupon.model.a.getStatus(i)) {
            case StatusUnReceived:
                if (!z) {
                    str = "";
                    break;
                } else {
                    str = "unclaimed";
                    break;
                }
            case StatusValid:
                if (!z) {
                    str = context2.getString(C0906R.string.a3a);
                    break;
                } else {
                    str = "valid";
                    break;
                }
            case StatusRedeemed:
                if (!z) {
                    str = context2.getString(C0906R.string.a2o);
                    break;
                } else {
                    str = "used";
                    break;
                }
            case StatusExpired:
                if (!z) {
                    str = context2.getString(C0906R.string.a2v);
                    break;
                } else {
                    str = "invalid";
                    break;
                }
            case StatusRefunded:
                str2 = context2.getString(C0906R.string.a33);
                break;
        }
        str2 = str;
        return str2;
    }
}
