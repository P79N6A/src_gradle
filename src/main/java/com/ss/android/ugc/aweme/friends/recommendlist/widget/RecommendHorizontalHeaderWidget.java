package com.ss.android.ugc.aweme.friends.recommendlist.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.n;
import com.bytedance.widget.Widget;
import com.bytedance.widget.ext.list.ItemWidget;
import com.bytedance.widget.ext.list.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.arch.JediBaseItemWidget;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.recommendlist.adapter.AddFriendHeaderAdapter;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.HeaderState;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListHeaderViewModel;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListState;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel;
import com.ss.android.ugc.aweme.friends.ui.ContactsActivity;
import com.ss.android.ugc.aweme.utils.permission.PermissionStateReporter;
import com.ss.android.ugc.aweme.utils.permission.a;
import io.reactivex.disposables.Disposable;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0016J\u0014\u0010\u001e\u001a\u00020\u0018*\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendHorizontalHeaderWidget;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseItemWidget;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/Header;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendHorizontalHeaderViewHolder;", "()V", "mAddFriendHeaderAdapter", "Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/AddFriendHeaderAdapter;", "mRecommendListHeaderViewModel", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListHeaderViewModel;", "getMRecommendListHeaderViewModel", "()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListHeaderViewModel;", "mRecommendListHeaderViewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "mRecommendListViewModel", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;", "getMRecommendListViewModel", "()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;", "mRecommendListViewModel$delegate", "Lkotlin/Lazy;", "getRecommendEnterFrom", "", "recommendUserType", "", "onCreate", "", "onItemClick", "view", "Landroid/view/View;", "type", "position", "onBindViewHolder", "item", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecommendHorizontalHeaderWidget extends JediBaseItemWidget<com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a, RecommendHorizontalHeaderViewHolder> {
    public static ChangeQuickRedirect i;
    static final /* synthetic */ KProperty[] j = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RecommendHorizontalHeaderWidget.class), "mRecommendListViewModel", "getMRecommendListViewModel()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RecommendHorizontalHeaderWidget.class), "mRecommendListHeaderViewModel", "getMRecommendListHeaderViewModel()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListHeaderViewModel;"))};
    private final Lazy k;
    private final lifecycleAwareLazy l;
    private final AddFriendHeaderAdapter m = new AddFriendHeaderAdapter();

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
                r5 = 46924(0xb74c, float:6.5755E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0028
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                r5 = 0
                r6 = 46924(0xb74c, float:6.5755E-41)
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendHorizontalHeaderWidget.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u001c\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Lcom/bytedance/widget/ext/list/ItemWidget;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/widget/ext/list/ExtensionsKt$listViewModel$3"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<RecommendListHeaderViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function1 $argumentsAcceptor;
        final /* synthetic */ ItemWidget $this_listViewModel;
        final /* synthetic */ ItemWidget $this_listViewModel$inlined;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ItemWidget itemWidget, KClass kClass, Function1 function1, ItemWidget itemWidget2, KClass kClass2) {
            super(0);
            this.$this_listViewModel = itemWidget;
            this.$viewModelClass = kClass;
            this.$argumentsAcceptor = function1;
            this.$this_listViewModel$inlined = itemWidget2;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListHeaderViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListHeaderViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final RecommendListHeaderViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46925, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46925, new Class[0], JediViewModel.class);
            }
            com.bytedance.widget.ext.list.a a2 = a.C0243a.a(((ae) this.$this_listViewModel).r_(), this.$this_listViewModel.m());
            ? r0 = (JediViewModel) a2.a(this.$this_listViewModel$inlined.getClass().getName() + '_' + kotlin.jvm.a.a(this.$viewModelClass$inlined).getName(), kotlin.jvm.a.a(this.$viewModelClass));
            n a3 = r0.f2282c.a(RecommendListHeaderViewModel.class);
            if (a3 != null) {
                a3.binding(r0);
            }
            r0.a(this.$argumentsAcceptor);
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/HeaderState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<HeaderState, HeaderState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecommendHorizontalHeaderWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RecommendHorizontalHeaderWidget recommendHorizontalHeaderWidget) {
            super(1);
            this.this$0 = recommendHorizontalHeaderWidget;
        }

        @NotNull
        public final HeaderState invoke(@NotNull HeaderState headerState) {
            HeaderState headerState2 = headerState;
            if (PatchProxy.isSupport(new Object[]{headerState2}, this, changeQuickRedirect, false, 46926, new Class[]{HeaderState.class}, HeaderState.class)) {
                return (HeaderState) PatchProxy.accessDispatch(new Object[]{headerState2}, this, changeQuickRedirect, false, 46926, new Class[]{HeaderState.class}, HeaderState.class);
            }
            Intrinsics.checkParameterIsNotNull(headerState2, "$receiver");
            return headerState2.copy((com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a) this.this$0.l());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b¢\u0006\u0002\b\f"}, d2 = {"<anonymous>", "", "p1", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "p2", "", "type", "p3", "position", "invoke"}, k = 3, mv = {1, 1, 15})
    static final /* synthetic */ class d extends FunctionReference implements Function3<View, Integer, Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(RecommendHorizontalHeaderWidget recommendHorizontalHeaderWidget) {
            super(3, recommendHorizontalHeaderWidget);
        }

        public final String getName() {
            return "onItemClick";
        }

        public final KDeclarationContainer getOwner() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46928, new Class[0], KDeclarationContainer.class)) {
                return Reflection.getOrCreateKotlinClass(RecommendHorizontalHeaderWidget.class);
            }
            return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46928, new Class[0], KDeclarationContainer.class);
        }

        public final String getSignature() {
            return "onItemClick(Landroid/view/View;II)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x017b, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(@org.jetbrains.annotations.NotNull android.view.View r21, int r22, int r23) {
            /*
                r20 = this;
                r0 = r21
                r1 = r22
                r2 = 3
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
                r11 = 1
                r3[r11] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r23)
                r12 = 2
                r3[r12] = r4
                com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<android.view.View> r4 = android.view.View.class
                r8[r10] = r4
                java.lang.Class r4 = java.lang.Integer.TYPE
                r8[r11] = r4
                java.lang.Class r4 = java.lang.Integer.TYPE
                r8[r12] = r4
                java.lang.Class r9 = java.lang.Void.TYPE
                r6 = 0
                r7 = 46927(0xb74f, float:6.5759E-41)
                r4 = r20
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x0065
                java.lang.Object[] r13 = new java.lang.Object[r2]
                r13[r10] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
                r13[r11] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
                r13[r12] = r0
                com.meituan.robust.ChangeQuickRedirect r15 = changeQuickRedirect
                r16 = 0
                r17 = 46927(0xb74f, float:6.5759E-41)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r0[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r0[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r0[r12] = r1
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r20
                r18 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                return
            L_0x0065:
                java.lang.String r3 = "p1"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
                r3 = r20
                java.lang.Object r4 = r3.receiver
                com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendHorizontalHeaderWidget r4 = (com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendHorizontalHeaderWidget) r4
                java.lang.Object[] r13 = new java.lang.Object[r2]
                r13[r10] = r0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
                r13[r11] = r5
                java.lang.Integer r5 = java.lang.Integer.valueOf(r23)
                r13[r12] = r5
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendHorizontalHeaderWidget.i
                r16 = 0
                r17 = 46923(0xb74b, float:6.5753E-41)
                java.lang.Class[] r5 = new java.lang.Class[r2]
                java.lang.Class<android.view.View> r6 = android.view.View.class
                r5[r10] = r6
                java.lang.Class r6 = java.lang.Integer.TYPE
                r5[r11] = r6
                java.lang.Class r6 = java.lang.Integer.TYPE
                r5[r12] = r6
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r4
                r18 = r5
                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                if (r5 == 0) goto L_0x00ce
                java.lang.Object[] r13 = new java.lang.Object[r2]
                r13[r10] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
                r13[r11] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
                r13[r12] = r0
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendHorizontalHeaderWidget.i
                r16 = 0
                r17 = 46923(0xb74b, float:6.5753E-41)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r0[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r0[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r0[r12] = r1
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r4
                r18 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                return
            L_0x00ce:
                java.lang.String r2 = "view"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
                boolean r0 = com.ss.android.ugc.aweme.c.a.a.a(r21)
                if (r0 != 0) goto L_0x017c
                VH r0 = r4.f2338f
                com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendHorizontalHeaderViewHolder r0 = (com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendHorizontalHeaderViewHolder) r0
                if (r0 == 0) goto L_0x017c
                switch(r1) {
                    case 0: goto L_0x016a;
                    case 1: goto L_0x013a;
                    case 2: goto L_0x0118;
                    case 3: goto L_0x00e4;
                    default: goto L_0x00e2;
                }
            L_0x00e2:
                goto L_0x017b
            L_0x00e4:
                android.view.View r0 = r0.itemView
                java.lang.String r1 = "itemView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = "discovery"
                com.ss.android.ugc.aweme.face2face.Face2FacePermissionActivity.a(r0, r1)
                java.lang.String r0 = "face_to_face_click"
                com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
                java.lang.String r2 = "event_type"
                java.lang.String r4 = "spring_festival"
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r4)
                java.lang.String r2 = "enter_from"
                java.lang.String r4 = "discovery"
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r4)
                java.lang.String r2 = "enter_method"
                java.lang.String r4 = "button"
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r4)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
                goto L_0x017b
            L_0x0118:
                android.view.View r0 = r0.itemView
                java.lang.String r1 = "itemView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                android.content.Context r0 = r0.getContext()
                com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity.a(r0, r10)
                java.lang.String r0 = "qr_code_scan_enter"
                com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
                java.lang.String r2 = "enter_from"
                java.lang.String r4 = "find_friends"
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r4)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
                goto L_0x017c
            L_0x013a:
                android.view.View r0 = r0.itemView
                java.lang.String r1 = "itemView"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                android.content.Context r0 = r0.getContext()
                if (r0 == 0) goto L_0x0162
                android.app.Activity r0 = (android.app.Activity) r0
                java.lang.String r1 = "find_friends"
                com.ss.android.ugc.aweme.share.invitefriends.b.a(r0, r1)
                java.lang.String r0 = "share_token"
                com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
                java.lang.String r2 = "enter_from"
                java.lang.String r4 = "find_friends"
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r4)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
                goto L_0x017c
            L_0x0162:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
                r0.<init>(r1)
                throw r0
            L_0x016a:
                com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel r2 = r4.n()
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendHorizontalHeaderWidget$g r5 = new com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendHorizontalHeaderWidget$g
                r5.<init>(r0, r4, r1)
                kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
                r4.a(r2, r5)
                goto L_0x017c
            L_0x017b:
                return
            L_0x017c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendHorizontalHeaderWidget.d.invoke(android.view.View, int, int):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/HeaderState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<HeaderState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ AddFriendHeaderAdapter $adapter;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AddFriendHeaderAdapter addFriendHeaderAdapter) {
            super(1);
            this.$adapter = addFriendHeaderAdapter;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HeaderState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull HeaderState headerState) {
            HeaderState headerState2 = headerState;
            if (PatchProxy.isSupport(new Object[]{headerState2}, this, changeQuickRedirect, false, 46929, new Class[]{HeaderState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{headerState2}, this, changeQuickRedirect, false, 46929, new Class[]{HeaderState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(headerState2, AdvanceSetting.NETWORK_TYPE);
            AddFriendHeaderAdapter addFriendHeaderAdapter = this.$adapter;
            List<com.ss.android.ugc.aweme.friends.recommendlist.adapter.a> list = headerState.getHeader().f49054c;
            if (PatchProxy.isSupport(new Object[]{list}, addFriendHeaderAdapter, AddFriendHeaderAdapter.f48951a, false, 46719, new Class[]{List.class}, Void.TYPE)) {
                AddFriendHeaderAdapter addFriendHeaderAdapter2 = addFriendHeaderAdapter;
                PatchProxy.accessDispatch(new Object[]{list}, addFriendHeaderAdapter2, AddFriendHeaderAdapter.f48951a, false, 46719, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list, "data");
            addFriendHeaderAdapter.f48953b.clear();
            addFriendHeaderAdapter.f48953b.addAll(list);
            addFriendHeaderAdapter.notifyDataSetChanged();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/HeaderState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function2<com.bytedance.jedi.arch.f, HeaderState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecommendHorizontalHeaderWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(RecommendHorizontalHeaderWidget recommendHorizontalHeaderWidget) {
            super(2);
            this.this$0 = recommendHorizontalHeaderWidget;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (HeaderState) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull HeaderState headerState) {
            if (PatchProxy.isSupport(new Object[]{fVar, headerState}, this, changeQuickRedirect, false, 46930, new Class[]{com.bytedance.jedi.arch.f.class, HeaderState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, headerState}, this, changeQuickRedirect, false, 46930, new Class[]{com.bytedance.jedi.arch.f.class, HeaderState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(headerState, AdvanceSetting.NETWORK_TYPE);
            RecommendHorizontalHeaderViewHolder recommendHorizontalHeaderViewHolder = (RecommendHorizontalHeaderViewHolder) this.this$0.f2338f;
            if (recommendHorizontalHeaderViewHolder != null) {
                this.this$0.a(recommendHorizontalHeaderViewHolder, headerState.getHeader());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "invoke", "com/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendHorizontalHeaderWidget$onItemClick$1$1"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function1<RecommendListState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecommendHorizontalHeaderViewHolder $this_apply;
        final /* synthetic */ int $type$inlined;
        final /* synthetic */ RecommendHorizontalHeaderWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(RecommendHorizontalHeaderViewHolder recommendHorizontalHeaderViewHolder, RecommendHorizontalHeaderWidget recommendHorizontalHeaderWidget, int i) {
            super(1);
            this.$this_apply = recommendHorizontalHeaderViewHolder;
            this.this$0 = recommendHorizontalHeaderWidget;
            this.$type$inlined = i;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RecommendListState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RecommendListState recommendListState) {
            final RecommendListState recommendListState2 = recommendListState;
            if (PatchProxy.isSupport(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46931, new Class[]{RecommendListState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recommendListState2}, this, changeQuickRedirect, false, 46931, new Class[]{RecommendListState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(recommendListState2, AdvanceSetting.NETWORK_TYPE);
            RecommendListHeaderViewModel o = this.this$0.o();
            if (PatchProxy.isSupport(new Object[]{(byte) 0}, o, RecommendListHeaderViewModel.f49016d, false, 46803, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                RecommendListHeaderViewModel recommendListHeaderViewModel = o;
                PatchProxy.accessDispatch(new Object[]{(byte) 0}, recommendListHeaderViewModel, RecommendListHeaderViewModel.f49016d, false, 46803, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                o.c(new RecommendListHeaderViewModel.a(false));
            }
            this.this$0.n().b(false);
            com.ss.android.ugc.aweme.message.c.c.a().a(102);
            View view = this.$this_apply.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            Context context = view.getContext();
            if (context != null) {
                if (ContextCompat.checkSelfPermission((Activity) context, "android.permission.READ_CONTACTS") != 0) {
                    View view2 = this.$this_apply.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                    Context context2 = view2.getContext();
                    if (context2 != null) {
                        com.ss.android.ugc.aweme.utils.permission.a.a((Activity) context2, 1, "android.permission.READ_CONTACTS", (a.C0792a) new a.C0792a(this) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f49081a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ g f49082b;

                            public final void b() {
                                if (PatchProxy.isSupport(new Object[0], this, f49081a, false, 46933, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f49081a, false, 46933, new Class[0], Void.TYPE);
                                    return;
                                }
                                View view = this.f49082b.$this_apply.itemView;
                                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                                UIUtils.displayToast(view.getContext(), (int) C0906R.string.eh);
                            }

                            public final void a() {
                                if (PatchProxy.isSupport(new Object[0], this, f49081a, false, 46932, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f49081a, false, 46932, new Class[0], Void.TYPE);
                                    return;
                                }
                                PermissionStateReporter.d().e();
                                RecommendHorizontalHeaderWidget recommendHorizontalHeaderWidget = this.f49082b.this$0;
                                View view = this.f49082b.$this_apply.itemView;
                                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                                Intent a2 = ContactsActivity.a(view.getContext(), RecommendHorizontalHeaderWidget.a(recommendListState2.getRecommendUserType()), true);
                                Intrinsics.checkExpressionValueIsNotNull(a2, "ContactsActivity.getInte…recommendUserType), true)");
                                recommendHorizontalHeaderWidget.a(a2);
                            }

                            {
                                this.f49082b = r1;
                            }
                        });
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                    }
                } else {
                    RecommendHorizontalHeaderWidget recommendHorizontalHeaderWidget = this.this$0;
                    View view3 = this.$this_apply.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                    Intent a2 = ContactsActivity.a(view3.getContext(), RecommendHorizontalHeaderWidget.a(recommendListState.getRecommendUserType()), false);
                    Intrinsics.checkExpressionValueIsNotNull(a2, "ContactsActivity.getInte…ecommendUserType), false)");
                    recommendHorizontalHeaderWidget.a(a2);
                }
                r.a("add_profile_friends", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "find_friends").a("account_type", this.$type$inlined).f34114b);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    public static String a(int i2) {
        switch (i2) {
            case 5:
                return "following";
            case 6:
                return "fans";
            default:
                return "personal_homepage";
        }
    }

    public final RecommendListViewModel n() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 46919, new Class[0], RecommendListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, i, false, 46919, new Class[0], RecommendListViewModel.class);
        } else {
            value = this.k.getValue();
        }
        return (RecommendListViewModel) value;
    }

    public final RecommendListHeaderViewModel o() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 46920, new Class[0], RecommendListHeaderViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, i, false, 46920, new Class[0], RecommendListHeaderViewModel.class);
        } else {
            value = this.l.getValue();
        }
        return (RecommendListHeaderViewModel) value;
    }

    public final void aj_() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 46921, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 46921, new Class[0], Void.TYPE);
            return;
        }
        super.aj_();
        Disposable unused = a(o(), c(), false, new f(this));
    }

    public RecommendHorizontalHeaderWidget() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RecommendListViewModel.class);
        this.k = LazyKt.lazy(new a(this, orCreateKotlinClass, orCreateKotlinClass));
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(RecommendListHeaderViewModel.class);
        b bVar = new b(this, orCreateKotlinClass2, new c(this), this, orCreateKotlinClass2);
        this.l = new lifecycleAwareLazy(this, bVar);
    }

    public final void a(@NotNull RecommendHorizontalHeaderViewHolder recommendHorizontalHeaderViewHolder, @NotNull com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a aVar) {
        RecommendHorizontalHeaderViewHolder recommendHorizontalHeaderViewHolder2 = recommendHorizontalHeaderViewHolder;
        com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{recommendHorizontalHeaderViewHolder2, aVar2}, this, i, false, 46922, new Class[]{RecommendHorizontalHeaderViewHolder.class, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendHorizontalHeaderViewHolder2, aVar2}, this, i, false, 46922, new Class[]{RecommendHorizontalHeaderViewHolder.class, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recommendHorizontalHeaderViewHolder2, "$this$onBindViewHolder");
        Intrinsics.checkParameterIsNotNull(aVar2, "item");
        RecyclerView recyclerView = recommendHorizontalHeaderViewHolder2.f49079d;
        AddFriendHeaderAdapter addFriendHeaderAdapter = this.m;
        Function3<? super View, ? super Integer, ? super Integer, Unit> dVar = new d<>(this);
        if (PatchProxy.isSupport(new Object[]{dVar}, addFriendHeaderAdapter, AddFriendHeaderAdapter.f48951a, false, 46720, new Class[]{Function3.class}, Void.TYPE)) {
            AddFriendHeaderAdapter addFriendHeaderAdapter2 = addFriendHeaderAdapter;
            PatchProxy.accessDispatch(new Object[]{dVar}, addFriendHeaderAdapter2, AddFriendHeaderAdapter.f48951a, false, 46720, new Class[]{Function3.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(dVar, "onItemClick");
            addFriendHeaderAdapter.f48954c = dVar;
        }
        a(o(), new e(addFriendHeaderAdapter));
        recyclerView.setAdapter(addFriendHeaderAdapter);
    }
}
