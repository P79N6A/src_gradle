package com.ss.android.ugc.aweme.account.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.account.login.ui.o;

public final /* synthetic */ class m implements o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33058a;

    /* renamed from: b  reason: collision with root package name */
    private final BindMobileActivity f33059b;

    m(BindMobileActivity bindMobileActivity) {
        this.f33059b = bindMobileActivity;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.ss.android.ugc.aweme.account.ui.BindMobileInputPhoneFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: com.ss.android.ugc.aweme.account.ui.BindMobileInputPhoneFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: com.ss.android.ugc.aweme.account.ui.BindMobileInputPhoneFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f33058a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 21111(0x5277, float:2.9583E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f33058a
            r13 = 0
            r14 = 21111(0x5277, float:2.9583E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            r2 = r17
            com.ss.android.ugc.aweme.account.ui.BindMobileActivity r3 = r2.f33059b
            r0 = r18
            com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean r0 = (com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean) r0
            com.ss.android.ugc.aweme.account.login.c.b r4 = com.ss.android.ugc.aweme.account.login.c.b.a()
            r5 = 0
            r4.a((com.ss.android.ugc.aweme.account.login.ui.o<com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean>) r5)
            boolean r4 = r3.isViewValid()
            if (r4 == 0) goto L_0x0152
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r4 = r3.mStatusView
            r5 = 8
            r4.setVisibility(r5)
            android.widget.FrameLayout r4 = r3.u
            r4.setVisibility(r9)
            if (r0 == 0) goto L_0x0147
            java.lang.String r4 = r0.getMobile()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0062
            goto L_0x0147
        L_0x0062:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.account.ui.BindMobileActivity.v
            r13 = 0
            r14 = 21108(0x5274, float:2.9579E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean> r4 = com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean.class
            r15[r9] = r4
            java.lang.Class<android.support.v4.app.Fragment> r16 = android.support.v4.app.Fragment.class
            r11 = r3
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x0094
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.account.ui.BindMobileActivity.v
            r13 = 0
            r14 = 21108(0x5274, float:2.9579E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean> r0 = com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean.class
            r15[r9] = r0
            java.lang.Class<android.support.v4.app.Fragment> r16 = android.support.v4.app.Fragment.class
            r11 = r3
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            goto L_0x0140
        L_0x0094:
            if (r0 == 0) goto L_0x0138
            android.os.Bundle r4 = r3.e()
            r5 = 2
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r9] = r4
            r10[r1] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment.f31930a
            r13 = 1
            r14 = 19950(0x4dee, float:2.7956E-41)
            java.lang.Class[] r15 = new java.lang.Class[r5]
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            r15[r9] = r6
            java.lang.Class<com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean> r6 = com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean.class
            r15[r1] = r6
            java.lang.Class<com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment> r16 = com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment.class
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r6 == 0) goto L_0x00d9
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r9] = r4
            r10[r1] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment.f31930a
            r13 = 1
            r14 = 19950(0x4dee, float:2.7956E-41)
            java.lang.Class[] r15 = new java.lang.Class[r5]
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean> r0 = com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean.class
            r15[r1] = r0
            java.lang.Class<com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment> r16 = com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
        L_0x00d5:
            com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment r0 = (com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment) r0
            goto L_0x0140
        L_0x00d9:
            com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment$a r6 = com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment.j
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r9] = r4
            r10[r1] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment.a.f31936a
            r13 = 0
            r14 = 19951(0x4def, float:2.7957E-41)
            java.lang.Class[] r15 = new java.lang.Class[r5]
            java.lang.Class<android.os.Bundle> r7 = android.os.Bundle.class
            r15[r9] = r7
            java.lang.Class<com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean> r7 = com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean.class
            r15[r1] = r7
            java.lang.Class<com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment> r16 = com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment.class
            r11 = r6
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r7 == 0) goto L_0x011c
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r9] = r4
            r7[r1] = r0
            com.meituan.robust.ChangeQuickRedirect r0 = com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment.a.f31936a
            r8 = 0
            r10 = 19951(0x4def, float:2.7957E-41)
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            r11[r9] = r4
            java.lang.Class<com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean> r4 = com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean.class
            r11[r1] = r4
            java.lang.Class<com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment> r12 = com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment.class
            r4 = r7
            r5 = r6
            r6 = r0
            r7 = r8
            r8 = r10
            r9 = r11
            r10 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x00d5
        L_0x011c:
            java.lang.String r5 = "phoneBean"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r5)
            if (r4 != 0) goto L_0x0128
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L_0x0128:
            java.lang.String r5 = "key_phone_bean"
            java.io.Serializable r0 = (java.io.Serializable) r0
            r4.putSerializable(r5, r0)
            com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment r0 = new com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment
            r0.<init>()
            r0.setArguments(r4)
            goto L_0x0140
        L_0x0138:
            android.os.Bundle r0 = r3.e()
            com.ss.android.ugc.aweme.account.ui.BindMobileInputPhoneFragment r0 = com.ss.android.ugc.aweme.account.ui.BindMobileInputPhoneFragment.a(r0)
        L_0x0140:
            r3.a(r0)
            r3.a(r1)
            goto L_0x0152
        L_0x0147:
            android.support.v4.app.Fragment r0 = r3.b()
            r3.a(r0)
            r3.a(r9)
            return
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.ui.m.a(java.lang.Object):void");
    }
}
