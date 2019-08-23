package com.ss.android.ugc.aweme.im.sdk.group.viewholder;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/viewholder/GroupSelectViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/viewholder/BaseSelectViewHolder;", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "mCountTv", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mMemberListViewModel", "Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupListViewModel;", "getMMemberListViewModel", "()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupListViewModel;", "mMemberListViewModel$delegate", "Lkotlin/Lazy;", "bind", "", "item", "preItem", "position", "", "bindIMConversation", "conversation", "Lcom/ss/android/ugc/aweme/im/service/model/IMConversation;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupSelectViewHolder extends BaseSelectViewHolder<IMContact> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51654a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f51655b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupSelectViewHolder.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupListViewModel;"))};
    private final Lazy l;
    private final DmtTextView m;

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
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52336, new Class[0], ViewModel.class)) {
                return (ViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52336, new Class[0], ViewModel.class);
            }
            ViewModelProvider.Factory r0 = new ViewModelProvider.Factory(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51656a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f51657b;

                {
                    this.f51657b = r1;
                }

                public final <T extends ViewModel> T create(@NotNull Class<T> cls) {
                    Class<T> cls2 = cls;
                    if (PatchProxy.isSupport(new Object[]{cls2}, this, f51656a, false, 52337, new Class[]{Class.class}, ViewModel.class)) {
                        return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls2}, this, f51656a, false, 52337, new Class[]{Class.class}, ViewModel.class);
                    }
                    Intrinsics.checkParameterIsNotNull(cls2, "modelClass");
                    throw new IllegalStateException(this.f51657b.$viewModelClass.getClass().getSimpleName() + " should be created in the host before being used.");
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

    private final GroupListViewModel e() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51654a, false, 52333, new Class[0], GroupListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51654a, false, 52333, new Class[0], GroupListViewModel.class);
        } else {
            value = this.l.getValue();
        }
        return (GroupListViewModel) value;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GroupSelectViewHolder(@org.jetbrains.annotations.NotNull android.view.ViewGroup r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131690297(0x7f0f0339, float:1.9009634E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r4, r2)
            java.lang.String r1 = "LayoutInflater.from(pare…up_select, parent, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r3.<init>(r0)
            android.content.Context r4 = r4.getContext()
            if (r4 == 0) goto L_0x004b
            android.arch.lifecycle.LifecycleOwner r4 = (android.arch.lifecycle.LifecycleOwner) r4
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel> r0 = com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            com.ss.android.ugc.aweme.im.sdk.group.viewholder.GroupSelectViewHolder$a r1 = new com.ss.android.ugc.aweme.im.sdk.group.viewholder.GroupSelectViewHolder$a
            r1.<init>(r0, r4, r0)
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            kotlin.Lazy r4 = kotlin.LazyKt.lazy(r1)
            r3.l = r4
            android.view.View r4 = r3.itemView
            r0 = 2131166197(0x7f0703f5, float:1.7946633E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.count_tv)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r4
            r3.m = r4
            return
        L_0x004b:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.viewholder.GroupSelectViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ff, code lost:
        if (r1 == null) goto L_0x0101;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(java.lang.Object r15, java.lang.Object r16, int r17) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            com.ss.android.ugc.aweme.im.service.model.IMContact r8 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r8
            r9 = r16
            com.ss.android.ugc.aweme.im.service.model.IMContact r9 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r9
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r13 = 2
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f51654a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 52334(0xcc6e, float:7.3336E-41)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005c
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f51654a
            r3 = 0
            r4 = 52334(0xcc6e, float:7.3336E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x005c:
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f52240f
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r8.getDisplayAvatar()
            com.ss.android.ugc.aweme.base.c.b(r0, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.h
            java.lang.String r1 = "mNameTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r1 = r8.getDisplayName()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.i
            java.lang.String r1 = "mDetailTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.im.service.model.IMConversation r8 = (com.ss.android.ugc.aweme.im.service.model.IMConversation) r8
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f51654a
            r3 = 0
            r4 = 52335(0xcc6f, float:7.3337E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMConversation> r1 = com.ss.android.ugc.aweme.im.service.model.IMConversation.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00ba
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f51654a
            r3 = 0
            r4 = 52335(0xcc6f, float:7.3337E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMConversation> r1 = com.ss.android.ugc.aweme.im.service.model.IMConversation.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00ba:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " "
            r0.append(r1)
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
            r2 = 2131560520(0x7f0d0848, float:1.8746415E38)
            java.lang.Object[] r3 = new java.lang.Object[r12]
            int r4 = r8.getConversationMemberCount()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r11] = r4
            java.lang.String r1 = r1.getString(r2, r3)
            r0.append(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.m
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r0 = r14.e()
            if (r0 == 0) goto L_0x00f4
            boolean r0 = r0.b()
            goto L_0x00f5
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r1 = r14.e()
            if (r1 == 0) goto L_0x0101
            java.util.List r1 = r1.d()
            if (r1 != 0) goto L_0x0105
        L_0x0101:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0105:
            if (r0 == 0) goto L_0x0119
            r14.c()
            android.widget.ImageView r0 = r7.k
            java.lang.String r2 = "mCheckBox"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r1 = r1.contains(r8)
            r0.setSelected(r1)
            return
        L_0x0119:
            r14.d()
            android.widget.ImageView r0 = r7.k
            java.lang.String r1 = "mCheckBox"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setSelected(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.viewholder.GroupSelectViewHolder.a(java.lang.Object, java.lang.Object, int):void");
    }
}
