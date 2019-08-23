package com.ss.android.ugc.aweme.common;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Vibrator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.common.a.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 52\u00020\u0001:\u0003567B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0002J\u001a\u0010*\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010\u001e2\u0006\u0010,\u001a\u00020-H\u0016J\u0006\u0010.\u001a\u00020&J\u0006\u0010/\u001a\u00020&J\u0012\u00100\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u00101\u001a\u00020&2\u0006\u00102\u001a\u000203H\u0002J\u0006\u00104\u001a\u00020&R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/ss/android/ugc/aweme/common/DouDetector;", "Landroid/hardware/SensorEventListener;", "context", "Landroid/content/Context;", "listener", "Lcom/ss/android/ugc/aweme/common/DouDetector$OnDouListener;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/common/DouDetector$OnDouListener;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "hasDou", "", "getHasDou", "()Z", "setHasDou", "(Z)V", "mAccel", "", "mAccelCurrent", "mBuffer", "Lcom/ss/android/ugc/aweme/common/DouDetector$RingBuffer;", "mEnable", "getMEnable", "setMEnable", "mLastShakeTime", "", "mLastTime", "mListener", "mSensor", "Landroid/hardware/Sensor;", "mSensorManager", "Landroid/hardware/SensorManager;", "mVibrator", "Landroid/os/Vibrator;", "shakeDetector", "Lcom/ss/android/ugc/aweme/common/detector/ShakeDetector;", "ensureShakeDetector", "", "getCurrentAccelByType", "event", "Landroid/hardware/SensorEvent;", "onAccuracyChanged", "sensor", "accuracy", "", "onPause", "onResume", "onSensorChanged", "reportMobEvent", "from", "", "vibrate", "Companion", "OnDouListener", "RingBuffer", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class l implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40244a;
    public static float i;
    public static int j = 3;
    public static final a k = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f40245b = true;

    /* renamed from: c  reason: collision with root package name */
    public final SensorManager f40246c;

    /* renamed from: d  reason: collision with root package name */
    public Sensor f40247d;

    /* renamed from: e  reason: collision with root package name */
    public final b f40248e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.common.a.a f40249f;
    public boolean g;
    @NotNull
    public Context h;
    private final Vibrator l;
    private long m;
    private long n;
    private final c o;
    private float p;
    private float q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/common/DouDetector$Companion;", "", "()V", "ACCEL_THRESHOLD", "", "getACCEL_THRESHOLD", "()F", "setACCEL_THRESHOLD", "(F)V", "MIN_SHAKE_COUNT", "", "getMIN_SHAKE_COUNT", "()I", "setMIN_SHAKE_COUNT", "(I)V", "SHAKE_DURATION", "SHAKE_TIMEOUT", "TAG", "", "TIME_INTERVAL", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/common/DouDetector$OnDouListener;", "", "onDou", "", "onFirstShake", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        boolean a();

        void b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000bJ\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/common/DouDetector$RingBuffer;", "", "mSize", "", "(I)V", "mAccelRing", "", "mIndex", "mStampRing", "", "add", "", "accel", "", "stamp", "", "clear", "levelReached", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40250a;

        /* renamed from: b  reason: collision with root package name */
        int f40251b;

        /* renamed from: c  reason: collision with root package name */
        final float[] f40252c = new float[this.f40254e];

        /* renamed from: d  reason: collision with root package name */
        final long[] f40253d = new long[this.f40254e];

        /* renamed from: e  reason: collision with root package name */
        int f40254e = 20;

        public c(int i) {
        }

        public final void a(float f2, long j) {
            this.f40252c[this.f40251b] = f2;
            this.f40253d[this.f40251b] = j;
            this.f40251b = (this.f40251b + 1) % this.f40254e;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onShake"}, k = 3, mv = {1, 1, 15})
    static final class d implements a.C0520a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40255a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f40256b;

        d(l lVar) {
            this.f40256b = lVar;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f40255a, false, 33288, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40255a, false, 33288, new Class[0], Void.TYPE);
                return;
            }
            b bVar = this.f40256b.f40248e;
            if (bVar != null && bVar.a()) {
                this.f40256b.c();
            }
            this.f40256b.a("shake");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f40258b;

        e(l lVar) {
            this.f40258b = lVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f40257a, false, 33289, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40257a, false, 33289, new Class[0], Void.TYPE);
                return;
            }
            SensorManager sensorManager = this.f40258b.f40246c;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f40258b);
            }
            com.ss.android.ugc.aweme.common.a.a aVar = this.f40258b.f40249f;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public final void onAccuracyChanged(@Nullable Sensor sensor, int i2) {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40244a, false, 33279, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40244a, false, 33279, new Class[0], Void.TYPE);
            return;
        }
        if (this.f40249f == null && v.a()) {
            this.f40249f = new com.ss.android.ugc.aweme.common.a.a(this.h, new d(this));
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f40244a, false, 33282, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40244a, false, 33282, new Class[0], Void.TYPE);
        } else if (this.f40247d != null) {
            com.ss.android.b.a.a.a.b(new e(this));
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f40244a, false, 33284, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40244a, false, 33284, new Class[0], Void.TYPE);
            return;
        }
        Vibrator vibrator = this.l;
        if (vibrator != null) {
            vibrator.vibrate(500);
        }
    }

    static {
        float f2;
        if (PatchProxy.isSupport(new Object[0], null, k.f40232a, true, 33274, new Class[0], Float.TYPE)) {
            f2 = ((Float) PatchProxy.accessDispatch(new Object[0], null, k.f40232a, true, 33274, new Class[0], Float.TYPE)).floatValue();
        } else {
            f2 = (float) com.ss.android.ugc.aweme.aj.b.b().b((Context) k.a(), "douyidou_threshold", 7);
        }
        i = f2;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f40244a, false, 33280, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f40244a, false, 33280, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a("triger_dou", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", str2).f34114b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c0, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSensorChanged(@org.jetbrains.annotations.Nullable android.hardware.SensorEvent r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f40244a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.hardware.SensorEvent> r1 = android.hardware.SensorEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 33283(0x8203, float:4.664E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f40244a
            r3 = 0
            r4 = 33283(0x8203, float:4.664E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.hardware.SensorEvent> r1 = android.hardware.SensorEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            r18.a()
            com.ss.android.ugc.aweme.common.a.a r0 = r7.f40249f
            if (r0 == 0) goto L_0x004e
            com.ss.android.ugc.aweme.common.a.a r0 = r7.f40249f
            if (r0 == 0) goto L_0x004e
            boolean r0 = r0.g
            if (r0 != 0) goto L_0x004e
            com.ss.android.ugc.aweme.common.a.a r0 = r7.f40249f
            if (r0 == 0) goto L_0x004e
            r0.a()
        L_0x004e:
            com.ss.android.ugc.aweme.common.a.a r0 = r7.f40249f
            if (r0 == 0) goto L_0x0056
            boolean r1 = r7.f40245b
            r0.f40153b = r1
        L_0x0056:
            if (r8 == 0) goto L_0x01eb
            boolean r0 = r7.f40245b
            if (r0 != 0) goto L_0x005e
            goto L_0x01eb
        L_0x005e:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.m
            long r0 = r0 - r2
            r2 = 50
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x01ea
            long r0 = java.lang.System.currentTimeMillis()
            r7.m = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f40244a
            r3 = 0
            r4 = 33285(0x8205, float:4.6642E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.hardware.SensorEvent> r1 = android.hardware.SensorEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f40244a
            r3 = 0
            r4 = 33285(0x8205, float:4.6642E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.hardware.SensorEvent> r1 = android.hardware.SensorEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0110
        L_0x00a3:
            float r0 = r7.q
            float[] r1 = r8.values
            r1 = r1[r10]
            float[] r2 = r8.values
            r2 = r2[r9]
            float[] r3 = r8.values
            r4 = 2
            r3 = r3[r4]
            android.hardware.Sensor r4 = r8.sensor
            java.lang.String r5 = "event.sensor"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            int r4 = r4.getType()
            r5 = 4
            r6 = 1063675494(0x3f666666, float:0.9)
            if (r4 != r5) goto L_0x00d9
            r7.q = r2
            float r1 = r7.q
            float r1 = r1 - r0
            float r0 = r7.p
            float r0 = r0 * r6
            float r0 = r0 + r1
            r7.p = r0
            com.ss.android.ugc.aweme.common.l$c r0 = r7.o
            float r1 = r7.p
            long r2 = r7.m
            r0.a(r1, r2)
            goto L_0x0110
        L_0x00d9:
            float r4 = java.lang.Math.abs(r3)
            r5 = 1084227584(0x40a00000, float:5.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00eb
            float r4 = java.lang.Math.abs(r2)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x00fb
        L_0x00eb:
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0110
            float r2 = java.lang.Math.abs(r3)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0110
        L_0x00fb:
            r7.q = r1
            float r1 = r7.q
            float r1 = r1 - r0
            float r0 = r7.p
            float r0 = r0 * r6
            float r0 = r0 + r1
            r7.p = r0
            com.ss.android.ugc.aweme.common.l$c r0 = r7.o
            float r1 = r7.p
            long r2 = r7.m
            r0.a(r1, r2)
        L_0x0110:
            long r0 = r7.m
            long r2 = r7.n
            long r0 = r0 - r2
            r2 = 2000(0x7d0, double:9.88E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x011c
            return
        L_0x011c:
            float r0 = r7.p
            float r0 = java.lang.Math.abs(r0)
            float r1 = i
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            r2 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0144
            long r0 = r7.n
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0137
            boolean r0 = r7.g
            if (r0 == 0) goto L_0x0144
        L_0x0137:
            com.ss.android.ugc.aweme.common.l$b r0 = r7.f40248e
            if (r0 == 0) goto L_0x013e
            r0.b()
        L_0x013e:
            r7.g = r10
            r0 = 1
            r7.n = r0
        L_0x0144:
            float r0 = r7.p
            float r0 = java.lang.Math.abs(r0)
            float r1 = i
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ea
            com.ss.android.ugc.aweme.common.l$c r0 = r7.o
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.common.l.c.f40250a
            r14 = 0
            r15 = 33287(0x8207, float:4.6645E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0181
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.common.l.c.f40250a
            r14 = 0
            r15 = 33287(0x8207, float:4.6645E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x01c1
        L_0x0181:
            int r1 = r0.f40251b
            int r4 = r0.f40254e
            r5 = r1
            r1 = 0
            r6 = 0
            r8 = 1
        L_0x0189:
            if (r1 >= r4) goto L_0x01c0
            int r5 = r5 + -1
            if (r5 >= 0) goto L_0x0192
            int r5 = r0.f40254e
            int r5 = r5 - r9
        L_0x0192:
            long[] r11 = r0.f40253d
            r12 = r11[r5]
            int r11 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x01c0
            float[] r11 = r0.f40252c
            r11 = r11[r5]
            float r12 = java.lang.Math.abs(r11)
            float r13 = i
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 < 0) goto L_0x01bd
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x01af
            r11 = 1
            goto L_0x01b0
        L_0x01af:
            r11 = 0
        L_0x01b0:
            if (r6 == 0) goto L_0x01b4
            if (r11 == r8) goto L_0x01b7
        L_0x01b4:
            int r6 = r6 + 1
            r8 = r11
        L_0x01b7:
            int r11 = j
            if (r6 < r11) goto L_0x01bd
            r0 = 1
            goto L_0x01c1
        L_0x01bd:
            int r1 = r1 + 1
            goto L_0x0189
        L_0x01c0:
            r0 = 0
        L_0x01c1:
            if (r0 == 0) goto L_0x01ea
            com.ss.android.ugc.aweme.common.l$c r0 = r7.o
            r0.f40251b = r10
            int r1 = r0.f40254e
        L_0x01c9:
            if (r10 >= r1) goto L_0x01d2
            long[] r4 = r0.f40253d
            r4[r10] = r2
            int r10 = r10 + 1
            goto L_0x01c9
        L_0x01d2:
            long r0 = r7.m
            r7.n = r0
            com.ss.android.ugc.aweme.common.l$b r0 = r7.f40248e
            if (r0 == 0) goto L_0x01e3
            boolean r0 = r0.a()
            if (r0 != r9) goto L_0x01e3
            r18.c()
        L_0x01e3:
            java.lang.String r0 = "dou"
            r7.a(r0)
            r7.g = r9
        L_0x01ea:
            return
        L_0x01eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.l.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public l(@NotNull Context context, @Nullable b bVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.h = context;
        this.f40248e = bVar;
        this.o = new c(20);
        Object systemService = this.h.getSystemService("sensor");
        if (systemService != null) {
            this.f40246c = (SensorManager) systemService;
            if (k.a(this.h)) {
                this.f40247d = this.f40246c.getDefaultSensor(4);
            } else {
                this.f40247d = this.f40246c.getDefaultSensor(1);
                i = 3.0f;
                j = 3;
            }
            Object systemService2 = this.h.getSystemService("vibrator");
            if (systemService2 != null) {
                this.l = (Vibrator) systemService2;
                a();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.os.Vibrator");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
    }
}
