package com.ss.android.ugc.aweme.feed.ui.seekbar;

import android.content.Context;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J\"\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\rH\u0016J\u0012\u0010$\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010%\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010&\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u000e\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u0002J\u000e\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\rR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011¨\u0006."}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/seekbar/OnTouchDraftSeekBar;", "Landroid/support/v7/widget/AppCompatSeekBar;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "hasActionMove", "", "getHasActionMove", "()Z", "setHasActionMove", "(Z)V", "mDownEventRawX", "", "getMDownEventRawX", "()Ljava/lang/Float;", "setMDownEventRawX", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "mOnSeekBarChangeListener", "mPauseStatus", "getMPauseStatus", "setMPauseStatus", "initView", "", "onProgressChanged", "seekBar", "Landroid/widget/SeekBar;", "progress", "fromUser", "onStartTrackingTouch", "onStopTrackingTouch", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "setCustomOnSeekBarChangeListener", "l", "setPauseStatus", "pauseStatus", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class OnTouchDraftSeekBar extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46835a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f46836b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private SeekBar.OnSeekBarChangeListener f46837c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f46838d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f46839e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private Float f46840f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/seekbar/OnTouchDraftSeekBar$Companion;", "", "()V", "MOVE_BUFFER", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean getHasActionMove() {
        return this.f46838d;
    }

    @Nullable
    public final Float getMDownEventRawX() {
        return this.f46840f;
    }

    public final boolean getMPauseStatus() {
        return this.f46839e;
    }

    public final void setHasActionMove(boolean z) {
        this.f46838d = z;
    }

    public final void setMDownEventRawX(@Nullable Float f2) {
        this.f46840f = f2;
    }

    public final void setMPauseStatus(boolean z) {
        this.f46839e = z;
    }

    public final void setPauseStatus(boolean z) {
        this.f46839e = z;
    }

    public OnTouchDraftSeekBar(@Nullable Context context) {
        this(context, null);
    }

    public final void setCustomOnSeekBarChangeListener(@NotNull SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = onSeekBarChangeListener;
        if (PatchProxy.isSupport(new Object[]{onSeekBarChangeListener2}, this, f46835a, false, 43485, new Class[]{SeekBar.OnSeekBarChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onSeekBarChangeListener2}, this, f46835a, false, 43485, new Class[]{SeekBar.OnSeekBarChangeListener.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(onSeekBarChangeListener2, "l");
        this.f46837c = onSeekBarChangeListener2;
    }

    public final void onStartTrackingTouch(@Nullable SeekBar seekBar) {
        SeekBar seekBar2 = seekBar;
        if (PatchProxy.isSupport(new Object[]{seekBar2}, this, f46835a, false, 43487, new Class[]{SeekBar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar2}, this, f46835a, false, 43487, new Class[]{SeekBar.class}, Void.TYPE);
            return;
        }
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f46837c;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar2);
        }
    }

    public final void onStopTrackingTouch(@Nullable SeekBar seekBar) {
        SeekBar seekBar2 = seekBar;
        if (PatchProxy.isSupport(new Object[]{seekBar2}, this, f46835a, false, 43488, new Class[]{SeekBar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar2}, this, f46835a, false, 43488, new Class[]{SeekBar.class}, Void.TYPE);
            return;
        }
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f46837c;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar2);
        }
    }

    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f46835a, false, 43484, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46835a, false, 43484, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            this.f46838d = false;
            this.f46840f = Float.valueOf(motionEvent.getRawX());
            super.onTouchEvent(motionEvent);
        } else if (num != null && num.intValue() == 2) {
            Float f2 = this.f46840f;
            if (f2 != null && Math.abs(f2.floatValue() - motionEvent.getRawX()) > 10.0f) {
                this.f46838d = true;
                super.onTouchEvent(motionEvent);
            }
        } else if (num != null && num.intValue() == 1) {
            if (this.f46838d || this.f46839e) {
                super.onTouchEvent(motionEvent);
            } else {
                SeekBar seekBar = this;
                onStartTrackingTouch(seekBar);
                onStopTrackingTouch(seekBar);
            }
            this.f46838d = false;
        } else if (num != null && num.intValue() == 3) {
            super.onTouchEvent(motionEvent);
            this.f46838d = false;
        }
        return true;
    }

    public OnTouchDraftSeekBar(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnTouchDraftSeekBar(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[0], this, f46835a, false, 43483, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46835a, false, 43483, new Class[0], Void.TYPE);
            return;
        }
        super.setOnSeekBarChangeListener(this);
    }

    public final void onProgressChanged(@Nullable SeekBar seekBar, int i, boolean z) {
        SeekBar seekBar2 = seekBar;
        if (PatchProxy.isSupport(new Object[]{seekBar2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f46835a, false, 43486, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar2, Integer.valueOf(i), Byte.valueOf(z)}, this, f46835a, false, 43486, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f46837c;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar2, i, z);
        }
    }
}
