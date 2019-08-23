package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.f;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.a.a;
import com.facebook.drawee.backends.pipeline.info.b;
import com.facebook.drawee.backends.pipeline.info.g;
import com.facebook.drawee.backends.pipeline.info.h;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.drawable.ScaleTypeDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.imagepipeline.cache.n;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.listener.RequestListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class c extends AbstractDraweeController<CloseableReference<CloseableImage>, ImageInfo> {

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?> f23640f = c.class;

    /* renamed from: a  reason: collision with root package name */
    public final Resources f23641a;

    /* renamed from: b  reason: collision with root package name */
    public CacheKey f23642b;

    /* renamed from: c  reason: collision with root package name */
    public Supplier<DataSource<CloseableReference<CloseableImage>>> f23643c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f23644d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public f<DrawableFactory> f23645e;
    private final DrawableFactory g;
    @Nullable
    private final f<DrawableFactory> h;
    @Nullable
    private final n<CacheKey, CloseableImage> i;
    @Nullable
    private g j;
    @GuardedBy
    @Nullable
    private Set<RequestListener> k;
    @GuardedBy
    @Nullable
    private b l;
    private a m;

    /* access modifiers changed from: protected */
    public final synchronized void a(@Nullable com.facebook.drawee.backends.pipeline.info.f fVar) {
        if (this.j != null) {
            g gVar = this.j;
            if (gVar.f23669b != null) {
                gVar.f23669b.clear();
            }
            gVar.a(false);
            h hVar = gVar.f23668a;
            hVar.f23675b = null;
            hVar.f23676c = null;
            hVar.f23677d = null;
            hVar.f23678e = null;
            hVar.f23679f = -1;
            hVar.h = -1;
            hVar.i = -1;
            hVar.j = -1;
            hVar.k = -1;
            hVar.l = -1;
            hVar.m = 1;
            hVar.n = false;
            hVar.o = -1;
            hVar.p = -1;
            hVar.q = -1;
            hVar.r = -1;
            hVar.s = -1;
            hVar.t = -1;
        }
        if (fVar != null) {
            if (this.j == null) {
                this.j = new g(AwakeTimeSinceBootClock.get(), this);
            }
            g gVar2 = this.j;
            if (fVar != null) {
                if (gVar2.f23669b == null) {
                    gVar2.f23669b = new LinkedList();
                }
                gVar2.f23669b.add(fVar);
            }
            this.j.a(true);
        }
    }

    public String toString() {
        return Objects.toStringHelper((Object) this).add("super", (Object) super.toString()).add("dataSourceSupplier", (Object) this.f23643c).toString();
    }

    public DataSource<CloseableReference<CloseableImage>> getDataSource() {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("PipelineDraweeController#getDataSource");
        }
        if (FLog.isLoggable(2)) {
            FLog.v(f23640f, "controller %x: getDataSource", (Object) Integer.valueOf(System.identityHashCode(this)));
        }
        DataSource<CloseableReference<CloseableImage>> dataSource = (DataSource) this.f23643c.get();
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
        return dataSource;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public CloseableReference<CloseableImage> getCachedImage() {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("PipelineDraweeController#getCachedImage");
        }
        try {
            if (this.i != null) {
                if (this.f23642b != null) {
                    CloseableReference<CloseableImage> closeableReference = this.i.get(this.f23642b);
                    if (closeableReference == null || ((CloseableImage) closeableReference.get()).getQualityInfo().isOfFullQuality()) {
                        if (com.facebook.imagepipeline.e.b.isTracing()) {
                            com.facebook.imagepipeline.e.b.endSection();
                        }
                        return closeableReference;
                    }
                    closeableReference.close();
                    if (com.facebook.imagepipeline.e.b.isTracing()) {
                        com.facebook.imagepipeline.e.b.endSection();
                    }
                    return null;
                }
            }
            return null;
        } finally {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return r1;
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.facebook.imagepipeline.listener.RequestListener a() {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            com.facebook.drawee.backends.pipeline.info.b r1 = r3.l     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0011
            com.facebook.drawee.backends.pipeline.info.c r0 = new com.facebook.drawee.backends.pipeline.info.c     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r3.getId()     // Catch:{ all -> 0x0025 }
            com.facebook.drawee.backends.pipeline.info.b r2 = r3.l     // Catch:{ all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0025 }
        L_0x0011:
            java.util.Set<com.facebook.imagepipeline.listener.RequestListener> r1 = r3.k     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023
            com.facebook.imagepipeline.listener.b r1 = new com.facebook.imagepipeline.listener.b     // Catch:{ all -> 0x0025 }
            java.util.Set<com.facebook.imagepipeline.listener.RequestListener> r2 = r3.k     // Catch:{ all -> 0x0025 }
            r1.<init>((java.util.Set<com.facebook.imagepipeline.listener.RequestListener>) r2)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0021
            r1.addRequestListener(r0)     // Catch:{ all -> 0x0025 }
        L_0x0021:
            monitor-exit(r3)
            return r1
        L_0x0023:
            monitor-exit(r3)
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.backends.pipeline.c.a():com.facebook.imagepipeline.listener.RequestListener");
    }

    public /* synthetic */ void releaseImage(@Nullable Object obj) {
        CloseableReference.closeSafely((CloseableReference) obj);
    }

    public void setHierarchy(@Nullable DraweeHierarchy draweeHierarchy) {
        super.setHierarchy(draweeHierarchy);
        a((CloseableImage) null);
    }

    public /* synthetic */ int getImageHash(@Nullable Object obj) {
        CloseableReference closeableReference = (CloseableReference) obj;
        if (closeableReference != null) {
            return closeableReference.getValueHash();
        }
        return 0;
    }

    public /* synthetic */ Object getImageInfo(Object obj) {
        CloseableReference closeableReference = (CloseableReference) obj;
        Preconditions.checkState(CloseableReference.isValid(closeableReference));
        return (ImageInfo) closeableReference.get();
    }

    public void releaseDrawable(@Nullable Drawable drawable) {
        if (drawable instanceof com.facebook.a.a.a) {
            ((com.facebook.a.a.a) drawable).dropCaches();
        }
    }

    public final synchronized void a(RequestListener requestListener) {
        if (this.k == null) {
            this.k = new HashSet();
        }
        this.k.add(requestListener);
    }

    public final synchronized void b(RequestListener requestListener) {
        if (this.k != null) {
            this.k.remove(requestListener);
        }
    }

    public boolean isSameImageRequest(@Nullable DraweeController draweeController) {
        if (this.f23642b == null || !(draweeController instanceof c)) {
            return false;
        }
        return Objects.equal(this.f23642b, ((c) draweeController).f23642b);
    }

    public final synchronized void b(b bVar) {
        if (this.l instanceof com.facebook.drawee.backends.pipeline.info.a) {
            ((com.facebook.drawee.backends.pipeline.info.a) this.l).b(bVar);
        } else if (this.l != null) {
            this.l = new com.facebook.drawee.backends.pipeline.info.a(this.l, bVar);
        } else {
            this.l = bVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Drawable createDrawable(CloseableReference<CloseableImage> closeableReference) {
        try {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("PipelineDraweeController#createDrawable");
            }
            Preconditions.checkState(CloseableReference.isValid(closeableReference));
            CloseableImage closeableImage = (CloseableImage) closeableReference.get();
            a(closeableImage);
            Drawable a2 = a(this.f23645e, closeableImage);
            if (a2 != null) {
                return a2;
            }
            Drawable a3 = a(this.h, closeableImage);
            if (a3 != null) {
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.endSection();
                }
                return a3;
            }
            Drawable createDrawable = this.g.createDrawable(closeableImage);
            if (createDrawable != null) {
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.endSection();
                }
                return createDrawable;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + closeableImage);
        } finally {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
    }

    private void a(@Nullable CloseableImage closeableImage) {
        if (this.f23644d) {
            if (getControllerOverlay() == null) {
                com.facebook.drawee.a.a aVar = new com.facebook.drawee.a.a();
                com.facebook.drawee.a.a.a aVar2 = new com.facebook.drawee.a.a.a(aVar);
                this.m = new a();
                addControllerListener(aVar2);
                setControllerOverlay(aVar);
            }
            if (this.l == null) {
                a((b) this.m);
            }
            if (getControllerOverlay() instanceof com.facebook.drawee.a.a) {
                com.facebook.drawee.a.a aVar3 = (com.facebook.drawee.a.a) getControllerOverlay();
                aVar3.a(getId());
                DraweeHierarchy hierarchy = getHierarchy();
                ScalingUtils.ScaleType scaleType = null;
                if (hierarchy != null) {
                    ScaleTypeDrawable activeScaleTypeDrawable = ScalingUtils.getActiveScaleTypeDrawable(hierarchy.getTopLevelDrawable());
                    if (activeScaleTypeDrawable != null) {
                        scaleType = activeScaleTypeDrawable.getScaleType();
                    }
                }
                aVar3.f23620c = scaleType;
                aVar3.b(this.m.a());
                if (closeableImage != null) {
                    aVar3.a(closeableImage.getWidth(), closeableImage.getHeight());
                    aVar3.f23618a = closeableImage.getSizeInBytes();
                    return;
                }
                aVar3.a();
            }
        }
    }

    public final synchronized void a(b bVar) {
        if (this.l instanceof com.facebook.drawee.backends.pipeline.info.a) {
            ((com.facebook.drawee.backends.pipeline.info.a) this.l).a(bVar);
        } else if (this.l != null) {
            this.l = new com.facebook.drawee.backends.pipeline.info.a(this.l, bVar);
        } else {
            this.l = bVar;
        }
    }

    public /* synthetic */ void onImageLoadedFromCacheImmediately(String str, Object obj) {
        super.onImageLoadedFromCacheImmediately(str, (CloseableReference) obj);
        synchronized (this) {
            if (this.l != null) {
                this.l.a(str, 5, true);
            }
        }
    }

    private static Drawable a(@Nullable f<DrawableFactory> fVar, CloseableImage closeableImage) {
        if (fVar == null) {
            return null;
        }
        Iterator it2 = fVar.iterator();
        while (it2.hasNext()) {
            DrawableFactory drawableFactory = (DrawableFactory) it2.next();
            if (drawableFactory.supportsImageType(closeableImage)) {
                Drawable createDrawable = drawableFactory.createDrawable(closeableImage);
                if (createDrawable != null) {
                    return createDrawable;
                }
            }
        }
        return null;
    }

    public c(Resources resources, com.facebook.drawee.components.a aVar, DrawableFactory drawableFactory, Executor executor, @Nullable n<CacheKey, CloseableImage> nVar, @Nullable f<DrawableFactory> fVar) {
        super(aVar, executor, null, null);
        this.f23641a = resources;
        this.g = new a(resources, drawableFactory);
        this.h = fVar;
        this.i = nVar;
    }

    public final void a(Supplier<DataSource<CloseableReference<CloseableImage>>> supplier, String str, CacheKey cacheKey, Object obj, @Nullable f<DrawableFactory> fVar, @Nullable b bVar) {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("PipelineDraweeController#initialize");
        }
        super.initialize(str, obj);
        this.f23643c = supplier;
        a((CloseableImage) null);
        this.f23642b = cacheKey;
        this.f23645e = fVar;
        synchronized (this) {
            this.l = null;
        }
        a((CloseableImage) null);
        a(bVar);
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
    }
}
