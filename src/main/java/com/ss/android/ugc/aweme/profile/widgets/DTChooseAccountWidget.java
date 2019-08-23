package com.ss.android.ugc.aweme.profile.widgets;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.sdk.account.api.a.f;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.session.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.SlideSettingPageFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001,B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010#\u001a\u00020$H\u0002J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020$J\u0006\u0010'\u001a\u00020$J\u0010\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u0003H\u0014J\u0006\u0010*\u001a\u00020$J\b\u0010+\u001a\u00020$H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R#\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/widgets/DTChooseAccountWidget;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/Widget;", "mainContainer", "Landroid/view/View;", "slideFragment", "Lcom/ss/android/ugc/aweme/profile/SlideSettingPageFragment;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/profile/SlideSettingPageFragment;)V", "currentUserAvatarIv", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "currentUserNickNameTv", "Landroid/widget/TextView;", "holders", "", "Lcom/ss/android/ugc/aweme/profile/widgets/DTChooseAccountWidget$ViewHolder;", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getInflater", "()Landroid/view/LayoutInflater;", "inflater$delegate", "Lkotlin/Lazy;", "isExpanded", "", "moreBtn", "rootView", "Landroid/view/ViewGroup;", "getRootView", "()Landroid/view/ViewGroup;", "rootView$delegate", "viewModel", "Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;", "getViewModel", "()Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;", "viewModel$delegate", "yellowPoint", "addAccount", "", "collapse", "expand", "hideSlidePage", "onBindView", "view", "refreshUI", "toggle", "ViewHolder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DTChooseAccountWidget extends Widget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63185a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f63186b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DTChooseAccountWidget.class), "rootView", "getRootView()Landroid/view/ViewGroup;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DTChooseAccountWidget.class), "inflater", "getInflater()Landroid/view/LayoutInflater;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DTChooseAccountWidget.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;"))};
    public boolean k;
    final SlideSettingPageFragment l;
    private final Lazy m = LazyKt.lazy(new d(this));
    private final Lazy n = LazyKt.lazy(new b(this));
    private final Lazy o = LazyKt.lazy(e.INSTANCE);
    private final List<a> p = new ArrayList();
    private View q;
    private View r;
    private RemoteImageView s;
    private TextView t;
    private final View u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/widgets/DTChooseAccountWidget$ViewHolder;", "", "rootView", "Landroid/view/ViewGroup;", "user", "Lcom/ss/android/ugc/aweme/user/SignificantUserInfo;", "chooseAccountWidget", "Lcom/ss/android/ugc/aweme/profile/widgets/DTChooseAccountWidget;", "viewModel", "Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;", "(Landroid/view/ViewGroup;Lcom/ss/android/ugc/aweme/user/SignificantUserInfo;Lcom/ss/android/ugc/aweme/profile/widgets/DTChooseAccountWidget;Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;)V", "getRootView", "()Landroid/view/ViewGroup;", "getUser", "()Lcom/ss/android/ugc/aweme/user/SignificantUserInfo;", "doTeenagerModeAction", "", "isAddAccount", "switchAccount", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63187a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final ViewGroup f63188b;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.user.a f63189c;

        /* renamed from: d  reason: collision with root package name */
        public final DTChooseAccountWidget f63190d;

        /* renamed from: e  reason: collision with root package name */
        private final MultiAccountViewModel f63191e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/profile/widgets/DTChooseAccountWidget$ViewHolder$doTeenagerModeAction$1", "Lcom/ss/android/ugc/aweme/base/ui/session/Session$CallBack;", "", "onFailure", "", "exception", "Ljava/lang/Exception;", "onSuccess", "data", "(Ljava/lang/Boolean;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.DTChooseAccountWidget$a$a  reason: collision with other inner class name */
        public static final class C0681a implements a.C0450a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63194a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f63195b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f63196c;

            public final /* synthetic */ void a(Object obj) {
                Boolean bool = (Boolean) obj;
                if (PatchProxy.isSupport(new Object[]{bool}, this, f63194a, false, 70102, new Class[]{Boolean.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bool}, this, f63194a, false, 70102, new Class[]{Boolean.class}, Void.TYPE);
                } else if (this.f63196c) {
                    this.f63195b.f63190d.h();
                } else {
                    this.f63195b.a();
                }
            }

            C0681a(a aVar, boolean z) {
                this.f63195b = aVar;
                this.f63196c = z;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/profile/widgets/DTChooseAccountWidget$ViewHolder$switchAccount$1", "Lcom/bytedance/sdk/account/api/callback/SwitchAuthCallback;", "onError", "", "response", "Lcom/bytedance/sdk/account/api/response/SwitchAuthResponse;", "error", "", "onSuccess", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class b extends f {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f63197c;

            b() {
            }

            public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
                com.bytedance.sdk.account.api.c.f fVar = (com.bytedance.sdk.account.api.c.f) baseApiResponse;
                if (PatchProxy.isSupport(new Object[]{fVar}, this, f63197c, false, 70103, new Class[]{com.bytedance.sdk.account.api.c.f.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fVar}, this, f63197c, false, 70103, new Class[]{com.bytedance.sdk.account.api.c.f.class}, Void.TYPE);
                    return;
                }
                r.a("switch_account_result", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("status", 1).f34114b);
            }

            public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
                com.bytedance.sdk.account.api.c.f fVar = (com.bytedance.sdk.account.api.c.f) baseApiResponse;
                if (PatchProxy.isSupport(new Object[]{fVar, Integer.valueOf(i)}, this, f63197c, false, 70104, new Class[]{com.bytedance.sdk.account.api.c.f.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fVar, Integer.valueOf(i)}, this, f63197c, false, 70104, new Class[]{com.bytedance.sdk.account.api.c.f.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                AwemeAppData p = AwemeAppData.p();
                Intrinsics.checkExpressionValueIsNotNull(p, "AwemeAppData.inst()");
                Activity f2 = p.f();
                if (f2 != null) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) f2, (int) C0906R.string.abl).a();
                }
                r.a("switch_account_result", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("status", 0).a("fail_info", i).f34114b);
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f63187a, false, 70100, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f63187a, false, 70100, new Class[0], Void.TYPE);
                return;
            }
            r.a("switch_account_submit", (Map) null);
            this.f63191e.a(this.f63189c.f75289b, (Bundle) null, (f) new b());
        }

        public final boolean a(boolean z) {
            int i;
            String str;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f63187a, false, 70099, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f63187a, false, 70099, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (TimeLockRuler.isSelfContentFilterOn()) {
                a.C0450a aVar = new C0681a(this, z);
                if (z) {
                    str = "add_account";
                } else {
                    str = "switch_account";
                }
                com.ss.android.ugc.aweme.antiaddic.lock.d.a(aVar, str);
                return true;
            } else if (!TimeLockRuler.isParentalPlatformContentFilterOn()) {
                return false;
            } else {
                Context context = this.f63188b.getContext();
                if (z) {
                    i = C0906R.string.ad6;
                } else {
                    i = C0906R.string.ad7;
                }
                com.bytedance.ies.dmt.ui.d.a.c(context, i).a();
                return true;
            }
        }

        public a(@NotNull ViewGroup viewGroup, @NotNull com.ss.android.ugc.aweme.user.a aVar, @NotNull DTChooseAccountWidget dTChooseAccountWidget, @NotNull MultiAccountViewModel multiAccountViewModel) {
            String valueOf;
            Intrinsics.checkParameterIsNotNull(viewGroup, "rootView");
            Intrinsics.checkParameterIsNotNull(aVar, AllStoryActivity.f73306b);
            Intrinsics.checkParameterIsNotNull(dTChooseAccountWidget, "chooseAccountWidget");
            Intrinsics.checkParameterIsNotNull(multiAccountViewModel, "viewModel");
            this.f63188b = viewGroup;
            this.f63189c = aVar;
            this.f63190d = dTChooseAccountWidget;
            this.f63191e = multiAccountViewModel;
            if (Intrinsics.areEqual((Object) this.f63189c.f75289b, (Object) "-1")) {
                ((ImageView) this.f63188b.findViewById(C0906R.id.hk)).setImageResource(2130839482);
                ((TextView) this.f63188b.findViewById(C0906R.id.bqn)).setText(C0906R.string.f4478cn);
            } else {
                com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f63188b.findViewById(C0906R.id.hk), this.f63189c.f75293f);
                View findViewById = this.f63188b.findViewById(C0906R.id.bqn);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById<TextView>(R.id.nickName)");
                ((TextView) findViewById).setText(this.f63189c.f75292e);
            }
            TextView textView = (TextView) this.f63188b.findViewById(C0906R.id.bmp);
            Intrinsics.checkExpressionValueIsNotNull(textView, "messageCountTv");
            textView.setVisibility(8);
            int a2 = com.ss.android.ugc.aweme.message.c.b.a().a(this.f63189c.f75289b);
            if (a2 > 0) {
                textView.setVisibility(0);
                if (a2 > 99) {
                    valueOf = "99+";
                } else {
                    valueOf = String.valueOf(a2);
                }
                textView.setText(valueOf);
            }
            this.f63188b.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63192a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f63193b;

                {
                    this.f63193b = r1;
                }

                public final void onClick(View view) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f63192a, false, 70101, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f63192a, false, 70101, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    DTChooseAccountWidget dTChooseAccountWidget = this.f63193b.f63190d;
                    if (PatchProxy.isSupport(new Object[0], dTChooseAccountWidget, DTChooseAccountWidget.f63185a, false, 70096, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], dTChooseAccountWidget, DTChooseAccountWidget.f63185a, false, 70096, new Class[0], Void.TYPE);
                    } else {
                        dTChooseAccountWidget.l.a(false, true);
                    }
                    if (!Intrinsics.areEqual((Object) this.f63193b.f63189c.f75289b, (Object) "-1")) {
                        IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
                        Intrinsics.checkExpressionValueIsNotNull(publishService, "ServiceManager.get().get…ss.java).publishService()");
                        if (!publishService.isUnKnown()) {
                            IAVPublishService publishService2 = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
                            Intrinsics.checkExpressionValueIsNotNull(publishService2, "ServiceManager.get().get…ss.java).publishService()");
                            if (!publishService2.isPublishFinished()) {
                                Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
                                com.bytedance.ies.dmt.ui.d.a.b(view.getContext(), (int) C0906R.string.bt6).a();
                                return;
                            }
                        }
                        if (!this.f63193b.a(false)) {
                            this.f63193b.a();
                        }
                    } else if (!this.f63193b.a(true)) {
                        this.f63193b.f63190d.h();
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<LayoutInflater> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ DTChooseAccountWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DTChooseAccountWidget dTChooseAccountWidget) {
            super(0);
            this.this$0 = dTChooseAccountWidget;
        }

        public final LayoutInflater invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70105, new Class[0], LayoutInflater.class)) {
                return (LayoutInflater) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70105, new Class[0], LayoutInflater.class);
            }
            View view = this.this$0.f2711f;
            Intrinsics.checkExpressionValueIsNotNull(view, "mContentView");
            return LayoutInflater.from(view.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63198a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DTChooseAccountWidget f63199b;

        c(DTChooseAccountWidget dTChooseAccountWidget) {
            this.f63199b = dTChooseAccountWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f63198a, false, 70106, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f63198a, false, 70106, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (!this.f63199b.k) {
                r.a("account_list_unfold", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("status", 0).a("enter_method", "user_click").f34114b);
            }
            DTChooseAccountWidget dTChooseAccountWidget = this.f63199b;
            if (PatchProxy.isSupport(new Object[0], dTChooseAccountWidget, DTChooseAccountWidget.f63185a, false, 70097, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], dTChooseAccountWidget, DTChooseAccountWidget.f63185a, false, 70097, new Class[0], Void.TYPE);
            } else if (dTChooseAccountWidget.k) {
                dTChooseAccountWidget.f();
            } else {
                dTChooseAccountWidget.g();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<ViewGroup> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ DTChooseAccountWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DTChooseAccountWidget dTChooseAccountWidget) {
            super(0);
            this.this$0 = dTChooseAccountWidget;
        }

        @NotNull
        public final ViewGroup invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70107, new Class[0], ViewGroup.class)) {
                return (ViewGroup) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70107, new Class[0], ViewGroup.class);
            }
            View view = this.this$0.f2711f;
            if (view != null) {
                return (ViewGroup) view;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<MultiAccountViewModel> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(0);
        }

        @NotNull
        public final MultiAccountViewModel invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70108, new Class[0], MultiAccountViewModel.class)) {
                return new MultiAccountViewModel();
            }
            return (MultiAccountViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70108, new Class[0], MultiAccountViewModel.class);
        }
    }

    private final ViewGroup i() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f63185a, false, 70089, new Class[0], ViewGroup.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f63185a, false, 70089, new Class[0], ViewGroup.class);
        } else {
            value = this.m.getValue();
        }
        return (ViewGroup) value;
    }

    private final LayoutInflater j() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f63185a, false, 70090, new Class[0], LayoutInflater.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f63185a, false, 70090, new Class[0], LayoutInflater.class);
        } else {
            value = this.n.getValue();
        }
        return (LayoutInflater) value;
    }

    private final MultiAccountViewModel k() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f63185a, false, 70091, new Class[0], MultiAccountViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f63185a, false, 70091, new Class[0], MultiAccountViewModel.class);
        } else {
            value = this.o.getValue();
        }
        return (MultiAccountViewModel) value;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f63185a, false, 70094, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63185a, false, 70094, new Class[0], Void.TYPE);
            return;
        }
        for (a aVar : this.p) {
            i().removeView(aVar.f63188b);
        }
        this.u.setVisibility(0);
        View view = this.q;
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null) {
                ViewPropertyAnimator rotation = animate.rotation(0.0f);
                if (rotation != null) {
                    ViewPropertyAnimator duration = rotation.setDuration(100);
                    if (duration != null) {
                        duration.start();
                    }
                }
            }
        }
        this.k = false;
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f63185a, false, 70098, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63185a, false, 70098, new Class[0], Void.TYPE);
        } else if (com.ss.android.ugc.aweme.account.d.a().allUidList().size() < 3) {
            MultiAccountViewModel.f63177d.a(this.l.getActivity(), "", "add_account_mine");
        } else {
            com.bytedance.ies.dmt.ui.d.a.c(i().getContext(), (int) C0906R.string.co).a();
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f63185a, false, 70095, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63185a, false, 70095, new Class[0], Void.TYPE);
            return;
        }
        this.p.clear();
        for (com.ss.android.ugc.aweme.user.a aVar : k().a()) {
            View inflate = j().inflate(C0906R.layout.sl, i(), false);
            if (inflate != null) {
                a aVar2 = new a((ViewGroup) inflate, aVar, this, k());
                aVar2.f63188b.setTag(aVar2);
                i().addView(aVar2.f63188b);
                this.p.add(aVar2);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        for (a aVar3 : this.p) {
            aVar3.f63188b.setVisibility(0);
        }
        this.u.setVisibility(4);
        View view = this.q;
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null) {
                ViewPropertyAnimator rotation = animate.rotation(180.0f);
                if (rotation != null) {
                    ViewPropertyAnimator duration = rotation.setDuration(100);
                    if (duration != null) {
                        duration.start();
                    }
                }
            }
        }
        this.k = true;
    }

    public final void e() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f63185a, false, 70093, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63185a, false, 70093, new Class[0], Void.TYPE);
            return;
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        if (a2.al()) {
            View view = this.f2711f;
            Intrinsics.checkExpressionValueIsNotNull(view, "mContentView");
            view.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.u.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = (int) UIUtils.dip2Px(this.u.getContext(), 68.0f);
                this.u.setLayoutParams(marginLayoutParams);
                IAccountUserService a3 = com.ss.android.ugc.aweme.account.d.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
                User curUser = a3.getCurUser();
                Intrinsics.checkExpressionValueIsNotNull(curUser, "currentUser");
                String uid = curUser.getUid();
                List<String> allUidList = com.ss.android.ugc.aweme.account.d.a().allUidList();
                Intrinsics.checkExpressionValueIsNotNull(allUidList, "AccountUserProxyService.get().allUidList()");
                Iterable<String> iterable = allUidList;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (String str : iterable) {
                    if (Intrinsics.areEqual((Object) uid, (Object) str)) {
                        i = 0;
                    } else {
                        i = com.ss.android.ugc.aweme.message.c.b.a().a(str);
                    }
                    arrayList.add(Integer.valueOf(i));
                }
                int sumOfInt = CollectionsKt.sumOfInt((List) arrayList);
                com.ss.android.ugc.aweme.base.c.b(this.s, curUser.getAvatarThumb());
                TextView textView = this.t;
                if (textView != null) {
                    textView.setText(curUser.getNickname());
                }
                View view2 = this.r;
                if (view2 != null) {
                    if (sumOfInt <= 0) {
                        i2 = 8;
                    }
                    view2.setVisibility(i2);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        View view3 = this.f2711f;
        Intrinsics.checkExpressionValueIsNotNull(view3, "mContentView");
        view3.setVisibility(8);
        ViewGroup.LayoutParams layoutParams2 = this.u.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = (int) UIUtils.dip2Px(this.u.getContext(), 0.0f);
            this.u.setLayoutParams(marginLayoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void a(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f63185a, false, 70092, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f63185a, false, 70092, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.a(view);
        this.k = false;
        View findViewById = i().findViewById(C0906R.id.z);
        i().removeAllViews();
        View inflate = j().inflate(C0906R.layout.sl, i(), false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…ount_dt, rootView, false)");
        this.q = inflate.findViewById(C0906R.id.bnh);
        this.s = (RemoteImageView) inflate.findViewById(C0906R.id.hk);
        this.t = (TextView) inflate.findViewById(C0906R.id.bqn);
        this.r = inflate.findViewById(C0906R.id.dyb);
        View findViewById2 = inflate.findViewById(C0906R.id.bmp);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "currentUserView.findView…View>(R.id.message_count)");
        findViewById2.setVisibility(8);
        View view2 = this.q;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        inflate.setOnClickListener(new c(this));
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "splitLine");
        findViewById.setVisibility(0);
        i().addView(inflate);
        i().addView(findViewById);
        ViewParent parent = this.u.getParent();
        if (parent != null) {
            LayoutTransition layoutTransition = ((ViewGroup) parent).getLayoutTransition();
            layoutTransition.disableTransitionType(1);
            layoutTransition.setDuration(2, 200);
            layoutTransition.setDuration(3, 200);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public DTChooseAccountWidget(@NotNull View view, @NotNull SlideSettingPageFragment slideSettingPageFragment) {
        Intrinsics.checkParameterIsNotNull(view, "mainContainer");
        Intrinsics.checkParameterIsNotNull(slideSettingPageFragment, "slideFragment");
        this.u = view;
        this.l = slideSettingPageFragment;
    }
}
