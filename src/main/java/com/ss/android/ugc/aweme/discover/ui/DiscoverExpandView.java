package com.ss.android.ugc.aweme.discover.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.HollowTextView;
import com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandAdapter;
import com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002:\u0006\u0001\u0001\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u0011J\b\u0010g\u001a\u00020\bH\u0002J\b\u0010h\u001a\u00020\bH\u0002J\b\u0010i\u001a\u00020\bH\u0002J\b\u0010j\u001a\u00020eH\u0002J\b\u0010k\u001a\u00020eH\u0002J\b\u0010l\u001a\u00020eH\u0002J\u001a\u0010m\u001a\u00020e2\b\u0010n\u001a\u0004\u0018\u00010N2\u0006\u0010o\u001a\u00020\bH\u0016J\u0018\u0010p\u001a\u00020e2\u0006\u0010q\u001a\u00020\b2\u0006\u0010r\u001a\u00020\bH\u0014J\u0006\u0010s\u001a\u00020eJ\u0012\u0010t\u001a\u00020e2\b\u0010u\u001a\u0004\u0018\u00010#H\u0002J$\u0010t\u001a\u00020e2\b\u0010u\u001a\u0004\u0018\u00010#2\b\u0010v\u001a\u0004\u0018\u00010#2\b\u0010w\u001a\u0004\u0018\u00010#J\b\u0010x\u001a\u00020eH\u0002J\u0016\u0010y\u001a\u00020e2\u000e\u0010z\u001a\n\u0012\u0004\u0012\u00020|\u0018\u00010{J\u000e\u0010}\u001a\u00020e2\u0006\u0010~\u001a\u00020\u0011J\u001c\u0010\u001a\u00020e2\b\u0010v\u001a\u0004\u0018\u00010#2\b\u0010w\u001a\u0004\u0018\u00010#H\u0002J\u0010\u0010\u0001\u001a\u00020e2\u0007\u0010\u0001\u001a\u00020\bJ\u0012\u0010\u0001\u001a\u00020e2\t\u0010\u0001\u001a\u0004\u0018\u00010#J\t\u0010\u0001\u001a\u00020eH\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u000e\u0010!\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u000e\u0010-\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010'\"\u0004\b6\u0010)R\u000e\u00107\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u00108\u001a\u0004\u0018\u000109X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010>\u001a\u0004\u0018\u000109X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R\u001c\u0010A\u001a\u0004\u0018\u000109X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010;\"\u0004\bC\u0010=R\u001c\u0010D\u001a\u0004\u0018\u00010EX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001c\u0010J\u001a\u0004\u0018\u000109X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010;\"\u0004\bL\u0010=R\u001c\u0010M\u001a\u0004\u0018\u00010NX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001c\u0010S\u001a\u0004\u0018\u00010TX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010Y\u001a\u0004\u0018\u00010ZX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001c\u0010_\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010c¨\u0006\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/DiscoverExpandView;", "Landroid/widget/RelativeLayout;", "Lcom/ss/android/ugc/aweme/discover/adapter/DiscoverExpandViewHolder$OnItemClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentPositionProvider", "Lcom/ss/android/ugc/aweme/discover/ui/DiscoverExpandView$CurrentPositionProvider;", "getCurrentPositionProvider", "()Lcom/ss/android/ugc/aweme/discover/ui/DiscoverExpandView$CurrentPositionProvider;", "setCurrentPositionProvider", "(Lcom/ss/android/ugc/aweme/discover/ui/DiscoverExpandView$CurrentPositionProvider;)V", "isExpanded", "", "()Z", "setExpanded", "(Z)V", "mAniming", "mDiscoverExpandAdapter", "Lcom/ss/android/ugc/aweme/discover/adapter/DiscoverExpandAdapter;", "mIvwArrow", "Landroid/widget/ImageView;", "getMIvwArrow", "()Landroid/widget/ImageView;", "setMIvwArrow", "(Landroid/widget/ImageView;)V", "mIvwClose", "getMIvwClose", "setMIvwClose", "mLastMaxHeight", "mLinkUrl", "", "mLltCardContainer", "Landroid/view/ViewGroup;", "getMLltCardContainer", "()Landroid/view/ViewGroup;", "setMLltCardContainer", "(Landroid/view/ViewGroup;)V", "mLltDetailContainer", "getMLltDetailContainer", "setMLltDetailContainer", "mMaxHeight", "mRcvCardContainer", "Landroid/support/v7/widget/RecyclerView;", "getMRcvCardContainer", "()Landroid/support/v7/widget/RecyclerView;", "setMRcvCardContainer", "(Landroid/support/v7/widget/RecyclerView;)V", "mRltExpandContainer", "getMRltExpandContainer", "setMRltExpandContainer", "mStartHeight", "mTvwContent", "Landroid/widget/TextView;", "getMTvwContent", "()Landroid/widget/TextView;", "setMTvwContent", "(Landroid/widget/TextView;)V", "mTvwCounts", "getMTvwCounts", "setMTvwCounts", "mTvwLink", "getMTvwLink", "setMTvwLink", "mTvwTag", "Lcom/ss/android/ugc/aweme/base/ui/HollowTextView;", "getMTvwTag", "()Lcom/ss/android/ugc/aweme/base/ui/HollowTextView;", "setMTvwTag", "(Lcom/ss/android/ugc/aweme/base/ui/HollowTextView;)V", "mTvwTitle", "getMTvwTitle", "setMTvwTitle", "mVwLineDivider", "Landroid/view/View;", "getMVwLineDivider", "()Landroid/view/View;", "setMVwLineDivider", "(Landroid/view/View;)V", "onButtonClickListener", "Lcom/ss/android/ugc/aweme/discover/ui/DiscoverExpandView$OnButtonClickListener;", "getOnButtonClickListener", "()Lcom/ss/android/ugc/aweme/discover/ui/DiscoverExpandView$OnButtonClickListener;", "setOnButtonClickListener", "(Lcom/ss/android/ugc/aweme/discover/ui/DiscoverExpandView$OnButtonClickListener;)V", "onExpandStatusChangeLisenter", "Lcom/ss/android/ugc/aweme/discover/ui/DiscoverExpandView$OnExpandStatusChangeLisenter;", "getOnExpandStatusChangeLisenter", "()Lcom/ss/android/ugc/aweme/discover/ui/DiscoverExpandView$OnExpandStatusChangeLisenter;", "setOnExpandStatusChangeLisenter", "(Lcom/ss/android/ugc/aweme/discover/ui/DiscoverExpandView$OnExpandStatusChangeLisenter;)V", "onItemClickListener", "getOnItemClickListener", "()Lcom/ss/android/ugc/aweme/discover/adapter/DiscoverExpandViewHolder$OnItemClickListener;", "setOnItemClickListener", "(Lcom/ss/android/ugc/aweme/discover/adapter/DiscoverExpandViewHolder$OnItemClickListener;)V", "expand", "", "showClose", "getContentHeight", "getContentWidth", "getLinkHeight", "init", "initCardList", "initViews", "onItemClick", "view", "position", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "retract", "setContent", "content", "linkText", "linkUrl", "setContentTextHeight", "setData", "awemes", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setIsRecommend", "isRecommend", "setLink", "setMaxHeight", "maxHeight", "setTitle", "title", "toggleExpand", "CurrentPositionProvider", "OnButtonClickListener", "OnExpandStatusChangeLisenter", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DiscoverExpandView extends RelativeLayout implements DiscoverExpandViewHolder.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42830a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    TextView f42831b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    View f42832c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f42833d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f42834e;

    /* renamed from: f  reason: collision with root package name */
    public int f42835f;
    public int g;
    public String h;
    public DiscoverExpandAdapter i;
    @Nullable
    private TextView j;
    @Nullable
    private TextView k;
    @Nullable
    private TextView l;
    @Nullable
    private HollowTextView m;
    @Nullable
    private ImageView n;
    @Nullable
    private ImageView o;
    @Nullable
    private ViewGroup p;
    @Nullable
    private ViewGroup q;
    @Nullable
    private ViewGroup r;
    @Nullable
    private RecyclerView s;
    @Nullable
    private DiscoverExpandViewHolder.b t;
    @Nullable
    private a u;
    @Nullable
    private c v;
    @Nullable
    private b w;
    private int x;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/DiscoverExpandView$CurrentPositionProvider;", "", "getCurrentPosition", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        int a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/DiscoverExpandView$OnButtonClickListener;", "", "onBtnCloseClick", "", "onBtnLinkClick", "link", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a();

        void a(@Nullable String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/DiscoverExpandView$OnExpandStatusChangeLisenter;", "", "onExpandStatusChange", "", "isExpanded", "", "isAuto", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface c {
        void a(boolean z, boolean z2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoverExpandView f42837b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f42838c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f42839d;

        d(DiscoverExpandView discoverExpandView, boolean z, int i) {
            this.f42837b = discoverExpandView;
            this.f42838c = z;
            this.f42839d = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f42836a, false, 37488, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f42836a, false, 37488, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                if (!this.f42838c) {
                    ImageView mIvwClose = this.f42837b.getMIvwClose();
                    if (mIvwClose != null) {
                        mIvwClose.setAlpha(1.0f - floatValue);
                    }
                }
                ImageView mIvwArrow = this.f42837b.getMIvwArrow();
                if (mIvwArrow != null) {
                    mIvwArrow.setRotation(180.0f * floatValue);
                }
                ViewGroup mLltDetailContainer = this.f42837b.getMLltDetailContainer();
                if (mLltDetailContainer != null) {
                    mLltDetailContainer.setAlpha(floatValue);
                }
                ViewGroup mLltCardContainer = this.f42837b.getMLltCardContainer();
                if (mLltCardContainer != null) {
                    mLltCardContainer.setAlpha(floatValue);
                }
                ViewGroup mLltCardContainer2 = this.f42837b.getMLltCardContainer();
                if (mLltCardContainer2 != null) {
                    ViewGroup.LayoutParams layoutParams = mLltCardContainer2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = (int) (((float) (this.f42837b.g - this.f42837b.f42835f)) * floatValue);
                    }
                }
                ViewGroup mLltDetailContainer2 = this.f42837b.getMLltDetailContainer();
                if (mLltDetailContainer2 != null) {
                    ViewGroup.LayoutParams layoutParams2 = mLltDetailContainer2.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = (int) (((float) this.f42839d) * floatValue);
                    }
                }
                ViewGroup mLltDetailContainer3 = this.f42837b.getMLltDetailContainer();
                if (mLltDetailContainer3 != null) {
                    mLltDetailContainer3.requestLayout();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/discover/ui/DiscoverExpandView$expand$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42840a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoverExpandView f42841b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f42842c;

        public final void onAnimationEnd(@NotNull Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f42840a, false, 37489, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f42840a, false, 37489, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f42841b.f42834e = false;
            if (!this.f42842c) {
                ImageView mIvwClose = this.f42841b.getMIvwClose();
                if (mIvwClose != null) {
                    mIvwClose.setVisibility(8);
                }
            }
        }

        e(DiscoverExpandView discoverExpandView, boolean z) {
            this.f42841b = discoverExpandView;
            this.f42842c = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42843a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoverExpandView f42844b;

        f(DiscoverExpandView discoverExpandView) {
            this.f42844b = discoverExpandView;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f42843a, false, 37491, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42843a, false, 37491, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f42844b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42845a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoverExpandView f42846b;

        g(DiscoverExpandView discoverExpandView) {
            this.f42846b = discoverExpandView;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f42845a, false, 37492, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42845a, false, 37492, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f42846b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42847a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoverExpandView f42848b;

        h(DiscoverExpandView discoverExpandView) {
            this.f42848b = discoverExpandView;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f42847a, false, 37493, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42847a, false, 37493, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            b onButtonClickListener = this.f42848b.getOnButtonClickListener();
            if (onButtonClickListener != null) {
                onButtonClickListener.a(this.f42848b.h);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42849a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoverExpandView f42850b;

        i(DiscoverExpandView discoverExpandView) {
            this.f42850b = discoverExpandView;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f42849a, false, 37494, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42849a, false, 37494, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            b onButtonClickListener = this.f42850b.getOnButtonClickListener();
            if (onButtonClickListener != null) {
                onButtonClickListener.a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42853a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoverExpandView f42854b;

        j(DiscoverExpandView discoverExpandView) {
            this.f42854b = discoverExpandView;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f42853a, false, 37495, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42853a, false, 37495, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f42854b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class k implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42855a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoverExpandView f42856b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42857c;

        k(DiscoverExpandView discoverExpandView, int i) {
            this.f42856b = discoverExpandView;
            this.f42857c = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f42855a, false, 37496, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f42855a, false, 37496, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                ImageView mIvwClose = this.f42856b.getMIvwClose();
                if (mIvwClose != null) {
                    mIvwClose.setAlpha(1.0f - floatValue);
                }
                ImageView mIvwArrow = this.f42856b.getMIvwArrow();
                if (mIvwArrow != null) {
                    mIvwArrow.setRotation(180.0f * floatValue);
                }
                ViewGroup mLltDetailContainer = this.f42856b.getMLltDetailContainer();
                if (mLltDetailContainer != null) {
                    mLltDetailContainer.setAlpha(floatValue);
                }
                ViewGroup mLltCardContainer = this.f42856b.getMLltCardContainer();
                if (mLltCardContainer != null) {
                    mLltCardContainer.setAlpha(floatValue);
                }
                ViewGroup mLltCardContainer2 = this.f42856b.getMLltCardContainer();
                if (mLltCardContainer2 != null) {
                    ViewGroup.LayoutParams layoutParams = mLltCardContainer2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = (int) (((float) (this.f42856b.g - this.f42856b.f42835f)) * floatValue);
                    }
                }
                ViewGroup mLltDetailContainer2 = this.f42856b.getMLltDetailContainer();
                if (mLltDetailContainer2 != null) {
                    ViewGroup.LayoutParams layoutParams2 = mLltDetailContainer2.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = (int) (((float) this.f42857c) * floatValue);
                    }
                }
                ViewGroup mLltDetailContainer3 = this.f42856b.getMLltDetailContainer();
                if (mLltDetailContainer3 != null) {
                    mLltDetailContainer3.requestLayout();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/discover/ui/DiscoverExpandView$retract$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class l extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42858a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoverExpandView f42859b;

        l(DiscoverExpandView discoverExpandView) {
            this.f42859b = discoverExpandView;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f42858a, false, 37497, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f42858a, false, 37497, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            ViewGroup mLltCardContainer = this.f42859b.getMLltCardContainer();
            if (mLltCardContainer != null) {
                mLltCardContainer.setVisibility(8);
            }
            ViewGroup mLltDetailContainer = this.f42859b.getMLltDetailContainer();
            if (mLltDetailContainer != null) {
                mLltDetailContainer.setVisibility(8);
            }
            this.f42859b.setBackgroundColor(0);
            this.f42859b.f42834e = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42860a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoverExpandView f42861b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f42862c;

        m(DiscoverExpandView discoverExpandView, String str) {
            this.f42861b = discoverExpandView;
            this.f42862c = str;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f42860a, false, 37498, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42860a, false, 37498, new Class[0], Void.TYPE);
                return;
            }
            this.f42861b.setTitle(this.f42862c);
        }
    }

    @JvmOverloads
    public DiscoverExpandView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public DiscoverExpandView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Nullable
    public final a getCurrentPositionProvider() {
        return this.u;
    }

    @Nullable
    public final ImageView getMIvwArrow() {
        return this.o;
    }

    @Nullable
    public final ImageView getMIvwClose() {
        return this.n;
    }

    @Nullable
    public final ViewGroup getMLltCardContainer() {
        return this.p;
    }

    @Nullable
    public final ViewGroup getMLltDetailContainer() {
        return this.q;
    }

    @Nullable
    public final RecyclerView getMRcvCardContainer() {
        return this.s;
    }

    @Nullable
    public final ViewGroup getMRltExpandContainer() {
        return this.r;
    }

    @Nullable
    public final TextView getMTvwContent() {
        return this.j;
    }

    @Nullable
    public final TextView getMTvwCounts() {
        return this.l;
    }

    @Nullable
    public final TextView getMTvwLink() {
        return this.f42831b;
    }

    @Nullable
    public final HollowTextView getMTvwTag() {
        return this.m;
    }

    @Nullable
    public final TextView getMTvwTitle() {
        return this.k;
    }

    @Nullable
    public final View getMVwLineDivider() {
        return this.f42832c;
    }

    @Nullable
    public final b getOnButtonClickListener() {
        return this.w;
    }

    @Nullable
    public final c getOnExpandStatusChangeLisenter() {
        return this.v;
    }

    @Nullable
    public final DiscoverExpandViewHolder.b getOnItemClickListener() {
        return this.t;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f42830a, false, 37483, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42830a, false, 37483, new Class[0], Void.TYPE);
        } else if (this.f42833d) {
            b();
        } else {
            a(false);
        }
    }

    private final int getContentHeight() {
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f42830a, false, 37478, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42830a, false, 37478, new Class[0], Integer.TYPE)).intValue();
        }
        TextView textView = this.j;
        if (textView != null) {
            i2 = textView.getMeasuredHeight();
        } else {
            i2 = 0;
        }
        View view = this.f42832c;
        if (view != null) {
            i3 = view.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        int i5 = i2 + i3;
        TextView textView2 = this.f42831b;
        if (textView2 != null) {
            i4 = textView2.getMeasuredHeight();
        }
        int i6 = i5 + i4;
        TextView textView3 = this.f42831b;
        if (textView3 != null) {
            layoutParams = textView3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            return i6 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    private final int getLinkHeight() {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f42830a, false, 37479, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42830a, false, 37479, new Class[0], Integer.TYPE)).intValue();
        }
        View view = this.f42832c;
        if (view != null) {
            i2 = view.getMeasuredHeight();
        } else {
            i2 = 0;
        }
        TextView textView = this.f42831b;
        if (textView != null) {
            i3 = textView.getMeasuredHeight();
        }
        int i4 = i2 + i3;
        TextView textView2 = this.f42831b;
        if (textView2 != null) {
            layoutParams = textView2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            return i4 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f42830a, false, 37484, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42830a, false, 37484, new Class[0], Void.TYPE);
        } else if (!this.f42834e) {
            setClickable(false);
            this.f42834e = true;
            c cVar = this.v;
            if (cVar != null) {
                cVar.a(false, false);
            }
            int contentHeight = getContentHeight();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "valueAnimator");
            ofFloat.setDuration(300);
            ImageView imageView = this.n;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ofFloat.addUpdateListener(new k(this, contentHeight));
            ofFloat.addListener(new l(this));
            ofFloat.start();
            this.f42833d = false;
        }
    }

    private final void c() {
        Integer num;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f42830a, false, 37476, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42830a, false, 37476, new Class[0], Void.TYPE);
        } else if (this.g != 0) {
            int contentWidth = getContentWidth();
            TextView textView = this.f42831b;
            if (textView != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(contentWidth, 1073741824);
                TextView textView2 = this.f42831b;
                if (textView2 != null) {
                    ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                    if (layoutParams != null) {
                        i2 = layoutParams.height;
                        textView.measure(makeMeasureSpec, i2);
                    }
                }
                i2 = 0;
                textView.measure(makeMeasureSpec, i2);
            }
            View view = this.f42832c;
            if (view != null) {
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(contentWidth, 1073741824);
                View view2 = this.f42832c;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 != null) {
                        i3 = layoutParams2.height;
                    }
                }
                view.measure(makeMeasureSpec2, i3);
            }
            TextView textView3 = this.j;
            if (textView3 != null) {
                textView3.measure(View.MeasureSpec.makeMeasureSpec(contentWidth, 1073741824), View.MeasureSpec.makeMeasureSpec((this.g - this.f42835f) - getLinkHeight(), Integer.MIN_VALUE));
            }
            TextView textView4 = this.j;
            if (textView4 != null) {
                ViewGroup.LayoutParams layoutParams3 = textView4.getLayoutParams();
                if (layoutParams3 != null) {
                    TextView textView5 = this.j;
                    if (textView5 != null) {
                        num = Integer.valueOf(textView5.getMeasuredHeight());
                    } else {
                        num = null;
                    }
                    layoutParams3.height = num.intValue();
                }
            }
        }
    }

    private final int getContentWidth() {
        ViewGroup.LayoutParams layoutParams;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f42830a, false, 37477, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42830a, false, 37477, new Class[0], Integer.TYPE)).intValue();
        }
        ViewGroup viewGroup = this.p;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (viewGroup != null) {
            layoutParams = viewGroup.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ViewGroup viewGroup2 = this.q;
            if (viewGroup2 != null) {
                layoutParams2 = viewGroup2.getLayoutParams();
            }
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                int size = View.MeasureSpec.getSize(marginLayoutParams.width) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredWidth = getMeasuredWidth();
                ViewGroup viewGroup3 = this.r;
                if (viewGroup3 != null) {
                    i2 = viewGroup3.getPaddingLeft();
                } else {
                    i2 = 0;
                }
                int i4 = measuredWidth - i2;
                ViewGroup viewGroup4 = this.r;
                if (viewGroup4 != null) {
                    i3 = viewGroup4.getPaddingRight();
                }
                return (((i4 - i3) - size) - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void setCurrentPositionProvider(@Nullable a aVar) {
        this.u = aVar;
    }

    public final void setExpanded(boolean z) {
        this.f42833d = z;
    }

    public final void setMIvwArrow(@Nullable ImageView imageView) {
        this.o = imageView;
    }

    public final void setMIvwClose(@Nullable ImageView imageView) {
        this.n = imageView;
    }

    public final void setMLltCardContainer(@Nullable ViewGroup viewGroup) {
        this.p = viewGroup;
    }

    public final void setMLltDetailContainer(@Nullable ViewGroup viewGroup) {
        this.q = viewGroup;
    }

    public final void setMRcvCardContainer(@Nullable RecyclerView recyclerView) {
        this.s = recyclerView;
    }

    public final void setMRltExpandContainer(@Nullable ViewGroup viewGroup) {
        this.r = viewGroup;
    }

    public final void setMTvwContent(@Nullable TextView textView) {
        this.j = textView;
    }

    public final void setMTvwCounts(@Nullable TextView textView) {
        this.l = textView;
    }

    public final void setMTvwLink(@Nullable TextView textView) {
        this.f42831b = textView;
    }

    public final void setMTvwTag(@Nullable HollowTextView hollowTextView) {
        this.m = hollowTextView;
    }

    public final void setMTvwTitle(@Nullable TextView textView) {
        this.k = textView;
    }

    public final void setMVwLineDivider(@Nullable View view) {
        this.f42832c = view;
    }

    public final void setOnButtonClickListener(@Nullable b bVar) {
        this.w = bVar;
    }

    public final void setOnExpandStatusChangeLisenter(@Nullable c cVar) {
        this.v = cVar;
    }

    public final void setOnItemClickListener(@Nullable DiscoverExpandViewHolder.b bVar) {
        this.t = bVar;
    }

    /* access modifiers changed from: package-private */
    public final void setContent(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f42830a, false, 37475, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f42830a, false, 37475, new Class[]{String.class}, Void.TYPE);
            return;
        }
        TextView textView = this.j;
        if (textView != null) {
            textView.setText(str);
        }
        c();
    }

    public final void setIsRecommend(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42830a, false, 37473, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42830a, false, 37473, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        HollowTextView hollowTextView = this.m;
        if (hollowTextView != null) {
            if (!z) {
                i2 = 8;
            }
            hollowTextView.setVisibility(i2);
        }
    }

    public final void setMaxHeight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f42830a, false, 37470, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f42830a, false, 37470, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = i2;
        requestLayout();
    }

    public final void a(boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42830a, false, 37485, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42830a, false, 37485, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!this.f42834e) {
            setBackgroundColor(g.a());
            setClickable(true);
            DiscoverExpandAdapter discoverExpandAdapter = this.i;
            if (discoverExpandAdapter != null) {
                a aVar = this.u;
                if (aVar != null) {
                    i2 = aVar.a();
                } else {
                    i2 = 0;
                }
                discoverExpandAdapter.a(i2, false);
            }
            int contentHeight = getContentHeight();
            c cVar = this.v;
            if (cVar != null) {
                cVar.a(true, z);
            }
            this.f42834e = true;
            ViewGroup viewGroup = this.p;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = this.q;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "valueAnimator");
            ofFloat.setDuration(300);
            ofFloat.addUpdateListener(new d(this, z, contentHeight));
            ofFloat.addListener(new e(this, z));
            ofFloat.start();
            if (z) {
                ImageView imageView = this.n;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            }
            this.f42833d = true;
        }
    }

    public final void setData(@Nullable List<Aweme> list) {
        int i2;
        List<Aweme> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f42830a, false, 37474, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f42830a, false, 37474, new Class[]{List.class}, Void.TYPE);
            return;
        }
        DiscoverExpandAdapter discoverExpandAdapter = this.i;
        if (discoverExpandAdapter != null) {
            if (PatchProxy.isSupport(new Object[]{list2}, discoverExpandAdapter, DiscoverExpandAdapter.f41594a, false, 35562, new Class[]{List.class}, Void.TYPE)) {
                DiscoverExpandAdapter discoverExpandAdapter2 = discoverExpandAdapter;
                PatchProxy.accessDispatch(new Object[]{list2}, discoverExpandAdapter2, DiscoverExpandAdapter.f41594a, false, 35562, new Class[]{List.class}, Void.TYPE);
            } else {
                discoverExpandAdapter.f41597d = list2;
                discoverExpandAdapter.f41595b = 0;
                discoverExpandAdapter.notifyDataSetChanged();
            }
        }
        TextView textView = this.l;
        if (textView != null) {
            Context context = getContext();
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            if (list2 != null) {
                i2 = Integer.valueOf(list.size());
            } else {
                i2 = 0;
            }
            sb.append(i2);
            objArr[0] = sb.toString();
            textView.setText(context.getString(C0906R.string.bfa, objArr));
        }
    }

    public final void setTitle(@Nullable String str) {
        ViewGroup.LayoutParams layoutParams;
        boolean z;
        String str2;
        boolean z2;
        int i2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, this, f42830a, false, 37471, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3}, this, f42830a, false, 37471, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.r != null) {
            ViewGroup viewGroup = this.r;
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            if (viewGroup.getMeasuredWidth() != 0) {
                TextView textView = this.k;
                if (textView != null) {
                    layoutParams = textView.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    ViewGroup viewGroup2 = this.r;
                    if (viewGroup2 == null) {
                        Intrinsics.throwNpe();
                    }
                    int measuredWidth = viewGroup2.getMeasuredWidth();
                    ViewGroup viewGroup3 = this.r;
                    if (viewGroup3 == null) {
                        Intrinsics.throwNpe();
                    }
                    int paddingRight = measuredWidth - viewGroup3.getPaddingRight();
                    ViewGroup viewGroup4 = this.r;
                    if (viewGroup4 == null) {
                        Intrinsics.throwNpe();
                    }
                    int paddingLeft = ((paddingRight - viewGroup4.getPaddingLeft()) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
                    CharSequence charSequence = str3;
                    if (charSequence == null || charSequence.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str2 = str3;
                    } else if (str3 != null) {
                        str2 = StringsKt.trim(charSequence).toString();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                    CharSequence charSequence2 = str2;
                    if (charSequence2 == null || charSequence2.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        str2 = " ";
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                    spannableStringBuilder.append(" ");
                    aj ajVar = new aj(this.k, this.o, 17, true, true);
                    ajVar.f43117b = (int) UIUtils.dip2Px(getContext(), 8.0f);
                    spannableStringBuilder.setSpan(ajVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 18);
                    TextView textView2 = this.k;
                    if (textView2 != null) {
                        i2 = textView2.getMaxLines();
                    } else {
                        i2 = 1;
                    }
                    SpannableStringBuilder a2 = com.ss.android.ugc.aweme.hotsearch.d.h.a(spannableStringBuilder, textView2, paddingLeft, i2, 1, ajVar.a(), false, this.o, false);
                    Intrinsics.checkExpressionValueIsNotNull(a2, "TagUtil.ellipsizeText2Ex… false, mIvwArrow, false)");
                    TextView textView3 = this.k;
                    if (textView3 != null) {
                        textView3.setText(a2);
                    }
                    this.f42835f = 0;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        post(new m(this, str3));
    }

    public final void a(@Nullable View view, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2)}, this, f42830a, false, 37468, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2)}, this, f42830a, false, 37468, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a();
        DiscoverExpandViewHolder.b bVar = this.t;
        if (bVar != null) {
            bVar.a(view2, i2);
        }
    }

    public final void onMeasure(int i2, int i3) {
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f42830a, false, 37469, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f42830a, false, 37469, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        if (this.f42835f == 0 || !(this.g == 0 || this.x == this.g)) {
            if (this.f42835f == 0) {
                ViewGroup viewGroup = this.r;
                if (viewGroup != null) {
                    i4 = viewGroup.getMeasuredHeight();
                }
                this.f42835f = i4;
            }
            RecyclerView recyclerView = this.s;
            if (recyclerView != null) {
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = this.g - this.f42835f;
                }
            }
            this.x = this.g;
            c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DiscoverExpandView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (PatchProxy.isSupport(new Object[0], this, f42830a, false, 37482, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42830a, false, 37482, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f42830a, false, 37467, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42830a, false, 37467, new Class[0], Void.TYPE);
        } else {
            LayoutInflater.from(getContext()).inflate(C0906R.layout.a37, this, true);
            this.j = (TextView) findViewById(C0906R.id.dlt);
            this.k = (TextView) findViewById(C0906R.id.dm3);
            this.l = (TextView) findViewById(C0906R.id.dlu);
            this.f42831b = (TextView) findViewById(C0906R.id.dlx);
            this.n = (ImageView) findViewById(C0906R.id.b6j);
            this.o = (ImageView) findViewById(C0906R.id.b6i);
            this.p = (ViewGroup) findViewById(C0906R.id.bim);
            this.q = (ViewGroup) findViewById(C0906R.id.bin);
            this.r = (ViewGroup) findViewById(C0906R.id.cgu);
            this.f42832c = findViewById(C0906R.id.dw3);
            this.s = (RecyclerView) findViewById(C0906R.id.ca9);
            this.m = (HollowTextView) findViewById(C0906R.id.dm2);
            ImageView imageView = this.o;
            if (imageView != null) {
                imageView.setOnClickListener(new f(this));
            }
            TextView textView = this.k;
            if (textView != null) {
                textView.setOnClickListener(new g(this));
            }
            TextView textView2 = this.f42831b;
            if (textView2 != null) {
                textView2.setOnClickListener(new h(this));
            }
            ImageView imageView2 = this.n;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new i(this));
            }
            setOnClickListener(new j(this));
            this.i = new DiscoverExpandAdapter(null, this);
            RecyclerView recyclerView = this.s;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.i);
            }
            setClickable(false);
            if (this.r != null && Build.VERSION.SDK_INT >= 19) {
                int statusBarHeight = StatusBarUtils.getStatusBarHeight(getContext());
                ViewGroup viewGroup = this.r;
                if (viewGroup == null) {
                    Intrinsics.throwNpe();
                }
                ViewGroup viewGroup2 = this.r;
                if (viewGroup2 == null) {
                    Intrinsics.throwNpe();
                }
                int paddingLeft = viewGroup2.getPaddingLeft();
                ViewGroup viewGroup3 = this.r;
                if (viewGroup3 == null) {
                    Intrinsics.throwNpe();
                }
                int paddingTop = viewGroup3.getPaddingTop() + statusBarHeight;
                ViewGroup viewGroup4 = this.r;
                if (viewGroup4 == null) {
                    Intrinsics.throwNpe();
                }
                int paddingRight = viewGroup4.getPaddingRight();
                ViewGroup viewGroup5 = this.r;
                if (viewGroup5 == null) {
                    Intrinsics.throwNpe();
                }
                viewGroup.setPadding(paddingLeft, paddingTop, paddingRight, viewGroup5.getPaddingBottom());
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f42830a, false, 37481, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42830a, false, 37481, new Class[0], Void.TYPE);
            return;
        }
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        RecyclerView recyclerView3 = this.s;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new DiscoverExpandView$initCardList$1(this));
        }
        RecyclerView recyclerView4 = this.s;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(this.i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiscoverExpandView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
