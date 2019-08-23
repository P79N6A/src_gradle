package com.ss.android.ugc.aweme.forward.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.api.ForwardApi;
import com.ss.android.ugc.aweme.net.m;

public final class d extends a<ForwardDetail> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48315a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean checkParams(java.lang.Object... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f48315a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 45372(0xb13c, float:6.358E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f48315a
            r13 = 0
            r14 = 45372(0xb13c, float:6.358E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003d:
            if (r0 == 0) goto L_0x0053
            int r2 = r0.length
            if (r2 != r1) goto L_0x0053
            r2 = r0[r9]
            boolean r2 = r2 instanceof java.lang.String
            if (r2 == 0) goto L_0x0053
            r0 = r0[r9]
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0053
            return r1
        L_0x0053:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.forward.model.d.checkParams(java.lang.Object[]):boolean");
    }

    public final /* synthetic */ void handleData(Object obj) {
        ForwardDetail forwardDetail = (ForwardDetail) obj;
        if (PatchProxy.isSupport(new Object[]{forwardDetail}, this, f48315a, false, 45373, new Class[]{ForwardDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{forwardDetail}, this, f48315a, false, 45373, new Class[]{ForwardDetail.class}, Void.TYPE);
            return;
        }
        super.handleData(forwardDetail);
        if (forwardDetail != null && forwardDetail.getAweme() != null) {
            Aweme aweme = forwardDetail.getAweme();
            if (aweme.getAwemeType() == 13) {
                forwardDetail.setAweme(com.ss.android.ugc.aweme.feed.a.a().a(aweme));
                Aweme forwardItem = aweme.getForwardItem();
                if (forwardItem != null) {
                    forwardItem.setRepostFromGroupId(aweme.getAid());
                    forwardItem.setRepostFromUserId(aweme.getAuthorUid());
                    com.ss.android.ugc.aweme.feed.a.a().a(forwardItem);
                }
            }
        }
    }

    public final boolean sendRequest(Object... objArr) {
        i<ForwardDetail> iVar;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f48315a, false, 45371, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f48315a, false, 45371, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            String str = objArr[0];
            if (PatchProxy.isSupport(new Object[]{str}, null, ForwardApi.f48265a, true, 45362, new Class[]{String.class}, i.class)) {
                iVar = (i) PatchProxy.accessDispatch(new Object[]{str}, null, ForwardApi.f48265a, true, 45362, new Class[]{String.class}, i.class);
            } else {
                iVar = ForwardApi.f48266b.getForwardDetail(str);
            }
            iVar.a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
            return true;
        }
    }
}
