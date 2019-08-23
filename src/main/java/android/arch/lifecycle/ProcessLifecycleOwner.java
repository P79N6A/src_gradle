package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.ReportFragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;

public class ProcessLifecycleOwner implements LifecycleOwner {
    private static final ProcessLifecycleOwner sInstance = new ProcessLifecycleOwner();
    private Runnable mDelayedPauseRunnable = new Runnable() {
        public void run() {
            ProcessLifecycleOwner.this.dispatchPauseIfNeeded();
            ProcessLifecycleOwner.this.dispatchStopIfNeeded();
        }
    };
    private Handler mHandler;
    public ReportFragment.ActivityInitializationListener mInitializationListener = new ReportFragment.ActivityInitializationListener() {
        public void onCreate() {
        }

        public void onResume() {
            ProcessLifecycleOwner.this.activityResumed();
        }

        public void onStart() {
            ProcessLifecycleOwner.this.activityStarted();
        }
    };
    private boolean mPauseSent = true;
    private final LifecycleRegistry mRegistry = new LifecycleRegistry(this);
    private int mResumedCounter;
    private int mStartedCounter;
    private boolean mStopSent = true;

    public static LifecycleOwner get() {
        return sInstance;
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.mRegistry;
    }

    /* access modifiers changed from: package-private */
    public void activityStopped() {
        this.mStartedCounter--;
        dispatchStopIfNeeded();
    }

    public void dispatchPauseIfNeeded() {
        if (this.mResumedCounter == 0) {
            this.mPauseSent = true;
            this.mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    private ProcessLifecycleOwner() {
    }

    /* access modifiers changed from: package-private */
    public void activityPaused() {
        this.mResumedCounter--;
        if (this.mResumedCounter == 0) {
            this.mHandler.postDelayed(this.mDelayedPauseRunnable, 700);
        }
    }

    /* access modifiers changed from: package-private */
    public void activityStarted() {
        this.mStartedCounter++;
        if (this.mStartedCounter == 1 && this.mStopSent) {
            this.mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.mStopSent = false;
        }
    }

    public void dispatchStopIfNeeded() {
        if (this.mStartedCounter == 0 && this.mPauseSent) {
            this.mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            this.mStopSent = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void activityResumed() {
        this.mResumedCounter++;
        if (this.mResumedCounter == 1) {
            if (this.mPauseSent) {
                this.mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                this.mPauseSent = false;
                return;
            }
            this.mHandler.removeCallbacks(this.mDelayedPauseRunnable);
        }
    }

    static void init(Context context) {
        sInstance.attach(context);
    }

    /* access modifiers changed from: package-private */
    public void attach(Context context) {
        this.mHandler = new Handler();
        this.mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() {
            public void onActivityPaused(Activity activity) {
                ProcessLifecycleOwner.this.activityPaused();
            }

            public void onActivityStopped(Activity activity) {
                ProcessLifecycleOwner.this.activityStopped();
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                ReportFragment.get(activity).setProcessListener(ProcessLifecycleOwner.this.mInitializationListener);
            }
        });
    }
}
