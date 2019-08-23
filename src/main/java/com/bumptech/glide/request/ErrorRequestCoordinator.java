package com.bumptech.glide.request;

import android.support.annotation.Nullable;

public final class ErrorRequestCoordinator implements Request, RequestCoordinator {
    private Request error;
    @Nullable
    private final RequestCoordinator parent;
    private Request primary;

    private boolean parentIsAnyResourceSet() {
        if (this.parent == null || !this.parent.isAnyResourceSet()) {
            return false;
        }
        return true;
    }

    public final void begin() {
        if (!this.primary.isRunning()) {
            this.primary.begin();
        }
    }

    public final void recycle() {
        this.primary.recycle();
        this.error.recycle();
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

    public final void clear() {
        this.primary.clear();
        if (this.error.isRunning()) {
            this.error.clear();
        }
    }

    public final boolean isAnyResourceSet() {
        if (parentIsAnyResourceSet() || isResourceSet()) {
            return true;
        }
        return false;
    }

    public final boolean isCleared() {
        Request request;
        if (this.primary.isFailed()) {
            request = this.error;
        } else {
            request = this.primary;
        }
        return request.isCleared();
    }

    public final boolean isComplete() {
        Request request;
        if (this.primary.isFailed()) {
            request = this.error;
        } else {
            request = this.primary;
        }
        return request.isComplete();
    }

    public final boolean isFailed() {
        if (!this.primary.isFailed() || !this.error.isFailed()) {
            return false;
        }
        return true;
    }

    public final boolean isResourceSet() {
        Request request;
        if (this.primary.isFailed()) {
            request = this.error;
        } else {
            request = this.primary;
        }
        return request.isResourceSet();
    }

    public final boolean isRunning() {
        Request request;
        if (this.primary.isFailed()) {
            request = this.error;
        } else {
            request = this.primary;
        }
        return request.isRunning();
    }

    public ErrorRequestCoordinator(@Nullable RequestCoordinator requestCoordinator) {
        this.parent = requestCoordinator;
    }

    public final boolean canNotifyCleared(Request request) {
        if (!parentCanNotifyCleared() || !isValidRequest(request)) {
            return false;
        }
        return true;
    }

    public final boolean canNotifyStatusChanged(Request request) {
        if (!parentCanNotifyStatusChanged() || !isValidRequest(request)) {
            return false;
        }
        return true;
    }

    public final boolean canSetImage(Request request) {
        if (!parentCanSetImage() || !isValidRequest(request)) {
            return false;
        }
        return true;
    }

    public final void onRequestSuccess(Request request) {
        if (this.parent != null) {
            this.parent.onRequestSuccess(this);
        }
    }

    private boolean isValidRequest(Request request) {
        if (request.equals(this.primary) || (this.primary.isFailed() && request.equals(this.error))) {
            return true;
        }
        return false;
    }

    public final boolean isEquivalentTo(Request request) {
        if (!(request instanceof ErrorRequestCoordinator)) {
            return false;
        }
        ErrorRequestCoordinator errorRequestCoordinator = (ErrorRequestCoordinator) request;
        if (!this.primary.isEquivalentTo(errorRequestCoordinator.primary) || !this.error.isEquivalentTo(errorRequestCoordinator.error)) {
            return false;
        }
        return true;
    }

    public final void onRequestFailed(Request request) {
        if (!request.equals(this.error)) {
            if (!this.error.isRunning()) {
                this.error.begin();
            }
            return;
        }
        if (this.parent != null) {
            this.parent.onRequestFailed(this);
        }
    }

    public final void setRequests(Request request, Request request2) {
        this.primary = request;
        this.error = request2;
    }
}
