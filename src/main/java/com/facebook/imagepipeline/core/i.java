package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.e;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.producers.ah;
import com.facebook.imagepipeline.producers.al;
import com.facebook.imagepipeline.producers.aq;
import com.facebook.imagepipeline.producers.aw;
import com.facebook.imagepipeline.producers.az;
import com.facebook.imagepipeline.producers.n;
import com.facebook.imagepipeline.producers.o;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.transcoder.c;
import java.util.HashMap;
import java.util.Map;

public final class i {
    private final boolean A;
    private final c B;
    private al<b> C;
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    al<CloseableReference<CloseableImage>> f23923a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    al<b> f23924b;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    al<b> f23925c;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    al<CloseableReference<e>> f23926d;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    al<CloseableReference<e>> f23927e;
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    al<Void> f23928f;
    @VisibleForTesting
    al<Void> g;
    @VisibleForTesting
    al<CloseableReference<CloseableImage>> h;
    @VisibleForTesting
    al<CloseableReference<CloseableImage>> i;
    @VisibleForTesting
    al<CloseableReference<CloseableImage>> j;
    @VisibleForTesting
    al<CloseableReference<CloseableImage>> k;
    @VisibleForTesting
    al<CloseableReference<CloseableImage>> l;
    @VisibleForTesting
    al<CloseableReference<CloseableImage>> m;
    @VisibleForTesting
    al<CloseableReference<CloseableImage>> n;
    @VisibleForTesting
    Map<al<CloseableReference<CloseableImage>>, al<CloseableReference<CloseableImage>>> o = new HashMap();
    @VisibleForTesting
    Map<al<CloseableReference<CloseableImage>>, al<Void>> p = new HashMap();
    @VisibleForTesting
    Map<al<CloseableReference<CloseableImage>>, al<CloseableReference<CloseableImage>>> q = new HashMap();
    private final ContentResolver r;
    private final h s;
    private final ah t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final aw x;
    private final boolean y;
    private final boolean z;

    private synchronized al<CloseableReference<CloseableImage>> g() {
        if (this.h == null) {
            this.h = a((al<b>) this.s.newLocalFileFetchProducer());
        }
        return this.h;
    }

    private synchronized al<CloseableReference<CloseableImage>> h() {
        if (this.i == null) {
            this.i = e(this.s.newLocalVideoThumbnailProducer());
        }
        return this.i;
    }

    private synchronized al<CloseableReference<CloseableImage>> j() {
        if (this.n == null) {
            this.n = a((al<b>) this.s.newQualifiedResourceFetchProducer());
        }
        return this.n;
    }

    private synchronized al<CloseableReference<CloseableImage>> k() {
        if (this.k == null) {
            this.k = a((al<b>) this.s.newLocalResourceFetchProducer());
        }
        return this.k;
    }

    private synchronized al<CloseableReference<CloseableImage>> l() {
        if (this.l == null) {
            this.l = a((al<b>) this.s.newLocalAssetFetchProducer());
        }
        return this.l;
    }

