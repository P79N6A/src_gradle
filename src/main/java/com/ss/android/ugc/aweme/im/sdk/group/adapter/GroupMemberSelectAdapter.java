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
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.group.viewholder.GroupMemberSelectViewHolder;
import com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\bH\u0016Ra\u0010\u0006\u001aI\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/adapter/GroupMemberSelectAdapter;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/BaseSelectListAdapter;", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "mActionListener", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "type", "position", "Landroid/view/View;", "view", "", "getMActionListener", "()Lkotlin/jvm/functions/Function3;", "setMActionListener", "(Lkotlin/jvm/functions/Function3;)V", "mMemberListViewModel", "Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;", "getMMemberListViewModel", "()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;", "mMemberListViewModel$delegate", "Lkotlin/Lazy;", "onCreateBasicViewHolder", "Lcom/ss/android/ugc/aweme/im/sdk/relations/viewholder/BaseSelectViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupMemberSelectAdapter extends BaseSelectListAdapter<IMContact> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51567b;

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f51568c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupMemberSelectAdapter.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;"))};

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f51569d;
    @Nullable
    private Function3<? super Integer, ? super Integer, ? super View, Unit> i = new b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0001\u0018\u0001*\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "VM", "T", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/ViewModelOwner;", "Landroid/arch/lifecycle/ViewModel;", "invoke", "()Landroid/arch/lifecycle/ViewModel;", "com/ss/android/ugc/aweme/im/sdk/relations/select/ExtensionsKt$activityViewModel$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<GroupMemberListViewModel> {
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

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel, android.arch.lifecycle.ViewModel] */
        /* JADX WARNING: type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel, android.arch.lifecycle.ViewModel] */
        @Nullable
        public final GroupMemberListViewModel invoke() {
            ViewModelProvider viewModelProvider;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52235, new Class[0], ViewModel.class)) {
                return (ViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52235, new Class[0], ViewModel.class);
            }
            ViewModelProvider.Factory r0 = new ViewModelProvider.Factory(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51570a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f51571b;

                {
                    this.f51571b = r1;
                }

                public final <T extends ViewModel> T create(@NotNull Class<T> cls) {
                    Class<T> cls2 = cls;
                    if (PatchProxy.isSupport(new Object[]{cls2}, this, f51570a, false, 52236, new Class[]{Class.class}, ViewModel.class)) {
                        return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls2}, this, f51570a, false, 52236, new Class[]{Class.class}, ViewModel.class);
                    }
                    Intrinsics.checkParameterIsNotNull(cls2, "modelClass");
                    throw new IllegalStateException(this.f51571b.$viewModelClass.getClass().getSimpleName() + " should be created in the host before being used.");
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
        final /* synthetic */ GroupMemberSelectAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(GroupMemberSelectAdapter groupMemberSelectAdapter) {
            super(3);
            this.this$0 = groupMemberSelectAdapter;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (View) obj3);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, int i2, @NotNull View view) {
            int i3 = i2;
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), view2}, this, changeQuickRedirect, false, 52237, new Class[]{Integer.TYPE, Integer.TYPE, View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), view2}, this, changeQuickRedirect, false, 52237, new Class[]{Integer.TYPE, Integer.TYPE, View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
            switch (i) {
                case 0:
                case 1:
                case 2:
                    GroupMemberListViewModel d2 = this.this$0.d();
                    if (d2 == null || d2.i != 5 || view2.getTag(C0906R.id.j) == null) {
                        IMContact iMContact = (IMContact) this.this$0.a(i3);
                        if (iMContact != null) {
                            GroupMemberListViewModel d3 = this.this$0.d();
                            if (d3 != null) {
                                d3.a(iMContact);
                            }
                            this.this$0.notifyItemChanged(i3);
                            return;
                        }
                    } else {
                        com.bytedance.ies.dmt.ui.d.a.a(view.getContext(), (int) C0906R.string.app).a();
                        return;
                    }
                    break;
            }
        }
    }

    public final GroupMemberListViewModel d() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51567b, false, 52233, new Class[0], GroupMemberListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51567b, false, 52233, new Class[0], GroupMemberListViewModel.class);
        } else {
            value = this.f51569d.getValue();
        }
        return (GroupMemberListViewModel) value;
    }

    @Nullable
    public final Function3<Integer, Integer, View, Unit> c() {
        return this.i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupMemberSelectAdapter(@NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GroupMemberListViewModel.class);
        this.f51569d = LazyKt.lazy(new a(orCreateKotlinClass, lifecycleOwner, orCreateKotlinClass));
    }

    @NotNull
    public final BaseSelectViewHolder<IMContact> a(@NotNull ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f51567b, false, 52234, new Class[]{ViewGroup.class, Integer.TYPE}, BaseSelectViewHolder.class)) {
            return (BaseSelectViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f51567b, false, 52234, new Class[]{ViewGroup.class, Integer.TYPE}, BaseSelectViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        return new GroupMemberSelectViewHolder<>(viewGroup2);
    }
}
