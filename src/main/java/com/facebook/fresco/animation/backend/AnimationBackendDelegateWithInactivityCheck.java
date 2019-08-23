package com.facebook.fresco.animation.backend;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.b;
import com.facebook.fresco.animation.backend.AnimationBackend;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class AnimationBackendDelegateWithInactivityCheck<T extends AnimationBackend> extends AnimationBackendDelegate<T> {
    private long mInactivityCheckPollingTimeMs = 1000;
    public boolean mInactivityCheckScheduled;
    @Nullable
    public InactivityListener mInactivityListener;
    private long mInactivityThresholdMs = 2000;
    private final Runnable mIsInactiveCheck = new Runnable() {
        public void run() {
            synchronized (AnimationBackendDelegateWithInactivityCheck.this) {
                AnimationBackendDelegateWithInactivityCheck.this.mInactivityCheckScheduled = false;
                if (!AnimationBackendDelegateWithInactivityCheck.this.isInactive()) {
                    AnimationBackendDelegateWithInactivityCheck.this.maybeScheduleInactivityCheck();
                } else if (AnimationBackendDelegateWithInactivityCheck.this.mInactivityListener != null) {
                    AnimationBackendDelegateWithInactivityCheck.this.mInactivityListener.onInactive();
                }
            }
        }
    };
    private long mLastDrawnTimeMs;
    private final b mMonotonicClock;
    private final ScheduledExecutorService mScheduledExecutorServiceForUiThread;

    public interface InactivityListener {
        void onInactive();
    }

    public long getInactivityCheckPollingTimeMs() {
        return this.mInactivityCheckPollingTimeMs;
    }

    public long getInactivityThresholdMs() {
        return this.mInactivityThresholdMs;
    }

    public boolean isInactive() {
        if (this.mMonotonicClock.now() - this.mLastDrawnTimeMs > this.mInactivityThresholdMs) {
            return true;
        }
        return false;
    }

    public synchronized void maybeScheduleInactivityCheck() {
        if (!this.mInactivityCheckScheduled) {
            this.mInactivityCheckScheduled = true;
            this.mScheduledExecutorServiceForUiThread.schedule(this.mIsInactiveCheck, this.mInactivityCheckPollingTimeMs, TimeUnit.MILLISECONDS);
        }
    }

    public void setInactivityCheckPollingTimeMs(long j) {
        this.mInactivityCheckPollingTimeMs = j;
    }

    public void setInactivityListener(@Nullable InactivityListener inactivityListener) {
        this.mInactivityListener = inactivityListener;
    }

    public void setInactivityThresholdMs(long j) {
        this.mInactivityThresholdMs = j;
    }

    public static <T extends AnimationBackend & InactivityListener> AnimationBackendDelegate<T> createForBackend(T t, b bVar, ScheduledExecutorService scheduledExecutorService) {
        return createForBackend(t, (InactivityListener) t, bVar, scheduledExecutorService);
    }

    public boolean drawFrame(Drawable drawable, Canvas canvas, int i) {
        this.mLastDrawnTimeMs = this.mMonotonicClock.now();
        boolean drawFrame = super.drawFrame(drawable, canvas, i);
        maybeScheduleInactivityCheck();
        return drawFrame;
    }

    public static <T extends AnimationBackend> AnimationBackendDelegate<T> createForBackend(T t, InactivityListener inactivityListener, b bVar, ScheduledExecutorService scheduledExecutorService) {
        return new AnimationBackendDelegateWithInactivityCheck(t, inactivityListener, bVar, scheduledExecutorService);
    }

    private AnimationBackendDelegateWithInactivityCheck(@Nullable T t, @Nullable InactivityListener inactivityListener, b bVar, ScheduledExecutorService scheduledExecutorService) {
        super(t);
        this.mInactivityListener = inactivityListener;
        this.mMonotonicClock = bVar;
        this.mScheduledExecutorServiceForUiThread = scheduledExecutorService;
    }
}
