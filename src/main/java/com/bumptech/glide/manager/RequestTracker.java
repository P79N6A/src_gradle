package com.bumptech.glide.manager;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public class RequestTracker {
    private boolean isPaused;
    private final List<Request> pendingRequests = new ArrayList();
    private final Set<Request> requests = Collections.newSetFromMap(new WeakHashMap());

    public boolean isPaused() {
        return this.isPaused;
    }

    public void clearRequests() {
        for (T clearRemoveAndMaybeRecycle : Util.getSnapshot(this.requests)) {
            clearRemoveAndMaybeRecycle(clearRemoveAndMaybeRecycle, false);
        }
        this.pendingRequests.clear();
    }

    public void pauseAllRequests() {
        this.isPaused = true;
        for (T t : Util.getSnapshot(this.requests)) {
            if (t.isRunning() || t.isComplete()) {
                t.clear();
                this.pendingRequests.add(t);
            }
        }
    }

    public void pauseRequests() {
        this.isPaused = true;
        for (T t : Util.getSnapshot(this.requests)) {
            if (t.isRunning()) {
                t.clear();
                this.pendingRequests.add(t);
            }
        }
    }

    public void restartRequests() {
        for (T t : Util.getSnapshot(this.requests)) {
            if (!t.isComplete() && !t.isCleared()) {
                t.clear();
                if (!this.isPaused) {
                    t.begin();
                } else {
                    this.pendingRequests.add(t);
                }
            }
        }
    }

    public void resumeRequests() {
        this.isPaused = false;
        for (T t : Util.getSnapshot(this.requests)) {
            if (!t.isComplete() && !t.isRunning()) {
                t.begin();
            }
        }
        this.pendingRequests.clear();
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.requests.size() + ", isPaused=" + this.isPaused + "}";
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public void addRequest(Request request) {
        this.requests.add(request);
    }

    public boolean clearRemoveAndRecycle(@Nullable Request request) {
        return clearRemoveAndMaybeRecycle(request, true);
    }

    public void runRequest(@NonNull Request request) {
        this.requests.add(request);
        if (!this.isPaused) {
            request.begin();
            return;
        }
        request.clear();
        this.pendingRequests.add(request);
    }

    private boolean clearRemoveAndMaybeRecycle(@Nullable Request request, boolean z) {
        boolean z2 = true;
        if (request == null) {
            return true;
        }
        boolean remove = this.requests.remove(request);
        if (!this.pendingRequests.remove(request) && !remove) {
            z2 = false;
        }
        if (z2) {
            request.clear();
            if (z) {
                request.recycle();
            }
        }
        return z2;
    }
}
