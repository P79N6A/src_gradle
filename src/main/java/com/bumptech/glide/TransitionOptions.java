package com.bumptech.glide;

import android.support.annotation.NonNull;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.NoTransition;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.request.transition.ViewAnimationFactory;
import com.bumptech.glide.request.transition.ViewPropertyAnimationFactory;
import com.bumptech.glide.request.transition.ViewPropertyTransition;
import com.bumptech.glide.util.Preconditions;

public abstract class TransitionOptions<CHILD extends TransitionOptions<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    private TransitionFactory<? super TranscodeType> transitionFactory = NoTransition.getFactory();

    private CHILD self() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public final TransitionFactory<? super TranscodeType> getTransitionFactory() {
        return this.transitionFactory;
    }

    public final CHILD clone() {
        try {
            return (TransitionOptions) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @NonNull
    public final CHILD dontTransition() {
        return transition(NoTransition.getFactory());
    }

    @NonNull
    public final CHILD transition(int i) {
        return transition((TransitionFactory<? super TranscodeType>) new ViewAnimationFactory<Object>(i));
    }

    @NonNull
    public final CHILD transition(@NonNull TransitionFactory<? super TranscodeType> transitionFactory2) {
        this.transitionFactory = (TransitionFactory) Preconditions.checkNotNull(transitionFactory2);
        return self();
    }

    @NonNull
    public final CHILD transition(@NonNull ViewPropertyTransition.Animator animator) {
        return transition((TransitionFactory<? super TranscodeType>) new ViewPropertyAnimationFactory<Object>(animator));
    }
}
