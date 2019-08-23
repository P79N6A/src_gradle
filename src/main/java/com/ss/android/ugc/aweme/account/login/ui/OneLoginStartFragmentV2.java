package com.ss.android.ugc.aweme.account.login.ui;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.bytedance.sdk.account.api.c.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;
import com.ss.android.ugc.aweme.account.login.c;
import com.ss.android.ugc.aweme.account.login.ui.ThirdPartyLoginView;
import com.ss.android.ugc.aweme.account.util.d;
import com.ss.android.ugc.aweme.account.util.i;
import com.ss.android.ugc.aweme.account.util.l;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.account.util.p;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.main.h.v;
import com.ss.android.ugc.aweme.w;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0014J\b\u0010\u001a\u001a\u00020\u0012H\u0014J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\"\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010%\u001a\u0004\u0018\u00010\u00142\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010$\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010*\u001a\u00020\u0012H\u0016J\u001a\u0010+\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/ui/OneLoginStartFragmentV2;", "Lcom/ss/android/ugc/aweme/account/login/ui/OneLoginStartFragment;", "()V", "carrierHint", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "currentPageResume", "", "mOneLoginCallback", "Lcom/ss/android/ugc/aweme/account/login/onelogin/CommonOneLoginListener;", "mOnekeyLoginService", "Lcom/bytedance/sdk/account/platform/api/IOnekeyLoginService;", "phoneNum", "privacyView", "Lcom/ss/android/ugc/aweme/account/login/ui/OneLoginPrivacyViewForV2;", "statusDialog", "Lcom/ss/android/ugc/aweme/account/dialog/AccountStatusViewDialog;", "tvUsePhone", "adjustStatusBar", "", "view", "Landroid/view/View;", "getLoginSuccessBundle", "Landroid/os/Bundle;", "getMonitorCarrierType", "", "handleClickOneLogin", "handleClickUsePhone", "initCarrierView", "jumpToNormalPageAfterError", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class OneLoginStartFragmentV2 extends OneLoginStartFragment {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f32521d;

    /* renamed from: e  reason: collision with root package name */
    public OneLoginPrivacyViewForV2 f32522e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.account.d.a f32523f;
    private DmtTextView g;
    private DmtTextView h;
    private DmtTextView i;
    private com.bytedance.sdk.account.i.a.b p;
    private boolean q;
    private com.ss.android.ugc.aweme.account.login.c.a r;
    private HashMap s;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/account/login/ui/OneLoginStartFragmentV2$onCreate$1", "Lcom/ss/android/ugc/aweme/account/login/onelogin/CommonOneLoginListener;", "onGetTokenError", "", "response", "Lcom/bytedance/sdk/account/platform/base/AuthorizeErrorResponse;", "onLoginByTokenError", "onLoginSuccess", "Lcom/bytedance/sdk/account/api/response/LoginByTicketResponse;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a extends com.ss.android.ugc.aweme.account.login.c.a {
        public static ChangeQuickRedirect h;
        final /* synthetic */ OneLoginStartFragmentV2 i;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 13})
        /* renamed from: com.ss.android.ugc.aweme.account.login.ui.OneLoginStartFragmentV2$a$a  reason: collision with other inner class name */
        static final class C0413a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32524a;

            /* renamed from: b  reason: collision with root package name */
            public static final C0413a f32525b = new C0413a();

            C0413a() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32524a, false, 20695, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32524a, false, 20695, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                Application b2 = w.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "ModuleStore.getApplication()");
                String format = String.format("https://security.snssdk.com/passport/safe/aweme/unlock.html?did=%s", Arrays.copyOf(new Object[]{AppLog.getServerDeviceId()}, 1));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                ((v) w.a(v.class)).a((Context) b2, format, true);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 13})
        static final class b implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static final b f32526a = new b();

            b() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public final void a(@NotNull e eVar) {
            FragmentActivity fragmentActivity;
            if (PatchProxy.isSupport(new Object[]{eVar}, this, h, false, 20692, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, h, false, 20692, new Class[]{e.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(eVar, "response");
            super.a(eVar);
            if (eVar.f22248c != null) {
                FragmentActivity activity = this.i.getActivity();
                if (activity != null) {
                    if (!(activity instanceof c)) {
                        fragmentActivity = null;
                    } else {
                        fragmentActivity = activity;
                    }
                    c cVar = (c) fragmentActivity;
                    if (cVar != null) {
                        cVar.a(true);
                    }
                    if (!(activity instanceof com.ss.android.ugc.aweme.account.login.b)) {
                        activity = null;
                    }
                    com.ss.android.ugc.aweme.account.login.b bVar = (com.ss.android.ugc.aweme.account.login.b) activity;
                    if (bVar != null) {
                        bVar.a(this.i.f());
                    }
                }
                com.ss.android.ugc.aweme.account.d.a aVar = this.i.f32523f;
                if (aVar != null) {
                    aVar.dismiss();
                }
                n.d(true);
            }
        }

        public final void d(@NotNull com.bytedance.sdk.account.i.b.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, h, false, 20694, new Class[]{com.bytedance.sdk.account.i.b.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, h, false, 20694, new Class[]{com.bytedance.sdk.account.i.b.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar, "response");
            super.d(bVar);
            com.ss.android.ugc.aweme.account.d.a aVar = this.i.f32523f;
            if (aVar != null) {
                aVar.dismiss();
            }
            this.i.g();
        }

        public final void c(@NotNull com.bytedance.sdk.account.i.b.b bVar) {
            int i2;
            com.bytedance.sdk.account.i.b.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, h, false, 20693, new Class[]{com.bytedance.sdk.account.i.b.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2}, this, h, false, 20693, new Class[]{com.bytedance.sdk.account.i.b.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar2, "response");
            super.c(bVar);
            com.ss.android.ugc.aweme.account.d.a aVar = this.i.f32523f;
            if (aVar != null) {
                aVar.dismiss();
            }
            try {
                String str = bVar2.f22434a;
                if (str == null) {
                    str = PushConstants.PUSH_TYPE_NOTIFY;
                }
                Integer valueOf = Integer.valueOf(str);
                Intrinsics.checkExpressionValueIsNotNull(valueOf, "Integer.valueOf(response.platformErrorCode ?: \"0\")");
                i2 = valueOf.intValue();
            } catch (Exception unused) {
                i2 = 0;
            }
            if (this.i.isViewValid()) {
                FragmentActivity activity = this.i.getActivity();
                if (!(activity instanceof c)) {
                    activity = null;
                }
                c cVar = (c) activity;
                if (cVar != null) {
                    cVar.a(false);
                }
                if (i2 != 1075) {
                    if (d.f33086b.contains(Integer.valueOf(i2))) {
                        FragmentActivity activity2 = this.i.getActivity();
                        if (activity2 != null) {
                            com.bytedance.ies.dmt.ui.d.a.b((Context) activity2, (int) C0906R.string.dqv).a();
                            activity2.finish();
                        }
                    } else if (i2 == 2003 || i2 == 2004) {
                        AlertDialog.Builder a2 = p.a(this.i.getContext());
                        a2.setMessage((CharSequence) bVar2.f22435b);
                        a2.setPositiveButton((int) C0906R.string.do4, (DialogInterface.OnClickListener) C0413a.f32525b);
                        a2.setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) b.f32526a);
                        a2.show();
                    }
                    w.a(4, 3, (Object) bVar2.f22435b);
                    this.i.g();
                } else if (bVar2 instanceof com.bytedance.sdk.account.i.b.d) {
                    Context activity3 = this.i.getActivity();
                    JSONObject jSONObject = ((com.bytedance.sdk.account.i.b.d) bVar2).f22437c;
                    FragmentActivity activity4 = this.i.getActivity();
                    if (activity4 != null) {
                        com.ss.android.ugc.aweme.account.login.a aVar2 = new com.ss.android.ugc.aweme.account.login.a(activity3, i2, jSONObject, null, (com.ss.android.ugc.aweme.account.login.b) activity4, this.i.f());
                        com.ss.android.ugc.aweme.account.login.d.a(aVar2);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.ILoginFinish");
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(OneLoginStartFragmentV2 oneLoginStartFragmentV2, Context context, OneLoginPhoneBean oneLoginPhoneBean, String str) {
            super(context, oneLoginPhoneBean, str);
            this.i = oneLoginStartFragmentV2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "intercept"}, k = 3, mv = {1, 1, 13})
    static final class b implements ThirdPartyLoginView.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32527a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneLoginStartFragmentV2 f32528b;

        b(OneLoginStartFragmentV2 oneLoginStartFragmentV2) {
            this.f32528b = oneLoginStartFragmentV2;
        }

        public final boolean a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f32527a, false, 20696, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f32527a, false, 20696, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else if (OneLoginStartFragmentV2.a(this.f32528b).f32495b) {
                return false;
            } else {
                OneLoginStartFragmentV2.a(this.f32528b).a();
                return true;
            }
        }
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f32521d, false, 20689, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32521d, false, 20689, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (w.h() && this.q) {
            n.d(true);
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f32521d, false, 20691, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32521d, false, 20691, new Class[0], Void.TYPE);
            return;
        }
        if (this.s != null) {
            this.s.clear();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f32521d, false, 20686, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32521d, false, 20686, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        OneLoginPrivacyViewForV2 oneLoginPrivacyViewForV2 = this.f32522e;
        if (oneLoginPrivacyViewForV2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("privacyView");
        }
        if (PatchProxy.isSupport(new Object[0], oneLoginPrivacyViewForV2, OneLoginPrivacyViewForV2.f32494a, false, 20653, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], oneLoginPrivacyViewForV2, OneLoginPrivacyViewForV2.f32494a, false, 20653, new Class[0], Void.TYPE);
        } else {
            com.bytedance.ies.dmt.ui.a.b bVar = oneLoginPrivacyViewForV2.f32496c;
            if (bVar != null) {
                bVar.f();
            }
            oneLoginPrivacyViewForV2.f32498e = false;
        }
        this.q = false;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f32521d, false, 20680, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32521d, false, 20680, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.ies.dmt.ui.d.a.c(com.ss.android.ugc.aweme.account.util.e.a(getContext()), (int) C0906R.string.bk0).a();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (!(activity instanceof LoginOrRegisterActivity)) {
                activity = null;
            }
            LoginOrRegisterActivity loginOrRegisterActivity = (LoginOrRegisterActivity) activity;
            if (loginOrRegisterActivity != null) {
                loginOrRegisterActivity.c(i.a(LoginOrRegisterFragment.class, getArguments()).a("from_one_login", true).a(), false);
            }
        }
        this.q = false;
    }

    public final Bundle f() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f32521d, false, 20679, new Class[0], Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[0], this, f32521d, false, 20679, new Class[0], Bundle.class);
        }
        Bundle bundle = new Bundle(getArguments());
        bundle.putString("platform", "mobile");
        bundle.putString("login_path", "one_login");
        if (PatchProxy.isSupport(new Object[0], this, f32521d, false, 20684, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], this, f32521d, false, 20684, new Class[0], String.class);
        } else {
            OneLoginPhoneBean oneLoginPhoneBean = this.f32515c;
            Intrinsics.checkExpressionValueIsNotNull(oneLoginPhoneBean, "mPhoneInfo");
            String from = oneLoginPhoneBean.getFrom();
            if (TextUtils.isEmpty(from)) {
                str = "";
            } else {
                if (from != null) {
                    int hashCode = from.hashCode();
                    if (hashCode != -1429363305) {
                        if (hashCode != -1068855134) {
                            if (hashCode == -840542575 && from.equals("unicom")) {
                                str = "ChinaUnicom";
                            }
                        } else if (from.equals("mobile")) {
                            str = "ChinaMobile";
                        }
                    } else if (from.equals("telecom")) {
                        str = "ChinaTelecom";
                    }
                }
                str = "";
            }
        }
        bundle.putString("carrier_type", str);
        return bundle;
    }

    public final void e() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f32521d, false, 20687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32521d, false, 20687, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.account.a.a.b a2 = new com.ss.android.ugc.aweme.account.a.a.b().a("enter_method", this.n);
        OneLoginPhoneBean oneLoginPhoneBean = this.f32515c;
        Intrinsics.checkExpressionValueIsNotNull(oneLoginPhoneBean, "mPhoneInfo");
        r.a("click_one_click_login", (Map) a2.a("carrier", oneLoginPhoneBean.getFromMobLabel()).f31599b);
        OneLoginPrivacyViewForV2 oneLoginPrivacyViewForV2 = this.f32522e;
        if (oneLoginPrivacyViewForV2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("privacyView");
        }
        if (!oneLoginPrivacyViewForV2.f32495b) {
            OneLoginPrivacyViewForV2 oneLoginPrivacyViewForV22 = this.f32522e;
            if (oneLoginPrivacyViewForV22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("privacyView");
            }
            oneLoginPrivacyViewForV22.a();
            return;
        }
        if (getActivity() != null && (getActivity() instanceof FragmentActivity)) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
            Activity activity2 = activity;
            FragmentActivity activity3 = getActivity();
            if (activity3 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(activity3, "activity!!");
            String string = getString(C0906R.string.bjr);
            Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.one_key_login_loading)");
            com.ss.android.ugc.aweme.account.view.c cVar = new com.ss.android.ugc.aweme.account.view.c(activity3, string, null, 0, 12);
            this.f32523f = new com.ss.android.ugc.aweme.account.d.a(activity2, cVar);
            com.ss.android.ugc.aweme.account.d.a aVar = this.f32523f;
            if (aVar != null) {
                aVar.show();
            }
        }
        if (this.p == null) {
            this.p = (com.bytedance.sdk.account.i.a.b) com.bytedance.sdk.account.i.b.c.a(com.bytedance.sdk.account.i.a.b.class);
        }
        com.bytedance.sdk.account.i.a.b bVar = this.p;
        if (bVar != null) {
            com.bytedance.sdk.account.i.a.b bVar2 = this.p;
            if (bVar2 != null) {
                str = bVar2.a();
            } else {
                str = "";
            }
            com.ss.android.ugc.aweme.account.login.c.a aVar2 = this.r;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOneLoginCallback");
            }
            bVar.b(str, aVar2);
        }
        com.ss.android.ugc.aweme.account.login.c.a aVar3 = this.r;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOneLoginCallback");
        }
        aVar3.f32183f = System.currentTimeMillis();
        com.ss.android.ugc.aweme.account.a.a.b a3 = com.ss.android.ugc.aweme.account.a.a.b.a().a("enter_from", this.m).a("enter_method", this.n).a("platform", "one_click");
        OneLoginPhoneBean oneLoginPhoneBean2 = this.f32515c;
        Intrinsics.checkExpressionValueIsNotNull(oneLoginPhoneBean2, "mPhoneInfo");
        r.a("login_submit", (Map) a3.a("carrier", oneLoginPhoneBean2.getFromMobLabel()).f31599b);
    }

    @NotNull
    public static final /* synthetic */ OneLoginPrivacyViewForV2 a(OneLoginStartFragmentV2 oneLoginStartFragmentV2) {
        OneLoginPrivacyViewForV2 oneLoginPrivacyViewForV2 = oneLoginStartFragmentV2.f32522e;
        if (oneLoginPrivacyViewForV2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("privacyView");
        }
        return oneLoginPrivacyViewForV2;
    }

    public final void c(@Nullable View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f32521d, false, 20688, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f32521d, false, 20688, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view2 != null) {
            View findViewById = view2.findViewById(C0906R.id.ci4);
            if (findViewById != null) {
                findViewById.setPadding(0, com.ss.android.ugc.aweme.base.utils.p.c(), 0, 0);
            }
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32521d, false, 20678, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32521d, false, 20678, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Context a2 = com.ss.android.ugc.aweme.account.util.e.a(getContext());
        OneLoginPhoneBean oneLoginPhoneBean = this.f32515c;
        Intrinsics.checkExpressionValueIsNotNull(oneLoginPhoneBean, "mPhoneInfo");
        this.r = new a(this, a2, oneLoginPhoneBean, this.n);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i2;
        CharSequence charSequence;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f32521d, false, 20682, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f32521d, false, 20682, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view2.findViewById(C0906R.id.bxn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.phone_num)");
        this.g = (DmtTextView) findViewById;
        View findViewById2 = view2.findViewById(C0906R.id.qt);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.carrier_hint)");
        this.h = (DmtTextView) findViewById2;
        View findViewById3 = view2.findViewById(C0906R.id.c6b);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.privacy_view)");
        this.f32522e = (OneLoginPrivacyViewForV2) findViewById3;
        View findViewById4 = view2.findViewById(C0906R.id.dla);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.tv_use_phone)");
        this.i = (DmtTextView) findViewById4;
        View findViewById5 = view2.findViewById(C0906R.id.dn_);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "view.findViewById<View>(R.id.txt_login_privacy)");
        findViewById5.setVisibility(8);
        View findViewById6 = view2.findViewById(C0906R.id.dna);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "view.findViewById<View>(….txt_login_user_protocol)");
        findViewById6.setVisibility(8);
        View findViewById7 = view2.findViewById(C0906R.id.bbv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "view.findViewById<View>(R.id.line_split)");
        findViewById7.setVisibility(8);
        DmtTextView dmtTextView = this.g;
        if (dmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phoneNum");
        }
        OneLoginPhoneBean oneLoginPhoneBean = this.f32515c;
        Intrinsics.checkExpressionValueIsNotNull(oneLoginPhoneBean, "mPhoneInfo");
        dmtTextView.setText(oneLoginPhoneBean.getMobile());
        DmtTextView dmtTextView2 = this.i;
        if (dmtTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvUsePhone");
        }
        l lVar = l.f33099b;
        if (PatchProxy.isSupport(new Object[0], lVar, l.f33098a, false, 21338, new Class[0], Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], lVar, l.f33098a, false, 21338, new Class[0], Integer.TYPE)).intValue();
        } else if (lVar.a() != 2) {
            i2 = C0906R.string.bk6;
        } else {
            i2 = C0906R.string.bk2;
        }
        dmtTextView2.setText(i2);
        if (PatchProxy.isSupport(new Object[0], this, f32521d, false, 20683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32521d, false, 20683, new Class[0], Void.TYPE);
        } else {
            DmtTextView dmtTextView3 = this.h;
            if (dmtTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("carrierHint");
            }
            OneLoginPhoneBean oneLoginPhoneBean2 = this.f32515c;
            Intrinsics.checkExpressionValueIsNotNull(oneLoginPhoneBean2, "mPhoneInfo");
            if (TextUtils.equals(oneLoginPhoneBean2.getFrom(), "mobile")) {
                String b2 = o.b(C0906R.string.bk1);
                Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtils.getString(R.string.one_login_operator)");
                String format = String.format(b2, Arrays.copyOf(new Object[]{o.b(C0906R.string.bju)}, 1));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                charSequence = format;
            } else {
                OneLoginPhoneBean oneLoginPhoneBean3 = this.f32515c;
                Intrinsics.checkExpressionValueIsNotNull(oneLoginPhoneBean3, "mPhoneInfo");
                if (TextUtils.equals(oneLoginPhoneBean3.getFrom(), "telecom")) {
                    String b3 = o.b(C0906R.string.bk1);
                    Intrinsics.checkExpressionValueIsNotNull(b3, "ResUtils.getString(R.string.one_login_operator)");
                    String format2 = String.format(b3, Arrays.copyOf(new Object[]{o.b(C0906R.string.bjw)}, 1));
                    Intrinsics.checkExpressionValueIsNotNull(format2, "java.lang.String.format(format, *args)");
                    charSequence = format2;
                } else {
                    OneLoginPhoneBean oneLoginPhoneBean4 = this.f32515c;
                    Intrinsics.checkExpressionValueIsNotNull(oneLoginPhoneBean4, "mPhoneInfo");
                    if (TextUtils.equals(oneLoginPhoneBean4.getFrom(), "unicom")) {
                        String b4 = o.b(C0906R.string.bk1);
                        Intrinsics.checkExpressionValueIsNotNull(b4, "ResUtils.getString(R.string.one_login_operator)");
                        String format3 = String.format(b4, Arrays.copyOf(new Object[]{o.b(C0906R.string.bjy)}, 1));
                        Intrinsics.checkExpressionValueIsNotNull(format3, "java.lang.String.format(format, *args)");
                        charSequence = format3;
                    } else {
                        charSequence = "";
                    }
                }
            }
            dmtTextView3.setText(charSequence);
            OneLoginPrivacyViewForV2 oneLoginPrivacyViewForV2 = this.f32522e;
            if (oneLoginPrivacyViewForV2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("privacyView");
            }
            OneLoginPhoneBean oneLoginPhoneBean5 = this.f32515c;
            Intrinsics.checkExpressionValueIsNotNull(oneLoginPhoneBean5, "mPhoneInfo");
            String from = oneLoginPhoneBean5.getFrom();
            Intrinsics.checkExpressionValueIsNotNull(from, "mPhoneInfo.from");
            oneLoginPrivacyViewForV2.setCarrier(from);
        }
        this.f32514b.setThirdPartyLoginListener(new b(this));
        this.q = true;
    }

    public final void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f32521d, false, 20685, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f32521d, false, 20685, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i2 == 1001 && w.h()) {
            n.d(true);
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32521d, false, 20681, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32521d, false, 20681, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.p8, viewGroup2, false);
    }
}
