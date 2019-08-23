package com.facebook.imagepipeline.producers;

import com.facebook.common.logging.FLog;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public abstract class b<T> implements Consumer<T> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f24118a;

    public static boolean isLast(int i) {
        return (i & 1) == 1;
    }

    public static int simpleStatusForIsLast(boolean z) {
        return z ? 1 : 0;
    }

    public static boolean statusHasAnyFlag(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean statusHasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    public static int turnOffStatusFlag(int i, int i2) {
        return i & (i2 ^ -1);
    }

    /* access modifiers changed from: protected */
    public abstract void onCancellationImpl();

    /* access modifiers changed from: protected */
    public abstract void onFailureImpl(Throwable th);

    /* access modifiers changed from: protected */
    public abstract void onNewResultImpl(T t, int i);

    /* access modifiers changed from: protected */
    public void onProgressUpdateImpl(float f2) {
    }

    public synchronized void onCancellation() {
        if (!this.f24118a) {
            this.f24118a = true;
            try {
                onCancellationImpl();
            } catch (Exception e2) {
                a(e2);
            }
        }
    }

    private void a(Exception exc) {
        FLog.wtf(getClass(), "unhandled exception", (Throwable) exc);
    }

    public static boolean isNotLast(int i) {
        if (!isLast(i)) {
            return true;
        }
        return false;
    }

    public synchronized void onFailure(Throwable th) {
        if (!this.f24118a) {
            this.f24118a = true;
            try {
                onFailureImpl(th);
            } catch (Exception e2) {
                a(e2);
            }
        }
    }

    public synchronized void onProgressUpdate(float f2) {
        if (!this.f24118a) {
            try {
                onProgressUpdateImpl(f2);
            } catch (Exception e2) {
                a(e2);
            }
        }
    }

    public synchronized void onNewResult(@Nullable T t, int i) {
        if (!this.f24118a) {
            this.f24118a = isLast(i);
            try {
                onNewResultImpl(t, i);
            } catch (Exception e2) {
                a(e2);
            }
        }
    }
}
