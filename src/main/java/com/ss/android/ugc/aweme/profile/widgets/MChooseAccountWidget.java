package com.ss.android.ugc.aweme.profile.widgets;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.ex;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0002*+B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\b\u0010\u001f\u001a\u00020\nH\u0002J\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020#H\u0014J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0003H\u0014J\u000e\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(J\u0006\u0010)\u001a\u00020!R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R#\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/widgets/MChooseAccountWidget;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/Widget;", "qrView", "Landroid/view/View;", "titleBar", "title", "moreBtn", "redPointView", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "accountChoosePopupWindow", "Landroid/widget/PopupWindow;", "holders", "", "Lcom/ss/android/ugc/aweme/profile/widgets/MChooseAccountWidget$ViewHolder;", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getInflater", "()Landroid/view/LayoutInflater;", "inflater$delegate", "Lkotlin/Lazy;", "rootView", "Landroid/view/ViewGroup;", "getRootView", "()Landroid/view/ViewGroup;", "rootView$delegate", "viewModel", "Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;", "getViewModel", "()Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;", "viewModel$delegate", "createPopupWindow", "dismiss", "", "getLayoutId", "", "onBindView", "view", "refreshUI", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "show", "Companion", "ViewHolder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MChooseAccountWidget extends Widget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63200a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f63201b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MChooseAccountWidget.class), "inflater", "getInflater()Landroid/view/LayoutInflater;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MChooseAccountWidget.class), "rootView", "getRootView()Landroid/view/ViewGroup;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MChooseAccountWidget.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;"))};
    public static final a n = new a((byte) 0);
    public PopupWindow k;
    public final View l;
    public final View m;
    private final Lazy o = LazyKt.lazy(new d(this));
    private final Lazy p = LazyKt.lazy(new h(this));
    private final Lazy q = LazyKt.lazy(k.INSTANCE);
    private final List<b> r = new ArrayList();
    private final View s;
    private final View t;
    private final View u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fXT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/widgets/MChooseAccountWidget$Companion;", "", "()V", "ACTION_BEGIN_ALPHA_VALUE", "", "ACTION_BEGIN_ROTATION_VALUE", "ACTION_DURATION", "", "ACTION_END_ALPHA_VALUE", "ACTION_END_ROTATION_VALUE", "ACTION_ROTATION_DURATION", "NOTICE_MAX_COUNT", "", "ROOT_VIEW_HEIGHT_DIP_VALUE", "STATUS_FAILED", "STATUS_SUCCESS", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/widgets/MChooseAccountWidget$ViewHolder;", "", "rootView", "Landroid/view/ViewGroup;", "user", "Lcom/ss/android/ugc/aweme/user/SignificantUserInfo;", "accountWidget", "Lcom/ss/android/ugc/aweme/profile/widgets/MChooseAccountWidget;", "viewModel", "Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;", "(Landroid/view/ViewGroup;Lcom/ss/android/ugc/aweme/user/SignificantUserInfo;Lcom/ss/android/ugc/aweme/profile/widgets/MChooseAccountWidget;Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;)V", "getAccountWidget", "()Lcom/ss/android/ugc/aweme/profile/widgets/MChooseAccountWidget;", "getRootView", "()Landroid/view/ViewGroup;", "getUser", "()Lcom/ss/android/ugc/aweme/user/SignificantUserInfo;", "getViewModel", "()Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public final ViewGroup f63202a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.user.a f63203b;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final MChooseAccountWidget f63204c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        public final MultiAccountViewModel f63205d;

        public b(@NotNull ViewGroup viewGroup, @NotNull com.ss.android.ugc.aweme.user.a aVar, @NotNull MChooseAccountWidget mChooseAccountWidget, @NotNull MultiAccountViewModel multiAccountViewModel) {
            String valueOf;
            String str;
            boolean z;
            Intrinsics.checkParameterIsNotNull(viewGroup, "rootView");
            Intrinsics.checkParameterIsNotNull(aVar, AllStoryActivity.f73306b);
            Intrinsics.checkParameterIsNotNull(mChooseAccountWidget, "accountWidget");
            Intrinsics.checkParameterIsNotNull(multiAccountViewModel, "viewModel");
            this.f63202a = viewGroup;
            this.f63203b = aVar;
            this.f63204c = mChooseAccountWidget;
            this.f63205d = multiAccountViewModel;
            int i = 0;
            if (Intrinsics.areEqual((Object) this.f63203b.f75289b, (Object) "-1")) {
                ((ImageView) this.f63202a.findViewById(C0906R.id.hk)).setImageResource(2130839482);
                ((TextView) this.f63202a.findViewById(C0906R.id.bbm)).setText(C0906R.string.f4478cn);
                View findViewById = this.f63202a.findViewById(C0906R.id.bbn);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById<View>(R.id.line1)");
                findViewById.setVisibility(8);
            } else {
                com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.f63202a.findViewById(C0906R.id.hk), this.f63203b.f75293f);
                View findViewById2 = this.f63202a.findViewById(C0906R.id.bbm);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById<TextView>(R.id.line0)");
                ((TextView) findViewById2).setText(this.f63203b.f75292e);
                View findViewById3 = this.f63202a.findViewById(C0906R.id.bbn);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById<View>(R.id.line1)");
                findViewById3.setVisibility(0);
                View findViewById4 = this.f63202a.findViewById(C0906R.id.bbn);
                Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById<TextView>(R.id.line1)");
                TextView textView = (TextView) findViewById4;
                com.ss.android.ugc.aweme.user.a aVar2 = this.f63203b;
                if (PatchProxy.isSupport(new Object[0], aVar2, com.ss.android.ugc.aweme.user.a.f75288a, false, 87484, new Class[0], String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[0], aVar2, com.ss.android.ugc.aweme.user.a.f75288a, false, 87484, new Class[0], String.class);
                } else {
                    CharSequence charSequence = aVar2.f75291d;
                    if (charSequence == null || charSequence.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str = aVar2.f75290c;
                    } else {
                        str = aVar2.f75291d;
                    }
                }
                textView.setText(str);
            }
            View findViewById5 = this.f63202a.findViewById(C0906R.id.a1t);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById<View>(R.id.current_flag)");
            String str2 = this.f63203b.f75289b;
            IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            findViewById5.setVisibility(!Intrinsics.areEqual((Object) str2, (Object) a2.getCurUserId()) ? 8 : i);
            View findViewById6 = this.f63202a.findViewById(C0906R.id.ccp);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "rootView.findViewById<View>(R.id.red_point)");
            findViewById6.setVisibility(8);
            View findViewById7 = this.f63202a.findViewById(C0906R.id.bmp);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "rootView.findViewById<View>(R.id.message_count)");
            findViewById7.setVisibility(8);
            String str3 = this.f63203b.f75289b;
            IAccountUserService a3 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
            if (!Intrinsics.areEqual((Object) str3, (Object) a3.getCurUserId())) {
                int a4 = com.ss.android.ugc.aweme.message.c.b.a().a(this.f63203b.f75289b);
                if (a4 > 0) {
                    TextView textView2 = (TextView) this.f63202a.findViewById(C0906R.id.bmp);
                    Intrinsics.checkExpressionValueIsNotNull(textView2, "messageCountTv");
                    textView2.setVisibility(8);
                    if (a4 > 99) {
                        valueOf = "99+";
                    } else {
                        valueOf = String.valueOf(a4);
                    }
                    textView2.setText(valueOf);
                }
            }
            this.f63202a.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63206a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f63207b;

                {
                    this.f63207b = r1;
                }

                public final void onClick(View view) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f63206a, false, 70117, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f63206a, false, 70117, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    this.f63207b.f63204c.dismiss();
                    if (!Intrinsics.areEqual((Object) this.f63207b.f63203b.f75289b, (Object) "-1")) {
                        IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
                        Intrinsics.checkExpressionValueIsNotNull(publishService, "ServiceManager.get().get…ss.java).publishService()");
                        if (!publishService.isUnKnown()) {
                            IAVPublishService publishService2 = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
                            Intrinsics.checkExpressionValueIsNotNull(publishService2, "ServiceManager.get().get…ss.java).publishService()");
                            if (!publishService2.isPublishFinished()) {
                                Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
                                com.bytedance.ies.dmt.ui.d.a.b(view.getContext(), (int) C0906R.string.bt6).a();
                            }
                        }
                        r.a("switch_account_submit", (Map) null);
                        this.f63207b.f63205d.a(this.f63207b.f63203b.f75289b, (Bundle) null, (com.bytedance.sdk.account.api.a.f) new com.bytedance.sdk.account.api.a.f() {

                            /* renamed from: c  reason: collision with root package name */
                            public static ChangeQuickRedirect f63208c;

                            public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
                                com.bytedance.sdk.account.api.c.f fVar = (com.bytedance.sdk.account.api.c.f) baseApiResponse;
                                if (PatchProxy.isSupport(new Object[]{fVar}, this, f63208c, false, 70118, new Class[]{com.bytedance.sdk.account.api.c.f.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{fVar}, this, f63208c, false, 70118, new Class[]{com.bytedance.sdk.account.api.c.f.class}, Void.TYPE);
                                    return;
                                }
                                r.a("switch_account_result", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("status", 1).f34114b);
                            }

                            public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
                                com.bytedance.sdk.account.api.c.f fVar = (com.bytedance.sdk.account.api.c.f) baseApiResponse;
                                if (PatchProxy.isSupport(new Object[]{fVar, Integer.valueOf(i)}, this, f63208c, false, 70119, new Class[]{com.bytedance.sdk.account.api.c.f.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{fVar, Integer.valueOf(i)}, this, f63208c, false, 70119, new Class[]{com.bytedance.sdk.account.api.c.f.class, Integer.TYPE}, Void.TYPE);
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
                        });
                    } else if (com.ss.android.ugc.aweme.account.d.a().allUidList().size() < 3) {
                        MultiAccountViewModel.a aVar = MultiAccountViewModel.f63177d;
                        if (PatchProxy.isSupport(new Object[]{"", "add_account_mine"}, aVar, MultiAccountViewModel.a.f63178a, false, 70083, new Class[]{String.class, String.class}, Void.TYPE)) {
                            MultiAccountViewModel.a aVar2 = aVar;
                            PatchProxy.accessDispatch(new Object[]{"", "add_account_mine"}, aVar2, MultiAccountViewModel.a.f63178a, false, 70083, new Class[]{String.class, String.class}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull("", "enterFrom");
                            Intrinsics.checkParameterIsNotNull("add_account_mine", "enterMethod");
                            AwemeAppData p = AwemeAppData.p();
                            Intrinsics.checkExpressionValueIsNotNull(p, "AwemeAppData.inst()");
                            Activity f2 = p.f();
                            ad a2 = ad.a();
                            IAccountUserService a3 = com.ss.android.ugc.aweme.account.d.a();
                            Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
                            com.ss.android.ugc.aweme.login.e.a(f2, "", "add_account_mine", a2.a("previous_uid", a3.getCurUserId()).a("force_use_default_login_method", true).a("need_auto_fill_latest_login_info", false).f75487b);
                        }
                    } else {
                        com.bytedance.ies.dmt.ui.d.a.c(this.f63207b.f63202a.getContext(), (int) C0906R.string.co).a();
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/profile/widgets/MChooseAccountWidget$createPopupWindow$p$1", "Landroid/widget/PopupWindow;", "showAsDropDown", "", "anchor", "Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends PopupWindow {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63209a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MChooseAccountWidget f63210b;

        public final void showAsDropDown(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f63209a, false, 70121, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f63209a, false, 70121, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "anchor");
            if (Build.VERSION.SDK_INT >= 24) {
                Rect rect = new Rect();
                view2.getGlobalVisibleRect(rect);
                Resources resources = view.getResources();
                Intrinsics.checkExpressionValueIsNotNull(resources, "anchor.resources");
                setHeight(resources.getDisplayMetrics().heightPixels - rect.bottom);
            }
            super.showAsDropDown(view);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(MChooseAccountWidget mChooseAccountWidget, View view, int i, int i2) {
            super(view, -1, -1);
            this.f63210b = mChooseAccountWidget;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<LayoutInflater> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ MChooseAccountWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(MChooseAccountWidget mChooseAccountWidget) {
            super(0);
            this.this$0 = mChooseAccountWidget;
        }

        public final LayoutInflater invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70122, new Class[0], LayoutInflater.class)) {
                return (LayoutInflater) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70122, new Class[0], LayoutInflater.class);
            }
            View view = this.this$0.f2711f;
            Intrinsics.checkExpressionValueIsNotNull(view, "mContentView");
            return LayoutInflater.from(view.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63211a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MChooseAccountWidget f63212b;

        e(MChooseAccountWidget mChooseAccountWidget) {
            this.f63212b = mChooseAccountWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f63211a, false, 70123, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f63211a, false, 70123, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            AbTestManager a2 = AbTestManager.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
            if (a2.al()) {
                r.a("account_list_unfold", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("status", 0).a("enter_method", "user_click").f34114b);
                this.f63212b.e();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63213a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MChooseAccountWidget f63214b;

        f(MChooseAccountWidget mChooseAccountWidget) {
            this.f63214b = mChooseAccountWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f63213a, false, 70124, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f63213a, false, 70124, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            AbTestManager a2 = AbTestManager.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
            if (a2.al()) {
                r.a("account_list_unfold", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("status", 0).a("enter_method", "user_click").f34114b);
                this.f63214b.e();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 15})
    static final class g implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63215a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MChooseAccountWidget f63216b;

        g(MChooseAccountWidget mChooseAccountWidget) {
            this.f63216b = mChooseAccountWidget;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            View view2;
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f63215a, false, 70125, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f63215a, false, 70125, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            if (view == this.f63216b.m) {
                view2 = this.f63216b.l;
            } else {
                view2 = this.f63216b.m;
            }
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        view2.animate().alpha(0.5f).setDuration(200).start();
                        break;
                    case 1:
                        view.performClick();
                        break;
                }
            }
            view2.animate().alpha(1.0f).setDuration(200).start();
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function0<ViewGroup> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ MChooseAccountWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(MChooseAccountWidget mChooseAccountWidget) {
            super(0);
            this.this$0 = mChooseAccountWidget;
        }

        @NotNull
        public final ViewGroup invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70126, new Class[0], ViewGroup.class)) {
                return (ViewGroup) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70126, new Class[0], ViewGroup.class);
            }
            View view = this.this$0.f2711f;
            if (view != null) {
                return (ViewGroup) view;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63217a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MChooseAccountWidget f63218b;

        i(MChooseAccountWidget mChooseAccountWidget) {
            this.f63218b = mChooseAccountWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f63217a, false, 70127, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f63217a, false, 70127, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            PopupWindow popupWindow = this.f63218b.k;
            if (popupWindow != null) {
                b.a(popupWindow);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onDismiss"}, k = 3, mv = {1, 1, 15})
    static final class j implements PopupWindow.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63219a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MChooseAccountWidget f63220b;

        j(MChooseAccountWidget mChooseAccountWidget) {
            this.f63220b = mChooseAccountWidget;
        }

        public final void onDismiss() {
            if (PatchProxy.isSupport(new Object[0], this, f63219a, false, 70129, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f63219a, false, 70129, new Class[0], Void.TYPE);
                return;
            }
            this.f63220b.m.animate().rotation(180.0f).setDuration(100).start();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function0<MultiAccountViewModel> {
        public static final k INSTANCE = new k();
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
            super(0);
        }

        @NotNull
        public final MultiAccountViewModel invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70130, new Class[0], MultiAccountViewModel.class)) {
                return new MultiAccountViewModel();
            }
            return (MultiAccountViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70130, new Class[0], MultiAccountViewModel.class);
        }
    }

    private final ViewGroup f() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f63200a, false, 70110, new Class[0], ViewGroup.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f63200a, false, 70110, new Class[0], ViewGroup.class);
        } else {
            value = this.p.getValue();
        }
        return (ViewGroup) value;
    }

    private final MultiAccountViewModel g() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f63200a, false, 70111, new Class[0], MultiAccountViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f63200a, false, 70111, new Class[0], MultiAccountViewModel.class);
        } else {
            value = this.q.getValue();
        }
        return (MultiAccountViewModel) value;
    }

    public final int b() {
        return C0906R.layout.z2;
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f63200a, false, 70115, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63200a, false, 70115, new Class[0], Void.TYPE);
            return;
        }
        PopupWindow popupWindow = this.k;
        if (popupWindow != null) {
            a.a(popupWindow);
        }
    }

    public final void e() {
        PopupWindow popupWindow;
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f63200a, false, 70114, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63200a, false, 70114, new Class[0], Void.TYPE);
            return;
        }
        PopupWindow popupWindow2 = this.k;
        if (popupWindow2 == null || !popupWindow2.isShowing()) {
            if (PatchProxy.isSupport(new Object[0], this, f63200a, false, 70116, new Class[0], PopupWindow.class)) {
                popupWindow = (PopupWindow) PatchProxy.accessDispatch(new Object[0], this, f63200a, false, 70116, new Class[0], PopupWindow.class);
            } else {
                f().removeAllViews();
                this.r.clear();
                View view = new View(f().getContext());
                view.setBackgroundResource(C0906R.color.ao4);
                f().addView(view, -1, (int) UIUtils.dip2Px(f().getContext(), 4.0f));
                for (com.ss.android.ugc.aweme.user.a aVar : g().a()) {
                    if (PatchProxy.isSupport(new Object[0], this, f63200a, false, 70109, new Class[0], LayoutInflater.class)) {
                        value = PatchProxy.accessDispatch(new Object[0], this, f63200a, false, 70109, new Class[0], LayoutInflater.class);
                    } else {
                        value = this.o.getValue();
                    }
                    View inflate = ((LayoutInflater) value).inflate(C0906R.layout.sm, f(), false);
                    if (inflate != null) {
                        b bVar = new b((ViewGroup) inflate, aVar, this, g());
                        bVar.f63202a.setTag(bVar);
                        f().addView(bVar.f63202a);
                        this.r.add(bVar);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                }
                View view2 = new View(f().getContext());
                view2.setBackgroundResource(C0906R.color.ao4);
                f().addView(view2, -1, (int) UIUtils.dip2Px(f().getContext(), 4.0f));
                c cVar = new c(this, this.f2711f, -1, -1);
                cVar.setFocusable(true);
                cVar.setOutsideTouchable(true);
                View view3 = this.f2711f;
                Intrinsics.checkExpressionValueIsNotNull(view3, "mContentView");
                cVar.setBackgroundDrawable(new ColorDrawable(view3.getResources().getColor(C0906R.color.a3c)));
                popupWindow = cVar;
            }
            this.k = popupWindow;
            PopupWindow popupWindow3 = this.k;
            if (popupWindow3 == null) {
                Intrinsics.throwNpe();
            }
            popupWindow3.showAsDropDown(this.t);
            this.m.animate().rotation(0.0f).setDuration(100).start();
            this.f2711f.setOnClickListener(new i(this));
            PopupWindow popupWindow4 = this.k;
            if (popupWindow4 == null) {
                Intrinsics.throwNpe();
            }
            popupWindow4.setOnDismissListener(new j(this));
        }
    }

    public final void a(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f63200a, false, 70112, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f63200a, false, 70112, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.a(view);
        f().removeAllViews();
        View.OnTouchListener aVar = new com.ss.android.ugc.aweme.h.a(0.5f, 200, new g(this));
        this.l.setOnTouchListener(aVar);
        this.m.setOnTouchListener(aVar);
        this.l.setOnClickListener(new e(this));
        this.m.setOnClickListener(new f(this));
    }

    public final void a(@NotNull User user) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{user}, this, f63200a, false, 70113, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f63200a, false, 70113, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        int i3 = 8;
        if (a2.al()) {
            this.s.setVisibility(8);
            this.m.setVisibility(0);
            this.u.setVisibility(8);
            IAccountUserService a3 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
            String curUserId = a3.getCurUserId();
            List<String> allUidList = com.ss.android.ugc.aweme.account.d.a().allUidList();
            Intrinsics.checkExpressionValueIsNotNull(allUidList, "AccountUserProxyService.get().allUidList()");
            Iterable<String> iterable = allUidList;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (String str : iterable) {
                if (Intrinsics.areEqual((Object) curUserId, (Object) str)) {
                    i2 = 0;
                } else {
                    i2 = com.ss.android.ugc.aweme.message.c.b.a().a(str);
                }
                arrayList.add(Integer.valueOf(i2));
            }
            int sumOfInt = CollectionsKt.sumOfInt((List) arrayList);
            View view = this.u;
            if (sumOfInt > 0) {
                i3 = 0;
            }
            view.setVisibility(i3);
            return;
        }
        if (!ex.b()) {
            this.s.setVisibility(0);
        }
        this.m.setVisibility(8);
        this.u.setVisibility(8);
    }

    public MChooseAccountWidget(@NotNull View view, @NotNull View view2, @NotNull View view3, @NotNull View view4, @NotNull View view5) {
        Intrinsics.checkParameterIsNotNull(view, "qrView");
        Intrinsics.checkParameterIsNotNull(view2, "titleBar");
        Intrinsics.checkParameterIsNotNull(view3, PushConstants.TITLE);
        Intrinsics.checkParameterIsNotNull(view4, "moreBtn");
        Intrinsics.checkParameterIsNotNull(view5, "redPointView");
        this.s = view;
        this.t = view2;
        this.l = view3;
        this.m = view4;
        this.u = view5;
    }
}
