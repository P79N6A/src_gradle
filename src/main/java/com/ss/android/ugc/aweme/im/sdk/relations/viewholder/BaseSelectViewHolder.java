package com.ss.android.ugc.aweme.im.sdk.relations.viewholder;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.common.c;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J'\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00028\u00002\b\u0010-\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\tH&¢\u0006\u0002\u0010.J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u000200J\u0006\u00102\u001a\u00020\u000eJ\u0006\u00103\u001a\u00020\u000eRa\u0010\u0007\u001aI\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00190\u0019X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\n \u0015*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\n \u0015*\u0004\u0018\u00010\"0\"X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010%\u001a\n \u0015*\u0004\u0018\u00010\"0\"X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u001c\u0010'\u001a\n \u0015*\u0004\u0018\u00010\"0\"X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u001c\u0010)\u001a\n \u0015*\u0004\u0018\u00010\u00190\u0019X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001b¨\u00064"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/viewholder/BaseSelectViewHolder;", "ITEM", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/ViewModelOwner;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "actionListener", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "type", "position", "", "getActionListener", "()Lkotlin/jvm/functions/Function3;", "setActionListener", "(Lkotlin/jvm/functions/Function3;)V", "mAvatarIv", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "kotlin.jvm.PlatformType", "getMAvatarIv", "()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "mCheckBox", "Landroid/widget/ImageView;", "getMCheckBox", "()Landroid/widget/ImageView;", "mCheckboxHideLeftMargin", "mCheckboxShowLeftMargin", "mContentView", "getMContentView", "()Landroid/view/View;", "mDetailTv", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getMDetailTv", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mIndexTv", "getMIndexTv", "mNameTv", "getMNameTv", "mVerifyIv", "getMVerifyIv", "bind", "item", "preItem", "(Ljava/lang/Object;Ljava/lang/Object;I)V", "getHideCheckboxAnimator", "Landroid/animation/Animator;", "getShowCheckboxAnimator", "hideCheckBox", "showCheckBox", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class BaseSelectViewHolder<ITEM> extends RecyclerView.ViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f52235c;

    /* renamed from: a  reason: collision with root package name */
    private final int f52236a;

    /* renamed from: b  reason: collision with root package name */
    private final int f52237b;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public Function3<? super Integer, ? super Integer, ? super View, Unit> f52238d;

    /* renamed from: e  reason: collision with root package name */
    public final View f52239e = this.itemView.findViewById(C0906R.id.yp);

    /* renamed from: f  reason: collision with root package name */
    public final AvatarImageView f52240f = ((AvatarImageView) this.itemView.findViewById(C0906R.id.i4));
    public final ImageView g = ((ImageView) this.itemView.findViewById(C0906R.id.dr5));
    public final DmtTextView h = ((DmtTextView) this.itemView.findViewById(C0906R.id.bps));
    public final DmtTextView i = ((DmtTextView) this.itemView.findViewById(C0906R.id.a49));
    public final DmtTextView j = ((DmtTextView) this.itemView.findViewById(C0906R.id.au4));
    public final ImageView k = ((ImageView) this.itemView.findViewById(C0906R.id.sc));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "ITEM", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52247a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseSelectViewHolder f52248b;

        a(BaseSelectViewHolder baseSelectViewHolder) {
            this.f52248b = baseSelectViewHolder;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f52247a, false, 53050, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f52247a, false, 53050, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            if (this.f52248b.k != null) {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    int intValue = ((Integer) animatedValue).intValue();
                    ViewGroup.LayoutParams layoutParams = this.f52248b.k.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(intValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        if (Build.VERSION.SDK_INT >= 17) {
                            marginLayoutParams.setMarginStart(intValue);
                        }
                        this.f52248b.k.setLayoutParams(marginLayoutParams);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "ITEM", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseSelectViewHolder f52250b;

        b(BaseSelectViewHolder baseSelectViewHolder) {
            this.f52250b = baseSelectViewHolder;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f52249a, false, 53051, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f52249a, false, 53051, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            if (this.f52250b.k != null) {
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    int intValue = ((Integer) animatedValue).intValue();
                    ViewGroup.LayoutParams layoutParams = this.f52250b.k.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(intValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        if (Build.VERSION.SDK_INT >= 17) {
                            marginLayoutParams.setMarginStart(intValue);
                        }
                        this.f52250b.k.setLayoutParams(marginLayoutParams);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            }
        }
    }

    public abstract void a(ITEM item, @Nullable ITEM item2, int i2);

    @NotNull
    public final Animator a() {
        if (PatchProxy.isSupport(new Object[0], this, f52235c, false, 53043, new Class[0], Animator.class)) {
            return (Animator) PatchProxy.accessDispatch(new Object[0], this, f52235c, false, 53043, new Class[0], Animator.class);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f52237b, this.f52236a});
        ofInt.addUpdateListener(new b(this));
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "showValueAnimator");
        return ofInt;
    }

    @NotNull
    public final Animator b() {
        if (PatchProxy.isSupport(new Object[0], this, f52235c, false, 53044, new Class[0], Animator.class)) {
            return (Animator) PatchProxy.accessDispatch(new Object[0], this, f52235c, false, 53044, new Class[0], Animator.class);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f52236a, this.f52237b});
        ofInt.addUpdateListener(new a(this));
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "hideValueAnimator");
        return ofInt;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f52235c, false, 53045, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52235c, false, 53045, new Class[0], Void.TYPE);
            return;
        }
        ImageView imageView = this.k;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mCheckBox");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (Build.VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginStart(this.f52236a);
            }
            marginLayoutParams.leftMargin = this.f52236a;
            ImageView imageView2 = this.k;
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "mCheckBox");
            imageView2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f52235c, false, 53046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52235c, false, 53046, new Class[0], Void.TYPE);
            return;
        }
        ImageView imageView = this.k;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mCheckBox");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (Build.VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginStart(this.f52237b);
            }
            marginLayoutParams.leftMargin = this.f52237b;
            ImageView imageView2 = this.k;
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "mCheckBox");
            imageView2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseSelectViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        this.f52236a = (int) UIUtils.dip2Px(view2.getContext(), 16.0f);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        this.f52237b = (int) UIUtils.dip2Px(view3.getContext(), -24.0f);
        View view4 = this.f52239e;
        if (view4 != null) {
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            view4.setBackground(c.e(view5.getContext()));
        }
        View view6 = this.f52239e;
        if (view6 != null) {
            view6.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52241a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ BaseSelectViewHolder f52242b;

                {
                    this.f52242b = r1;
                }

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f52241a, false, 53047, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f52241a, false, 53047, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    Function3<? super Integer, ? super Integer, ? super View, Unit> function3 = this.f52242b.f52238d;
                    if (function3 != null) {
                        Integer valueOf = Integer.valueOf(this.f52242b.getAdapterPosition());
                        Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                        function3.invoke(2, valueOf, view);
                    }
                }
            });
        }
        AvatarImageView avatarImageView = this.f52240f;
        if (avatarImageView != null) {
            avatarImageView.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52243a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ BaseSelectViewHolder f52244b;

                {
                    this.f52244b = r1;
                }

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f52243a, false, 53048, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f52243a, false, 53048, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    Function3<? super Integer, ? super Integer, ? super View, Unit> function3 = this.f52244b.f52238d;
                    if (function3 != null) {
                        Integer valueOf = Integer.valueOf(this.f52244b.getAdapterPosition());
                        Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                        function3.invoke(1, valueOf, view);
                    }
                }
            });
        }
        ImageView imageView = this.k;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52245a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ BaseSelectViewHolder f52246b;

                {
                    this.f52246b = r1;
                }

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f52245a, false, 53049, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f52245a, false, 53049, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    Function3<? super Integer, ? super Integer, ? super View, Unit> function3 = this.f52246b.f52238d;
                    if (function3 != null) {
                        Integer valueOf = Integer.valueOf(this.f52246b.getAdapterPosition());
                        Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                        function3.invoke(0, valueOf, view);
                    }
                }
            });
        }
    }
}
