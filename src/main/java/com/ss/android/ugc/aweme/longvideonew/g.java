package com.ss.android.ugc.aweme.longvideonew;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.feed.ui.seekbar.e;
import com.ss.android.ugc.aweme.feed.ui.seekbar.h;
import com.ss.android.ugc.aweme.longvideo.b.f;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 z2\u00020\u00012\u00020\u0002:\u0001zB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010^H\u0016J\u0006\u0010_\u001a\u00020\u000fJ\u0010\u0010`\u001a\u00020\\2\u0006\u0010a\u001a\u00020bH\u0016J\u0010\u0010c\u001a\u00020\\2\u0006\u0010a\u001a\u00020dH\u0016J\u0010\u0010e\u001a\u00020\\2\u0006\u0010a\u001a\u00020fH\u0016J\u0010\u0010g\u001a\u00020\\2\u0006\u0010a\u001a\u00020hH\u0016J\"\u0010i\u001a\u00020\\2\b\u0010j\u001a\u0004\u0018\u00010k2\u0006\u0010l\u001a\u00020\t2\u0006\u0010m\u001a\u00020\u000fH\u0016J\u0012\u0010n\u001a\u00020\\2\b\u0010j\u001a\u0004\u0018\u00010kH\u0016J\u0012\u0010o\u001a\u00020\\2\b\u0010j\u001a\u0004\u0018\u00010kH\u0016J\u0010\u0010p\u001a\u00020\\2\u0006\u0010a\u001a\u00020qH\u0016J\u0006\u0010r\u001a\u00020\\J\u0006\u0010s\u001a\u00020\\J\b\u0010t\u001a\u00020\\H\u0002J\b\u0010u\u001a\u00020\\H\u0002J\b\u0010v\u001a\u00020\\H\u0002J\b\u0010w\u001a\u00020\\H\u0002J\b\u0010x\u001a\u00020\\H\u0002J\u0006\u0010y\u001a\u00020\\R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00102\u001a\u000203X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00108\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001c\"\u0004\b:\u0010\u001eR\u001a\u0010;\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0011\"\u0004\b=\u0010\u0013R\u001a\u0010>\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0011\"\u0004\b@\u0010\u0013R\u001a\u0010A\u001a\u00020BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u000b\"\u0004\bI\u0010\rR\u001a\u0010J\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u000b\"\u0004\bL\u0010\rR\u001a\u0010M\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u000b\"\u0004\bO\u0010\rR\u001c\u0010P\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010(\"\u0004\bR\u0010*R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0011\u0010W\u001a\u00020X¢\u0006\b\n\u0000\u001a\u0004\bY\u0010Z¨\u0006{"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/VideoSeekBarControl;", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar$OnSeekBarChangeListener;", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar$OnDispatchTouchEventListener;", "mVideoSeekBar", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar;", "mVideoSeekDuration", "Landroid/widget/LinearLayout;", "(Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar;Landroid/widget/LinearLayout;)V", "currentVideoStatus", "", "getCurrentVideoStatus", "()I", "setCurrentVideoStatus", "(I)V", "hasOperateOnPause", "", "getHasOperateOnPause", "()Z", "setHasOperateOnPause", "(Z)V", "hasTouchMove", "getHasTouchMove", "setHasTouchMove", "isAllowSeek", "setAllowSeek", "mCurrentAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getMCurrentAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setMCurrentAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "mCurrentBaseListFragmentPanel", "Lcom/ss/android/ugc/aweme/feed/panel/BaseListFragmentPanel;", "getMCurrentBaseListFragmentPanel", "()Lcom/ss/android/ugc/aweme/feed/panel/BaseListFragmentPanel;", "setMCurrentBaseListFragmentPanel", "(Lcom/ss/android/ugc/aweme/feed/panel/BaseListFragmentPanel;)V", "mCurrentSeekVideoTimeView", "Landroid/widget/TextView;", "getMCurrentSeekVideoTimeView", "()Landroid/widget/TextView;", "setMCurrentSeekVideoTimeView", "(Landroid/widget/TextView;)V", "mDownEventRawX", "", "getMDownEventRawX", "()Ljava/lang/Float;", "setMDownEventRawX", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "mEventType", "", "getMEventType", "()Ljava/lang/String;", "setMEventType", "(Ljava/lang/String;)V", "mFirstAweme", "getMFirstAweme", "setMFirstAweme", "mHasDispatchTouchFinish", "getMHasDispatchTouchFinish", "setMHasDispatchTouchFinish", "mIsTrackingTouch", "getMIsTrackingTouch", "setMIsTrackingTouch", "mOnStopTrackingTouchTime", "", "getMOnStopTrackingTouchTime", "()J", "setMOnStopTrackingTouchTime", "(J)V", "mPageType", "getMPageType", "setMPageType", "mSeekBarStartTouch", "getMSeekBarStartTouch", "setMSeekBarStartTouch", "mTotalTime", "getMTotalTime", "setMTotalTime", "mTotalVideoTimeView", "getMTotalVideoTimeView", "setMTotalVideoTimeView", "getMVideoSeekBar", "()Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoSeekBar;", "getMVideoSeekDuration", "()Landroid/widget/LinearLayout;", "runnable", "Ljava/lang/Runnable;", "getRunnable", "()Ljava/lang/Runnable;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "isVideoPlayAlready", "onFullFeedVideoChangeEvent", "event", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/BaseListFragmentPanelVideoChangeEvent;", "onPlayerControllerRenderFirstFrameEvent", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/PlayerControllerRenderFirstFrameEvent;", "onPlayerControllerVideoPlayProgressChange", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/PlayerControllerVideoPlayProgressEvent;", "onPlayerControllerVideoStatusEvent", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/PlayerControllerVideoStatusEvent;", "onProgressChanged", "seekBar", "Landroid/widget/SeekBar;", "progress", "fromUser", "onStartTrackingTouch", "onStopTrackingTouch", "onVideoProgressVolumeKeyEvent", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/VideoProgressVolumeKeyEvent;", "seekBarGone", "seekBarHide", "seekBarHideAnimate", "seekBarHideDelayed", "seekBarShow", "seekDurationHide", "seekDurationShow", "updateSeekBarStatus", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class g implements VideoSeekBar.b, VideoSeekBar.c {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f3500b;
    public static final a w = new a((byte) 0);
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public Aweme f3501c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public TextView f3502d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public TextView f3503e;

    /* renamed from: f  reason: collision with root package name */
    public int f3504f;
    public boolean g;
    public boolean h;
    public int i;
    public long j;
    @Nullable
    public BaseListFragmentPanel k;
    @NotNull
    public String l = "";
    public int m = -1;
    public int n;
    public boolean o;
    @Nullable
    public Aweme p;
    public boolean q = true;
    public boolean r = true;
    @Nullable
    public Float s;
    @NotNull
    public final Runnable t;
    @NotNull
    public final VideoSeekBar u;
    @NotNull
    public final LinearLayout v;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/VideoSeekBarControl$Companion;", "", "()V", "ANIMATION_DURATION_TWO_HUNDRED", "", "ONE_HUNDRED_F", "", "SEEK_BAR_ALPHA_HIDE", "SEEK_BAR_HIDE_DELAYED_TIME", "SEEK_BAR_PIVOT_Y", "", "SEEK_BAR_SCALE_HIDE", "SEEK_BAR_STOP_TRACKING_TOUCH_BUFFER_TIME", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54078a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f54079b;

        b(g gVar) {
            this.f54079b = gVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f54078a, false, 56895, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54078a, false, 56895, new Class[0], Void.TYPE);
            } else if (this.f54079b.u.getAlpha() != 0.0f && this.f54079b.u.getVisibility() != 8) {
                bg.a(new h(this.f54079b.f3501c));
                this.f54079b.b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/longvideonew/VideoSeekBarControl$seekBarHideAnimate$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54080a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f54081b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ImageView f54082c;

        public final void onAnimationCancel(@Nullable Animator animator) {
        }

        public final void onAnimationRepeat(@Nullable Animator animator) {
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f54080a, false, 56896, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f54080a, false, 56896, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f54081b.u.setAlpha(0.0f);
            this.f54081b.u.setScaleY(1.0f);
            ImageView imageView = this.f54082c;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f54082c;
            if (imageView2 != null) {
                imageView2.setScaleX(1.0f);
            }
            ImageView imageView3 = this.f54082c;
            if (imageView3 != null) {
                imageView3.setScaleY(1.0f);
            }
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f54080a, false, 56897, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f54080a, false, 56897, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            ImageView imageView = this.f54082c;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.f54081b.u.setThumb(null);
        }

        c(g gVar, ImageView imageView) {
            this.f54081b = gVar;
            this.f54082c = imageView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/longvideonew/VideoSeekBarControl$seekBarShow$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54083a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f54084b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ImageView f54085c;

        public final void onAnimationCancel(@Nullable Animator animator) {
        }

        public final void onAnimationRepeat(@Nullable Animator animator) {
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f54083a, false, 56899, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f54083a, false, 56899, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            ImageView imageView = this.f54085c;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f54083a, false, 56898, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f54083a, false, 56898, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            VideoSeekBar videoSeekBar = this.f54084b.u;
            Context context = this.f54084b.u.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "mVideoSeekBar.context");
            videoSeekBar.setThumb(com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), 2130840469));
            VideoSeekBar videoSeekBar2 = this.f54084b.u;
            Context context2 = this.f54084b.u.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "mVideoSeekBar.context");
            videoSeekBar2.setThumb(com.ss.android.ugc.bytex.a.a.a.a(context2.getResources(), 2130840469));
            ImageView imageView = this.f54085c;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f54085c;
            if (imageView2 != null) {
                imageView2.setScaleX(1.0f);
            }
            ImageView imageView3 = this.f54085c;
            if (imageView3 != null) {
                imageView3.setScaleY(1.0f);
            }
        }

        d(g gVar, ImageView imageView) {
            this.f54084b = gVar;
            this.f54085c = imageView;
        }
    }

    private final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3500b, false, 56889, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3500b, false, 56889, new Class[0], Void.TYPE);
            return;
        }
        this.u.postDelayed(this.t, 2000);
    }

    private boolean d() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f3500b, false, 56877, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3500b, false, 56877, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3501c == null || this.p == null) {
            return false;
        } else {
            Aweme aweme = this.f3501c;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = this.p;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            if (StringsKt.equals$default(str, str2, false, 2, null)) {
                return true;
            }
            return false;
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3500b, false, 56890, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3500b, false, 56890, new Class[0], Void.TYPE);
        } else if (this.u.getAlpha() != 0.0f && this.u.getVisibility() != 8) {
            this.u.removeCallbacks(this.t);
            bg.a(new h(this.f3501c));
            b();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3500b, false, 56892, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3500b, false, 56892, new Class[0], Void.TYPE);
        } else if (this.u.getAlpha() != 0.0f && this.u.getVisibility() != 8) {
            this.u.setAlpha(0.0f);
            bg.a(new h(this.f3501c));
        }
    }

    private final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3500b, false, 56888, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3500b, false, 56888, new Class[0], Void.TYPE);
        } else if (this.u.getAlpha() == 1.0f) {
            this.u.removeCallbacks(this.t);
        } else {
            this.u.setAlpha(0.15f);
            this.u.setPivotY((float) u.a(7.0d));
            ImageView coverThumbImg = this.u.getCoverThumbImg();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.u, "scaleY", new float[]{0.1f, 1.0f});
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "ObjectAnimator.ofFloat(m… SEEK_BAR_SCALE_HIDE, 1f)");
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(coverThumbImg, "scaleX", new float[]{0.1f, 1.0f});
            Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "ObjectAnimator.ofFloat(c… SEEK_BAR_SCALE_HIDE, 1f)");
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(coverThumbImg, "scaleY", new float[]{0.1f, 1.0f});
            Intrinsics.checkExpressionValueIsNotNull(ofFloat3, "ObjectAnimator.ofFloat(c… SEEK_BAR_SCALE_HIDE, 1f)");
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.u, "alpha", new float[]{0.15f, 1.0f});
            Intrinsics.checkExpressionValueIsNotNull(ofFloat4, "ObjectAnimator.ofFloat(m… SEEK_BAR_ALPHA_HIDE, 1f)");
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat4, ofFloat2, ofFloat3});
            animatorSet.setDuration(200);
            animatorSet.addListener(new d(this, coverThumbImg));
            animatorSet.start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f3500b
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 56878(0xde2e, float:7.9703E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f3500b
            r5 = 0
            r6 = 56878(0xde2e, float:7.9703E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f3501c
            if (r1 == 0) goto L_0x0032
            com.ss.android.ugc.aweme.feed.model.VideoControl r1 = r1.getVideoControl()
            if (r1 == 0) goto L_0x0032
            int r1 = r1.draftProgressBar
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            r2 = 1
            r3 = 8
            if (r1 != r2) goto L_0x008a
            boolean r1 = r9.d()
            if (r1 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar r1 = r9.u
            r1.setVisibility(r0)
            android.widget.LinearLayout r1 = r9.v
            r1.setVisibility(r3)
            com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar r1 = r9.u
            r2 = 0
            r1.setAlpha(r2)
            com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar r1 = r9.u
            r1.setProgress(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f3501c
            if (r1 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()
            if (r1 == 0) goto L_0x0062
            int r1 = r1.getDuration()
            goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            int r1 = com.ss.android.ugc.aweme.longvideo.b.f.a.b(r1)
            r9.f3504f = r1
            android.widget.TextView r1 = r9.f3503e
            if (r1 == 0) goto L_0x007a
            com.ss.android.ugc.aweme.longvideo.b.f$a r2 = com.ss.android.ugc.aweme.longvideo.b.f.f53897a
            int r3 = r9.f3504f
            java.lang.String r2 = r2.a(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
        L_0x007a:
            android.widget.TextView r1 = r9.f3502d
            if (r1 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.longvideo.b.f$a r2 = com.ss.android.ugc.aweme.longvideo.b.f.f53897a
            java.lang.String r0 = r2.a(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
        L_0x0089:
            return
        L_0x008a:
            com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar r0 = r9.u
            r0.setVisibility(r3)
            android.widget.LinearLayout r0 = r9.v
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.longvideonew.g.a():void");
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3500b, false, 56891, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3500b, false, 56891, new Class[0], Void.TYPE);
            return;
        }
        this.u.setAlpha(1.0f);
        this.u.setPivotY((float) u.a(7.0d));
        ImageView coverThumbImg = this.u.getCoverThumbImg();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.u, "scaleY", new float[]{1.0f, 0.1f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "ObjectAnimator.ofFloat(m… 1f, SEEK_BAR_SCALE_HIDE)");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(coverThumbImg, "scaleX", new float[]{1.0f, 0.1f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "ObjectAnimator.ofFloat(c… 1f, SEEK_BAR_SCALE_HIDE)");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(coverThumbImg, "scaleY", new float[]{1.0f, 0.1f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat3, "ObjectAnimator.ofFloat(c… 1f, SEEK_BAR_SCALE_HIDE)");
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.u, "alpha", new float[]{1.0f, 0.15f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat4, "ObjectAnimator.ofFloat(m… 1f, SEEK_BAR_ALPHA_HIDE)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat4, ofFloat2, ofFloat3});
        animatorSet.setDuration(200);
        animatorSet.addListener(new c(this, coverThumbImg));
        animatorSet.start();
    }

    public final void a(@Nullable SeekBar seekBar) {
        if (PatchProxy.isSupport(new Object[]{seekBar}, this, f3500b, false, 56885, new Class[]{SeekBar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar}, this, f3500b, false, 56885, new Class[]{SeekBar.class}, Void.TYPE);
            return;
        }
        this.g = true;
        if (this.i == 1) {
            BaseListFragmentPanel baseListFragmentPanel = this.k;
            if (baseListFragmentPanel != null) {
                baseListFragmentPanel.Z();
            }
        }
        if (seekBar != null) {
            this.n = seekBar.getProgress();
        }
    }

    public void onFullFeedVideoChangeEvent(@NotNull com.ss.android.ugc.aweme.feed.ui.seekbar.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3500b, false, 56880, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3500b, false, 56880, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        this.f3501c = aVar.f46849a;
        String str = aVar.f46850b;
        if (str == null) {
            str = "";
        }
        this.l = str;
        this.m = aVar.f46851c;
        this.k = aVar.f46852d;
        this.i = 0;
        if (!this.q) {
            this.r = false;
        }
    }

    public void onPlayerControllerRenderFirstFrameEvent(@NotNull com.ss.android.ugc.aweme.feed.ui.seekbar.c cVar) {
        com.ss.android.ugc.aweme.feed.ui.seekbar.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f3500b, false, 56879, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f3500b, false, 56879, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "event");
        this.p = cVar2.f46862a;
        a();
    }

    public void onVideoProgressVolumeKeyEvent(@NotNull com.ss.android.ugc.aweme.feed.ui.seekbar.g gVar) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f3500b, false, 56882, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f3500b, false, 56882, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.g.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(gVar, "event");
        if (this.f3501c != null && gVar.f46895a != null) {
            Aweme aweme = this.f3501c;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = gVar.f46895a;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            if (StringsKt.equals$default(str, str2, false, 2, null) && this.q) {
                g();
            }
        }
    }

    public void onPlayerControllerVideoPlayProgressChange(@NotNull com.ss.android.ugc.aweme.feed.ui.seekbar.d dVar) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f3500b, false, 56883, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f3500b, false, 56883, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar, "event");
        if (this.f3501c != null && dVar.f46867a != null) {
            Aweme aweme = this.f3501c;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = dVar.f46867a;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            if (StringsKt.equals$default(str, str2, false, 2, null) && !this.g) {
                if (this.j == 0 || SystemClock.elapsedRealtime() > this.j + 600) {
                    this.u.setProgress(dVar.f46870d);
                    TextView textView = this.f3502d;
                    if (textView != null) {
                        textView.setText(f.f53897a.a(dVar.f46870d, this.f3504f));
                    }
                }
            }
        }
    }

    public void onPlayerControllerVideoStatusEvent(@NotNull e eVar) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f3500b, false, 56881, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f3500b, false, 56881, new Class[]{e.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar, "event");
        if (this.f3501c != null && eVar.f46888a != null) {
            Aweme aweme = this.f3501c;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = eVar.f46888a;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            if (StringsKt.equals$default(str, str2, false, 2, null)) {
                switch (eVar.f46891d) {
                    case 1:
                        this.o = false;
                        this.i = 1;
                        e();
                        this.u.removeCallbacks(this.t);
                        this.u.setPauseStatus(true);
                        return;
                    case 2:
                        this.i = 2;
                        this.u.setPauseStatus(false);
                        if (this.q) {
                            if (!this.o) {
                                g();
                                break;
                            } else {
                                f();
                                return;
                            }
                        }
                        break;
                }
            }
        }
    }

    public void a(@Nullable MotionEvent motionEvent) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f3500b, false, 56887, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f3500b, false, 56887, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            this.u.removeCallbacks(this.t);
            e();
            if (PatchProxy.isSupport(new Object[0], this, f3500b, false, 56893, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3500b, false, 56893, new Class[0], Void.TYPE);
            } else {
                this.v.setVisibility(0);
                this.v.setAlpha(0.0f);
                ViewPropertyAnimator animate = this.v.animate();
                if (animate != null) {
                    ViewPropertyAnimator alpha = animate.alpha(1.0f);
                    if (alpha != null) {
                        ViewPropertyAnimator duration = alpha.setDuration(200);
                        if (duration != null) {
                            duration.start();
                        }
                    }
                }
            }
            this.h = false;
            this.q = false;
            this.s = Float.valueOf(motionEvent.getRawX());
            return;
        }
        if (num != null && num.intValue() == 2) {
            ImageView coverThumbImg = this.u.getCoverThumbImg();
            if (coverThumbImg != null && coverThumbImg.getVisibility() == 0) {
                ImageView coverThumbImg2 = this.u.getCoverThumbImg();
                if (coverThumbImg2 != null) {
                    coverThumbImg2.setVisibility(8);
                }
                VideoSeekBar videoSeekBar = this.u;
                Context context = this.u.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "mVideoSeekBar.context");
                videoSeekBar.setThumb(com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), 2130840469));
            }
            Float f2 = this.s;
            if (f2 != null && Math.abs(f2.floatValue() - motionEvent.getRawX()) > 10.0f) {
                this.h = true;
            }
        } else if (num != null && num.intValue() == 1) {
            this.q = true;
        } else if (num != null && num.intValue() == 3) {
            this.q = true;
        }
    }

    public void b(@Nullable SeekBar seekBar) {
        String str;
        int i2;
        String str2;
        if (PatchProxy.isSupport(new Object[]{seekBar}, this, f3500b, false, 56886, new Class[]{SeekBar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar}, this, f3500b, false, 56886, new Class[]{SeekBar.class}, Void.TYPE);
            return;
        }
        this.j = SystemClock.elapsedRealtime();
        this.g = false;
        this.o = true;
        Aweme aweme = null;
        if (this.h || this.i == 1) {
            f();
            this.h = false;
            if (seekBar != null) {
                int progress = seekBar.getProgress();
                if (!this.r) {
                    this.r = true;
                } else {
                    if (!o.v()) {
                        o.b().a(((float) progress) / 100.0f);
                        double d2 = (double) progress;
                        Double.isNaN(d2);
                        bg.a(new com.ss.android.ugc.aweme.feed.ui.seekbar.f(d2 / 100.0d, this.f3501c));
                    }
                    if (this.n < progress) {
                        str = "front";
                    } else {
                        str = "back";
                    }
                    if (this.i == 1) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.l).a("impr_type", aa.s(this.f3501c)).a("action_type", str).a("is_pause", i2).a("author_id", aa.a(this.f3501c)).a("page_type", this.m);
                    Aweme aweme2 = this.f3501c;
                    if (aweme2 != null) {
                        str2 = aweme2.getAid();
                    } else {
                        str2 = null;
                    }
                    r.a("click_progress_bar", (Map) a2.a("group_id", str2).f34114b);
                }
            }
        } else {
            g();
        }
        if (this.i == 1) {
            BaseListFragmentPanel baseListFragmentPanel = this.k;
            if (baseListFragmentPanel != null) {
                BaseListFragmentPanel baseListFragmentPanel2 = this.k;
                if (baseListFragmentPanel2 != null) {
                    aweme = baseListFragmentPanel2.ag();
                }
                baseListFragmentPanel.h(aweme);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f3500b, false, 56894, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3500b, false, 56894, new Class[0], Void.TYPE);
            return;
        }
        this.v.setAlpha(1.0f);
        ViewPropertyAnimator animate = this.v.animate();
        if (animate != null) {
            ViewPropertyAnimator alpha = animate.alpha(0.0f);
            if (alpha != null) {
                ViewPropertyAnimator duration = alpha.setDuration(200);
                if (duration != null) {
                    duration.start();
                }
            }
        }
        this.v.setVisibility(8);
    }

    public g(@NotNull VideoSeekBar videoSeekBar, @NotNull LinearLayout linearLayout) {
        Intrinsics.checkParameterIsNotNull(videoSeekBar, "mVideoSeekBar");
        Intrinsics.checkParameterIsNotNull(linearLayout, "mVideoSeekDuration");
        this.u = videoSeekBar;
        this.v = linearLayout;
        this.u.setVisibility(8);
        this.v.setVisibility(8);
        this.u.setOnSeekBarChangeListener(this);
        this.u.setOnDispatchTouchEventListener(this);
        this.f3502d = (TextView) this.v.findViewById(C0906R.id.a1y);
        this.f3503e = (TextView) this.v.findViewById(C0906R.id.d66);
        this.t = new b(this);
    }

    public final void a(@Nullable SeekBar seekBar, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{seekBar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f3500b, false, 56884, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f3500b, false, 56884, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        TextView textView = this.f3502d;
        if (textView != null) {
            textView.setText(f.f53897a.a(((float) i2) / 100.0f, this.f3504f));
        }
    }
}
