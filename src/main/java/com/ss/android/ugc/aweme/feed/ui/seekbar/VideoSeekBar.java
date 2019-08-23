package com.ss.android.ugc.aweme.feed.ui.seekbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 F2\u00020\u0001:\u0003FGHB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u0004\u0018\u00010\fJ\u0012\u00106\u001a\u0002072\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J\u000e\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u0014J\u000e\u0010:\u001a\u0002072\u0006\u00109\u001a\u00020\u001aJ\u000e\u0010;\u001a\u0002072\u0006\u0010<\u001a\u000202J\u000e\u0010=\u001a\u0002072\u0006\u0010>\u001a\u00020\u000eJ\u0018\u0010=\u001a\u0002072\u0006\u0010>\u001a\u00020\u000e2\u0006\u0010?\u001a\u000202H\u0002J\u000e\u0010@\u001a\u0002072\u0006\u0010>\u001a\u00020\tJ\u0010\u0010A\u001a\u0002072\b\u0010B\u001a\u0004\u0018\u00010CJ\b\u0010D\u001a\u000202H\u0016J\u000e\u0010E\u001a\u0002072\u0006\u0010>\u001a\u00020\u000eR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010'\"\u0004\b0\u0010)¨\u0006I"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCoverThumbImg", "Landroid/widget/ImageView;", "mFourDp", "", "getMFourDp", "()F", "setMFourDp", "(F)V", "mOnDispatchTouchEventListener", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar$OnDispatchTouchEventListener;", "getMOnDispatchTouchEventListener", "()Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar$OnDispatchTouchEventListener;", "setMOnDispatchTouchEventListener", "(Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar$OnDispatchTouchEventListener;)V", "mOnSeekBarChangeListener", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar$OnSeekBarChangeListener;", "getMOnSeekBarChangeListener", "()Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar$OnSeekBarChangeListener;", "setMOnSeekBarChangeListener", "(Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar$OnSeekBarChangeListener;)V", "mProgress", "getMProgress", "()Ljava/lang/Float;", "setMProgress", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "mScreenWidth", "getMScreenWidth", "()I", "setMScreenWidth", "(I)V", "seekBar", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/OnTouchDraftSeekBar;", "seekBarTwo", "Landroid/widget/SeekBar;", "twoProgress", "getTwoProgress", "setTwoProgress", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "getCoverThumbImg", "initView", "", "setOnDispatchTouchEventListener", "listener", "setOnSeekBarChangeListener", "setPauseStatus", "pauseStatus", "setProgress", "progress", "animate", "setSecondaryProgress", "setThumb", "drawable", "Landroid/graphics/drawable/Drawable;", "shouldDelayChildPressedState", "updateImgPostion", "Companion", "OnDispatchTouchEventListener", "OnSeekBarChangeListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VideoSeekBar extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46841a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f46842b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private OnTouchDraftSeekBar f46843c;

    /* renamed from: d  reason: collision with root package name */
    private SeekBar f46844d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f46845e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private Float f46846f;
    @Nullable
    private c g;
    @Nullable
    private b h;
    private int i;
    private int j;
    private float k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar$OnDispatchTouchEventListener;", "", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(@Nullable MotionEvent motionEvent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar$OnSeekBarChangeListener;", "", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "progress", "", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface c {
        void a(@Nullable SeekBar seekBar);

        void a(@Nullable SeekBar seekBar, int i, boolean z);

        void b(@Nullable SeekBar seekBar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar$Companion;", "", "()V", "ONE_HUNDRED", "", "TEN_THOUSAND", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar$initView$1", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "progress", "", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46847a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoSeekBar f46848b;

        d(VideoSeekBar videoSeekBar) {
            this.f46848b = videoSeekBar;
        }

        public final void onStartTrackingTouch(@Nullable SeekBar seekBar) {
            SeekBar seekBar2 = seekBar;
            if (PatchProxy.isSupport(new Object[]{seekBar2}, this, f46847a, false, 43504, new Class[]{SeekBar.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{seekBar2}, this, f46847a, false, 43504, new Class[]{SeekBar.class}, Void.TYPE);
                return;
            }
            c mOnSeekBarChangeListener = this.f46848b.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.a(seekBar2);
            }
        }

        public final void onStopTrackingTouch(@Nullable SeekBar seekBar) {
            SeekBar seekBar2 = seekBar;
            if (PatchProxy.isSupport(new Object[]{seekBar2}, this, f46847a, false, 43505, new Class[]{SeekBar.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{seekBar2}, this, f46847a, false, 43505, new Class[]{SeekBar.class}, Void.TYPE);
                return;
            }
            c mOnSeekBarChangeListener = this.f46848b.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.b(seekBar2);
            }
        }

        public final void onProgressChanged(@Nullable SeekBar seekBar, int i, boolean z) {
            SeekBar seekBar2 = seekBar;
            if (PatchProxy.isSupport(new Object[]{seekBar2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f46847a, false, 43503, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{seekBar2, Integer.valueOf(i), Byte.valueOf(z)}, this, f46847a, false, 43503, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            c mOnSeekBarChangeListener = this.f46848b.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.a(seekBar2, i, z);
            }
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Nullable
    public final ImageView getCoverThumbImg() {
        return this.f46845e;
    }

    public final float getMFourDp() {
        return this.k;
    }

    @Nullable
    public final b getMOnDispatchTouchEventListener() {
        return this.h;
    }

    @Nullable
    public final c getMOnSeekBarChangeListener() {
        return this.g;
    }

    @Nullable
    public final Float getMProgress() {
        return this.f46846f;
    }

    public final int getMScreenWidth() {
        return this.j;
    }

    public final int getTwoProgress() {
        return this.i;
    }

    public final void setMFourDp(float f2) {
        this.k = f2;
    }

    public final void setMOnDispatchTouchEventListener(@Nullable b bVar) {
        this.h = bVar;
    }

    public final void setMOnSeekBarChangeListener(@Nullable c cVar) {
        this.g = cVar;
    }

    public final void setMProgress(@Nullable Float f2) {
        this.f46846f = f2;
    }

    public final void setMScreenWidth(int i2) {
        this.j = i2;
    }

    public final void setTwoProgress(int i2) {
        this.i = i2;
    }

    public VideoSeekBar(@Nullable Context context) {
        this(context, null);
    }

    public final void setOnDispatchTouchEventListener(@NotNull b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f46841a, false, 43494, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f46841a, false, 43494, new Class[]{b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "listener");
        this.h = bVar2;
    }

    public final void setOnSeekBarChangeListener(@NotNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f46841a, false, 43493, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f46841a, false, 43493, new Class[]{c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "listener");
        this.g = cVar2;
    }

    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f46841a, false, 43500, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f46841a, false, 43500, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        b bVar = this.h;
        if (bVar != null) {
            bVar.a(motionEvent2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setPauseStatus(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f46841a, false, 43492, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f46841a, false, 43492, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        OnTouchDraftSeekBar onTouchDraftSeekBar = this.f46843c;
        if (onTouchDraftSeekBar != null) {
            onTouchDraftSeekBar.setPauseStatus(z);
        }
    }

    public final void setSecondaryProgress(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f46841a, false, 43499, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f46841a, false, 43499, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        OnTouchDraftSeekBar onTouchDraftSeekBar = this.f46843c;
        if (onTouchDraftSeekBar != null) {
            onTouchDraftSeekBar.setSecondaryProgress(i2);
        }
    }

    public final void setThumb(@Nullable Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f46841a, false, 43496, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, f46841a, false, 43496, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        OnTouchDraftSeekBar onTouchDraftSeekBar = this.f46843c;
        if (onTouchDraftSeekBar != null) {
            onTouchDraftSeekBar.setThumb(drawable2);
        }
    }

    public final void setProgress(float f2) {
        ViewGroup.LayoutParams layoutParams;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f46841a, false, 43495, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f46841a, false, 43495, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), (byte) 0}, this, f46841a, false, 43497, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), (byte) 0}, this, f46841a, false, 43497, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f46846f = Float.valueOf(f2);
        if (Build.VERSION.SDK_INT >= 24) {
            OnTouchDraftSeekBar onTouchDraftSeekBar = this.f46843c;
            if (onTouchDraftSeekBar != null) {
                onTouchDraftSeekBar.setProgress((int) (f2 * 100.0f), false);
            }
        } else {
            OnTouchDraftSeekBar onTouchDraftSeekBar2 = this.f46843c;
            if (onTouchDraftSeekBar2 != null) {
                onTouchDraftSeekBar2.setProgress((int) (f2 * 100.0f));
            }
        }
        SeekBar seekBar = this.f46844d;
        if (seekBar != null) {
            seekBar.setProgress(this.i);
        }
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f46841a, false, 43498, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f46841a, false, 43498, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        float f3 = this.k + ((((float) this.j) - (this.k * 2.0f)) * (f2 / 100.0f));
        ImageView imageView = this.f46845e;
        if (imageView != null) {
            layoutParams = imageView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (Build.VERSION.SDK_INT > 16) {
                layoutParams2.setMarginStart(((int) f3) - ((int) this.k));
            }
            layoutParams2.leftMargin = ((int) f3) - ((int) this.k);
            ImageView imageView2 = this.f46845e;
            if (imageView2 != null) {
                imageView2.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public VideoSeekBar(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|(1:14)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x00a9 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ad A[Catch:{ Throwable -> 0x00d8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VideoSeekBar(@org.jetbrains.annotations.Nullable android.content.Context r9, @org.jetbrains.annotations.Nullable android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            r10 = 1
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x00d8 }
            r11 = 0
            r0[r11] = r9     // Catch:{ Throwable -> 0x00d8 }
            com.meituan.robust.ChangeQuickRedirect r2 = f46841a     // Catch:{ Throwable -> 0x00d8 }
            r3 = 0
            r4 = 43491(0xa9e3, float:6.0944E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x00d8 }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r11] = r1     // Catch:{ Throwable -> 0x00d8 }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x00d8 }
            r1 = r8
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x00d8 }
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x00d8 }
            r1[r11] = r9     // Catch:{ Throwable -> 0x00d8 }
            com.meituan.robust.ChangeQuickRedirect r3 = f46841a     // Catch:{ Throwable -> 0x00d8 }
            r4 = 0
            r5 = 43491(0xa9e3, float:6.0944E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x00d8 }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r6[r11] = r9     // Catch:{ Throwable -> 0x00d8 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x00d8 }
            r2 = r8
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x00d8 }
            goto L_0x00dc
        L_0x0036:
            int r11 = com.bytedance.common.utility.UIUtils.getScreenWidth(r9)     // Catch:{ Throwable -> 0x00d8 }
            r8.j = r11     // Catch:{ Throwable -> 0x00d8 }
            r11 = 1082130432(0x40800000, float:4.0)
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r9, r11)     // Catch:{ Throwable -> 0x00d8 }
            r8.k = r0     // Catch:{ Throwable -> 0x00d8 }
            r0 = 1176256512(0x461c4000, float:10000.0)
            float r1 = r8.k     // Catch:{ Throwable -> 0x00d8 }
            int r2 = r8.j     // Catch:{ Throwable -> 0x00d8 }
            float r2 = (float) r2     // Catch:{ Throwable -> 0x00d8 }
            float r1 = r1 / r2
            float r1 = r1 * r0
            int r0 = (int) r1     // Catch:{ Throwable -> 0x00d8 }
            r8.i = r0     // Catch:{ Throwable -> 0x00d8 }
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r9)     // Catch:{ Throwable -> 0x00d8 }
            r1 = 2131691488(0x7f0f07e0, float:1.901205E38)
            r2 = r8
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ Throwable -> 0x00d8 }
            android.view.View r0 = r0.inflate(r1, r2, r10)     // Catch:{ Throwable -> 0x00d8 }
            r8.bringToFront()     // Catch:{ Throwable -> 0x00d8 }
            r1 = 2131169789(0x7f0711fd, float:1.7953918E38)
            android.view.View r1 = r0.findViewById(r1)     // Catch:{ Throwable -> 0x00d8 }
            com.ss.android.ugc.aweme.feed.ui.seekbar.OnTouchDraftSeekBar r1 = (com.ss.android.ugc.aweme.feed.ui.seekbar.OnTouchDraftSeekBar) r1     // Catch:{ Throwable -> 0x00d8 }
            r8.f46843c = r1     // Catch:{ Throwable -> 0x00d8 }
            r1 = 2131169791(0x7f0711ff, float:1.7953922E38)
            android.view.View r1 = r0.findViewById(r1)     // Catch:{ Throwable -> 0x00d8 }
            android.widget.SeekBar r1 = (android.widget.SeekBar) r1     // Catch:{ Throwable -> 0x00d8 }
            r8.f46844d = r1     // Catch:{ Throwable -> 0x00d8 }
            r1 = 2131169790(0x7f0711fe, float:1.795392E38)
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Throwable -> 0x00d8 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Throwable -> 0x00d8 }
            r8.f46845e = r0     // Catch:{ Throwable -> 0x00d8 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x00d8 }
            r1 = 21
            if (r0 >= r1) goto L_0x00c8
            java.lang.Class<android.widget.ProgressBar> r0 = android.widget.ProgressBar.class
            java.lang.String r1 = "mMaxHeight"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r1 = "declaredField"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)     // Catch:{ Throwable -> 0x00a9 }
            r0.setAccessible(r10)     // Catch:{ Throwable -> 0x00a9 }
            com.ss.android.ugc.aweme.feed.ui.seekbar.OnTouchDraftSeekBar r10 = r8.f46843c     // Catch:{ Throwable -> 0x00a9 }
            r1 = 1090519040(0x41000000, float:8.0)
            float r1 = com.bytedance.ad.symphony.g.c.a(r9, r1)     // Catch:{ Throwable -> 0x00a9 }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ Throwable -> 0x00a9 }
            r0.set(r10, r1)     // Catch:{ Throwable -> 0x00a9 }
        L_0x00a9:
            com.ss.android.ugc.aweme.feed.ui.seekbar.OnTouchDraftSeekBar r10 = r8.f46843c     // Catch:{ Throwable -> 0x00d8 }
            if (r10 == 0) goto L_0x00c8
            float r0 = com.bytedance.ad.symphony.g.c.a(r9, r11)     // Catch:{ Throwable -> 0x00d8 }
            int r0 = (int) r0     // Catch:{ Throwable -> 0x00d8 }
            r1 = 1077936128(0x40400000, float:3.0)
            float r1 = com.bytedance.ad.symphony.g.c.a(r9, r1)     // Catch:{ Throwable -> 0x00d8 }
            int r1 = (int) r1     // Catch:{ Throwable -> 0x00d8 }
            float r11 = com.bytedance.ad.symphony.g.c.a(r9, r11)     // Catch:{ Throwable -> 0x00d8 }
            int r11 = (int) r11     // Catch:{ Throwable -> 0x00d8 }
            r2 = 1088421888(0x40e00000, float:7.0)
            float r9 = com.bytedance.ad.symphony.g.c.a(r9, r2)     // Catch:{ Throwable -> 0x00d8 }
            int r9 = (int) r9     // Catch:{ Throwable -> 0x00d8 }
            r10.setPadding(r0, r1, r11, r9)     // Catch:{ Throwable -> 0x00d8 }
        L_0x00c8:
            com.ss.android.ugc.aweme.feed.ui.seekbar.OnTouchDraftSeekBar r9 = r8.f46843c     // Catch:{ Throwable -> 0x00d8 }
            if (r9 == 0) goto L_0x00d7
            com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar$d r10 = new com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar$d     // Catch:{ Throwable -> 0x00d8 }
            r10.<init>(r8)     // Catch:{ Throwable -> 0x00d8 }
            android.widget.SeekBar$OnSeekBarChangeListener r10 = (android.widget.SeekBar.OnSeekBarChangeListener) r10     // Catch:{ Throwable -> 0x00d8 }
            r9.setCustomOnSeekBarChangeListener(r10)     // Catch:{ Throwable -> 0x00d8 }
            goto L_0x00dc
        L_0x00d7:
            return
        L_0x00d8:
            r9 = move-exception
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Throwable) r9)
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
