package com.ss.android.ugc.aweme.shortvideo.local;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u0000 \u0019*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0019B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ=\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\nR\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/local/LocalViewPagerBottomSheetBehavior;", "V", "Landroid/view/View;", "Lcom/ss/android/ugc/aweme/base/opensourcemodified/android/support/design/widget/ViewPagerBottomSheetBehavior;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "scrollableView", "", "Ljava/lang/Integer;", "onNestedPreScroll", "", "coordinatorLayout", "Landroid/support/design/widget/CoordinatorLayout;", "child", "target", "dx", "dy", "consumed", "", "(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[I)V", "setScrollableView", "viewId", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LocalViewPagerBottomSheetBehavior<V extends View> extends ViewPagerBottomSheetBehavior<V> {
    public static ChangeQuickRedirect o;
    public static final a q = new a((byte) 0);
    Integer p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u0005¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/local/LocalViewPagerBottomSheetBehavior$Companion;", "", "()V", "from", "Lcom/ss/android/ugc/aweme/shortvideo/local/LocalViewPagerBottomSheetBehavior;", "V", "Landroid/view/View;", "view", "(Landroid/view/View;)Lcom/ss/android/ugc/aweme/shortvideo/local/LocalViewPagerBottomSheetBehavior;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68325a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LocalViewPagerBottomSheetBehavior(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attributeSet");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: V[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedPreScroll(@org.jetbrains.annotations.NotNull android.support.design.widget.CoordinatorLayout r26, @org.jetbrains.annotations.NotNull V r27, @org.jetbrains.annotations.NotNull android.view.View r28, int r29, int r30, @org.jetbrains.annotations.NotNull int[] r31) {
        /*
            r25 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r31
            r4 = 6
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r0
            r13 = 1
            r5[r13] = r1
            r14 = 2
            r5[r14] = r2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r29)
            r15 = 3
            r5[r15] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r30)
            r16 = 4
            r5[r16] = r6
            r17 = 5
            r5[r17] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = o
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.support.design.widget.CoordinatorLayout> r6 = android.support.design.widget.CoordinatorLayout.class
            r10[r12] = r6
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r10[r13] = r6
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r10[r14] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r15] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r16] = r6
            java.lang.Class<int[]> r6 = int[].class
            r10[r17] = r6
            java.lang.Class r11 = java.lang.Void.TYPE
            r8 = 0
            r9 = 77587(0x12f13, float:1.08723E-40)
            r6 = r25
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0094
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r1
            r5[r14] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r29)
            r5[r15] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r30)
            r5[r16] = r0
            r5[r17] = r3
            com.meituan.robust.ChangeQuickRedirect r20 = o
            r21 = 0
            r22 = 77587(0x12f13, float:1.08723E-40)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<android.support.design.widget.CoordinatorLayout> r1 = android.support.design.widget.CoordinatorLayout.class
            r0[r12] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r0[r13] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r0[r14] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r15] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r16] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r17] = r1
            java.lang.Class r24 = java.lang.Void.TYPE
            r18 = r5
            r19 = r25
            r23 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            return
        L_0x0094:
            java.lang.String r4 = "coordinatorLayout"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r4)
            java.lang.String r4 = "child"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r4)
            java.lang.String r4 = "target"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r4)
            java.lang.String r4 = "consumed"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r4)
            int r4 = r28.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = r25
            java.lang.Integer r6 = r5.p
            if (r4 == r6) goto L_0x00b7
            return
        L_0x00b7:
            super.onNestedPreScroll(r26, r27, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.local.LocalViewPagerBottomSheetBehavior.onNestedPreScroll(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View, int, int, int[]):void");
    }
}
