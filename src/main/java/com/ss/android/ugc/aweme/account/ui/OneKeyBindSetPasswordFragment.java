package com.ss.android.ugc.aweme.account.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.EditText;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.f.a.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;
import com.ss.android.ugc.aweme.account.login.ui.CheckButton;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0014J\b\u0010\u0015\u001a\u00020\u0006H\u0014J\b\u0010\u0016\u001a\u00020\u0006H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0014J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/account/ui/OneKeyBindSetPasswordFragment;", "Lcom/ss/android/ugc/aweme/account/ui/BaseAccountFragment;", "()V", "mAccountAPI", "Lcom/bytedance/sdk/account/api/IBDAccountAPI;", "mInProgress", "", "mOneBindCallback", "Lcom/ss/android/ugc/aweme/account/listener/OneBindListener;", "mOnekeyLoginService", "Lcom/bytedance/sdk/account/platform/api/IOnekeyLoginService;", "getMOnekeyLoginService", "()Lcom/bytedance/sdk/account/platform/api/IOnekeyLoginService;", "mOnekeyLoginService$delegate", "Lkotlin/Lazy;", "back", "", "configUiType", "", "gotoNormalBindFragment", "initView", "isEnabled", "isNeedFinishActivity", "nextStep", "onPause", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class OneKeyBindSetPasswordFragment extends BaseAccountFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32897a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f32898b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(OneKeyBindSetPasswordFragment.class), "mOnekeyLoginService", "getMOnekeyLoginService()Lcom/bytedance/sdk/account/platform/api/IOnekeyLoginService;"))};
    public static final a g = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public boolean f32899c;

    /* renamed from: e  reason: collision with root package name */
    final Lazy f32900e = LazyKt.lazy(d.INSTANCE);

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.account.h.b f32901f;
    private com.bytedance.sdk.account.api.d h;
    private HashMap i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/account/ui/OneKeyBindSetPasswordFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/ugc/aweme/account/ui/OneKeyBindSetPasswordFragment;", "bundle", "Landroid/os/Bundle;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32902a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/account/ui/OneKeyBindSetPasswordFragment$initView$1", "Lcom/ss/android/ugc/aweme/account/listener/OneBindListener;", "onBindError", "", "response", "Lcom/bytedance/sdk/account/platform/base/AuthorizeErrorResponse;", "onBindSuccess", "Lcom/bytedance/sdk/account/api/call/MobileApiResponse;", "Lcom/bytedance/sdk/account/mobile/query/OneBindMobileQueryObj;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class b extends com.ss.android.ugc.aweme.account.h.b {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f32903c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ OneKeyBindSetPasswordFragment f32904d;

        public final void a(@NotNull com.bytedance.sdk.account.api.call.c<g> cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f32903c, false, 21142, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f32903c, false, 21142, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar, "response");
            this.f32904d.a((View) this.f32904d.mPasswordEt);
            super.a((com.bytedance.sdk.account.api.call.c) cVar);
        }

        public final void a(@NotNull com.bytedance.sdk.account.i.b.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f32903c, false, 21143, new Class[]{com.bytedance.sdk.account.i.b.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f32903c, false, 21143, new Class[]{com.bytedance.sdk.account.i.b.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar, "response");
            super.a(bVar);
            View view = this.f32904d.mBtnLogin;
            if (!(view instanceof CheckButton)) {
                view = null;
            }
            CheckButton checkButton = (CheckButton) view;
            if (checkButton != null) {
                checkButton.c();
            }
            this.f32904d.f32899c = false;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(OneKeyBindSetPasswordFragment oneKeyBindSetPasswordFragment, Context context, AbsFragment absFragment, String str, OneLoginPhoneBean oneLoginPhoneBean, Function0 function0) {
            super(context, absFragment, str, oneLoginPhoneBean, function0);
            this.f32904d = oneKeyBindSetPasswordFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class c extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ OneKeyBindSetPasswordFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(OneKeyBindSetPasswordFragment oneKeyBindSetPasswordFragment) {
            super(0);
            this.this$0 = oneKeyBindSetPasswordFragment;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 21144, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 21144, new Class[0], Void.TYPE);
                return;
            }
            com.bytedance.ies.dmt.ui.d.a.c(GlobalContext.getContext(), (int) C0906R.string.bjp).a();
            OneKeyBindSetPasswordFragment oneKeyBindSetPasswordFragment = this.this$0;
            if (PatchProxy.isSupport(new Object[0], oneKeyBindSetPasswordFragment, OneKeyBindSetPasswordFragment.f32897a, false, 21135, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], oneKeyBindSetPasswordFragment, OneKeyBindSetPasswordFragment.f32897a, false, 21135, new Class[0], Void.TYPE);
                return;
            }
            FragmentActivity activity = oneKeyBindSetPasswordFragment.getActivity();
            if (!(activity instanceof BaseAccountActivity)) {
                activity = null;
            }
            BaseAccountActivity baseAccountActivity = (BaseAccountActivity) activity;
            if (baseAccountActivity != null) {
                baseAccountActivity.a(BindMobileInputPhoneFragment.a(oneKeyBindSetPasswordFragment.getArguments()), false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/sdk/account/platform/api/IOnekeyLoginService;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class d extends Lambda implements Function0<com.bytedance.sdk.account.i.a.b> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(0);
        }

        public final com.bytedance.sdk.account.i.a.b invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 21145, new Class[0], com.bytedance.sdk.account.i.a.b.class)) {
                return (com.bytedance.sdk.account.i.a.b) com.bytedance.sdk.account.i.b.c.a(com.bytedance.sdk.account.i.a.b.class);
            }
            return (com.bytedance.sdk.account.i.a.b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 21145, new Class[0], com.bytedance.sdk.account.i.a.b.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/account/ui/OneKeyBindSetPasswordFragment$nextStep$1", "Lcom/bytedance/sdk/account/api/callback/CheckPwdCallback;", "onError", "", "response", "Lcom/bytedance/sdk/account/api/response/CheckPwdResponse;", "error", "", "onSuccess", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class e extends com.bytedance.sdk.account.api.a.b {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f32905c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ OneKeyBindSetPasswordFragment f32906d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f32907e;

        public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
            Object value;
            com.bytedance.sdk.account.api.c.b bVar = (com.bytedance.sdk.account.api.c.b) baseApiResponse;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f32905c, false, 21146, new Class[]{com.bytedance.sdk.account.api.c.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f32905c, false, 21146, new Class[]{com.bytedance.sdk.account.api.c.b.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.account.h.b bVar2 = this.f32906d.f32901f;
            if (bVar2 != null) {
                bVar2.a(this.f32907e, 0, null);
            }
            OneKeyBindSetPasswordFragment oneKeyBindSetPasswordFragment = this.f32906d;
            if (PatchProxy.isSupport(new Object[0], oneKeyBindSetPasswordFragment, OneKeyBindSetPasswordFragment.f32897a, false, 21130, new Class[0], com.bytedance.sdk.account.i.a.b.class)) {
                value = PatchProxy.accessDispatch(new Object[0], oneKeyBindSetPasswordFragment, OneKeyBindSetPasswordFragment.f32897a, false, 21130, new Class[0], com.bytedance.sdk.account.i.a.b.class);
            } else {
                value = oneKeyBindSetPasswordFragment.f32900e.getValue();
            }
            com.bytedance.sdk.account.i.a.b bVar3 = (com.bytedance.sdk.account.i.a.b) value;
            if (bVar3 != null) {
                bVar3.b(bVar3.a(), this.f32906d.f32901f);
            }
        }

        e(OneKeyBindSetPasswordFragment oneKeyBindSetPasswordFragment, String str) {
            this.f32906d = oneKeyBindSetPasswordFragment;
            this.f32907e = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x00a1, code lost:
            if (r3 == null) goto L_0x00a3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void a(com.bytedance.sdk.account.api.call.BaseApiResponse r12, int r13) {
            /*
                r11 = this;
                r7 = r12
                com.bytedance.sdk.account.api.c.b r7 = (com.bytedance.sdk.account.api.c.b) r7
                r8 = 2
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r9 = 0
                r0[r9] = r7
                java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
                r10 = 1
                r0[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f32905c
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class<com.bytedance.sdk.account.api.c.b> r1 = com.bytedance.sdk.account.api.c.b.class
                r5[r9] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 21147(0x529b, float:2.9633E-41)
                r1 = r11
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0048
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r0[r9] = r7
                java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
                r0[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f32905c
                r3 = 0
                r4 = 21147(0x529b, float:2.9633E-41)
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class<com.bytedance.sdk.account.api.c.b> r1 = com.bytedance.sdk.account.api.c.b.class
                r5[r9] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r11
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0048:
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
                com.ss.android.ugc.aweme.account.terminal.b$a r0 = com.ss.android.ugc.aweme.account.terminal.b.f32784e
                java.lang.String r1 = "checkPWD"
                int r2 = r7.error
                java.lang.String r3 = r7.errorMsg
                r0.a(r10, r1, r2, r3)
                java.lang.String r0 = "phone_bundling_success"
                com.ss.android.ugc.aweme.account.a.a.b r1 = new com.ss.android.ugc.aweme.account.a.a.b
                r1.<init>()
                java.lang.String r2 = "enter_from"
                java.lang.String r3 = "log_in"
                com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "status"
                com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (int) r9)
                java.lang.String r2 = "error_code"
                com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (int) r13)
                java.lang.String r2 = "platform"
                com.ss.android.ugc.aweme.account.ui.OneKeyBindSetPasswordFragment r3 = r11.f32906d
                java.lang.String r3 = r3.m
                java.lang.String r3 = com.ss.android.ugc.aweme.account.util.d.a(r3)
                if (r3 != 0) goto L_0x0081
                java.lang.String r3 = ""
            L_0x0081:
                java.lang.String r3 = com.ss.android.ugc.aweme.account.k.a.a((java.lang.String) r3)
                com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "is_one_click"
                java.lang.String r3 = "1"
                com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "carrier"
                com.ss.android.ugc.aweme.account.ui.OneKeyBindSetPasswordFragment r3 = r11.f32906d
                android.os.Bundle r3 = r3.getArguments()
                if (r3 == 0) goto L_0x00a3
                java.lang.String r4 = "carrier"
                java.lang.String r3 = r3.getString(r4)
                if (r3 != 0) goto L_0x00a5
            L_0x00a3:
                java.lang.String r3 = ""
            L_0x00a5:
                com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f31599b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
                com.ss.android.ugc.aweme.account.ui.OneKeyBindSetPasswordFragment r0 = r11.f32906d
                boolean r0 = r0.isViewValid()
                if (r0 == 0) goto L_0x00e3
                com.ss.android.ugc.aweme.account.ui.OneKeyBindSetPasswordFragment r0 = r11.f32906d
                android.view.View r0 = r0.mBtnLogin
                boolean r1 = r0 instanceof com.ss.android.ugc.aweme.account.login.ui.CheckButton
                if (r1 != 0) goto L_0x00bf
                r0 = 0
            L_0x00bf:
                com.ss.android.ugc.aweme.account.login.ui.CheckButton r0 = (com.ss.android.ugc.aweme.account.login.ui.CheckButton) r0
                if (r0 == 0) goto L_0x00c6
                r0.c()
            L_0x00c6:
                com.ss.android.ugc.aweme.account.ui.OneKeyBindSetPasswordFragment r0 = r11.f32906d
                r0.f32899c = r9
                java.lang.String r0 = r7.errorMsg
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x00e3
                com.ss.android.ugc.aweme.account.ui.OneKeyBindSetPasswordFragment r0 = r11.f32906d
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = r7.errorMsg
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (java.lang.String) r1)
                r0.a()
            L_0x00e3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.ui.OneKeyBindSetPasswordFragment.e.a(com.bytedance.sdk.account.api.call.BaseApiResponse, int):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneKeyBindSetPasswordFragment f32909b;

        f(OneKeyBindSetPasswordFragment oneKeyBindSetPasswordFragment) {
            this.f32909b = oneKeyBindSetPasswordFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f32908a, false, 21148, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32908a, false, 21148, new Class[0], Void.TYPE);
                return;
            }
            if (this.f32909b.mPasswordEt != null) {
                this.f32909b.mPasswordEt.requestFocus();
                this.f32909b.b(this.f32909b.mPasswordEt);
            }
        }
    }

    public final int w() {
        return 2;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f32897a, false, 21139, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32897a, false, 21139, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.clear();
        }
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f32897a, false, 21136, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32897a, false, 21136, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        a((View) this.mPasswordEt);
    }

    public final void t() {
        if (PatchProxy.isSupport(new Object[0], this, f32897a, false, 21137, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32897a, false, 21137, new Class[0], Void.TYPE);
            return;
        }
        super.t();
        a((View) this.mPasswordEt);
    }

    public final boolean v() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f32897a, false, 21134, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32897a, false, 21134, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mPasswordEt != null) {
            EditText editText = this.mPasswordEt;
            Intrinsics.checkExpressionValueIsNotNull(editText, "mPasswordEt");
            if (editText.getText() != null) {
                EditText editText2 = this.mPasswordEt;
                Intrinsics.checkExpressionValueIsNotNull(editText2, "mPasswordEt");
                if (editText2.getText().length() >= 8) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0090, code lost:
        if (r2 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a0, code lost:
        if (r3 == null) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f32897a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 21131(0x528b, float:2.9611E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f32897a
            r5 = 0
            r6 = 21131(0x528b, float:2.9611E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            android.content.Context r0 = r9.getContext()
            com.bytedance.sdk.account.api.d r0 = com.bytedance.sdk.account.d.d.a(r0)
            r9.h = r0
            android.widget.TextView r0 = r9.mTitleHint
            r1 = 2131562324(0x7f0d0f54, float:1.8750074E38)
            r0.setText(r1)
            android.widget.EditText r0 = r9.mPasswordEt
            java.lang.String r1 = "mPasswordEt"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            android.text.method.TransformationMethod r1 = (android.text.method.TransformationMethod) r1
            r0.setTransformationMethod(r1)
            android.widget.EditText r0 = r9.mPasswordEt
            r1 = 2131560849(0x7f0d0991, float:1.8747082E38)
            r0.setHint(r1)
            android.widget.TextView r0 = r9.mTxtHint
            r1 = 2131561617(0x7f0d0c91, float:1.874864E38)
            r0.setText(r1)
            android.widget.TextView r0 = r9.mPasswordTip
            java.lang.String r1 = "mPasswordTip"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r1 = ""
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.view.View r0 = r9.mBtnLogin
            r1 = 2130838071(0x7f020237, float:1.7281114E38)
            r0.setBackgroundResource(r1)
            com.ss.android.ugc.aweme.account.ui.OneKeyBindSetPasswordFragment$b r0 = new com.ss.android.ugc.aweme.account.ui.OneKeyBindSetPasswordFragment$b
            android.content.Context r4 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r1 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r1)
            r5 = r9
            com.bytedance.ies.uikit.base.AbsFragment r5 = (com.bytedance.ies.uikit.base.AbsFragment) r5
            java.lang.String r1 = r9.m
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = ""
        L_0x007f:
            r6 = r1
            com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean r7 = new com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean
            java.lang.String r1 = ""
            android.os.Bundle r2 = r9.getArguments()
            if (r2 == 0) goto L_0x0092
            java.lang.String r3 = "from"
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L_0x0094
        L_0x0092:
            java.lang.String r2 = ""
        L_0x0094:
            android.os.Bundle r3 = r9.getArguments()
            if (r3 == 0) goto L_0x00a2
            java.lang.String r8 = "carrier"
            java.lang.String r3 = r3.getString(r8)
            if (r3 != 0) goto L_0x00a4
        L_0x00a2:
            java.lang.String r3 = ""
        L_0x00a4:
            r7.<init>(r1, r2, r3)
            com.ss.android.ugc.aweme.account.ui.OneKeyBindSetPasswordFragment$c r1 = new com.ss.android.ugc.aweme.account.ui.OneKeyBindSetPasswordFragment$c
            r1.<init>(r9)
            r8 = r1
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r2 = r0
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.account.h.b r0 = (com.ss.android.ugc.aweme.account.h.b) r0
            r9.f32901f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.ui.OneKeyBindSetPasswordFragment.f():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f0, code lost:
        if (r3 == null) goto L_0x00f2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f32897a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 21133(0x528d, float:2.9614E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f32897a
            r5 = 0
            r6 = 21133(0x528d, float:2.9614E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            android.widget.EditText r1 = r9.mPasswordEt
            if (r1 == 0) goto L_0x0117
            boolean r1 = r9.f32899c
            if (r1 == 0) goto L_0x002d
            goto L_0x0117
        L_0x002d:
            android.widget.EditText r1 = r9.mPasswordEt
            java.lang.String r2 = "mPasswordEt"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r2 = r1.length()
            r3 = 1
            int r2 = r2 - r3
            r4 = r2
            r2 = 0
            r5 = 0
        L_0x0047:
            if (r2 > r4) goto L_0x0067
            if (r5 != 0) goto L_0x004d
            r6 = r2
            goto L_0x004e
        L_0x004d:
            r6 = r4
        L_0x004e:
            char r6 = r1.charAt(r6)
            r7 = 32
            if (r6 > r7) goto L_0x0058
            r6 = 1
            goto L_0x0059
        L_0x0058:
            r6 = 0
        L_0x0059:
            if (r5 != 0) goto L_0x0062
            if (r6 != 0) goto L_0x005f
            r5 = 1
            goto L_0x0047
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x0047
        L_0x0062:
            if (r6 == 0) goto L_0x0067
            int r4 = r4 + -1
            goto L_0x0047
        L_0x0067:
            int r4 = r4 + r3
            java.lang.CharSequence r0 = r1.subSequence(r2, r4)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r1 = 8
            if (r0 < r1) goto L_0x0106
            r1 = 20
            if (r0 <= r1) goto L_0x007e
            goto L_0x0106
        L_0x007e:
            android.widget.EditText r0 = r9.mPasswordEt
            java.lang.String r1 = "mPasswordEt"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x00fe
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r0)
            java.lang.String r0 = r0.toString()
            com.bytedance.sdk.account.api.d r1 = r9.h
            if (r1 == 0) goto L_0x00a7
            com.ss.android.ugc.aweme.account.ui.OneKeyBindSetPasswordFragment$e r2 = new com.ss.android.ugc.aweme.account.ui.OneKeyBindSetPasswordFragment$e
            r2.<init>(r9, r0)
            com.bytedance.sdk.account.api.a.b r2 = (com.bytedance.sdk.account.api.a.b) r2
            r1.a((java.lang.String) r0, (com.bytedance.sdk.account.api.a.b) r2)
        L_0x00a7:
            android.view.View r0 = r9.mBtnLogin
            boolean r1 = r0 instanceof com.ss.android.ugc.aweme.account.login.ui.CheckButton
            if (r1 != 0) goto L_0x00ae
            r0 = 0
        L_0x00ae:
            com.ss.android.ugc.aweme.account.login.ui.CheckButton r0 = (com.ss.android.ugc.aweme.account.login.ui.CheckButton) r0
            if (r0 == 0) goto L_0x00b5
            r0.a()
        L_0x00b5:
            r9.f32899c = r3
            java.lang.String r0 = "phone_bundling_submit"
            com.ss.android.ugc.aweme.account.a.a.b r1 = new com.ss.android.ugc.aweme.account.a.a.b
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "log_in"
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "is_one_click"
            java.lang.String r3 = "1"
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "platform"
            java.lang.String r3 = r9.m
            java.lang.String r3 = com.ss.android.ugc.aweme.account.util.d.a(r3)
            if (r3 != 0) goto L_0x00da
            java.lang.String r3 = ""
        L_0x00da:
            java.lang.String r3 = com.ss.android.ugc.aweme.account.k.a.a((java.lang.String) r3)
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "carrier"
            android.os.Bundle r3 = r9.getArguments()
            if (r3 == 0) goto L_0x00f2
            java.lang.String r4 = "carrier"
            java.lang.String r3 = r3.getString(r4)
            if (r3 != 0) goto L_0x00f4
        L_0x00f2:
            java.lang.String r3 = ""
        L_0x00f4:
            com.ss.android.ugc.aweme.account.a.a.b r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f31599b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            return
        L_0x00fe:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
            r0.<init>(r1)
            throw r0
        L_0x0106:
            android.support.v4.app.FragmentActivity r0 = r9.getActivity()
            android.content.Context r0 = (android.content.Context) r0
            r1 = 2131561618(0x7f0d0c92, float:1.8748642E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)
            r0.a()
            return
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.ui.OneKeyBindSetPasswordFragment.u():void");
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f32897a, false, 21132, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f32897a, false, 21132, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        this.mPasswordEt.postDelayed(new f(this), 500);
    }
}
