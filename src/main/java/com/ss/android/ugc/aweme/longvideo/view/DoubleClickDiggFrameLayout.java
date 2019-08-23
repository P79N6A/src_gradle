package com.ss.android.ugc.aweme.longvideo.view;

import android.content.Context;
import android.os.Message;
import android.support.v4.util.Pair;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.DiggLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002:\u00018B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010*\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J&\u0010-\u001a\u00020\u00132\b\u0010.\u001a\u0004\u0018\u00010\u00162\b\u0010/\u001a\u0004\u0018\u00010\u00162\b\u00100\u001a\u0004\u0018\u00010\u0016H\u0002J\u001c\u00101\u001a\u00020\u00132\b\u00102\u001a\u0004\u0018\u00010\u00162\b\u00103\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u00104\u001a\u00020\u00132\b\u00105\u001a\u0004\u0018\u00010\u0016J\u000e\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020#R\u0014\u0010\f\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/view/DoubleClickDiggFrameLayout;", "Lcom/ss/android/ugc/aweme/common/widget/DiggLayout;", "Lcom/bytedance/common/utility/collection/WeakHandler$IHandler;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "MSG_AUTO_CLEAN", "getMSG_AUTO_CLEAN", "()I", "MSG_TAP", "getMSG_TAP", "doubleTapSlop", "mAlwaysInBiggerTapRegion", "", "mAlwaysInTapRegion", "mCurDownEvent", "Landroid/view/MotionEvent;", "mDoubleTapSlopSquare", "mHandler", "Lcom/bytedance/common/utility/collection/WeakHandler;", "getMHandler", "()Lcom/bytedance/common/utility/collection/WeakHandler;", "setMHandler", "(Lcom/bytedance/common/utility/collection/WeakHandler;)V", "mInitX", "", "mInitY", "mIsDoubleTap", "mOnDiggListener", "Lcom/ss/android/ugc/aweme/longvideo/view/DoubleClickDiggFrameLayout$OnDiggListener;", "mPreUpEvent", "mTouchSlopSquare", "touchSlop", "handleDoubleClick", "", "curDownEvent", "handleMsg", "msg", "Landroid/os/Message;", "isConsideredDoubleTap", "firstDown", "firstUp", "secondDown", "isConsideredSingleTap", "curDown", "curUp", "onCustomTouchEvent", "event", "setOnDiggListener", "listener", "OnDiggListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DoubleClickDiggFrameLayout extends DiggLayout implements WeakHandler.IHandler {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f53973f;
    private final int g;
    private final int h;
    private float i;
    private float j;
    private int k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private MotionEvent r;
    private MotionEvent s;
    @Nullable
    private WeakHandler t;
    private a u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/view/DoubleClickDiggFrameLayout$OnDiggListener;", "", "onClick", "", "onDoubleClickDigg", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a();

        void b();
    }

    @Nullable
    public final WeakHandler getMHandler() {
        return this.t;
    }

    public final int getMSG_AUTO_CLEAN() {
        return this.h;
    }

    public final int getMSG_TAP() {
        return this.g;
    }

    public final void setMHandler(@Nullable WeakHandler weakHandler) {
        this.t = weakHandler;
    }

    public DoubleClickDiggFrameLayout(@Nullable Context context) {
        this(context, null);
    }

    public final void setOnDiggListener(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f53973f, false, 56788, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f53973f, false, 56788, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "listener");
        this.u = aVar2;
    }

    public final void handleMsg(@Nullable Message message) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{message}, this, f53973f, false, 56787, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f53973f, false, 56787, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        int i2 = this.g;
        if (num != null && num.intValue() == i2) {
            a aVar = this.u;
            if (aVar != null) {
                aVar.b();
            }
            WeakHandler weakHandler = this.t;
            if (weakHandler != null) {
                weakHandler.removeMessages(this.h);
            }
        } else {
            int i3 = this.h;
            if (num != null && num.intValue() == i3) {
                WeakHandler weakHandler2 = this.t;
                if (weakHandler2 != null) {
                    weakHandler2.removeMessages(this.h);
                }
            }
        }
    }

    public final boolean a(@Nullable MotionEvent motionEvent) {
        boolean z;
        Message message;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f53973f, false, 56784, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f53973f, false, 56784, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        } else {
            switch (motionEvent.getAction()) {
                case 0:
                    WeakHandler weakHandler = this.t;
                    if (weakHandler != null && weakHandler.hasMessages(this.g)) {
                        WeakHandler weakHandler2 = this.t;
                        if (weakHandler2 != null) {
                            weakHandler2.removeMessages(this.g);
                        }
                    }
                    WeakHandler weakHandler3 = this.t;
                    if (weakHandler3 != null && weakHandler3.hasMessages(this.h)) {
                        WeakHandler weakHandler4 = this.t;
                        if (weakHandler4 != null) {
                            weakHandler4.removeMessages(this.h);
                        }
                    }
                    this.q = false;
                    MotionEvent motionEvent2 = this.r;
                    MotionEvent motionEvent3 = this.s;
                    if (PatchProxy.isSupport(new Object[]{motionEvent2, motionEvent3, motionEvent}, this, f53973f, false, 56785, new Class[]{MotionEvent.class, MotionEvent.class, MotionEvent.class}, Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2, motionEvent3, motionEvent}, this, f53973f, false, 56785, new Class[]{MotionEvent.class, MotionEvent.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        if (!(motionEvent2 == null || motionEvent3 == null || motionEvent == null || !this.o)) {
                            long eventTime = motionEvent.getEventTime() - motionEvent3.getEventTime();
                            if (eventTime <= ((long) ViewConfiguration.getDoubleTapTimeout()) && eventTime >= 40) {
                                int x = ((int) motionEvent2.getX()) - ((int) motionEvent.getX());
                                int y = ((int) motionEvent2.getY()) - ((int) motionEvent.getY());
                                if ((x * x) + (y * y) < this.n) {
                                    z = true;
                                }
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        this.q = true;
                        MotionEvent motionEvent4 = this.r;
                        if (PatchProxy.isSupport(new Object[]{motionEvent4}, this, f53973f, false, 56786, new Class[]{MotionEvent.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{motionEvent4}, this, f53973f, false, 56786, new Class[]{MotionEvent.class}, Void.TYPE);
                        } else if (motionEvent4 != null) {
                            a(motionEvent4.getX(), motionEvent4.getY());
                            a aVar = this.u;
                            if (aVar != null) {
                                aVar.a();
                            }
                        }
                    }
                    MotionEvent motionEvent5 = this.r;
                    if (motionEvent5 != null) {
                        motionEvent5.recycle();
                    }
                    this.r = MotionEvent.obtain(motionEvent);
                    this.p = true;
                    this.o = true;
                    this.i = motionEvent.getX();
                    this.j = motionEvent.getY();
                    break;
                case 1:
                    if (this.p) {
                        if (!this.q) {
                            if (!(this.r == null || motionEvent == null || !this.p)) {
                                z2 = true;
                            }
                            if (z2) {
                                WeakHandler weakHandler5 = this.t;
                                if (weakHandler5 != null) {
                                    WeakHandler weakHandler6 = this.t;
                                    if (weakHandler6 != null) {
                                        message = weakHandler6.obtainMessage(this.g, new Pair(Float.valueOf(this.i), Float.valueOf(this.j)));
                                    } else {
                                        message = null;
                                    }
                                    long doubleTapTimeout = ((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime();
                                    MotionEvent motionEvent6 = this.r;
                                    if (motionEvent6 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    weakHandler5.sendMessageDelayed(message, doubleTapTimeout + motionEvent6.getEventTime());
                                }
                            }
                        }
                        MotionEvent motionEvent7 = this.s;
                        if (motionEvent7 != null) {
                            motionEvent7.recycle();
                        }
                        this.s = MotionEvent.obtain(motionEvent);
                        break;
                    }
                    break;
                case 2:
                    int x2 = (int) (motionEvent.getX() - this.i);
                    int y2 = (int) (motionEvent.getY() - this.j);
                    int i2 = (x2 * x2) + (y2 * y2);
                    if (i2 > this.m || Math.abs(x2) >= this.l) {
                        this.p = false;
                        WeakHandler weakHandler7 = this.t;
                        if (weakHandler7 != null) {
                            weakHandler7.removeMessages(this.g);
                        }
                    }
                    if (i2 > this.n) {
                        this.o = false;
                        break;
                    }
                    break;
            }
            return true;
        }
    }

    public DoubleClickDiggFrameLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DoubleClickDiggFrameLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = 1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration, "ViewConfiguration.get(context)");
        this.k = viewConfiguration.getScaledDoubleTapSlop();
        ViewConfiguration viewConfiguration2 = ViewConfiguration.get(getContext());
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration2, "ViewConfiguration.get(context)");
        this.l = viewConfiguration2.getScaledTouchSlop() * 3;
        this.m = this.l * this.l;
        this.n = this.k * this.k;
        this.t = new WeakHandler(this);
    }
}
