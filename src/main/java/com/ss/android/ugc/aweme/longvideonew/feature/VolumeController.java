package com.ss.android.ugc.aweme.longvideonew.feature;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.arch.lifecycle.LifecycleObserver;
import android.view.KeyEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AudioControlView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0006\u0010\u000f\u001a\u00020\rJ\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0002J\b\u0010\u0017\u001a\u00020\rH\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/feature/VolumeController;", "Landroid/arch/lifecycle/LifecycleObserver;", "Lcom/ss/android/ugc/aweme/base/activity/ActivityOnKeyDownListener;", "audioControlView", "Lcom/ss/android/ugc/aweme/base/ui/AudioControlView;", "(Lcom/ss/android/ugc/aweme/base/ui/AudioControlView;)V", "getAudioControlView", "()Lcom/ss/android/ugc/aweme/base/ui/AudioControlView;", "mAddVolumeAnim", "Landroid/animation/AnimatorSet;", "mCutVolumeAnim", "mHideAnimatorSet", "cancelHideVolumeAnim", "", "hideVolumeAnim", "onDestroy", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "playAddVolumeAnim", "playCutVolumeAnim", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VolumeController implements LifecycleObserver, com.ss.android.ugc.aweme.base.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54053a;

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f54054b;

    /* renamed from: c  reason: collision with root package name */
    public AnimatorSet f54055c;

    /* renamed from: d  reason: collision with root package name */
    public AnimatorSet f54056d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final AudioControlView f54057e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/longvideonew/feature/VolumeController$playAddVolumeAnim$1$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease", "com/ss/android/ugc/aweme/longvideonew/feature/VolumeController$$special$$inlined$apply$lambda$2"}, k = 1, mv = {1, 1, 15})
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54060a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VolumeController f54061b;

        a(VolumeController volumeController) {
            this.f54061b = volumeController;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            Animator animator2 = animator;
            if (PatchProxy.isSupport(new Object[]{animator2}, this, f54060a, false, 56940, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator2}, this, f54060a, false, 56940, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator2, "animation");
            this.f54061b.f54057e.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/longvideonew/feature/VolumeController$playCutVolumeAnim$1$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease", "com/ss/android/ugc/aweme/longvideonew/feature/VolumeController$$special$$inlined$apply$lambda$1"}, k = 1, mv = {1, 1, 15})
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54062a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VolumeController f54063b;

        b(VolumeController volumeController) {
            this.f54063b = volumeController;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            Animator animator2 = animator;
            if (PatchProxy.isSupport(new Object[]{animator2}, this, f54062a, false, 56941, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator2}, this, f54062a, false, 56941, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator2, "animation");
            this.f54063b.f54057e.b();
        }
    }

    public VolumeController(@Nullable AudioControlView audioControlView) {
        this.f54057e = audioControlView;
        AudioControlView audioControlView2 = this.f54057e;
        if (audioControlView2 != null) {
            audioControlView2.setOnAudioControlViewHideListener(new AudioControlView.b(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54058a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ VolumeController f54059b;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f54058a, false, 56938, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f54058a, false, 56938, new Class[0], Void.TYPE);
                        return;
                    }
                    VolumeController volumeController = this.f54059b;
                    if (PatchProxy.isSupport(new Object[0], volumeController, VolumeController.f54053a, false, 56932, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], volumeController, VolumeController.f54053a, false, 56932, new Class[0], Void.TYPE);
                        return;
                    }
                    if (volumeController.f54057e != null) {
                        volumeController.f54056d = new AnimatorSet();
                        AnimatorSet animatorSet = volumeController.f54056d;
                        if (animatorSet != null) {
                            animatorSet.play(volumeController.f54057e.getHideVolumeAnim());
                            animatorSet.start();
                        }
                    }
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f54058a, false, 56939, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f54058a, false, 56939, new Class[0], Void.TYPE);
                        return;
                    }
                    VolumeController volumeController = this.f54059b;
                    if (PatchProxy.isSupport(new Object[0], volumeController, VolumeController.f54053a, false, 56933, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], volumeController, VolumeController.f54053a, false, 56933, new Class[0], Void.TYPE);
                        return;
                    }
                    AnimatorSet animatorSet = volumeController.f54056d;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AudioControlView audioControlView = volumeController.f54057e;
                    if (audioControlView != null) {
                        audioControlView.setAlpha(1.0f);
                    }
                }

                {
                    this.f54059b = r1;
                }
            });
        }
    }

    public final boolean a(int i, @Nullable KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f54053a, false, 56934, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f54053a, false, 56934, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        switch (i) {
            case 24:
                if (PatchProxy.isSupport(new Object[0], this, f54053a, false, 56936, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f54053a, false, 56936, new Class[0], Void.TYPE);
                } else if (this.f54057e != null) {
                    this.f54055c = new AnimatorSet();
                    AnimatorSet animatorSet = this.f54055c;
                    if (animatorSet != null) {
                        animatorSet.play(this.f54057e.getShowVolumeAnim());
                        animatorSet.addListener(new a(this));
                        animatorSet.start();
                    }
                }
                return true;
            case 25:
                if (PatchProxy.isSupport(new Object[0], this, f54053a, false, 56935, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f54053a, false, 56935, new Class[0], Void.TYPE);
                } else if (this.f54057e != null) {
                    this.f54054b = new AnimatorSet();
                    AnimatorSet animatorSet2 = this.f54054b;
                    if (animatorSet2 != null) {
                        animatorSet2.play(this.f54057e.getShowVolumeAnim());
                        animatorSet2.addListener(new b(this));
                        animatorSet2.start();
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
