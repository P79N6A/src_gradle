package com.ss.android.ugc.aweme.friends.recommendlist.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.f;
import com.bytedance.widget.Widget;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.base.arch.JediBaseItemWidget;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity;
import com.ss.android.ugc.aweme.following.ui.SimpleUserFragment;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListState;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.h;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\f*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002J\u0014\u0010\u000f\u001a\u00020\f*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendFriendsTitleWidget;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseItemWidget;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/Title;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendFriendsTitleWidgetHolder;", "()V", "mRecommendListViewModel", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;", "getMRecommendListViewModel", "()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;", "mRecommendListViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "bind", "item", "onBindViewHolder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecommendFriendsTitleWidget extends JediBaseItemWidget<h, RecommendFriendsTitleWidgetHolder> {
    public static ChangeQuickRedirect i;
    static final /* synthetic */ KProperty[] j = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RecommendFriendsTitleWidget.class), "mRecommendListViewModel", "getMRecommendListViewModel()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;"))};
    private final Lazy k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"<anonymous>", "VM", "T", "Lcom/bytedance/widget/Widget;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/LegeciesKt$hostViewModel$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<RecommendListViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Widget $this_hostViewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Widget widget, KClass kClass, KClass kClass2) {
            super(0);
            this.$this_hostViewModel = widget;
            this.$viewModelClass = kClass;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel] */
        /* JADX WARNING: type inference failed for: r2v13, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r4v4, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v14, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel] */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel invoke() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class<com.bytedance.jedi.arch.JediViewModel> r7 = com.bytedance.jedi.arch.JediViewModel.class
                r4 = 0
                r5 = 46908(0xb73c, float:6.5732E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0028
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                r5 = 0
                r6 = 46908(0xb73c, float:6.5732E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class<com.bytedance.jedi.arch.JediViewModel> r8 = com.bytedance.jedi.arch.JediViewModel.class
                r3 = r9
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            L_0x0028:
                com.bytedance.widget.Widget r0 = r9.$this_hostViewModel
                java.lang.Object r0 = r0.j()
                kotlin.reflect.KClass r1 = r9.$viewModelClass$inlined
                java.lang.Class r1 = kotlin.jvm.a.a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                r2 = 0
                boolean r3 = r0 instanceof android.support.v4.app.Fragment
                if (r3 == 0) goto L_0x007e
                android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
                r3 = r0
            L_0x0045:
                if (r3 == 0) goto L_0x0062
                android.arch.lifecycle.ViewModelProvider$Factory r4 = com.bytedance.jedi.arch.b.a()     // Catch:{ af -> 0x005d }
                android.arch.lifecycle.ViewModelProvider r4 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.Fragment) r3, (android.arch.lifecycle.ViewModelProvider.Factory) r4)     // Catch:{ af -> 0x005d }
                kotlin.reflect.KClass r5 = r9.$viewModelClass     // Catch:{ af -> 0x005d }
                java.lang.Class r5 = kotlin.jvm.a.a(r5)     // Catch:{ af -> 0x005d }
                android.arch.lifecycle.ViewModel r4 = r4.get(r1, r5)     // Catch:{ af -> 0x005d }
                com.bytedance.jedi.arch.JediViewModel r4 = (com.bytedance.jedi.arch.JediViewModel) r4     // Catch:{ af -> 0x005d }
                r2 = r4
                goto L_0x0062
            L_0x005d:
                android.support.v4.app.Fragment r3 = r3.getParentFragment()
                goto L_0x0045
            L_0x0062:
                if (r2 != 0) goto L_0x007d
                android.support.v4.app.FragmentActivity r0 = r0.requireActivity()
                android.arch.lifecycle.ViewModelProvider$Factory r2 = com.bytedance.jedi.arch.b.a()
                android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r0, (android.arch.lifecycle.ViewModelProvider.Factory) r2)
                kotlin.reflect.KClass r2 = r9.$viewModelClass
                java.lang.Class r2 = kotlin.jvm.a.a(r2)
                android.arch.lifecycle.ViewModel r0 = r0.get(r1, r2)
                r2 = r0
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
            L_0x007d:
                return r2
            L_0x007e:
                boolean r2 = r0 instanceof android.support.v4.app.FragmentActivity
                if (r2 == 0) goto L_0x009e
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
            L_0x009e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendFriendsTitleWidget.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<RecommendListState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecommendFriendsTitleWidgetHolder $this_bind;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RecommendFriendsTitleWidgetHolder recommendFriendsTitleWidgetHolder) {
            super(1);
            this.$this_bind = recommendFriendsTitleWidgetHolder;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RecommendListState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RecommendListState recommendListState) {
            RecommendListState recommendListState2 = recommendListState;
            if (PatchProxy.isSupport(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46909, new Class[]{RecommendListState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46909, new Class[]{RecommendListState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(recommendListState2, AdvanceSetting.NETWORK_TYPE);
            if (!recommendListState.getHideRecommendMask()) {
                this.$this_bind.f49076f.setVisibility(0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49070a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendFriendsTitleWidgetHolder f49071b;

        c(RecommendFriendsTitleWidgetHolder recommendFriendsTitleWidgetHolder) {
            this.f49071b = recommendFriendsTitleWidgetHolder;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49070a, false, 46910, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49070a, false, 46910, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            User curUser = a2.getCurUser();
            View view2 = this.f49071b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            Context context = view2.getContext();
            IAccountUserService a3 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
            FollowingFollowerActivity.a aVar = new FollowingFollowerActivity.a(context, null, a3.getCurUserId(), true, SimpleUserFragment.b.follower, 1);
            aVar.a(curUser).a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49072a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendFriendsTitleWidgetHolder f49073b;

        d(RecommendFriendsTitleWidgetHolder recommendFriendsTitleWidgetHolder) {
            this.f49073b = recommendFriendsTitleWidgetHolder;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49072a, false, 46911, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49072a, false, 46911, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Map hashMap = new HashMap();
            hashMap.put("enter_from", "find_friends");
            r.a("click_privacy_tips", hashMap);
            SharePrefCache inst = SharePrefCache.inst();
            Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
            an<String> privacyReminderH5Url = inst.getPrivacyReminderH5Url();
            Intrinsics.checkExpressionValueIsNotNull(privacyReminderH5Url, "SharePrefCache.inst().privacyReminderH5Url");
            String str = (String) privacyReminderH5Url.c();
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent(this.f49073b.k.getContext(), CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                intent.putExtra("hide_nav_bar", false);
                intent.putExtras(bundle);
                intent.setData(Uri.parse(str));
                this.f49073b.k.getContext().startActivity(intent);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function2<f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecommendFriendsTitleWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(RecommendFriendsTitleWidget recommendFriendsTitleWidget) {
            super(2);
            this.this$0 = recommendFriendsTitleWidget;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull f fVar, boolean z) {
            f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 46914, new Class[]{f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 46914, new Class[]{f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            if (z) {
                RecommendFriendsTitleWidgetHolder recommendFriendsTitleWidgetHolder = (RecommendFriendsTitleWidgetHolder) this.this$0.f2338f;
                if (recommendFriendsTitleWidgetHolder != null) {
                    if (PatchProxy.isSupport(new Object[0], recommendFriendsTitleWidgetHolder, RecommendFriendsTitleWidgetHolder.f49074d, false, 46916, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], recommendFriendsTitleWidgetHolder, RecommendFriendsTitleWidgetHolder.f49074d, false, 46916, new Class[0], Void.TYPE);
                    } else if (com.ss.android.g.a.b()) {
                        recommendFriendsTitleWidgetHolder.c();
                    } else {
                        recommendFriendsTitleWidgetHolder.f49076f.setVisibility(4);
                    }
                }
            }
        }
    }

    private final RecommendListViewModel n() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 46904, new Class[0], RecommendListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, i, false, 46904, new Class[0], RecommendListViewModel.class);
        } else {
            value = this.k.getValue();
        }
        return (RecommendListViewModel) value;
    }

    public RecommendFriendsTitleWidget() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RecommendListViewModel.class);
        this.k = LazyKt.lazy(new a(this, orCreateKotlinClass, orCreateKotlinClass));
    }

    public final void aj_() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 46905, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 46905, new Class[0], Void.TYPE);
            return;
        }
        super.aj_();
        Disposable unused = a(n(), a.INSTANCE, c(), false, new e(this));
    }

    public final /* synthetic */ void a(ItemWidgetViewHolder itemWidgetViewHolder, Object obj) {
        int i2;
        TextView textView;
        RecommendFriendsTitleWidgetHolder recommendFriendsTitleWidgetHolder = (RecommendFriendsTitleWidgetHolder) itemWidgetViewHolder;
        h hVar = (h) obj;
        if (PatchProxy.isSupport(new Object[]{recommendFriendsTitleWidgetHolder, hVar}, this, i, false, 46906, new Class[]{RecommendFriendsTitleWidgetHolder.class, h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendFriendsTitleWidgetHolder, hVar}, this, i, false, 46906, new Class[]{RecommendFriendsTitleWidgetHolder.class, h.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recommendFriendsTitleWidgetHolder, "$this$onBindViewHolder");
        Intrinsics.checkParameterIsNotNull(hVar, "item");
        if (PatchProxy.isSupport(new Object[]{recommendFriendsTitleWidgetHolder, hVar}, this, i, false, 46907, new Class[]{RecommendFriendsTitleWidgetHolder.class, h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendFriendsTitleWidgetHolder, hVar}, this, i, false, 46907, new Class[]{RecommendFriendsTitleWidgetHolder.class, h.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recommendFriendsTitleWidgetHolder, "$this$bind");
        Intrinsics.checkParameterIsNotNull(hVar, "item");
        boolean z = hVar.f49067d;
        int i3 = hVar.f49068e;
        boolean z2 = hVar.f49069f;
        int i4 = hVar.f49066c;
        if (z2) {
            textView = recommendFriendsTitleWidgetHolder.g;
            i2 = C0906R.string.afu;
        } else {
            textView = recommendFriendsTitleWidgetHolder.g;
            if (z) {
                i2 = C0906R.string.bgt;
            } else {
                i2 = C0906R.string.ee;
            }
        }
        textView.setText(i2);
        if (com.ss.android.g.a.b()) {
            recommendFriendsTitleWidgetHolder.f49075e.setVisibility(8);
            recommendFriendsTitleWidgetHolder.f49076f.setVisibility(4);
            if (z) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, recommendFriendsTitleWidgetHolder, RecommendFriendsTitleWidgetHolder.f49074d, false, 46915, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    RecommendFriendsTitleWidgetHolder recommendFriendsTitleWidgetHolder2 = recommendFriendsTitleWidgetHolder;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, recommendFriendsTitleWidgetHolder2, RecommendFriendsTitleWidgetHolder.f49074d, false, 46915, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    recommendFriendsTitleWidgetHolder.i.setText(String.valueOf(i3));
                    recommendFriendsTitleWidgetHolder.i.setVisibility(0);
                    recommendFriendsTitleWidgetHolder.h.setVisibility(0);
                }
            } else {
                recommendFriendsTitleWidgetHolder.c();
            }
            return;
        }
        recommendFriendsTitleWidgetHolder.c();
        if (!z || i4 == 5 || i4 == 6) {
            recommendFriendsTitleWidgetHolder.f49075e.setVisibility(8);
            recommendFriendsTitleWidgetHolder.f49076f.setVisibility(4);
        } else if (z2) {
            recommendFriendsTitleWidgetHolder.f49075e.setVisibility(8);
            recommendFriendsTitleWidgetHolder.f49076f.setVisibility(4);
        } else {
            recommendFriendsTitleWidgetHolder.f49075e.setVisibility(0);
            a(n(), new b(recommendFriendsTitleWidgetHolder));
        }
        if (z2) {
            recommendFriendsTitleWidgetHolder.j.setVisibility(0);
            recommendFriendsTitleWidgetHolder.j.setOnClickListener(new c(recommendFriendsTitleWidgetHolder));
        } else {
            recommendFriendsTitleWidgetHolder.j.setOnClickListener(null);
            recommendFriendsTitleWidgetHolder.j.setVisibility(8);
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        if (!a2.bA()) {
            recommendFriendsTitleWidgetHolder.k.setVisibility(8);
        } else if (!z2 && !z) {
            recommendFriendsTitleWidgetHolder.k.setVisibility(0);
            recommendFriendsTitleWidgetHolder.k.setOnClickListener(new d(recommendFriendsTitleWidgetHolder));
        }
    }
}
