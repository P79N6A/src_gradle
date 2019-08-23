package com.bytedance.android.livesdk.wallet;

import com.meituan.robust.ChangeQuickRedirect;
import org.json.JSONObject;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17914a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f17915b;

    /* JADX WARNING: Can't wrap try/catch for region: R(8:7|8|9|(2:13|14)|15|16|(2:18|19)|20) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004c */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060 A[Catch:{ JSONException -> 0x0066 }] */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.livesdk.wallet.ad a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f17914a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.bytedance.android.livesdk.wallet.ad> r7 = com.bytedance.android.livesdk.wallet.ad.class
            r4 = 0
            r5 = 14031(0x36cf, float:1.9662E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f17914a
            r5 = 0
            r6 = 14031(0x36cf, float:1.9662E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<com.bytedance.android.livesdk.wallet.ad> r8 = com.bytedance.android.livesdk.wallet.ad.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            com.bytedance.android.livesdk.wallet.ad r0 = (com.bytedance.android.livesdk.wallet.ad) r0
            return r0
        L_0x0026:
            org.json.JSONObject r0 = r9.f17915b
            r1 = 0
            if (r0 != 0) goto L_0x002c
            return r1
        L_0x002c:
            r2 = 0
            org.json.JSONObject r0 = r9.f17915b     // Catch:{ JSONException -> 0x004c }
            java.lang.String r4 = "campaign_id"
            long r4 = r0.getLong(r4)     // Catch:{ JSONException -> 0x004c }
            org.json.JSONObject r0 = r9.f17915b     // Catch:{ JSONException -> 0x004c }
            java.lang.String r6 = "item_id"
            long r6 = r0.getLong(r6)     // Catch:{ JSONException -> 0x004c }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            com.bytedance.android.livesdk.wallet.u r0 = new com.bytedance.android.livesdk.wallet.u     // Catch:{ JSONException -> 0x004c }
            r0.<init>(r4, r6)     // Catch:{ JSONException -> 0x004c }
            return r0
        L_0x004c:
            org.json.JSONObject r0 = r9.f17915b     // Catch:{ JSONException -> 0x0066 }
            java.lang.String r4 = "ward_id"
            long r4 = r0.getLong(r4)     // Catch:{ JSONException -> 0x0066 }
            org.json.JSONObject r0 = r9.f17915b     // Catch:{ JSONException -> 0x0066 }
            java.lang.String r6 = "anchor_id"
            long r6 = r0.getLong(r6)     // Catch:{ JSONException -> 0x0066 }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
            com.bytedance.android.livesdk.wallet.am r0 = new com.bytedance.android.livesdk.wallet.am     // Catch:{ JSONException -> 0x0066 }
            r0.<init>(r4, r6)     // Catch:{ JSONException -> 0x0066 }
            return r0
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.wallet.ac.a():com.bytedance.android.livesdk.wallet.ad");
    }

    public ac(JSONObject jSONObject) {
        this.f17915b = jSONObject;
    }
}
