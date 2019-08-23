package com.ss.android.ugc.aweme.account.h;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.sdk.account.i.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u001b\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/account/listener/OneBindListener;", "Lcom/bytedance/sdk/account/platform/OnekeyBindAdapter;", "context", "Landroid/content/Context;", "fragment", "Lcom/bytedance/ies/uikit/base/AbsFragment;", "enterFrom", "", "phoneBean", "Lcom/ss/android/ugc/aweme/account/login/bean/OneLoginPhoneBean;", "errorBlock", "Lkotlin/Function0;", "", "(Landroid/content/Context;Lcom/bytedance/ies/uikit/base/AbsFragment;Ljava/lang/String;Lcom/ss/android/ugc/aweme/account/login/bean/OneLoginPhoneBean;Lkotlin/jvm/functions/Function0;)V", "getContext", "()Landroid/content/Context;", "getEnterFrom", "()Ljava/lang/String;", "getErrorBlock", "()Lkotlin/jvm/functions/Function0;", "getFragment", "()Lcom/bytedance/ies/uikit/base/AbsFragment;", "dealConflictError", "response", "Lcom/bytedance/sdk/account/platform/base/AuthorizeErrorResponse;", "getMonitorCarrierType", "onBindError", "onBindSuccess", "Lcom/bytedance/sdk/account/api/call/MobileApiResponse;", "Lcom/bytedance/sdk/account/mobile/query/OneBindMobileQueryObj;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public class b extends c {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f31975e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final Context f31976f;
    @NotNull
    public final AbsFragment g;
    @NotNull
    public final String h;
    public final OneLoginPhoneBean i;
    @NotNull
    public final Function0<Unit> j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f31977a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f31978b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f31979c;

        a(b bVar, Ref.ObjectRef objectRef) {
            this.f31978b = bVar;
            this.f31979c = objectRef;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00fa, code lost:
            if (r3 == null) goto L_0x00fc;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.content.DialogInterface r11, int r12) {
            /*
                r10 = this;
                r7 = 2
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r11
                java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
                r9 = 1
                r0[r9] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f31977a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.content.DialogInterface> r1 = android.content.DialogInterface.class
                r5[r8] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 20024(0x4e38, float:2.806E-41)
                r1 = r10
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0045
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r11
                java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
                r0[r9] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f31977a
                r3 = 0
                r4 = 20024(0x4e38, float:2.806E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.content.DialogInterface> r1 = android.content.DialogInterface.class
                r5[r8] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0045:
                kotlin.jvm.internal.Ref$ObjectRef r0 = r10.f31979c
                T r0 = r0.element
                java.lang.String r0 = (java.lang.String) r0
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x0107
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r1 = r10.f31979c
                T r1 = r1.element
                java.lang.String r1 = (java.lang.String) r1
                java.util.Map r1 = com.ss.android.account.token.a.a((java.lang.String) r1)
                if (r1 == 0) goto L_0x008a
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L_0x006c:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x008a
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r2 = r2.getValue()
                java.lang.String r2 = (java.lang.String) r2
                r0.put(r3, r2)     // Catch:{ Exception -> 0x0088 }
                goto L_0x006c
            L_0x0088:
                goto L_0x006c
            L_0x008a:
                kotlin.jvm.internal.Ref$ObjectRef r1 = r10.f31979c
                kotlin.jvm.internal.Ref$ObjectRef r2 = r10.f31979c
                T r2 = r2.element
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r2 = com.ss.android.common.applog.AppLog.addCommonParams(r2, r8)
                if (r2 != 0) goto L_0x009a
                java.lang.String r2 = ""
            L_0x009a:
                r1.element = r2
                java.lang.Class<com.ss.android.ugc.aweme.main.h.v> r1 = com.ss.android.ugc.aweme.main.h.v.class
                java.lang.Object r1 = com.ss.android.ugc.aweme.w.a((java.lang.Class<T>) r1)
                com.ss.android.ugc.aweme.main.h.v r1 = (com.ss.android.ugc.aweme.main.h.v) r1
                android.app.Application r2 = com.ss.android.ugc.aweme.w.b()
                java.lang.String r3 = "ModuleStore.getApplication()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                android.content.Context r2 = (android.content.Context) r2
                kotlin.jvm.internal.Ref$ObjectRef r3 = r10.f31979c
                T r3 = r3.element
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r0 = r0.toString()
                java.lang.String r4 = "tokens.toString()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
                r1.a((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r0)
                java.lang.String r0 = "phone_bundling_conflict_check"
                com.ss.android.ugc.aweme.account.a.a.b r1 = new com.ss.android.ugc.aweme.account.a.a.b
                r1.<init>()
                java.lang.String r2 = "enter_from"
                java.lang.String r3 = "log_in"
                com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "platform"
                com.ss.android.ugc.aweme.account.h.b r3 = r10.f31978b
                java.lang.String r3 = r3.h
                java.lang.String r3 = com.ss.android.ugc.aweme.account.util.d.a(r3)
                if (r3 != 0) goto L_0x00de
                java.lang.String r3 = ""
            L_0x00de:
                java.lang.String r3 = com.ss.android.ugc.aweme.account.k.a.a((java.lang.String) r3)
                com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "is_one_click"
                java.lang.String r3 = "1"
                com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "carrier"
                com.ss.android.ugc.aweme.account.h.b r3 = r10.f31978b
                com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean r3 = r3.i
                if (r3 == 0) goto L_0x00fc
                java.lang.String r3 = r3.getFromMobLabel()
                if (r3 != 0) goto L_0x00fe
            L_0x00fc:
                java.lang.String r3 = ""
            L_0x00fe:
                com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f31599b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            L_0x0107:
                r11.dismiss()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.h.b.a.onClick(android.content.DialogInterface, int):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.ss.android.ugc.aweme.account.h.b$b  reason: collision with other inner class name */
    static final class C0405b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f31980a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f31981b;

        C0405b(b bVar) {
            this.f31981b = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x007e, code lost:
            if (r3 == null) goto L_0x0080;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.content.DialogInterface r11, int r12) {
            /*
                r10 = this;
                r7 = 2
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r11
                java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
                r9 = 1
                r0[r9] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f31980a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.content.DialogInterface> r1 = android.content.DialogInterface.class
                r5[r8] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 20025(0x4e39, float:2.8061E-41)
                r1 = r10
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0045
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r11
                java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
                r0[r9] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f31980a
                r3 = 0
                r4 = 20025(0x4e39, float:2.8061E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.content.DialogInterface> r1 = android.content.DialogInterface.class
                r5[r8] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0045:
                java.lang.String r0 = "phone_bundling_conflict_cancel"
                com.ss.android.ugc.aweme.account.a.a.b r1 = new com.ss.android.ugc.aweme.account.a.a.b
                r1.<init>()
                java.lang.String r2 = "enter_from"
                java.lang.String r3 = "log_in"
                com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "platform"
                com.ss.android.ugc.aweme.account.h.b r3 = r10.f31981b
                java.lang.String r3 = r3.h
                java.lang.String r3 = com.ss.android.ugc.aweme.account.util.d.a(r3)
                if (r3 != 0) goto L_0x0062
                java.lang.String r3 = ""
            L_0x0062:
                java.lang.String r3 = com.ss.android.ugc.aweme.account.k.a.a((java.lang.String) r3)
                com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "is_one_click"
                java.lang.String r3 = "1"
                com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "carrier"
                com.ss.android.ugc.aweme.account.h.b r3 = r10.f31981b
                com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean r3 = r3.i
                if (r3 == 0) goto L_0x0080
                java.lang.String r3 = r3.getFromMobLabel()
                if (r3 != 0) goto L_0x0082
            L_0x0080:
                java.lang.String r3 = ""
            L_0x0082:
                com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f31599b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
                r11.dismiss()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.h.b.C0405b.onClick(android.content.DialogInterface, int):void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r0 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f31975e
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 20023(0x4e37, float:2.8058E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f31975e
            r5 = 0
            r6 = 20023(0x4e37, float:2.8058E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0026:
            com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean r0 = r9.i
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r0.getFrom()
            if (r0 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            java.lang.String r0 = ""
        L_0x0033:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = ""
            return r0
        L_0x003e:
            java.lang.String r0 = ""
            com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean r1 = r9.i
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r1.getFrom()
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            if (r1 != 0) goto L_0x004d
            goto L_0x0081
        L_0x004d:
            int r2 = r1.hashCode()
            r3 = -1429363305(0xffffffffaacda597, float:-3.6530216E-13)
            if (r2 == r3) goto L_0x0077
            r3 = -1068855134(0xffffffffc04a90a2, float:-3.1650777)
            if (r2 == r3) goto L_0x006c
            r3 = -840542575(0xffffffffcde65691, float:-4.83054112E8)
            if (r2 == r3) goto L_0x0061
            goto L_0x0081
        L_0x0061:
            java.lang.String r2 = "unicom"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = "ChinaUnicom"
            goto L_0x0081
        L_0x006c:
            java.lang.String r2 = "mobile"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = "ChinaMobile"
            goto L_0x0081
        L_0x0077:
            java.lang.String r2 = "telecom"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = "ChinaTelecom"
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.h.b.a():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007b, code lost:
        if (r3 == null) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(@org.jetbrains.annotations.NotNull com.bytedance.sdk.account.api.call.c<com.bytedance.sdk.account.f.a.g> r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f31975e
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.sdk.account.api.call.c> r1 = com.bytedance.sdk.account.api.call.c.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 20020(0x4e34, float:2.8054E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f31975e
            r3 = 0
            r4 = 20020(0x4e34, float:2.8054E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.sdk.account.api.call.c> r1 = com.bytedance.sdk.account.api.call.c.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            com.ss.android.ugc.aweme.account.terminal.d$a r0 = com.ss.android.ugc.aweme.account.terminal.d.f32793c
            java.lang.String r1 = ""
            java.lang.String r2 = r9.a()
            r0.a((int) r8, (int) r8, (java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r0 = "phone_bundling_success"
            com.ss.android.ugc.aweme.account.a.a.b r1 = new com.ss.android.ugc.aweme.account.a.a.b
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "log_in"
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "status"
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (int) r7)
            java.lang.String r2 = "platform"
            java.lang.String r3 = r9.h
            java.lang.String r3 = com.ss.android.ugc.aweme.account.util.d.a(r3)
            if (r3 != 0) goto L_0x0061
            java.lang.String r3 = ""
        L_0x0061:
            java.lang.String r3 = com.ss.android.ugc.aweme.account.k.a.a((java.lang.String) r3)
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "is_one_click"
            java.lang.String r3 = "1"
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "carrier"
            com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean r3 = r9.i
            if (r3 == 0) goto L_0x007d
            java.lang.String r3 = r3.getFromMobLabel()
            if (r3 != 0) goto L_0x007f
        L_0x007d:
            java.lang.String r3 = ""
        L_0x007f:
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f31599b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = com.ss.android.ugc.aweme.w.k()
            if (r0 == 0) goto L_0x00d6
            T r1 = r10.f22251a
            com.bytedance.sdk.account.f.a.g r1 = (com.bytedance.sdk.account.f.a.g) r1
            com.bytedance.sdk.account.k.b r1 = r1.f22377e
            java.lang.String r2 = "response.mobileObj.mUserInfo"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.util.Map r1 = r1.b()
            java.lang.String r2 = "mobile"
            java.lang.Object r1 = r1.get(r2)
            com.ss.android.account.b.a r1 = (com.ss.android.account.b.a) r1
            if (r1 == 0) goto L_0x00aa
            java.lang.String r1 = r1.f2419e
            goto L_0x00ac
        L_0x00aa:
            java.lang.String r1 = ""
        L_0x00ac:
            r0.setPhoneBinded(r7)
            r0.setBindPhone(r1)
            r0 = 7
            com.ss.android.ugc.aweme.j r2 = new com.ss.android.ugc.aweme.j
            if (r1 != 0) goto L_0x00ba
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00ba:
            T r3 = r10.f22251a
            com.bytedance.sdk.account.f.a.g r3 = (com.bytedance.sdk.account.f.a.g) r3
            com.bytedance.sdk.account.k.b r3 = r3.f22377e
            java.lang.String r4 = "response.mobileObj.mUserInfo"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            org.json.JSONObject r3 = r3.f22520e
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "response.mobileObj.mUserInfo.rawData.toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            r2.<init>(r1, r3)
            com.ss.android.ugc.aweme.w.a((int) r0, (int) r7, (java.lang.Object) r2)
        L_0x00d6:
            com.bytedance.ies.uikit.base.AbsFragment r0 = r9.g
            boolean r0 = r0.isViewValid()
            if (r0 == 0) goto L_0x0108
            com.bytedance.ies.uikit.base.AbsFragment r0 = r9.g
            android.support.v4.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x0108
            com.bytedance.ies.uikit.base.AbsFragment r0 = r9.g
            android.support.v4.app.FragmentActivity r0 = r0.getActivity()
            boolean r0 = r0 instanceof android.support.v4.app.FragmentActivity
            if (r0 == 0) goto L_0x0108
            com.bytedance.ies.uikit.base.AbsFragment r0 = r9.g
            android.support.v4.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x0100
            r1 = -1
            r0.setResult(r1)
            r0.finish()
            goto L_0x0108
        L_0x0100:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.h.b.a(com.bytedance.sdk.account.api.call.c):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0099, code lost:
        if (r3 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01a5, code lost:
        if (r3 == null) goto L_0x01a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(@org.jetbrains.annotations.NotNull com.bytedance.sdk.account.i.b.b r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f31975e
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.sdk.account.i.b.b> r1 = com.bytedance.sdk.account.i.b.b.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 20021(0x4e35, float:2.8055E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f31975e
            r3 = 0
            r4 = 20021(0x4e35, float:2.8055E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.sdk.account.i.b.b> r1 = com.bytedance.sdk.account.i.b.b.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            java.lang.String r0 = r10.f22434a     // Catch:{ Exception -> 0x004a }
            if (r0 != 0) goto L_0x003c
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ Exception -> 0x004a }
        L_0x003c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x004a }
            java.lang.String r1 = "Integer.valueOf(response.platformErrorCode!!)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)     // Catch:{ Exception -> 0x004a }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x004a }
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            com.ss.android.ugc.aweme.account.terminal.d$a r1 = com.ss.android.ugc.aweme.account.terminal.d.f32793c
            java.lang.String r2 = r10.f22435b
            java.lang.String r3 = r9.a()
            r1.a((int) r7, (int) r0, (java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r0 = "phone_bundling_success"
            com.ss.android.ugc.aweme.account.a.a.b r1 = new com.ss.android.ugc.aweme.account.a.a.b
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "log_in"
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "status"
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (int) r8)
            java.lang.String r2 = "error_code"
            java.lang.String r3 = r10.f22434a
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "platform"
            java.lang.String r3 = r9.h
            java.lang.String r3 = com.ss.android.ugc.aweme.account.util.d.a(r3)
            if (r3 != 0) goto L_0x007f
            java.lang.String r3 = ""
        L_0x007f:
            java.lang.String r3 = com.ss.android.ugc.aweme.account.k.a.a((java.lang.String) r3)
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "is_one_click"
            java.lang.String r3 = "1"
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "carrier"
            com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean r3 = r9.i
            if (r3 == 0) goto L_0x009b
            java.lang.String r3 = r3.getFromMobLabel()
            if (r3 != 0) goto L_0x009d
        L_0x009b:
            java.lang.String r3 = ""
        L_0x009d:
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f31599b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            java.lang.String r0 = r10.f22434a     // Catch:{ Exception -> 0x00b6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r1 = "Integer.valueOf(response.platformErrorCode)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)     // Catch:{ Exception -> 0x00b6 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            r1 = 1057(0x421, float:1.481E-42)
            if (r0 != r1) goto L_0x01b3
            java.lang.String r0 = r9.h
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "authorize_force_bind"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x00d6
            android.content.Context r0 = r9.f31976f
            r1 = 2131558482(0x7f0d0052, float:1.8742281E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1)
            r0.a()
            return
        L_0x00d6:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f31975e
            r3 = 0
            r4 = 20022(0x4e36, float:2.8057E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.sdk.account.i.b.b> r1 = com.bytedance.sdk.account.i.b.b.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0105
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f31975e
            r3 = 0
            r4 = 20022(0x4e36, float:2.8057E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.sdk.account.i.b.b> r1 = com.bytedance.sdk.account.i.b.b.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01b8
        L_0x0105:
            com.bytedance.ies.uikit.base.AbsFragment r0 = r9.g
            boolean r0 = r0.isViewValid()
            if (r0 == 0) goto L_0x01b8
            com.bytedance.ies.uikit.base.AbsFragment r0 = r9.g
            android.content.Context r0 = r0.getContext()
            if (r0 != 0) goto L_0x0117
            goto L_0x01b8
        L_0x0117:
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            java.lang.String r1 = ""
            r0.element = r1
            boolean r1 = r10 instanceof com.bytedance.sdk.account.i.b.d
            if (r1 == 0) goto L_0x0130
            r1 = r10
            com.bytedance.sdk.account.i.b.d r1 = (com.bytedance.sdk.account.i.b.d) r1
            java.lang.String r1 = r1.g
            java.lang.String r2 = "response.mConfirmSwitchBindUrl"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r0.element = r1
        L_0x0130:
            com.bytedance.ies.dmt.ui.b.a$a r1 = new com.bytedance.ies.dmt.ui.b.a$a
            com.bytedance.ies.uikit.base.AbsFragment r2 = r9.g
            android.content.Context r2 = r2.getContext()
            r1.<init>(r2)
            r2 = 2131558913(0x7f0d0201, float:1.8743155E38)
            com.bytedance.ies.dmt.ui.b.a$a r1 = r1.a((int) r2)
            r2 = 2131558911(0x7f0d01ff, float:1.8743151E38)
            com.bytedance.ies.dmt.ui.b.a$a r1 = r1.b((int) r2)
            r2 = 2131558910(0x7f0d01fe, float:1.874315E38)
            com.ss.android.ugc.aweme.account.h.b$a r3 = new com.ss.android.ugc.aweme.account.h.b$a
            r3.<init>(r9, r0)
            android.content.DialogInterface$OnClickListener r3 = (android.content.DialogInterface.OnClickListener) r3
            com.bytedance.ies.dmt.ui.b.a$a r0 = r1.a((int) r2, (android.content.DialogInterface.OnClickListener) r3)
            r1 = 2131558909(0x7f0d01fd, float:1.8743147E38)
            com.ss.android.ugc.aweme.account.h.b$b r2 = new com.ss.android.ugc.aweme.account.h.b$b
            r2.<init>(r9)
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.b((int) r1, (android.content.DialogInterface.OnClickListener) r2)
            com.bytedance.ies.dmt.ui.b.a r0 = r0.a()
            android.app.Dialog r0 = r0.a()
            r0.setCanceledOnTouchOutside(r8)
            java.lang.String r0 = "phone_bundling_conflict_alert"
            com.ss.android.ugc.aweme.account.a.a.b r1 = new com.ss.android.ugc.aweme.account.a.a.b
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "log_in"
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "platform"
            java.lang.String r3 = r9.h
            java.lang.String r3 = com.ss.android.ugc.aweme.account.util.d.a(r3)
            if (r3 != 0) goto L_0x018b
            java.lang.String r3 = ""
        L_0x018b:
            java.lang.String r3 = com.ss.android.ugc.aweme.account.k.a.a((java.lang.String) r3)
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "is_one_click"
            java.lang.String r3 = "1"
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "carrier"
            com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean r3 = r9.i
            if (r3 == 0) goto L_0x01a7
            java.lang.String r3 = r3.getFromMobLabel()
            if (r3 != 0) goto L_0x01a9
        L_0x01a7:
            java.lang.String r3 = ""
        L_0x01a9:
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f31599b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            return
        L_0x01b3:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r9.j
            r0.invoke()
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.h.b.a(com.bytedance.sdk.account.i.b.b):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @NotNull AbsFragment absFragment, @NotNull String str, @Nullable OneLoginPhoneBean oneLoginPhoneBean, @NotNull Function0<Unit> function0) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(absFragment, "fragment");
        Intrinsics.checkParameterIsNotNull(str, "enterFrom");
        Intrinsics.checkParameterIsNotNull(function0, "errorBlock");
        this.f31976f = context;
        this.g = absFragment;
        this.h = str;
        this.i = oneLoginPhoneBean;
        this.j = function0;
    }
}
