package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010.\u001a\u00020\u0013H\u0002J\b\u0010/\u001a\u00020\u0013H\u0002J\u0006\u00100\u001a\u00020\u0013J\u000e\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u00020\u0013J\u0010\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u001cH\u0002J\u0006\u00107\u001a\u00020\u0013J\b\u00108\u001a\u00020\u0013H\u0016J\u0018\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u00020\u00132\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010?\u001a\u00020\u0013H\u0002J\b\u0010@\u001a\u00020\u0013H\u0002J\b\u0010A\u001a\u00020\u0013H\u0002J\b\u0010B\u001a\u00020\u0013H\u0002J\u000e\u0010C\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\u001eJ\b\u0010E\u001a\u00020\u0013H\u0002J\u0012\u0010F\u001a\u00020\u00132\b\u0010G\u001a\u0004\u0018\u00010;H\u0016J\b\u0010H\u001a\u00020\u0013H\u0002J\b\u0010I\u001a\u00020\u0013H\u0002J\u000e\u0010J\u001a\u00020\u00132\u0006\u0010K\u001a\u00020\u000bJ\u001a\u0010L\u001a\u00020\u00132\b\u0010:\u001a\u0004\u0018\u00010\u000f2\u0006\u00106\u001a\u00020\u001cH\u0016J\u0016\u0010M\u001a\u00020\u00132\u0006\u0010N\u001a\u0002032\u0006\u00102\u001a\u000203J\b\u0010O\u001a\u00020\u0013H\u0002J\u000e\u0010P\u001a\u00020\u001e2\u0006\u0010Q\u001a\u00020\u000bR9\u0010\r\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0001X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R9\u0010&\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010\u0017R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130*X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0001X.¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VotingStickerLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VotingStickerInterface;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "beforeChangeListener", "Lkotlin/Function1;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VotingStickerView;", "Lkotlin/ParameterName;", "name", "votingStickerView", "", "getBeforeChangeListener", "()Lkotlin/jvm/functions/Function1;", "setBeforeChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "container", "deltaPointF", "Landroid/graphics/PointF;", "inAnimatorInfo", "Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/AnimatorInfo;", "isDismissing", "", "isInResumeMode", "isShowing", "keyboardHeight", "mAnimatorInfo", "mChild", "maxLine", "nullVotingShow", "onCompleteListener", "getOnCompleteListener", "setOnCompleteListener", "onGlobalLayoutListener", "Lkotlin/Function0;", "root", "usableHeightPrevious", "votingStatus", "addVoting", "addVotingWhenNull", "assistActivity", "changeInAnimatorInfo", "deltaY", "", "complete", "dealAnimatorInfoRotation", "animatorInfo", "detachActivity", "dismiss", "dismissAnimator", "view", "Landroid/view/View;", "listener", "Landroid/animation/Animator$AnimatorListener;", "enterAnimator", "hideKeyboard", "initInAnimatorInfo", "initListener", "initView", "isInResumMode", "resumeMode", "moveVotingToCenter", "onClick", "v", "removeVoting", "resetChildParamsLeave", "setMaxLine", "line", "show", "updateDeltaXYPointF", "deltaX", "votingInitAnimator", "workroundWithFullScreen", "distance", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VotingStickerLayout extends FrameLayout implements View.OnClickListener, d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67339a;

    /* renamed from: b  reason: collision with root package name */
    FrameLayout f67340b;

    /* renamed from: c  reason: collision with root package name */
    public FrameLayout f67341c;

    /* renamed from: d  reason: collision with root package name */
    public final Function0<Unit> f67342d = new c(this);
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    Function1<? super VotingStickerView, Unit> f67343e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    Function1<? super VotingStickerView, Unit> f67344f;
    a g;
    a h;
    volatile int i;
    int j;
    boolean k;
    boolean l;
    boolean m;
    PointF n;
    public VotingStickerView o;
    int p;
    public boolean q;
    private int r;
    private HashMap s;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VotingStickerLayout$dismiss$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67345a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VotingStickerLayout f67346b;

        a(VotingStickerLayout votingStickerLayout) {
            this.f67346b = votingStickerLayout;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f67345a, false, 77166, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f67345a, false, 77166, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            super.onAnimationEnd(animator);
            VotingStickerView votingStickerView = this.f67346b.o;
            if (votingStickerView != null) {
                votingStickerView.b();
            }
            VotingStickerLayout votingStickerLayout = this.f67346b;
            if (PatchProxy.isSupport(new Object[0], votingStickerLayout, VotingStickerLayout.f67339a, false, 77162, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], votingStickerLayout, VotingStickerLayout.f67339a, false, 77162, new Class[0], Void.TYPE);
            } else {
                VotingStickerView votingStickerView2 = votingStickerLayout.o;
                if (votingStickerView2 != null) {
                    FrameLayout frameLayout = votingStickerLayout.f67340b;
                    if (frameLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("container");
                    }
                    frameLayout.removeView(votingStickerView2);
                    votingStickerView2.setEditEnable(false);
                    if (PatchProxy.isSupport(new Object[0], votingStickerLayout, VotingStickerLayout.f67339a, false, 77163, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], votingStickerLayout, VotingStickerLayout.f67339a, false, 77163, new Class[0], Void.TYPE);
                    } else {
                        VotingStickerView votingStickerView3 = votingStickerLayout.o;
                        if (votingStickerView3 != null) {
                            votingStickerView3.setScaleX(1.0f);
                            votingStickerView3.setScaleY(1.0f);
                            votingStickerView3.setRotation(0.0f);
                            votingStickerView3.setTranslationX(0.0f);
                            votingStickerView3.setTranslationY(0.0f);
                            votingStickerLayout.k = false;
                            votingStickerLayout.j = 0;
                            a aVar = new a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63);
                            votingStickerLayout.h = aVar;
                        }
                    }
                    Function1<? super VotingStickerView, Unit> function1 = votingStickerLayout.f67343e;
                    if (function1 != null) {
                        function1.invoke(votingStickerLayout.o);
                    }
                    votingStickerLayout.o = null;
                }
            }
            this.f67346b.setVisibility(4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VotingStickerLayout$enterAnimator$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67347a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VotingStickerLayout f67348b;

        b(VotingStickerLayout votingStickerLayout) {
            this.f67348b = votingStickerLayout;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f67347a, false, 77167, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f67347a, false, 77167, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            VotingStickerView votingStickerView = this.f67348b.o;
            if (votingStickerView != null) {
                votingStickerView.c();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ VotingStickerLayout this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VotingStickerLayout votingStickerLayout) {
            super(0);
            this.this$0 = votingStickerLayout;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dc, code lost:
            if (r2 != false) goto L_0x00de;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke() {
            /*
                r16 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 77168(0x12d70, float:1.08135E-40)
                r2 = r16
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0027
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                r5 = 0
                r6 = 77168(0x12d70, float:1.08135E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r16
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0027:
                r1 = r16
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout r9 = r1.this$0
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
                r5 = 0
                r6 = 77154(0x12d62, float:1.08116E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x004f
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
                r5 = 0
                r6 = 77154(0x12d62, float:1.08116E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x004f:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r2 = r9.o
                if (r2 == 0) goto L_0x0381
                android.graphics.Rect r10 = new android.graphics.Rect
                r10.<init>()
                android.widget.FrameLayout r2 = r9.f67341c
                if (r2 != 0) goto L_0x0061
                java.lang.String r3 = "root"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            L_0x0061:
                r2.getWindowVisibleDisplayFrame(r10)
                int r2 = r9.j
                r11 = 1
                if (r2 == 0) goto L_0x00e7
                int r2 = r9.getHeight()
                int r3 = r9.j
                if (r2 <= r3) goto L_0x00e7
                int r2 = r9.getHeight()
                int r3 = r10.height()
                if (r2 <= r3) goto L_0x00de
                int r2 = r9.getHeight()
                int r3 = r10.height()
                int r2 = r2 - r3
                int r12 = java.lang.Math.abs(r2)
                java.lang.Object[] r2 = new java.lang.Object[r11]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
                r2[r0] = r3
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
                r5 = 0
                r6 = 77153(0x12d61, float:1.08114E-40)
                java.lang.Class[] r7 = new java.lang.Class[r11]
                java.lang.Class r3 = java.lang.Integer.TYPE
                r7[r0] = r3
                java.lang.Class r8 = java.lang.Boolean.TYPE
                r3 = r9
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x00c7
                java.lang.Object[] r2 = new java.lang.Object[r11]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
                r2[r0] = r3
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
                r5 = 0
                r6 = 77153(0x12d61, float:1.08114E-40)
                java.lang.Class[] r7 = new java.lang.Class[r11]
                java.lang.Class r3 = java.lang.Integer.TYPE
                r7[r0] = r3
                java.lang.Class r8 = java.lang.Boolean.TYPE
                r3 = r9
                java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                goto L_0x00dc
            L_0x00c7:
                boolean r2 = com.ss.android.ugc.aweme.shortvideo.fc.a()
                if (r2 == 0) goto L_0x00db
                int r2 = com.ss.android.ugc.aweme.base.utils.p.c()
                if (r12 <= r2) goto L_0x00d9
                int r2 = com.ss.android.ugc.aweme.base.utils.p.d()
                if (r12 > r2) goto L_0x00db
            L_0x00d9:
                r2 = 1
                goto L_0x00dc
            L_0x00db:
                r2 = 0
            L_0x00dc:
                if (r2 == 0) goto L_0x00e7
            L_0x00de:
                kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView, kotlin.Unit> r2 = r9.f67344f
                if (r2 == 0) goto L_0x00e7
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r3 = r9.o
                r2.invoke(r3)
            L_0x00e7:
                int r2 = r9.getHeight()
                int r3 = r10.height()
                int r2 = r2 - r3
                int r3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.e.f67385b
                if (r2 <= r3) goto L_0x0381
                int r2 = r9.getHeight()
                int r3 = r10.height()
                int r2 = r2 - r3
                r9.i = r2
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
                r5 = 0
                r6 = 77155(0x12d63, float:1.08117E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                r12 = 2
                if (r2 == 0) goto L_0x0124
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
                r5 = 0
                r6 = 77155(0x12d63, float:1.08117E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                goto L_0x0149
            L_0x0124:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r2 = r9.o
                if (r2 == 0) goto L_0x0149
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r3 = r9.g
                int r4 = r9.getWidth()
                int r5 = r2.getWidth()
                int r4 = r4 - r5
                int r4 = r4 / r12
                float r4 = (float) r4
                r3.f67368e = r4
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r3 = r9.g
                int r4 = r9.getHeight()
                int r5 = r9.i
                int r4 = r4 - r5
                int r2 = r2.getHeight()
                int r4 = r4 - r2
                int r4 = r4 / r12
                float r2 = (float) r4
                r3.f67369f = r2
            L_0x0149:
                int r2 = r9.p
                int r3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.e.f67388e
                r13 = 300(0x12c, double:1.48E-321)
                if (r2 != r3) goto L_0x0262
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
                r5 = 0
                r6 = 77158(0x12d66, float:1.08121E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0176
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
                r5 = 0
                r6 = 77158(0x12d66, float:1.08121E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                goto L_0x037b
            L_0x0176:
                int r2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.e.f67386c
                r9.p = r2
                r9.m = r0
                boolean r2 = r9.l
                if (r2 != 0) goto L_0x037b
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r2 = r9.o
                if (r2 == 0) goto L_0x025e
                r2.setVisibility(r0)
                r15 = r2
                android.view.View r15 = (android.view.View) r15
                java.lang.Object[] r2 = new java.lang.Object[r11]
                r2[r0] = r15
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
                r5 = 0
                r6 = 77159(0x12d67, float:1.08123E-40)
                java.lang.Class[] r7 = new java.lang.Class[r11]
                java.lang.Class<android.view.View> r3 = android.view.View.class
                r7[r0] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x01bb
                java.lang.Object[] r2 = new java.lang.Object[r11]
                r2[r0] = r15
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
                r5 = 0
                r6 = 77159(0x12d67, float:1.08123E-40)
                java.lang.Class[] r7 = new java.lang.Class[r11]
                java.lang.Class<android.view.View> r3 = android.view.View.class
                r7[r0] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                goto L_0x025e
            L_0x01bb:
                java.lang.String r2 = "scaleX"
                float[] r3 = new float[r12]
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r4 = r9.h
                float r4 = r4.f67365b
                r3[r0] = r4
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r4 = r9.g
                float r4 = r4.f67365b
                r3[r11] = r4
                android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r15, r2, r3)
                java.lang.String r3 = "scaleY"
                float[] r4 = new float[r12]
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r5 = r9.h
                float r5 = r5.f67366c
                r4[r0] = r5
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r5 = r9.g
                float r5 = r5.f67366c
                r4[r11] = r5
                android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r15, r3, r4)
                java.lang.String r4 = "rotation"
                float[] r5 = new float[r12]
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r6 = r9.h
                float r6 = r6.f67367d
                r5[r0] = r6
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r6 = r9.h
                float r6 = r6.f67367d
                r7 = 1127481344(0x43340000, float:180.0)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L_0x01fa
                r6 = 1135869952(0x43b40000, float:360.0)
                goto L_0x01fe
            L_0x01fa:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r6 = r9.g
                float r6 = r6.f67367d
            L_0x01fe:
                r5[r11] = r6
                android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r15, r4, r5)
                java.lang.String r5 = "x"
                float[] r6 = new float[r12]
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r7 = r9.h
                float r7 = r7.f67368e
                r6[r0] = r7
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r7 = r9.g
                float r7 = r7.f67368e
                r6[r11] = r7
                android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r15, r5, r6)
                java.lang.String r6 = "y"
                float[] r7 = new float[r12]
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r8 = r9.h
                float r8 = r8.f67369f
                r7[r0] = r8
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r0 = r9.g
                float r0 = r0.f67369f
                r7[r11] = r0
                android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r15, r6, r7)
                android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
                r6.<init>()
                r6.setDuration(r13)
                android.animation.Animator r2 = (android.animation.Animator) r2
                android.animation.AnimatorSet$Builder r2 = r6.play(r2)
                android.animation.Animator r3 = (android.animation.Animator) r3
                android.animation.AnimatorSet$Builder r2 = r2.with(r3)
                android.animation.Animator r4 = (android.animation.Animator) r4
                android.animation.AnimatorSet$Builder r2 = r2.with(r4)
                android.animation.Animator r5 = (android.animation.Animator) r5
                android.animation.AnimatorSet$Builder r2 = r2.with(r5)
                android.animation.Animator r0 = (android.animation.Animator) r0
                r2.with(r0)
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout$b r0 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout$b
                r0.<init>(r9)
                android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
                r6.addListener(r0)
                r6.start()
            L_0x025e:
                r9.l = r11
                goto L_0x037b
            L_0x0262:
                int r3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.e.f67387d
                if (r2 != r3) goto L_0x037b
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
                r5 = 0
                r6 = 77156(0x12d64, float:1.08119E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x028b
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
                r5 = 0
                r6 = 77156(0x12d64, float:1.08119E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                goto L_0x037b
            L_0x028b:
                int r2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.e.f67386c
                r9.p = r2
                r9.m = r0
                boolean r2 = r9.l
                if (r2 != 0) goto L_0x037b
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r2 = r9.o
                if (r2 == 0) goto L_0x0379
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r3 = r9.h
                int r4 = r9.getWidth()
                int r5 = r2.getWidth()
                int r4 = r4 - r5
                int r4 = r4 / r12
                float r4 = (float) r4
                r3.f67368e = r4
                r3 = 2131166610(0x7f070592, float:1.794747E38)
                android.view.View r3 = r2.b(r3)
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText r3 = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteEditText) r3
                java.lang.String r4 = "it.et_voting_sticker_title"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                android.text.Editable r3 = r3.getText()
                java.lang.String r3 = java.lang.String.valueOf(r3)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                int r3 = r3.length()
                if (r3 != 0) goto L_0x02c8
                r3 = 1
                goto L_0x02c9
            L_0x02c8:
                r3 = 0
            L_0x02c9:
                r4 = 1073741824(0x40000000, float:2.0)
                if (r3 == 0) goto L_0x02f3
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r3 = r9.h
                android.graphics.PointF r5 = r9.n
                float r5 = r5.x
                int r6 = r2.getHeight()
                float r6 = (float) r6
                float r5 = r5 - r6
                float r5 = r5 / r4
                android.graphics.PointF r4 = r9.n
                float r4 = r4.y
                float r5 = r5 + r4
                int r4 = r2.getHeight()
                float r4 = (float) r4
                android.content.Context r6 = r9.getContext()
                r7 = 1119879168(0x42c00000, float:96.0)
                float r6 = com.bytedance.common.utility.UIUtils.dip2Px(r6, r7)
                float r4 = r4 - r6
                float r5 = r5 - r4
                r3.f67369f = r5
                goto L_0x0307
            L_0x02f3:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r3 = r9.h
                android.graphics.PointF r5 = r9.n
                float r5 = r5.x
                int r6 = r2.getHeight()
                float r6 = (float) r6
                float r5 = r5 - r6
                float r5 = r5 / r4
                android.graphics.PointF r4 = r9.n
                float r4 = r4.y
                float r5 = r5 + r4
                r3.f67369f = r5
            L_0x0307:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r3 = r9.g
                float r3 = r3.f67368e
                r2.setX(r3)
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r3 = r9.g
                float r3 = r3.f67369f
                r2.setY(r3)
                r2.setVisibility(r0)
                r9.requestLayout()
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
                r5 = 0
                r6 = 77157(0x12d65, float:1.0812E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x033f
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
                r5 = 0
                r6 = 77157(0x12d65, float:1.0812E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                goto L_0x0379
            L_0x033f:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r0 = r9.o
                if (r0 == 0) goto L_0x0379
                java.lang.String r2 = "scaleX"
                float[] r3 = new float[r12]
                r3 = {0, 1065353216} // fill-array
                android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r0, r2, r3)
                java.lang.String r3 = "scaleY"
                float[] r4 = new float[r12]
                r4 = {0, 1065353216} // fill-array
                android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r3, r4)
                android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
                r3.<init>()
                r3.setDuration(r13)
                android.animation.Animator r2 = (android.animation.Animator) r2
                android.animation.AnimatorSet$Builder r2 = r3.play(r2)
                android.animation.Animator r0 = (android.animation.Animator) r0
                r2.with(r0)
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout$d r0 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout$d
                r0.<init>(r9)
                android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
                r3.addListener(r0)
                r3.start()
            L_0x0379:
                r9.l = r11
            L_0x037b:
                int r0 = r10.height()
                r9.j = r0
            L_0x0381:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.c.invoke():void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VotingStickerLayout$votingInitAnimator$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67349a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VotingStickerLayout f67350b;

        d(VotingStickerLayout votingStickerLayout) {
            this.f67350b = votingStickerLayout;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f67349a, false, 77169, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f67349a, false, 77169, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            VotingStickerView votingStickerView = this.f67350b.o;
            if (votingStickerView != null) {
                votingStickerView.c();
            }
        }
    }

    private View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ddj)}, this, f67339a, false, 77164, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ddj)}, this, f67339a, false, 77164, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.s == null) {
            this.s = new HashMap();
        }
        View view = (View) this.s.get(Integer.valueOf(C0906R.id.ddj));
        if (view == null) {
            view = findViewById(C0906R.id.ddj);
            this.s.put(Integer.valueOf(C0906R.id.ddj), view);
        }
        return view;
    }

    @Nullable
    public final Function1<VotingStickerView, Unit> getBeforeChangeListener() {
        return this.f67344f;
    }

    @Nullable
    public final Function1<VotingStickerView, Unit> getOnCompleteListener() {
        return this.f67343e;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67339a, false, 77149, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67339a, false, 77149, new Class[0], Void.TYPE);
            return;
        }
        this.p = e.f67386c;
        dismiss();
    }

    private final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f67339a, false, 77148, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67339a, false, 77148, new Class[0], Void.TYPE);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            Context context = getContext();
            if (context != null) {
                Window window = ((Activity) context).getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window, "(context as Activity).window");
                View decorView = window.getDecorView();
                Intrinsics.checkExpressionValueIsNotNull(decorView, "(context as Activity).window.decorView");
                inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    private final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f67339a, false, 77145, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67339a, false, 77145, new Class[0], Void.TYPE);
            return;
        }
        setBackgroundColor(getResources().getColor(C0906R.color.d2));
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.a_2, this, false);
        if (inflate != null) {
            this.f67340b = (FrameLayout) inflate;
            FrameLayout frameLayout = this.f67340b;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("container");
            }
            addView(frameLayout);
            if (PatchProxy.isSupport(new Object[0], this, f67339a, false, 77146, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f67339a, false, 77146, new Class[0], Void.TYPE);
            } else {
                View.OnClickListener onClickListener = this;
                ((TextView) a((int) C0906R.id.ddj)).setOnClickListener(onClickListener);
                setOnClickListener(onClickListener);
            }
            setVisibility(4);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    public final void dismiss() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f67339a, false, 77160, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67339a, false, 77160, new Class[0], Void.TYPE);
            return;
        }
        this.l = false;
        VotingStickerView votingStickerView = this.o;
        if (votingStickerView != null) {
            votingStickerView.setTouchEnable(true);
        }
        if (!this.m) {
            VotingStickerView votingStickerView2 = this.o;
            if (votingStickerView2 != null) {
                View view = votingStickerView2;
                Animator.AnimatorListener aVar = new a(this);
                if (PatchProxy.isSupport(new Object[]{view, aVar}, this, f67339a, false, 77161, new Class[]{View.class, Animator.AnimatorListener.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, aVar}, this, f67339a, false, 77161, new Class[]{View.class, Animator.AnimatorListener.class}, Void.TYPE);
                } else {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{this.g.f67365b, this.h.f67365b});
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{this.g.f67366c, this.h.f67366c});
                    float[] fArr = new float[2];
                    if (this.h.f67367d > 180.0f) {
                        f2 = 360.0f;
                    } else {
                        f2 = this.g.f67367d;
                    }
                    fArr[0] = f2;
                    fArr[1] = this.h.f67367d;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotation", fArr);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "x", new float[]{this.g.f67368e, this.h.f67368e});
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "y", new float[]{this.g.f67369f, this.h.f67369f});
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(300);
                    animatorSet.addListener(aVar);
                    animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
                    animatorSet.start();
                }
                c();
            }
            this.m = true;
        }
    }

    public final void setBeforeChangeListener(@Nullable Function1<? super VotingStickerView, Unit> function1) {
        this.f67344f = function1;
    }

    public final void setMaxLine(int i2) {
        this.r = i2;
    }

    public final void setOnCompleteListener(@Nullable Function1<? super VotingStickerView, Unit> function1) {
        this.f67343e = function1;
    }

    private static void a(a aVar) {
        float f2 = aVar.f67367d % 360.0f;
        if (f2 < 0.0f) {
            f2 += 360.0f;
        }
        aVar.f67367d = f2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VotingStickerLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        a aVar = new a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63);
        this.g = aVar;
        a aVar2 = new a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63);
        this.h = aVar2;
        this.k = true;
        this.n = new PointF(0.0f, 0.0f);
        this.p = e.f67386c;
        this.r = 3;
        b();
    }

    public final void onClick(@Nullable View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f67339a, false, 77147, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f67339a, false, 77147, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (Intrinsics.areEqual((Object) view, (Object) this) || Intrinsics.areEqual((Object) view, (Object) (TextView) a((int) C0906R.id.ddj))) {
            c();
        }
    }

    public final void a(float f2, float f3) {
        this.n.x = f2;
        this.n.y = f3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VotingStickerLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attr");
        a aVar = new a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63);
        this.g = aVar;
        a aVar2 = new a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63);
        this.h = aVar2;
        this.k = true;
        this.n = new PointF(0.0f, 0.0f);
        this.p = e.f67386c;
        this.r = 3;
        b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        if (r1 == null) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r11, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            r9 = 1
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f67339a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView> r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView.class
            r5[r8] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a> r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 77150(0x12d5e, float:1.0811E-40)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f67339a
            r3 = 0
            r4 = 77150(0x12d5e, float:1.0811E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView> r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView.class
            r5[r8] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a> r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003f:
            java.lang.String r0 = "animatorInfo"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            r10.setVisibility(r8)
            r0 = 4
            if (r11 == 0) goto L_0x00ac
            int r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.e.f67388e
            r10.p = r1
            r10.h = r12
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a r1 = r10.h
            a((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a) r1)
            r10.o = r11
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r1 = r10.o
            if (r1 == 0) goto L_0x005e
            r1.setTouchEnable(r8)
        L_0x005e:
            android.view.ViewParent r1 = r11.getParent()
            if (r1 == 0) goto L_0x0078
            if (r1 == 0) goto L_0x0070
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r2 = r10.o
            android.view.View r2 = (android.view.View) r2
            r1.removeView(r2)
            goto L_0x0078
        L_0x0070:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            r0.<init>(r1)
            throw r0
        L_0x0078:
            android.widget.FrameLayout r1 = r10.f67340b
            if (r1 != 0) goto L_0x0081
            java.lang.String r2 = "container"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0081:
            r2 = r11
            android.view.View r2 = (android.view.View) r2
            r1.addView(r2)
            r11.setEditEnable(r9)
            r10.setVisibility(r8)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r1 = r10.o
            if (r1 == 0) goto L_0x0094
            r1.setVisibility(r0)
        L_0x0094:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r1 = r10.o
            if (r1 == 0) goto L_0x009d
            int r2 = r10.r
            r1.a((int) r2)
        L_0x009d:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r1 = r10.o
            if (r1 == 0) goto L_0x00a9
            int r2 = r12.g
            r1.setEditTextFocusable(r2)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x00aa
        L_0x00a9:
            r1 = 0
        L_0x00aa:
            if (r1 != 0) goto L_0x00e7
        L_0x00ac:
            int r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.e.f67387d
            r10.p = r1
            r10.k = r9
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView r1 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView
            android.content.Context r2 = r10.getContext()
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r1.<init>(r2)
            int r2 = r10.r
            r1.a((int) r2)
            r1.setTouchEnable(r8)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r2.<init>(r3, r3)
            r1.setVisibility(r0)
            android.widget.FrameLayout r0 = r10.f67340b
            if (r0 != 0) goto L_0x00da
            java.lang.String r3 = "container"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x00da:
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r0.addView(r3, r2)
            r10.o = r1
            r1.a()
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VotingStickerLayout(@NotNull Context context, @NotNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attr");
        a aVar = new a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63);
        this.g = aVar;
        a aVar2 = new a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63);
        this.h = aVar2;
        this.k = true;
        this.n = new PointF(0.0f, 0.0f);
        this.p = e.f67386c;
        this.r = 3;
        b();
    }
}
