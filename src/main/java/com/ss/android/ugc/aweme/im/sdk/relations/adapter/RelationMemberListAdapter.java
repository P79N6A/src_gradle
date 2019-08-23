package com.ss.android.ugc.aweme.im.sdk.relations.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.ss.android.ugc.aweme.im.sdk.relations.viewholder.RelationMemberViewHolder;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bH\u0016J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\bH\u0002J\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0002Ra\u0010\u0006\u001aI\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/RelationMemberListAdapter;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/BaseSelectListAdapter;", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "mActionListener", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "type", "position", "Landroid/view/View;", "view", "", "getMActionListener", "()Lkotlin/jvm/functions/Function3;", "setMActionListener", "(Lkotlin/jvm/functions/Function3;)V", "mMemberListViewModel", "Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;", "getMMemberListViewModel", "()Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;", "mMemberListViewModel$delegate", "Lkotlin/Lazy;", "onCreateBasicViewHolder", "Lcom/ss/android/ugc/aweme/im/sdk/relations/viewholder/BaseSelectViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "selectMember", "updateSelectItem", "contact", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RelationMemberListAdapter extends BaseSelectListAdapter<IMContact> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f52090b;

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f52091c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RelationMemberListAdapter.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;"))};

    /* renamed from: d  reason: collision with root package name */
    public static final b f52092d = new b((byte) 0);
    private final Lazy i;
    @Nullable
    private Function3<? super Integer, ? super Integer, ? super View, Unit> j = new c(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0001\u0018\u0001*\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "VM", "T", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/ViewModelOwner;", "Landroid/arch/lifecycle/ViewModel;", "invoke", "()Landroid/arch/lifecycle/ViewModel;", "com/ss/android/ugc/aweme/im/sdk/relations/select/ExtensionsKt$activityViewModel$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<RelationMemberListViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ LifecycleOwner $lifecycleOwner;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(KClass kClass, LifecycleOwner lifecycleOwner, KClass kClass2) {
            super(0);
            this.$viewModelClass = kClass;
            this.$lifecycleOwner = lifecycleOwner;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel, android.arch.lifecycle.ViewModel] */
        /* JADX WARNING: type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel, android.arch.lifecycle.ViewModel] */
        @Nullable
        public final RelationMemberListViewModel invoke() {
            ViewModelProvider viewModelProvider;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52884, new Class[0], ViewModel.class)) {
                return (ViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52884, new Class[0], ViewModel.class);
            }
            ViewModelProvider.Factory r0 = new ViewModelProvider.Factory(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52093a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f52094b;

                {
                    this.f52094b = r1;
                }

                public final <T extends ViewModel> T create(@NotNull Class<T> cls) {
                    Class<T> cls2 = cls;
                    if (PatchProxy.isSupport(new Object[]{cls2}, this, f52093a, false, 52885, new Class[]{Class.class}, ViewModel.class)) {
                        return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls2}, this, f52093a, false, 52885, new Class[]{Class.class}, ViewModel.class);
                    }
                    Intrinsics.checkParameterIsNotNull(cls2, "modelClass");
                    throw new IllegalStateException(this.f52094b.$viewModelClass.getClass().getSimpleName() + " should be created in the host before being used.");
                }
            };
            LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
            if (lifecycleOwner instanceof Fragment) {
                viewModelProvider = ViewModelProviders.of((Fragment) this.$lifecycleOwner, r0);
            } else if (lifecycleOwner instanceof FragmentActivity) {
                viewModelProvider = ViewModelProviders.of((FragmentActivity) this.$lifecycleOwner, r0);
            } else {
                viewModelProvider = null;
            }
            if (viewModelProvider == null) {
                return null;
            }
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            return viewModelProvider.get(name, kotlin.jvm.a.a(this.$viewModelClass));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/RelationMemberListAdapter$Companion;", "", "()V", "MAX_MEMBER_COUNT", "", "MAX_SELECT_NUMBER", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "type", "", "position", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function3<Integer, Integer, View, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RelationMemberListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RelationMemberListAdapter relationMemberListAdapter) {
            super(3);
            this.this$0 = relationMemberListAdapter;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (View) obj3);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f9, code lost:
            if (r8.contains(r2) == true) goto L_0x011e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x012e, code lost:
            if (r3.contains(r2) == true) goto L_0x0147;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0155, code lost:
            if (r3 == null) goto L_0x0157;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x006d, code lost:
            r1 = r20;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00ef  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00fd  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0124  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0134  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(int r21, int r22, @org.jetbrains.annotations.NotNull android.view.View r23) {
            /*
                r20 = this;
                r0 = r22
                r1 = r23
                r2 = 3
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
                r10 = 0
                r3[r10] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
                r11 = 1
                r3[r11] = r4
                r12 = 2
                r3[r12] = r1
                com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class r4 = java.lang.Integer.TYPE
                r8[r10] = r4
                java.lang.Class r4 = java.lang.Integer.TYPE
                r8[r11] = r4
                java.lang.Class<android.view.View> r4 = android.view.View.class
                r8[r12] = r4
                java.lang.Class r9 = java.lang.Void.TYPE
                r6 = 0
                r7 = 52886(0xce96, float:7.4109E-41)
                r4 = r20
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x0065
                java.lang.Object[] r13 = new java.lang.Object[r2]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
                r13[r10] = r3
                java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
                r13[r11] = r0
                r13[r12] = r1
                com.meituan.robust.ChangeQuickRedirect r15 = changeQuickRedirect
                r16 = 0
                r17 = 52886(0xce96, float:7.4109E-41)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r0[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r0[r11] = r1
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r0[r12] = r1
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r20
                r18 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                return
            L_0x0065:
                java.lang.String r2 = "view"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
                switch(r21) {
                    case 0: goto L_0x0071;
                    case 1: goto L_0x0071;
                    case 2: goto L_0x0071;
                    default: goto L_0x006d;
                }
            L_0x006d:
                r1 = r20
                goto L_0x018c
            L_0x0071:
                r1 = r20
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberListAdapter r9 = r1.this$0
                java.lang.Object[] r2 = new java.lang.Object[r11]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
                r2[r10] = r3
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberListAdapter.f52090b
                r5 = 0
                r6 = 52881(0xce91, float:7.4102E-41)
                java.lang.Class[] r7 = new java.lang.Class[r11]
                java.lang.Class r3 = java.lang.Integer.TYPE
                r7[r10] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x00ad
                java.lang.Object[] r2 = new java.lang.Object[r11]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
                r2[r10] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberListAdapter.f52090b
                r5 = 0
                r6 = 52881(0xce91, float:7.4102E-41)
                java.lang.Class[] r7 = new java.lang.Class[r11]
                java.lang.Class r0 = java.lang.Integer.TYPE
                r7[r10] = r0
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x00ad:
                java.lang.Object r2 = r9.a((int) r0)
                com.ss.android.ugc.aweme.im.service.model.IMContact r2 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r2
                if (r2 == 0) goto L_0x018c
                com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r3 = r9.d()
                r4 = 0
                r5 = 2131560682(0x7f0d08ea, float:1.8746743E38)
                r6 = 10
                if (r3 == 0) goto L_0x014b
                int r3 = r3.i
                r7 = 4
                if (r3 != r7) goto L_0x014b
                com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r3 = r9.d()
                if (r3 == 0) goto L_0x00d7
                java.util.List r3 = r3.d()
                if (r3 == 0) goto L_0x00d7
                int r3 = r3.size()
                goto L_0x00d8
            L_0x00d7:
                r3 = 0
            L_0x00d8:
                com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r7 = r9.d()
                if (r7 == 0) goto L_0x00e7
                java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMContact> r7 = r7.f52173f
                if (r7 == 0) goto L_0x00e7
                int r7 = r7.size()
                goto L_0x00e8
            L_0x00e7:
                r7 = 0
            L_0x00e8:
                int r7 = r7 + r3
                com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r8 = r9.d()
                if (r8 == 0) goto L_0x00fb
                java.util.List r8 = r8.d()
                if (r8 == 0) goto L_0x00fb
                boolean r8 = r8.contains(r2)
                if (r8 == r11) goto L_0x011e
            L_0x00fb:
                if (r3 < r6) goto L_0x011e
                android.content.Context r0 = r9.f52069f
                android.content.Context r2 = r9.f52069f
                java.lang.Object[] r3 = new java.lang.Object[r11]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r3[r10] = r6
                java.lang.String r2 = r2.getString(r5, r3)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (java.lang.String) r2)
                r0.a()
                java.lang.String r0 = "add"
                java.lang.String r2 = "num_limit"
                java.lang.String r3 = ""
                com.ss.android.ugc.aweme.im.sdk.utils.z.a((java.lang.String) r0, (java.lang.String) r2, (java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser>) r4, (java.lang.String) r3)
                goto L_0x018c
            L_0x011e:
                com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r3 = r9.d()
                if (r3 == 0) goto L_0x0130
                java.util.List r3 = r3.d()
                if (r3 == 0) goto L_0x0130
                boolean r3 = r3.contains(r2)
                if (r3 == r11) goto L_0x0147
            L_0x0130:
                r3 = 100
                if (r7 < r3) goto L_0x0147
                android.content.Context r0 = r9.f52069f
                android.content.Context r2 = r9.f52069f
                r3 = 2131560522(0x7f0d084a, float:1.8746419E38)
                java.lang.String r2 = r2.getString(r3)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (java.lang.String) r2)
                r0.a()
                goto L_0x018c
            L_0x0147:
                r9.a((com.ss.android.ugc.aweme.im.service.model.IMContact) r2, (int) r0)
                goto L_0x018c
            L_0x014b:
                com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r3 = r9.d()
                if (r3 == 0) goto L_0x0157
                java.util.List r3 = r3.d()
                if (r3 != 0) goto L_0x015b
            L_0x0157:
                java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            L_0x015b:
                boolean r7 = r3.contains(r2)
                if (r7 != 0) goto L_0x0188
                int r3 = r3.size()
                if (r3 != r6) goto L_0x0188
                android.content.Context r0 = r9.f52069f
                android.content.Context r2 = r9.f52069f
                java.lang.Object[] r3 = new java.lang.Object[r11]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r3[r10] = r6
                java.lang.String r2 = r2.getString(r5, r3)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (java.lang.String) r2)
                r0.a()
                java.lang.String r0 = "start"
                java.lang.String r2 = "num_limit"
                java.lang.String r3 = ""
                com.ss.android.ugc.aweme.im.sdk.utils.z.a((java.lang.String) r0, (java.lang.String) r2, (java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser>) r4, (java.lang.String) r3)
                goto L_0x018c
            L_0x0188:
                r9.a((com.ss.android.ugc.aweme.im.service.model.IMContact) r2, (int) r0)
                return
            L_0x018c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberListAdapter.c.invoke(int, int, android.view.View):void");
        }
    }

    /* access modifiers changed from: package-private */
    public final RelationMemberListViewModel d() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f52090b, false, 52880, new Class[0], RelationMemberListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f52090b, false, 52880, new Class[0], RelationMemberListViewModel.class);
        } else {
            value = this.i.getValue();
        }
        return (RelationMemberListViewModel) value;
    }

    @Nullable
    public final Function3<Integer, Integer, View, Unit> c() {
        return this.j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RelationMemberListAdapter(@NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RelationMemberListViewModel.class);
        this.i = LazyKt.lazy(new a(orCreateKotlinClass, lifecycleOwner, orCreateKotlinClass));
    }

    @NotNull
    public final BaseSelectViewHolder<IMContact> a(@NotNull ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f52090b, false, 52883, new Class[]{ViewGroup.class, Integer.TYPE}, BaseSelectViewHolder.class)) {
            return (BaseSelectViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f52090b, false, 52883, new Class[]{ViewGroup.class, Integer.TYPE}, BaseSelectViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        return new RelationMemberViewHolder<>(viewGroup2);
    }

    /* access modifiers changed from: package-private */
    public final void a(IMContact iMContact, int i2) {
        IMContact iMContact2 = iMContact;
        if (PatchProxy.isSupport(new Object[]{iMContact2, Integer.valueOf(i2)}, this, f52090b, false, 52882, new Class[]{IMContact.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMContact2, Integer.valueOf(i2)}, this, f52090b, false, 52882, new Class[]{IMContact.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        RelationMemberListViewModel d2 = d();
        if (d2 != null) {
            d2.a(iMContact2);
        }
        notifyItemChanged(i2);
    }
}
