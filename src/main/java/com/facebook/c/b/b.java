package com.facebook.c.b;

import com.facebook.c.b.a.d;
import com.facebook.c.b.a.e;
import com.facebook.c.b.a.g;
import com.facebook.c.c.c;
import java.util.Comparator;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<b> f23327a = new Comparator<b>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((b) obj).f23328b.compareTo(((b) obj2).f23328b);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public final C0250b f23328b;

    /* renamed from: c  reason: collision with root package name */
    public final List<c> f23329c;

    /* renamed from: d  reason: collision with root package name */
    public final float[][][] f23330d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public final float[] f23331e;

    /* renamed from: f  reason: collision with root package name */
    public final e f23332f;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public C0250b f23333a;

        /* renamed from: b  reason: collision with root package name */
        public List<c> f23334b;

        /* renamed from: c  reason: collision with root package name */
        public float[][][] f23335c;

        /* renamed from: d  reason: collision with root package name */
        public float[] f23336d;
    }

    /* renamed from: com.facebook.c.b.b$b  reason: collision with other inner class name */
    public enum C0250b {
        SCALE(true),
        ROTATION(true),
        POSITION(true),
        X_POSITION(true),
        Y_POSITION(true),
        ANCHOR_POINT(false),
        STROKE_WIDTH(false);
        
        final boolean mIsMatrixBased;

        public final boolean isMatrixBased() {
            return this.mIsMatrixBased;
        }

        private C0250b(boolean z) {
            this.mIsMatrixBased = z;
        }
    }

    public b(C0250b bVar, List<c> list, float[][][] fArr, float[] fArr2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (bVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.f23328b = (C0250b) c.a(bVar, z, "property");
        List a2 = com.facebook.c.c.e.a(list);
        if (list == null || list.size() <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f23329c = (List) c.a(a2, z2, "key_values");
        this.f23330d = (float[][][]) c.a(fArr, c.a(fArr, this.f23329c.size()), "timing_curves");
        if (fArr2 == null || fArr2.length == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f23331e = (float[]) c.a(fArr2, z3, "anchor");
        if (this.f23328b.isMatrixBased()) {
            if (this.f23328b.isMatrixBased()) {
                this.f23332f = new d(this.f23329c, this.f23330d, this.f23328b, this.f23331e);
                return;
            }
            throw new IllegalArgumentException("Cannot create a KeyFramedMatrixAnimation from a non matrix based KFAnimation.");
        } else if (this.f23328b == C0250b.STROKE_WIDTH) {
            if (this.f23328b == C0250b.STROKE_WIDTH) {
                this.f23332f = new g(this.f23329c, this.f23330d);
                return;
            }
            throw new IllegalArgumentException("Cannot create a KeyFramedStrokeWidth object from a non STROKE_WIDTH animation.");
        } else if (this.f23328b == C0250b.ANCHOR_POINT) {
            float[] fArr3 = this.f23329c.get(0).f23337a;
            this.f23332f = new com.facebook.c.b.a.b(fArr3[0], fArr3[1]);
        } else {
            throw new IllegalArgumentException("Unknown property type for animation post processing: " + this.f23328b);
        }
    }
}
