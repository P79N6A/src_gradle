package com.ss.android.ugc.aweme.longvideo.feature;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.ui.AudioControlView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0007J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/feature/VolumeController;", "Landroid/arch/lifecycle/LifecycleObserver;", "Lcom/ss/android/ugc/aweme/base/activity/ActivityOnKeyDownListener;", "activity", "Landroid/support/v4/app/FragmentActivity;", "audioControlView", "Lcom/ss/android/ugc/aweme/base/ui/AudioControlView;", "(Landroid/support/v4/app/FragmentActivity;Lcom/ss/android/ugc/aweme/base/ui/AudioControlView;)V", "getActivity", "()Landroid/support/v4/app/FragmentActivity;", "getAudioControlView", "()Lcom/ss/android/ugc/aweme/base/ui/AudioControlView;", "mAddVolumeAnim", "Landroid/animation/AnimatorSet;", "mCutVolumeAnim", "mHideAnimatorSet", "cancelHideVolumeAnim", "", "hideVolumeAnim", "onDestroy", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "playAddVolumeAnim", "playCutVolumeAnim", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VolumeController implements LifecycleObserver, com.ss.android.ugc.aweme.base.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3479a;

    /* renamed from: b  reason: collision with root package name */
    AnimatorSet f3480b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final FragmentActivity f3481c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final AudioControlView f3482d;

    /* renamed from: e  reason: collision with root package name */
    private AnimatorSet f3483e;

    /* renamed from: f  reason: collision with root package name */
    private AnimatorSet f3484f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/longvideo/feature/VolumeController$playAddVolumeAnim$1$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease", "com/ss/android/ugc/aweme/longvideo/feature/VolumeController$$special$$inlined$apply$lambda$2"}, k = 1, mv = {1, 1, 15})
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53933a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VolumeController f53934b;

        a(VolumeController volumeController) {
            this.f53934b = volumeController;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            Animator animator2 = animator;
            if (PatchProxy.isSupport(new Object[]{animator2}, this, f53933a, false, 56727, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator2}, this, f53933a, false, 56727, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator2, "animation");
            this.f53934b.f3482d.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/longvideo/feature/VolumeController$playCutVolumeAnim$1$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease", "com/ss/android/ugc/aweme/longvideo/feature/VolumeController$$special$$inlined$apply$lambda$1"}, k = 1, mv = {1, 1, 15})
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53935a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VolumeController f53936b;

        b(VolumeController volumeController) {
            this.f53936b = volumeController;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            Animator animator2 = animator;
            if (PatchProxy.isSupport(new Object[]{animator2}, this, f53935a, false, 56728, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator2}, this, f53935a, false, 56728, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator2, "animation");
            this.f53936b.f3482d.b();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3479a, false, 56724, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3479a, false, 56724, new Class[0], Void.TYPE);
            return;
        }
        AnimatorSet animatorSet = this.f3483e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f3484f;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.f3480b;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
    }

    public VolumeController(@NotNull FragmentActivity fragmentActivity, @Nullable AudioControlView audioControlView) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f3481c = fragmentActivity;
        this.f3482d = audioControlView;
        this.f3481c.getLifecycle().addObserver(this);
        AudioControlView audioControlView2 = this.f3482d;
        if (audioControlView2 != null) {
            audioControlView2.setOnAudioControlViewHideListener(new AudioControlView.b(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f53931a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ VolumeController f53932b;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f53931a, false, 56725, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f53931a, false, 56725, new Class[0], Void.TYPE);
                        return;
                    }
                    VolumeController volumeController = this.f53932b;
                    if (PatchProxy.isSupport(new Object[0], volumeController, VolumeController.f3479a, false, 56719, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], volumeController, VolumeController.f3479a, false, 56719, new Class[0], Void.TYPE);
                        return;
                    }
                    if (volumeController.f3482d != null) {
                        volumeController.f3480b = new AnimatorSet();
                        AnimatorSet animatorSet = volumeController.f3480b;
                        if (animatorSet != null) {
                            animatorSet.play(volumeController.f3482d.getHideVolumeAnim());
                            animatorSet.start();
                        }
                    }
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f53931a, false, 56726, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f53931a, false, 56726, new Class[0], Void.TYPE);
                        return;
                    }
                    VolumeController volumeController = this.f53932b;
                    if (PatchProxy.isSupport(new Object[0], volumeController, VolumeController.f3479a, false, 56720, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], volumeController, VolumeController.f3479a, false, 56720, new Class[0], Void.TYPE);
                        return;
                    }
                    AnimatorSet animatorSet = volumeController.f3480b;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AudioControlView audioControlView = volumeController.f3482d;
                    if (audioControlView != null) {
                        audioControlView.setAlpha(1.0f);
                    }
                }

                {
                    this.f53932b = r1;
                }
            });
        }
    }

    public final boolean a(int i, @Nullable KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f3479a, false, 56721, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f3479a, false, 56721, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        switch (i) {
            case 24:
                if (PatchProxy.isSupport(new Object[0], this, f3479a, false, 56723, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3479a, false, 56723, new Class[0], Void.TYPE);
                } else if (this.f3482d != null) {
                    this.f3484f = new AnimatorSet();
                    AnimatorSet animatorSet = this.f3484f;
                    if (animatorSet != null) {
                        animatorSet.play(this.f3482d.getShowVolumeAnim());
                        animatorSet.addListener(new a(this));
                        animatorSet.start();
                    }
                }
                return true;
            case 25:
                if (PatchProxy.isSupport(new Object[0], this, f3479a, false, 56722, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3479a, false, 56722, new Class[0], Void.TYPE);
                } else if (this.f3482d != null) {
                    this.f3483e = new AnimatorSet();
                    AnimatorSet animatorSet2 = this.f3483e;
                    if (animatorSet2 != null) {
                        animatorSet2.play(this.f3482d.getShowVolumeAnim());
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
