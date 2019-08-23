package com.bumptech.glide.request;

import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;

public class ThumbnailRequestCoordinator implements Request, RequestCoordinator {
    private Request full;
    private boolean isRunning;
    @Nullable
    private final RequestCoordinator parent;
    private Request thumb;

    @VisibleForTesting
    ThumbnailRequestCoordinator() {
        this(null);
    }

    public boolean isCleared() {
        return this.full.isCleared();
    }

    public boolean isFailed() {
        return this.full.isFailed();
    }

    public boolean isRunning() {
        return this.full.isRunning();
    }

    private boolean parentIsAnyResourceSet() {
        if (this.parent == null || !this.parent.isAnyResourceSet()) {
            return false;
        }
        return true;
    }

    public void clear() {
        this.isRunning = false;
        this.thumb.clear();
        this.full.clear();
    }

    public void recycle() {
        this.full.recycle();
        this.thumb.recycle();
    }

    private boolean parentCanNotifyCleared() {
        if (this.parent == null || this.parent.canNotifyCleared(this)) {
            return true;
        }
        return false;
    }

    private boolean parentCanNotifyStatusChanged() {
        if (this.parent == null || this.parent.canNotifyStatusChanged(this)) {
            return true;
        }
        return false;
    }

    private boolean parentCanSetImage() {
        if (this.parent == null || this.parent.canSetImage(this)) {
            return true;
        }
        return false;
    }

    public boolean isAnyResourceSet() {
        if (parentIsAnyResourceSet() || isResourceSet()) {
            return true;
        }
        return false;
    }

    public boolean isComplete() {
        if (this.full.isComplete() || this.thumb.isComplete()) {
            return true;
        }
        return false;
    }

    public boolean isResourceSet() {
        if (this.full.isResourceSet() || this.thumb.isResourceSet()) {
            return true;
        }
        return false;
    }

    public void begin() {
        this.isRunning = true;
        if (!this.full.isComplete() && !this.thumb.isRunning()) {
            this.thumb.begin();
        }
        if (this.isRunning && !this.full.isRunning()) {
            this.full.begin();
        }
    }

    public ThumbnailRequestCoordinator(@Nullable RequestCoordinator requestCoordinator) {
        this.parent = requestCoordinator;
    }

    public boolean canNotifyCleared(Request request) {
        if (!parentCanNotifyCleared() || !request.equals(this.full)) {
            return false;
        }
        return true;
    }

    public boolean canNotifyStatusChanged(Request request) {
        if (!parentCanNotifyStatusChanged() || !request.equals(this.full) || isAnyResourceSet()) {
            return false;
        }
        return true;
    }

    public boolean canSetImage(Request request) {
        if (!parentCanSetImage() || (!request.equals(this.full) && this.full.isResourceSet())) {
            return false;
        }
        return true;
    }

    public void onRequestFailed(Request request) {
        if (request.equals(this.full) && this.parent != null) {
            this.parent.onRequestFailed(this);
        }
    }

    public void onRequestSuccess(Request request) {
        if (!request.equals(this.thumb)) {
            if (this.parent != null) {
                this.parent.onRequestSuccess(this);
            }
            if (!this.thumb.isComplete()) {
                this.thumb.clear();
            }
        }
    }

    public boolean isEquivalentTo(Request request) {
        if (!(request instanceof ThumbnailRequestCoordinator)) {
            return false;
        }
        ThumbnailRequestCoordinator thumbnailRequestCoordinator = (ThumbnailRequestCoordinator) request;
        if (this.full != null ? this.full.isEquivalentTo(thumbnailRequestCoordinator.full) : thumbnailRequestCoordinator.full == null) {
            if (this.thumb != null ? this.thumb.isEquivalentTo(thumbnailRequestCoordinator.thumb) : thumbnailRequestCoordinator.thumb == null) {
                return true;
            }
        }
        return false;
    }

    public void setRequests(Request request, Request request2) {
        this.full = request;
        this.thumb = request2;
    }
}
