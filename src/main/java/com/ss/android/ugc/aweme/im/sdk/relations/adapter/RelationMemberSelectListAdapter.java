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
import com.ss.android.ugc.aweme.im.sdk.relations.viewholder.RelationMemberSelectViewHolder;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\bH\u0016Ra\u0010\u0006\u001aI\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/RelationMemberSelectListAdapter;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/BaseSelectListAdapter;", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "mActionListener", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "type", "position", "Landroid/view/View;", "view", "", "getMActionListener", "()Lkotlin/jvm/functions/Function3;", "setMActionListener", "(Lkotlin/jvm/functions/Function3;)V", "mMemberListViewModel", "Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;", "getMMemberListViewModel", "()Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;", "mMemberListViewModel$delegate", "Lkotlin/Lazy;", "checkFollowStatus", "", "contact", "onCreateBasicViewHolder", "Lcom/ss/android/ugc/aweme/im/sdk/relations/viewholder/BaseSelectViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RelationMemberSelectListAdapter extends BaseSelectListAdapter<IMContact> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f52095b;

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f52096c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RelationMemberSelectListAdapter.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;"))};

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f52097d;
    @Nullable
    private Function3<? super Integer, ? super Integer, ? super View, Unit> i = new b(this);

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
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52890, new Class[0], ViewModel.class)) {
                return (ViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52890, new Class[0], ViewModel.class);
            }
            ViewModelProvider.Factory r0 = new ViewModelProvider.Factory(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52098a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f52099b;

                {
                    this.f52099b = r1;
                }

                public final <T extends ViewModel> T create(@NotNull Class<T> cls) {
                    Class<T> cls2 = cls;
                    if (PatchProxy.isSupport(new Object[]{cls2}, this, f52098a, false, 52891, new Class[]{Class.class}, ViewModel.class)) {
                        return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls2}, this, f52098a, false, 52891, new Class[]{Class.class}, ViewModel.class);
                    }
                    Intrinsics.checkParameterIsNotNull(cls2, "modelClass");
                    throw new IllegalStateException(this.f52099b.$viewModelClass.getClass().getSimpleName() + " should be created in the host before being used.");
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "type", "", "position", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function3<Integer, Integer, View, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RelationMemberSelectListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RelationMemberSelectListAdapter relationMemberSelectListAdapter) {
            super(3);
            this.this$0 = relationMemberSelectListAdapter;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (View) obj3);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0153, code lost:
            if (r1 == null) goto L_0x0155;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(int r22, int r23, @org.jetbrains.annotations.NotNull android.view.View r24) {
            /*
                r21 = this;
                r7 = r21
                r8 = r23
                r9 = r24
                r10 = 3
                java.lang.Object[] r0 = new java.lang.Object[r10]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
                r11 = 0
                r0[r11] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
                r12 = 1
                r0[r12] = r1
                r13 = 2
                r0[r13] = r9
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r12] = r1
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r13] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 52892(0xce9c, float:7.4117E-41)
                r1 = r21
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0064
                java.lang.Object[] r0 = new java.lang.Object[r10]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
                r0[r11] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
                r0[r12] = r1
                r0[r13] = r9
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                r3 = 0
                r4 = 52892(0xce9c, float:7.4117E-41)
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r12] = r1
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r13] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r21
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0064:
                java.lang.String r0 = "view"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
                switch(r22) {
                    case 0: goto L_0x006e;
                    case 1: goto L_0x006e;
                    case 2: goto L_0x006e;
                    default: goto L_0x006c;
                }
            L_0x006c:
                goto L_0x01a4
            L_0x006e:
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r0 = r7.this$0
                java.lang.Object r0 = r0.a((int) r8)
                com.ss.android.ugc.aweme.im.service.model.IMContact r0 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r0
                if (r0 == 0) goto L_0x01a4
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r1 = r7.this$0
                java.lang.Object[] r14 = new java.lang.Object[r12]
                r14[r11] = r0
                com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter.f52095b
                r17 = 0
                r18 = 52889(0xce99, float:7.4113E-41)
                java.lang.Class[] r2 = new java.lang.Class[r12]
                java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r3 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
                r2[r11] = r3
                java.lang.Class r20 = java.lang.Boolean.TYPE
                r15 = r1
                r19 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
                if (r2 == 0) goto L_0x00b8
                java.lang.Object[] r14 = new java.lang.Object[r12]
                r14[r11] = r0
                com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter.f52095b
                r17 = 0
                r18 = 52889(0xce99, float:7.4113E-41)
                java.lang.Class[] r2 = new java.lang.Class[r12]
                java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r3 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
                r2[r11] = r3
                java.lang.Class r20 = java.lang.Boolean.TYPE
                r15 = r1
                r19 = r2
                java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                goto L_0x0135
            L_0x00b8:
                com.ss.android.ugc.aweme.im.service.model.IMUser r2 = com.ss.android.ugc.aweme.im.sdk.d.e.a((com.ss.android.ugc.aweme.im.service.model.IMContact) r0)
                if (r2 == 0) goto L_0x0134
                java.lang.String r3 = r2.getUid()
                java.lang.CharSequence r4 = com.ss.android.ugc.aweme.im.sdk.utils.d.b()
                java.lang.String r4 = r4.toString()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
                if (r3 != 0) goto L_0x0134
                int r2 = r2.getFollowStatus()
                if (r2 == r13) goto L_0x0134
                com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r1 = r1.d()
                if (r1 == 0) goto L_0x0132
                com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = r1.f52171d
                if (r1 != 0) goto L_0x00e1
                goto L_0x0132
            L_0x00e1:
                java.lang.String r1 = r1.itemType
                if (r1 != 0) goto L_0x00e6
                goto L_0x0134
            L_0x00e6:
                int r2 = r1.hashCode()
                r3 = -913038159(0xffffffffc99424b1, float:-1213590.1)
                if (r2 == r3) goto L_0x0120
                r3 = 102340(0x18fc4, float:1.43409E-40)
                if (r2 == r3) goto L_0x010d
                r3 = 110986(0x1b18a, float:1.55525E-40)
                if (r2 == r3) goto L_0x00fa
                goto L_0x0134
            L_0x00fa:
                java.lang.String r2 = "pic"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0134
                android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
                r2 = 2131560635(0x7f0d08bb, float:1.8746648E38)
                com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r1, (int) r2)
                goto L_0x0132
            L_0x010d:
                java.lang.String r2 = "gif"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0134
                android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
                r2 = 2131560461(0x7f0d080d, float:1.8746295E38)
                com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r1, (int) r2)
                goto L_0x0132
            L_0x0120:
                java.lang.String r2 = "story_video"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0134
                android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
                r2 = 2131560636(0x7f0d08bc, float:1.874665E38)
                com.bytedance.common.utility.UIUtils.displayToast((android.content.Context) r1, (int) r2)
            L_0x0132:
                r1 = 0
                goto L_0x0135
            L_0x0134:
                r1 = 1
            L_0x0135:
                if (r1 == 0) goto L_0x01a3
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r1 = r7.this$0
                com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r1 = r1.d()
                if (r1 == 0) goto L_0x0144
                boolean r1 = r1.b()
                goto L_0x0145
            L_0x0144:
                r1 = 0
            L_0x0145:
                if (r1 == 0) goto L_0x0197
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r1 = r7.this$0
                com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r1 = r1.d()
                if (r1 == 0) goto L_0x0155
                java.util.List r1 = r1.d()
                if (r1 != 0) goto L_0x0159
            L_0x0155:
                java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            L_0x0159:
                boolean r2 = r1.contains(r0)
                if (r2 != 0) goto L_0x0186
                int r1 = r1.size()
                r2 = 10
                if (r1 < r2) goto L_0x0186
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r0 = r7.this$0
                android.content.Context r0 = r0.f52069f
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r1 = r7.this$0
                android.content.Context r1 = r1.f52069f
                r3 = 2131560755(0x7f0d0933, float:1.8746891E38)
                java.lang.Object[] r4 = new java.lang.Object[r12]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4[r11] = r2
                java.lang.String r1 = r1.getString(r3, r4)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (java.lang.String) r1)
                r0.a()
                goto L_0x01a4
            L_0x0186:
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r1 = r7.this$0
                com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r1 = r1.d()
                if (r1 == 0) goto L_0x0191
                r1.a((com.ss.android.ugc.aweme.im.service.model.IMContact) r0)
            L_0x0191:
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r0 = r7.this$0
                r0.notifyItemChanged(r8)
                goto L_0x01a4
            L_0x0197:
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r1 = r7.this$0
                com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r1 = r1.d()
                if (r1 == 0) goto L_0x01a3
                r1.a((com.ss.android.ugc.aweme.im.service.model.IMContact) r0)
                goto L_0x01a4
            L_0x01a3:
                return
            L_0x01a4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter.b.invoke(int, int, android.view.View):void");
        }
    }

    public final RelationMemberListViewModel d() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f52095b, false, 52887, new Class[0], RelationMemberListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f52095b, false, 52887, new Class[0], RelationMemberListViewModel.class);
        } else {
            value = this.f52097d.getValue();
        }
        return (RelationMemberListViewModel) value;
    }

    @Nullable
    public final Function3<Integer, Integer, View, Unit> c() {
        return this.i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RelationMemberSelectListAdapter(@NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RelationMemberListViewModel.class);
        this.f52097d = LazyKt.lazy(new a(orCreateKotlinClass, lifecycleOwner, orCreateKotlinClass));
    }

    @NotNull
    public final BaseSelectViewHolder<IMContact> a(@NotNull ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f52095b, false, 52888, new Class[]{ViewGroup.class, Integer.TYPE}, BaseSelectViewHolder.class)) {
            return (BaseSelectViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f52095b, false, 52888, new Class[]{ViewGroup.class, Integer.TYPE}, BaseSelectViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        return new RelationMemberSelectViewHolder<>(viewGroup2);
    }
}
