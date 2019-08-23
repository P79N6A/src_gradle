package com.ss.android.ugc.aweme.account.fragment;

import a.i;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;
import com.ss.android.ugc.aweme.account.ui.BaseAccountActivity;
import com.ss.android.ugc.aweme.account.ui.BindMobileInputPhoneFragment;
import com.ss.android.ugc.aweme.account.ui.OneKeyBindSetPasswordFragment;
import com.ss.android.ugc.aweme.account.util.k;
import com.ss.android.ugc.aweme.account.util.p;
import com.ss.android.ugc.aweme.account.view.OneBindPrivacyView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.w;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 52\u00020\u0001:\u00015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020\nH\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0002J\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020\u0016H\u0002J\b\u0010)\u001a\u00020$H\u0002J&\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u00062\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020+2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00103\u001a\u00020$H\u0002J\b\u00104\u001a\u00020$H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/ugc/aweme/account/fragment/OneKeyBindFragment;", "Lcom/ss/android/ugc/aweme/base/fragment/AmeBaseFragment;", "()V", "carrierHint", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "contentContainer", "Landroid/view/ViewGroup;", "mEnterFrom", "", "mInProgress", "", "mLastShowSkipDialogTime", "", "mOneBindCallback", "Lcom/ss/android/ugc/aweme/account/listener/OneBindListener;", "mOnekeyLoginService", "Lcom/bytedance/sdk/account/platform/api/IOnekeyLoginService;", "getMOnekeyLoginService", "()Lcom/bytedance/sdk/account/platform/api/IOnekeyLoginService;", "mOnekeyLoginService$delegate", "Lkotlin/Lazy;", "mPhoneBean", "Lcom/ss/android/ugc/aweme/account/login/bean/OneLoginPhoneBean;", "mPlatform", "mStatusDialog", "Lcom/ss/android/ugc/aweme/account/dialog/AccountStatusViewDialog;", "otherPhoneLoginView", "phoneNum", "privacyView", "Lcom/ss/android/ugc/aweme/account/view/OneBindPrivacyView;", "skipView", "startBind", "canCurrentPlatformSkipDirectly", "getSP", "Landroid/content/SharedPreferences;", "gotoNormalBindFragment", "", "gotoOneKeySetPasswordFragment", "hideLoading", "initCarrierView", "phoneBean", "initViews", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showLoading", "startOneBind", "Companion", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class OneKeyBindFragment extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31930a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f31931b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(OneKeyBindFragment.class), "mOnekeyLoginService", "getMOnekeyLoginService()Lcom/bytedance/sdk/account/platform/api/IOnekeyLoginService;"))};
    public static final a j = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public String f31932c = "";

    /* renamed from: d  reason: collision with root package name */
    boolean f31933d;

    /* renamed from: e  reason: collision with root package name */
    public long f31934e;

    /* renamed from: f  reason: collision with root package name */
    public OneLoginPhoneBean f31935f;
    com.ss.android.ugc.aweme.account.d.a g;
    final Lazy h = LazyKt.lazy(e.INSTANCE);
    com.ss.android.ugc.aweme.account.h.b i;
    private ViewGroup k;
    private DmtTextView l;
    private DmtTextView m;
    private DmtTextView n;
    private OneBindPrivacyView o;
    private DmtTextView p;
    private DmtTextView q;
    private String r = "";
    private HashMap s;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/account/fragment/OneKeyBindFragment$Companion;", "", "()V", "KEY_PHONE_BEAN", "", "newInstance", "Lcom/ss/android/ugc/aweme/account/fragment/OneKeyBindFragment;", "bundle", "Landroid/os/Bundle;", "phoneBean", "Lcom/ss/android/ugc/aweme/account/login/bean/OneLoginPhoneBean;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f31936a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f31937a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneKeyBindFragment f31938b;

        b(OneKeyBindFragment oneKeyBindFragment) {
            this.f31938b = oneKeyBindFragment;
        }

        public final void onClick(View view) {
            OneKeyBindSetPasswordFragment oneKeyBindSetPasswordFragment;
            Object value;
            if (PatchProxy.isSupport(new Object[]{view}, this, f31937a, false, 19952, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f31937a, false, 19952, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (k.a() == k.a.WITHOUT_SET_PASSWORD) {
                OneKeyBindFragment oneKeyBindFragment = this.f31938b;
                if (PatchProxy.isSupport(new Object[0], oneKeyBindFragment, OneKeyBindFragment.f31930a, false, 19940, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], oneKeyBindFragment, OneKeyBindFragment.f31930a, false, 19940, new Class[0], Void.TYPE);
                } else {
                    if (!oneKeyBindFragment.f31933d) {
                        if (PatchProxy.isSupport(new Object[0], oneKeyBindFragment, OneKeyBindFragment.f31930a, false, 19936, new Class[0], com.bytedance.sdk.account.i.a.b.class)) {
                            value = PatchProxy.accessDispatch(new Object[0], oneKeyBindFragment, OneKeyBindFragment.f31930a, false, 19936, new Class[0], com.bytedance.sdk.account.i.a.b.class);
                        } else {
                            value = oneKeyBindFragment.h.getValue();
                        }
                        com.bytedance.sdk.account.i.a.b bVar = (com.bytedance.sdk.account.i.a.b) value;
                        if (bVar != null) {
                            bVar.b(bVar.a(), oneKeyBindFragment.i);
                        }
                        if (PatchProxy.isSupport(new Object[0], oneKeyBindFragment, OneKeyBindFragment.f31930a, false, 19941, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], oneKeyBindFragment, OneKeyBindFragment.f31930a, false, 19941, new Class[0], Void.TYPE);
                        } else {
                            oneKeyBindFragment.f31933d = true;
                            FragmentActivity activity = oneKeyBindFragment.getActivity();
                            if (activity != null) {
                                Intrinsics.checkExpressionValueIsNotNull(activity, "this");
                                String string = activity.getString(C0906R.string.bjq);
                                Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.one_key_bind_loading)");
                                com.ss.android.ugc.aweme.account.view.c cVar = new com.ss.android.ugc.aweme.account.view.c(activity, string, null, 0, 12);
                                oneKeyBindFragment.g = new com.ss.android.ugc.aweme.account.d.a(activity, cVar);
                                com.ss.android.ugc.aweme.account.d.a aVar = oneKeyBindFragment.g;
                                if (aVar != null) {
                                    aVar.show();
                                }
                            }
                        }
                        com.ss.android.ugc.aweme.account.a.a.b a2 = new com.ss.android.ugc.aweme.account.a.a.b().a("enter_from", "log_in").a("is_one_click", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a("platform", com.ss.android.ugc.aweme.account.k.a.a(oneKeyBindFragment.f31932c));
                        OneLoginPhoneBean oneLoginPhoneBean = oneKeyBindFragment.f31935f;
                        if (oneLoginPhoneBean == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPhoneBean");
                        }
                        r.a("phone_bundling_submit", (Map) a2.a("carrier", oneLoginPhoneBean.getFromMobLabel()).f31599b);
                    }
                }
            } else {
                OneKeyBindFragment oneKeyBindFragment2 = this.f31938b;
                if (PatchProxy.isSupport(new Object[0], oneKeyBindFragment2, OneKeyBindFragment.f31930a, false, 19947, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], oneKeyBindFragment2, OneKeyBindFragment.f31930a, false, 19947, new Class[0], Void.TYPE);
                    return;
                }
                FragmentActivity activity2 = oneKeyBindFragment2.getActivity();
                Bundle bundle = null;
                if (!(activity2 instanceof BaseAccountActivity)) {
                    activity2 = null;
                }
                BaseAccountActivity baseAccountActivity = (BaseAccountActivity) activity2;
                if (baseAccountActivity != null) {
                    OneKeyBindSetPasswordFragment.a aVar2 = OneKeyBindSetPasswordFragment.g;
                    Bundle arguments = oneKeyBindFragment2.getArguments();
                    if (arguments != null) {
                        OneLoginPhoneBean oneLoginPhoneBean2 = oneKeyBindFragment2.f31935f;
                        if (oneLoginPhoneBean2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPhoneBean");
                        }
                        arguments.putString("carrier", oneLoginPhoneBean2.getFromMobLabel());
                        OneLoginPhoneBean oneLoginPhoneBean3 = oneKeyBindFragment2.f31935f;
                        if (oneLoginPhoneBean3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPhoneBean");
                        }
                        arguments.putString("from", oneLoginPhoneBean3.getFrom());
                        bundle = arguments;
                    }
                    if (PatchProxy.isSupport(new Object[]{bundle}, aVar2, OneKeyBindSetPasswordFragment.a.f32902a, false, 21141, new Class[]{Bundle.class}, OneKeyBindSetPasswordFragment.class)) {
                        oneKeyBindSetPasswordFragment = (OneKeyBindSetPasswordFragment) PatchProxy.accessDispatch(new Object[]{bundle}, aVar2, OneKeyBindSetPasswordFragment.a.f32902a, false, 21141, new Class[]{Bundle.class}, OneKeyBindSetPasswordFragment.class);
                    } else {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        oneKeyBindSetPasswordFragment = new OneKeyBindSetPasswordFragment();
                        oneKeyBindSetPasswordFragment.setArguments(bundle);
                    }
                    baseAccountActivity.a(oneKeyBindSetPasswordFragment, true);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f31939a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneKeyBindFragment f31940b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 13})
        static final class a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31943a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f31944b;

            a(c cVar) {
                this.f31944b = cVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f31943a, false, 19955, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f31943a, false, 19955, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                FragmentActivity activity = this.f31944b.f31940b.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 13})
        static final class b implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static final b f31945a = new b();

            b() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        c(OneKeyBindFragment oneKeyBindFragment) {
            this.f31940b = oneKeyBindFragment;
        }

        public final void onClick(View view) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{view}, this, f31939a, false, 19953, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f31939a, false, 19953, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            OneKeyBindFragment oneKeyBindFragment = this.f31940b;
            if (PatchProxy.isSupport(new Object[0], oneKeyBindFragment, OneKeyBindFragment.f31930a, false, 19944, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], oneKeyBindFragment, OneKeyBindFragment.f31930a, false, 19944, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (TimeUnit.DAYS.toMillis(1) <= System.currentTimeMillis() - oneKeyBindFragment.f31934e && !TextUtils.isEmpty(oneKeyBindFragment.f31932c)) {
                z = com.ss.android.ugc.aweme.account.util.d.b(oneKeyBindFragment.f31932c);
            }
            if (!z) {
                AlertDialog create = p.a(this.f31940b.getContext()).setMessage((int) C0906R.string.n3).setNegativeButton((int) C0906R.string.ce3, (DialogInterface.OnClickListener) new a(this)).setPositiveButton((int) C0906R.string.mt, (DialogInterface.OnClickListener) b.f31945a).setCancelable(false).create();
                create.setCanceledOnTouchOutside(false);
                create.show();
                this.f31940b.f31934e = System.currentTimeMillis();
                i.a((Callable<TResult>) new Callable<TResult>(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f31941a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ c f31942b;

                    {
                        this.f31942b = r1;
                    }

                    public final /* synthetic */ Object call() {
                        boolean z;
                        if (PatchProxy.isSupport(new Object[0], this, f31941a, false, 19954, new Class[0], Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f31941a, false, 19954, new Class[0], Boolean.TYPE)).booleanValue();
                        } else {
                            z = this.f31942b.f31940b.b().edit().putLong("last_show_bind_dialog_time", this.f31942b.f31940b.f31934e).commit();
                        }
                        return Boolean.valueOf(z);
                    }
                });
                return;
            }
            r.a("phone_bundling_skip", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_from", "log_in").a("is_one_click", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a("platform", com.ss.android.ugc.aweme.account.k.a.a(this.f31940b.f31932c)).a("carrier", OneKeyBindFragment.a(this.f31940b).getFromMobLabel()).f31599b);
            FragmentActivity activity = this.f31940b.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f31946a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OneKeyBindFragment f31947b;

        d(OneKeyBindFragment oneKeyBindFragment) {
            this.f31947b = oneKeyBindFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f31946a, false, 19956, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f31946a, false, 19956, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f31947b.c();
            r.a("one_click_bundling_switch", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_from", "log_in").a("platform", com.ss.android.ugc.aweme.account.k.a.a(this.f31947b.f31932c)).a("carrier", OneKeyBindFragment.a(this.f31947b).getFromMobLabel()).f31599b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/sdk/account/platform/api/IOnekeyLoginService;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class e extends Lambda implements Function0<com.bytedance.sdk.account.i.a.b> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(0);
        }

        public final com.bytedance.sdk.account.i.a.b invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19957, new Class[0], com.bytedance.sdk.account.i.a.b.class)) {
                return (com.bytedance.sdk.account.i.a.b) com.bytedance.sdk.account.i.b.c.a(com.bytedance.sdk.account.i.a.b.class);
            }
            return (com.bytedance.sdk.account.i.a.b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19957, new Class[0], com.bytedance.sdk.account.i.a.b.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/account/fragment/OneKeyBindFragment$onViewCreated$1", "Lcom/ss/android/ugc/aweme/account/listener/OneBindListener;", "onBindError", "", "response", "Lcom/bytedance/sdk/account/platform/base/AuthorizeErrorResponse;", "onBindSuccess", "Lcom/bytedance/sdk/account/api/call/MobileApiResponse;", "Lcom/bytedance/sdk/account/mobile/query/OneBindMobileQueryObj;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class f extends com.ss.android.ugc.aweme.account.h.b {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f31948c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ OneKeyBindFragment f31949d;

        public final void a(@NotNull com.bytedance.sdk.account.api.call.c<com.bytedance.sdk.account.f.a.g> cVar) {
            com.bytedance.sdk.account.api.call.c<com.bytedance.sdk.account.f.a.g> cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{cVar2}, this, f31948c, false, 19959, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar2}, this, f31948c, false, 19959, new Class[]{com.bytedance.sdk.account.api.call.c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar2, "response");
            this.f31949d.a();
            super.a(cVar);
        }

        public final void a(@NotNull com.bytedance.sdk.account.i.b.b bVar) {
            com.bytedance.sdk.account.i.b.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f31948c, false, 19958, new Class[]{com.bytedance.sdk.account.i.b.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2}, this, f31948c, false, 19958, new Class[]{com.bytedance.sdk.account.i.b.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar2, "response");
            super.a(bVar);
            this.f31949d.a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(OneKeyBindFragment oneKeyBindFragment, Context context, AbsFragment absFragment, String str, OneLoginPhoneBean oneLoginPhoneBean, Function0 function0) {
            super(context, absFragment, str, oneLoginPhoneBean, function0);
            this.f31949d = oneKeyBindFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class g extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ OneKeyBindFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(OneKeyBindFragment oneKeyBindFragment) {
            super(0);
            this.this$0 = oneKeyBindFragment;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19960, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19960, new Class[0], Void.TYPE);
                return;
            }
            com.bytedance.ies.dmt.ui.d.a.c(GlobalContext.getContext(), (int) C0906R.string.bjp).a();
            this.this$0.c();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f31930a, false, 19942, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31930a, false, 19942, new Class[0], Void.TYPE);
            return;
        }
        this.f31933d = false;
        com.ss.android.ugc.aweme.account.d.a aVar = this.g;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public final SharedPreferences b() {
        if (PatchProxy.isSupport(new Object[0], this, f31930a, false, 19943, new Class[0], SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], this, f31930a, false, 19943, new Class[0], SharedPreferences.class);
        }
        SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(w.b(), "com.ss.spipe_bind", 0);
        Intrinsics.checkExpressionValueIsNotNull(a2, "ModuleStore.getApplicati…SP, Context.MODE_PRIVATE)");
        return a2;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f31930a, false, 19946, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31930a, false, 19946, new Class[0], Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (!(activity instanceof BaseAccountActivity)) {
            activity = null;
        }
        BaseAccountActivity baseAccountActivity = (BaseAccountActivity) activity;
        if (baseAccountActivity != null) {
            baseAccountActivity.a(BindMobileInputPhoneFragment.a(getArguments()), false);
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f31930a, false, 19949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31930a, false, 19949, new Class[0], Void.TYPE);
            return;
        }
        if (this.s != null) {
            this.s.clear();
        }
    }

    @NotNull
    public static final /* synthetic */ OneLoginPhoneBean a(OneKeyBindFragment oneKeyBindFragment) {
        OneLoginPhoneBean oneLoginPhoneBean = oneKeyBindFragment.f31935f;
        if (oneLoginPhoneBean == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhoneBean");
        }
        return oneLoginPhoneBean;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00e0, code lost:
        if (r0 == null) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r12, @org.jetbrains.annotations.Nullable android.os.Bundle r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r12
            r10 = 1
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f31930a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 19938(0x4de2, float:2.7939E-41)
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003d
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r12
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f31930a
            r3 = 0
            r4 = 19938(0x4de2, float:2.7939E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003d:
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            super.onViewCreated(r12, r13)
            r0 = 2131168827(0x7f070e3b, float:1.7951967E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.phone_num)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            r11.l = r0
            r0 = 2131170080(0x7f071320, float:1.7954508E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.start_bind)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            r11.m = r0
            r0 = 2131166139(0x7f0703bb, float:1.7946515E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.content_container)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r11.k = r0
            r0 = 2131165841(0x7f070291, float:1.794591E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.carrier_hint)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            r11.n = r0
            r0 = 2131169135(0x7f070f6f, float:1.7952592E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.privacy)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.account.view.OneBindPrivacyView r0 = (com.ss.android.ugc.aweme.account.view.OneBindPrivacyView) r0
            r11.o = r0
            r0 = 2131171238(0x7f0717a6, float:1.7956857E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.use_normal_login)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            r11.p = r0
            r0 = 2131169976(0x7f0712b8, float:1.7954297E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.skip)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            r11.q = r0
            android.os.Bundle r0 = r11.getArguments()
            r1 = 0
            if (r0 == 0) goto L_0x00c3
            java.lang.String r2 = "key_phone_bean"
            java.io.Serializable r0 = r0.getSerializable(r2)
            goto L_0x00c4
        L_0x00c3:
            r0 = r1
        L_0x00c4:
            boolean r2 = r0 instanceof com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean
            if (r2 != 0) goto L_0x00c9
            r0 = r1
        L_0x00c9:
            com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean r0 = (com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean) r0
            if (r0 != 0) goto L_0x00d2
            com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean r0 = new com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean
            r0.<init>()
        L_0x00d2:
            r11.f31935f = r0
            android.os.Bundle r0 = r11.getArguments()
            if (r0 == 0) goto L_0x00e2
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L_0x00e4
        L_0x00e2:
            java.lang.String r0 = ""
        L_0x00e4:
            r11.r = r0
            java.lang.String r0 = r11.r
            java.lang.String r0 = com.ss.android.ugc.aweme.account.util.d.a(r0)
            if (r0 != 0) goto L_0x00f0
            java.lang.String r0 = ""
        L_0x00f0:
            r11.f31932c = r0
            android.content.SharedPreferences r0 = r11.b()
            java.lang.String r1 = "last_show_bind_dialog_time"
            r2 = 0
            long r0 = r0.getLong(r1, r2)
            r11.f31934e = r0
            com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment$f r7 = new com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment$f
            android.content.Context r2 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r0 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r0)
            r3 = r11
            com.bytedance.ies.uikit.base.AbsFragment r3 = (com.bytedance.ies.uikit.base.AbsFragment) r3
            java.lang.String r4 = r11.r
            com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean r5 = r11.f31935f
            if (r5 != 0) goto L_0x0119
            java.lang.String r0 = "mPhoneBean"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x0119:
            com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment$g r0 = new com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment$g
            r0.<init>(r11)
            r6 = r0
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r0 = r7
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.account.h.b r7 = (com.ss.android.ugc.aweme.account.h.b) r7
            r11.i = r7
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f31930a
            r3 = 0
            r4 = 19939(0x4de3, float:2.794E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x014b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f31930a
            r3 = 0
            r4 = 19939(0x4de3, float:2.794E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x014b:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.m
            if (r0 != 0) goto L_0x0154
            java.lang.String r1 = "startBind"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0154:
            com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment$b r1 = new com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment$b
            r1.<init>(r11)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.l
            if (r0 != 0) goto L_0x0167
            java.lang.String r1 = "phoneNum"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0167:
            com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean r1 = r11.f31935f
            if (r1 != 0) goto L_0x0170
            java.lang.String r2 = "mPhoneBean"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0170:
            java.lang.String r1 = r1.getMobile()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.q
            if (r0 != 0) goto L_0x0182
            java.lang.String r1 = "skipView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0182:
            com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment$c r1 = new com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment$c
            r1.<init>(r11)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            java.lang.String r0 = r11.r
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "authorize_force_bind"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x01a8
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.q
            if (r0 != 0) goto L_0x01a3
            java.lang.String r1 = "skipView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x01a3:
            r1 = 8
            r0.setVisibility(r1)
        L_0x01a8:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.p
            if (r0 != 0) goto L_0x01b1
            java.lang.String r1 = "otherPhoneLoginView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x01b1:
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            com.bytedance.ies.dmt.ui.e.b.a(r1)
            com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment$d r1 = new com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment$d
            r1.<init>(r11)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean r7 = r11.f31935f
            if (r7 != 0) goto L_0x01ca
            java.lang.String r0 = "mPhoneBean"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x01ca:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f31930a
            r3 = 0
            r4 = 19945(0x4de9, float:2.7949E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean> r1 = com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01f8
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f31930a
            r3 = 0
            r4 = 19945(0x4de9, float:2.7949E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean> r1 = com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x01f8:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.n
            if (r0 != 0) goto L_0x0201
            java.lang.String r1 = "carrierHint"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0201:
            java.lang.String r1 = r7.getFrom()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "mobile"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            r2 = 2131561563(0x7f0d0c5b, float:1.874853E38)
            if (r1 == 0) goto L_0x0238
            java.lang.String r1 = com.ss.android.ugc.aweme.base.utils.o.b(r2)
            java.lang.String r2 = "ResUtils.getString(R.string.one_login_operator)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r3 = 2131561556(0x7f0d0c54, float:1.8748516E38)
            java.lang.String r3 = com.ss.android.ugc.aweme.base.utils.o.b(r3)
            r2[r9] = r3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r10)
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x02a4
        L_0x0238:
            java.lang.String r1 = r7.getFrom()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r3 = "telecom"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x026c
            java.lang.String r1 = com.ss.android.ugc.aweme.base.utils.o.b(r2)
            java.lang.String r2 = "ResUtils.getString(R.string.one_login_operator)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r3 = 2131561558(0x7f0d0c56, float:1.874852E38)
            java.lang.String r3 = com.ss.android.ugc.aweme.base.utils.o.b(r3)
            r2[r9] = r3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r10)
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x02a4
        L_0x026c:
            java.lang.String r1 = r7.getFrom()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r3 = "unicom"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x02a0
            java.lang.String r1 = com.ss.android.ugc.aweme.base.utils.o.b(r2)
            java.lang.String r2 = "ResUtils.getString(R.string.one_login_operator)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r3 = 2131561560(0x7f0d0c58, float:1.8748524E38)
            java.lang.String r3 = com.ss.android.ugc.aweme.base.utils.o.b(r3)
            r2[r9] = r3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r10)
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x02a4
        L_0x02a0:
            java.lang.String r1 = ""
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L_0x02a4:
            r0.setText(r1)
            com.ss.android.ugc.aweme.account.view.OneBindPrivacyView r0 = r11.o
            if (r0 != 0) goto L_0x02b0
            java.lang.String r1 = "privacyView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x02b0:
            java.lang.String r1 = r7.getFrom()
            java.lang.String r2 = "phoneBean.from"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r0.setCarrier(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.fragment.OneKeyBindFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f31930a, false, 19937, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f31930a, false, 19937, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.p5, viewGroup2, false);
    }
}
