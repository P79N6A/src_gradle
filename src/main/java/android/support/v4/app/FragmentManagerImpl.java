package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.ViewModelStore;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.util.ArraySet;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.LogWriter;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class FragmentManagerImpl extends FragmentManager implements LayoutInflater.Factory2 {
    static final Interpolator ACCELERATE_CUBIC = new AccelerateInterpolator(1.5f);
    static final Interpolator ACCELERATE_QUINT = new AccelerateInterpolator(2.5f);
    static boolean DEBUG;
    static final Interpolator DECELERATE_CUBIC = new DecelerateInterpolator(1.5f);
    static final Interpolator DECELERATE_QUINT = new DecelerateInterpolator(2.5f);
    static Field sAnimationListenerField;
    SparseArray<Fragment> mActive;
    final ArrayList<Fragment> mAdded = new ArrayList<>();
    ArrayList<Integer> mAvailBackStackIndices;
    ArrayList<BackStackRecord> mBackStack;
    ArrayList<FragmentManager.OnBackStackChangedListener> mBackStackChangeListeners;
    ArrayList<BackStackRecord> mBackStackIndices;
    FragmentContainer mContainer;
    ArrayList<Fragment> mCreatedMenus;
    int mCurState = 0;
    boolean mDestroyed;
    Runnable mExecCommit = new Runnable() {
        public void run() {
            FragmentManagerImpl.this.execPendingActions();
        }
    };
    boolean mExecutingActions;
    boolean mHavePendingDeferredStart;
    FragmentHostCallback mHost;
    private final CopyOnWriteArrayList<FragmentLifecycleCallbacksHolder> mLifecycleCallbacks = new CopyOnWriteArrayList<>();
    boolean mNeedMenuInvalidate;
    int mNextFragmentIndex;
    String mNoTransactionsBecause;
    Fragment mParent;
    ArrayList<OpGenerator> mPendingActions;
    ArrayList<StartEnterTransitionListener> mPostponedTransactions;
    @Nullable
    Fragment mPrimaryNav;
    FragmentManagerNonConfig mSavedNonConfig;
    SparseArray<Parcelable> mStateArray = null;
    Bundle mStateBundle = null;
    boolean mStateSaved;
    boolean mStopped;
    ArrayList<Fragment> mTmpAddedFragments;
    ArrayList<Boolean> mTmpIsPop;
    ArrayList<BackStackRecord> mTmpRecords;

    static class AnimateOnHWLayerIfNeededListener extends AnimationListenerWrapper {
        View mView;

        @CallSuper
        public void onAnimationEnd(Animation animation) {
            if (ViewCompat.isAttachedToWindow(this.mView) || Build.VERSION.SDK_INT >= 24) {
                this.mView.post(new Runnable() {
                    public void run() {
                        AnimateOnHWLayerIfNeededListener.this.mView.setLayerType(0, null);
                    }
                });
            } else {
                this.mView.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }

        AnimateOnHWLayerIfNeededListener(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.mView = view;
        }
    }

    static class AnimationListenerWrapper implements Animation.AnimationListener {
        private final Animation.AnimationListener mWrapped;

        AnimationListenerWrapper(Animation.AnimationListener animationListener) {
            this.mWrapped = animationListener;
        }

        @CallSuper
        public void onAnimationEnd(Animation animation) {
            if (this.mWrapped != null) {
                this.mWrapped.onAnimationEnd(animation);
            }
        }

        @CallSuper
        public void onAnimationRepeat(Animation animation) {
            if (this.mWrapped != null) {
                this.mWrapped.onAnimationRepeat(animation);
            }
        }

        @CallSuper
        public void onAnimationStart(Animation animation) {
            if (this.mWrapped != null) {
                this.mWrapped.onAnimationStart(animation);
            }
        }
    }

    static class AnimationOrAnimator {
        public final Animation animation;
        public final Animator animator;

        AnimationOrAnimator(Animator animator2) {
            this.animator = animator2;
            if (animator2 == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        AnimationOrAnimator(Animation animation2) {
            this.animation = animation2;
            if (animation2 == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    static class AnimatorOnHWLayerIfNeededListener extends AnimatorListenerAdapter {
        View mView;

        AnimatorOnHWLayerIfNeededListener(View view) {
            this.mView = view;
        }

        public void onAnimationStart(Animator animator) {
            this.mView.setLayerType(2, null);
        }

        public void onAnimationEnd(Animator animator) {
            this.mView.setLayerType(0, null);
            animator.removeListener(this);
        }
    }

    static class EndViewTransitionAnimator extends AnimationSet implements Runnable {
        private boolean mAnimating = true;
        private final View mChild;
        private boolean mEnded;
        private final ViewGroup mParent;
        private boolean mTransitionEnded;

        public void run() {
            if (this.mEnded || !this.mAnimating) {
                this.mParent.endViewTransition(this.mChild);
                this.mTransitionEnded = true;
                return;
            }
            this.mAnimating = false;
            this.mParent.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.mAnimating = true;
            if (!this.mEnded) {
                if (!super.getTransformation(j, transformation)) {
                    this.mEnded = true;
                    OneShotPreDrawListener.add(this.mParent, this);
                }
                return true;
            } else if (!this.mTransitionEnded) {
                return true;
            } else {
                return false;
            }
        }

        EndViewTransitionAnimator(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.mParent = viewGroup;
            this.mChild = view;
            addAnimation(animation);
            this.mParent.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f2) {
            this.mAnimating = true;
            if (!this.mEnded) {
                if (!super.getTransformation(j, transformation, f2)) {
                    this.mEnded = true;
                    OneShotPreDrawListener.add(this.mParent, this);
                }
                return true;
            } else if (!this.mTransitionEnded) {
                return true;
            } else {
                return false;
            }
        }
    }

    static final class FragmentLifecycleCallbacksHolder {
        final FragmentManager.FragmentLifecycleCallbacks mCallback;
        final boolean mRecursive;

        FragmentLifecycleCallbacksHolder(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
            this.mCallback = fragmentLifecycleCallbacks;
            this.mRecursive = z;
        }
    }

    static class FragmentTag {
        public static final int[] Fragment = {16842755, 16842960, 16842961};

        private FragmentTag() {
        }
    }

    interface OpGenerator {
        boolean generateOps(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2);
    }

    class PopBackStackState implements OpGenerator {
        final int mFlags;
        final int mId;
        final String mName;

        public boolean generateOps(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
            if (FragmentManagerImpl.this.mPrimaryNav != null && this.mId < 0 && this.mName == null) {
                FragmentManager peekChildFragmentManager = FragmentManagerImpl.this.mPrimaryNav.peekChildFragmentManager();
                if (peekChildFragmentManager != null && peekChildFragmentManager.popBackStackImmediate()) {
                    return false;
                }
            }
            return FragmentManagerImpl.this.popBackStackState(arrayList, arrayList2, this.mName, this.mId, this.mFlags);
        }

        PopBackStackState(String str, int i, int i2) {
            this.mName = str;
            this.mId = i;
            this.mFlags = i2;
        }
    }

    static class StartEnterTransitionListener implements Fragment.OnStartEnterTransitionListener {
        final boolean mIsBack;
        private int mNumPostponed;
        final BackStackRecord mRecord;

        public boolean isReady() {
            if (this.mNumPostponed == 0) {
                return true;
            }
            return false;
        }

        public void startListening() {
            this.mNumPostponed++;
        }

        public void cancelTransaction() {
            this.mRecord.mManager.completeExecute(this.mRecord, this.mIsBack, false, false);
        }

        public void onStartEnterTransition() {
            this.mNumPostponed--;
            if (this.mNumPostponed == 0) {
                this.mRecord.mManager.scheduleCommit();
            }
        }

        public void completeTransaction() {
            boolean z;
            if (this.mNumPostponed > 0) {
                z = true;
            } else {
                z = false;
            }
            FragmentManagerImpl fragmentManagerImpl = this.mRecord.mManager;
            int size = fragmentManagerImpl.mAdded.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = fragmentManagerImpl.mAdded.get(i);
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            this.mRecord.mManager.completeExecute(this.mRecord, this.mIsBack, !z, true);
        }

        StartEnterTransitionListener(BackStackRecord backStackRecord, boolean z) {
            this.mIsBack = z;
            this.mRecord = backStackRecord;
        }
    }

    public class _lancet {
        private _lancet() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x00ab  */
        @me.ele.lancet.base.annotations.TargetClass
        @me.ele.lancet.base.annotations.Proxy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static void com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState(android.support.v4.app.FragmentManagerImpl r4, android.support.v4.app.Fragment r5, int r6, int r7, int r8, boolean r9) {
            /*
                r4.moveToState(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0004 }
                return
            L_0x0004:
                r4 = move-exception
                boolean r0 = com.ss.android.ugc.aweme.g.a.a()
                if (r0 != 0) goto L_0x00b8
                if (r5 == 0) goto L_0x0016
                java.lang.Class r0 = r5.getClass()     // Catch:{ Exception -> 0x0092 }
                java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0092 }
                goto L_0x0018
            L_0x0016:
                java.lang.String r0 = ""
            L_0x0018:
                com.ss.android.ugc.aweme.app.p r1 = com.ss.android.ugc.aweme.app.p.a()     // Catch:{ Exception -> 0x0092 }
                android.app.Activity r1 = r1.e()     // Catch:{ Exception -> 0x0092 }
                if (r1 == 0) goto L_0x002b
                java.lang.Class r1 = r1.getClass()     // Catch:{ Exception -> 0x0092 }
                java.lang.String r1 = r1.getName()     // Catch:{ Exception -> 0x0092 }
                goto L_0x002d
            L_0x002b:
                java.lang.String r1 = ""
            L_0x002d:
                com.ss.android.ugc.aweme.app.d.c r2 = com.ss.android.ugc.aweme.app.d.c.a()     // Catch:{ Exception -> 0x0092 }
                java.lang.String r3 = "fragmentname"
                com.ss.android.ugc.aweme.app.d.c r2 = r2.a((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ Exception -> 0x0092 }
                java.lang.String r3 = "newState"
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0092 }
                com.ss.android.ugc.aweme.app.d.c r6 = r2.a((java.lang.String) r3, (java.lang.Integer) r6)     // Catch:{ Exception -> 0x0092 }
                java.lang.String r2 = "transit"
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0092 }
                com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r2, (java.lang.Integer) r7)     // Catch:{ Exception -> 0x0092 }
                java.lang.String r7 = "transitionStyle"
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0092 }
                com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.Integer) r8)     // Catch:{ Exception -> 0x0092 }
                java.lang.String r7 = "keepActive"
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x0092 }
                com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.Boolean) r8)     // Catch:{ Exception -> 0x0092 }
                java.lang.String r7 = "currentActivity"
                com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.String) r1)     // Catch:{ Exception -> 0x0092 }
                java.lang.String r7 = "errorMsg"
                java.lang.String r8 = android.util.Log.getStackTraceString(r4)     // Catch:{ Exception -> 0x0092 }
                com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.String) r8)     // Catch:{ Exception -> 0x0092 }
                org.json.JSONObject r6 = r6.b()     // Catch:{ Exception -> 0x0092 }
                java.lang.String r7 = "fragment_crash_log"
                java.lang.String r8 = ""
                com.ss.android.ugc.aweme.app.d.c r9 = com.ss.android.ugc.aweme.app.d.c.a()     // Catch:{ Exception -> 0x0092 }
                java.lang.String r1 = "errorDesc"
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0092 }
                com.ss.android.ugc.aweme.app.d.c r6 = r9.a((java.lang.String) r1, (java.lang.String) r6)     // Catch:{ Exception -> 0x0092 }
                java.lang.String r9 = "fragment_name"
                com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r9, (java.lang.String) r0)     // Catch:{ Exception -> 0x0092 }
                org.json.JSONObject r6 = r6.b()     // Catch:{ Exception -> 0x0092 }
                com.ss.android.ugc.aweme.app.n.a(r7, r8, r6)     // Catch:{ Exception -> 0x0092 }
            L_0x0092:
                r6 = 4
                java.lang.Class[] r7 = new java.lang.Class[r6]
                java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageFragment> r8 = com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageFragment.class
                r9 = 0
                r7[r9] = r8
                java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2> r8 = com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2.class
                r0 = 1
                r7[r0] = r8
                r8 = 2
                java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.form.AdFormBrowserFragment> r0 = com.ss.android.ugc.aweme.commercialize.views.form.AdFormBrowserFragment.class
                r7[r8] = r0
                r8 = 3
                java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment> r0 = com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment.class
                r7[r8] = r0
            L_0x00a9:
                if (r9 >= r6) goto L_0x00b7
                r8 = r7[r9]
                boolean r8 = r8.isInstance(r5)
                if (r8 == 0) goto L_0x00b4
                return
            L_0x00b4:
                int r9 = r9 + 1
                goto L_0x00a9
            L_0x00b7:
                throw r4
            L_0x00b8:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl._lancet.com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState(android.support.v4.app.FragmentManagerImpl, android.support.v4.app.Fragment, int, int, int, boolean):void");
        }
    }

    public static int reverseTransit(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    public static int transitToStyleIndex(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        }
        if (i == 4099) {
            return z ? 5 : 6;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    /* access modifiers changed from: package-private */
    public final LayoutInflater.Factory2 getLayoutInflaterFactory() {
        return this;
    }

    @Nullable
    public final Fragment getPrimaryNavigationFragment() {
        return this.mPrimaryNav;
    }

    public final boolean isDestroyed() {
        return this.mDestroyed;
    }

    public final FragmentTransaction beginTransaction() {
        return new BackStackRecord(this);
    }

    public final void dispatchDestroyView() {
        dispatchStateChange(1);
    }

    public final void dispatchPause() {
        dispatchStateChange(3);
    }

    public final void dispatchStop() {
        this.mStopped = true;
        dispatchStateChange(2);
    }

    public final boolean executePendingTransactions() {
        boolean execPendingActions = execPendingActions();
        forcePostponedTransactions();
        return execPendingActions;
    }

    /* access modifiers changed from: package-private */
    public final FragmentManagerNonConfig retainNonConfig() {
        setRetaining(this.mSavedNonConfig);
        return this.mSavedNonConfig;
    }

    private void cleanupExec() {
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    public final void dispatchActivityCreated() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(2);
    }

    public final void dispatchCreate() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(1);
    }

    public final void dispatchResume() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(4);
    }

    public final void dispatchStart() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(3);
    }

    /* access modifiers changed from: package-private */
    public final void doPendingDeferredStart() {
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            startPendingDeferredFragments();
        }
    }

    /* access modifiers changed from: package-private */
    public final int getActiveFragmentCount() {
        if (this.mActive == null) {
            return 0;
        }
        return this.mActive.size();
    }

    public final int getBackStackEntryCount() {
        if (this.mBackStack != null) {
            return this.mBackStack.size();
        }
        return 0;
    }

    public final boolean isStateSaved() {
        if (this.mStateSaved || this.mStopped) {
            return true;
        }
        return false;
    }

    public final void popBackStack() {
        enqueueAction(new PopBackStackState(null, -1, 0), false);
    }

    public final boolean popBackStackImmediate() {
        checkStateLoss();
        return popBackStackImmediate(null, -1, 0);
    }

    private void forcePostponedTransactions() {
        if (this.mPostponedTransactions != null) {
            while (!this.mPostponedTransactions.isEmpty()) {
                this.mPostponedTransactions.remove(0).completeTransaction();
            }
        }
    }

    public final void dispatchDestroy() {
        this.mDestroyed = true;
        execPendingActions();
        dispatchStateChange(0);
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
    }

    public final void dispatchLowMemory() {
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = this.mAdded.get(i);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public final List<Fragment> getFragments() {
        List<Fragment> list;
        if (this.mAdded.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.mAdded) {
            list = (List) this.mAdded.clone();
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    public final void reportBackStackChanged() {
        if (this.mBackStackChangeListeners != null) {
            for (int i = 0; i < this.mBackStackChangeListeners.size(); i++) {
                this.mBackStackChangeListeners.get(i).onBackStackChanged();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void startPendingDeferredFragments() {
        if (this.mActive != null) {
            for (int i = 0; i < this.mActive.size(); i++) {
                Fragment valueAt = this.mActive.valueAt(i);
                if (valueAt != null) {
                    performPendingDeferredStart(valueAt);
                }
            }
        }
    }

    FragmentManagerImpl() {
    }

    private void burpActive() {
        if (this.mActive != null) {
            for (int size = this.mActive.size() - 1; size >= 0; size--) {
                if (this.mActive.valueAt(size) == null) {
                    this.mActive.delete(this.mActive.keyAt(size));
                }
            }
        }
    }

    private void checkStateLoss() {
        if (isStateSaved()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.mNoTransactionsBecause != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.mNoTransactionsBecause);
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean execPendingActions() {
        ensureExecReady(true);
        boolean z = false;
        while (generateOpsForPendingActions(this.mTmpRecords, this.mTmpIsPop)) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                cleanupExec();
                z = true;
            } catch (Throwable th) {
                cleanupExec();
                throw th;
            }
        }
        doPendingDeferredStart();
        burpActive();
        return z;
    }

    /* access modifiers changed from: package-private */
    public final List<Fragment> getActiveFragments() {
        if (this.mActive == null) {
            return null;
        }
        int size = this.mActive.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(this.mActive.valueAt(i));
        }
        return arrayList;
    }

    public final void noteStateNotSaved() {
        this.mSavedNonConfig = null;
        this.mStateSaved = false;
        this.mStopped = false;
        int size = this.mAdded.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.mAdded.get(i);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void scheduleCommit() {
        boolean z;
        synchronized (this) {
            boolean z2 = false;
            if (this.mPostponedTransactions == null || this.mPostponedTransactions.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (this.mPendingActions != null && this.mPendingActions.size() == 1) {
                z2 = true;
            }
            if (z || z2) {
                this.mHost.getHandler().removeCallbacks(this.mExecCommit);
                this.mHost.getHandler().post(this.mExecCommit);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(SearchJediMixFeedAdapter.f42517f);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.mParent != null) {
            DebugUtils.buildShortClassTag(this.mParent, sb);
        } else {
            DebugUtils.buildShortClassTag(this.mHost, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    private void endAnimatingAwayFragments() {
        int i;
        if (this.mActive == null) {
            i = 0;
        } else {
            i = this.mActive.size();
        }
        for (int i2 = 0; i2 < i; i2++) {
            Fragment valueAt = this.mActive.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.getAnimatingAway() != null) {
                    int stateAfterAnimating = valueAt.getStateAfterAnimating();
                    View animatingAway = valueAt.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    valueAt.setAnimatingAway(null);
                    _lancet.com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState(this, valueAt, stateAfterAnimating, 0, 0, false);
                } else if (valueAt.getAnimator() != null) {
                    valueAt.getAnimator().end();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void saveNonConfig() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        FragmentManagerNonConfig fragmentManagerNonConfig;
        int i;
        if (this.mActive != null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            for (int i2 = 0; i2 < this.mActive.size(); i2++) {
                Fragment valueAt = this.mActive.valueAt(i2);
                if (valueAt != null) {
                    if (valueAt.mRetainInstance) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(valueAt);
                        if (valueAt.mTarget != null) {
                            i = valueAt.mTarget.mIndex;
                        } else {
                            i = -1;
                        }
                        valueAt.mTargetIndex = i;
                    }
                    if (valueAt.mChildFragmentManager != null) {
                        valueAt.mChildFragmentManager.saveNonConfig();
                        fragmentManagerNonConfig = valueAt.mChildFragmentManager.mSavedNonConfig;
                    } else {
                        fragmentManagerNonConfig = valueAt.mChildNonConfig;
                    }
                    if (arrayList2 == null && fragmentManagerNonConfig != null) {
                        arrayList2 = new ArrayList(this.mActive.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(fragmentManagerNonConfig);
                    }
                    if (arrayList == null && valueAt.mViewModelStore != null) {
                        arrayList = new ArrayList(this.mActive.size());
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList.add(null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(valueAt.mViewModelStore);
                    }
                }
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList3 == null && arrayList2 == null && arrayList == null) {
            this.mSavedNonConfig = null;
        } else {
            this.mSavedNonConfig = new FragmentManagerNonConfig(arrayList3, arrayList2, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    public final Parcelable saveAllState() {
        int[] iArr;
        forcePostponedTransactions();
        endAnimatingAwayFragments();
        execPendingActions();
        this.mStateSaved = true;
        BackStackState[] backStackStateArr = null;
        this.mSavedNonConfig = null;
        if (this.mActive == null || this.mActive.size() <= 0) {
            return null;
        }
        int size = this.mActive.size();
        FragmentState[] fragmentStateArr = new FragmentState[size];
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Fragment valueAt = this.mActive.valueAt(i);
            if (valueAt != null) {
                if (valueAt.mIndex < 0) {
                    throwException(new IllegalStateException("Failure saving state: active " + valueAt + " has cleared index: " + valueAt.mIndex));
                }
                FragmentState fragmentState = new FragmentState(valueAt);
                fragmentStateArr[i] = fragmentState;
                if (valueAt.mState <= 0 || fragmentState.mSavedFragmentState != null) {
                    fragmentState.mSavedFragmentState = valueAt.mSavedFragmentState;
                } else {
                    fragmentState.mSavedFragmentState = saveFragmentBasicState(valueAt);
                    if (valueAt.mTarget != null) {
                        if (valueAt.mTarget.mIndex < 0) {
                            throwException(new IllegalStateException("Failure saving state: " + valueAt + " has target not in fragment manager: " + valueAt.mTarget));
                        }
                        if (fragmentState.mSavedFragmentState == null) {
                            fragmentState.mSavedFragmentState = new Bundle();
                        }
                        putFragment(fragmentState.mSavedFragmentState, "android:target_state", valueAt.mTarget);
                        if (valueAt.mTargetRequestCode != 0) {
                            fragmentState.mSavedFragmentState.putInt("android:target_req_state", valueAt.mTargetRequestCode);
                        }
                    }
                }
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        int size2 = this.mAdded.size();
        if (size2 > 0) {
            iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                iArr[i2] = this.mAdded.get(i2).mIndex;
                if (iArr[i2] < 0) {
                    throwException(new IllegalStateException("Failure saving state: active " + this.mAdded.get(i2) + " has cleared index: " + iArr[i2]));
                }
            }
        } else {
            iArr = null;
        }
        if (this.mBackStack != null) {
            int size3 = this.mBackStack.size();
            if (size3 > 0) {
                backStackStateArr = new BackStackState[size3];
                for (int i3 = 0; i3 < size3; i3++) {
                    backStackStateArr[i3] = new BackStackState(this.mBackStack.get(i3));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.mActive = fragmentStateArr;
        fragmentManagerState.mAdded = iArr;
        fragmentManagerState.mBackStack = backStackStateArr;
        if (this.mPrimaryNav != null) {
            fragmentManagerState.mPrimaryNavActiveIndex = this.mPrimaryNav.mIndex;
        }
        fragmentManagerState.mNextFragmentIndex = this.mNextFragmentIndex;
        saveNonConfig();
        return fragmentManagerState;
    }

    /* access modifiers changed from: package-private */
    public final boolean isStateAtLeast(int i) {
        if (this.mCurState >= i) {
            return true;
        }
        return false;
    }

    public final FragmentManager.BackStackEntry getBackStackEntryAt(int i) {
        return this.mBackStack.get(i);
    }

    public final void hideFragment(Fragment fragment) {
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    /* access modifiers changed from: package-private */
    public final void moveToState(Fragment fragment) {
        _lancet.com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState(this, fragment, this.mCurState, 0, 0, false);
    }

    public final void removeOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener onBackStackChangedListener) {
        if (this.mBackStackChangeListeners != null) {
            this.mBackStackChangeListeners.remove(onBackStackChangedListener);
        }
    }

    public final void showFragment(Fragment fragment) {
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* JADX INFO: finally extract failed */
    private void dispatchStateChange(int i) {
        try {
            this.mExecutingActions = true;
            moveToState(i, false);
            this.mExecutingActions = false;
            execPendingActions();
        } catch (Throwable th) {
            this.mExecutingActions = false;
            throw th;
        }
    }

    private static Animation.AnimationListener getAnimationListener(Animation animation) {
        try {
            if (sAnimationListenerField == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                sAnimationListenerField = declaredField;
                declaredField.setAccessible(true);
            }
            return (Animation.AnimationListener) sAnimationListenerField.get(animation);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void addBackStackState(BackStackRecord backStackRecord) {
        if (this.mBackStack == null) {
            this.mBackStack = new ArrayList<>();
        }
        this.mBackStack.add(backStackRecord);
    }

    public final void addOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener onBackStackChangedListener) {
        if (this.mBackStackChangeListeners == null) {
            this.mBackStackChangeListeners = new ArrayList<>();
        }
        this.mBackStackChangeListeners.add(onBackStackChangedListener);
    }

    public final void dispatchConfigurationChanged(Configuration configuration) {
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = this.mAdded.get(i);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public final void dispatchMultiWindowModeChanged(boolean z) {
        for (int size = this.mAdded.size() - 1; size >= 0; size--) {
            Fragment fragment = this.mAdded.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    public final void dispatchOptionsMenuClosed(Menu menu) {
        if (this.mCurState > 0) {
            for (int i = 0; i < this.mAdded.size(); i++) {
                Fragment fragment = this.mAdded.get(i);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public final void dispatchPictureInPictureModeChanged(boolean z) {
        for (int size = this.mAdded.size() - 1; size >= 0; size--) {
            Fragment fragment = this.mAdded.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    public final void freeBackStackIndex(int i) {
        synchronized (this) {
            this.mBackStackIndices.set(i, null);
            if (this.mAvailBackStackIndices == null) {
                this.mAvailBackStackIndices = new ArrayList<>();
            }
            this.mAvailBackStackIndices.add(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: package-private */
    public final void makeInactive(Fragment fragment) {
        if (fragment.mIndex >= 0) {
            this.mActive.put(fragment.mIndex, null);
            fragment.initState();
        }
    }

    public final void performPendingDeferredStart(Fragment fragment) {
        if (fragment.mDeferStart) {
            if (this.mExecutingActions) {
                this.mHavePendingDeferredStart = true;
                return;
            }
            fragment.mDeferStart = false;
            _lancet.com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState(this, fragment, this.mCurState, 0, 0, false);
        }
    }

    private Fragment findFragmentUnder(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (viewGroup == null || view == null) {
            return null;
        }
        for (int indexOf = this.mAdded.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
            Fragment fragment2 = this.mAdded.get(indexOf);
            if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                return fragment2;
            }
        }
        return null;
    }

    private void makeRemovedFragmentsInvisible(ArraySet<Fragment> arraySet) {
        int size = arraySet.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) arraySet.valueAt(i);
            if (!fragment.mAdded) {
                View view = fragment.getView();
                fragment.mPostponedAlpha = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    static boolean modifiesAlpha(AnimationOrAnimator animationOrAnimator) {
        if (animationOrAnimator.animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animationOrAnimator.animation instanceof AnimationSet)) {
            return modifiesAlpha(animationOrAnimator.animator);
        }
        List<Animation> animations = ((AnimationSet) animationOrAnimator.animation).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    private static void setRetaining(FragmentManagerNonConfig fragmentManagerNonConfig) {
        if (fragmentManagerNonConfig != null) {
            List<Fragment> fragments = fragmentManagerNonConfig.getFragments();
            if (fragments != null) {
                for (Fragment fragment : fragments) {
                    fragment.mRetaining = true;
                }
            }
            List<FragmentManagerNonConfig> childNonConfigs = fragmentManagerNonConfig.getChildNonConfigs();
            if (childNonConfigs != null) {
                for (FragmentManagerNonConfig retaining : childNonConfigs) {
                    setRetaining(retaining);
                }
            }
        }
    }

    private void throwException(RuntimeException runtimeException) {
        PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
        if (this.mHost != null) {
            try {
                this.mHost.onDump("  ", null, printWriter, new String[0]);
            } catch (Exception unused) {
            }
        } else {
            dump("  ", null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    public final void detachFragment(Fragment fragment) {
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                synchronized (this.mAdded) {
                    this.mAdded.remove(fragment);
                }
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.mNeedMenuInvalidate = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    public final boolean dispatchContextItemSelected(MenuItem menuItem) {
        if (this.mCurState <= 0) {
            return false;
        }
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = this.mAdded.get(i);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean dispatchOptionsItemSelected(MenuItem menuItem) {
        if (this.mCurState <= 0) {
            return false;
        }
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = this.mAdded.get(i);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean dispatchPrepareOptionsMenu(Menu menu) {
        if (this.mCurState <= 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = this.mAdded.get(i);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final void ensureInflatedFragmentView(Fragment fragment) {
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            if (fragment.mView != null) {
                fragment.mInnerView = fragment.mView;
                fragment.mView.setSaveFromParentEnabled(false);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                dispatchOnFragmentViewCreated(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                return;
            }
            fragment.mInnerView = null;
        }
    }

    @Nullable
    public final Fragment findFragmentById(int i) {
        for (int size = this.mAdded.size() - 1; size >= 0; size--) {
            Fragment fragment = this.mAdded.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        if (this.mActive != null) {
            for (int size2 = this.mActive.size() - 1; size2 >= 0; size2--) {
                Fragment valueAt = this.mActive.valueAt(size2);
                if (valueAt != null && valueAt.mFragmentId == i) {
                    return valueAt;
                }
            }
        }
        return null;
    }

    public final Fragment findFragmentByWho(String str) {
        if (!(this.mActive == null || str == null)) {
            for (int size = this.mActive.size() - 1; size >= 0; size--) {
                Fragment valueAt = this.mActive.valueAt(size);
                if (valueAt != null) {
                    Fragment findFragmentByWho = valueAt.findFragmentByWho(str);
                    if (findFragmentByWho != null) {
                        return findFragmentByWho;
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void makeActive(Fragment fragment) {
        if (fragment.mIndex < 0) {
            int i = this.mNextFragmentIndex;
            this.mNextFragmentIndex = i + 1;
            fragment.setIndex(i, this.mParent);
            if (this.mActive == null) {
                this.mActive = new SparseArray<>();
            }
            this.mActive.put(fragment.mIndex, fragment);
        }
    }

    public final void removeFragment(Fragment fragment) {
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            synchronized (this.mAdded) {
                this.mAdded.remove(fragment);
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    @Nullable
    public final Fragment.SavedState saveFragmentInstanceState(Fragment fragment) {
        if (fragment.mIndex < 0) {
            throwException(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (fragment.mState <= 0) {
            return null;
        }
        Bundle saveFragmentBasicState = saveFragmentBasicState(fragment);
        if (saveFragmentBasicState != null) {
            return new Fragment.SavedState(saveFragmentBasicState);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void saveFragmentViewState(Fragment fragment) {
        if (fragment.mInnerView != null) {
            if (this.mStateArray == null) {
                this.mStateArray = new SparseArray<>();
            } else {
                this.mStateArray.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.mStateArray);
            if (this.mStateArray.size() > 0) {
                fragment.mSavedViewState = this.mStateArray;
                this.mStateArray = null;
            }
        }
    }

    public final void setPrimaryNavigationFragment(Fragment fragment) {
        if (fragment == null || (this.mActive.get(fragment.mIndex) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this))) {
            this.mPrimaryNav = fragment;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void unregisterFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        synchronized (this.mLifecycleCallbacks) {
            int i = 0;
            int size = this.mLifecycleCallbacks.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.mLifecycleCallbacks.get(i).mCallback == fragmentLifecycleCallbacks) {
                    this.mLifecycleCallbacks.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    private void addAddedFragments(ArraySet<Fragment> arraySet) {
        if (this.mCurState > 0) {
            int min = Math.min(this.mCurState, 3);
            int size = this.mAdded.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = this.mAdded.get(i);
                if (fragment.mState < min) {
                    _lancet.com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState(this, fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        arraySet.add(fragment);
                    }
                }
            }
        }
    }

    private void ensureExecReady(boolean z) {
        if (this.mExecutingActions) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.mHost == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.mHost.getHandler().getLooper()) {
            if (!z) {
                checkStateLoss();
            }
            if (this.mTmpRecords == null) {
                this.mTmpRecords = new ArrayList<>();
                this.mTmpIsPop = new ArrayList<>();
            }
            this.mExecutingActions = true;
            try {
                executePostponedTransaction(null, null);
            } finally {
                this.mExecutingActions = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    static boolean modifiesAlpha(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (modifiesAlpha(childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int allocBackStackIndex(BackStackRecord backStackRecord) {
        synchronized (this) {
            if (this.mAvailBackStackIndices != null) {
                if (this.mAvailBackStackIndices.size() > 0) {
                    int intValue = this.mAvailBackStackIndices.remove(this.mAvailBackStackIndices.size() - 1).intValue();
                    this.mBackStackIndices.set(intValue, backStackRecord);
                    return intValue;
                }
            }
            if (this.mBackStackIndices == null) {
                this.mBackStackIndices = new ArrayList<>();
            }
            int size = this.mBackStackIndices.size();
            this.mBackStackIndices.add(backStackRecord);
            return size;
        }
    }

    public final void attachFragment(Fragment fragment) {
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            if (!this.mAdded.contains(fragment)) {
                synchronized (this.mAdded) {
                    this.mAdded.add(fragment);
                }
                fragment.mAdded = true;
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.mNeedMenuInvalidate = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    @Nullable
    public final Fragment findFragmentByTag(@Nullable String str) {
        if (str != null) {
            for (int size = this.mAdded.size() - 1; size >= 0; size--) {
                Fragment fragment = this.mAdded.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (!(this.mActive == null || str == null)) {
            for (int size2 = this.mActive.size() - 1; size2 >= 0; size2--) {
                Fragment valueAt = this.mActive.valueAt(size2);
                if (valueAt != null && str.equals(valueAt.mTag)) {
                    return valueAt;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Bundle saveFragmentBasicState(Fragment fragment) {
        Bundle bundle;
        if (this.mStateBundle == null) {
            this.mStateBundle = new Bundle();
        }
        fragment.performSaveInstanceState(this.mStateBundle);
        dispatchOnFragmentSaveInstanceState(fragment, this.mStateBundle, false);
        if (!this.mStateBundle.isEmpty()) {
            bundle = this.mStateBundle;
            this.mStateBundle = null;
        } else {
            bundle = null;
        }
        if (fragment.mView != null) {
            saveFragmentViewState(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public final void completeShowHideFragment(final Fragment fragment) {
        int i;
        if (fragment.mView != null) {
            AnimationOrAnimator loadAnimation = loadAnimation(fragment, fragment.getNextTransition(), !fragment.mHidden, fragment.getNextTransitionStyle());
            if (loadAnimation == null || loadAnimation.animator == null) {
                if (loadAnimation != null) {
                    setHWLayerAnimListenerIfAlpha(fragment.mView, loadAnimation);
                    fragment.mView.startAnimation(loadAnimation.animation);
                    loadAnimation.animation.start();
                }
                if (!fragment.mHidden || fragment.isHideReplaced()) {
                    i = 0;
                } else {
                    i = 8;
                }
                fragment.mView.setVisibility(i);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                loadAnimation.animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    final ViewGroup viewGroup = fragment.mContainer;
                    final View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    loadAnimation.animator.addListener(new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (fragment.mView != null) {
                                fragment.mView.setVisibility(8);
                            }
                        }
                    });
                }
                setHWLayerAnimListenerIfAlpha(fragment.mView, loadAnimation);
                loadAnimation.animator.start();
            }
        }
        if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible) {
            this.mNeedMenuInvalidate = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* access modifiers changed from: package-private */
    public final void moveFragmentToExpectedState(Fragment fragment) {
        if (fragment != null) {
            int i = this.mCurState;
            if (fragment.mRemoving) {
                if (fragment.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, 0);
                }
            }
            _lancet.com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState(this, fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
            if (fragment.mView != null) {
                Fragment findFragmentUnder = findFragmentUnder(fragment);
                if (findFragmentUnder != null) {
                    View view = findFragmentUnder.mView;
                    ViewGroup viewGroup = fragment.mContainer;
                    int indexOfChild = viewGroup.indexOfChild(view);
                    int indexOfChild2 = viewGroup.indexOfChild(fragment.mView);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup.removeViewAt(indexOfChild2);
                        viewGroup.addView(fragment.mView, indexOfChild);
                    }
                }
                if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                    if (fragment.mPostponedAlpha > 0.0f) {
                        fragment.mView.setAlpha(fragment.mPostponedAlpha);
                    }
                    fragment.mPostponedAlpha = 0.0f;
                    fragment.mIsNewlyAdded = false;
                    AnimationOrAnimator loadAnimation = loadAnimation(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
                    if (loadAnimation != null) {
                        setHWLayerAnimListenerIfAlpha(fragment.mView, loadAnimation);
                        if (loadAnimation.animation != null) {
                            fragment.mView.startAnimation(loadAnimation.animation);
                        } else {
                            loadAnimation.animator.setTarget(fragment.mView);
                            loadAnimation.animator.start();
                        }
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                completeShowHideFragment(fragment);
            }
        }
    }

    public final void registerFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
        this.mLifecycleCallbacks.add(new FragmentLifecycleCallbacksHolder(fragmentLifecycleCallbacks, z));
    }

    public final void popBackStack(@Nullable String str, int i) {
        enqueueAction(new PopBackStackState(str, -1, i), false);
    }

    public final boolean popBackStackImmediate(@Nullable String str, int i) {
        checkStateLoss();
        return popBackStackImmediate(str, -1, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean generateOpsForPendingActions(java.util.ArrayList<android.support.v4.app.BackStackRecord> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<android.support.v4.app.FragmentManagerImpl$OpGenerator> r0 = r4.mPendingActions     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.ArrayList<android.support.v4.app.FragmentManagerImpl$OpGenerator> r0 = r4.mPendingActions     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x000f
            goto L_0x003a
        L_0x000f:
            java.util.ArrayList<android.support.v4.app.FragmentManagerImpl$OpGenerator> r0 = r4.mPendingActions     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            r2 = 0
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<android.support.v4.app.FragmentManagerImpl$OpGenerator> r3 = r4.mPendingActions     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            android.support.v4.app.FragmentManagerImpl$OpGenerator r3 = (android.support.v4.app.FragmentManagerImpl.OpGenerator) r3     // Catch:{ all -> 0x003c }
            boolean r3 = r3.generateOps(r5, r6)     // Catch:{ all -> 0x003c }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<android.support.v4.app.FragmentManagerImpl$OpGenerator> r5 = r4.mPendingActions     // Catch:{ all -> 0x003c }
            r5.clear()     // Catch:{ all -> 0x003c }
            android.support.v4.app.FragmentHostCallback r5 = r4.mHost     // Catch:{ all -> 0x003c }
            android.os.Handler r5 = r5.getHandler()     // Catch:{ all -> 0x003c }
            java.lang.Runnable r6 = r4.mExecCommit     // Catch:{ all -> 0x003c }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r2
        L_0x003a:
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r1
        L_0x003c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.generateOpsForPendingActions(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    private static void setHWLayerAnimListenerIfAlpha(View view, AnimationOrAnimator animationOrAnimator) {
        if (!(view == null || animationOrAnimator == null || !shouldRunOnHWLayer(view, animationOrAnimator))) {
            if (animationOrAnimator.animator != null) {
                animationOrAnimator.animator.addListener(new AnimatorOnHWLayerIfNeededListener(view));
                return;
            }
            Animation.AnimationListener animationListener = getAnimationListener(animationOrAnimator.animation);
            view.setLayerType(2, null);
            animationOrAnimator.animation.setAnimationListener(new AnimateOnHWLayerIfNeededListener(view, animationListener));
        }
    }

    static boolean shouldRunOnHWLayer(View view, AnimationOrAnimator animationOrAnimator) {
        if (view == null || animationOrAnimator == null || Build.VERSION.SDK_INT < 19 || view.getLayerType() != 0 || !ViewCompat.hasOverlappingRendering(view) || !modifiesAlpha(animationOrAnimator)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void dispatchOnFragmentDestroyed(@NonNull Fragment fragment, boolean z) {
        if (this.mParent != null) {
            FragmentManager fragmentManager = this.mParent.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentDestroyed(fragment, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it2 = this.mLifecycleCallbacks.iterator();
        while (it2.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it2.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentDestroyed(this, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void dispatchOnFragmentDetached(@NonNull Fragment fragment, boolean z) {
        if (this.mParent != null) {
            FragmentManager fragmentManager = this.mParent.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentDetached(fragment, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it2 = this.mLifecycleCallbacks.iterator();
        while (it2.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it2.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentDetached(this, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void dispatchOnFragmentPaused(@NonNull Fragment fragment, boolean z) {
        if (this.mParent != null) {
            FragmentManager fragmentManager = this.mParent.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentPaused(fragment, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it2 = this.mLifecycleCallbacks.iterator();
        while (it2.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it2.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentPaused(this, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void dispatchOnFragmentResumed(@NonNull Fragment fragment, boolean z) {
        if (this.mParent != null) {
            FragmentManager fragmentManager = this.mParent.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentResumed(fragment, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it2 = this.mLifecycleCallbacks.iterator();
        while (it2.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it2.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentResumed(this, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void dispatchOnFragmentStarted(@NonNull Fragment fragment, boolean z) {
        if (this.mParent != null) {
            FragmentManager fragmentManager = this.mParent.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentStarted(fragment, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it2 = this.mLifecycleCallbacks.iterator();
        while (it2.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it2.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentStarted(this, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void dispatchOnFragmentStopped(@NonNull Fragment fragment, boolean z) {
        if (this.mParent != null) {
            FragmentManager fragmentManager = this.mParent.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentStopped(fragment, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it2 = this.mLifecycleCallbacks.iterator();
        while (it2.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it2.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentStopped(this, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void dispatchOnFragmentViewDestroyed(@NonNull Fragment fragment, boolean z) {
        if (this.mParent != null) {
            FragmentManager fragmentManager = this.mParent.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentViewDestroyed(fragment, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it2 = this.mLifecycleCallbacks.iterator();
        while (it2.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it2.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentViewDestroyed(this, fragment);
            }
        }
    }

    public final void enqueueAction(OpGenerator opGenerator, boolean z) {
        if (!z) {
            checkStateLoss();
        }
        synchronized (this) {
            if (!this.mDestroyed) {
                if (this.mHost != null) {
                    if (this.mPendingActions == null) {
                        this.mPendingActions = new ArrayList<>();
                    }
                    this.mPendingActions.add(opGenerator);
                    scheduleCommit();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void execSingleAction(OpGenerator opGenerator, boolean z) {
        if (!z || (this.mHost != null && !this.mDestroyed)) {
            ensureExecReady(z);
            if (opGenerator.generateOps(this.mTmpRecords, this.mTmpIsPop)) {
                this.mExecutingActions = true;
                try {
                    removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                } finally {
                    cleanupExec();
                }
            }
            doPendingDeferredStart();
            burpActive();
        }
    }

    @Nullable
    public final Fragment getFragment(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        Fragment fragment = this.mActive.get(i);
        if (fragment == null) {
            throwException(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        return fragment;
    }

    public final void popBackStack(int i, int i2) {
        if (i >= 0) {
            enqueueAction(new PopBackStackState(null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    public final boolean popBackStackImmediate(int i, int i2) {
        checkStateLoss();
        execPendingActions();
        if (i >= 0) {
            return popBackStackImmediate(null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    private void executePostponedTransaction(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
        int i;
        if (this.mPostponedTransactions == null) {
            i = 0;
        } else {
            i = this.mPostponedTransactions.size();
        }
        int i2 = i;
        int i3 = 0;
        while (i3 < i2) {
            StartEnterTransitionListener startEnterTransitionListener = this.mPostponedTransactions.get(i3);
            if (arrayList != null && !startEnterTransitionListener.mIsBack) {
                int indexOf = arrayList.indexOf(startEnterTransitionListener.mRecord);
                if (indexOf != -1 && arrayList2.get(indexOf).booleanValue()) {
                    startEnterTransitionListener.cancelTransaction();
                    i3++;
                }
            }
            if (startEnterTransitionListener.isReady() || (arrayList != null && startEnterTransitionListener.mRecord.interactsWith(arrayList, 0, arrayList.size()))) {
                this.mPostponedTransactions.remove(i3);
                i3--;
                i2--;
                if (arrayList != null && !startEnterTransitionListener.mIsBack) {
                    int indexOf2 = arrayList.indexOf(startEnterTransitionListener.mRecord);
                    if (indexOf2 != -1 && arrayList2.get(indexOf2).booleanValue()) {
                        startEnterTransitionListener.cancelTransaction();
                    }
                }
                startEnterTransitionListener.completeTransaction();
            }
            i3++;
        }
    }

    private void removeRedundantOperationsAndExecute(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            executePostponedTransaction(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!arrayList.get(i).mReorderingAllowed) {
                    if (i2 != i) {
                        executeOpsTogether(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (arrayList2.get(i).booleanValue()) {
                        while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).mReorderingAllowed) {
                            i2++;
                        }
                    }
                    executeOpsTogether(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                executeOpsTogether(arrayList, arrayList2, i2, size);
            }
        }
    }

    public final void addFragment(Fragment fragment, boolean z) {
        makeActive(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (!this.mAdded.contains(fragment)) {
            synchronized (this.mAdded) {
                this.mAdded.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.mNeedMenuInvalidate = true;
            }
            if (z) {
                moveToState(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public final boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.mCurState <= 0) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = this.mAdded.get(i);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i2 = 0; i2 < this.mCreatedMenus.size(); i2++) {
                Fragment fragment2 = this.mCreatedMenus.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return z;
    }

    /* access modifiers changed from: package-private */
    public final void moveToState(int i, boolean z) {
        if (this.mHost == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.mCurState) {
            this.mCurState = i;
            if (this.mActive != null) {
                int size = this.mAdded.size();
                for (int i2 = 0; i2 < size; i2++) {
                    moveFragmentToExpectedState(this.mAdded.get(i2));
                }
                int size2 = this.mActive.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Fragment valueAt = this.mActive.valueAt(i3);
                    if (valueAt != null && ((valueAt.mRemoving || valueAt.mDetached) && !valueAt.mIsNewlyAdded)) {
                        moveFragmentToExpectedState(valueAt);
                    }
                }
                startPendingDeferredFragments();
                if (this.mNeedMenuInvalidate && this.mHost != null && this.mCurState == 4) {
                    this.mHost.onSupportInvalidateOptionsMenu();
                    this.mNeedMenuInvalidate = false;
                }
            }
        }
    }

    public final void setBackStackIndex(int i, BackStackRecord backStackRecord) {
        synchronized (this) {
            if (this.mBackStackIndices == null) {
                this.mBackStackIndices = new ArrayList<>();
            }
            int size = this.mBackStackIndices.size();
            if (i < size) {
                this.mBackStackIndices.set(i, backStackRecord);
            } else {
                while (size < i) {
                    this.mBackStackIndices.add(null);
                    if (this.mAvailBackStackIndices == null) {
                        this.mAvailBackStackIndices = new ArrayList<>();
                    }
                    this.mAvailBackStackIndices.add(Integer.valueOf(size));
                    size++;
                }
                this.mBackStackIndices.add(backStackRecord);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void restoreAllState(Parcelable parcelable, FragmentManagerNonConfig fragmentManagerNonConfig) {
        List list;
        List list2;
        int i;
        FragmentManagerNonConfig fragmentManagerNonConfig2;
        ViewModelStore viewModelStore;
        int i2;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.mActive != null) {
                if (fragmentManagerNonConfig != null) {
                    List fragments = fragmentManagerNonConfig.getFragments();
                    list2 = fragmentManagerNonConfig.getChildNonConfigs();
                    list = fragmentManagerNonConfig.getViewModelStores();
                    if (fragments != null) {
                        i2 = fragments.size();
                    } else {
                        i2 = 0;
                    }
                    for (int i3 = 0; i3 < i2; i3++) {
                        Fragment fragment = (Fragment) fragments.get(i3);
                        int i4 = 0;
                        while (i4 < fragmentManagerState.mActive.length && fragmentManagerState.mActive[i4].mIndex != fragment.mIndex) {
                            i4++;
                        }
                        if (i4 == fragmentManagerState.mActive.length) {
                            throwException(new IllegalStateException("Could not find active fragment with index " + fragment.mIndex));
                        }
                        FragmentState fragmentState = fragmentManagerState.mActive[i4];
                        fragmentState.mInstance = fragment;
                        fragment.mSavedViewState = null;
                        fragment.mBackStackNesting = 0;
                        fragment.mInLayout = false;
                        fragment.mAdded = false;
                        fragment.mTarget = null;
                        if (fragmentState.mSavedFragmentState != null) {
                            fragmentState.mSavedFragmentState.setClassLoader(this.mHost.getContext().getClassLoader());
                            fragment.mSavedViewState = fragmentState.mSavedFragmentState.getSparseParcelableArray("android:view_state");
                            fragment.mSavedFragmentState = fragmentState.mSavedFragmentState;
                        }
                    }
                } else {
                    list2 = null;
                    list = null;
                }
                this.mActive = new SparseArray<>(fragmentManagerState.mActive.length);
                for (int i5 = 0; i5 < fragmentManagerState.mActive.length; i5++) {
                    FragmentState fragmentState2 = fragmentManagerState.mActive[i5];
                    if (fragmentState2 != null) {
                        if (list2 == null || i5 >= list2.size()) {
                            fragmentManagerNonConfig2 = null;
                        } else {
                            fragmentManagerNonConfig2 = (FragmentManagerNonConfig) list2.get(i5);
                        }
                        if (list == null || i5 >= list.size()) {
                            viewModelStore = null;
                        } else {
                            viewModelStore = (ViewModelStore) list.get(i5);
                        }
                        Fragment instantiate = fragmentState2.instantiate(this.mHost, this.mContainer, this.mParent, fragmentManagerNonConfig2, viewModelStore);
                        this.mActive.put(instantiate.mIndex, instantiate);
                        fragmentState2.mInstance = null;
                    }
                }
                if (fragmentManagerNonConfig != null) {
                    List fragments2 = fragmentManagerNonConfig.getFragments();
                    if (fragments2 != null) {
                        i = fragments2.size();
                    } else {
                        i = 0;
                    }
                    for (int i6 = 0; i6 < i; i6++) {
                        Fragment fragment2 = (Fragment) fragments2.get(i6);
                        if (fragment2.mTargetIndex >= 0) {
                            fragment2.mTarget = this.mActive.get(fragment2.mTargetIndex);
                        }
                    }
                }
                this.mAdded.clear();
                if (fragmentManagerState.mAdded != null) {
                    int i7 = 0;
                    while (i7 < fragmentManagerState.mAdded.length) {
                        Fragment fragment3 = this.mActive.get(fragmentManagerState.mAdded[i7]);
                        if (fragment3 == null) {
                            throwException(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.mAdded[i7]));
                        }
                        fragment3.mAdded = true;
                        if (!this.mAdded.contains(fragment3)) {
                            synchronized (this.mAdded) {
                                this.mAdded.add(fragment3);
                            }
                            i7++;
                        } else {
                            throw new IllegalStateException("Already added!");
                        }
                    }
                }
                if (fragmentManagerState.mBackStack != null) {
                    this.mBackStack = new ArrayList<>(fragmentManagerState.mBackStack.length);
                    for (BackStackState instantiate2 : fragmentManagerState.mBackStack) {
                        BackStackRecord instantiate3 = instantiate2.instantiate(this);
                        if (DEBUG) {
                            PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
                            instantiate3.dump("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.mBackStack.add(instantiate3);
                        if (instantiate3.mIndex >= 0) {
                            setBackStackIndex(instantiate3.mIndex, instantiate3);
                        }
                    }
                } else {
                    this.mBackStack = null;
                }
                if (fragmentManagerState.mPrimaryNavActiveIndex >= 0) {
                    this.mPrimaryNav = this.mActive.get(fragmentManagerState.mPrimaryNavActiveIndex);
                }
                this.mNextFragmentIndex = fragmentManagerState.mNextFragmentIndex;
            }
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    static AnimationOrAnimator makeFadeAnimation(Context context, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(DECELERATE_CUBIC);
        alphaAnimation.setDuration(220);
        return new AnimationOrAnimator((Animation) alphaAnimation);
    }

    public final void attachController(FragmentHostCallback fragmentHostCallback, FragmentContainer fragmentContainer, Fragment fragment) {
        if (this.mHost == null) {
            this.mHost = fragmentHostCallback;
            this.mContainer = fragmentContainer;
            this.mParent = fragment;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* access modifiers changed from: package-private */
    public final void dispatchOnFragmentActivityCreated(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        if (this.mParent != null) {
            FragmentManager fragmentManager = this.mParent.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentActivityCreated(fragment, bundle, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it2 = this.mLifecycleCallbacks.iterator();
        while (it2.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it2.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentActivityCreated(this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void dispatchOnFragmentAttached(@NonNull Fragment fragment, @NonNull Context context, boolean z) {
        if (this.mParent != null) {
            FragmentManager fragmentManager = this.mParent.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentAttached(fragment, context, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it2 = this.mLifecycleCallbacks.iterator();
        while (it2.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it2.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentAttached(this, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void dispatchOnFragmentCreated(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        if (this.mParent != null) {
            FragmentManager fragmentManager = this.mParent.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentCreated(fragment, bundle, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it2 = this.mLifecycleCallbacks.iterator();
        while (it2.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it2.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentCreated(this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void dispatchOnFragmentPreAttached(@NonNull Fragment fragment, @NonNull Context context, boolean z) {
        if (this.mParent != null) {
            FragmentManager fragmentManager = this.mParent.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentPreAttached(fragment, context, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it2 = this.mLifecycleCallbacks.iterator();
        while (it2.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it2.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentPreAttached(this, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void dispatchOnFragmentPreCreated(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        if (this.mParent != null) {
            FragmentManager fragmentManager = this.mParent.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentPreCreated(fragment, bundle, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it2 = this.mLifecycleCallbacks.iterator();
        while (it2.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it2.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentPreCreated(this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void dispatchOnFragmentSaveInstanceState(@NonNull Fragment fragment, @NonNull Bundle bundle, boolean z) {
        if (this.mParent != null) {
            FragmentManager fragmentManager = this.mParent.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentSaveInstanceState(fragment, bundle, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it2 = this.mLifecycleCallbacks.iterator();
        while (it2.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it2.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentSaveInstanceState(this, fragment, bundle);
            }
        }
    }

    public final void putFragment(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mIndex < 0) {
            throwException(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.mIndex);
    }

    private void animateRemoveFragment(@NonNull final Fragment fragment, @NonNull AnimationOrAnimator animationOrAnimator, int i) {
        final View view = fragment.mView;
        final ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i);
        if (animationOrAnimator.animation != null) {
            EndViewTransitionAnimator endViewTransitionAnimator = new EndViewTransitionAnimator(animationOrAnimator.animation, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            endViewTransitionAnimator.setAnimationListener(new AnimationListenerWrapper(getAnimationListener(endViewTransitionAnimator)) {
                public void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    viewGroup.post(new Runnable() {

                        /* renamed from: android.support.v4.app.FragmentManagerImpl$2$1$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            /* JADX WARNING: Removed duplicated region for block: B:18:0x00ab  */
                            @me.ele.lancet.base.annotations.TargetClass
                            @me.ele.lancet.base.annotations.Proxy
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            static void com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState(android.support.v4.app.FragmentManagerImpl r4, android.support.v4.app.Fragment r5, int r6, int r7, int r8, boolean r9) {
                                /*
                                    r4.moveToState(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0004 }
                                    return
                                L_0x0004:
                                    r4 = move-exception
                                    boolean r0 = com.ss.android.ugc.aweme.g.a.a()
                                    if (r0 != 0) goto L_0x00b8
                                    if (r5 == 0) goto L_0x0016
                                    java.lang.Class r0 = r5.getClass()     // Catch:{ Exception -> 0x0092 }
                                    java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0092 }
                                    goto L_0x0018
                                L_0x0016:
                                    java.lang.String r0 = ""
                                L_0x0018:
                                    com.ss.android.ugc.aweme.app.p r1 = com.ss.android.ugc.aweme.app.p.a()     // Catch:{ Exception -> 0x0092 }
                                    android.app.Activity r1 = r1.e()     // Catch:{ Exception -> 0x0092 }
                                    if (r1 == 0) goto L_0x002b
                                    java.lang.Class r1 = r1.getClass()     // Catch:{ Exception -> 0x0092 }
                                    java.lang.String r1 = r1.getName()     // Catch:{ Exception -> 0x0092 }
                                    goto L_0x002d
                                L_0x002b:
                                    java.lang.String r1 = ""
                                L_0x002d:
                                    com.ss.android.ugc.aweme.app.d.c r2 = com.ss.android.ugc.aweme.app.d.c.a()     // Catch:{ Exception -> 0x0092 }
                                    java.lang.String r3 = "fragmentname"
                                    com.ss.android.ugc.aweme.app.d.c r2 = r2.a((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ Exception -> 0x0092 }
                                    java.lang.String r3 = "newState"
                                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0092 }
                                    com.ss.android.ugc.aweme.app.d.c r6 = r2.a((java.lang.String) r3, (java.lang.Integer) r6)     // Catch:{ Exception -> 0x0092 }
                                    java.lang.String r2 = "transit"
                                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0092 }
                                    com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r2, (java.lang.Integer) r7)     // Catch:{ Exception -> 0x0092 }
                                    java.lang.String r7 = "transitionStyle"
                                    java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0092 }
                                    com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.Integer) r8)     // Catch:{ Exception -> 0x0092 }
                                    java.lang.String r7 = "keepActive"
                                    java.lang.Boolean r8 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x0092 }
                                    com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.Boolean) r8)     // Catch:{ Exception -> 0x0092 }
                                    java.lang.String r7 = "currentActivity"
                                    com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.String) r1)     // Catch:{ Exception -> 0x0092 }
                                    java.lang.String r7 = "errorMsg"
                                    java.lang.String r8 = android.util.Log.getStackTraceString(r4)     // Catch:{ Exception -> 0x0092 }
                                    com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.String) r8)     // Catch:{ Exception -> 0x0092 }
                                    org.json.JSONObject r6 = r6.b()     // Catch:{ Exception -> 0x0092 }
                                    java.lang.String r7 = "fragment_crash_log"
                                    java.lang.String r8 = ""
                                    com.ss.android.ugc.aweme.app.d.c r9 = com.ss.android.ugc.aweme.app.d.c.a()     // Catch:{ Exception -> 0x0092 }
                                    java.lang.String r1 = "errorDesc"
                                    java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0092 }
                                    com.ss.android.ugc.aweme.app.d.c r6 = r9.a((java.lang.String) r1, (java.lang.String) r6)     // Catch:{ Exception -> 0x0092 }
                                    java.lang.String r9 = "fragment_name"
                                    com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r9, (java.lang.String) r0)     // Catch:{ Exception -> 0x0092 }
                                    org.json.JSONObject r6 = r6.b()     // Catch:{ Exception -> 0x0092 }
                                    com.ss.android.ugc.aweme.app.n.a(r7, r8, r6)     // Catch:{ Exception -> 0x0092 }
                                L_0x0092:
                                    r6 = 4
                                    java.lang.Class[] r7 = new java.lang.Class[r6]
                                    java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageFragment> r8 = com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageFragment.class
                                    r9 = 0
                                    r7[r9] = r8
                                    java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2> r8 = com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2.class
                                    r0 = 1
                                    r7[r0] = r8
                                    r8 = 2
                                    java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.form.AdFormBrowserFragment> r0 = com.ss.android.ugc.aweme.commercialize.views.form.AdFormBrowserFragment.class
                                    r7[r8] = r0
                                    r8 = 3
                                    java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment> r0 = com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment.class
                                    r7[r8] = r0
                                L_0x00a9:
                                    if (r9 >= r6) goto L_0x00b7
                                    r8 = r7[r9]
                                    boolean r8 = r8.isInstance(r5)
                                    if (r8 == 0) goto L_0x00b4
                                    return
                                L_0x00b4:
                                    int r9 = r9 + 1
                                    goto L_0x00a9
                                L_0x00b7:
                                    throw r4
                                L_0x00b8:
                                    throw r4
                                */
                                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.AnonymousClass2.AnonymousClass1._lancet.com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState(android.support.v4.app.FragmentManagerImpl, android.support.v4.app.Fragment, int, int, int, boolean):void");
                            }
                        }

                        public void run() {
                            if (fragment.getAnimatingAway() != null) {
                                fragment.setAnimatingAway(null);
                                _lancet.com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState(FragmentManagerImpl.this, fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                            }
                        }
                    });
                }
            });
            setHWLayerAnimListenerIfAlpha(view, animationOrAnimator);
            fragment.mView.startAnimation(endViewTransitionAnimator);
            return;
        }
        Animator animator = animationOrAnimator.animator;
        fragment.setAnimator(animationOrAnimator.animator);
        animator.addListener(new AnimatorListenerAdapter() {

            /* renamed from: android.support.v4.app.FragmentManagerImpl$3$_lancet */
            public class _lancet {
                private _lancet() {
                }

                /* JADX WARNING: Removed duplicated region for block: B:18:0x00ab  */
                @me.ele.lancet.base.annotations.TargetClass
                @me.ele.lancet.base.annotations.Proxy
                /* Code decompiled incorrectly, please refer to instructions dump. */
                static void com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState(android.support.v4.app.FragmentManagerImpl r4, android.support.v4.app.Fragment r5, int r6, int r7, int r8, boolean r9) {
                    /*
                        r4.moveToState(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0004 }
                        return
                    L_0x0004:
                        r4 = move-exception
                        boolean r0 = com.ss.android.ugc.aweme.g.a.a()
                        if (r0 != 0) goto L_0x00b8
                        if (r5 == 0) goto L_0x0016
                        java.lang.Class r0 = r5.getClass()     // Catch:{ Exception -> 0x0092 }
                        java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0092 }
                        goto L_0x0018
                    L_0x0016:
                        java.lang.String r0 = ""
                    L_0x0018:
                        com.ss.android.ugc.aweme.app.p r1 = com.ss.android.ugc.aweme.app.p.a()     // Catch:{ Exception -> 0x0092 }
                        android.app.Activity r1 = r1.e()     // Catch:{ Exception -> 0x0092 }
                        if (r1 == 0) goto L_0x002b
                        java.lang.Class r1 = r1.getClass()     // Catch:{ Exception -> 0x0092 }
                        java.lang.String r1 = r1.getName()     // Catch:{ Exception -> 0x0092 }
                        goto L_0x002d
                    L_0x002b:
                        java.lang.String r1 = ""
                    L_0x002d:
                        com.ss.android.ugc.aweme.app.d.c r2 = com.ss.android.ugc.aweme.app.d.c.a()     // Catch:{ Exception -> 0x0092 }
                        java.lang.String r3 = "fragmentname"
                        com.ss.android.ugc.aweme.app.d.c r2 = r2.a((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ Exception -> 0x0092 }
                        java.lang.String r3 = "newState"
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0092 }
                        com.ss.android.ugc.aweme.app.d.c r6 = r2.a((java.lang.String) r3, (java.lang.Integer) r6)     // Catch:{ Exception -> 0x0092 }
                        java.lang.String r2 = "transit"
                        java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0092 }
                        com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r2, (java.lang.Integer) r7)     // Catch:{ Exception -> 0x0092 }
                        java.lang.String r7 = "transitionStyle"
                        java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0092 }
                        com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.Integer) r8)     // Catch:{ Exception -> 0x0092 }
                        java.lang.String r7 = "keepActive"
                        java.lang.Boolean r8 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x0092 }
                        com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.Boolean) r8)     // Catch:{ Exception -> 0x0092 }
                        java.lang.String r7 = "currentActivity"
                        com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.String) r1)     // Catch:{ Exception -> 0x0092 }
                        java.lang.String r7 = "errorMsg"
                        java.lang.String r8 = android.util.Log.getStackTraceString(r4)     // Catch:{ Exception -> 0x0092 }
                        com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.String) r8)     // Catch:{ Exception -> 0x0092 }
                        org.json.JSONObject r6 = r6.b()     // Catch:{ Exception -> 0x0092 }
                        java.lang.String r7 = "fragment_crash_log"
                        java.lang.String r8 = ""
                        com.ss.android.ugc.aweme.app.d.c r9 = com.ss.android.ugc.aweme.app.d.c.a()     // Catch:{ Exception -> 0x0092 }
                        java.lang.String r1 = "errorDesc"
                        java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0092 }
                        com.ss.android.ugc.aweme.app.d.c r6 = r9.a((java.lang.String) r1, (java.lang.String) r6)     // Catch:{ Exception -> 0x0092 }
                        java.lang.String r9 = "fragment_name"
                        com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r9, (java.lang.String) r0)     // Catch:{ Exception -> 0x0092 }
                        org.json.JSONObject r6 = r6.b()     // Catch:{ Exception -> 0x0092 }
                        com.ss.android.ugc.aweme.app.n.a(r7, r8, r6)     // Catch:{ Exception -> 0x0092 }
                    L_0x0092:
                        r6 = 4
                        java.lang.Class[] r7 = new java.lang.Class[r6]
                        java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageFragment> r8 = com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageFragment.class
                        r9 = 0
                        r7[r9] = r8
                        java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2> r8 = com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2.class
                        r0 = 1
                        r7[r0] = r8
                        r8 = 2
                        java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.form.AdFormBrowserFragment> r0 = com.ss.android.ugc.aweme.commercialize.views.form.AdFormBrowserFragment.class
                        r7[r8] = r0
                        r8 = 3
                        java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment> r0 = com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment.class
                        r7[r8] = r0
                    L_0x00a9:
                        if (r9 >= r6) goto L_0x00b7
                        r8 = r7[r9]
                        boolean r8 = r8.isInstance(r5)
                        if (r8 == 0) goto L_0x00b4
                        return
                    L_0x00b4:
                        int r9 = r9 + 1
                        goto L_0x00a9
                    L_0x00b7:
                        throw r4
                    L_0x00b8:
                        throw r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.AnonymousClass3._lancet.com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState(android.support.v4.app.FragmentManagerImpl, android.support.v4.app.Fragment, int, int, int, boolean):void");
                }
            }

            public void onAnimationEnd(Animator animator) {
                viewGroup.endViewTransition(view);
                Animator animator2 = fragment.getAnimator();
                fragment.setAnimator(null);
                if (animator2 != null && viewGroup.indexOfChild(view) < 0) {
                    _lancet.com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState(FragmentManagerImpl.this, fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                }
            }
        });
        animator.setTarget(fragment.mView);
        setHWLayerAnimListenerIfAlpha(fragment.mView, animationOrAnimator);
        animator.start();
    }

    private boolean popBackStackImmediate(String str, int i, int i2) {
        execPendingActions();
        ensureExecReady(true);
        if (this.mPrimaryNav != null && i < 0 && str == null) {
            FragmentManager peekChildFragmentManager = this.mPrimaryNav.peekChildFragmentManager();
            if (peekChildFragmentManager != null && peekChildFragmentManager.popBackStackImmediate()) {
                return true;
            }
        }
        boolean popBackStackState = popBackStackState(this.mTmpRecords, this.mTmpIsPop, str, i, i2);
        if (popBackStackState) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        doPendingDeferredStart();
        burpActive();
        return popBackStackState;
    }

    private static void executeOps(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            BackStackRecord backStackRecord = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                backStackRecord.bumpBackStackNesting(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                backStackRecord.executePopOps(z);
            } else {
                backStackRecord.bumpBackStackNesting(1);
                backStackRecord.executeOps();
            }
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    public final void dispatchOnFragmentViewCreated(@NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle, boolean z) {
        if (this.mParent != null) {
            FragmentManager fragmentManager = this.mParent.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentViewCreated(fragment, view, bundle, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it2 = this.mLifecycleCallbacks.iterator();
        while (it2.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it2.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentViewCreated(this, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void completeExecute(BackStackRecord backStackRecord, boolean z, boolean z2, boolean z3) {
        if (z) {
            backStackRecord.executePopOps(z3);
        } else {
            backStackRecord.executeOps();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(backStackRecord);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            FragmentTransition.startTransitions(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            moveToState(this.mCurState, true);
        }
        if (this.mActive != null) {
            int size = this.mActive.size();
            for (int i = 0; i < size; i++) {
                Fragment valueAt = this.mActive.valueAt(i);
                if (valueAt != null && valueAt.mView != null && valueAt.mIsNewlyAdded && backStackRecord.interactsWith(valueAt.mContainerId)) {
                    if (valueAt.mPostponedAlpha > 0.0f) {
                        valueAt.mView.setAlpha(valueAt.mPostponedAlpha);
                    }
                    if (z3) {
                        valueAt.mPostponedAlpha = 0.0f;
                    } else {
                        valueAt.mPostponedAlpha = -1.0f;
                        valueAt.mIsNewlyAdded = false;
                    }
                }
            }
        }
    }

    private void executeOpsTogether(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<BackStackRecord> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = arrayList3.get(i4).mReorderingAllowed;
        if (this.mTmpAddedFragments == null) {
            this.mTmpAddedFragments = new ArrayList<>();
        } else {
            this.mTmpAddedFragments.clear();
        }
        this.mTmpAddedFragments.addAll(this.mAdded);
        Fragment primaryNavigationFragment = getPrimaryNavigationFragment();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            BackStackRecord backStackRecord = arrayList3.get(i6);
            if (!arrayList4.get(i6).booleanValue()) {
                primaryNavigationFragment = backStackRecord.expandOps(this.mTmpAddedFragments, primaryNavigationFragment);
            } else {
                primaryNavigationFragment = backStackRecord.trackAddedFragmentsInPop(this.mTmpAddedFragments, primaryNavigationFragment);
            }
            if (z2 || backStackRecord.mAddToBackStack) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.mTmpAddedFragments.clear();
        if (!z) {
            FragmentTransition.startTransitions(this, arrayList, arrayList2, i, i2, false);
        }
        executeOps(arrayList, arrayList2, i, i2);
        if (z) {
            ArraySet arraySet = new ArraySet();
            addAddedFragments(arraySet);
            int postponePostponableTransactions = postponePostponableTransactions(arrayList, arrayList2, i, i2, arraySet);
            makeRemovedFragmentsInvisible(arraySet);
            i3 = postponePostponableTransactions;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            FragmentTransition.startTransitions(this, arrayList, arrayList2, i, i3, true);
            moveToState(this.mCurState, true);
        }
        while (i4 < i5) {
            BackStackRecord backStackRecord2 = arrayList3.get(i4);
            if (arrayList4.get(i4).booleanValue() && backStackRecord2.mIndex >= 0) {
                freeBackStackIndex(backStackRecord2.mIndex);
                backStackRecord2.mIndex = -1;
            }
            backStackRecord2.runOnCommitRunnables();
            i4++;
        }
        if (z2) {
            reportBackStackChanged();
        }
    }

    /* access modifiers changed from: package-private */
    public final AnimationOrAnimator loadAnimation(Fragment fragment, int i, boolean z, int i2) {
        int nextAnim = fragment.getNextAnim();
        Animation onCreateAnimation = fragment.onCreateAnimation(i, z, nextAnim);
        if (onCreateAnimation != null) {
            return new AnimationOrAnimator(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(i, z, nextAnim);
        if (onCreateAnimator != null) {
            return new AnimationOrAnimator(onCreateAnimator);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(this.mHost.getContext().getResources().getResourceTypeName(nextAnim));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.mHost.getContext(), nextAnim);
                    if (loadAnimation != null) {
                        return new AnimationOrAnimator(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.mHost.getContext(), nextAnim);
                    if (loadAnimator != null) {
                        return new AnimationOrAnimator(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.mHost.getContext(), nextAnim);
                        if (loadAnimation2 != null) {
                            return new AnimationOrAnimator(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (i == 0) {
            return null;
        }
        int transitToStyleIndex = transitToStyleIndex(i, z);
        if (transitToStyleIndex < 0) {
            return null;
        }
        switch (transitToStyleIndex) {
            case 1:
                return makeOpenCloseAnimation(this.mHost.getContext(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return makeOpenCloseAnimation(this.mHost.getContext(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return makeOpenCloseAnimation(this.mHost.getContext(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return makeOpenCloseAnimation(this.mHost.getContext(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return makeFadeAnimation(this.mHost.getContext(), 0.0f, 1.0f);
            case 6:
                return makeFadeAnimation(this.mHost.getContext(), 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.mHost.onHasWindowAnimations()) {
                    i2 = this.mHost.onGetWindowAnimations();
                }
                return i2 == 0 ? null : null;
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment;
        Fragment fragment2;
        int i;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentTag.Fragment);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.isSupportFragmentClass(this.mHost.getContext(), str2)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        if (resourceId != -1) {
            fragment = findFragmentById(resourceId);
        } else {
            fragment = null;
        }
        if (fragment == null && string != null) {
            fragment = findFragmentByTag(string);
        }
        if (fragment == null && i2 != -1) {
            fragment = findFragmentById(i2);
        }
        if (fragment == null) {
            Fragment instantiate = this.mContainer.instantiate(context, str2, null);
            instantiate.mFromLayout = true;
            if (resourceId != 0) {
                i = resourceId;
            } else {
                i = i2;
            }
            instantiate.mFragmentId = i;
            instantiate.mContainerId = i2;
            instantiate.mTag = string;
            instantiate.mInLayout = true;
            instantiate.mFragmentManager = this;
            instantiate.mHost = this.mHost;
            instantiate.onInflate(this.mHost.getContext(), attributeSet, instantiate.mSavedFragmentState);
            addFragment(instantiate, true);
            fragment2 = instantiate;
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            fragment.mHost = this.mHost;
            if (!fragment.mRetaining) {
                fragment.onInflate(this.mHost.getContext(), attributeSet, fragment.mSavedFragmentState);
            }
            fragment2 = fragment;
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + str2);
        }
        if (this.mCurState > 0 || !fragment2.mFromLayout) {
            moveToState(fragment2);
        } else {
            _lancet.com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState(this, fragment2, 1, 0, 0, false);
        }
        if (fragment2.mView != null) {
            if (resourceId != 0) {
                fragment2.mView.setId(resourceId);
            }
            if (fragment2.mView.getTag() == null) {
                fragment2.mView.setTag(string);
            }
            return fragment2.mView;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (this.mActive != null) {
            int size = this.mActive.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (int i = 0; i < size; i++) {
                    Fragment valueAt = this.mActive.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(valueAt);
                    if (valueAt != null) {
                        valueAt.dump(str2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        int size2 = this.mAdded.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.mAdded.get(i2).toString());
            }
        }
        if (this.mCreatedMenus != null) {
            int size3 = this.mCreatedMenus.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.mCreatedMenus.get(i3).toString());
                }
            }
        }
        if (this.mBackStack != null) {
            int size4 = this.mBackStack.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i4 = 0; i4 < size4; i4++) {
                    BackStackRecord backStackRecord = this.mBackStack.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(backStackRecord.toString());
                    backStackRecord.dump(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            if (this.mBackStackIndices != null) {
                int size5 = this.mBackStackIndices.size();
                if (size5 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i5 = 0; i5 < size5; i5++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(this.mBackStackIndices.get(i5));
                    }
                }
            }
            if (this.mAvailBackStackIndices != null && this.mAvailBackStackIndices.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.mAvailBackStackIndices.toArray()));
            }
        }
        if (this.mPendingActions != null) {
            int size6 = this.mPendingActions.size();
            if (size6 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i6 = 0; i6 < size6; i6++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(this.mPendingActions.get(i6));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.mHost);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.mContainer);
        if (this.mParent != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.mParent);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.mCurState);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.mStateSaved);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.mDestroyed);
        if (this.mNeedMenuInvalidate) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.mNeedMenuInvalidate);
        }
        if (this.mNoTransactionsBecause != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.mNoTransactionsBecause);
        }
    }

    static AnimationOrAnimator makeOpenCloseAnimation(Context context, float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(DECELERATE_QUINT);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(DECELERATE_CUBIC);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new AnimationOrAnimator((Animation) animationSet);
    }

    private int postponePostponableTransactions(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, ArraySet<Fragment> arraySet) {
        boolean z;
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            BackStackRecord backStackRecord = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (!backStackRecord.isPostponed() || backStackRecord.interactsWith(arrayList, i4 + 1, i2)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.mPostponedTransactions == null) {
                    this.mPostponedTransactions = new ArrayList<>();
                }
                StartEnterTransitionListener startEnterTransitionListener = new StartEnterTransitionListener(backStackRecord, booleanValue);
                this.mPostponedTransactions.add(startEnterTransitionListener);
                backStackRecord.setOnStartPostponedListener(startEnterTransitionListener);
                if (booleanValue) {
                    backStackRecord.executeOps();
                } else {
                    backStackRecord.executePopOps(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, backStackRecord);
                }
                addAddedFragments(arraySet);
            }
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    public final boolean popBackStackState(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        if (this.mBackStack == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = this.mBackStack.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.mBackStack.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = this.mBackStack.size() - 1;
                while (i3 >= 0) {
                    BackStackRecord backStackRecord = this.mBackStack.get(i3);
                    if ((str != null && str.equals(backStackRecord.getName())) || (i >= 0 && i == backStackRecord.mIndex)) {
                        break;
                    }
                    size2 = i3 - 1;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    i3--;
                    while (i3 >= 0) {
                        BackStackRecord backStackRecord2 = this.mBackStack.get(i3);
                        if ((str == null || !str.equals(backStackRecord2.getName())) && (i < 0 || i != backStackRecord2.mIndex)) {
                            break;
                        }
                        i3--;
                    }
                }
            } else {
                i3 = -1;
            }
            if (i3 == this.mBackStack.size() - 1) {
                return false;
            }
            for (int size3 = this.mBackStack.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.mBackStack.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0290, code lost:
        if (r11 >= 3) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0292, code lost:
        r15.performStop();
        dispatchOnFragmentStopped(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0298, code lost:
        if (r11 >= 2) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x029c, code lost:
        if (r7.mView == null) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02a4, code lost:
        if (r6.mHost.onShouldSaveFragmentState(r15) == false) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02a8, code lost:
        if (r7.mSavedViewState != null) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02aa, code lost:
        saveFragmentViewState(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02ad, code lost:
        r15.performDestroyView();
        dispatchOnFragmentViewDestroyed(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02b5, code lost:
        if (r7.mView == null) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02b9, code lost:
        if (r7.mContainer == null) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02bb, code lost:
        r7.mContainer.endViewTransition(r7.mView);
        r7.mView.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02ca, code lost:
        if (r6.mCurState <= 0) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02ce, code lost:
        if (r6.mDestroyed != false) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02d6, code lost:
        if (r7.mView.getVisibility() != 0) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02dc, code lost:
        if (r7.mPostponedAlpha < 0.0f) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02de, code lost:
        r0 = loadAnimation(r15, r17, false, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02e7, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02e8, code lost:
        r7.mPostponedAlpha = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02ea, code lost:
        if (r0 == null) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02ec, code lost:
        animateRemoveFragment(r15, r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02ef, code lost:
        r7.mContainer.removeView(r7.mView);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02f6, code lost:
        r7.mContainer = null;
        r7.mView = null;
        r7.mViewLifecycleOwner = null;
        r7.mViewLifecycleOwnerLiveData.setValue(null);
        r7.mInnerView = null;
        r7.mInLayout = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0305, code lost:
        if (r11 > 0) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0309, code lost:
        if (r6.mDestroyed == false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x030f, code lost:
        if (r15.getAnimatingAway() == null) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0311, code lost:
        r0 = r15.getAnimatingAway();
        r15.setAnimatingAway(null);
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0320, code lost:
        if (r15.getAnimator() == null) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0322, code lost:
        r0 = r15.getAnimator();
        r15.setAnimator(null);
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0330, code lost:
        if (r15.getAnimatingAway() != null) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0336, code lost:
        if (r15.getAnimator() == null) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x033b, code lost:
        if (r7.mRetaining != false) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x033d, code lost:
        r15.performDestroy();
        dispatchOnFragmentDestroyed(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0344, code lost:
        r7.mState = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0346, code lost:
        r15.performDetach();
        dispatchOnFragmentDetached(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x034c, code lost:
        if (r19 != false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0350, code lost:
        if (r7.mRetaining != false) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0352, code lost:
        makeInactive(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0356, code lost:
        r7.mHost = null;
        r7.mParentFragment = null;
        r7.mFragmentManager = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x035d, code lost:
        r15.setStateAfterAnimating(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x018c, code lost:
        ensureInflatedFragmentView(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x018f, code lost:
        if (r11 <= 1) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0193, code lost:
        if (r7.mFromLayout != false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0197, code lost:
        if (r7.mContainerId == 0) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x019c, code lost:
        if (r7.mContainerId != -1) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x019e, code lost:
        throwException(new java.lang.IllegalArgumentException("Cannot create fragment " + r15 + " for a container view with no id"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b9, code lost:
        r0 = (android.view.ViewGroup) r6.mContainer.onFindViewById(r7.mContainerId);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c3, code lost:
        if (r0 != null) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c7, code lost:
        if (r7.mRestored != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r1 = r15.getResources().getResourceName(r7.mContainerId);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d4, code lost:
        r1 = "unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0203, code lost:
        r0 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0366  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void moveToState(android.support.v4.app.Fragment r15, int r16, int r17, int r18, boolean r19) {
        /*
            r14 = this;
            r6 = r14
            r7 = r15
            boolean r0 = r7.mAdded
            r8 = 1
            if (r0 == 0) goto L_0x000f
            boolean r0 = r7.mDetached
            if (r0 == 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            r0 = r16
            goto L_0x0014
        L_0x000f:
            r0 = r16
            if (r0 <= r8) goto L_0x0014
            r0 = 1
        L_0x0014:
            boolean r1 = r7.mRemoving
            if (r1 == 0) goto L_0x002a
            int r1 = r7.mState
            if (r0 <= r1) goto L_0x002a
            int r0 = r7.mState
            if (r0 != 0) goto L_0x0028
            boolean r0 = r15.isInBackStack()
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x002a
        L_0x0028:
            int r0 = r7.mState
        L_0x002a:
            boolean r1 = r7.mDeferStart
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0038
            int r1 = r7.mState
            if (r1 >= r9) goto L_0x0038
            if (r0 <= r10) goto L_0x0038
            r11 = 2
            goto L_0x0039
        L_0x0038:
            r11 = r0
        L_0x0039:
            int r0 = r7.mState
            r12 = 0
            r13 = 0
            if (r0 > r11) goto L_0x027c
            boolean r0 = r7.mFromLayout
            if (r0 == 0) goto L_0x0048
            boolean r0 = r7.mInLayout
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            android.view.View r0 = r15.getAnimatingAway()
            if (r0 != 0) goto L_0x0054
            android.animation.Animator r0 = r15.getAnimator()
            if (r0 == 0) goto L_0x0066
        L_0x0054:
            r15.setAnimatingAway(r12)
            r15.setAnimator(r12)
            int r2 = r15.getStateAfterAnimating()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r14
            r1 = r15
            android.support.v4.app.FragmentManagerImpl._lancet.com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState(r0, r1, r2, r3, r4, r5)
        L_0x0066:
            int r0 = r7.mState
            switch(r0) {
                case 0: goto L_0x006d;
                case 1: goto L_0x018c;
                case 2: goto L_0x0266;
                case 3: goto L_0x026e;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x0361
        L_0x006d:
            if (r11 <= 0) goto L_0x018c
            android.os.Bundle r0 = r7.mSavedFragmentState
            if (r0 == 0) goto L_0x00c6
            android.os.Bundle r0 = r7.mSavedFragmentState
            android.support.v4.app.FragmentHostCallback r1 = r6.mHost
            android.content.Context r1 = r1.getContext()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.mSavedViewState = r0
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:target_state"
            android.support.v4.app.Fragment r0 = r14.getFragment(r0, r1)
            r7.mTarget = r0
            android.support.v4.app.Fragment r0 = r7.mTarget
            if (r0 == 0) goto L_0x00a4
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.mTargetRequestCode = r0
        L_0x00a4:
            java.lang.Boolean r0 = r7.mSavedUserVisibleHint
            if (r0 == 0) goto L_0x00b3
            java.lang.Boolean r0 = r7.mSavedUserVisibleHint
            boolean r0 = r0.booleanValue()
            r7.mUserVisibleHint = r0
            r7.mSavedUserVisibleHint = r12
            goto L_0x00bd
        L_0x00b3:
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.mUserVisibleHint = r0
        L_0x00bd:
            boolean r0 = r7.mUserVisibleHint
            if (r0 != 0) goto L_0x00c6
            r7.mDeferStart = r8
            if (r11 <= r10) goto L_0x00c6
            r11 = 2
        L_0x00c6:
            android.support.v4.app.FragmentHostCallback r0 = r6.mHost
            r7.mHost = r0
            android.support.v4.app.Fragment r0 = r6.mParent
            r7.mParentFragment = r0
            android.support.v4.app.Fragment r0 = r6.mParent
            if (r0 == 0) goto L_0x00d7
            android.support.v4.app.Fragment r0 = r6.mParent
            android.support.v4.app.FragmentManagerImpl r0 = r0.mChildFragmentManager
            goto L_0x00dd
        L_0x00d7:
            android.support.v4.app.FragmentHostCallback r0 = r6.mHost
            android.support.v4.app.FragmentManagerImpl r0 = r0.getFragmentManagerImpl()
        L_0x00dd:
            r7.mFragmentManager = r0
            android.support.v4.app.Fragment r0 = r7.mTarget
            if (r0 == 0) goto L_0x0125
            android.util.SparseArray<android.support.v4.app.Fragment> r0 = r6.mActive
            android.support.v4.app.Fragment r1 = r7.mTarget
            int r1 = r1.mIndex
            java.lang.Object r0 = r0.get(r1)
            android.support.v4.app.Fragment r1 = r7.mTarget
            if (r0 != r1) goto L_0x0102
            android.support.v4.app.Fragment r0 = r7.mTarget
            int r0 = r0.mState
            if (r0 > 0) goto L_0x0125
            android.support.v4.app.Fragment r1 = r7.mTarget
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r14
            android.support.v4.app.FragmentManagerImpl._lancet.com_ss_android_ugc_aweme_lancet_TryFixFragmentManagerCrashLancet_moveToState(r0, r1, r2, r3, r4, r5)
            goto L_0x0125
        L_0x0102:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r2 = " declared target fragment "
            r1.append(r2)
            android.support.v4.app.Fragment r2 = r7.mTarget
            r1.append(r2)
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0125:
            android.support.v4.app.FragmentHostCallback r0 = r6.mHost
            android.content.Context r0 = r0.getContext()
            r14.dispatchOnFragmentPreAttached(r15, r0, r13)
            r7.mCalled = r13
            android.support.v4.app.FragmentHostCallback r0 = r6.mHost
            android.content.Context r0 = r0.getContext()
            r15.onAttach((android.content.Context) r0)
            boolean r0 = r7.mCalled
            if (r0 == 0) goto L_0x0173
            android.support.v4.app.Fragment r0 = r7.mParentFragment
            if (r0 != 0) goto L_0x0147
            android.support.v4.app.FragmentHostCallback r0 = r6.mHost
            r0.onAttachFragment(r15)
            goto L_0x014c
        L_0x0147:
            android.support.v4.app.Fragment r0 = r7.mParentFragment
            r0.onAttachFragment(r15)
        L_0x014c:
            android.support.v4.app.FragmentHostCallback r0 = r6.mHost
            android.content.Context r0 = r0.getContext()
            r14.dispatchOnFragmentAttached(r15, r0, r13)
            boolean r0 = r7.mIsCreated
            if (r0 != 0) goto L_0x0169
            android.os.Bundle r0 = r7.mSavedFragmentState
            r14.dispatchOnFragmentPreCreated(r15, r0, r13)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r15.performCreate(r0)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r14.dispatchOnFragmentCreated(r15, r0, r13)
            goto L_0x0170
        L_0x0169:
            android.os.Bundle r0 = r7.mSavedFragmentState
            r15.restoreChildFragmentState(r0)
            r7.mState = r8
        L_0x0170:
            r7.mRetaining = r13
            goto L_0x018c
        L_0x0173:
            android.support.v4.app.SuperNotCalledException r0 = new android.support.v4.app.SuperNotCalledException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r2 = " did not call through to super.onAttach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x018c:
            r14.ensureInflatedFragmentView(r15)
            if (r11 <= r8) goto L_0x0266
            boolean r0 = r7.mFromLayout
            if (r0 != 0) goto L_0x0251
            int r0 = r7.mContainerId
            if (r0 == 0) goto L_0x0203
            int r0 = r7.mContainerId
            r1 = -1
            if (r0 != r1) goto L_0x01b9
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot create fragment "
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r14.throwException(r0)
        L_0x01b9:
            android.support.v4.app.FragmentContainer r0 = r6.mContainer
            int r1 = r7.mContainerId
            android.view.View r0 = r0.onFindViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0204
            boolean r1 = r7.mRestored
            if (r1 != 0) goto L_0x0204
            android.content.res.Resources r1 = r15.getResources()     // Catch:{ NotFoundException -> 0x01d4 }
            int r2 = r7.mContainerId     // Catch:{ NotFoundException -> 0x01d4 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x01d4 }
            goto L_0x01d6
        L_0x01d4:
            java.lang.String r1 = "unknown"
        L_0x01d6:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "No view found for id 0x"
            r3.<init>(r4)
            int r4 = r7.mContainerId
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r3.append(r4)
            java.lang.String r4 = " ("
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ") for fragment "
            r3.append(r1)
            r3.append(r15)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            r14.throwException(r2)
            goto L_0x0204
        L_0x0203:
            r0 = r12
        L_0x0204:
            r7.mContainer = r0
            android.os.Bundle r1 = r7.mSavedFragmentState
            android.view.LayoutInflater r1 = r15.performGetLayoutInflater(r1)
            android.os.Bundle r2 = r7.mSavedFragmentState
            r15.performCreateView(r1, r0, r2)
            android.view.View r1 = r7.mView
            if (r1 == 0) goto L_0x024f
            android.view.View r1 = r7.mView
            r7.mInnerView = r1
            android.view.View r1 = r7.mView
            r1.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L_0x0225
            android.view.View r1 = r7.mView
            r0.addView(r1)
        L_0x0225:
            boolean r0 = r7.mHidden
            if (r0 == 0) goto L_0x0230
            android.view.View r0 = r7.mView
            r1 = 8
            r0.setVisibility(r1)
        L_0x0230:
            android.view.View r0 = r7.mView
            android.os.Bundle r1 = r7.mSavedFragmentState
            r15.onViewCreated(r0, r1)
            android.view.View r0 = r7.mView
            android.os.Bundle r1 = r7.mSavedFragmentState
            r14.dispatchOnFragmentViewCreated(r15, r0, r1, r13)
            android.view.View r0 = r7.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x024b
            android.view.ViewGroup r0 = r7.mContainer
            if (r0 == 0) goto L_0x024b
            goto L_0x024c
        L_0x024b:
            r8 = 0
        L_0x024c:
            r7.mIsNewlyAdded = r8
            goto L_0x0251
        L_0x024f:
            r7.mInnerView = r12
        L_0x0251:
            android.os.Bundle r0 = r7.mSavedFragmentState
            r15.performActivityCreated(r0)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r14.dispatchOnFragmentActivityCreated(r15, r0, r13)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x0264
            android.os.Bundle r0 = r7.mSavedFragmentState
            r15.restoreViewState(r0)
        L_0x0264:
            r7.mSavedFragmentState = r12
        L_0x0266:
            if (r11 <= r10) goto L_0x026e
            r15.performStart()
            r14.dispatchOnFragmentStarted(r15, r13)
        L_0x026e:
            if (r11 <= r9) goto L_0x0361
            r15.performResume()
            r14.dispatchOnFragmentResumed(r15, r13)
            r7.mSavedFragmentState = r12
            r7.mSavedViewState = r12
            goto L_0x0361
        L_0x027c:
            int r0 = r7.mState
            if (r0 <= r11) goto L_0x0361
            int r0 = r7.mState
            switch(r0) {
                case 1: goto L_0x0305;
                case 2: goto L_0x0298;
                case 3: goto L_0x0290;
                case 4: goto L_0x0287;
                default: goto L_0x0285;
            }
        L_0x0285:
            goto L_0x0361
        L_0x0287:
            r0 = 4
            if (r11 >= r0) goto L_0x0290
            r15.performPause()
            r14.dispatchOnFragmentPaused(r15, r13)
        L_0x0290:
            if (r11 >= r9) goto L_0x0298
            r15.performStop()
            r14.dispatchOnFragmentStopped(r15, r13)
        L_0x0298:
            if (r11 >= r10) goto L_0x0305
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x02ad
            android.support.v4.app.FragmentHostCallback r0 = r6.mHost
            boolean r0 = r0.onShouldSaveFragmentState(r15)
            if (r0 == 0) goto L_0x02ad
            android.util.SparseArray<android.os.Parcelable> r0 = r7.mSavedViewState
            if (r0 != 0) goto L_0x02ad
            r14.saveFragmentViewState(r15)
        L_0x02ad:
            r15.performDestroyView()
            r14.dispatchOnFragmentViewDestroyed(r15, r13)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x02f6
            android.view.ViewGroup r0 = r7.mContainer
            if (r0 == 0) goto L_0x02f6
            android.view.ViewGroup r0 = r7.mContainer
            android.view.View r1 = r7.mView
            r0.endViewTransition(r1)
            android.view.View r0 = r7.mView
            r0.clearAnimation()
            int r0 = r6.mCurState
            r1 = 0
            if (r0 <= 0) goto L_0x02e7
            boolean r0 = r6.mDestroyed
            if (r0 != 0) goto L_0x02e7
            android.view.View r0 = r7.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x02e7
            float r0 = r7.mPostponedAlpha
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02e7
            r0 = r17
            r2 = r18
            android.support.v4.app.FragmentManagerImpl$AnimationOrAnimator r0 = r14.loadAnimation(r15, r0, r13, r2)
            goto L_0x02e8
        L_0x02e7:
            r0 = r12
        L_0x02e8:
            r7.mPostponedAlpha = r1
            if (r0 == 0) goto L_0x02ef
            r14.animateRemoveFragment(r15, r0, r11)
        L_0x02ef:
            android.view.ViewGroup r0 = r7.mContainer
            android.view.View r1 = r7.mView
            r0.removeView(r1)
        L_0x02f6:
            r7.mContainer = r12
            r7.mView = r12
            r7.mViewLifecycleOwner = r12
            android.arch.lifecycle.MutableLiveData<android.arch.lifecycle.LifecycleOwner> r0 = r7.mViewLifecycleOwnerLiveData
            r0.setValue(r12)
            r7.mInnerView = r12
            r7.mInLayout = r13
        L_0x0305:
            if (r11 > 0) goto L_0x0361
            boolean r0 = r6.mDestroyed
            if (r0 == 0) goto L_0x032c
            android.view.View r0 = r15.getAnimatingAway()
            if (r0 == 0) goto L_0x031c
            android.view.View r0 = r15.getAnimatingAway()
            r15.setAnimatingAway(r12)
            r0.clearAnimation()
            goto L_0x032c
        L_0x031c:
            android.animation.Animator r0 = r15.getAnimator()
            if (r0 == 0) goto L_0x032c
            android.animation.Animator r0 = r15.getAnimator()
            r15.setAnimator(r12)
            r0.cancel()
        L_0x032c:
            android.view.View r0 = r15.getAnimatingAway()
            if (r0 != 0) goto L_0x035d
            android.animation.Animator r0 = r15.getAnimator()
            if (r0 == 0) goto L_0x0339
            goto L_0x035d
        L_0x0339:
            boolean r0 = r7.mRetaining
            if (r0 != 0) goto L_0x0344
            r15.performDestroy()
            r14.dispatchOnFragmentDestroyed(r15, r13)
            goto L_0x0346
        L_0x0344:
            r7.mState = r13
        L_0x0346:
            r15.performDetach()
            r14.dispatchOnFragmentDetached(r15, r13)
            if (r19 != 0) goto L_0x0361
            boolean r0 = r7.mRetaining
            if (r0 != 0) goto L_0x0356
            r14.makeInactive(r15)
            goto L_0x0361
        L_0x0356:
            r7.mHost = r12
            r7.mParentFragment = r12
            r7.mFragmentManager = r12
            goto L_0x0361
        L_0x035d:
            r15.setStateAfterAnimating(r11)
            goto L_0x0362
        L_0x0361:
            r8 = r11
        L_0x0362:
            int r0 = r7.mState
            if (r0 == r8) goto L_0x0368
            r7.mState = r8
        L_0x0368:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.moveToState(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }
}