    private synchronized al<CloseableReference<CloseableImage>> a() {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getNetworkFetchSequence");
        }
        if (this.f23923a == null) {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getNetworkFetchSequence:init");
            }
            this.f23923a = b(d());
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
        return this.f23923a;
    }

    private synchronized al<Void> c() {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.g == null) {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.g = h.newSwallowResultProducer(b());
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
        return this.g;
    }

    private synchronized al<Void> e() {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f23928f == null) {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f23928f = h.newSwallowResultProducer(f());
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
        return this.f23928f;
    }

    private synchronized al<CloseableReference<CloseableImage>> i() {
        if (this.j == null) {
            this.j = a(this.s.newLocalContentUriFetchProducer(), new az[]{this.s.newLocalContentUriThumbnailFetchProducer(), this.s.newLocalExifThumbnailProducer()});
        }
        return this.j;
    }

    private synchronized al<CloseableReference<CloseableImage>> m() {
        if (this.m == null) {
            al newDataFetchProducer = this.s.newDataFetchProducer();
            if (com.facebook.common.g.c.f2345a && (!this.v || com.facebook.common.g.c.f2348d == null)) {
                newDataFetchProducer = this.s.newWebpTranscodeProducer(newDataFetchProducer);
            }
            this.m = b((al<b>) this.s.newResizeAndRotateProducer(h.newAddImageTransformMetaDataProducer(newDataFetchProducer), true, this.B));
        }
        return this.m;
    }

    public final al<CloseableReference<e>> getLocalFileFetchEncodedImageProducerSequence() {
        synchronized (this) {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence");
            }
            if (this.f23926d == null) {
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
                }
                this.f23926d = new aq(f());
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.endSection();
                }
            }
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
        return this.f23926d;
    }

    public final al<CloseableReference<e>> getNetworkFetchEncodedImageProducerSequence() {
        synchronized (this) {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence");
            }
            if (this.f23927e == null) {
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
                }
                this.f23927e = new aq(b());
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.endSection();
                }
            }
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
        return this.f23927e;
    }

    private synchronized al<b> b() {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence");
        }
        if (this.f23925c == null) {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
            }
            this.f23925c = this.s.newBackgroundThreadHandoffProducer(d(), this.x);
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
        return this.f23925c;
    }

    private synchronized al<b> d() {
        boolean z2;
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        }
        if (this.C == null) {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init");
            }
            this.C = h.newAddImageTransformMetaDataProducer(c(this.s.newNetworkFetchProducer(this.t)));
            h hVar = this.s;
            al<b> alVar = this.C;
            if (!this.u || this.y) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.C = hVar.newResizeAndRotateProducer(alVar, z2, this.B);
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
        return this.C;
    }

    private synchronized al<b> f() {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        }
        if (this.f23924b == null) {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence:init");
            }
            this.f23924b = this.s.newBackgroundThreadHandoffProducer(c(this.s.newLocalFileFetchProducer()), this.x);
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
        return this.f23924b;
    }

    private al<CloseableReference<CloseableImage>> a(al<b> alVar) {
        return a(alVar, new az[]{this.s.newLocalExifThumbnailProducer()});
    }

    private al<CloseableReference<CloseableImage>> b(al<b> alVar) {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        }
        al<CloseableReference<CloseableImage>> e2 = e(this.s.newDecodeProducer(alVar));
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
        return e2;
    }

    private al<CloseableReference<CloseableImage>> e(al<CloseableReference<CloseableImage>> alVar) {
        return this.s.newBitmapMemoryCacheGetProducer(this.s.newBackgroundThreadHandoffProducer(this.s.newBitmapMemoryCacheKeyMultiplexProducer(this.s.newBitmapMemoryCacheProducer(alVar)), this.x));
    }

    public final al<Void> getDecodedImagePrefetchProducerSequence(ImageRequest imageRequest) {
        al<CloseableReference<CloseableImage>> b2 = b(imageRequest);
        if (this.z) {
            b2 = h(b2);
        }
        return g(b2);
    }

    private al<b> d(al<b> alVar) {
        o oVar;
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#newDiskCacheSequence");
        }
        if (this.w) {
            oVar = this.s.newDiskCacheWriteProducer(this.s.newPartialDiskCacheProducer(alVar));
        } else {
            oVar = this.s.newDiskCacheWriteProducer(alVar);
        }
        n newDiskCacheReadProducer = this.s.newDiskCacheReadProducer(oVar);
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
        return newDiskCacheReadProducer;
    }

    private synchronized al<CloseableReference<CloseableImage>> f(al<CloseableReference<CloseableImage>> alVar) {
        if (!this.o.containsKey(alVar)) {
            this.o.put(alVar, this.s.newPostprocessorBitmapMemoryCacheProducer(this.s.newPostprocessorProducer(alVar)));
        }
        return this.o.get(alVar);
    }

    private synchronized al<Void> g(al<CloseableReference<CloseableImage>> alVar) {
        if (!this.p.containsKey(alVar)) {
            this.p.put(alVar, h.newSwallowResultProducer(alVar));
        }
        return this.p.get(alVar);
    }

    private synchronized al<CloseableReference<CloseableImage>> h(al<CloseableReference<CloseableImage>> alVar) {
        al<CloseableReference<CloseableImage>> alVar2;
        alVar2 = this.q.get(alVar);
        if (alVar2 == null) {
            alVar2 = this.s.newBitmapPrepareProducer(alVar);
            this.q.put(alVar, alVar2);
        }
        return alVar2;
    }

    public final al<CloseableReference<CloseableImage>> getDecodedImageProducerSequence(ImageRequest imageRequest) {
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getDecodedImageProducerSequence");
        }
        al<CloseableReference<CloseableImage>> b2 = b(imageRequest);
        if (imageRequest.getPostprocessor() != null) {
            b2 = f(b2);
        }
        if (this.z) {
            b2 = h(b2);
        }
        if (com.facebook.imagepipeline.e.b.isTracing()) {
            com.facebook.imagepipeline.e.b.endSection();
        }
        return b2;
    }

    public final al<Void> getEncodedImagePrefetchProducerSequence(ImageRequest imageRequest) {
        a(imageRequest);
        int sourceUriType = imageRequest.getSourceUriType();
        if (sourceUriType == 0) {
            return c();
        }
        switch (sourceUriType) {
            case 2:
            case 3:
                return e();
            default:
                Uri sourceUri = imageRequest.getSourceUri();
                throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + a(sourceUri));
        }
    }

    private al<b> a(az<b>[] azVarArr) {
        return this.s.newResizeAndRotateProducer(this.s.newThumbnailBranchProducer(azVarArr), true, this.B);
    }

    private al<b> c(al<b> alVar) {
        if (com.facebook.common.g.c.f2345a && (!this.v || com.facebook.common.g.c.f2348d == null)) {
            alVar = this.s.newWebpTranscodeProducer(alVar);
        }
        if (this.A) {
            alVar = d(alVar);
        }
        return this.s.newEncodedCacheKeyMultiplexProducer(this.s.newEncodedMemoryCacheProducer(alVar));
    }

    public final al<CloseableReference<e>> getEncodedImageProducerSequence(ImageRequest imageRequest) {
        try {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.beginSection("ProducerSequenceFactory#getEncodedImageProducerSequence");
            }
            a(imageRequest);
            Uri sourceUri = imageRequest.getSourceUri();
            int sourceUriType = imageRequest.getSourceUriType();
            if (sourceUriType != 0) {
                switch (sourceUriType) {
                    case 2:
                    case 3:
                        return getLocalFileFetchEncodedImageProducerSequence();
                    default:
                        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + a(sourceUri));
                }
            } else {
                al<CloseableReference<e>> networkFetchEncodedImageProducerSequence = getNetworkFetchEncodedImageProducerSequence();
                if (com.facebook.imagepipeline.e.b.isTracing()) {
                    com.facebook.imagepipeline.e.b.endSection();
                }
                return networkFetchEncodedImageProducerSequence;
            }
        } finally {
            if (com.facebook.imagepipeline.e.b.isTracing()) {
                com.facebook.imagepipeline.e.b.endSection();
            }
        }
    }

    private static String a(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() <= 30) {
            return valueOf;
        }
        return valueOf.substring(0, 30) + "...";
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c9 A[FINALLY_INSNS] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.imagepipeline.producers.al<com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>> b(com.facebook.imagepipeline.request.ImageRequest r4) {
        /*
            r3 = this;
            boolean r0 = com.facebook.imagepipeline.e.b.isTracing()     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "ProducerSequenceFactory#getBasicDecodedImageSequence"
            com.facebook.imagepipeline.e.b.beginSection(r0)     // Catch:{ all -> 0x00c2 }
        L_0x000b:
            com.facebook.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ all -> 0x00c2 }
            android.net.Uri r0 = r4.getSourceUri()     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "Uri is null."
            com.facebook.common.internal.Preconditions.checkNotNull(r0, r1)     // Catch:{ all -> 0x00c2 }
            int r4 = r4.getSourceUriType()     // Catch:{ all -> 0x00c2 }
            if (r4 == 0) goto L_0x00b4
            switch(r4) {
                case 2: goto L_0x00a6;
                case 3: goto L_0x0098;
                case 4: goto L_0x0070;
                case 5: goto L_0x0062;
                case 6: goto L_0x0054;
                case 7: goto L_0x0046;
                case 8: goto L_0x0038;
                default: goto L_0x0020;
            }     // Catch:{ all -> 0x00c2 }
        L_0x0020:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            java.lang.String r2 = "Unsupported uri scheme! Uri is: "
            r1.<init>(r2)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = a((android.net.Uri) r0)     // Catch:{ all -> 0x00c2 }
            r1.append(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c2 }
            r4.<init>(r0)     // Catch:{ all -> 0x00c2 }
            throw r4     // Catch:{ all -> 0x00c2 }
        L_0x0038:
            com.facebook.imagepipeline.producers.al r4 = r3.j()     // Catch:{ all -> 0x00c2 }
            boolean r0 = com.facebook.imagepipeline.e.b.isTracing()
            if (r0 == 0) goto L_0x0045
            com.facebook.imagepipeline.e.b.endSection()
        L_0x0045:
            return r4
        L_0x0046:
            com.facebook.imagepipeline.producers.al r4 = r3.m()     // Catch:{ all -> 0x00c2 }
            boolean r0 = com.facebook.imagepipeline.e.b.isTracing()
            if (r0 == 0) goto L_0x0053
            com.facebook.imagepipeline.e.b.endSection()
        L_0x0053:
            return r4
        L_0x0054:
            com.facebook.imagepipeline.producers.al r4 = r3.k()     // Catch:{ all -> 0x00c2 }
            boolean r0 = com.facebook.imagepipeline.e.b.isTracing()
            if (r0 == 0) goto L_0x0061
            com.facebook.imagepipeline.e.b.endSection()
        L_0x0061:
            return r4
        L_0x0062:
            com.facebook.imagepipeline.producers.al r4 = r3.l()     // Catch:{ all -> 0x00c2 }
            boolean r0 = com.facebook.imagepipeline.e.b.isTracing()
            if (r0 == 0) goto L_0x006f
            com.facebook.imagepipeline.e.b.endSection()
        L_0x006f:
            return r4
        L_0x0070:
            android.content.ContentResolver r4 = r3.r     // Catch:{ all -> 0x00c2 }
            java.lang.String r4 = r4.getType(r0)     // Catch:{ all -> 0x00c2 }
            boolean r4 = com.facebook.common.c.a.a(r4)     // Catch:{ all -> 0x00c2 }
            if (r4 == 0) goto L_0x008a
            com.facebook.imagepipeline.producers.al r4 = r3.h()     // Catch:{ all -> 0x00c2 }
            boolean r0 = com.facebook.imagepipeline.e.b.isTracing()
            if (r0 == 0) goto L_0x0089
            com.facebook.imagepipeline.e.b.endSection()
        L_0x0089:
            return r4
        L_0x008a:
            com.facebook.imagepipeline.producers.al r4 = r3.i()     // Catch:{ all -> 0x00c2 }
            boolean r0 = com.facebook.imagepipeline.e.b.isTracing()
            if (r0 == 0) goto L_0x0097
            com.facebook.imagepipeline.e.b.endSection()
        L_0x0097:
            return r4
        L_0x0098:
            com.facebook.imagepipeline.producers.al r4 = r3.g()     // Catch:{ all -> 0x00c2 }
            boolean r0 = com.facebook.imagepipeline.e.b.isTracing()
            if (r0 == 0) goto L_0x00a5
            com.facebook.imagepipeline.e.b.endSection()
        L_0x00a5:
            return r4
        L_0x00a6:
            com.facebook.imagepipeline.producers.al r4 = r3.h()     // Catch:{ all -> 0x00c2 }
            boolean r0 = com.facebook.imagepipeline.e.b.isTracing()
            if (r0 == 0) goto L_0x00b3
            com.facebook.imagepipeline.e.b.endSection()
        L_0x00b3:
            return r4
        L_0x00b4:
            com.facebook.imagepipeline.producers.al r4 = r3.a()     // Catch:{ all -> 0x00c2 }
            boolean r0 = com.facebook.imagepipeline.e.b.isTracing()
            if (r0 == 0) goto L_0x00c1
            com.facebook.imagepipeline.e.b.endSection()
        L_0x00c1:
            return r4
        L_0x00c2:
            r4 = move-exception
            boolean r0 = com.facebook.imagepipeline.e.b.isTracing()
            if (r0 == 0) goto L_0x00cc
            com.facebook.imagepipeline.e.b.endSection()
        L_0x00cc:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.core.i.b(com.facebook.imagepipeline.request.ImageRequest):com.facebook.imagepipeline.producers.al");
    }

    private static void a(ImageRequest imageRequest) {
        boolean z2;
        Preconditions.checkNotNull(imageRequest);
        if (imageRequest.getLowestPermittedRequestLevel().getValue() <= ImageRequest.a.ENCODED_MEMORY_CACHE.getValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
    }

    private al<CloseableReference<CloseableImage>> a(al<b> alVar, az<b>[] azVarArr) {
        return b(b(c(alVar), azVarArr));
    }

    private al<b> b(al<b> alVar, az<b>[] azVarArr) {
        return h.newBranchOnSeparateImagesProducer(a(azVarArr), this.s.newThrottlingProducer(this.s.newResizeAndRotateProducer(h.newAddImageTransformMetaDataProducer(alVar), true, this.B)));
    }

    public i(ContentResolver contentResolver, h hVar, ah ahVar, boolean z2, boolean z3, aw awVar, boolean z4, boolean z5, boolean z6, boolean z7, c cVar) {
        this.r = contentResolver;
        this.s = hVar;
        this.t = ahVar;
        this.u = z2;
        this.v = z3;
        this.x = awVar;
        this.y = z4;
        this.z = z5;
        this.w = z6;
        this.A = z7;
        this.B = cVar;
    }
}
