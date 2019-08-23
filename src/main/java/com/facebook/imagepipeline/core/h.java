package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.memory.a;
import com.facebook.common.memory.f;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.b.c;
import com.facebook.imagepipeline.b.e;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.n;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.producers.aa;
import com.facebook.imagepipeline.producers.ac;
import com.facebook.imagepipeline.producers.ad;
import com.facebook.imagepipeline.producers.ae;
import com.facebook.imagepipeline.producers.ag;
import com.facebook.imagepipeline.producers.ah;
import com.facebook.imagepipeline.producers.ai;
import com.facebook.imagepipeline.producers.aj;
import com.facebook.imagepipeline.producers.ak;
import com.facebook.imagepipeline.producers.al;
import com.facebook.imagepipeline.producers.ap;
import com.facebook.imagepipeline.producers.ar;
import com.facebook.imagepipeline.producers.au;
import com.facebook.imagepipeline.producers.av;
import com.facebook.imagepipeline.producers.aw;
import com.facebook.imagepipeline.producers.ax;
import com.facebook.imagepipeline.producers.ay;
import com.facebook.imagepipeline.producers.az;
import com.facebook.imagepipeline.producers.bb;
import com.facebook.imagepipeline.producers.g;
import com.facebook.imagepipeline.producers.i;
import com.facebook.imagepipeline.producers.j;
import com.facebook.imagepipeline.producers.k;
import com.facebook.imagepipeline.producers.l;
import com.facebook.imagepipeline.producers.o;
import com.facebook.imagepipeline.producers.q;
import com.facebook.imagepipeline.producers.r;
import com.facebook.imagepipeline.producers.x;
import com.facebook.imagepipeline.producers.y;
import com.facebook.imagepipeline.producers.z;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private ContentResolver f23917a;

    /* renamed from: b  reason: collision with root package name */
    private Resources f23918b;

    /* renamed from: c  reason: collision with root package name */
    private AssetManager f23919c;

    /* renamed from: d  reason: collision with root package name */
    private final a f23920d;

    /* renamed from: e  reason: collision with root package name */
    private final c f23921e;

    /* renamed from: f  reason: collision with root package name */
    private final e f23922f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final ExecutorSupplier j;
    private final f k;
    private final com.facebook.imagepipeline.cache.e l;
    private final com.facebook.imagepipeline.cache.e m;
    private final n<CacheKey, com.facebook.common.memory.e> n;
    private final n<CacheKey, CloseableImage> o;
    private final CacheKeyFactory p;
    private final PlatformBitmapFactory q;
    private final int r;
    private final int s;
    private boolean t;
    private final int u;

    public final k newDataFetchProducer() {
        return new k(this.k);
    }

    public final x newLocalAssetFetchProducer() {
        return new x(this.j.forLocalStorageRead(), this.k, this.f23919c);
    }

    public final y newLocalContentUriFetchProducer() {
        return new y(this.j.forLocalStorageRead(), this.k, this.f23917a);
    }

    public final z newLocalContentUriThumbnailFetchProducer() {
        return new z(this.j.forLocalStorageRead(), this.k, this.f23917a);
    }

    public final aa newLocalExifThumbnailProducer() {
        return new aa(this.j.forLocalStorageRead(), this.k, this.f23917a);
    }

    public final ac newLocalFileFetchProducer() {
        return new ac(this.j.forLocalStorageRead(), this.k);
    }

    public final ad newLocalResourceFetchProducer() {
        return new ad(this.j.forLocalStorageRead(), this.k, this.f23918b);
    }

    public final ae newLocalVideoThumbnailProducer() {
        return new ae(this.j.forLocalStorageRead(), this.f23917a);
    }

    public final ap newQualifiedResourceFetchProducer() {
        return new ap(this.j.forLocalStorageRead(), this.k, this.f23917a);
    }

    public static com.facebook.imagepipeline.producers.a newAddImageTransformMetaDataProducer(al<b> alVar) {
        return new com.facebook.imagepipeline.producers.a(alVar);
    }

    public static <T> au<T> newSwallowResultProducer(al<T> alVar) {
        return new au<>(alVar);
    }

    public final g newBitmapMemoryCacheKeyMultiplexProducer(al<CloseableReference<CloseableImage>> alVar) {
        return new g(this.p, alVar);
    }

    public final q newEncodedCacheKeyMultiplexProducer(al<b> alVar) {
        return new q(this.p, alVar);
    }

    public final ay newThumbnailBranchProducer(az<b>[] azVarArr) {
        return new ay(azVarArr);
    }

    public final com.facebook.imagepipeline.producers.f newBitmapMemoryCacheGetProducer(al<CloseableReference<CloseableImage>> alVar) {
        return new com.facebook.imagepipeline.producers.f(this.o, this.p, alVar);
    }

    public final com.facebook.imagepipeline.producers.h newBitmapMemoryCacheProducer(al<CloseableReference<CloseableImage>> alVar) {
        return new com.facebook.imagepipeline.producers.h(this.o, this.p, alVar);
    }

    public final i newBitmapPrepareProducer(al<CloseableReference<CloseableImage>> alVar) {
        return new i(alVar, this.r, this.s, this.t);
    }

    public final com.facebook.imagepipeline.producers.n newDiskCacheReadProducer(al<b> alVar) {
        return new com.facebook.imagepipeline.producers.n(this.l, this.m, this.p, alVar);
    }

    public final o newDiskCacheWriteProducer(al<b> alVar) {
        return new o(this.l, this.m, this.p, alVar);
    }

    public final r newEncodedMemoryCacheProducer(al<b> alVar) {
        return new r(this.n, this.p, alVar);
    }

    public final ag newNetworkFetchProducer(ah ahVar) {
        return new ag(this.k, this.f23920d, ahVar);
    }

    public final ai newPartialDiskCacheProducer(al<b> alVar) {
        ai aiVar = new ai(this.l, this.p, this.k, this.f23920d, alVar);
        return aiVar;
    }

    public final aj newPostprocessorBitmapMemoryCacheProducer(al<CloseableReference<CloseableImage>> alVar) {
        return new aj(this.o, this.p, alVar);
    }

    public final ak newPostprocessorProducer(al<CloseableReference<CloseableImage>> alVar) {
        return new ak(alVar, this.q, this.j.forBackgroundTasks());
    }

    public final <T> ax<T> newThrottlingProducer(al<T> alVar) {
        return new ax<>(5, this.j.forLightweightBackgroundTasks(), alVar);
    }

    public final bb newWebpTranscodeProducer(al<b> alVar) {
        return new bb(this.j.forBackgroundTasks(), this.k, alVar);
    }

    public final l newDecodeProducer(al<b> alVar) {
        l lVar = new l(this.f23920d, this.j.forDecode(), this.f23921e, this.f23922f, this.g, this.h, this.i, alVar, this.u);
        return lVar;
    }

    public static j newBranchOnSeparateImagesProducer(al<b> alVar, al<b> alVar2) {
        return new j(alVar, alVar2);
    }

    public final <T> av<T> newBackgroundThreadHandoffProducer(al<T> alVar, aw awVar) {
        return new av<>(alVar, awVar);
    }

    public final ar newResizeAndRotateProducer(al<b> alVar, boolean z, com.facebook.imagepipeline.transcoder.c cVar) {
        ar arVar = new ar(this.j.forBackgroundTasks(), this.k, alVar, z, cVar);
        return arVar;
    }

    public h(Context context, a aVar, c cVar, e eVar, boolean z, boolean z2, boolean z3, ExecutorSupplier executorSupplier, f fVar, n<CacheKey, CloseableImage> nVar, n<CacheKey, com.facebook.common.memory.e> nVar2, com.facebook.imagepipeline.cache.e eVar2, com.facebook.imagepipeline.cache.e eVar3, CacheKeyFactory cacheKeyFactory, PlatformBitmapFactory platformBitmapFactory, int i2, int i3, boolean z4, int i4) {
        this.f23917a = context.getApplicationContext().getContentResolver();
        this.f23918b = context.getApplicationContext().getResources();
        this.f23919c = context.getApplicationContext().getAssets();
        this.f23920d = aVar;
        this.f23921e = cVar;
        this.f23922f = eVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = executorSupplier;
        this.k = fVar;
        this.o = nVar;
        this.n = nVar2;
        this.l = eVar2;
        this.m = eVar3;
        this.p = cacheKeyFactory;
        this.q = platformBitmapFactory;
        this.r = i2;
        this.s = i3;
        this.t = z4;
        this.u = i4;
    }
}
