package com.facebook.react.animation;

import android.view.View;
import com.facebook.infer.annotation.a;
import javax.annotation.Nullable;

public abstract class Animation {
    @Nullable
    private View mAnimatedView;
    private final int mAnimationID;
    @Nullable
    private AnimationListener mAnimationListener;
    private volatile boolean mCancelled;
    private volatile boolean mIsFinished;
    private final AnimationPropertyUpdater mPropertyUpdater;

    public abstract void run();

    public int getAnimationID() {
        return this.mAnimationID;
    }

    public final void cancel() {
        if (!this.mIsFinished && !this.mCancelled) {
            this.mCancelled = true;
            if (this.mAnimationListener != null) {
                this.mAnimationListener.onCancel();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finish() {
        a.a(!this.mIsFinished, "Animation must not already be finished!");
        this.mIsFinished = true;
        if (!this.mCancelled) {
            if (this.mAnimatedView != null) {
                this.mPropertyUpdater.onFinish(this.mAnimatedView);
            }
            if (this.mAnimationListener != null) {
                this.mAnimationListener.onFinished();
            }
        }
    }

    public void setAnimationListener(AnimationListener animationListener) {
        this.mAnimationListener = animationListener;
    }

    public final void start(View view) {
        this.mAnimatedView = view;
        this.mPropertyUpdater.prepare(view);
        run();
    }

    /* access modifiers changed from: protected */
    public final boolean onUpdate(float f2) {
        a.a(!this.mIsFinished, "Animation must not already be finished!");
        if (!this.mCancelled) {
            this.mPropertyUpdater.onUpdate((View) a.b(this.mAnimatedView), f2);
        }
        if (!this.mCancelled) {
            return true;
        }
        return false;
    }

    public Animation(int i, AnimationPropertyUpdater animationPropertyUpdater) {
        this.mAnimationID = i;
        this.mPropertyUpdater = animationPropertyUpdater;
    }
}
