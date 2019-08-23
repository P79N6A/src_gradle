package com.ss.android.ugc.aweme.im.sdk.group.adapter;

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
import com.ss.android.ugc.aweme.im.sdk.group.viewholder.GroupSelectViewHolder;
import com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.BaseSelectListAdapter;
import com.ss.android.ugc.aweme.im.sdk.relations.viewholder.BaseSelectViewHolder;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bH\u0016Ra\u0010\u0006\u001aI\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/adapter/GroupSelectListAdapter;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/BaseSelectListAdapter;", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "mActionListener", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "type", "position", "Landroid/view/View;", "view", "", "getMActionListener", "()Lkotlin/jvm/functions/Function3;", "setMActionListener", "(Lkotlin/jvm/functions/Function3;)V", "mMemberListViewModel", "Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupListViewModel;", "getMMemberListViewModel", "()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupListViewModel;", "mMemberListViewModel$delegate", "Lkotlin/Lazy;", "onCreateBasicViewHolder", "Lcom/ss/android/ugc/aweme/im/sdk/relations/viewholder/BaseSelectViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupSelectListAdapter extends BaseSelectListAdapter<IMContact> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51572b;

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f51573c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupSelectListAdapter.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupListViewModel;"))};

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f51574d;
    @Nullable
    private Function3<? super Integer, ? super Integer, ? super View, Unit> i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0001\u0018\u0001*\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "VM", "T", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/ViewModelOwner;", "Landroid/arch/lifecycle/ViewModel;", "invoke", "()Landroid/arch/lifecycle/ViewModel;", "com/ss/android/ugc/aweme/im/sdk/relations/select/ExtensionsKt$activityViewModel$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<GroupListViewModel> {
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

        /* JADX WARNING: type inference failed for: r0v3, types: [android.arch.lifecycle.ViewModel, com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel] */
        /* JADX WARNING: type inference failed for: r0v10, types: [android.arch.lifecycle.ViewModel, com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel] */
        @Nullable
        public final GroupListViewModel invoke() {
            ViewModelProvider viewModelProvider;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52240, new Class[0], ViewModel.class)) {
                return (ViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52240, new Class[0], ViewModel.class);
            }
            ViewModelProvider.Factory r0 = new ViewModelProvider.Factory(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51575a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f51576b;

                {
                    this.f51576b = r1;
                }

                public final <T extends ViewModel> T create(@NotNull Class<T> cls) {
                    Class<T> cls2 = cls;
                    if (PatchProxy.isSupport(new Object[]{cls2}, this, f51575a, false, 52241, new Class[]{Class.class}, ViewModel.class)) {
                        return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls2}, this, f51575a, false, 52241, new Class[]{Class.class}, ViewModel.class);
                    }
                    Intrinsics.checkParameterIsNotNull(cls2, "modelClass");
                    throw new IllegalStateException(this.f51576b.$viewModelClass.getClass().getSimpleName() + " should be created in the host before being used.");
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
        final /* synthetic */ LifecycleOwner $owner;
        final /* synthetic */ GroupSelectListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(GroupSelectListAdapter groupSelectListAdapter, LifecycleOwner lifecycleOwner) {
            super(3);
            this.this$0 = groupSelectListAdapter;
            this.$owner = lifecycleOwner;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (View) obj3);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e3, code lost:
            if (r0 == null) goto L_0x00e5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(int r15, int r16, @org.jetbrains.annotations.NotNull android.view.View r17) {
            /*
                r14 = this;
                r7 = r14
                r8 = r16
                r9 = r17
                r10 = 3
                java.lang.Object[] r0 = new java.lang.Object[r10]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
                r11 = 0
                r0[r11] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
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
                r4 = 52242(0xcc12, float:7.3207E-41)
                r1 = r14
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0061
                java.lang.Object[] r0 = new java.lang.Object[r10]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
                r0[r11] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
                r0[r12] = r1
                r0[r13] = r9
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                r3 = 0
                r4 = 52242(0xcc12, float:7.3207E-41)
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r12] = r1
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r13] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r14
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0061:
                java.lang.String r0 = "view"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
                switch(r15) {
                    case 0: goto L_0x006b;
                    case 1: goto L_0x006b;
                    case 2: goto L_0x006b;
                    default: goto L_0x0069;
                }
            L_0x0069:
                goto L_0x0145
            L_0x006b:
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r0 = r7.this$0
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r0 = r0.d()
                if (r0 == 0) goto L_0x0145
                int r0 = r0.i
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r1 = r7.this$0
                java.lang.Object r1 = r1.a((int) r8)
                boolean r2 = r1 instanceof com.ss.android.ugc.aweme.im.service.model.IMConversation
                if (r2 != 0) goto L_0x008a
                r1 = 0
            L_0x008a:
                com.ss.android.ugc.aweme.im.service.model.IMConversation r1 = (com.ss.android.ugc.aweme.im.service.model.IMConversation) r1
                if (r1 != 0) goto L_0x0090
                goto L_0x0145
            L_0x0090:
                if (r0 != r13) goto L_0x00c7
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r2 = "key_enter_from"
                r3 = 7
                r0.putInt(r2, r3)
                android.arch.lifecycle.LifecycleOwner r2 = r7.$owner
                if (r2 == 0) goto L_0x00bf
                android.content.Context r2 = (android.content.Context) r2
                java.lang.String r3 = r1.getConversationId()
                com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity.a((android.content.Context) r2, (java.lang.String) r3, (android.os.Bundle) r0)
                com.ss.android.ugc.aweme.im.sdk.utils.z r8 = com.ss.android.ugc.aweme.im.sdk.utils.z.a()
                java.lang.String r9 = r1.getConversationId()
                java.lang.String r10 = ""
                java.lang.String r11 = "group"
                java.lang.String r12 = "click_contact"
                java.lang.String r13 = "contact_list"
                r8.a(r9, r10, r11, r12, r13)
                goto L_0x0145
            L_0x00bf:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type android.content.Context"
                r0.<init>(r1)
                throw r0
            L_0x00c7:
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r0 = r7.this$0
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r0 = r0.d()
                if (r0 == 0) goto L_0x00d4
                boolean r0 = r0.b()
                goto L_0x00d5
            L_0x00d4:
                r0 = 0
            L_0x00d5:
                if (r0 == 0) goto L_0x0136
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r0 = r7.this$0
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r0 = r0.d()
                if (r0 == 0) goto L_0x00e5
                java.util.List r0 = r0.d()
                if (r0 != 0) goto L_0x00e9
            L_0x00e5:
                java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            L_0x00e9:
                boolean r2 = r0.contains(r1)
                if (r2 != 0) goto L_0x0123
                int r0 = r0.size()
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r2 = r7.this$0
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r2 = r2.d()
                r3 = 10
                if (r2 == 0) goto L_0x0100
                int r2 = r2.f51662d
                goto L_0x0102
            L_0x0100:
                r2 = 10
            L_0x0102:
                if (r0 < r2) goto L_0x0123
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r0 = r7.this$0
                android.content.Context r0 = r0.f52069f
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r1 = r7.this$0
                android.content.Context r1 = r1.f52069f
                r2 = 2131560755(0x7f0d0933, float:1.8746891E38)
                java.lang.Object[] r4 = new java.lang.Object[r12]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4[r11] = r3
                java.lang.String r1 = r1.getString(r2, r4)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (java.lang.String) r1)
                r0.a()
                goto L_0x0145
            L_0x0123:
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r0 = r7.this$0
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r0 = r0.d()
                if (r0 == 0) goto L_0x0130
                com.ss.android.ugc.aweme.im.service.model.IMContact r1 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r1
                r0.a((com.ss.android.ugc.aweme.im.service.model.IMContact) r1)
            L_0x0130:
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r0 = r7.this$0
                r0.notifyItemChanged(r8)
                goto L_0x0145
            L_0x0136:
                com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter r0 = r7.this$0
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r0 = r0.d()
                if (r0 == 0) goto L_0x0144
                com.ss.android.ugc.aweme.im.service.model.IMContact r1 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r1
                r0.a((com.ss.android.ugc.aweme.im.service.model.IMContact) r1)
                goto L_0x0145
            L_0x0144:
                return
            L_0x0145:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.adapter.GroupSelectListAdapter.b.invoke(int, int, android.view.View):void");
        }
    }

    public final GroupListViewModel d() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51572b, false, 52238, new Class[0], GroupListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51572b, false, 52238, new Class[0], GroupListViewModel.class);
        } else {
            value = this.f51574d.getValue();
        }
        return (GroupListViewModel) value;
    }

    @Nullable
    public final Function3<Integer, Integer, View, Unit> c() {
        return this.i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupSelectListAdapter(@NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GroupListViewModel.class);
        this.f51574d = LazyKt.lazy(new a(orCreateKotlinClass, lifecycleOwner, orCreateKotlinClass));
        this.i = new b(this, lifecycleOwner);
    }

    @NotNull
    public final BaseSelectViewHolder<IMContact> a(@NotNull ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f51572b, false, 52239, new Class[]{ViewGroup.class, Integer.TYPE}, BaseSelectViewHolder.class)) {
            return (BaseSelectViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f51572b, false, 52239, new Class[]{ViewGroup.class, Integer.TYPE}, BaseSelectViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        return new GroupSelectViewHolder<>(viewGroup2);
    }
}
