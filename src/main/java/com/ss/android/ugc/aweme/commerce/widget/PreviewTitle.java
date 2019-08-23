package com.ss.android.ugc.aweme.commerce.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commerce.service.logs.f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0002>?B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020 H\u0002J\u0011\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0002\u0010'J\u000e\u0010\u0011\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0012J\u0012\u0010)\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010&H\u0016J\u000e\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\nJ\u000e\u0010-\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0002J\u000e\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020 2\u0006\u00104\u001a\u00020\u0012J\u000e\u00105\u001a\u00020 2\u0006\u00104\u001a\u00020\u0012J\u000e\u00106\u001a\u00020 2\u0006\u00104\u001a\u00020\u0012J\b\u00107\u001a\u00020 H\u0002J\u0016\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0015J\u000e\u0010<\u001a\u00020 2\u0006\u0010=\u001a\u00020\nR\u001a\u0010\f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/widget/PreviewTitle;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentTab", "getCurrentTab", "()I", "setCurrentTab", "(I)V", "hideCart", "", "isTabShown", "lastAlpha", "", "onItemClickListener", "Lcom/ss/android/ugc/aweme/commerce/widget/PreviewTitle$OnItemClickListener;", "showCommentCard", "getShowCommentCard", "()Z", "setShowCommentCard", "(Z)V", "transitionInAnimator", "Landroid/animation/ValueAnimator;", "bindSmallIcon", "", "urlModel", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "dismissTabs", "getCartView", "", "Landroid/view/View;", "()[Landroid/view/View;", "hide", "onClick", "v", "onClickTab", "tab", "setOnItemClickListener", "setStateSelected", "textView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "setStateUnSelected", "setTab", "state", "isShown", "showDetail", "showGuessULike", "showTabs", "updateAlpha", "activity", "Landroid/app/Activity;", "alpha", "updateCartCount", "cartCount", "Companion", "OnItemClickListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PreviewTitle extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38376a = null;

    /* renamed from: f  reason: collision with root package name */
    public static final int f38377f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final a j = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public float f38378b;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f38379c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f38380d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f38381e;
    private int k = 0;
    private b l;
    private boolean m;
    private HashMap n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/widget/PreviewTitle$Companion;", "", "()V", "STATE_COMMENT", "", "getSTATE_COMMENT", "()I", "STATE_DETAIL", "getSTATE_DETAIL", "STATE_GOOD", "getSTATE_GOOD", "STATE_GUESS", "getSTATE_GUESS", "STATE_SHARE", "getSTATE_SHARE", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public static int a() {
            return PreviewTitle.f38377f;
        }

        public static int b() {
            return PreviewTitle.g;
        }

        public static int c() {
            return PreviewTitle.h;
        }

        public static int d() {
            return PreviewTitle.i;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/widget/PreviewTitle$OnItemClickListener;", "", "onBackClick", "", "onCartClick", "onShareClick", "onTabClick", "state", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a();

        void a(int i);

        void b();

        void c();
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f38376a, false, 30223, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f38376a, false, 30223, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.n == null) {
            this.n = new HashMap();
        }
        View view = (View) this.n.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.n.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final int getCurrentTab() {
        return this.k;
    }

    public final boolean getShowCommentCard() {
        return this.m;
    }

    @NotNull
    public final View[] getCartView() {
        if (PatchProxy.isSupport(new Object[0], this, f38376a, false, 30218, new Class[0], View[].class)) {
            return (View[]) PatchProxy.accessDispatch(new Object[0], this, f38376a, false, 30218, new Class[0], View[].class);
        }
        ImageView imageView = (ImageView) a((int) C0906R.id.qu);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "cartBtnBlack");
        ImageView imageView2 = (ImageView) a((int) C0906R.id.qv);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "cartBtnWhite");
        return new View[]{imageView, imageView2};
    }

    public final void setCurrentTab(int i2) {
        this.k = i2;
    }

    public final void setShowCommentCard(boolean z) {
        this.m = z;
    }

    public final void setOnItemClickListener(@NotNull b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f38376a, false, 30209, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f38376a, false, 30209, new Class[]{b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "onItemClickListener");
        this.l = bVar2;
    }

    private void b(int i2) {
        String str;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f38376a, false, 30208, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f38376a, false, 30208, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        f fVar = new f();
        if (i3 == 0) {
            str = "product";
        } else if (i3 == f38377f) {
            str = "unboxing";
        } else if (i3 == i) {
            str = "comment_card";
        } else if (i3 == g) {
            str = "detail";
        } else if (i3 == h) {
            str = "maylike";
        } else {
            str = "";
        }
        fVar.f38128f = str;
        fVar.b();
        b bVar = this.l;
        if (bVar != null) {
            bVar.a(i3);
        }
    }

    private final void setStateSelected(DmtTextView dmtTextView) {
        DmtTextView dmtTextView2 = dmtTextView;
        if (PatchProxy.isSupport(new Object[]{dmtTextView2}, this, f38376a, false, 30220, new Class[]{DmtTextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dmtTextView2}, this, f38376a, false, 30220, new Class[]{DmtTextView.class}, Void.TYPE);
            return;
        }
        dmtTextView2.setTextColor(getResources().getColor(C0906R.color.h));
    }

    private final void setStateUnSelected(DmtTextView dmtTextView) {
        DmtTextView dmtTextView2 = dmtTextView;
        if (PatchProxy.isSupport(new Object[]{dmtTextView2}, this, f38376a, false, 30221, new Class[]{DmtTextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dmtTextView2}, this, f38376a, false, 30221, new Class[]{DmtTextView.class}, Void.TYPE);
            return;
        }
        dmtTextView2.setTextColor(getResources().getColor(C0906R.color.j));
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38376a, false, 30216, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38376a, false, 30216, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.m = z;
        if (z) {
            DmtTextView dmtTextView = (DmtTextView) a((int) C0906R.id.vu);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "commerceTitleComment");
            dmtTextView.setVisibility(0);
            DmtTextView dmtTextView2 = (DmtTextView) a((int) C0906R.id.w0);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "commerceTitleShare");
            dmtTextView2.setVisibility(8);
            return;
        }
        DmtTextView dmtTextView3 = (DmtTextView) a((int) C0906R.id.vu);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "commerceTitleComment");
        dmtTextView3.setVisibility(8);
        DmtTextView dmtTextView4 = (DmtTextView) a((int) C0906R.id.w0);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "commerceTitleShare");
        dmtTextView4.setVisibility(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewTitle(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a7m, this, true);
        View.OnClickListener onClickListener = this;
        ((ImageView) a((int) C0906R.id.iv)).setOnClickListener(onClickListener);
        ((ImageView) a((int) C0906R.id.iw)).setOnClickListener(onClickListener);
        ((ImageView) a((int) C0906R.id.cp4)).setOnClickListener(onClickListener);
        ((ImageView) a((int) C0906R.id.cp5)).setOnClickListener(onClickListener);
        ((DmtTextView) a((int) C0906R.id.vx)).setOnClickListener(onClickListener);
        ((DmtTextView) a((int) C0906R.id.vu)).setOnClickListener(onClickListener);
        ((DmtTextView) a((int) C0906R.id.w0)).setOnClickListener(onClickListener);
        ((DmtTextView) a((int) C0906R.id.vv)).setOnClickListener(onClickListener);
        ((DmtTextView) a((int) C0906R.id.vy)).setOnClickListener(onClickListener);
        ((ImageView) a((int) C0906R.id.qu)).setOnClickListener(onClickListener);
        ((ImageView) a((int) C0906R.id.qv)).setOnClickListener(onClickListener);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{-((float) u.a(44.0d)), 0.0f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "ValueAnimator.ofFloat(-d…Double()).toFloat(), 0F )");
        this.f38379c = ofFloat;
        this.f38379c.setDuration(560);
        this.f38379c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38382a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PreviewTitle f38383b;

            {
                this.f38383b = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ValueAnimator valueAnimator2 = valueAnimator;
                if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f38382a, false, 30225, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f38382a, false, 30225, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    LinearLayout linearLayout = (LinearLayout) this.f38383b.a((int) C0906R.id.d3g);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout, "titleNav");
                    linearLayout.setTranslationY(floatValue);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        });
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38376a, false, 30214, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38376a, false, 30214, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            DmtTextView dmtTextView = (DmtTextView) a((int) C0906R.id.vv);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "commerceTitleDetail");
            dmtTextView.setVisibility(0);
            View a2 = a((int) C0906R.id.vw);
            Intrinsics.checkExpressionValueIsNotNull(a2, "commerceTitleDetailDivider");
            a2.setVisibility(0);
        } else {
            DmtTextView dmtTextView2 = (DmtTextView) a((int) C0906R.id.vv);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "commerceTitleDetail");
            dmtTextView2.setVisibility(8);
            View a3 = a((int) C0906R.id.vw);
            Intrinsics.checkExpressionValueIsNotNull(a3, "commerceTitleDetailDivider");
            a3.setVisibility(8);
        }
        requestLayout();
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38376a, false, 30215, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38376a, false, 30215, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            DmtTextView dmtTextView = (DmtTextView) a((int) C0906R.id.vy);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "commerceTitleGuess");
            dmtTextView.setVisibility(0);
            View a2 = a((int) C0906R.id.vz);
            Intrinsics.checkExpressionValueIsNotNull(a2, "commerceTitleGuessDivider");
            a2.setVisibility(0);
        } else {
            DmtTextView dmtTextView2 = (DmtTextView) a((int) C0906R.id.vy);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "commerceTitleGuess");
            dmtTextView2.setVisibility(8);
            View a3 = a((int) C0906R.id.vz);
            Intrinsics.checkExpressionValueIsNotNull(a3, "commerceTitleGuessDivider");
            a3.setVisibility(8);
        }
    }

    public final void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38376a, false, 30222, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38376a, false, 30222, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f38381e = z;
        if (z) {
            ImageView imageView = (ImageView) a((int) C0906R.id.qu);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "cartBtnBlack");
            imageView.setVisibility(8);
            ImageView imageView2 = (ImageView) a((int) C0906R.id.qv);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "cartBtnWhite");
            imageView2.setVisibility(8);
            DmtTextView dmtTextView = (DmtTextView) a((int) C0906R.id.qw);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "cartMessageTV");
            dmtTextView.setVisibility(8);
            return;
        }
        ImageView imageView3 = (ImageView) a((int) C0906R.id.qu);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "cartBtnBlack");
        imageView3.setVisibility(0);
        ImageView imageView4 = (ImageView) a((int) C0906R.id.qv);
        Intrinsics.checkExpressionValueIsNotNull(imageView4, "cartBtnWhite");
        imageView4.setVisibility(0);
    }

    public final void onClick(@Nullable View view) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{view}, this, f38376a, false, 30207, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38376a, false, 30207, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if ((num != null && num.intValue() == C0906R.id.iv) || (num != null && num.intValue() == C0906R.id.iw)) {
            b bVar = this.l;
            if (bVar != null) {
                bVar.a();
            }
        } else if ((num != null && num.intValue() == C0906R.id.cp4) || (num != null && num.intValue() == C0906R.id.cp5)) {
            b bVar2 = this.l;
            if (bVar2 != null) {
                bVar2.c();
            }
        } else if ((num != null && num.intValue() == C0906R.id.qv) || (num != null && num.intValue() == C0906R.id.qu)) {
            b bVar3 = this.l;
            if (bVar3 != null) {
                bVar3.b();
            }
        } else if (num != null && num.intValue() == C0906R.id.vx) {
            b(0);
        } else if (num != null && num.intValue() == C0906R.id.vu) {
            b(i);
        } else if (num != null && num.intValue() == C0906R.id.w0) {
            b(f38377f);
        } else if (num != null && num.intValue() == C0906R.id.vv) {
            b(g);
        } else if (num != null && num.intValue() == C0906R.id.vy) {
            b(h);
        }
    }

    public final void setTab(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f38376a, false, 30219, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f38376a, false, 30219, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 != this.k) {
            int i3 = this.k;
            if (i3 == 0) {
                DmtTextView dmtTextView = (DmtTextView) a((int) C0906R.id.vx);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "commerceTitleGood");
                setStateUnSelected(dmtTextView);
            } else if (i3 == i) {
                DmtTextView dmtTextView2 = (DmtTextView) a((int) C0906R.id.vu);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "commerceTitleComment");
                setStateUnSelected(dmtTextView2);
            } else if (i3 == f38377f) {
                DmtTextView dmtTextView3 = (DmtTextView) a((int) C0906R.id.w0);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "commerceTitleShare");
                setStateUnSelected(dmtTextView3);
            } else if (i3 == g) {
                DmtTextView dmtTextView4 = (DmtTextView) a((int) C0906R.id.vv);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "commerceTitleDetail");
                setStateUnSelected(dmtTextView4);
            } else if (i3 == h) {
                DmtTextView dmtTextView5 = (DmtTextView) a((int) C0906R.id.vy);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView5, "commerceTitleGuess");
                setStateUnSelected(dmtTextView5);
            }
            if (i2 == 0) {
                DmtTextView dmtTextView6 = (DmtTextView) a((int) C0906R.id.vx);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView6, "commerceTitleGood");
                setStateSelected(dmtTextView6);
            } else if (i2 == i) {
                DmtTextView dmtTextView7 = (DmtTextView) a((int) C0906R.id.vu);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView7, "commerceTitleComment");
                setStateSelected(dmtTextView7);
            } else if (i2 == f38377f) {
                DmtTextView dmtTextView8 = (DmtTextView) a((int) C0906R.id.w0);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView8, "commerceTitleShare");
                setStateSelected(dmtTextView8);
            } else if (i2 == g) {
                DmtTextView dmtTextView9 = (DmtTextView) a((int) C0906R.id.vv);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView9, "commerceTitleDetail");
                setStateSelected(dmtTextView9);
            } else if (i2 == h) {
                DmtTextView dmtTextView10 = (DmtTextView) a((int) C0906R.id.vy);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView10, "commerceTitleGuess");
                setStateSelected(dmtTextView10);
            }
            this.k = i2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewTitle(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a7m, this, true);
        View.OnClickListener onClickListener = this;
        ((ImageView) a((int) C0906R.id.iv)).setOnClickListener(onClickListener);
        ((ImageView) a((int) C0906R.id.iw)).setOnClickListener(onClickListener);
        ((ImageView) a((int) C0906R.id.cp4)).setOnClickListener(onClickListener);
        ((ImageView) a((int) C0906R.id.cp5)).setOnClickListener(onClickListener);
        ((DmtTextView) a((int) C0906R.id.vx)).setOnClickListener(onClickListener);
        ((DmtTextView) a((int) C0906R.id.vu)).setOnClickListener(onClickListener);
        ((DmtTextView) a((int) C0906R.id.w0)).setOnClickListener(onClickListener);
        ((DmtTextView) a((int) C0906R.id.vv)).setOnClickListener(onClickListener);
        ((DmtTextView) a((int) C0906R.id.vy)).setOnClickListener(onClickListener);
        ((ImageView) a((int) C0906R.id.qu)).setOnClickListener(onClickListener);
        ((ImageView) a((int) C0906R.id.qv)).setOnClickListener(onClickListener);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{-((float) u.a(44.0d)), 0.0f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "ValueAnimator.ofFloat(-d…Double()).toFloat(), 0F )");
        this.f38379c = ofFloat;
        this.f38379c.setDuration(560);
        this.f38379c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38382a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PreviewTitle f38383b;

            {
                this.f38383b = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ValueAnimator valueAnimator2 = valueAnimator;
                if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f38382a, false, 30225, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f38382a, false, 30225, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    LinearLayout linearLayout = (LinearLayout) this.f38383b.a((int) C0906R.id.d3g);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout, "titleNav");
                    linearLayout.setTranslationY(floatValue);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        });
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewTitle(@NotNull Context context, @NotNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a7m, this, true);
        View.OnClickListener onClickListener = this;
        ((ImageView) a((int) C0906R.id.iv)).setOnClickListener(onClickListener);
        ((ImageView) a((int) C0906R.id.iw)).setOnClickListener(onClickListener);
        ((ImageView) a((int) C0906R.id.cp4)).setOnClickListener(onClickListener);
        ((ImageView) a((int) C0906R.id.cp5)).setOnClickListener(onClickListener);
        ((DmtTextView) a((int) C0906R.id.vx)).setOnClickListener(onClickListener);
        ((DmtTextView) a((int) C0906R.id.vu)).setOnClickListener(onClickListener);
        ((DmtTextView) a((int) C0906R.id.w0)).setOnClickListener(onClickListener);
        ((DmtTextView) a((int) C0906R.id.vv)).setOnClickListener(onClickListener);
        ((DmtTextView) a((int) C0906R.id.vy)).setOnClickListener(onClickListener);
        ((ImageView) a((int) C0906R.id.qu)).setOnClickListener(onClickListener);
        ((ImageView) a((int) C0906R.id.qv)).setOnClickListener(onClickListener);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{-((float) u.a(44.0d)), 0.0f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "ValueAnimator.ofFloat(-d…Double()).toFloat(), 0F )");
        this.f38379c = ofFloat;
        this.f38379c.setDuration(560);
        this.f38379c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38382a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PreviewTitle f38383b;

            {
                this.f38383b = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ValueAnimator valueAnimator2 = valueAnimator;
                if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f38382a, false, 30225, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f38382a, false, 30225, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    LinearLayout linearLayout = (LinearLayout) this.f38383b.a((int) C0906R.id.d3g);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout, "titleNav");
                    linearLayout.setTranslationY(floatValue);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        });
    }
}
