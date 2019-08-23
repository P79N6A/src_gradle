package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class d implements am {

    /* renamed from: a  reason: collision with root package name */
    private final ImageRequest f24126a;

    /* renamed from: b  reason: collision with root package name */
    private final String f24127b;

    /* renamed from: c  reason: collision with root package name */
    private final ao f24128c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f24129d;

    /* renamed from: e  reason: collision with root package name */
    private final ImageRequest.a f24130e;
    @GuardedBy

    /* renamed from: f  reason: collision with root package name */
    private boolean f24131f;
    @GuardedBy
    private Priority g;
    @GuardedBy
    private boolean h;
    @GuardedBy
    private boolean i;
    @GuardedBy
    private final List<an> j = new ArrayList();

    public Object getCallerContext() {
        return this.f24129d;
    }

    public String getId() {
        return this.f24127b;
    }

    public ImageRequest getImageRequest() {
        return this.f24126a;
    }

    public ao getListener() {
        return this.f24128c;
    }

    public ImageRequest.a getLowestPermittedRequestLevel() {
        return this.f24130e;
    }

    public void cancel() {
        callOnCancellationRequested(cancelNoCallbacks());
    }

    public synchronized Priority getPriority() {
        return this.g;
    }

    public synchronized boolean isIntermediateResultExpected() {
        return this.h;
    }

    public synchronized boolean isPrefetch() {
        return this.f24131f;
    }

    @Nullable
    public synchronized List<an> cancelNoCallbacks() {
        if (this.i) {
            return null;
        }
        this.i = true;
        return new ArrayList(this.j);
    }

    public static void callOnCancellationRequested(@Nullable List<an> list) {
        if (list != null) {
            for (an onCancellationRequested : list) {
                onCancellationRequested.onCancellationRequested();
            }
        }
    }

    public static void callOnIsIntermediateResultExpectedChanged(@Nullable List<an> list) {
        if (list != null) {
            for (an onIsIntermediateResultExpectedChanged : list) {
                onIsIntermediateResultExpectedChanged.onIsIntermediateResultExpectedChanged();
            }
        }
    }

    public static void callOnIsPrefetchChanged(@Nullable List<an> list) {
        if (list != null) {
            for (an onIsPrefetchChanged : list) {
                onIsPrefetchChanged.onIsPrefetchChanged();
            }
        }
    }

    public static void callOnPriorityChanged(@Nullable List<an> list) {
        if (list != null) {
            for (an onPriorityChanged : list) {
                onPriorityChanged.onPriorityChanged();
            }
        }
    }

    public void addCallbacks(an anVar) {
        boolean z;
        synchronized (this) {
            this.j.add(anVar);
            z = this.i;
        }
        if (z) {
            anVar.onCancellationRequested();
        }
    }

    @Nullable
    public synchronized List<an> setIsIntermediateResultExpectedNoCallbacks(boolean z) {
        if (z == this.h) {
            return null;
        }
        this.h = z;
        return new ArrayList(this.j);
    }

    @Nullable
    public synchronized List<an> setIsPrefetchNoCallbacks(boolean z) {
        if (z == this.f24131f) {
            return null;
        }
        this.f24131f = z;
        return new ArrayList(this.j);
    }

    @Nullable
    public synchronized List<an> setPriorityNoCallbacks(Priority priority) {
        if (priority == this.g) {
            return null;
        }
        this.g = priority;
        return new ArrayList(this.j);
    }

    public d(ImageRequest imageRequest, String str, ao aoVar, Object obj, ImageRequest.a aVar, boolean z, boolean z2, Priority priority) {
        this.f24126a = imageRequest;
        this.f24127b = str;
        this.f24128c = aoVar;
        this.f24129d = obj;
        this.f24130e = aVar;
        this.f24131f = z;
        this.g = priority;
        this.h = z2;
    }
}
