package com.ss.android.ugc.aweme.shortvideo.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 f2\u00020\u0001:\u0001fB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\fH\u0002J\u0018\u0010@\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\fH\u0002J\u0010\u0010A\u001a\u00020B2\u0006\u0010>\u001a\u00020\tH\u0002J\u0018\u0010C\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\fH\u0002J \u0010D\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010E\u001a\u00020\t2\u0006\u0010?\u001a\u00020\fH\u0002J \u0010F\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010E\u001a\u00020\t2\u0006\u0010?\u001a\u00020\fH\u0002J\u0018\u0010G\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\fH\u0002J\u0012\u0010H\u001a\u00020\u001d2\b\u0010I\u001a\u0004\u0018\u00010JH\u0014J\u0010\u0010K\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\u0012\u0010L\u001a\u00020\u001d2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002J\u0012\u0010M\u001a\u00020\u001d2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002J\u0012\u0010N\u001a\u00020\u001d2\b\u0010I\u001a\u0004\u0018\u00010JH\u0003J\u0012\u0010O\u001a\u00020\u001d2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002J\u0012\u0010P\u001a\u00020\u001d2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002J\u0012\u0010Q\u001a\u00020\u001d2\b\u0010I\u001a\u0004\u0018\u00010JH\u0003J\u0012\u0010R\u001a\u00020\u001d2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002J\u0012\u0010S\u001a\u00020\u001d2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002J\u0010\u0010T\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u0019H\u0002J0\u0010V\u001a\u00020\u001d2\u0006\u0010W\u001a\u00020\u00122\u0006\u0010X\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\t2\u0006\u0010[\u001a\u00020\tH\u0014J\u0018\u0010\\\u001a\u00020\u001d2\u0006\u0010]\u001a\u00020\t2\u0006\u0010^\u001a\u00020\tH\u0014J\u0010\u0010_\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u0019H\u0016J\b\u0010`\u001a\u00020\u001dH\u0002J\b\u0010a\u001a\u00020\u001dH\u0016J \u0010b\u001a\u00020\u001d2\u0006\u0010c\u001a\u00020\t2\u0006\u0010d\u001a\u00020\u00122\u0006\u0010e\u001a\u00020\u0012H\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R5\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001d0\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0004¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000202X\u0004¢\u0006\u0002\n\u0000R\u001a\u00108\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000e\"\u0004\b:\u0010\u0010R\u000e\u0010;\u001a\u00020<X\u000e¢\u0006\u0002\n\u0000¨\u0006g"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/widget/StoryRecordLayout;", "Lcom/ss/android/ugc/aweme/shortvideo/widget/RecordLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentStoryProgress", "", "getCurrentStoryProgress", "()J", "setCurrentStoryProgress", "(J)V", "enableHorizontalScroll", "", "getEnableHorizontalScroll", "()Z", "setEnableHorizontalScroll", "(Z)V", "eventDispatcher", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Lkotlin/ParameterName;", "name", "ev", "", "getEventDispatcher", "()Lkotlin/jvm/functions/Function1;", "setEventDispatcher", "(Lkotlin/jvm/functions/Function1;)V", "hadPendingTask", "isIntercept", "lastMode", "location", "", "startRecordRunnable", "Ljava/lang/Runnable;", "storyBorderColor", "storyBorderMaxRadius", "storyBorderMinRadius", "storyCenterColor", "storyCenterMaxRadius", "storyCenterMediumRadius", "storyCenterMinRadius", "storyProgressColor", "storyProgressPaint", "Landroid/graphics/Paint;", "storyProgressRect", "Landroid/graphics/RectF;", "storyProgressStrokeWith", "storySceneBorder", "storySceneCenterPaint", "totalRecordTime", "getTotalRecordTime", "setTotalRecordTime", "xfermode", "Landroid/graphics/PorterDuffXfermode;", "calculateStoryBorderRadius", "status", "statusChangeTime", "calculateStoryCenterRadius", "calculateStoryProgress", "", "calculateStorySceneBorderRadius", "calculateStorySceneRoundRectRadius", "combineMode", "calculateStorySceneRoundRectWidth", "calculateStorySceneTransparentCenterRadius", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "dispatchTouchEvent", "drawStory", "drawStoryCircle", "drawStoryCircleAndBorder", "drawStoryProgress", "drawStoryScene", "drawStorySceneCircle", "drawTransitionToStoryScene", "drawTransparentCenterHole", "isInRealActionSpace", "event", "onLayout", "changed", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "removePendingTask", "reset", "setMode", "mode", "shotScreen", "canStopManual", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryRecordLayout extends RecordLayout {
    public static final a A = new a((byte) 0);
    public static ChangeQuickRedirect y;
    private long B;
    private long C = 10000;
    private boolean D = true;
    @NotNull
    private Function1<? super MotionEvent, Unit> E = b.INSTANCE;
    private final int F = u.a(20.0d);
    private final int G = u.a(28.0d);
    private final int H = u.a(22.0d);
    private final int I = u.a(60.0d);
    private final int J = u.a(40.0d);
    private final int K = u.a(5.0d);
    private final int L = u.a(3.0d);
    private final int M = -1;
    private final int N = Color.parseColor("#20d5ec");
    private final int O = Color.parseColor("#28ffffff");
    private int P = 241;
    private final Paint Q;
    private final Paint R;
    private RectF S;
    private boolean T;
    private PorterDuffXfermode U = new PorterDuffXfermode(PorterDuff.Mode.XOR);
    private final int[] V = new int[2];
    private Runnable W = new c(this);
    public boolean z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/widget/StoryRecordLayout$Companion;", "", "()V", "MIN_STORY_RECORD_PHOTO_TIME", "", "MODE_STORY", "", "MODE_STORY_BOOM", "MODE_STORY_SCENE", "STATUS_TRANSITION_CHANGE_MODE_STORY_BOOM_TO_STORY_SCENE", "STATUS_TRANSITION_CHANGE_MODE_STORY_SCENE_TO_STORY", "STATUS_TRANSITION_CHANGE_MODE_TO_STORY_RECORD", "STATUS_TRANSITION_STORY_SHOOT", "STATUS_TRANSITION_STORY_SHOOT_IDEL", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/MotionEvent;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<MotionEvent, Unit> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(1);
        }

        public final void invoke(@NotNull MotionEvent motionEvent) {
            MotionEvent motionEvent2 = motionEvent;
            if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, changeQuickRedirect, false, 81454, new Class[]{MotionEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, changeQuickRedirect, false, 81454, new Class[]{MotionEvent.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(motionEvent2, AdvanceSetting.NETWORK_TYPE);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((MotionEvent) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71383a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryRecordLayout f71384b;

        c(StoryRecordLayout storyRecordLayout) {
            this.f71384b = storyRecordLayout;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f71383a, false, 81455, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71383a, false, 81455, new Class[0], Void.TYPE);
                return;
            }
            if (this.f71384b.w != null) {
                this.f71384b.z = false;
                this.f71384b.h = 1;
                this.f71384b.b(2);
                this.f71384b.invalidate();
                this.f71384b.w.c();
            }
        }
    }

    public final long getCurrentStoryProgress() {
        return this.B;
    }

    public final boolean getEnableHorizontalScroll() {
        return this.D;
    }

    @NotNull
    public final Function1<MotionEvent, Unit> getEventDispatcher() {
        return this.E;
    }

    public final long getTotalRecordTime() {
        return this.C;
    }

    private final void e() {
        if (PatchProxy.isSupport(new Object[0], this, y, false, 81451, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, y, false, 81451, new Class[0], Void.TYPE);
            return;
        }
        if (this.z) {
            removeCallbacks(this.W);
            this.z = false;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, y, false, 81430, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, y, false, 81430, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.B = 0;
    }

    public final void setCurrentStoryProgress(long j) {
        this.B = j;
    }

    public final void setEnableHorizontalScroll(boolean z2) {
        this.D = z2;
    }

    public final void setTotalRecordTime(long j) {
        this.C = j;
    }

    private final float c(int i) {
        if (i != 3) {
            return 0.0f;
        }
        float f2 = (360.0f / ((float) this.C)) * ((float) this.B);
        if (f2 > 360.0f) {
            return 360.0f;
        }
        return f2;
    }

    public final void setEventDispatcher(@NotNull Function1<? super MotionEvent, Unit> function1) {
        Function1<? super MotionEvent, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{function12}, this, y, false, 81428, new Class[]{Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function12}, this, y, false, 81428, new Class[]{Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function12, "<set-?>");
        this.E = function12;
    }

    private final void a(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, y, false, 81440, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, y, false, 81440, new Class[]{Canvas.class}, Void.TYPE);
        } else if (this.S != null && canvas != null) {
            RectF rectF = this.S;
            if (rectF == null) {
                Intrinsics.throwNpe();
            }
            canvas.drawArc(rectF, -90.0f, c(this.f71363e), false, this.Q);
        }
    }

    private final void c(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, y, false, 81442, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, y, false, 81442, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        b(canvas);
        d(canvas);
        if (uptimeMillis - this.m > 200) {
            b(1);
            invalidate();
            return;
        }
        if (this.f71363e != 1) {
            invalidate();
        }
    }

    private final void d(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, y, false, 81443, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, y, false, 81443, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        int a2 = a(this.f71363e, this.m);
        if (a2 > 0) {
            this.R.setXfermode(this.U);
            if (canvas != null) {
                canvas.drawCircle((float) (getMeasuredWidth() >> 1), (float) (getMeasuredHeight() >> 1), (float) a2, this.R);
            }
            this.R.setXfermode(null);
        }
    }

    public StoryRecordLayout(@Nullable Context context) {
        super(context);
        Paint paint = new Paint();
        paint.setColor(this.N);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth((float) this.L);
        paint.setAntiAlias(true);
        this.Q = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        this.R = paint2;
    }

    @SuppressLint({"useChinaStyleVersion"})
    private final void b(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, y, false, 81441, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, y, false, 81441, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        int b2 = b(this.f71363e, this.m);
        int c2 = c(this.f71363e, this.m);
        Paint paint = this.i;
        Intrinsics.checkExpressionValueIsNotNull(paint, "mPaint");
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.j;
        Intrinsics.checkExpressionValueIsNotNull(paint2, "mTransparentPaint");
        paint2.setStyle(Paint.Style.FILL);
        if (c2 > 0 && canvas != null) {
            canvas.drawCircle((float) (getMeasuredWidth() >> 1), (float) (getMeasuredHeight() >> 1), (float) c2, this.j);
        }
        if (canvas != null) {
            canvas.drawCircle((float) (getMeasuredWidth() >> 1), (float) (getMeasuredHeight() >> 1), (float) b2, this.i);
        }
        Paint paint3 = this.i;
        Intrinsics.checkExpressionValueIsNotNull(paint3, "mPaint");
        paint3.setStyle(Paint.Style.STROKE);
        Paint paint4 = this.j;
        Intrinsics.checkExpressionValueIsNotNull(paint4, "mTransparentPaint");
        paint4.setStyle(Paint.Style.STROKE);
    }

    public final boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, y, false, 81434, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, y, false, 81434, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        if (this.D) {
            return super.dispatchTouchEvent(motionEvent);
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.T = true;
                this.f71360b = motionEvent.getX();
                this.f71361c = motionEvent.getY();
                this.E.invoke(motionEvent);
                break;
            case 1:
            case 3:
                if (!this.T) {
                    this.E.invoke(motionEvent);
                    break;
                }
                break;
            case 2:
                if (this.f71363e != 2 && this.f71363e != 3) {
                    if (Math.abs(Math.abs(motionEvent.getX() - this.f71360b) - Math.abs(motionEvent.getY() - this.f71361c)) <= ((float) ViewConfiguration.getTouchSlop())) {
                        this.T = true;
                        break;
                    } else {
                        this.h = 0;
                        e();
                        this.T = false;
                        this.E.invoke(motionEvent);
                        break;
                    }
                } else {
                    this.T = true;
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean z2;
        MotionEvent motionEvent2 = motionEvent;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, y, false, 81435, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, y, false, 81435, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(motionEvent2, "event");
        int action = motionEvent.getAction();
        if (!isEnabled()) {
            if (action == 0) {
                RecordLayout.a aVar = this.w;
                if (aVar != null) {
                    aVar.ao_();
                }
                return false;
            }
            e();
        }
        if (action == 0 && System.currentTimeMillis() - this.r < 300) {
            return true;
        }
        switch (action) {
            case 0:
                if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, y, false, 81450, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, y, false, 81450, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                } else {
                    getLocationOnScreen(this.V);
                    int dip2Px = (int) UIUtils.dip2Px(getContext(), 20.0f);
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    int measuredWidth = (this.V[0] + getMeasuredWidth()) - dip2Px;
                    int i = this.V[1] + dip2Px;
                    int measuredHeight = (this.V[1] + getMeasuredHeight()) - dip2Px;
                    if (rawX < ((float) (this.V[0] + dip2Px)) || rawX > ((float) measuredWidth) || rawY < ((float) i) || rawY > ((float) measuredHeight)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
                if (z2) {
                    boolean z4 = !this.w.ap_();
                    if (z4) {
                        this.f71360b = motionEvent.getX();
                        this.f71361c = motionEvent.getY();
                        this.f71362d = this.f71361c;
                        if (this.f71364f == 241) {
                            postDelayed(this.W, 150);
                            this.z = true;
                        } else if (this.f71364f == 242) {
                            if (this.u || !(this.f71363e == 3 || this.f71363e == 2)) {
                                b(2);
                                this.w.c();
                                invalidate();
                            }
                        } else if (this.f71364f == 243) {
                            if (this.f71363e == 3 || this.f71363e == 2) {
                                this.w.d();
                                b(4);
                                invalidate();
                            } else {
                                postDelayed(this.W, 150);
                                this.z = true;
                            }
                        }
                        z3 = z4;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
            case 3:
                this.r = System.currentTimeMillis();
                if (this.D || this.T) {
                    if ((this.g == 0 || this.g == 1) && this.o) {
                        setHasBeenMoveScaled(false);
                        this.w.f();
                    }
                    if (this.f71364f != 241) {
                        if (this.f71364f == 243) {
                            e();
                            this.h = 0;
                            if (this.f71363e >= 2 && this.f71363e != 241) {
                                this.w.d();
                                b(4);
                                invalidate();
                                break;
                            } else {
                                b(2);
                                invalidate();
                                this.w.c();
                                break;
                            }
                        }
                    } else if (this.f71363e >= 2 && this.f71363e != 241) {
                        this.w.d();
                        b(4);
                        invalidate();
                        break;
                    } else {
                        this.w.e();
                        this.h = 0;
                        e();
                        b(242);
                        invalidate();
                        break;
                    }
                } else {
                    e();
                    return false;
                }
                break;
            case 2:
                if (this.D || this.T) {
                    this.k = motionEvent.getX() - this.f71360b;
                    this.l = motionEvent.getY() - this.f71361c;
                    if (this.g == 0 || this.g == 1) {
                        this.w.a_(-motionEvent.getY());
                        this.f71362d = motionEvent.getY();
                        break;
                    }
                } else {
                    return false;
                }
                break;
            default:
                z3 = false;
                break;
        }
        if (this.v != null && !d()) {
            this.v.onTouchEvent(motionEvent2);
        }
        return z3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0173, code lost:
        if (r0 <= r4) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0272, code lost:
        if (r0 < r2) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0274, code lost:
        r12 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0396, code lost:
        if (r10 < r4) goto L_0x0398;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x03d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchDraw(@org.jetbrains.annotations.Nullable android.graphics.Canvas r23) {
        /*
            r22 = this;
            r7 = r22
            r8 = r23
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = y
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 81433(0x13e19, float:1.14112E-40)
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = y
            r3 = 0
            r4 = 81433(0x13e19, float:1.14112E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            int r0 = r7.f71363e
            r1 = 244(0xf4, float:3.42E-43)
            if (r0 != r1) goto L_0x0042
            r22.c((android.graphics.Canvas) r23)
            return
        L_0x0042:
            int r0 = r7.f71363e
            r1 = 245(0xf5, float:3.43E-43)
            if (r0 != r1) goto L_0x004c
            r22.c((android.graphics.Canvas) r23)
            return
        L_0x004c:
            int r0 = r7.f71364f
            r11 = 242(0xf2, float:3.39E-43)
            r12 = 241(0xf1, float:3.38E-43)
            r13 = 4
            r14 = 243(0xf3, float:3.4E-43)
            r15 = 300(0x12c, double:1.48E-321)
            r6 = 3
            r5 = 2
            if (r0 == r12) goto L_0x03da
            int r0 = r7.f71364f
            if (r0 != r11) goto L_0x0061
            goto L_0x03da
        L_0x0061:
            int r0 = r7.f71364f
            if (r0 != r14) goto L_0x0415
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = y
            r3 = 0
            r4 = 81437(0x13e1d, float:1.14118E-40)
            java.lang.Class[] r11 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r11[r10] = r1
            java.lang.Class r12 = java.lang.Void.TYPE
            r1 = r22
            r14 = 2
            r5 = r11
            r11 = 3
            r6 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x009b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = y
            r3 = 0
            r4 = 81437(0x13e1d, float:1.14118E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x009b:
            long r0 = android.os.SystemClock.uptimeMillis()
            int r2 = r7.f71363e
            if (r2 != r13) goto L_0x00ae
            long r2 = r7.m
            long r2 = r0 - r2
            int r4 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ae
            r7.b((int) r9)
        L_0x00ae:
            int r2 = r7.f71363e
            if (r2 != r14) goto L_0x00bc
            long r2 = r7.m
            long r0 = r0 - r2
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x00bc
            r7.b((int) r11)
        L_0x00bc:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = y
            r3 = 0
            r4 = 81438(0x13e1e, float:1.14119E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00ee
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = y
            r3 = 0
            r4 = 81438(0x13e1e, float:1.14119E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00ee:
            int r12 = r7.f71363e
            long r5 = r7.m
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r10] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r5)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = y
            r3 = 0
            r4 = 81444(0x13e24, float:1.14127E-40)
            java.lang.Class[] r13 = new java.lang.Class[r14]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r13[r10] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r13[r9] = r1
            java.lang.Class r15 = java.lang.Integer.TYPE
            r1 = r22
            r17 = r5
            r5 = r13
            r6 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r13 = 1133903872(0x43960000, float:300.0)
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0153
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r10] = r1
            java.lang.Long r1 = new java.lang.Long
            r2 = r17
            r1.<init>(r2)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = y
            r3 = 0
            r4 = 81444(0x13e24, float:1.14127E-40)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r22
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x018d
        L_0x0153:
            r2 = r17
            long r0 = android.os.SystemClock.uptimeMillis()
            int r4 = r7.J
            int r5 = r7.K
            int r4 = r4 - r5
            switch(r12) {
                case 2: goto L_0x0179;
                case 3: goto L_0x0176;
                case 4: goto L_0x0163;
                default: goto L_0x0161;
            }
        L_0x0161:
            r0 = 0
            goto L_0x018d
        L_0x0163:
            int r5 = r7.I
            float r5 = (float) r5
            int r6 = r7.I
            int r6 = r6 - r4
            float r6 = (float) r6
            float r6 = r6 * r15
            float r6 = r6 / r13
            long r0 = r0 - r2
            float r0 = (float) r0
            float r6 = r6 * r0
            float r5 = r5 - r6
            int r0 = (int) r5
            if (r0 > r4) goto L_0x018d
            goto L_0x0161
        L_0x0176:
            int r0 = r7.I
            goto L_0x018d
        L_0x0179:
            float r5 = (float) r4
            int r6 = r7.I
            int r6 = r6 - r4
            float r4 = (float) r6
            float r4 = r4 * r15
            float r4 = r4 / r13
            long r0 = r0 - r2
            float r0 = (float) r0
            float r4 = r4 * r0
            float r5 = r5 + r4
            int r0 = (int) r5
            int r1 = r7.I
            if (r0 <= r1) goto L_0x018d
            int r0 = r7.I
        L_0x018d:
            android.graphics.Paint r1 = r7.j
            java.lang.String r2 = "mTransparentPaint"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            if (r0 <= 0) goto L_0x01af
            if (r8 == 0) goto L_0x01af
            int r1 = r22.getMeasuredWidth()
            int r1 = r1 >> r9
            float r1 = (float) r1
            int r2 = r22.getMeasuredHeight()
            int r2 = r2 >> r9
            float r2 = (float) r2
            float r0 = (float) r0
            android.graphics.Paint r3 = r7.j
            r8.drawCircle(r1, r2, r0, r3)
        L_0x01af:
            int r12 = r7.f71363e
            int r6 = r7.h
            long r4 = r7.m
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0[r9] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = y
            r3 = 0
            r16 = 81445(0x13e25, float:1.14129E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r1[r10] = r17
            java.lang.Class r17 = java.lang.Integer.TYPE
            r1[r9] = r17
            java.lang.Class r17 = java.lang.Long.TYPE
            r1[r14] = r17
            java.lang.Class r17 = java.lang.Integer.TYPE
            r18 = r1
            r1 = r22
            r13 = r4
            r4 = r16
            r5 = r18
            r19 = r6
            r6 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0233
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r0[r9] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r13)
            r2 = 2
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r3 = y
            r4 = 0
            r5 = 81445(0x13e25, float:1.14129E-40)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r6[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r6[r9] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r6[r2] = r1
            java.lang.Class r12 = java.lang.Integer.TYPE
            r1 = r22
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L_0x0230:
            r12 = r0
            goto L_0x02be
        L_0x0233:
            long r0 = android.os.SystemClock.uptimeMillis()
            int r2 = r7.J
            float r2 = (float) r2
            r3 = 1036831949(0x3dcccccd, float:0.1)
            float r2 = r2 * r3
            int r2 = (int) r2
            r3 = r19
            if (r3 != 0) goto L_0x0279
            switch(r12) {
                case 1: goto L_0x0276;
                case 2: goto L_0x0260;
                case 3: goto L_0x0274;
                case 4: goto L_0x0249;
                default: goto L_0x0247;
            }
        L_0x0247:
            goto L_0x02bd
        L_0x0249:
            float r3 = (float) r2
            int r4 = r7.J
            int r4 = r4 - r2
            float r2 = (float) r4
            float r2 = r2 * r15
            long r0 = r0 - r13
            float r0 = (float) r0
            float r2 = r2 * r0
            r0 = 1133903872(0x43960000, float:300.0)
            float r2 = r2 / r0
            float r3 = r3 + r2
            int r0 = (int) r3
            int r1 = r7.J
            if (r0 <= r1) goto L_0x0230
            int r0 = r7.J
            goto L_0x0230
        L_0x0260:
            int r3 = r7.J
            float r3 = (float) r3
            int r4 = r7.J
            int r4 = r4 - r2
            float r4 = (float) r4
            float r4 = r4 * r15
            long r0 = r0 - r13
            float r0 = (float) r0
            float r4 = r4 * r0
            r0 = 1133903872(0x43960000, float:300.0)
            float r4 = r4 / r0
            float r3 = r3 - r4
            int r0 = (int) r3
            if (r0 >= r2) goto L_0x0230
        L_0x0274:
            r12 = r2
            goto L_0x02be
        L_0x0276:
            int r0 = r7.J
            goto L_0x0230
        L_0x0279:
            if (r3 != r9) goto L_0x02bd
            switch(r12) {
                case 1: goto L_0x02b9;
                case 2: goto L_0x029d;
                case 3: goto L_0x029a;
                case 4: goto L_0x027f;
                default: goto L_0x027e;
            }
        L_0x027e:
            goto L_0x02bd
        L_0x027f:
            int r2 = r7.H
            float r2 = (float) r2
            int r3 = r7.J
            int r4 = r7.H
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 * r15
            r4 = 1133903872(0x43960000, float:300.0)
            float r3 = r3 / r4
            long r0 = r0 - r13
            float r0 = (float) r0
            float r3 = r3 * r0
            float r2 = r2 + r3
            int r0 = (int) r2
            int r1 = r7.J
            if (r0 <= r1) goto L_0x0230
            int r0 = r7.J
            goto L_0x0230
        L_0x029a:
            int r0 = r7.H
            goto L_0x0230
        L_0x029d:
            int r2 = r7.J
            float r2 = (float) r2
            int r3 = r7.J
            int r4 = r7.H
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 * r15
            r4 = 1133903872(0x43960000, float:300.0)
            float r3 = r3 / r4
            long r0 = r0 - r13
            float r0 = (float) r0
            float r3 = r3 * r0
            float r2 = r2 - r3
            int r0 = (int) r2
            int r1 = r7.H
            if (r0 >= r1) goto L_0x0230
            int r0 = r7.H
            goto L_0x0230
        L_0x02b9:
            int r0 = r7.J
            goto L_0x0230
        L_0x02bd:
            r12 = 0
        L_0x02be:
            int r0 = r22.getMeasuredWidth()
            r1 = 2
            int r13 = r0 / 2
            int r0 = r22.getMeasuredHeight()
            int r14 = r0 / 2
            int r6 = r7.f71363e
            int r5 = r7.h
            long r3 = r7.m
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r0[r10] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r0[r9] = r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r3)
            r0[r1] = r2
            com.meituan.robust.ChangeQuickRedirect r2 = y
            r16 = 0
            r17 = 81446(0x13e26, float:1.1413E-40)
            java.lang.Class[] r15 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Integer.TYPE
            r15[r10] = r18
            java.lang.Class r18 = java.lang.Integer.TYPE
            r15[r9] = r18
            java.lang.Class r18 = java.lang.Long.TYPE
            r15[r1] = r18
            java.lang.Class r18 = java.lang.Integer.TYPE
            r1 = r22
            r20 = r3
            r3 = r16
            r4 = r17
            r16 = r5
            r5 = r15
            r15 = r6
            r6 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0351
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r0[r9] = r1
            java.lang.Long r1 = new java.lang.Long
            r2 = r20
            r1.<init>(r2)
            r2 = 2
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r3 = y
            r4 = 0
            r5 = 81446(0x13e26, float:1.1413E-40)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r6[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r6[r9] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r6[r2] = r1
            java.lang.Class r10 = java.lang.Integer.TYPE
            r1 = r22
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r10 = r0.intValue()
            goto L_0x039c
        L_0x0351:
            r2 = r20
            long r0 = android.os.SystemClock.uptimeMillis()
            if (r16 != 0) goto L_0x0363
            int r4 = r7.H
            float r4 = (float) r4
            r5 = 1061997773(0x3f4ccccd, float:0.8)
            float r4 = r4 * r5
            int r4 = (int) r4
            goto L_0x0365
        L_0x0363:
            int r4 = r7.H
        L_0x0365:
            switch(r15) {
                case 1: goto L_0x039a;
                case 2: goto L_0x0382;
                case 3: goto L_0x0398;
                case 4: goto L_0x0369;
                default: goto L_0x0368;
            }
        L_0x0368:
            goto L_0x039c
        L_0x0369:
            float r5 = (float) r4
            int r6 = r7.J
            int r6 = r6 - r4
            float r4 = (float) r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r6
            r6 = 1133903872(0x43960000, float:300.0)
            float r4 = r4 / r6
            long r0 = r0 - r2
            float r0 = (float) r0
            float r4 = r4 * r0
            float r5 = r5 + r4
            int r10 = (int) r5
            int r0 = r7.J
            if (r10 <= r0) goto L_0x039c
            int r10 = r7.J
            goto L_0x039c
        L_0x0382:
            int r5 = r7.J
            float r5 = (float) r5
            int r6 = r7.J
            int r6 = r6 - r4
            float r6 = (float) r6
            r10 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 * r10
            r10 = 1133903872(0x43960000, float:300.0)
            float r6 = r6 / r10
            long r0 = r0 - r2
            float r0 = (float) r0
            float r6 = r6 * r0
            float r5 = r5 - r6
            int r10 = (int) r5
            if (r10 >= r4) goto L_0x039c
        L_0x0398:
            r10 = r4
            goto L_0x039c
        L_0x039a:
            int r10 = r7.J
        L_0x039c:
            android.graphics.Paint r0 = r7.i
            java.lang.String r1 = "mPaint"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.RectF r0 = r7.n
            int r1 = r13 - r10
            float r1 = (float) r1
            r0.left = r1
            android.graphics.RectF r0 = r7.n
            int r1 = r14 - r10
            float r1 = (float) r1
            r0.top = r1
            android.graphics.RectF r0 = r7.n
            int r13 = r13 + r10
            float r1 = (float) r13
            r0.right = r1
            android.graphics.RectF r0 = r7.n
            int r14 = r14 + r10
            float r1 = (float) r14
            r0.bottom = r1
            if (r8 == 0) goto L_0x03cc
            android.graphics.RectF r0 = r7.n
            float r1 = (float) r12
            android.graphics.Paint r2 = r7.i
            r8.drawRoundRect(r0, r1, r1, r2)
        L_0x03cc:
            r22.d(r23)
            r22.a(r23)
            int r0 = r7.f71363e
            if (r0 == r9) goto L_0x0415
            r22.invalidate()
            goto L_0x0415
        L_0x03da:
            r5 = 3
            r6 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = y
            r3 = 0
            r4 = 81436(0x13e1c, float:1.14116E-40)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r17 = android.graphics.Canvas.class
            r1[r10] = r17
            java.lang.Class r17 = java.lang.Void.TYPE
            r18 = r1
            r1 = r22
            r11 = 3
            r5 = r18
            r14 = 2
            r6 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0416
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = y
            r3 = 0
            r4 = 81436(0x13e1c, float:1.14116E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x0415:
            return
        L_0x0416:
            long r0 = android.os.SystemClock.uptimeMillis()
            int r2 = r7.f71363e
            if (r2 != r12) goto L_0x0429
            long r2 = r7.m
            long r2 = r0 - r2
            int r4 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x0429
            r7.b((int) r9)
        L_0x0429:
            int r2 = r7.f71363e
            if (r2 != r14) goto L_0x0438
            long r2 = r7.m
            long r2 = r0 - r2
            int r4 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x0438
            r7.b((int) r11)
        L_0x0438:
            int r2 = r7.f71363e
            if (r2 != r13) goto L_0x044a
            long r2 = r7.m
            long r2 = r0 - r2
            int r4 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x044a
            r7.b((int) r9)
            r22.invalidate()
        L_0x044a:
            int r2 = r7.f71363e
            r3 = 150(0x96, double:7.4E-322)
            r5 = 243(0xf3, float:3.4E-43)
            if (r2 != r5) goto L_0x0460
            long r5 = r7.m
            long r5 = r0 - r5
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0460
            r7.b((int) r9)
            r22.invalidate()
        L_0x0460:
            int r2 = r7.f71363e
            r5 = 242(0xf2, float:3.39E-43)
            if (r2 != r5) goto L_0x0475
            long r5 = r7.m
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0475
            r0 = 243(0xf3, float:3.4E-43)
            r7.b((int) r0)
            r22.invalidate()
        L_0x0475:
            android.graphics.Paint r0 = r7.i
            java.lang.String r1 = "mPaint"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r1 = r7.M
            r0.setColor(r1)
            android.graphics.Paint r0 = r7.j
            java.lang.String r1 = "mTransparentPaint"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r1 = r7.O
            r0.setColor(r1)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = y
            r3 = 0
            r4 = 81439(0x13e1f, float:1.1412E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x04bf
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = y
            r3 = 0
            r4 = 81439(0x13e1f, float:1.1412E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x04dc
        L_0x04bf:
            long r0 = android.os.SystemClock.uptimeMillis()
            int r2 = r7.f71363e
            if (r2 != r13) goto L_0x04d9
            r2 = 0
            r7.k = r2
            r7.l = r2
            long r2 = r7.m
            long r0 = r0 - r2
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x04d9
            r7.b((int) r9)
            r22.invalidate()
        L_0x04d9:
            r22.b(r23)
        L_0x04dc:
            r22.a(r23)
            int r0 = r7.f71363e
            if (r0 == r9) goto L_0x04e6
            r22.invalidate()
        L_0x04e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.widget.StoryRecordLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, y, false, 81431, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, y, false, 81431, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        if (this.S == null) {
            int i3 = this.I - (this.L / 2);
            this.S = new RectF((float) ((getMeasuredWidth() / 2) - i3), (float) ((getMeasuredHeight() / 2) - i3), (float) ((getMeasuredWidth() / 2) + i3), (float) ((getMeasuredHeight() / 2) + i3));
        }
    }

    private final int a(int i, long j) {
        int i2 = i;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, y, false, 81447, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, y, false, 81447, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int i3 = this.J - this.K;
        if (i2 == 1) {
            return i3;
        }
        if (i2 != 4) {
            switch (i2) {
                case 244:
                    break;
                case 245:
                    float f2 = (float) i3;
                    int i4 = (int) (f2 - (((1.0f * f2) / 200.0f) * ((float) (uptimeMillis - j2))));
                    if (i4 < 0) {
                        return 0;
                    }
                    return i4;
                default:
                    return 0;
            }
        }
        int i5 = (int) (((((float) i3) * 1.0f) / 200.0f) * ((float) (uptimeMillis - j2)));
        if (i5 > i3) {
            return i3;
        }
        return i5;
    }

    private final int c(int i, long j) {
        int i2 = i;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, y, false, 81449, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, y, false, 81449, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i2 != 241) {
            if (i2 != 245) {
                switch (i2) {
                    case 1:
                        break;
                    case 2:
                        int i3 = this.J + ((int) (((((float) (this.I - this.J)) * 1.0f) / 300.0f) * ((float) (uptimeMillis - j2))));
                        if (i3 > this.I) {
                            return this.I;
                        }
                        return i3;
                    case 3:
                        return this.I;
                    case 4:
                        int i4 = this.I - ((int) (((((float) (this.I - this.J)) * 1.0f) / 300.0f) * ((float) (uptimeMillis - j2))));
                        if (i4 < this.J) {
                            return this.J;
                        }
                        return i4;
                    default:
                        return this.J;
                }
            } else {
                int i5 = (int) (((((float) this.J) * 1.0f) / 200.0f) * ((float) (uptimeMillis - j2)));
                if (i5 > this.J) {
                    i5 = this.J;
                }
                return i5;
            }
        }
        if (this.f71364f == 243) {
            return 0;
        }
        return this.J;
    }

    public StoryRecordLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        paint.setColor(this.N);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth((float) this.L);
        paint.setAntiAlias(true);
        this.Q = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        this.R = paint2;
    }

    private final int b(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, y, false, 81448, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, y, false, 81448, new Class[]{Integer.TYPE, Long.TYPE}, Integer.TYPE)).intValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        switch (i) {
            case 1:
                break;
            case 2:
                int i2 = this.G - ((int) (((((float) (this.G - this.H)) * 1.0f) / 300.0f) * ((float) (uptimeMillis - j2))));
                if (i2 < this.H) {
                    return this.H;
                }
                return i2;
            case 3:
                return this.H;
            case 4:
                int i3 = this.H + ((int) (((((float) (this.G - this.H)) * 1.0f) / 300.0f) * ((float) (uptimeMillis - j2))));
                if (i3 > this.G) {
                    return this.G;
                }
                return i3;
            default:
                switch (i) {
                    case 241:
                        break;
                    case 242:
                        int i4 = this.G - ((int) (((((float) (this.G - this.F)) * 1.0f) / 150.0f) * ((float) (uptimeMillis - j2))));
                        if (i4 < this.F) {
                            return this.F;
                        }
                        return i4;
                    case 243:
                        int i5 = this.F + ((int) (((((float) (this.G - this.F)) * 1.0f) / 150.0f) * ((float) (uptimeMillis - j2))));
                        if (i5 > this.G) {
                            return this.G;
                        }
                        return i5;
                    case 244:
                        int i6 = (int) (((float) this.G) + (((((float) (this.J - this.G)) * 1.0f) / 200.0f) * ((float) (uptimeMillis - j2))));
                        if (i6 > this.J) {
                            i6 = this.J;
                        }
                        return i6;
                    case 245:
                        int i7 = (int) (((float) this.J) - (((((float) (this.J - this.G)) * 1.0f) / 200.0f) * ((float) (uptimeMillis - j2))));
                        if (i7 < this.G) {
                            i7 = this.G;
                        }
                        return i7;
                    default:
                        return this.G;
                }
        }
        if (this.f71364f == 243) {
            return this.J;
        }
        return this.G;
    }

    public final void a(int i, boolean z2, boolean z3) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, y, false, 81429, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z2), Byte.valueOf(z3)}, this, y, false, 81429, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.s = this.t;
        this.P = this.f71364f;
        this.f71364f = i2;
        this.t = z2;
        this.u = z3;
        if (!this.p) {
            invalidate();
            this.p = !this.p;
            return;
        }
        switch (i2) {
            case 241:
                Paint paint = this.i;
                Intrinsics.checkExpressionValueIsNotNull(paint, "mPaint");
                paint.setColor(this.M);
                Paint paint2 = this.j;
                Intrinsics.checkExpressionValueIsNotNull(paint2, "mTransparentPaint");
                paint2.setColor(this.O);
                if (this.P != 243) {
                    b(1);
                    break;
                } else {
                    b(245);
                    break;
                }
            case 242:
                Paint paint3 = this.i;
                Intrinsics.checkExpressionValueIsNotNull(paint3, "mPaint");
                paint3.setColor(this.M);
                Paint paint4 = this.j;
                Intrinsics.checkExpressionValueIsNotNull(paint4, "mTransparentPaint");
                paint4.setColor(this.O);
                if (this.P != 243) {
                    b(1);
                    break;
                } else {
                    b(245);
                    break;
                }
            case 243:
                setLayerType(2, null);
                Paint paint5 = this.i;
                Intrinsics.checkExpressionValueIsNotNull(paint5, "mPaint");
                paint5.setColor(this.M);
                Paint paint6 = this.j;
                Intrinsics.checkExpressionValueIsNotNull(paint6, "mTransparentPaint");
                paint6.setColor(this.O);
                b(244);
                break;
        }
        invalidate();
    }

    public StoryRecordLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setColor(this.N);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth((float) this.L);
        paint.setAntiAlias(true);
        this.Q = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        this.R = paint2;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, y, false, 81432, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, y, false, 81432, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z2, i, i2, i3, i4);
        getLocationOnScreen(this.V);
    }
}
