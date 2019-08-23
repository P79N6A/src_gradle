package android.support.v4.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {
    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    boolean mDismissed;
    boolean mPostedHide;
    boolean mPostedShow;
    long mStartTime;

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks();
    }

    private void removeCallbacks() {
        removeCallbacks(this.mDelayedHide);
        removeCallbacks(this.mDelayedShow);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void hide() {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 1
            r10.mDismissed = r0     // Catch:{ all -> 0x0039 }
            java.lang.Runnable r1 = r10.mDelayedShow     // Catch:{ all -> 0x0039 }
            r10.removeCallbacks(r1)     // Catch:{ all -> 0x0039 }
            r1 = 0
            r10.mPostedShow = r1     // Catch:{ all -> 0x0039 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0039 }
            long r3 = r10.mStartTime     // Catch:{ all -> 0x0039 }
            r5 = 0
            long r1 = r1 - r3
            r3 = 500(0x1f4, double:2.47E-321)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0032
            long r5 = r10.mStartTime     // Catch:{ all -> 0x0039 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0023
            goto L_0x0032
        L_0x0023:
            boolean r5 = r10.mPostedHide     // Catch:{ all -> 0x0039 }
            if (r5 != 0) goto L_0x0030
            java.lang.Runnable r5 = r10.mDelayedHide     // Catch:{ all -> 0x0039 }
            r6 = 0
            long r3 = r3 - r1
            r10.postDelayed(r5, r3)     // Catch:{ all -> 0x0039 }
            r10.mPostedHide = r0     // Catch:{ all -> 0x0039 }
        L_0x0030:
            monitor-exit(r10)
            return
        L_0x0032:
            r0 = 8
            r10.setVisibility(r0)     // Catch:{ all -> 0x0039 }
            monitor-exit(r10)
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.ContentLoadingProgressBar.hide():void");
    }

    public synchronized void show() {
        this.mStartTime = -1;
        this.mDismissed = false;
        removeCallbacks(this.mDelayedHide);
        this.mPostedHide = false;
        if (!this.mPostedShow) {
            postDelayed(this.mDelayedShow, 500);
            this.mPostedShow = true;
        }
    }

    public ContentLoadingProgressBar(@NonNull Context context) {
        this(context, null);
    }

    public ContentLoadingProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.mStartTime = -1;
        this.mDelayedHide = new Runnable() {
            public void run() {
                ContentLoadingProgressBar.this.mPostedHide = false;
                ContentLoadingProgressBar.this.mStartTime = -1;
                ContentLoadingProgressBar.this.setVisibility(8);
            }
        };
        this.mDelayedShow = new Runnable() {
            public void run() {
                ContentLoadingProgressBar.this.mPostedShow = false;
                if (!ContentLoadingProgressBar.this.mDismissed) {
                    ContentLoadingProgressBar.this.mStartTime = System.currentTimeMillis();
                    ContentLoadingProgressBar.this.setVisibility(0);
                }
            }
        };
    }
}