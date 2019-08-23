package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.annotation.RawRes;
import android.support.annotation.RestrictTo;
import android.support.annotation.WorkerThread;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.SparseArrayCompat;
import android.util.JsonReader;
import com.airbnb.lottie.c.c;
import com.airbnb.lottie.c.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public class LottieComposition {
    private Rect bounds;
    private SparseArrayCompat<d> characters;
    private float endFrame;
    private Map<String, c> fonts;
    private float frameRate;
    private Map<String, g> images;
    private LongSparseArray<com.airbnb.lottie.c.c.d> layerMap;
    private List<com.airbnb.lottie.c.c.d> layers;
    private final m performanceTracker = new m();
    private Map<String, List<com.airbnb.lottie.c.c.d>> precomps;
    private float startFrame;
    private final HashSet<String> warnings = new HashSet<>();

    @Deprecated
    public static class Factory {

        static final class a implements a, h<LottieComposition> {

            /* renamed from: a  reason: collision with root package name */
            private final l f4536a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f4537b;

            private a(l lVar) {
                this.f4536a = lVar;
            }

            public final /* bridge */ /* synthetic */ void a(Object obj) {
                LottieComposition lottieComposition = (LottieComposition) obj;
                if (!this.f4537b) {
                    this.f4536a.a(lottieComposition);
                }
            }

            /* synthetic */ a(l lVar, byte b2) {
                this(lVar);
            }
        }

        private Factory() {
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromInputStreamSync(InputStream inputStream) {
            return (LottieComposition) f.a(inputStream, (String) null).f4882a;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromJsonSync(JsonReader jsonReader) throws IOException {
            return (LottieComposition) f.b(jsonReader, (String) null).f4882a;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromJsonSync(String str) {
            return (LottieComposition) f.a(str, (String) null).f4882a;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromFileSync(Context context, String str) {
            return (LottieComposition) f.c(context, str).f4882a;
        }

        @Deprecated
        public static a fromJsonReader(JsonReader jsonReader, l lVar) {
            a aVar = new a(lVar, (byte) 0);
            f.a(jsonReader, (String) null).a((h<T>) aVar);
            return aVar;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromJsonSync(Resources resources, JSONObject jSONObject) {
            return (LottieComposition) f.a(jSONObject.toString(), (String) null).f4882a;
        }

        @Deprecated
        public static a fromInputStream(InputStream inputStream, l lVar) {
            a aVar = new a(lVar, (byte) 0);
            f.a((String) null, (Callable<j<LottieComposition>>) new Callable<j<LottieComposition>>(inputStream, null) {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ InputStream f4830a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f4831b;

                public final /* synthetic */ Object call() throws Exception {
                    return f.a(this.f4830a, this.f4831b);
                }

                {
                    this.f4830a = r1;
                    this.f4831b = r2;
                }
            }).a((h<T>) aVar);
            return aVar;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromInputStreamSync(InputStream inputStream, boolean z) {
            return (LottieComposition) f.a(inputStream, (String) null).f4882a;
        }

        @Deprecated
        public static a fromJsonString(String str, l lVar) {
            a aVar = new a(lVar, (byte) 0);
            f.a((String) null, (Callable<j<LottieComposition>>) new Callable<j<LottieComposition>>(str, null) {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f4832a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f4833b;

                public final /* synthetic */ Object call() throws Exception {
                    return f.a(this.f4832a, this.f4833b);
                }

                {
                    this.f4832a = r1;
                    this.f4833b = r2;
                }
            }).a((h<T>) aVar);
            return aVar;
        }

        @Deprecated
        public static a fromAssetFileName(Context context, String str, l lVar) {
            a aVar = new a(lVar, (byte) 0);
            f.b(context, str).a((h<T>) aVar);
            return aVar;
        }

        @Deprecated
        public static a fromRawFile(Context context, @RawRes int i, l lVar) {
            a aVar = new a(lVar, (byte) 0);
            f.a(context, i).a((h<T>) aVar);
            return aVar;
        }
    }

    public Rect getBounds() {
        return this.bounds;
    }

    public SparseArrayCompat<d> getCharacters() {
        return this.characters;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public float getEndFrame() {
        return this.endFrame;
    }

    public Map<String, c> getFonts() {
        return this.fonts;
    }

    public float getFrameRate() {
        return this.frameRate;
    }

    public Map<String, g> getImages() {
        return this.images;
    }

    public List<com.airbnb.lottie.c.c.d> getLayers() {
        return this.layers;
    }

    public m getPerformanceTracker() {
        return this.performanceTracker;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public float getStartFrame() {
        return this.startFrame;
    }

    public float getDurationFrames() {
        return this.endFrame - this.startFrame;
    }

    public float getDuration() {
        return (float) ((long) ((getDurationFrames() / this.frameRate) * 1000.0f));
    }

    public boolean hasImages() {
        if (!this.images.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<String> getWarnings() {
        return new ArrayList<>(Arrays.asList(this.warnings.toArray(new String[this.warnings.size()])));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (com.airbnb.lottie.c.c.d a2 : this.layers) {
            sb.append(a2.a("\t"));
        }
        return sb.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void addWarning(String str) {
        this.warnings.add(str);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.performanceTracker.f4893a = z;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<com.airbnb.lottie.c.c.d> getPrecomps(String str) {
        return this.precomps.get(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public com.airbnb.lottie.c.c.d layerModelForId(long j) {
        return (com.airbnb.lottie.c.c.d) this.layerMap.get(j);
    }

    public void init(Rect rect, float f2, float f3, float f4, List<com.airbnb.lottie.c.c.d> list, LongSparseArray<com.airbnb.lottie.c.c.d> longSparseArray, Map<String, List<com.airbnb.lottie.c.c.d>> map, Map<String, g> map2, SparseArrayCompat<d> sparseArrayCompat, Map<String, c> map3) {
        this.bounds = rect;
        this.startFrame = f2;
        this.endFrame = f3;
        this.frameRate = f4;
        this.layers = list;
        this.layerMap = longSparseArray;
        this.precomps = map;
        this.images = map2;
        this.characters = sparseArrayCompat;
        this.fonts = map3;
    }
}
