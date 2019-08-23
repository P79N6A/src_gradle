package com.ss.android.ugc.aweme.im.sdk.relations.viewholder;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \b*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/viewholder/RelationMemberViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/viewholder/BaseSelectViewHolder;", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "mFriendIcon", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "mMemberListViewModel", "Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;", "getMMemberListViewModel", "()Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;", "mMemberListViewModel$delegate", "Lkotlin/Lazy;", "mTitleLayout", "Landroid/view/View;", "mTitleTv", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "bind", "", "item", "preItem", "position", "", "bindIMUser", "user", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "preUser", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RelationMemberViewHolder extends BaseSelectViewHolder<IMContact> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52255a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f52256b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RelationMemberViewHolder.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;"))};
    private final View l = this.itemView.findViewById(C0906R.id.d3v);
    private final DmtTextView m = ((DmtTextView) this.itemView.findViewById(C0906R.id.d41));
    private final ImageView n = ((ImageView) this.itemView.findViewById(C0906R.id.au2));
    private final Lazy o;

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
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 53060, new Class[0], ViewModel.class)) {
                return (ViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 53060, new Class[0], ViewModel.class);
            }
            ViewModelProvider.Factory r0 = new ViewModelProvider.Factory(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52257a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f52258b;

                {
                    this.f52258b = r1;
                }

                public final <T extends ViewModel> T create(@NotNull Class<T> cls) {
                    Class<T> cls2 = cls;
                    if (PatchProxy.isSupport(new Object[]{cls2}, this, f52257a, false, 53061, new Class[]{Class.class}, ViewModel.class)) {
                        return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls2}, this, f52257a, false, 53061, new Class[]{Class.class}, ViewModel.class);
                    }
                    Intrinsics.checkParameterIsNotNull(cls2, "modelClass");
                    throw new IllegalStateException(this.f52258b.$viewModelClass.getClass().getSimpleName() + " should be created in the host before being used.");
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

    private final RelationMemberListViewModel e() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f52255a, false, 53057, new Class[0], RelationMemberListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f52255a, false, 53057, new Class[0], RelationMemberListViewModel.class);
        } else {
            value = this.o.getValue();
        }
        return (RelationMemberListViewModel) value;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RelationMemberViewHolder(@org.jetbrains.annotations.NotNull android.view.ViewGroup r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131690460(0x7f0f03dc, float:1.9009964E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r4, r2)
            java.lang.String r1 = "LayoutInflater.from(pare…on_select, parent, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r3.<init>(r0)
            android.view.View r0 = r3.itemView
            r1 = 2131170427(0x7f07147b, float:1.7955212E38)
            android.view.View r0 = r0.findViewById(r1)
            r3.l = r0
            android.view.View r0 = r3.itemView
            r1 = 2131170433(0x7f071481, float:1.7955224E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            r3.m = r0
            android.view.View r0 = r3.itemView
            r1 = 2131167326(0x7f07085e, float:1.7948922E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.n = r0
            android.content.Context r4 = r4.getContext()
            if (r4 == 0) goto L_0x005e
            android.arch.lifecycle.LifecycleOwner r4 = (android.arch.lifecycle.LifecycleOwner) r4
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel> r0 = com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            com.ss.android.ugc.aweme.im.sdk.relations.viewholder.RelationMemberViewHolder$a r1 = new com.ss.android.ugc.aweme.im.sdk.relations.viewholder.RelationMemberViewHolder$a
            r1.<init>(r0, r4, r0)
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            kotlin.Lazy r4 = kotlin.LazyKt.lazy(r1)
            r3.o = r4
            return
        L_0x005e:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.viewholder.RelationMemberViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0092, code lost:
        if (r1 == null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x019a, code lost:
        if (r1 == null) goto L_0x019f;
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
            com.meituan.robust.ChangeQuickRedirect r2 = f52255a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 53058(0xcf42, float:7.435E-41)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005c
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f52255a
            r3 = 0
            r4 = 53058(0xcf42, float:7.435E-41)
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
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r0 = r14.e()
            if (r0 == 0) goto L_0x0087
            boolean r0 = r0.b()
            goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r1 = r14.e()
            if (r1 == 0) goto L_0x0094
            java.util.List r1 = r1.d()
            if (r1 != 0) goto L_0x0098
        L_0x0094:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0098:
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r2 = r14.e()
            r3 = 0
            if (r2 == 0) goto L_0x00a2
            java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMContact> r2 = r2.f52173f
            goto L_0x00a3
        L_0x00a2:
            r2 = r3
        L_0x00a3:
            if (r0 == 0) goto L_0x00b7
            r14.c()
            android.widget.ImageView r0 = r7.k
            java.lang.String r4 = "mCheckBox"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            boolean r1 = r1.contains(r8)
            r0.setSelected(r1)
            goto L_0x00c4
        L_0x00b7:
            r14.d()
            android.widget.ImageView r0 = r7.k
            java.lang.String r1 = "mCheckBox"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setSelected(r11)
        L_0x00c4:
            if (r2 == 0) goto L_0x0102
            boolean r0 = r2.contains(r8)
            if (r0 != r12) goto L_0x0102
            android.view.View r0 = r7.f52239e
            java.lang.String r1 = "mContentView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setEnabled(r11)
            android.widget.ImageView r0 = r7.k
            java.lang.String r1 = "mCheckBox"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setSelected(r12)
            android.widget.ImageView r0 = r7.k
            java.lang.String r1 = "mCheckBox"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setEnabled(r11)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f52240f
            java.lang.String r1 = "mAvatarIv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setEnabled(r11)
            android.view.View r0 = r7.f52239e
            java.lang.String r1 = "mContentView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 1051595899(0x3eae147b, float:0.34)
            r0.setAlpha(r1)
            goto L_0x012c
        L_0x0102:
            android.view.View r0 = r7.f52239e
            java.lang.String r1 = "mContentView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setEnabled(r12)
            android.widget.ImageView r0 = r7.k
            java.lang.String r1 = "mCheckBox"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setEnabled(r12)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.f52240f
            java.lang.String r1 = "mAvatarIv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setEnabled(r12)
            android.view.View r0 = r7.f52239e
            java.lang.String r1 = "mContentView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
        L_0x012c:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.i
            java.lang.String r1 = "mDetailTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r10 = 8
            r0.setVisibility(r10)
            if (r9 == 0) goto L_0x013e
            com.ss.android.ugc.aweme.im.service.model.IMUser r3 = com.ss.android.ugc.aweme.im.sdk.d.e.a((com.ss.android.ugc.aweme.im.service.model.IMContact) r9)
        L_0x013e:
            r9 = r3
            com.ss.android.ugc.aweme.im.service.model.IMUser r8 = com.ss.android.ugc.aweme.im.sdk.d.e.a((com.ss.android.ugc.aweme.im.service.model.IMContact) r8)
            java.lang.String r0 = "this"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r0)
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f52255a
            r3 = 0
            r4 = 53059(0xcf43, float:7.4351E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = com.ss.android.ugc.aweme.im.service.model.IMUser.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = com.ss.android.ugc.aweme.im.service.model.IMUser.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0184
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f52255a
            r3 = 0
            r4 = 53059(0xcf43, float:7.4351E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = com.ss.android.ugc.aweme.im.service.model.IMUser.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = com.ss.android.ugc.aweme.im.service.model.IMUser.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0184:
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r0 = r14.e()
            if (r0 == 0) goto L_0x018f
            boolean r0 = r0.c()
            goto L_0x0190
        L_0x018f:
            r0 = 0
        L_0x0190:
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r1 = r14.e()
            if (r1 == 0) goto L_0x019f
            java.lang.String r1 = r1.f()
            if (r1 != 0) goto L_0x019d
            goto L_0x019f
        L_0x019d:
            r3 = r1
            goto L_0x01a2
        L_0x019f:
            java.lang.String r1 = ""
            goto L_0x019d
        L_0x01a2:
            com.ss.android.ugc.aweme.im.sdk.relations.a.f r1 = com.ss.android.ugc.aweme.im.sdk.relations.a.f.f52045b
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r7.h
            java.lang.String r4 = "mNameTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.a(r2, r8, r3)
            android.widget.ImageView r1 = r7.g
            com.ss.android.ugc.aweme.im.sdk.utils.ax.a((android.widget.ImageView) r1, (com.ss.android.ugc.aweme.im.service.model.IMUser) r8)
            if (r0 != 0) goto L_0x026c
            int r0 = r8.getType()
            r1 = 5
            if (r0 != r13) goto L_0x01db
            android.view.View r0 = r7.l
            java.lang.String r2 = "mTitleLayout"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r0.setVisibility(r11)
            android.widget.ImageView r0 = r7.n
            java.lang.String r2 = "mFriendIcon"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r0.setVisibility(r10)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.m
            r2 = 2131560659(0x7f0d08d3, float:1.8746697E38)
            r0.setText(r2)
            goto L_0x0227
        L_0x01db:
            int r0 = r8.getType()
            if (r0 != r1) goto L_0x021d
            android.view.View r0 = r7.l
            java.lang.String r2 = "mTitleLayout"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r0.setVisibility(r11)
            android.widget.ImageView r0 = r7.n
            java.lang.String r2 = "mFriendIcon"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r0.setVisibility(r10)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.m
            java.lang.String r2 = "mTitleTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.view.View r2 = r7.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.content.Context r2 = r2.getContext()
            java.lang.String r3 = "itemView.context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131560477(0x7f0d081d, float:1.8746327E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            goto L_0x0227
        L_0x021d:
            android.view.View r0 = r7.l
            java.lang.String r2 = "mTitleLayout"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r0.setVisibility(r10)
        L_0x0227:
            int r0 = r8.getType()
            if (r0 == r1) goto L_0x0234
            int r0 = r8.getType()
            r1 = 6
            if (r0 != r1) goto L_0x0246
        L_0x0234:
            if (r9 == 0) goto L_0x0251
            java.lang.String r0 = r9.getInitialLetter()
            java.lang.String r1 = r8.getInitialLetter()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            r0 = r0 ^ r12
            if (r0 == 0) goto L_0x0246
            goto L_0x0251
        L_0x0246:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.j
            java.lang.String r1 = "mIndexTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r10)
            return
        L_0x0251:
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
        L_0x026c:
            com.ss.android.ugc.aweme.im.sdk.relations.a.f r0 = com.ss.android.ugc.aweme.im.sdk.relations.a.f.f52045b
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.i
            java.lang.String r2 = "mDetailTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4 = 0
            r5 = 8
            r2 = r8
            r0.a((android.widget.TextView) r1, (com.ss.android.ugc.aweme.im.service.model.IMUser) r2, (java.lang.String) r3, false)
            android.view.View r0 = r7.l
            java.lang.String r1 = "mTitleLayout"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r10)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.j
            java.lang.String r1 = "mIndexTv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.viewholder.RelationMemberViewHolder.a(java.lang.Object, java.lang.Object, int):void");
    }
}
