package com.ss.android.ugc.aweme.discover.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.friends.api.RecommendApi;
import com.ss.android.ugc.aweme.friends.api.b;
import com.ss.android.ugc.aweme.friends.model.RecommendList;

public final class f extends a<RecommendList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42702a;

    /* renamed from: b  reason: collision with root package name */
    private RecommendApi f42703b = b.a();

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final /* synthetic */ void handleData(Object obj) {
        RecommendList recommendList = (RecommendList) obj;
        if (PatchProxy.isSupport(new Object[]{recommendList}, this, f42702a, false, 37187, new Class[]{RecommendList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendList}, this, f42702a, false, 37187, new Class[]{RecommendList.class}, Void.TYPE);
            return;
        }
        super.handleData(recommendList);
        if (recommendList != null) {
            ai.a().a(recommendList.rid, recommendList.logPb);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean sendRequest(java.lang.Object... r22) {
        /*
            r21 = this;
            r7 = r21
            r8 = r22
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f42702a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 37186(0x9142, float:5.2109E-41)
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f42702a
            r3 = 0
            r4 = 37186(0x9142, float:5.2109E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r21
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003f:
            boolean r0 = super.sendRequest(r22)
            if (r0 != 0) goto L_0x0046
            return r10
        L_0x0046:
            int r0 = r8.length
            r1 = 4
            r2 = 3
            r3 = 2
            if (r0 != r1) goto L_0x006d
            r0 = r8[r10]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = r8[r9]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r8[r3]
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2 = r8[r2]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x00a6
        L_0x006d:
            int r0 = r8.length
            if (r0 != r3) goto L_0x0085
            r0 = r8[r10]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = r8[r9]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r0
            r2 = r1
            r0 = 0
        L_0x0083:
            r1 = 0
            goto L_0x00a6
        L_0x0085:
            int r0 = r8.length
            if (r0 != r2) goto L_0x00a2
            r0 = r8[r10]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = r8[r9]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r8[r3]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = r1
            goto L_0x0083
        L_0x00a2:
            r0 = 0
            r1 = 0
            r2 = 0
            r4 = 0
        L_0x00a6:
            com.ss.android.ugc.aweme.friends.api.RecommendApi r11 = r7.f42703b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            r14 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            r16 = 0
            java.lang.Integer r17 = java.lang.Integer.valueOf(r4)
            com.ss.android.ugc.aweme.newfollow.util.k r0 = com.ss.android.ugc.aweme.newfollow.util.k.a()
            java.lang.String r18 = r0.b()
            java.lang.Integer r19 = java.lang.Integer.valueOf(r2)
            r20 = 0
            a.i r0 = r11.recommendList(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            com.ss.android.ugc.aweme.net.m r1 = new com.ss.android.ugc.aweme.net.m
            com.bytedance.common.utility.collection.WeakHandler r2 = r7.mHandler
            r1.<init>(r2, r10)
            r0.a((a.g<TResult, TContinuationResult>) r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.presenter.f.sendRequest(java.lang.Object[]):boolean");
    }
}
