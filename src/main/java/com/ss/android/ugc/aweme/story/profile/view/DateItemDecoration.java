package com.ss.android.ugc.aweme.story.profile.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J8\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00182\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0002J(\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020'2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J \u00105\u001a\u0002062\u0006\u0010*\u001a\u00020\u00182\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0002J \u00107\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R6\u0010\u001b\u001a(\u0012\f\u0012\n \r*\u0004\u0018\u00010\u001d0\u001d \r*\u0014\u0012\u000e\b\u0001\u0012\n \r*\u0004\u0018\u00010\u001d0\u001d\u0018\u00010\u001c0\u001cX\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/ss/android/ugc/aweme/story/profile/view/DateItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "adapter", "Lcom/ss/android/ugc/aweme/story/profile/view/AllStoryAdapter;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/story/profile/view/AllStoryAdapter;)V", "getAdapter", "()Lcom/ss/android/ugc/aweme/story/profile/view/AllStoryAdapter;", "bounds", "Landroid/graphics/Rect;", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "currentCalendar", "date", "Ljava/util/Date;", "dayFontSize", "", "fontDayColor", "", "fontMonthAndYearColor", "monthAndYearFontSize", "months", "", "", "[Ljava/lang/String;", "paint", "Landroid/graphics/Paint;", "titleHeight", "drawDate", "", "c", "Landroid/graphics/Canvas;", "child", "Landroid/view/View;", "params", "Landroid/support/v7/widget/RecyclerView$LayoutParams;", "position", "data", "", "Lcom/ss/android/ugc/aweme/story/profile/model/LifeStoryItem;", "getItemOffsets", "outRect", "view", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "isNewLine", "", "onDraw", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DateItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73338a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public Context f73339b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final AllStoryAdapter f73340c;

    /* renamed from: d  reason: collision with root package name */
    private final Paint f73341d = new Paint();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f73342e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private Calendar f73343f = Calendar.getInstance();
    private Calendar g = Calendar.getInstance();
    private Date h = new Date();
    private final String[] i = this.f73339b.getResources().getStringArray(C0906R.array.r);
    private final float j = UIUtils.dip2Px(this.f73339b, 52.0f);
    private final float k = UIUtils.sp2px(this.f73339b, 20.0f);
    private final float l = UIUtils.sp2px(this.f73339b, 11.0f);
    private final int m = Color.parseColor("#e6ffffff");
    private final int n = this.f73339b.getResources().getColor(C0906R.color.a0b);

    public DateItemDecoration(@NotNull Context context, @NotNull AllStoryAdapter allStoryAdapter) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(allStoryAdapter, "adapter");
        this.f73339b = context;
        this.f73340c = allStoryAdapter;
        this.f73341d.setAntiAlias(true);
        Calendar calendar = this.f73343f;
        Intrinsics.checkExpressionValueIsNotNull(calendar, "currentCalendar");
        calendar.setTime(new Date(System.currentTimeMillis()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d0, code lost:
        if ((!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)) == false) goto L_0x0289;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0222  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(@org.jetbrains.annotations.NotNull android.graphics.Canvas r24, @org.jetbrains.annotations.NotNull android.support.v7.widget.RecyclerView r25, @org.jetbrains.annotations.NotNull android.support.v7.widget.RecyclerView.State r26) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            r13 = 1
            r0[r13] = r9
            r14 = 2
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f73338a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r12] = r1
            java.lang.Class<android.support.v7.widget.RecyclerView> r1 = android.support.v7.widget.RecyclerView.class
            r5[r13] = r1
            java.lang.Class<android.support.v7.widget.RecyclerView$State> r1 = android.support.v7.widget.RecyclerView.State.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 84961(0x14be1, float:1.19056E-40)
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0056
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f73338a
            r3 = 0
            r4 = 84961(0x14be1, float:1.19056E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r12] = r1
            java.lang.Class<android.support.v7.widget.RecyclerView> r1 = android.support.v7.widget.RecyclerView.class
            r5[r13] = r1
            java.lang.Class<android.support.v7.widget.RecyclerView$State> r1 = android.support.v7.widget.RecyclerView.State.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0056:
            java.lang.String r0 = "c"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            super.onDraw(r24, r25, r26)
            int r10 = r25.getChildCount()
            if (r10 != 0) goto L_0x006f
            return
        L_0x006f:
            com.ss.android.ugc.aweme.story.profile.view.AllStoryAdapter r0 = r7.f73340c
            java.util.List r15 = r0.getData()
            r6 = 0
        L_0x0076:
            if (r6 >= r10) goto L_0x0294
            android.view.View r5 = r9.getChildAt(r6)
            boolean r0 = r5 instanceof com.bytedance.ies.dmt.ui.widget.DmtStatusView
            if (r0 != 0) goto L_0x0289
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r0)
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            if (r0 == 0) goto L_0x0281
            r4 = r0
            android.support.v7.widget.RecyclerView$LayoutParams r4 = (android.support.v7.widget.RecyclerView.LayoutParams) r4
            int r3 = r4.getViewLayoutPosition()
            if (r3 < 0) goto L_0x0289
            if (r15 == 0) goto L_0x009b
            int r0 = r15.size()
            goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            if (r3 < r0) goto L_0x00a0
            goto L_0x0289
        L_0x00a0:
            if (r3 == 0) goto L_0x00d2
            r0 = 0
            if (r15 == 0) goto L_0x00b6
            java.lang.Object r1 = r15.get(r3)
            com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem r1 = (com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem) r1
            if (r1 == 0) goto L_0x00b6
            long r1 = r1.getDate()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x00b7
        L_0x00b6:
            r1 = r0
        L_0x00b7:
            if (r15 == 0) goto L_0x00cb
            int r2 = r3 + -1
            java.lang.Object r2 = r15.get(r2)
            com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem r2 = (com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem) r2
            if (r2 == 0) goto L_0x00cb
            long r16 = r2.getDate()
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
        L_0x00cb:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)
            r0 = r0 ^ r13
            if (r0 == 0) goto L_0x0289
        L_0x00d2:
            r2 = 5
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r12] = r8
            r0[r13] = r5
            r0[r14] = r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0[r11] = r1
            r16 = 4
            r0[r16] = r15
            com.meituan.robust.ChangeQuickRedirect r17 = f73338a
            r18 = 0
            r19 = 84963(0x14be3, float:1.19059E-40)
            java.lang.Class[] r1 = new java.lang.Class[r2]
            java.lang.Class<android.graphics.Canvas> r20 = android.graphics.Canvas.class
            r1[r12] = r20
            java.lang.Class<android.view.View> r20 = android.view.View.class
            r1[r13] = r20
            java.lang.Class<android.support.v7.widget.RecyclerView$LayoutParams> r20 = android.support.v7.widget.RecyclerView.LayoutParams.class
            r1[r14] = r20
            java.lang.Class r20 = java.lang.Integer.TYPE
            r1[r11] = r20
            java.lang.Class<java.util.List> r20 = java.util.List.class
            r1[r16] = r20
            java.lang.Class r20 = java.lang.Void.TYPE
            r21 = r1
            r1 = r23
            r11 = 5
            r2 = r17
            r22 = r3
            r3 = r18
            r14 = r4
            r4 = r19
            r17 = r5
            r5 = r21
            r18 = r6
            r6 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x015b
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r17
            r1 = 2
            r0[r1] = r14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r2 = 3
            r0[r2] = r1
            r0[r16] = r15
            com.meituan.robust.ChangeQuickRedirect r2 = f73338a
            r3 = 0
            r4 = 84963(0x14be3, float:1.19059E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r12] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r13] = r1
            java.lang.Class<android.support.v7.widget.RecyclerView$LayoutParams> r1 = android.support.v7.widget.RecyclerView.LayoutParams.class
            r6 = 2
            r5[r6] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r19 = 3
            r5[r19] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r5 = 2
            goto L_0x028e
        L_0x015b:
            r19 = 3
            java.util.Date r0 = r7.h
            if (r15 == 0) goto L_0x0170
            r1 = r22
            java.lang.Object r1 = r15.get(r1)
            com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem r1 = (com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem) r1
            if (r1 == 0) goto L_0x0170
            long r1 = r1.getDate()
            goto L_0x0172
        L_0x0170:
            r1 = 0
        L_0x0172:
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r0.setTime(r1)
            java.util.Calendar r0 = r7.g
            java.lang.String r1 = "calendar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.util.Date r1 = r7.h
            r0.setTime(r1)
            android.graphics.Paint r0 = r7.f73341d
            float r1 = r7.k
            r0.setTextSize(r1)
            android.graphics.Paint r0 = r7.f73341d
            int r1 = r7.m
            r0.setColor(r1)
            android.graphics.Paint r0 = r7.f73341d
            r0.setFakeBoldText(r13)
            android.graphics.Paint r0 = r7.f73341d
            java.util.Calendar r1 = r7.g
            int r1 = r1.get(r11)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.util.Calendar r2 = r7.g
            int r2 = r2.get(r11)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r2 = r2.length()
            android.graphics.Rect r3 = r7.f73342e
            r0.getTextBounds(r1, r12, r2, r3)
            java.util.Calendar r0 = r7.g
            int r0 = r0.get(r11)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.content.Context r1 = r7.f73339b
            r2 = 1098907648(0x41800000, float:16.0)
            float r1 = com.bytedance.common.utility.UIUtils.dip2Px(r1, r2)
            int r2 = r17.getTop()
            int r3 = r14.topMargin
            int r2 = r2 - r3
            float r2 = (float) r2
            float r3 = r7.j
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            android.content.Context r5 = r7.f73339b
            r6 = 1082130432(0x40800000, float:4.0)
            float r5 = com.bytedance.common.utility.UIUtils.dip2Px(r5, r6)
            float r3 = r3 - r5
            android.graphics.Rect r5 = r7.f73342e
            int r5 = r5.height()
            r6 = 2
            int r5 = r5 / r6
            float r5 = (float) r5
            float r3 = r3 - r5
            float r2 = r2 - r3
            android.graphics.Paint r3 = r7.f73341d
            r8.drawText(r0, r1, r2, r3)
            android.graphics.Rect r0 = r7.f73342e
            int r0 = r0.width()
            android.graphics.Paint r1 = r7.f73341d
            float r2 = r7.l
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r7.f73341d
            int r2 = r7.n
            r1.setColor(r2)
            android.graphics.Paint r1 = r7.f73341d
            r1.setFakeBoldText(r12)
            java.util.Calendar r1 = r7.f73343f
            int r1 = r1.get(r13)
            java.util.Calendar r2 = r7.g
            int r2 = r2.get(r13)
            if (r1 != r2) goto L_0x0222
            java.lang.String[] r1 = r7.i
            java.util.Calendar r2 = r7.g
            r3 = 2
            int r2 = r2.get(r3)
            r1 = r1[r2]
            goto L_0x0247
        L_0x0222:
            r3 = 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String[] r2 = r7.i
            java.util.Calendar r5 = r7.g
            int r5 = r5.get(r3)
            r2 = r2[r5]
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            java.util.Calendar r2 = r7.g
            int r2 = r2.get(r13)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x0247:
            android.graphics.Paint r2 = r7.f73341d
            int r3 = r1.length()
            android.graphics.Rect r5 = r7.f73342e
            r2.getTextBounds(r1, r12, r3, r5)
            android.content.Context r2 = r7.f73339b
            r3 = 1101004800(0x41a00000, float:20.0)
            float r2 = com.bytedance.common.utility.UIUtils.dip2Px(r2, r3)
            float r0 = (float) r0
            float r2 = r2 + r0
            int r0 = r17.getTop()
            int r3 = r14.topMargin
            int r0 = r0 - r3
            float r0 = (float) r0
            float r3 = r7.j
            float r3 = r3 / r4
            android.content.Context r4 = r7.f73339b
            r5 = 1084227584(0x40a00000, float:5.0)
            float r4 = com.bytedance.common.utility.UIUtils.dip2Px(r4, r5)
            float r3 = r3 - r4
            android.graphics.Rect r4 = r7.f73342e
            int r4 = r4.height()
            r5 = 2
            int r4 = r4 / r5
            float r4 = (float) r4
            float r3 = r3 - r4
            float r0 = r0 - r3
            android.graphics.Paint r3 = r7.f73341d
            r8.drawText(r1, r2, r0, r3)
            goto L_0x028e
        L_0x0281:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x0289:
            r18 = r6
            r5 = 2
            r19 = 3
        L_0x028e:
            int r6 = r18 + 1
            r11 = 3
            r14 = 2
            goto L_0x0076
        L_0x0294:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.profile.view.DateItemDecoration.onDraw(android.graphics.Canvas, android.support.v7.widget.RecyclerView, android.support.v7.widget.RecyclerView$State):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0129 A[LOOP:0: B:19:0x00f6->B:32:0x0129, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012d A[EDGE_INSN: B:41:0x012d->B:34:0x012d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getItemOffsets(@org.jetbrains.annotations.NotNull android.graphics.Rect r18, @org.jetbrains.annotations.NotNull android.view.View r19, @org.jetbrains.annotations.NotNull android.support.v7.widget.RecyclerView r20, @org.jetbrains.annotations.NotNull android.support.v7.widget.RecyclerView.State r21) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r12 = 4
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r13 = 0
            r0[r13] = r8
            r14 = 1
            r0[r14] = r9
            r15 = 2
            r0[r15] = r10
            r6 = 3
            r0[r6] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f73338a
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r14] = r1
            java.lang.Class<android.support.v7.widget.RecyclerView> r1 = android.support.v7.widget.RecyclerView.class
            r5[r15] = r1
            java.lang.Class<android.support.v7.widget.RecyclerView$State> r1 = android.support.v7.widget.RecyclerView.State.class
            r5[r6] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r3 = 0
            r4 = 84962(0x14be2, float:1.19057E-40)
            r1 = r17
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0068
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r8
            r0[r14] = r9
            r0[r15] = r10
            r6 = 3
            r0[r6] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f73338a
            r3 = 0
            r4 = 84962(0x14be2, float:1.19057E-40)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r14] = r1
            java.lang.Class<android.support.v7.widget.RecyclerView> r1 = android.support.v7.widget.RecyclerView.class
            r5[r15] = r1
            java.lang.Class<android.support.v7.widget.RecyclerView$State> r1 = android.support.v7.widget.RecyclerView.State.class
            r5[r6] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0068:
            r6 = 3
            java.lang.String r0 = "outRect"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            super.getItemOffsets(r18, r19, r20, r21)
            com.ss.android.ugc.aweme.story.profile.view.AllStoryAdapter r0 = r7.f73340c
            java.util.List r10 = r0.getData()
            android.view.ViewGroup$LayoutParams r0 = r19.getLayoutParams()
            if (r0 == 0) goto L_0x0143
            android.support.v7.widget.RecyclerView$LayoutParams r0 = (android.support.v7.widget.RecyclerView.LayoutParams) r0
            int r9 = r0.getViewLayoutPosition()
            if (r9 < 0) goto L_0x0136
            if (r10 == 0) goto L_0x009b
            int r0 = r10.size()
            goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            if (r9 >= r0) goto L_0x0136
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r13] = r1
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f73338a
            r3 = 0
            r4 = 84964(0x14be4, float:1.1906E-40)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r14] = r1
            java.lang.Class r11 = java.lang.Boolean.TYPE
            r1 = r17
            r12 = 3
            r6 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00ed
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r13] = r1
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f73338a
            r3 = 0
            r4 = 84964(0x14be4, float:1.1906E-40)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r14 = r0.booleanValue()
            goto L_0x012d
        L_0x00ed:
            if (r9 >= r12) goto L_0x00f0
            goto L_0x012d
        L_0x00f0:
            if (r9 <= r15) goto L_0x00f5
            int r0 = r9 + -3
            goto L_0x00f6
        L_0x00f5:
            r0 = 0
        L_0x00f6:
            if (r0 >= r9) goto L_0x012c
            r1 = 0
            if (r10 == 0) goto L_0x010c
            java.lang.Object r2 = r10.get(r0)
            com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem r2 = (com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem) r2
            if (r2 == 0) goto L_0x010c
            long r2 = r2.getDate()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x010d
        L_0x010c:
            r2 = r1
        L_0x010d:
            if (r10 == 0) goto L_0x0121
            int r3 = r0 + 1
            java.lang.Object r3 = r10.get(r3)
            com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem r3 = (com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem) r3
            if (r3 == 0) goto L_0x0121
            long r3 = r3.getDate()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
        L_0x0121:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            r1 = r1 ^ r14
            if (r1 == 0) goto L_0x0129
            goto L_0x012d
        L_0x0129:
            int r0 = r0 + 1
            goto L_0x00f6
        L_0x012c:
            r14 = 0
        L_0x012d:
            if (r14 == 0) goto L_0x0136
            float r0 = r7.j
            int r0 = (int) r0
            r8.set(r13, r0, r13, r13)
            return
        L_0x0136:
            android.content.Context r0 = r7.f73339b
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r1)
            int r0 = (int) r0
            r8.set(r13, r0, r13, r13)
            return
        L_0x0143:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.profile.view.DateItemDecoration.getItemOffsets(android.graphics.Rect, android.view.View, android.support.v7.widget.RecyclerView, android.support.v7.widget.RecyclerView$State):void");
    }
}
