package com.ss.android.ugc.aweme.following.ui.adapter;

import android.app.Dialog;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.aa;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.arch.JediBaseSingleTypeAdapter;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.d.ae;
import com.ss.android.ugc.aweme.profile.d.s;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.h;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.q;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.ex;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001e\u0010\u0012\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/adapter/FollowListAdapter;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseSingleTypeAdapter;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "parent", "Landroid/arch/lifecycle/LifecycleOwner;", "relationType", "", "isSelf", "", "(Landroid/arch/lifecycle/LifecycleOwner;Ljava/lang/String;Z)V", "()Z", "mFollowClickMap", "", "mFollowListRecommend", "getParent", "()Landroid/arch/lifecycle/LifecycleOwner;", "getRelationType", "()Ljava/lang/String;", "createViewHolder", "Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "Lcom/bytedance/jedi/arch/IReceiver;", "Landroid/view/ViewGroup;", "getEventType", "getFollowFromType", "", "getPageType", "logEnterPersonalDetailEvent", "", "user", "logFollowEvent", "Companion", "FollowItemViewHolder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowListAdapter extends JediBaseSingleTypeAdapter<User> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f48068f;
    public static final a l = new a((byte) 0);
    public final Map<String, Boolean> g = new LinkedHashMap();
    public final boolean h;
    @NotNull
    public final LifecycleOwner i;
    @NotNull
    public final String j;
    public final boolean k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0004\u0018\u00002\u0012\u0012\b\u0012\u00060\u0000R\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0003H\u0002J\b\u0010$\u001a\u00020\u001cH\u0016J\u0018\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/adapter/FollowListAdapter$FollowItemViewHolder;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseViewHolder;", "Lcom/ss/android/ugc/aweme/following/ui/adapter/FollowListAdapter;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "view", "Landroid/view/View;", "(Lcom/ss/android/ugc/aweme/following/ui/adapter/FollowListAdapter;Landroid/view/View;)V", "editRemark", "Landroid/widget/ImageView;", "followerRelationViewModel", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationViewModel;", "getFollowerRelationViewModel", "()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationViewModel;", "followerRelationViewModel$delegate", "Lkotlin/Lazy;", "ivAvatar", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;", "more", "txtDesc", "Landroid/widget/TextView;", "txtFollow", "Lcom/ss/android/ugc/aweme/following/ui/view/FollowUserBtn;", "txtUserName", "viewModel", "Lcom/ss/android/ugc/aweme/user/repository/UserViewModel;", "getViewModel", "()Lcom/ss/android/ugc/aweme/user/repository/UserViewModel;", "displayRemarkEditView", "", "user", "followStatus", "", "isFollowed", "", "onBindUser", "item", "onCreate", "setUserNameAndDesc", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public final class FollowItemViewHolder extends JediBaseViewHolder<FollowItemViewHolder, User> {
        public static ChangeQuickRedirect g;
        static final /* synthetic */ KProperty[] h = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FollowItemViewHolder.class), "followerRelationViewModel", "getFollowerRelationViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationViewModel;"))};
        public final ImageView i;
        final Lazy j;
        final /* synthetic */ FollowListAdapter k;
        private final AvatarImageWithVerify l;
        private final TextView m;
        private final TextView n;
        private final FollowUserBtn o;
        private final ImageView p;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0012\b\u0000\u0010\u0002*\f\u0012\u0004\u0012\u0002H\u0002\u0012\u0002\b\u00030\u0003\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0002\u0010\u0005*\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "VM", "T", "Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/ext/adapter/ExtensionsKt$hostViewModel$2"}, k = 3, mv = {1, 1, 15})
        public static final class a extends Lambda implements Function0<FollowerRelationViewModel> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ KClass $viewModelClass;
            final /* synthetic */ KClass $viewModelClass$inlined;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, KClass kClass, KClass kClass2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = kClass;
                this.$viewModelClass$inlined = kClass2;
            }

            /* JADX WARNING: type inference failed for: r0v9, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
            /* JADX WARNING: type inference failed for: r2v13, types: [com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: type inference failed for: r4v4, types: [com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
            /* JADX WARNING: Failed to insert additional move for type inference */
            /* JADX WARNING: Multi-variable type inference failed */
            @org.jetbrains.annotations.NotNull
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel invoke() {
                /*
                    r9 = this;
                    r0 = 0
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class<com.bytedance.jedi.arch.JediViewModel> r7 = com.bytedance.jedi.arch.JediViewModel.class
                    r4 = 0
                    r5 = 45084(0xb01c, float:6.3176E-41)
                    r2 = r9
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 == 0) goto L_0x0028
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                    r5 = 0
                    r6 = 45084(0xb01c, float:6.3176E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]
                    java.lang.Class<com.bytedance.jedi.arch.JediViewModel> r8 = com.bytedance.jedi.arch.JediViewModel.class
                    r3 = r9
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                    com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                    return r0
                L_0x0028:
                    com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r9.$this_hostViewModel
                    android.arch.lifecycle.LifecycleOwner r0 = r0.k()
                    java.lang.Object r0 = com.bytedance.jedi.ext.adapter.a.a(r0)
                    kotlin.reflect.KClass r1 = r9.$viewModelClass$inlined
                    java.lang.Class r1 = kotlin.jvm.a.a(r1)
                    java.lang.String r1 = r1.getName()
                    java.lang.String r2 = "viewModelClass.java.name"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                    r2 = 0
                    boolean r3 = r0 instanceof android.support.v4.app.Fragment
                    if (r3 == 0) goto L_0x0082
                    android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
                    r3 = r0
                L_0x0049:
                    if (r3 == 0) goto L_0x0066
                    android.arch.lifecycle.ViewModelProvider$Factory r4 = com.bytedance.jedi.arch.b.a()     // Catch:{ af -> 0x0061 }
                    android.arch.lifecycle.ViewModelProvider r4 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.Fragment) r3, (android.arch.lifecycle.ViewModelProvider.Factory) r4)     // Catch:{ af -> 0x0061 }
                    kotlin.reflect.KClass r5 = r9.$viewModelClass     // Catch:{ af -> 0x0061 }
                    java.lang.Class r5 = kotlin.jvm.a.a(r5)     // Catch:{ af -> 0x0061 }
                    android.arch.lifecycle.ViewModel r4 = r4.get(r1, r5)     // Catch:{ af -> 0x0061 }
                    com.bytedance.jedi.arch.JediViewModel r4 = (com.bytedance.jedi.arch.JediViewModel) r4     // Catch:{ af -> 0x0061 }
                    r2 = r4
                    goto L_0x0066
                L_0x0061:
                    android.support.v4.app.Fragment r3 = r3.getParentFragment()
                    goto L_0x0049
                L_0x0066:
                    if (r2 != 0) goto L_0x0081
                    android.support.v4.app.FragmentActivity r0 = r0.requireActivity()
                    android.arch.lifecycle.ViewModelProvider$Factory r2 = com.bytedance.jedi.arch.b.a()
                    android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r0, (android.arch.lifecycle.ViewModelProvider.Factory) r2)
                    kotlin.reflect.KClass r2 = r9.$viewModelClass
                    java.lang.Class r2 = kotlin.jvm.a.a(r2)
                    android.arch.lifecycle.ViewModel r0 = r0.get(r1, r2)
                    r2 = r0
                    com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                L_0x0081:
                    return r2
                L_0x0082:
                    boolean r2 = r0 instanceof android.support.v4.app.FragmentActivity
                    if (r2 == 0) goto L_0x00a2
                    android.support.v4.app.FragmentActivity r0 = (android.support.v4.app.FragmentActivity) r0
                    android.arch.lifecycle.ViewModelProvider$Factory r2 = com.bytedance.jedi.arch.b.a()
                    android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r0, (android.arch.lifecycle.ViewModelProvider.Factory) r2)
                    kotlin.reflect.KClass r2 = r9.$viewModelClass
                    java.lang.Class r2 = kotlin.jvm.a.a(r2)
                    android.arch.lifecycle.ViewModel r0 = r0.get(r1, r2)
                    java.lang.String r1 = "ViewModelProviders\n     …key, viewModelClass.java)"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                    com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                    return r0
                L_0x00a2:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r0.<init>()
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter.FollowItemViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/following/ui/adapter/FollowListAdapter$FollowItemViewHolder$displayRemarkEditView$1", "Lcom/ss/android/ugc/aweme/profile/util/ProfileUtils$RemarkCallBack;", "onRemarkEditSuccess", "", "onUnFollowed", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class b implements s.a {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48069a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ FollowItemViewHolder f48070b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ User f48071c;

            public final void b() {
            }

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f48069a, false, 45085, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f48069a, false, 45085, new Class[0], Void.TYPE);
                    return;
                }
                this.f48070b.a(this.f48071c, this.f48071c.getFollowStatus());
            }

            b(FollowItemViewHolder followItemViewHolder, User user) {
                this.f48070b = followItemViewHolder;
                this.f48071c = user;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        static final class c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48072a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ FollowItemViewHolder f48073b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ User f48074c;

            c(FollowItemViewHolder followItemViewHolder, User user) {
                this.f48073b = followItemViewHolder;
                this.f48074c = user;
            }

            public final void onClick(View view) {
                String str;
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f48072a, false, 45086, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f48072a, false, 45086, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (this.f48073b.k.h) {
                    Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
                    UserProfileActivity.a(view.getContext(), ad.a().a("uid", this.f48074c.getUid()).a("sec_user_id", this.f48074c.getSecUid()).a("enter_from", this.f48073b.k.d()).a("need_track_compare_recommend_reason", 1).a("previous_recommend_reason", this.f48074c.getRecommendReason()).a("recommend_from_type", "list").f75487b);
                } else {
                    Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
                    UserProfileActivity.b(view.getContext(), this.f48074c, this.f48073b.k.d());
                }
                FollowListAdapter followListAdapter = this.f48073b.k;
                User user = this.f48074c;
                if (PatchProxy.isSupport(new Object[]{user}, followListAdapter, FollowListAdapter.f48068f, false, 45076, new Class[]{User.class}, Void.TYPE)) {
                    FollowListAdapter followListAdapter2 = followListAdapter;
                    PatchProxy.accessDispatch(new Object[]{user}, followListAdapter2, FollowListAdapter.f48068f, false, 45076, new Class[]{User.class}, Void.TYPE);
                    return;
                }
                q b2 = new q().k(user.getUid()).b(followListAdapter.d());
                if (followListAdapter.k) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                b2.i(str).h("1044").e();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        static final class d implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48075a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ FollowItemViewHolder f48076b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ User f48077c;

            d(FollowItemViewHolder followItemViewHolder, User user) {
                this.f48076b = followItemViewHolder;
                this.f48077c = user;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                String str3;
                int i = 1;
                if (PatchProxy.isSupport(new Object[]{view}, this, f48075a, false, 45087, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f48075a, false, 45087, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                FollowListAdapter followListAdapter = this.f48076b.k;
                User user = this.f48077c;
                if (PatchProxy.isSupport(new Object[]{user}, followListAdapter, FollowListAdapter.f48068f, false, 45077, new Class[]{User.class}, Void.TYPE)) {
                    FollowListAdapter followListAdapter2 = followListAdapter;
                    PatchProxy.accessDispatch(new Object[]{user}, followListAdapter2, FollowListAdapter.f48068f, false, 45077, new Class[]{User.class}, Void.TYPE);
                } else {
                    if (user.getFollowStatus() == 0) {
                        str = "follow";
                    } else {
                        str = "follow_cancel";
                    }
                    com.ss.android.ugc.aweme.u.s sVar = new com.ss.android.ugc.aweme.u.s(str);
                    if (followListAdapter.k) {
                        str2 = "personal_homepage";
                    } else {
                        str2 = "others_homepage";
                    }
                    com.ss.android.ugc.aweme.u.s c2 = sVar.f(str2).b(followListAdapter.d()).c("follow_button");
                    if (user.getFollowStatus() == 0) {
                        str3 = "1007";
                    } else {
                        str3 = "1036";
                    }
                    c2.a(str3).h(user.getUid()).e();
                }
                if (this.f48077c.getFollowStatus() != 0) {
                    i = 0;
                }
                UserViewModel l = this.f48076b.l();
                h a2 = new i.a().a(this.f48077c.getUid()).b(this.f48077c.getSecUid()).a(i).c(this.f48076b.k.d()).b(this.f48076b.k.e()).a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "FollowPresenter.FollowPa…                 .build()");
                l.a(a2);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        static final class e implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48078a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ FollowItemViewHolder f48079b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ User f48080c;

            e(FollowItemViewHolder followItemViewHolder, User user) {
                this.f48079b = followItemViewHolder;
                this.f48080c = user;
            }

            public final void onClick(final View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f48078a, false, 45088, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f48078a, false, 45088, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                final Resources resources = this.f48079b.i.getResources();
                String string = resources.getString(C0906R.string.bz3);
                Intrinsics.checkExpressionValueIsNotNull(string, "res.getString(R.string.r…ove_follower_alert_title)");
                String string2 = resources.getString(C0906R.string.pm);
                Intrinsics.checkExpressionValueIsNotNull(string2, "res.getString(R.string.cancel)");
                CharSequence[] charSequenceArr = {string, string2};
                Intrinsics.checkExpressionValueIsNotNull(view, NotifyType.VIBRATE);
                com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(view.getContext());
                aVar.a(charSequenceArr, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f48081a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ e f48082b;

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
                    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$e$1$a */
                    static final class a implements DialogInterface.OnClickListener {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f48085a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f48086b;

                        a(AnonymousClass1 r1) {
                            this.f48086b = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Single single;
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f48085a, false, 45090, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f48085a, false, 45090, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            r.a("remove_fans", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "fans").f34114b);
                            UserViewModel l = this.f48086b.f48082b.f48079b.l();
                            String uid = this.f48086b.f48082b.f48080c.getUid();
                            Intrinsics.checkExpressionValueIsNotNull(uid, "item.uid");
                            if (PatchProxy.isSupport(new Object[]{uid}, l, UserViewModel.f4281d, false, 87697, new Class[]{String.class}, Disposable.class)) {
                                UserViewModel userViewModel = l;
                                Disposable disposable = (Disposable) PatchProxy.accessDispatch(new Object[]{uid}, userViewModel, UserViewModel.f4281d, false, 87697, new Class[]{String.class}, Disposable.class);
                            } else {
                                Intrinsics.checkParameterIsNotNull(uid, "uid");
                                com.ss.android.ugc.aweme.user.repository.h hVar = l.f4282e;
                                if (PatchProxy.isSupport(new Object[]{uid}, hVar, com.ss.android.ugc.aweme.user.repository.h.f75392a, false, 87683, new Class[]{String.class}, Single.class)) {
                                    com.ss.android.ugc.aweme.user.repository.h hVar2 = hVar;
                                    single = (Single) PatchProxy.accessDispatch(new Object[]{uid}, hVar2, com.ss.android.ugc.aweme.user.repository.h.f75392a, false, 87683, new Class[]{String.class}, Single.class);
                                } else {
                                    Intrinsics.checkParameterIsNotNull(uid, "uid");
                                    Observable a2 = hVar.f75393b.a(uid);
                                    if (PatchProxy.isSupport(new Object[]{a2}, hVar, com.ss.android.ugc.aweme.user.repository.h.f75392a, false, 87686, new Class[]{Observable.class}, Single.class)) {
                                        com.ss.android.ugc.aweme.user.repository.h hVar3 = hVar;
                                        single = (Single) PatchProxy.accessDispatch(new Object[]{a2}, hVar3, com.ss.android.ugc.aweme.user.repository.h.f75392a, false, 87686, new Class[]{Observable.class}, Single.class);
                                    } else {
                                        single = Single.fromObservable(a2);
                                        Intrinsics.checkExpressionValueIsNotNull(single, "Single.fromObservable(this)");
                                    }
                                }
                                Single observeOn = single.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
                                Intrinsics.checkExpressionValueIsNotNull(observeOn, "userRepository.removeFol…dSchedulers.mainThread())");
                                l.a(observeOn, UserViewModel.c.INSTANCE);
                            }
                        }
                    }

                    {
                        this.f48082b = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        String str;
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f48081a, false, 45089, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f48081a, false, 45089, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        if (i == 0) {
                            r.a("click_remove_fans", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "fans").f34114b);
                            View view = view;
                            Intrinsics.checkExpressionValueIsNotNull(view, NotifyType.VIBRATE);
                            a.C0185a a2 = new a.C0185a(view.getContext()).a((int) C0906R.string.bz3);
                            if (com.ss.android.g.a.a()) {
                                View view2 = view;
                                Intrinsics.checkExpressionValueIsNotNull(view2, NotifyType.VIBRATE);
                                String string = view2.getResources().getString(C0906R.string.bz2);
                                Intrinsics.checkExpressionValueIsNotNull(string, "v.resources.getString(R.…emove_follower_alert_msg)");
                                str = String.format(string, Arrays.copyOf(new Object[]{ex.b(this.f48082b.f48080c)}, 1));
                                Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(format, *args)");
                            } else {
                                View view3 = view;
                                Intrinsics.checkExpressionValueIsNotNull(view3, NotifyType.VIBRATE);
                                str = view3.getResources().getString(C0906R.string.bz2);
                            }
                            Dialog b2 = a2.b(str).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a((int) C0906R.string.bz1, (DialogInterface.OnClickListener) new a(this)).a().b();
                            if (b2.findViewById(C0906R.id.dhn) instanceof TextView) {
                                View findViewById = b2.findViewById(C0906R.id.dhn);
                                if (findViewById != null) {
                                    ((TextView) findViewById).setTextColor(resources.getColor(C0906R.color.ho));
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                                }
                            }
                        }
                    }
                });
                aVar.b();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/following/ui/adapter/FollowListAdapter$FollowItemViewHolder;", "Lcom/ss/android/ugc/aweme/following/ui/adapter/FollowListAdapter;", "it", "Lcom/ss/android/ugc/aweme/user/repository/UserState;", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class f extends Lambda implements Function2<FollowItemViewHolder, UserState, Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ FollowItemViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(FollowItemViewHolder followItemViewHolder) {
                super(2);
                this.this$0 = followItemViewHolder;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((FollowItemViewHolder) obj, (UserState) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull FollowItemViewHolder followItemViewHolder, @NotNull UserState userState) {
                Object value;
                final FollowItemViewHolder followItemViewHolder2 = followItemViewHolder;
                final UserState userState2 = userState;
                if (PatchProxy.isSupport(new Object[]{followItemViewHolder2, userState2}, this, changeQuickRedirect, false, 45091, new Class[]{FollowItemViewHolder.class, UserState.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{followItemViewHolder2, userState2}, this, changeQuickRedirect, false, 45091, new Class[]{FollowItemViewHolder.class, UserState.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(followItemViewHolder2, "$receiver");
                Intrinsics.checkParameterIsNotNull(userState2, AdvanceSetting.NETWORK_TYPE);
                com.bytedance.jedi.arch.a<FollowStatus> followStatus = userState.getFollowStatus();
                if (followStatus instanceof aa) {
                    Map<String, Boolean> map = this.this$0.k.g;
                    String uid = userState.getUser().getUid();
                    Intrinsics.checkExpressionValueIsNotNull(uid, "it.user.uid");
                    map.put(uid, Boolean.valueOf(FollowItemViewHolder.a(((FollowStatus) ((aa) userState.getFollowStatus()).a()).followStatus)));
                    followItemViewHolder2.a(userState.getUser());
                    com.ss.android.ugc.aweme.im.b.a().updateIMUser(IMUser.fromUser(userState.getUser()));
                } else if (followStatus instanceof com.bytedance.jedi.arch.c) {
                    Throwable th = ((com.bytedance.jedi.arch.c) userState.getFollowStatus()).f21347a;
                    if (!(th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) || !(this.this$0.k.i instanceof AmeBaseFragment) || !com.ss.android.ugc.aweme.captcha.c.b.a((Exception) th)) {
                        View view = followItemViewHolder2.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                        com.ss.android.ugc.aweme.app.api.a.a.a(view.getContext(), ((com.bytedance.jedi.arch.c) userState.getFollowStatus()).f21347a, C0906R.string.afx);
                    } else {
                        LifecycleOwner lifecycleOwner = this.this$0.k.i;
                        if (lifecycleOwner != null) {
                            com.ss.android.ugc.aweme.captcha.c.b.a(((AmeBaseFragment) lifecycleOwner).getChildFragmentManager(), (com.ss.android.ugc.aweme.base.api.a.b.a) th, new com.ss.android.ugc.aweme.captcha.b(this) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f48087a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ f f48088b;

                                public final void b() {
                                    if (PatchProxy.isSupport(new Object[0], this, f48087a, false, 45093, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f48087a, false, 45093, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    View view = followItemViewHolder2.itemView;
                                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                                    com.ss.android.ugc.aweme.app.api.a.a.a(view.getContext(), ((com.bytedance.jedi.arch.c) userState2.getFollowStatus()).f21347a, C0906R.string.afx);
                                }

                                public final void a() {
                                    int i = 0;
                                    if (PatchProxy.isSupport(new Object[0], this, f48087a, false, 45092, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f48087a, false, 45092, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (userState2.getUser().getFollowStatus() == 0) {
                                        i = 1;
                                    }
                                    UserViewModel l = followItemViewHolder2.l();
                                    h a2 = new i.a().a(userState2.getUser().getUid()).b(userState2.getUser().getSecUid()).a(i).c(this.f48088b.this$0.k.d()).b(this.f48088b.this$0.k.e()).a();
                                    Intrinsics.checkExpressionValueIsNotNull(a2, "FollowPresenter.FollowPa…                 .build()");
                                    l.a(a2);
                                }

                                {
                                    this.f48088b = r1;
                                }
                            });
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment");
                        }
                    }
                } else if (followStatus instanceof com.bytedance.jedi.arch.ad) {
                    followItemViewHolder2.a(userState.getUser());
                }
                if (userState.getFollowerIsRemoved()) {
                    if (PatchProxy.isSupport(new Object[0], followItemViewHolder, FollowItemViewHolder.g, false, 45079, new Class[0], FollowerRelationViewModel.class)) {
                        value = PatchProxy.accessDispatch(new Object[0], followItemViewHolder, FollowItemViewHolder.g, false, 45079, new Class[0], FollowerRelationViewModel.class);
                    } else {
                        value = followItemViewHolder2.j.getValue();
                    }
                    FollowerRelationViewModel followerRelationViewModel = (FollowerRelationViewModel) value;
                    String uid2 = userState.getUser().getUid();
                    Intrinsics.checkExpressionValueIsNotNull(uid2, "it.user.uid");
                    if (PatchProxy.isSupport(new Object[]{uid2}, followerRelationViewModel, FollowerRelationViewModel.f48192d, false, 45241, new Class[]{String.class}, Void.TYPE)) {
                        FollowerRelationViewModel followerRelationViewModel2 = followerRelationViewModel;
                        PatchProxy.accessDispatch(new Object[]{uid2}, followerRelationViewModel2, FollowerRelationViewModel.f48192d, false, 45241, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(uid2, "uid");
                    followerRelationViewModel.b(new FollowerRelationViewModel.e(followerRelationViewModel, uid2));
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/user/repository/UserState;", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class g extends Lambda implements Function1<UserState, UserState> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ FollowItemViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            g(FollowItemViewHolder followItemViewHolder) {
                super(1);
                this.this$0 = followItemViewHolder;
            }

            @NotNull
            public final UserState invoke(@NotNull UserState userState) {
                UserState userState2 = userState;
                if (PatchProxy.isSupport(new Object[]{userState2}, this, changeQuickRedirect, false, 45094, new Class[]{UserState.class}, UserState.class)) {
                    return (UserState) PatchProxy.accessDispatch(new Object[]{userState2}, this, changeQuickRedirect, false, 45094, new Class[]{UserState.class}, UserState.class);
                }
                Intrinsics.checkParameterIsNotNull(userState2, "$receiver");
                return UserState.copy$default(userState, (User) this.this$0.e(), false, null, null, 14, null);
            }
        }

        public static boolean a(int i2) {
            return i2 == 1 || i2 == 2;
        }

        public final void j() {
            if (PatchProxy.isSupport(new Object[0], this, g, false, 45080, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, g, false, 45080, new Class[0], Void.TYPE);
                return;
            }
            super.j();
            Disposable unused = a(l(), c(), false, new f(this));
        }

        public final UserViewModel l() {
            if (PatchProxy.isSupport(new Object[0], this, g, false, 45078, new Class[0], UserViewModel.class)) {
                return (UserViewModel) PatchProxy.accessDispatch(new Object[0], this, g, false, 45078, new Class[0], UserViewModel.class);
            }
            Function1 gVar = new g(this);
            Class<UserViewModel> cls = UserViewModel.class;
            com.bytedance.jedi.ext.adapter.b g2 = g();
            if (g2 != null) {
                com.bytedance.jedi.ext.adapter.g a2 = g.a.a(r_(), g2.b());
                JediViewModel jediViewModel = (JediViewModel) a2.a(getClass().getName() + '_' + cls.getName(), cls);
                n a3 = jediViewModel.f2282c.a(UserViewModel.class);
                if (a3 != null) {
                    a3.binding(jediViewModel);
                }
                jediViewModel.a(gVar);
                return (UserViewModel) jediViewModel;
            }
            throw new IllegalStateException("proxy not bound to viewHolder yet");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:31:0x015e, code lost:
            if (r0.bc() == 3) goto L_0x0160;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ss.android.ugc.aweme.profile.model.User r13) {
            /*
                r12 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r13
                com.meituan.robust.ChangeQuickRedirect r2 = g
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 45081(0xb019, float:6.3172E-41)
                r1 = r12
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0032
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r13
                com.meituan.robust.ChangeQuickRedirect r2 = g
                r3 = 0
                r4 = 45081(0xb019, float:6.3172E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r12
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0032:
                com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r12.l
                r0.setData((com.ss.android.ugc.aweme.profile.model.User) r13)
                android.view.View r0 = r12.itemView
                com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$c r1 = new com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$c
                r1.<init>(r12, r13)
                android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
                r0.setOnClickListener(r1)
                java.lang.String r0 = r13.getUid()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
                java.lang.String r2 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                java.lang.String r1 = r1.getCurUserId()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                r9 = 8
                if (r0 == 0) goto L_0x0066
                com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn r0 = r12.o
                r0.setVisibility(r9)
                goto L_0x007d
            L_0x0066:
                com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn r0 = r12.o
                r0.setVisibility(r8)
                com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn r0 = r12.o
                int r1 = r13.getFollowStatus()
                int r2 = r13.getFollowerStatus()
                if (r2 != r7) goto L_0x0079
                r2 = 1
                goto L_0x007a
            L_0x0079:
                r2 = 0
            L_0x007a:
                r0.a(r1, r2)
            L_0x007d:
                com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn r0 = r12.o
                com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$d r1 = new com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$d
                r1.<init>(r12, r13)
                android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
                r0.setOnClickListener(r1)
                com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
                java.lang.String r1 = "SharePrefCache.inst()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                com.ss.android.ugc.aweme.app.an r0 = r0.getRemoveFollowerSwitch()
                java.lang.String r1 = "SharePrefCache.inst().removeFollowerSwitch"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                java.lang.Object r0 = r0.c()
                java.lang.String r1 = "SharePrefCache.inst().removeFollowerSwitch.cache"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x00e9
                com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter r0 = r12.k
                boolean r0 = r0.k
                if (r0 == 0) goto L_0x00e9
                com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter r0 = r12.k
                java.lang.String r0 = r0.j
                java.lang.String r1 = "follower_relation"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
                if (r0 == 0) goto L_0x00e9
                android.widget.ImageView r0 = r12.i
                com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$e r1 = new com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$e
                r1.<init>(r12, r13)
                android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
                r0.setOnClickListener(r1)
                boolean r0 = com.ss.android.g.a.b()
                if (r0 == 0) goto L_0x00d8
                android.widget.ImageView r0 = r12.i
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.setAlpha(r1)
                goto L_0x00df
            L_0x00d8:
                android.widget.ImageView r0 = r12.i
                r1 = 1056964608(0x3f000000, float:0.5)
                r0.setAlpha(r1)
            L_0x00df:
                android.widget.ImageView r0 = r12.i
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                r1 = -2
                r0.width = r1
                goto L_0x00f1
            L_0x00e9:
                android.widget.ImageView r0 = r12.i
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                r0.width = r8
            L_0x00f1:
                int r0 = r13.getFollowStatus()
                r12.a(r13, r0)
                int r10 = r13.getFollowStatus()
                r11 = 2
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r0[r8] = r13
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
                r0[r7] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = g
                r3 = 0
                r4 = 45083(0xb01b, float:6.3175E-41)
                java.lang.Class[] r5 = new java.lang.Class[r11]
                java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
                r5[r8] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r7] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r12
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0141
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r0[r8] = r13
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
                r0[r7] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = g
                r3 = 0
                r4 = 45083(0xb01b, float:6.3175E-41)
                java.lang.Class[] r5 = new java.lang.Class[r11]
                java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
                r5[r8] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r7] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r12
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0141:
                com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                java.lang.String r1 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                int r0 = r0.bc()
                if (r0 == r11) goto L_0x0160
                com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                java.lang.String r1 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                int r0 = r0.bc()
                r1 = 3
                if (r0 != r1) goto L_0x01b1
            L_0x0160:
                com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter r0 = r12.k
                java.util.Map<java.lang.String, java.lang.Boolean> r0 = r0.g
                java.lang.String r1 = r13.getUid()
                java.lang.Object r0 = r0.get(r1)
                if (r0 == 0) goto L_0x01ac
                android.widget.ImageView r0 = r12.p
                r2 = r0
                android.view.View r2 = (android.view.View) r2
                java.lang.String r3 = "fans"
                com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter r0 = r12.k
                java.util.Map<java.lang.String, java.lang.Boolean> r0 = r0.g
                java.lang.String r1 = r13.getUid()
                java.lang.Object r0 = r0.get(r1)
                if (r0 != 0) goto L_0x0186
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0186:
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r4 = r0.booleanValue()
                com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$b r0 = new com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$b
                r0.<init>(r12, r13)
                r5 = r0
                com.ss.android.ugc.aweme.profile.d.s$a r5 = (com.ss.android.ugc.aweme.profile.d.s.a) r5
                r0 = r13
                r1 = r10
                com.ss.android.ugc.aweme.profile.d.s.a((com.ss.android.ugc.aweme.profile.model.User) r0, (int) r1, (android.view.View) r2, (java.lang.String) r3, (boolean) r4, (com.ss.android.ugc.aweme.profile.d.s.a) r5)
                com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter r0 = r12.k
                java.util.Map<java.lang.String, java.lang.Boolean> r0 = r0.g
                java.lang.String r1 = r13.getUid()
                java.lang.String r2 = "user.uid"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r0.put(r1, r2)
                return
            L_0x01ac:
                android.widget.ImageView r0 = r12.p
                r0.setVisibility(r9)
            L_0x01b1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter.FollowItemViewHolder.a(com.ss.android.ugc.aweme.profile.model.User):void");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FollowItemViewHolder(FollowListAdapter followListAdapter, @NotNull View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.k = followListAdapter;
            View findViewById = view.findViewById(C0906R.id.ayr);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.iv_avatar)");
            this.l = (AvatarImageWithVerify) findViewById;
            View findViewById2 = view.findViewById(C0906R.id.dnq);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.txt_user_name)");
            this.m = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0906R.id.dmv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.txt_desc)");
            this.n = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C0906R.id.dmz);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.txt_follow)");
            this.o = (FollowUserBtn) findViewById4;
            View findViewById5 = view.findViewById(C0906R.id.b0u);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "view.findViewById(R.id.iv_edit_remark)");
            this.p = (ImageView) findViewById5;
            View findViewById6 = view.findViewById(C0906R.id.bnh);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "view.findViewById(R.id.more)");
            this.i = (ImageView) findViewById6;
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FollowerRelationViewModel.class);
            this.j = LazyKt.lazy(new a(this, orCreateKotlinClass, orCreateKotlinClass));
        }

        public final void a(User user, int i2) {
            boolean z;
            boolean z2;
            if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i2)}, this, g, false, 45082, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i2)}, this, g, false, 45082, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.n.setVisibility(0);
            if (com.ss.android.g.a.b()) {
                this.m.setText(user.getNickname());
                this.n.setText("@" + ae.a(user));
                return;
            }
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                this.m.setText(user.getRemarkName());
                AbTestManager a2 = AbTestManager.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
                if (a2.m() != 4) {
                    AbTestManager a3 = AbTestManager.a();
                    Intrinsics.checkExpressionValueIsNotNull(a3, "AbTestManager.getInstance()");
                    if (a3.m() != 5) {
                        TextView textView = this.n;
                        View view = this.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                        Context context = view.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
                        textView.setText(context.getResources().getString(C0906R.string.agc, new Object[]{user.getNickname()}));
                        z2 = false;
                        z = true;
                    }
                }
                this.n.setText("@" + ex.b(user));
                z2 = false;
                z = true;
            } else {
                this.m.setText(user.getNickname());
                if (TextUtils.isEmpty(user.getSignature())) {
                    if (!com.ss.android.g.a.a()) {
                        this.n.setVisibility(8);
                    } else {
                        AbTestManager a4 = AbTestManager.a();
                        Intrinsics.checkExpressionValueIsNotNull(a4, "AbTestManager.getInstance()");
                        if (a4.m() != 4) {
                            AbTestManager a5 = AbTestManager.a();
                            Intrinsics.checkExpressionValueIsNotNull(a5, "AbTestManager.getInstance()");
                            if (a5.m() != 5) {
                                this.n.setText(C0906R.string.c8g);
                            }
                        }
                        this.n.setText("@" + ex.b(user));
                    }
                    z2 = false;
                } else {
                    AbTestManager a6 = AbTestManager.a();
                    Intrinsics.checkExpressionValueIsNotNull(a6, "AbTestManager.getInstance()");
                    if (a6.m() != 4) {
                        AbTestManager a7 = AbTestManager.a();
                        Intrinsics.checkExpressionValueIsNotNull(a7, "AbTestManager.getInstance()");
                        if (a7.m() != 5) {
                            this.n.setText(user.getSignature());
                            z2 = true;
                        }
                    }
                    this.n.setText("@" + ex.b(user));
                    z2 = true;
                }
                z = false;
            }
            if (this.k.h) {
                boolean z3 = !TextUtils.isEmpty(user.getRecommendReason());
                if (a(i2) || !z3) {
                    this.n.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    if (!z3 || this.k.g.get(user.getUid()) == null) {
                        if (z2) {
                            this.n.setText("");
                            this.n.setVisibility(8);
                        }
                    } else if (!z) {
                        this.n.setText(user.getRecommendReason());
                        this.n.setCompoundDrawablesWithIntrinsicBounds(2130839790, 0, 0, 0);
                        UIUtils.setViewVisibility(this.n, 0);
                    }
                } else {
                    this.n.setText(user.getRecommendReason());
                    this.n.setCompoundDrawablesWithIntrinsicBounds(2130839790, 0, 0, 0);
                    UIUtils.setViewVisibility(this.n, 0);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/adapter/FollowListAdapter$Companion;", "", "()V", "VALUE_0_POINT_5", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f48068f, false, 45074, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f48068f, false, 45074, new Class[0], String.class);
        } else if (TextUtils.equals(this.j, "following_relation")) {
            if (this.k) {
                return "following";
            }
            return "other_following";
        } else if (!TextUtils.equals(this.j, "follower_relation")) {
            return "";
        } else {
            if (this.k) {
                return "fans";
            }
            return "other_fans";
        }
    }

    public final int e() {
        if (PatchProxy.isSupport(new Object[0], this, f48068f, false, 45075, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48068f, false, 45075, new Class[0], Integer.TYPE)).intValue();
        } else if (!this.k && TextUtils.equals(this.j, "follower_relation")) {
            return 11;
        } else {
            if (!this.k && TextUtils.equals(this.j, "following_relation")) {
                return 10;
            }
            if (!this.k || !TextUtils.equals(this.j, "follower_relation")) {
                return 0;
            }
            return 9;
        }
    }

    @NotNull
    public final JediViewHolder<? extends d, User> a(@NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f48068f, false, 45072, new Class[]{ViewGroup.class}, JediViewHolder.class)) {
            return (JediViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f48068f, false, 45072, new Class[]{ViewGroup.class}, JediViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.uy, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…wing_item, parent, false)");
        return new FollowItemViewHolder<>(this, inflate);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0064, code lost:
        if (com.ss.android.g.a.a() == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004c, code lost:
        if (android.text.TextUtils.equals(r3.j, "follower_relation") != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FollowListAdapter(@org.jetbrains.annotations.NotNull android.arch.lifecycle.LifecycleOwner r4, @org.jetbrains.annotations.NotNull java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "relationType"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            com.ss.android.ugc.aweme.user.repository.UserDiffer r0 = new com.ss.android.ugc.aweme.user.repository.UserDiffer
            r0.<init>()
            android.support.v7.util.DiffUtil$ItemCallback r0 = (android.support.v7.util.DiffUtil.ItemCallback) r0
            r1 = 0
            r2 = 4
            r3.<init>(r4, r0, r1, r2)
            r3.i = r4
            r3.j = r5
            r3.k = r6
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Map r4 = (java.util.Map) r4
            r3.g = r4
            boolean r4 = r3.k
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.setting.AbTestManager r4 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r0 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            boolean r4 = r4.bk()
            if (r4 == 0) goto L_0x004f
            boolean r4 = com.ss.android.g.a.a()
            if (r4 != 0) goto L_0x004f
            java.lang.String r4 = r3.j
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r0 = "follower_relation"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r4 = android.text.TextUtils.equals(r4, r0)
            if (r4 == 0) goto L_0x004f
            goto L_0x0066
        L_0x004f:
            r5 = 0
            goto L_0x0066
        L_0x0051:
            com.ss.android.ugc.aweme.setting.AbTestManager r4 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r0 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            boolean r4 = r4.bk()
            if (r4 == 0) goto L_0x004f
            boolean r4 = com.ss.android.g.a.a()
            if (r4 != 0) goto L_0x004f
        L_0x0066:
            r3.h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter.<init>(android.arch.lifecycle.LifecycleOwner, java.lang.String, boolean):void");
    }
}
