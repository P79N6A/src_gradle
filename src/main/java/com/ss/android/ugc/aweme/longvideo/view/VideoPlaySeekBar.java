package com.ss.android.ugc.aweme.longvideo.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.longvideo.b.f;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 .2\u00020\u0001:\u0002./B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010\"\u001a\u00020#2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J\u000e\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\fJ\u000e\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u0012J\u0016\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u001fJ\u000e\u0010)\u001a\u00020#2\u0006\u0010'\u001a\u00020\tJ\u000e\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020\tJ\u000e\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/view/VideoPlaySeekBar;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mOnSeekBarChangeListener", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "getMOnSeekBarChangeListener", "()Landroid/widget/SeekBar$OnSeekBarChangeListener;", "setMOnSeekBarChangeListener", "(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V", "mProgress", "", "getMProgress", "()Ljava/lang/Float;", "setMProgress", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "mTotalTime", "seekBar", "Landroid/widget/SeekBar;", "tvProgress", "Landroid/widget/TextView;", "tvTotalTime", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "initView", "", "setOnSeekBarChangeListener", "listener", "setProgress", "progress", "animate", "setSecondaryProgress", "setSeekBarThumb", "seekBarThumb", "setTotalTime", "totalTime", "Companion", "OnSeekBarChangeListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VideoPlaySeekBar extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53983a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f53984d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public TextView f53985b;

    /* renamed from: c  reason: collision with root package name */
    public int f53986c;

    /* renamed from: e  reason: collision with root package name */
    private TextView f53987e;

    /* renamed from: f  reason: collision with root package name */
    private SeekBar f53988f;
    @Nullable
    private Float g;
    @Nullable
    private SeekBar.OnSeekBarChangeListener h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/view/VideoPlaySeekBar$Companion;", "", "()V", "SEEK_BAR_THUMB_BIG", "", "SEEK_BAR_THUMB_SMALL", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/longvideo/view/VideoPlaySeekBar$initView$1", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "progress", "", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53989a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPlaySeekBar f53990b;

        b(VideoPlaySeekBar videoPlaySeekBar) {
            this.f53990b = videoPlaySeekBar;
        }

        public final void onStartTrackingTouch(@Nullable SeekBar seekBar) {
            SeekBar seekBar2 = seekBar;
            if (PatchProxy.isSupport(new Object[]{seekBar2}, this, f53989a, false, 56808, new Class[]{SeekBar.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{seekBar2}, this, f53989a, false, 56808, new Class[]{SeekBar.class}, Void.TYPE);
                return;
            }
            SeekBar.OnSeekBarChangeListener mOnSeekBarChangeListener = this.f53990b.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.onStartTrackingTouch(seekBar2);
            }
        }

        public final void onStopTrackingTouch(@Nullable SeekBar seekBar) {
            SeekBar seekBar2 = seekBar;
            if (PatchProxy.isSupport(new Object[]{seekBar2}, this, f53989a, false, 56809, new Class[]{SeekBar.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{seekBar2}, this, f53989a, false, 56809, new Class[]{SeekBar.class}, Void.TYPE);
                return;
            }
            SeekBar.OnSeekBarChangeListener mOnSeekBarChangeListener = this.f53990b.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.onStopTrackingTouch(seekBar2);
            }
            bg.a(new com.ss.android.ugc.aweme.longvideo.a.a());
        }

        public final void onProgressChanged(@Nullable SeekBar seekBar, int i, boolean z) {
            SeekBar seekBar2 = seekBar;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{seekBar2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f53989a, false, 56807, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{seekBar2, Integer.valueOf(i), Byte.valueOf(z)}, this, f53989a, false, 56807, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            TextView textView = this.f53990b.f53985b;
            if (textView != null) {
                textView.setText(f.f53897a.a(((float) i2) / 100.0f, this.f53990b.f53986c));
            }
            SeekBar.OnSeekBarChangeListener mOnSeekBarChangeListener = this.f53990b.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.onProgressChanged(seekBar, i2, z);
            }
        }
    }

    @Nullable
    public final SeekBar.OnSeekBarChangeListener getMOnSeekBarChangeListener() {
        return this.h;
    }

    @Nullable
    public final Float getMProgress() {
        return this.g;
    }

    public final void setMOnSeekBarChangeListener(@Nullable SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.h = onSeekBarChangeListener;
    }

    public final void setMProgress(@Nullable Float f2) {
        this.g = f2;
    }

    public VideoPlaySeekBar(@Nullable Context context) {
        this(context, null);
    }

    public final void setOnSeekBarChangeListener(@NotNull SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = onSeekBarChangeListener;
        if (PatchProxy.isSupport(new Object[]{onSeekBarChangeListener2}, this, f53983a, false, 56798, new Class[]{SeekBar.OnSeekBarChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onSeekBarChangeListener2}, this, f53983a, false, 56798, new Class[]{SeekBar.OnSeekBarChangeListener.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(onSeekBarChangeListener2, "listener");
        this.h = onSeekBarChangeListener2;
    }

    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f53983a, false, 56804, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f53983a, false, 56804, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setSecondaryProgress(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f53983a, false, 56801, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f53983a, false, 56801, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        SeekBar seekBar = this.f53988f;
        if (seekBar != null) {
            seekBar.setSecondaryProgress(i);
        }
    }

    public final void setSeekBarThumb(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f53983a, false, 56802, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f53983a, false, 56802, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (1 == i) {
            SeekBar seekBar = this.f53988f;
            if (seekBar != null) {
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                seekBar.setThumb(com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), 2130840467));
            }
        } else {
            SeekBar seekBar2 = this.f53988f;
            if (seekBar2 != null) {
                Context context2 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                seekBar2.setThumb(com.ss.android.ugc.bytex.a.a.a.a(context2.getResources(), 2130840466));
            }
        }
    }

    public final void setTotalTime(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f53983a, false, 56803, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f53983a, false, 56803, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f53986c = i;
        TextView textView = this.f53987e;
        if (textView != null) {
            textView.setText(f.f53897a.a(i));
        }
    }

    public final void setProgress(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f53983a, false, 56799, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f53983a, false, 56799, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), (byte) 0}, this, f53983a, false, 56800, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), (byte) 0}, this, f53983a, false, 56800, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g = Float.valueOf(f2);
        if (Build.VERSION.SDK_INT >= 24) {
            SeekBar seekBar = this.f53988f;
            if (seekBar != null) {
                seekBar.setProgress((int) (f2 * 100.0f), false);
            }
        } else {
            SeekBar seekBar2 = this.f53988f;
            if (seekBar2 != null) {
                seekBar2.setProgress((int) (f2 * 100.0f));
            }
        }
        TextView textView = this.f53985b;
        if (textView != null) {
            textView.setText(f.f53897a.a(f2, this.f53986c));
        }
    }

    public VideoPlaySeekBar(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoPlaySeekBar(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[]{context}, this, f53983a, false, 56797, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f53983a, false, 56797, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.asf, this, true);
        this.f53985b = (TextView) inflate.findViewById(C0906R.id.dgp);
        this.f53987e = (TextView) inflate.findViewById(C0906R.id.dl3);
        this.f53988f = (SeekBar) inflate.findViewById(C0906R.id.cmo);
        SeekBar seekBar = this.f53988f;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(new b(this));
        }
        TextView textView = this.f53985b;
        if (textView != null) {
            textView.setText(f.f53897a.a(0));
        }
        TextView textView2 = this.f53987e;
        if (textView2 != null) {
            textView2.setText(f.f53897a.a(0));
        }
    }
}
