package com.ss.android.ugc.aweme.account.login.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.m;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.loginsetting.LoginSettingResponse;
import com.ss.android.ugc.aweme.account.loginsetting.a;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.aweme.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\"\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/ui/ThirdPartyLoginFragment;", "Lcom/ss/android/ugc/aweme/account/login/ui/BaseFragment;", "Lcom/ss/android/ugc/aweme/account/login/presenter/NullPresent;", "Lcom/ss/android/ugc/aweme/account/login/NeedCancelThisLoginMethod;", "Lcom/ss/android/ugc/aweme/account/login/callbacks/AvoidBackCallback;", "()V", "mCanFinishWholeLoginRoutine", "", "mLoginSettings", "", "Lcom/ss/android/ugc/aweme/account/loginsetting/LoginSettingResponse$SettingInfo;", "mNeedCancelThisLoginMethod", "mThirdPartyLoginView", "Lcom/ss/android/ugc/aweme/account/login/ui/ThirdPartyLoginView;", "canFinishWholeLoginRoutine", "doLogin", "", "loginMethod", "Lcom/ss/android/ugc/aweme/account/login/model/TPLoginMethod;", "getCommonPresent", "isAvoidBack", "need", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class ThirdPartyLoginFragment extends BaseFragment<Object> implements m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32575a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f32576b = true;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends LoginSettingResponse.SettingInfo> f32577c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private ThirdPartyLoginView f32578d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f32579e = true;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f32580f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32581a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ThirdPartyLoginFragment f32582b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TPLoginMethod f32583c;

        a(ThirdPartyLoginFragment thirdPartyLoginFragment, TPLoginMethod tPLoginMethod) {
            this.f32582b = thirdPartyLoginFragment;
            this.f32583c = tPLoginMethod;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f32581a, false, 20760, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f32581a, false, 20760, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (CollectionUtils.isEmpty(this.f32582b.f32577c)) {
                ThirdPartyLoginFragment thirdPartyLoginFragment = this.f32582b;
                List<LoginSettingResponse.SettingInfo> g = n.g();
                Intrinsics.checkExpressionValueIsNotNull(g, "SharePreferencesUtil.getLoginSettingCache()");
                thirdPartyLoginFragment.f32577c = g;
            }
            if (!com.ss.android.ugc.aweme.account.loginsetting.a.a(this.f32582b.f32577c, this.f32583c.getPlatform(), 0, true, this.f32582b.getActivity(), new a.C0414a(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32584a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f32585b;

                {
                    this.f32585b = r1;
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f32584a, false, 20761, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f32584a, false, 20761, new Class[0], Void.TYPE);
                        return;
                    }
                    this.f32585b.f32582b.a(this.f32585b.f32583c);
                }
            })) {
                this.f32582b.a(this.f32583c);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32586a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ThirdPartyLoginFragment f32587b;

        b(ThirdPartyLoginFragment thirdPartyLoginFragment) {
            this.f32587b = thirdPartyLoginFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f32586a, false, 20762, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f32586a, false, 20762, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            r.a("switch_login_account", (Map) new com.ss.android.ugc.aweme.account.a.a.b().a("enter_method", this.f32587b.n).a("enter_from", this.f32587b.m).f31599b);
            this.f32587b.f32576b = false;
            FragmentActivity activity = this.f32587b.getActivity();
            if (activity != null) {
                activity.finish();
            }
            w.m().retryLogin(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32588a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ThirdPartyLoginFragment f32589b;

        c(ThirdPartyLoginFragment thirdPartyLoginFragment) {
            this.f32589b = thirdPartyLoginFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f32588a, false, 20763, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f32588a, false, 20763, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f32589b.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    private View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f32575a, false, 20758, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f32575a, false, 20758, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f32580f == null) {
            this.f32580f = new HashMap();
        }
        View view = (View) this.f32580f.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f32580f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* bridge */ /* synthetic */ com.ss.android.mobilelib.b.a c() {
        return null;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f32575a, false, 20759, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32575a, false, 20759, new Class[0], Void.TYPE);
            return;
        }
        if (this.f32580f != null) {
            this.f32580f.clear();
        }
    }

    public final boolean o_() {
        int i;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f32575a, false, 20757, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f32575a, false, 20757, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f32579e && !w.h()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                i = arguments.getInt("bundle_flow_type", BaseLoginOrRegisterActivity.o);
            } else {
                i = BaseLoginOrRegisterActivity.o;
            }
            if (i == BaseLoginOrRegisterActivity.s) {
                z = true;
            }
        }
        return z;
    }

    public final void a(TPLoginMethod tPLoginMethod) {
        if (PatchProxy.isSupport(new Object[]{tPLoginMethod}, this, f32575a, false, 20755, new Class[]{TPLoginMethod.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tPLoginMethod}, this, f32575a, false, 20755, new Class[]{TPLoginMethod.class}, Void.TYPE);
            return;
        }
        this.f32579e = false;
        ThirdPartyLoginView thirdPartyLoginView = this.f32578d;
        if (thirdPartyLoginView != null) {
            thirdPartyLoginView.a("sign_in", tPLoginMethod.getPlatform());
        }
        Intent intent = new Intent(getContext(), AuthorizeActivity.class);
        if (getArguments() != null) {
            intent.putExtras(getArguments());
        }
        intent.putExtra("platform", tPLoginMethod.getPlatform());
        intent.putExtra("is_login", true);
        startActivityForResult(intent, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        TPLoginMethod tPLoginMethod;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f32575a, false, 20754, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f32575a, false, 20754, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        this.f32578d = new ThirdPartyLoginView(getContext());
        Bundle arguments = getArguments();
        if (arguments != null) {
            tPLoginMethod = (TPLoginMethod) arguments.getParcelable("bundle_login_method");
        } else {
            tPLoginMethod = null;
        }
        if (tPLoginMethod == null) {
            Intrinsics.throwNpe();
        }
        com.ss.android.ugc.aweme.base.c.a((RemoteImageView) (AvatarImageView) a((int) C0906R.id.hk), tPLoginMethod.getUserInfo().getAvatarUrl());
        DmtTextView dmtTextView = (DmtTextView) a((int) C0906R.id.dp1);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "userName");
        dmtTextView.setText(tPLoginMethod.getUserInfo().getUserName());
        ((DmtTextView) a((int) C0906R.id.bkh)).setOnClickListener(new a(this, tPLoginMethod));
        ((DmtTextView) a((int) C0906R.id.cy1)).setOnClickListener(new b(this));
        ((AutoRTLImageView) a((int) C0906R.id.ti)).setOnClickListener(new c(this));
        ThirdPartyLoginView thirdPartyLoginView = this.f32578d;
        if (thirdPartyLoginView != null) {
            thirdPartyLoginView.setEventType(this.m);
        }
        ThirdPartyLoginView thirdPartyLoginView2 = this.f32578d;
        if (thirdPartyLoginView2 != null) {
            thirdPartyLoginView2.setPosition(this.n);
        }
        ThirdPartyLoginView thirdPartyLoginView3 = this.f32578d;
        if (thirdPartyLoginView3 != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                arguments2 = new Bundle();
            }
            thirdPartyLoginView3.setBundle(arguments2);
        }
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f32575a, false, 20756, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f32575a, false, 20756, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        ThirdPartyLoginView thirdPartyLoginView = this.f32578d;
        if (thirdPartyLoginView != null) {
            thirdPartyLoginView.a(i, i2, intent2);
        }
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32575a, false, 20753, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f32575a, false, 20753, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.ok, viewGroup2, false);
    }
}
