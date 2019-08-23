package com.ss.android.ugc.aweme.feed.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020,H\u0016R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dRJ\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00150\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/LiveSkyLightTouchEventFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "style", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "callBack", "Lkotlin/Function0;", "", "getCallBack", "()Lkotlin/jvm/functions/Function0;", "setCallBack", "(Lkotlin/jvm/functions/Function0;)V", "intercept", "", "lastX", "", "lastY", "needIntercept", "getNeedIntercept", "()Z", "setNeedIntercept", "(Z)V", "scrollPredicate", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "dx", "dy", "getScrollPredicate", "()Lkotlin/jvm/functions/Function2;", "setScrollPredicate", "(Lkotlin/jvm/functions/Function2;)V", "startTime", "", "handleTouchEvent", "event", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", "ev", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LiveSkyLightTouchEventFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46212a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f46213b;

    /* renamed from: c  reason: collision with root package name */
    private float f46214c;

    /* renamed from: d  reason: collision with root package name */
    private float f46215d;

    /* renamed from: e  reason: collision with root package name */
    private long f46216e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private Function0<Unit> f46217f = a.INSTANCE;
    @NotNull
    private Function2<? super Float, ? super Float, Boolean> g = b.INSTANCE;
    private boolean h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<Unit> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function2<Float, Float, Boolean> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(2);
        }

        public final boolean invoke(float f2, float f3) {
            return false;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue()));
        }
    }

    @NotNull
    public final Function0<Unit> getCallBack() {
        return this.f46217f;
    }

    public final boolean getNeedIntercept() {
        return this.h;
    }

    @NotNull
    public final Function2<Float, Float, Boolean> getScrollPredicate() {
        return this.g;
    }

    public final void setNeedIntercept(boolean z) {
        this.h = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveSkyLightTouchEventFrameLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setCallBack(@NotNull Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{function02}, this, f46212a, false, 42871, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function02}, this, f46212a, false, 42871, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function02, "<set-?>");
        this.f46217f = function02;
    }

    public final void setScrollPredicate(@NotNull Function2<? super Float, ? super Float, Boolean> function2) {
        Function2<? super Float, ? super Float, Boolean> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{function22}, this, f46212a, false, 42872, new Class[]{Function2.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function22}, this, f46212a, false, 42872, new Class[]{Function2.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function22, "<set-?>");
        this.g = function22;
    }

    public final boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f46212a, false, 42873, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46212a, false, 42873, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        super.onInterceptTouchEvent(motionEvent);
        if (!PatchProxy.isSupport(new Object[]{motionEvent}, this, f46212a, false, 42874, new Class[]{MotionEvent.class}, Void.TYPE)) {
            this.f46213b = false;
            switch (motionEvent.getAction()) {
                case 0:
                    this.f46214c = motionEvent.getX();
                    this.f46215d = motionEvent.getY();
                    this.f46216e = System.currentTimeMillis();
                    break;
                case 1:
                    if (this.h) {
                        float x = motionEvent.getX() - this.f46214c;
                        float y = motionEvent.getY() - this.f46215d;
                        if (Math.abs(x) < ((float) CustomInterceptTouchEventFrameLayout.f46086b) && Math.abs(y) < ((float) CustomInterceptTouchEventFrameLayout.f46086b)) {
                            this.f46217f.invoke();
                            this.f46213b = true;
                            break;
                        }
                    }
                    break;
                case 2:
                    if (this.h) {
                        float x2 = motionEvent.getX() - this.f46214c;
                        float y2 = motionEvent.getY() - this.f46215d;
                        if (Math.abs(x2) <= ((float) CustomInterceptTouchEventFrameLayout.f46086b) && Math.abs(y2) <= ((float) CustomInterceptTouchEventFrameLayout.f46086b)) {
                            if (System.currentTimeMillis() - this.f46216e > ((long) ViewConfiguration.getDoubleTapTimeout())) {
                                this.f46217f.invoke();
                                this.f46213b = true;
                                break;
                            }
                        } else if (((Boolean) this.g.invoke(Float.valueOf(x2), Float.valueOf(y2))).booleanValue()) {
                            this.f46217f.invoke();
                            this.f46213b = true;
                            break;
                        }
                    }
                    break;
            }
        } else {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46212a, false, 42874, new Class[]{MotionEvent.class}, Void.TYPE);
        }
        return this.f46213b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveSkyLightTouchEventFrameLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attr");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public LiveSkyLightTouchEventFrameLayout(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attr");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public LiveSkyLightTouchEventFrameLayout(@NotNull Context context, @NotNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attr");
    }
}
