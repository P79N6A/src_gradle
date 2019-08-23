package com.ss.android.ugc.aweme.im.sdk.group.viewholder;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/viewholder/GroupMemberSelectViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/viewholder/BaseSelectViewHolder;", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "mMemberListViewModel", "Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;", "getMMemberListViewModel", "()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;", "mMemberListViewModel$delegate", "Lkotlin/Lazy;", "bind", "", "item", "preItem", "position", "", "bindIMUser", "user", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "preUser", "updateGroupOwnerItemView", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupMemberSelectViewHolder extends BaseSelectViewHolder<IMContact> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51650a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f51651b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GroupMemberSelectViewHolder.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;"))};
    private final Lazy l;

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
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52331, new Class[0], ViewModel.class)) {
                return (ViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52331, new Class[0], ViewModel.class);
            }
            ViewModelProvider.Factory r0 = new ViewModelProvider.Factory(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51652a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f51653b;

                {
                    this.f51653b = r1;
                }

                public final <T extends ViewModel> T create(@NotNull Class<T> cls) {
                    Class<T> cls2 = cls;
                    if (PatchProxy.isSupport(new Object[]{cls2}, this, f51652a, false, 52332, new Class[]{Class.class}, ViewModel.class)) {
                        return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls2}, this, f51652a, false, 52332, new Class[]{Class.class}, ViewModel.class);
                    }
                    Intrinsics.checkParameterIsNotNull(cls2, "modelClass");
                    throw new IllegalStateException(this.f51653b.$viewModelClass.getClass().getSimpleName() + " should be created in the host before being used.");
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

    private final GroupMemberListViewModel e() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f51650a, false, 52327, new Class[0], GroupMemberListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f51650a, false, 52327, new Class[0], GroupMemberListViewModel.class);
        } else {
            value = this.l.getValue();
        }
        return (GroupMemberListViewModel) value;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GroupMemberSelectViewHolder(@org.jetbrains.annotations.NotNull android.view.ViewGroup r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131690296(0x7f0f0338, float:1.9009632E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r4, r2)
            java.lang.String r1 = "LayoutInflater.from(pare…er_select, parent, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r3.<init>(r0)
            android.content.Context r4 = r4.getContext()
            if (r4 == 0) goto L_0x0039
            android.arch.lifecycle.LifecycleOwner r4 = (android.arch.lifecycle.LifecycleOwner) r4
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel> r0 = com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            com.ss.android.ugc.aweme.im.sdk.group.viewholder.GroupMemberSelectViewHolder$a r1 = new com.ss.android.ugc.aweme.im.sdk.group.viewholder.GroupMemberSelectViewHolder$a
            r1.<init>(r0, r4, r0)
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            kotlin.Lazy r4 = kotlin.LazyKt.lazy(r1)
            r3.l = r4
            return
        L_0x0039:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.viewholder.GroupMemberSelectViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.ss.android.ugc.aweme.im.service.model.IMUser r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f51650a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = com.ss.android.ugc.aweme.im.service.model.IMUser.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 52330(0xcc6a, float:7.333E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f51650a
            r3 = 0
            r4 = 52330(0xcc6a, float:7.333E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = com.ss.android.ugc.aweme.im.service.model.IMUser.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r0 = r9.e()
            if (r0 == 0) goto L_0x00e4
            int r0 = r0.i
            r1 = 5
            if (r0 != r1) goto L_0x00e3
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r0 = r9.e()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = r0.f51666b
            if (r0 == 0) goto L_0x00e3
            com.ss.android.ugc.aweme.im.sdk.group.a$a r0 = com.ss.android.ugc.aweme.im.sdk.group.a.f51529e
            com.ss.android.ugc.aweme.im.sdk.group.a r0 = r0.a()
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r1 = r9.e()
            if (r1 != 0) goto L_0x0056
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0056:
            java.lang.String r1 = r1.f51666b
            if (r1 != 0) goto L_0x005d
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x005d:
            java.util.List r0 = r0.a((java.lang.String) r1)
            r1 = 0
            if (r0 == 0) goto L_0x0090
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r0 = r0.iterator()
        L_0x0071:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x008c
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r4 = (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a) r4
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r4.getUser()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0071
            r2.add(r3)
            goto L_0x0071
        L_0x008c:
            r0 = r2
            java.util.List r0 = (java.util.List) r0
            goto L_0x0091
        L_0x0090:
            r0 = r1
        L_0x0091:
            r2 = 2131165193(0x7f070009, float:1.7944596E38)
            if (r0 == 0) goto L_0x00d1
            int r3 = r0.size()
            if (r3 != r7) goto L_0x00d1
            java.lang.Object r0 = r0.get(r8)
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r0 = (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a) r0
            com.bytedance.im.core.d.m r0 = r0.getMember()
            if (r0 == 0) goto L_0x00d1
            int r0 = r0.getRole()
            com.bytedance.im.core.proto.GroupRole r3 = com.bytedance.im.core.proto.GroupRole.OWNER
            int r3 = r3.getValue()
            if (r0 != r3) goto L_0x00d1
            android.view.View r0 = r9.f52239e
            com.bytedance.im.core.proto.GroupRole r1 = com.bytedance.im.core.proto.GroupRole.OWNER
            int r1 = r1.getValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setTag(r2, r1)
            android.view.View r0 = r9.f52239e
            java.lang.String r1 = "mContentView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 1051595899(0x3eae147b, float:0.34)
            r0.setAlpha(r1)
            goto L_0x00e3
        L_0x00d1:
            android.view.View r0 = r9.f52239e
            r0.setTag(r2, r1)
            android.view.View r0 = r9.f52239e
            java.lang.String r1 = "mContentView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            return
        L_0x00e3:
            return
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.viewholder.GroupMemberSelectViewHolder.a(com.ss.android.ugc.aweme.im.service.model.IMUser):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00e1, code lost:
        if (r0 == null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0109, code lost:
        if (r3 == null) goto L_0x010e;
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
            com.meituan.robust.ChangeQuickRedirect r2 = f51650a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 52328(0xcc68, float:7.3327E-41)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005c
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f51650a
            r3 = 0
            r4 = 52328(0xcc68, float:7.3327E-41)
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
            r10 = 8
            r0.setVisibility(r10)
            com.ss.android.ugc.aweme.im.service.model.IMUser r8 = com.ss.android.ugc.aweme.im.sdk.d.e.a((com.ss.android.ugc.aweme.im.service.model.IMContact) r8)
            if (r9 == 0) goto L_0x0094
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = com.ss.android.ugc.aweme.im.sdk.d.e.a((com.ss.android.ugc.aweme.im.service.model.IMContact) r9)
        L_0x0092:
            r9 = r0
            goto L_0x0096
        L_0x0094:
            r0 = 0
            goto L_0x0092
        L_0x0096:
            java.lang.String r0 = "user"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r0)
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f51650a
            r3 = 0
            r4 = 52329(0xcc69, float:7.3329E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = com.ss.android.ugc.aweme.im.service.model.IMUser.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = com.ss.android.ugc.aweme.im.service.model.IMUser.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00d7
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f51650a
            r3 = 0
            r4 = 52329(0xcc69, float:7.3329E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = com.ss.android.ugc.aweme.im.service.model.IMUser.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = com.ss.android.ugc.aweme.im.service.model.IMUser.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00d7:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r0 = r14.e()
            if (r0 == 0) goto L_0x00e3
            java.util.List r0 = r0.d()
            if (r0 != 0) goto L_0x00e7
        L_0x00e3:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00e7:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r1 = r14.e()
            if (r1 == 0) goto L_0x00f2
            boolean r1 = r1.b()
            goto L_0x00f3
        L_0x00f2:
            r1 = 0
        L_0x00f3:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r2 = r14.e()
            if (r2 == 0) goto L_0x00fe
            boolean r2 = r2.c()
            goto L_0x00ff
        L_0x00fe:
            r2 = 0
        L_0x00ff:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r3 = r14.e()
            if (r3 == 0) goto L_0x010e
            java.lang.String r3 = r3.f()
            if (r3 != 0) goto L_0x010c
            goto L_0x010e
        L_0x010c:
            r4 = r3
            goto L_0x0111
        L_0x010e:
            java.lang.String r3 = ""
            goto L_0x010c
        L_0x0111:
            r14.a(r8)
            if (r1 == 0) goto L_0x0128
            r14.c()
            android.widget.ImageView r1 = r7.k
            java.lang.String r3 = "mCheckBox"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            boolean r0 = r0.contains(r8)
            r1.setSelected(r0)
            goto L_0x0135
        L_0x0128:
            r14.d()
            android.widget.ImageView r0 = r7.k
            java.lang.String r1 = "mCheckBox"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setSelected(r11)
        L_0x0135:
            com.ss.android.ugc.aweme.im.sdk.relations.a.f r0 = com.ss.android.ugc.aweme.im.sdk.relations.a.f.f52045b
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.h
            java.lang.String r3 = "mNameTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a(r1, r8, r4)
            android.widget.ImageView r0 = r7.g
            com.ss.android.ugc.aweme.im.sdk.utils.ax.a((android.widget.ImageView) r0, (com.ss.android.ugc.aweme.im.service.model.IMUser) r8)
            if (r2 != 0) goto L_0x0182
            if (r9 == 0) goto L_0x0167
            java.lang.String r0 = r9.getInitialLetter()
            java.lang.String r1 = r8.getInitialLetter()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            r0 = r0 ^ r12
            if (r0 == 0) goto L_0x015c
            goto L_0x0167
        L_0x015c:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.j
            java.lang.String r1 = "mIndexTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r10)
            return
        L_0x0167:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.j
            java.lang.String r1 = "mIndexTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r11)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.j
            java.lang.String r1 = "mIndexTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r1 = r8.getInitialLetter()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            return
        L_0x0182:
            com.ss.android.ugc.aweme.im.sdk.relations.a.f r1 = com.ss.android.ugc.aweme.im.sdk.relations.a.f.f52045b
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.i
            java.lang.String r2 = "mDetailTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r2 = r0
            android.widget.TextView r2 = (android.widget.TextView) r2
            r5 = 0
            r6 = 8
            r3 = r8
            r1.a((android.widget.TextView) r2, (com.ss.android.ugc.aweme.im.service.model.IMUser) r3, (java.lang.String) r4, false)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.j
            java.lang.String r1 = "mIndexTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.viewholder.GroupMemberSelectViewHolder.a(java.lang.Object, java.lang.Object, int):void");
    }
}