package com.ss.android.ugc.aweme.common.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/common/utils/FakeScrollUtil;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40301a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0522a f40302b = new C0522a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0007J8\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0002J@\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/common/utils/FakeScrollUtil$Companion;", "", "()V", "fakeScroll", "", "targetView", "Landroid/view/View;", "fromPosition", "Lkotlin/Pair;", "", "toPosition", "duration", "", "fakeScrollInstant", "fakeSmoothScroll", "obtainMotionEvent", "Landroid/view/MotionEvent;", "action", "", "x", "y", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.common.utils.a$a  reason: collision with other inner class name */
    public static final class C0522a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40303a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.common.utils.a$a$a  reason: collision with other inner class name */
        public static final class C0523a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40304a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f40305b;

            public C0523a(View view) {
                this.f40305b = view;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onAnimationUpdate(android.animation.ValueAnimator r18) {
                /*
                    r17 = this;
                    r0 = r18
                    r1 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    r9 = 0
                    r2[r9] = r0
                    com.meituan.robust.ChangeQuickRedirect r4 = f40304a
                    java.lang.Class[] r7 = new java.lang.Class[r1]
                    java.lang.Class<android.animation.ValueAnimator> r3 = android.animation.ValueAnimator.class
                    r7[r9] = r3
                    java.lang.Class r8 = java.lang.Void.TYPE
                    r5 = 0
                    r6 = 33536(0x8300, float:4.6994E-41)
                    r3 = r17
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                    if (r2 == 0) goto L_0x0036
                    java.lang.Object[] r10 = new java.lang.Object[r1]
                    r10[r9] = r0
                    com.meituan.robust.ChangeQuickRedirect r12 = f40304a
                    r13 = 0
                    r14 = 33536(0x8300, float:4.6994E-41)
                    java.lang.Class[] r15 = new java.lang.Class[r1]
                    java.lang.Class<android.animation.ValueAnimator> r0 = android.animation.ValueAnimator.class
                    r15[r9] = r0
                    java.lang.Class r16 = java.lang.Void.TYPE
                    r11 = r17
                    com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                    return
                L_0x0036:
                    java.lang.String r1 = "it"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                    java.lang.Object r0 = r18.getAnimatedValue()
                    boolean r1 = r0 instanceof kotlin.Pair
                    if (r1 != 0) goto L_0x0044
                    r0 = 0
                L_0x0044:
                    kotlin.Pair r0 = (kotlin.Pair) r0
                    r1 = r17
                    android.view.View r2 = r1.f40305b
                    com.ss.android.ugc.aweme.common.utils.a$a r3 = com.ss.android.ugc.aweme.common.utils.a.f40302b
                    r4 = 2
                    r5 = 0
                    if (r0 == 0) goto L_0x005d
                    java.lang.Object r6 = r0.getFirst()
                    java.lang.Float r6 = (java.lang.Float) r6
                    if (r6 == 0) goto L_0x005d
                    float r6 = r6.floatValue()
                    goto L_0x005e
                L_0x005d:
                    r6 = 0
                L_0x005e:
                    if (r0 == 0) goto L_0x006c
                    java.lang.Object r0 = r0.getSecond()
                    java.lang.Float r0 = (java.lang.Float) r0
                    if (r0 == 0) goto L_0x006c
                    float r5 = r0.floatValue()
                L_0x006c:
                    android.view.MotionEvent r0 = r3.a(r4, r6, r5)
                    r2.dispatchTouchEvent(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.utils.a.C0522a.C0523a.onAnimationUpdate(android.animation.ValueAnimator):void");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/common/utils/FakeScrollUtil$Companion$fakeSmoothScroll$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.common.utils.a$a$b */
        public static final class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40306a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f40307b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Pair f40308c;

            public final void onAnimationCancel(@Nullable Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f40306a, false, 33538, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f40306a, false, 33538, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationCancel(animator);
                this.f40307b.dispatchTouchEvent(a.f40302b.a(3, ((Number) this.f40308c.getFirst()).floatValue(), ((Number) this.f40308c.getSecond()).floatValue()));
            }

            public final void onAnimationEnd(@Nullable Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f40306a, false, 33537, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f40306a, false, 33537, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
                this.f40307b.dispatchTouchEvent(a.f40302b.a(1, ((Number) this.f40308c.getFirst()).floatValue(), ((Number) this.f40308c.getSecond()).floatValue()));
            }

            public b(View view, Pair pair) {
                this.f40307b = view;
                this.f40308c = pair;
            }
        }

        private C0522a() {
        }

        public /* synthetic */ C0522a(byte b2) {
            this();
        }

        public final MotionEvent a(int i, float f2, float f3) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3)}, this, f40303a, false, 33535, new Class[]{Integer.TYPE, Float.TYPE, Float.TYPE}, MotionEvent.class)) {
                return (MotionEvent) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3)}, this, f40303a, false, 33535, new Class[]{Integer.TYPE, Float.TYPE, Float.TYPE}, MotionEvent.class);
            }
            MotionEvent obtain = MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), i, f2, f3, 0);
            Intrinsics.checkExpressionValueIsNotNull(obtain, "MotionEvent.obtain(Syste…illis(), action, x, y, 0)");
            return obtain;
        }
    }
}
