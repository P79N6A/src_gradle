package com.ss.android.ugc.aweme.story.feed.view.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020%H\u0002J\u0012\u0010&\u001a\u00020%2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0002J\u0010\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tH\u0002J\u000e\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020\u0013J\u0012\u0010-\u001a\u00020%2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u0018\u00100\u001a\u00020%2\u0006\u0010*\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0014J\u000e\u00101\u001a\u00020%2\u0006\u0010,\u001a\u00020\u0013J\u000e\u00102\u001a\u00020%2\u0006\u00103\u001a\u00020\u0013J\u000e\u00104\u001a\u00020%2\u0006\u0010,\u001a\u00020\u0013J\u0016\u00105\u001a\u00020%2\u0006\u00106\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u0013J\u000e\u00107\u001a\u00020%2\u0006\u0010,\u001a\u00020\u0013J\u0006\u00108\u001a\u00020%J\b\u00109\u001a\u00020%H\u0002J\u0010\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020\u0013H\u0002J\b\u0010<\u001a\u00020%H\u0002J\"\u0010=\u001a\u00020%2\b\b\u0002\u0010>\u001a\u00020\t2\b\b\u0002\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u0013R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/view/ui/StoryProgressViewReal;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCanUpdate", "", "getMCanUpdate", "()Z", "setMCanUpdate", "(Z)V", "mCurIndex", "mCurTime", "", "mDefaultColor", "Ljava/lang/Integer;", "mHeight", "mIsInProgress", "mItemWidth", "mNormalPaint", "Landroid/graphics/Paint;", "mProgressColor", "mProgressPaint", "mSpace", "mStoryCount", "mTotalTime", "runnable", "Ljava/lang/Runnable;", "getCurProgress", "", "initPaint", "", "initView", "measureHeight", "heightMeasureSpec", "measureWidth", "widthMeasureSpec", "onBuffering", "curTime", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "onPausePlay", "onPlayProgressChange", "curPosition", "onPreparePlay", "onRenderReady", "videoDuration", "onResumePlay", "playFail", "removeCallback", "runProgressBar", "next", "start", "updateProgress", "count", "curIndex", "totalTime", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryProgressViewReal extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72816a;

    /* renamed from: b  reason: collision with root package name */
    public long f72817b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f72818c;

    /* renamed from: d  reason: collision with root package name */
    volatile boolean f72819d;

    /* renamed from: e  reason: collision with root package name */
    final Runnable f72820e;

    /* renamed from: f  reason: collision with root package name */
    private int f72821f;
    private int g;
    private int h;
    private int i;
    private int j;
    private Integer k;
    private Integer l;
    private Paint m;
    private Paint n;
    private boolean o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72822a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryProgressViewReal f72823b;

        a(StoryProgressViewReal storyProgressViewReal) {
            this.f72823b = storyProgressViewReal;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f72822a, false, 84135, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72822a, false, 84135, new Class[0], Void.TYPE);
                return;
            }
            this.f72823b.f72818c += 50;
            if (this.f72823b.f72817b < this.f72823b.f72818c || !this.f72823b.getMCanUpdate()) {
                this.f72823b.b();
                return;
            }
            this.f72823b.invalidate();
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = uptimeMillis + (50 - (uptimeMillis % 50));
            StoryProgressViewReal storyProgressViewReal = this.f72823b;
            if (PatchProxy.isSupport(new Object[]{new Long(j)}, storyProgressViewReal, StoryProgressViewReal.f72816a, false, 84116, new Class[]{Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j)}, storyProgressViewReal, StoryProgressViewReal.f72816a, false, 84116, new Class[]{Long.TYPE}, Void.TYPE);
                return;
            }
            if (storyProgressViewReal.getHandler() != null) {
                storyProgressViewReal.getHandler().postAtTime(storyProgressViewReal.f72820e, j);
                storyProgressViewReal.f72819d = true;
            }
        }
    }

    public final boolean getMCanUpdate() {
        return this.o;
    }

    public final float getCurProgress() {
        return ((float) this.f72818c) / ((float) this.f72817b);
    }

    private final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f72816a, false, 84120, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72816a, false, 84120, new Class[0], Void.TYPE);
            return;
        }
        b();
        invalidate();
        postDelayed(this.f72820e, 50);
        this.f72819d = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72816a, false, 84126, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72816a, false, 84126, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f72816a, false, 84128, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72816a, false, 84128, new Class[0], Void.TYPE);
            return;
        }
        removeCallbacks(this.f72820e);
        this.f72819d = false;
    }

    public final void setMCanUpdate(boolean z) {
        this.o = z;
    }

    public StoryProgressViewReal(@Nullable Context context) {
        this(context, null);
    }

    public final void a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f72816a, false, 84121, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f72816a, false, 84121, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        b();
    }

    public final void b(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f72816a, false, 84122, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f72816a, false, 84122, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        b();
        this.f72819d = true;
    }

    public final void c(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f72816a, false, 84123, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f72816a, false, 84123, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.o) {
            this.f72818c = j2;
            c();
        }
    }

    public final void d(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f72816a, false, 84124, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f72816a, false, 84124, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.o) {
            this.f72818c = j2;
            c();
        }
    }

    public final void e(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f72816a, false, 84127, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f72816a, false, 84127, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.o && j2 > this.f72818c && Math.abs(this.f72818c - j2) >= 50) {
            this.f72818c = j2;
            c();
        }
    }

    public final void onDraw(@Nullable Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f72816a, false, 84132, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f72816a, false, 84132, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.f72821f > 0) {
            float f2 = 0.0f;
            if (this.f72817b != 0) {
                f2 = (((float) this.f72818c) * 1.0f) / ((float) this.f72817b);
            }
            float min = Math.min(f2, 1.0f);
            this.h = (getMeasuredWidth() - ((this.f72821f - 1) * this.i)) / this.f72821f;
            int i2 = this.f72821f - 1;
            if (i2 >= 0) {
                int i3 = 0;
                while (true) {
                    int i4 = (this.h + this.i) * i3;
                    Rect rect = new Rect(i4, 0, this.h + i4, this.j);
                    if (i3 < this.g) {
                        if (canvas != null) {
                            canvas.drawRoundRect(new RectF(rect), (((float) rect.height()) / 2.0f) + 1.0f, (((float) rect.height()) / 2.0f) + 1.0f, this.n);
                        }
                    } else if (canvas != null) {
                        canvas.drawRoundRect(new RectF(rect), (((float) rect.height()) / 2.0f) + 1.0f, (((float) rect.height()) / 2.0f) + 1.0f, this.m);
                    }
                    if (i3 == this.g) {
                        Rect rect2 = new Rect(i4, 0, (int) (((float) i4) + (((float) this.h) * min)), this.j);
                        if (canvas != null) {
                            canvas.drawRoundRect(new RectF(rect2), (((float) rect2.height()) / 2.0f) + 1.0f, (((float) rect2.height()) / 2.0f) + 1.0f, this.n);
                        }
                    }
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
        }
    }

    public StoryProgressViewReal(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r8 = 0
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f72816a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 84129(0x148a1, float:1.1789E-40)
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004f
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f72816a
            r3 = 0
            r4 = 84129(0x148a1, float:1.1789E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004f:
            super.onMeasure(r13, r14)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f72816a
            r3 = 0
            r4 = 84130(0x148a2, float:1.17891E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r7 = 1073741824(0x40000000, float:2.0)
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L_0x0096
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f72816a
            r3 = 0
            r4 = 84130(0x148a2, float:1.17891E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L_0x0094:
            r11 = r0
            goto L_0x00a7
        L_0x0096:
            int r0 = android.view.View.MeasureSpec.getMode(r13)
            if (r0 == r10) goto L_0x00a0
            if (r0 == 0) goto L_0x00a0
            if (r0 == r7) goto L_0x00a2
        L_0x00a0:
            r11 = 0
            goto L_0x00a7
        L_0x00a2:
            int r0 = android.view.View.MeasureSpec.getSize(r13)
            goto L_0x0094
        L_0x00a7:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f72816a
            r3 = 0
            r4 = 84131(0x148a3, float:1.17893E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00e6
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f72816a
            r3 = 0
            r4 = 84131(0x148a3, float:1.17893E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r8 = r0.intValue()
            goto L_0x00fb
        L_0x00e6:
            int r0 = android.view.View.MeasureSpec.getMode(r14)
            if (r0 == r10) goto L_0x00f9
            if (r0 == 0) goto L_0x00f6
            if (r0 == r7) goto L_0x00f1
            goto L_0x00fb
        L_0x00f1:
            int r8 = android.view.View.MeasureSpec.getSize(r14)
            goto L_0x00fb
        L_0x00f6:
            int r8 = r12.j
            goto L_0x00fb
        L_0x00f9:
            int r8 = r12.j
        L_0x00fb:
            r12.setMeasuredDimension(r11, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.view.ui.StoryProgressViewReal.onMeasure(int, int):void");
    }

    public final void a(long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5)}, this, f72816a, false, 84125, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5)}, this, f72816a, false, 84125, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
        } else if (this.o) {
            this.f72817b = j4;
            this.f72818c = j5;
            c();
        }
    }

    public final void a(int i2, int i3, long j2) {
        int i4 = i2;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), new Long(j3)}, this, f72816a, false, 84119, new Class[]{Integer.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), new Long(j3)}, this, f72816a, false, 84119, new Class[]{Integer.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE);
        } else if (i4 != 0 && this.o) {
            b();
            this.f72821f = i4;
            this.g = i3;
            this.f72817b = j3;
            this.f72818c = 0;
            invalidate();
        }
    }

    public StoryProgressViewReal(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = (int) UIUtils.dip2Px(getContext(), 10.0f);
        this.j = (int) UIUtils.dip2Px(getContext(), 2.0f);
        this.o = true;
        this.f72820e = new a(this);
        if (PatchProxy.isSupport(new Object[]{attributeSet}, this, f72816a, false, 84117, new Class[]{AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet}, this, f72816a, false, 84117, new Class[]{AttributeSet.class}, Void.TYPE);
        } else {
            this.k = -7829368;
            this.l = -1;
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.StoryProgressView);
                this.k = Integer.valueOf(obtainStyledAttributes.getColor(0, -7829368));
                this.l = Integer.valueOf(obtainStyledAttributes.getColor(1, -1));
                this.i = obtainStyledAttributes.getDimensionPixelSize(2, (int) UIUtils.dip2Px(getContext(), 10.0f));
                obtainStyledAttributes.recycle();
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f72816a, false, 84118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72816a, false, 84118, new Class[0], Void.TYPE);
            return;
        }
        this.m = new Paint();
        Paint paint = this.m;
        if (paint != null) {
            Integer num = this.k;
            if (num == null) {
                Intrinsics.throwNpe();
            }
            paint.setColor(num.intValue());
        }
        Paint paint2 = this.m;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.FILL);
        }
        Paint paint3 = this.m;
        if (paint3 != null) {
            paint3.setAntiAlias(true);
        }
        this.n = new Paint();
        Paint paint4 = this.n;
        if (paint4 != null) {
            Integer num2 = this.l;
            if (num2 == null) {
                Intrinsics.throwNpe();
            }
            paint4.setColor(num2.intValue());
        }
        Paint paint5 = this.n;
        if (paint5 != null) {
            paint5.setStyle(Paint.Style.FILL);
        }
        Paint paint6 = this.n;
        if (paint6 != null) {
            paint6.setAntiAlias(true);
        }
    }
}
