package com.ss.android.ugc.aweme.profile.presenter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

public final class ae extends x {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61579a;

    /* renamed from: b  reason: collision with root package name */
    String f61580b;
    String g;
    public String h;

    public ae() {
        if (PatchProxy.isSupport(new Object[0], this, f61579a, false, 67648, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61579a, false, 67648, new Class[0], Void.TYPE);
            return;
        }
        a(new a<UserResponse>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61581a;

            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length < 2) {
                    return false;
                }
                return true;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object[]} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean sendRequest(java.lang.Object... r26) {
                /*
                    r25 = this;
                    r7 = r25
                    r8 = r26
                    r9 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r10 = 0
                    r0[r10] = r8
                    com.meituan.robust.ChangeQuickRedirect r2 = f61581a
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
                    r5[r10] = r1
                    java.lang.Class r6 = java.lang.Boolean.TYPE
                    r3 = 0
                    r4 = 67651(0x10843, float:9.4799E-41)
                    r1 = r25
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x003f
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r0[r10] = r8
                    com.meituan.robust.ChangeQuickRedirect r2 = f61581a
                    r3 = 0
                    r4 = 67651(0x10843, float:9.4799E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
                    r5[r10] = r1
                    java.lang.Class r6 = java.lang.Boolean.TYPE
                    r1 = r25
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    return r0
                L_0x003f:
                    boolean r0 = super.sendRequest(r26)
                    if (r0 != 0) goto L_0x0069
                    com.ss.android.ugc.aweme.app.d.d r0 = new com.ss.android.ugc.aweme.app.d.d
                    r0.<init>()
                    java.lang.String r1 = "enter_from"
                    com.ss.android.ugc.aweme.profile.presenter.ae r2 = com.ss.android.ugc.aweme.profile.presenter.ae.this
                    java.lang.String r2 = r2.h
                    com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r1, (java.lang.String) r2)
                    if (r8 == 0) goto L_0x0061
                    java.lang.String r1 = "params"
                    java.lang.String r2 = ","
                    java.lang.String r2 = android.text.TextUtils.join(r2, r8)
                    r0.a((java.lang.String) r1, (java.lang.String) r2)
                L_0x0061:
                    java.lang.String r1 = "profile_request_request"
                    java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
                    com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r0)
                    return r10
                L_0x0069:
                    com.ss.android.ugc.aweme.profile.presenter.ae r0 = com.ss.android.ugc.aweme.profile.presenter.ae.this
                    r1 = r8[r10]
                    java.lang.String r1 = (java.lang.String) r1
                    r0.f61580b = r1
                    com.ss.android.ugc.aweme.profile.presenter.ae r0 = com.ss.android.ugc.aweme.profile.presenter.ae.this
                    r1 = r8[r9]
                    java.lang.String r1 = (java.lang.String) r1
                    r0.g = r1
                    r0 = 0
                    int r1 = r8.length
                    r2 = 2
                    if (r1 <= r2) goto L_0x0082
                    r0 = r8[r2]
                    java.lang.String r0 = (java.lang.String) r0
                L_0x0082:
                    com.ss.android.ugc.aweme.global.config.settings.pojo.a r1 = com.ss.android.ugc.aweme.global.config.settings.g.b()
                    java.lang.Integer r1 = r1.bF()
                    int r1 = r1.intValue()
                    r3 = 3
                    if (r1 != 0) goto L_0x016c
                    com.ss.android.ugc.aweme.profile.api.e r1 = com.ss.android.ugc.aweme.profile.api.e.a()
                    com.bytedance.common.utility.collection.WeakHandler r4 = r7.mHandler
                    com.ss.android.ugc.aweme.profile.presenter.ae r5 = com.ss.android.ugc.aweme.profile.presenter.ae.this
                    java.lang.String r5 = r5.f61580b
                    com.ss.android.ugc.aweme.profile.presenter.ae r6 = com.ss.android.ugc.aweme.profile.presenter.ae.this
                    java.lang.String r6 = r6.g
                    r8 = 4
                    java.lang.Object[] r11 = new java.lang.Object[r8]
                    r11[r10] = r4
                    r11[r9] = r5
                    r11[r2] = r6
                    r11[r3] = r0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.api.e.f61334a
                    r14 = 0
                    r15 = 67458(0x10782, float:9.4529E-41)
                    java.lang.Class[] r12 = new java.lang.Class[r8]
                    java.lang.Class<android.os.Handler> r16 = android.os.Handler.class
                    r12[r10] = r16
                    java.lang.Class<java.lang.String> r16 = java.lang.String.class
                    r12[r9] = r16
                    java.lang.Class<java.lang.String> r16 = java.lang.String.class
                    r12[r2] = r16
                    java.lang.Class<java.lang.String> r16 = java.lang.String.class
                    r12[r3] = r16
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r16 = r12
                    r12 = r1
                    boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    if (r11 == 0) goto L_0x00f9
                    java.lang.Object[] r11 = new java.lang.Object[r8]
                    r11[r10] = r4
                    r11[r9] = r5
                    r11[r2] = r6
                    r11[r3] = r0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.api.e.f61334a
                    r14 = 0
                    r15 = 67458(0x10782, float:9.4529E-41)
                    java.lang.Class[] r0 = new java.lang.Class[r8]
                    java.lang.Class<android.os.Handler> r4 = android.os.Handler.class
                    r0[r10] = r4
                    java.lang.Class<java.lang.String> r4 = java.lang.String.class
                    r0[r9] = r4
                    java.lang.Class<java.lang.String> r4 = java.lang.String.class
                    r0[r2] = r4
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r0[r3] = r2
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r1
                    r16 = r0
                    com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    goto L_0x0235
                L_0x00f9:
                    java.lang.Object[] r8 = new java.lang.Object[r3]
                    r8[r10] = r5
                    r8[r9] = r6
                    r8[r2] = r0
                    r19 = 0
                    com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.app.api.a.f33783a
                    r21 = 1
                    r22 = 23016(0x59e8, float:3.2252E-41)
                    java.lang.Class[] r11 = new java.lang.Class[r3]
                    java.lang.Class<java.lang.String> r12 = java.lang.String.class
                    r11[r10] = r12
                    java.lang.Class<java.lang.String> r12 = java.lang.String.class
                    r11[r9] = r12
                    java.lang.Class<java.lang.String> r12 = java.lang.String.class
                    r11[r2] = r12
                    java.lang.Class<java.lang.String> r24 = java.lang.String.class
                    r18 = r8
                    r23 = r11
                    boolean r8 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
                    if (r8 == 0) goto L_0x014a
                    java.lang.Object[] r11 = new java.lang.Object[r3]
                    r11[r10] = r5
                    r11[r9] = r6
                    r11[r2] = r0
                    r12 = 0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.app.api.a.f33783a
                    r14 = 1
                    r15 = 23016(0x59e8, float:3.2252E-41)
                    java.lang.Class[] r0 = new java.lang.Class[r3]
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r0[r10] = r3
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r0[r9] = r3
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r0[r2] = r3
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r16 = r0
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    java.lang.String r0 = (java.lang.String) r0
                    goto L_0x0164
                L_0x014a:
                    android.net.Uri$Builder r2 = com.ss.android.ugc.aweme.app.api.a.a()
                    java.lang.String r3 = "user_id"
                    android.net.Uri$Builder r2 = r2.appendQueryParameter(r3, r5)
                    java.lang.String r3 = "sec_user_id"
                    android.net.Uri$Builder r2 = r2.appendQueryParameter(r3, r6)
                    java.lang.String r3 = "unique_id"
                    android.net.Uri$Builder r0 = r2.appendQueryParameter(r3, r0)
                    java.lang.String r0 = r0.toString()
                L_0x0164:
                    r1.b(r4, r0)
                    r1.a((java.lang.String) r6)
                    goto L_0x0235
                L_0x016c:
                    com.ss.android.ugc.aweme.profile.presenter.ae r1 = com.ss.android.ugc.aweme.profile.presenter.ae.this
                    java.lang.String r1 = r1.g
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L_0x0228
                    com.ss.android.ugc.aweme.profile.api.e r1 = com.ss.android.ugc.aweme.profile.api.e.a()
                    com.bytedance.common.utility.collection.WeakHandler r4 = r7.mHandler
                    com.ss.android.ugc.aweme.profile.presenter.ae r5 = com.ss.android.ugc.aweme.profile.presenter.ae.this
                    java.lang.String r5 = r5.g
                    java.lang.Object[] r11 = new java.lang.Object[r3]
                    r11[r10] = r4
                    r11[r9] = r5
                    r11[r2] = r0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.api.e.f61334a
                    r14 = 0
                    r15 = 67457(0x10781, float:9.4527E-41)
                    java.lang.Class[] r6 = new java.lang.Class[r3]
                    java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
                    r6[r10] = r8
                    java.lang.Class<java.lang.String> r8 = java.lang.String.class
                    r6[r9] = r8
                    java.lang.Class<java.lang.String> r8 = java.lang.String.class
                    r6[r2] = r8
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r1
                    r16 = r6
                    boolean r6 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    if (r6 == 0) goto L_0x01cc
                    java.lang.Object[] r11 = new java.lang.Object[r3]
                    r11[r10] = r4
                    r11[r9] = r5
                    r11[r2] = r0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.profile.api.e.f61334a
                    r14 = 0
                    r15 = 67457(0x10781, float:9.4527E-41)
                    java.lang.Class[] r0 = new java.lang.Class[r3]
                    java.lang.Class<android.os.Handler> r3 = android.os.Handler.class
                    r0[r10] = r3
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r0[r9] = r3
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r0[r2] = r3
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r1
                    r16 = r0
                    com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    goto L_0x0235
                L_0x01cc:
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r0[r10] = r5
                    r19 = 0
                    com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.app.api.a.f33783a
                    r21 = 1
                    r22 = 23017(0x59e9, float:3.2254E-41)
                    java.lang.Class[] r2 = new java.lang.Class[r9]
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r2[r10] = r3
                    java.lang.Class<java.lang.String> r24 = java.lang.String.class
                    r18 = r0
                    r23 = r2
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
                    if (r0 == 0) goto L_0x0205
                    java.lang.Object[] r11 = new java.lang.Object[r9]
                    r11[r10] = r5
                    r12 = 0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.app.api.a.f33783a
                    r14 = 1
                    r15 = 23017(0x59e9, float:3.2254E-41)
                    java.lang.Class[] r0 = new java.lang.Class[r9]
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r0[r10] = r2
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r16 = r0
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    java.lang.String r0 = (java.lang.String) r0
                    goto L_0x0221
                L_0x0205:
                    android.net.Uri$Builder r0 = com.ss.android.ugc.aweme.app.api.a.a()
                    java.lang.String r2 = "sec_user_id"
                    android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r5)
                    java.lang.String r2 = "address_book_access"
                    int r3 = com.ss.android.ugc.aweme.utils.permission.e.a()
                    java.lang.String r3 = java.lang.String.valueOf(r3)
                    android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r3)
                    java.lang.String r0 = r0.toString()
                L_0x0221:
                    r1.b(r4, r0)
                    r1.a((java.lang.String) r5)
                    goto L_0x0235
                L_0x0228:
                    com.ss.android.ugc.aweme.profile.api.e r1 = com.ss.android.ugc.aweme.profile.api.e.a()
                    com.bytedance.common.utility.collection.WeakHandler r2 = r7.mHandler
                    com.ss.android.ugc.aweme.profile.presenter.ae r3 = com.ss.android.ugc.aweme.profile.presenter.ae.this
                    java.lang.String r3 = r3.f61580b
                    r1.a(r2, r3, r0)
                L_0x0235:
                    com.ss.android.ugc.aweme.profile.api.e r0 = com.ss.android.ugc.aweme.profile.api.e.a()
                    com.ss.android.ugc.aweme.profile.presenter.ae r1 = com.ss.android.ugc.aweme.profile.presenter.ae.this
                    java.lang.String r1 = r1.h
                    r0.f61337b = r1
                    java.lang.String r0 = "profile_request_request"
                    com.ss.android.ugc.aweme.app.d.d r1 = new com.ss.android.ugc.aweme.app.d.d
                    r1.<init>()
                    java.lang.String r2 = "enter_from"
                    com.ss.android.ugc.aweme.profile.presenter.ae r3 = com.ss.android.ugc.aweme.profile.presenter.ae.this
                    java.lang.String r3 = r3.h
                    com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                    java.lang.String r2 = "sec_uid"
                    com.ss.android.ugc.aweme.profile.presenter.ae r3 = com.ss.android.ugc.aweme.profile.presenter.ae.this
                    java.lang.String r3 = r3.g
                    com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                    java.lang.String r2 = "uid"
                    com.ss.android.ugc.aweme.profile.presenter.ae r3 = com.ss.android.ugc.aweme.profile.presenter.ae.this
                    java.lang.String r3 = r3.f61580b
                    com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
                    com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.presenter.ae.AnonymousClass1.sendRequest(java.lang.Object[]):boolean");
            }
        });
    }

    public final void b() {
        User user;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f61579a, false, 67649, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61579a, false, 67649, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2978e == null || this.f2978e.getData() == null) {
            user = null;
        } else {
            user = ((UserResponse) this.f2978e.getData()).getUser();
        }
        if (!(this.f2978e == null || this.f2978e.getData() == null)) {
            ai a2 = ai.a();
            String str2 = this.f61580b;
            LogPbBean logPb = ((UserResponse) this.f2978e.getData()).getLogPb();
            if (PatchProxy.isSupport(new Object[]{str2, logPb}, a2, ai.f44995a, false, 40205, new Class[]{String.class, LogPbBean.class}, Void.TYPE)) {
                ai aiVar = a2;
                PatchProxy.accessDispatch(new Object[]{str2, logPb}, aiVar, ai.f44995a, false, 40205, new Class[]{String.class, LogPbBean.class}, Void.TYPE);
            } else if (!(TextUtils.isEmpty(str2) || logPb == null || logPb.getImprId() == null)) {
                a2.f44996b.put(str2, a2.f44997c.toJson((Object) logPb));
            }
        }
        if (user == null || d.a().isUserEmpty(user)) {
            r.a("profile_request_response", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", this.h).a("is_success", 0).a("fail_info", "user_is_empty").a("to_user_id", this.f61580b).a("log_pb", ai.a().b(this.f61580b)).f34114b);
            return;
        }
        if (com.ss.android.g.a.b()) {
            r.a("profile_request_response", (Map) new com.ss.android.ugc.aweme.app.d.d().a("to_user_id", user.getUid()).a("enter_from", "others_homepage").a("is_success", 1).f34114b);
        }
        if (this.f2979f == null || (!TextUtils.isEmpty(((n) this.f2979f).getUserId()) && !TextUtils.equals(user.getUid(), ((n) this.f2979f).getUserId()))) {
            com.ss.android.ugc.aweme.app.d.d a3 = new com.ss.android.ugc.aweme.app.d.d().a("enter_from", this.h).a("is_success", 1);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f61580b);
            sb.append(",");
            sb.append(this.g);
            sb.append(",");
            if (this.f2979f == null) {
                str = "";
            } else {
                str = ((n) this.f2979f).getUserId();
            }
            sb.append(str);
            sb.append(",");
            sb.append(user.getUid());
            r.a("profile_request_response", (Map) a3.a("fail_info", sb.toString()).a("log_pb", ai.a().b(this.f61580b)).f34114b);
            return;
        }
        ((n) this.f2979f).a(user);
        a(user);
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f61579a, false, 67650, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f61579a, false, 67650, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = new com.ss.android.ugc.aweme.app.d.d().a("to_user_id", this.f61580b).a("enter_from", this.h).a("is_success", 0).a("fail_info", exc.getMessage());
        if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            a2.a("response", ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getResponse());
        }
        r.a("profile_request_response", (Map) a2.f34114b);
        super.a(exc);
    }
}
