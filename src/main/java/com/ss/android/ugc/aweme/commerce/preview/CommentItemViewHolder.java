package com.ss.android.ugc.aweme.commerce.preview;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.preview.api.a.b;
import com.ss.android.ugc.aweme.commerce.service.l.j;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001d\u0010\u0015R\u001b\u0010\u001f\u001a\u00020 8FX\u0002¢\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/CommentItemViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "itemClickListener", "Lcom/ss/android/ugc/aweme/commerce/preview/OnItemClickListener;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/commerce/preview/OnItemClickListener;)V", "photoSize", "", "getPhotoSize", "()I", "photoSize$delegate", "Lkotlin/Lazy;", "photosContainer", "Landroid/widget/LinearLayout;", "getPhotosContainer", "()Landroid/widget/LinearLayout;", "photosContainer$delegate", "productCommentTV", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getProductCommentTV", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "productCommentTV$delegate", "roundingParams", "Lcom/facebook/drawee/generic/RoundingParams;", "getRoundingParams", "()Lcom/facebook/drawee/generic/RoundingParams;", "roundingParams$delegate", "userDesc", "getUserDesc", "userDesc$delegate", "userIcon", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "getUserIcon", "()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "userIcon$delegate", "bind", "", "data", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewCommentListResponse$Comment;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CommentItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37117a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f37118b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentItemViewHolder.class), "userIcon", "getUserIcon()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentItemViewHolder.class), "userDesc", "getUserDesc()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentItemViewHolder.class), "productCommentTV", "getProductCommentTV()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentItemViewHolder.class), "photosContainer", "getPhotosContainer()Landroid/widget/LinearLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentItemViewHolder.class), "roundingParams", "getRoundingParams()Lcom/facebook/drawee/generic/RoundingParams;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommentItemViewHolder.class), "photoSize", "getPhotoSize()I"))};
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f37119c;

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f37120d;

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f37121e;

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f37122f;
    private final Lazy g;
    private final Lazy h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $itemView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.$itemView = view;
        }

        public final int invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28521, new Class[0], Integer.TYPE)) {
                return (int) ((((float) j.f38030a) - UIUtils.dip2Px(this.$itemView.getContext(), 47.0f)) / 4.0f);
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28521, new Class[0], Integer.TYPE)).intValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<LinearLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $itemView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.$itemView = view;
        }

        public final LinearLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28522, new Class[0], LinearLayout.class)) {
                return (LinearLayout) this.$itemView.findViewById(C0906R.id.by4);
            }
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28522, new Class[0], LinearLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $itemView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.$itemView = view;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28523, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.$itemView.findViewById(C0906R.id.c6r);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28523, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/facebook/drawee/generic/RoundingParams;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<RoundingParams> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $itemView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.$itemView = view;
        }

        public final RoundingParams invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28524, new Class[0], RoundingParams.class)) {
                return new RoundingParams().setCornersRadius(UIUtils.dip2Px(this.$itemView.getContext(), 2.0f));
            }
            return (RoundingParams) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28524, new Class[0], RoundingParams.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<DmtTextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $itemView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(0);
            this.$itemView = view;
        }

        public final DmtTextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28525, new Class[0], DmtTextView.class)) {
                return (DmtTextView) this.$itemView.findViewById(C0906R.id.doz);
            }
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28525, new Class[0], DmtTextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<AvatarImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $itemView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(View view) {
            super(0);
            this.$itemView = view;
        }

        public final AvatarImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28526, new Class[0], AvatarImageView.class)) {
                return (AvatarImageView) this.$itemView.findViewById(C0906R.id.dp0);
            }
            return (AvatarImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28526, new Class[0], AvatarImageView.class);
        }
    }

    private final DmtTextView a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37117a, false, 28515, new Class[0], DmtTextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37117a, false, 28515, new Class[0], DmtTextView.class);
        } else {
            value = this.f37121e.getValue();
        }
        return (DmtTextView) value;
    }

    private final LinearLayout b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f37117a, false, 28516, new Class[0], LinearLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37117a, false, 28516, new Class[0], LinearLayout.class);
        } else {
            value = this.f37122f.getValue();
        }
        return (LinearLayout) value;
    }

    private final int c() {
        if (!PatchProxy.isSupport(new Object[0], this, f37117a, false, 28518, new Class[0], Integer.TYPE)) {
            return ((Number) this.h.getValue()).intValue();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f37117a, false, 28518, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a(@NotNull b.a aVar) {
        Object value;
        Object value2;
        int i;
        Object value3;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f37117a, false, 28519, new Class[]{b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f37117a, false, 28519, new Class[]{b.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "data");
        if (PatchProxy.isSupport(new Object[0], this, f37117a, false, 28513, new Class[0], AvatarImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f37117a, false, 28513, new Class[0], AvatarImageView.class);
        } else {
            value = this.f37119c.getValue();
        }
        com.ss.android.ugc.aweme.base.c.b((AvatarImageView) value, aVar.f37333d);
        if (PatchProxy.isSupport(new Object[0], this, f37117a, false, 28514, new Class[0], DmtTextView.class)) {
            value2 = PatchProxy.accessDispatch(new Object[0], this, f37117a, false, 28514, new Class[0], DmtTextView.class);
        } else {
            value2 = this.f37120d.getValue();
        }
        ((DmtTextView) value2).setText(aVar.f37332c);
        if (TextUtils.isEmpty(aVar.f37331b)) {
            a().setVisibility(8);
        } else {
            a().setVisibility(0);
            a().setText(aVar.f37331b);
        }
        List<? extends UrlModel> list = aVar.f37334e;
        if (list == null) {
            b().setVisibility(8);
        } else if (list.isEmpty()) {
            b().setVisibility(8);
        } else {
            b().setVisibility(0);
            int i2 = 0;
            for (UrlModel urlModel : list) {
                View view = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                RemoteImageView remoteImageView = new RemoteImageView(view.getContext());
                remoteImageView.setLayoutParams(new LinearLayout.LayoutParams(c(), c()));
                ViewGroup.LayoutParams layoutParams = remoteImageView.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (i2 == 0) {
                        i = 0;
                    } else {
                        View view2 = this.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                        i = (int) UIUtils.dip2Px(view2.getContext(), 5.0f);
                    }
                    marginLayoutParams.leftMargin = i;
                    GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) remoteImageView.getHierarchy();
                    Intrinsics.checkExpressionValueIsNotNull(genericDraweeHierarchy, "photoView.hierarchy");
                    if (PatchProxy.isSupport(new Object[0], this, f37117a, false, 28517, new Class[0], RoundingParams.class)) {
                        value3 = PatchProxy.accessDispatch(new Object[0], this, f37117a, false, 28517, new Class[0], RoundingParams.class);
                    } else {
                        value3 = this.g.getValue();
                    }
                    genericDraweeHierarchy.setRoundingParams((RoundingParams) value3);
                    com.ss.android.ugc.aweme.base.c.b(remoteImageView, urlModel);
                    b().addView(remoteImageView);
                    i2++;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentItemViewHolder(@NotNull View view, @Nullable final d dVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.f37119c = LazyKt.lazy(new f(view));
        this.f37120d = LazyKt.lazy(new e(view));
        this.f37121e = LazyKt.lazy(new c(view));
        this.f37122f = LazyKt.lazy(new b(view));
        this.g = LazyKt.lazy(new d(view));
        this.h = LazyKt.lazy(new a(view));
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37123a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f37123a, false, 28520, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f37123a, false, 28520, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                d dVar = dVar;
                if (dVar != null) {
                    dVar.a();
                }
            }
        });
    }
}
