package com.ss.android.medialib.presenter;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FaceBeautyInvoker;
import com.ss.android.medialib.a.a;
import com.ss.android.medialib.c.d;
import com.ss.android.medialib.camera.j;
import com.ss.android.medialib.common.a;
import com.ss.android.medialib.f;
import com.ss.android.medialib.log.IMonitor;
import com.ss.android.ttve.monitor.e;
import com.ss.android.vesdk.y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.libsdl.app.AudioRecorderInterface;
import org.libsdl.app.BufferedAudioRecorder;

public class MediaRecordPresenter implements a.C0354a, c, AudioRecorderInterface {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29728a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f29729b = "MediaRecordPresenter";
    private double A = -1.0d;
    private d B = new d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29742a;

        public final long a(boolean z) {
            long j;
            long j2;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f29742a, false, 17727, new Class[]{Boolean.TYPE}, Long.TYPE)) {
                return ((Long) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f29742a, false, 17727, new Class[]{Boolean.TYPE}, Long.TYPE)).longValue();
            }
            MediaRecordPresenter mediaRecordPresenter = MediaRecordPresenter.this;
            SurfaceTexture surfaceTexture = MediaRecordPresenter.this.l;
            if (PatchProxy.isSupport(new Object[]{surfaceTexture}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17680, new Class[]{SurfaceTexture.class}, Long.TYPE)) {
                Object[] objArr = {surfaceTexture};
                MediaRecordPresenter mediaRecordPresenter2 = mediaRecordPresenter;
                j = ((Long) PatchProxy.accessDispatch(objArr, mediaRecordPresenter2, MediaRecordPresenter.f29728a, false, 17680, new Class[]{SurfaceTexture.class}, Long.TYPE)).longValue();
            } else {
                long abs = Math.abs(System.nanoTime() - surfaceTexture.getTimestamp());
                if (Build.VERSION.SDK_INT >= 17) {
                    j2 = Math.abs(SystemClock.elapsedRealtimeNanos() - surfaceTexture.getTimestamp());
                } else {
                    j2 = Long.MAX_VALUE;
                }
                long abs2 = Math.abs((SystemClock.uptimeMillis() * 1000000) - surfaceTexture.getTimestamp());
                String str = MediaRecordPresenter.f29729b;
                y.b(str, "nano_time: " + abs + ",elapsed: " + j2 + " ,delta_uptime_nano: " + abs2);
                j = Math.min(Math.min(abs, j2), abs2);
            }
            final long j3 = j / 1000;
            if (MediaRecordPresenter.this.h != null && z) {
                MediaRecordPresenter.this.h.a("camera_offset", new com.ss.android.medialib.d.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f29744a;

                    public final void a(@NonNull Map<String, Object> map) {
                        if (PatchProxy.isSupport(new Object[]{map}, this, f29744a, false, 17728, new Class[]{Map.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{map}, this, f29744a, false, 17728, new Class[]{Map.class}, Void.TYPE);
                            return;
                        }
                        map.put("camera_offset", Long.valueOf(j3));
                        map.put("audio_type", Integer.valueOf(MediaRecordPresenter.this.f29732e));
                    }
                });
            }
            return j3;
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public BufferedAudioRecorder f29730c;

    /* renamed from: d  reason: collision with root package name */
    public String f29731d;

    /* renamed from: e  reason: collision with root package name */
    public int f29732e = 1;

    /* renamed from: f  reason: collision with root package name */
    public int f29733f = 18;
    public AudioRecorderInterface g;
    public com.ss.android.medialib.d.b h;
    public a i;
    public FaceBeautyInvoker j = new FaceBeautyInvoker();
    public boolean k = true;
    SurfaceTexture l;
    public boolean m = false;
    public SurfaceTexture.OnFrameAvailableListener n = new SurfaceTexture.OnFrameAvailableListener() {
        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        }
    };
    private long o;
    private long p;
    private boolean q;
    private boolean r;
    private AtomicBoolean s = new AtomicBoolean(false);
    private int t = -1;
    private boolean u = false;
    private boolean v = false;
    private float w = 1.0f;
    private boolean x = false;
    private volatile boolean y = false;
    private int z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AudioType {
    }

    public interface a {
        void a(com.ss.android.medialib.model.a aVar);

        boolean as_();
    }

    public interface b {
        void a(Bitmap bitmap, int i);
    }

    public interface c {
        void a(int i);

        void a(Bitmap bitmap);
    }

    public final MediaRecordPresenter a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f29728a, false, 17549, new Class[]{String.class}, MediaRecordPresenter.class)) {
            return (MediaRecordPresenter) PatchProxy.accessDispatch(new Object[]{str}, this, f29728a, false, 17549, new Class[]{String.class}, MediaRecordPresenter.class);
        }
        this.f29731d = str;
        this.j.changeMusicPath(str);
        return this;
    }

    public final MediaRecordPresenter a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29728a, false, 17550, new Class[]{Float.TYPE}, MediaRecordPresenter.class)) {
            return (MediaRecordPresenter) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29728a, false, 17550, new Class[]{Float.TYPE}, MediaRecordPresenter.class);
        }
        this.w = f2;
        this.j.setBGMVolume(f2);
        return this;
    }

    public final void a(String str, String str2, float f2, float f3, float f4, boolean z2) {
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{str, str3, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29728a, false, 17551, new Class[]{String.class, String.class, Float.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str3, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Byte.valueOf(z2)}, this, f29728a, false, 17551, new Class[]{String.class, String.class, Float.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j.initDuet(str, f2, f3, f4, z2);
        a(0, 0);
        a(str3);
        this.v = true;
    }

    public final void a(Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{runnable}, this, f29728a, false, 17555, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable}, this, f29728a, false, 17555, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        FaceBeautyInvoker.setDuetVideoCompleteCallback(runnable);
    }

    public final void a(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, this, f29728a, false, 17557, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, this, f29728a, false, 17557, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        this.j.initReaction(context2, str3, str4);
        a(0, 0);
        a(str4);
    }

    public final MediaRecordPresenter a(long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5)}, this, f29728a, false, 17559, new Class[]{Long.TYPE, Long.TYPE}, MediaRecordPresenter.class)) {
            return (MediaRecordPresenter) PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5)}, this, f29728a, false, 17559, new Class[]{Long.TYPE, Long.TYPE}, MediaRecordPresenter.class);
        }
        this.o = j4;
        this.p = j5;
        this.j.setMusicTime(this.o, this.p);
        return this;
    }

    public final void a(IMonitor iMonitor) {
        if (PatchProxy.isSupport(new Object[]{iMonitor}, this, f29728a, false, 17560, new Class[]{IMonitor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMonitor}, this, f29728a, false, 17560, new Class[]{IMonitor.class}, Void.TYPE);
        } else if (this.h == null) {
            this.h = new com.ss.android.medialib.d.b(iMonitor);
        }
    }

    public final int a(Context context, int i2, @Nullable AudioRecorderInterface audioRecorderInterface) {
        AudioRecorderInterface audioRecorderInterface2 = audioRecorderInterface;
        final int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i2), audioRecorderInterface2}, this, f29728a, false, 17564, new Class[]{Context.class, Integer.TYPE, AudioRecorderInterface.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i2), audioRecorderInterface2}, this, f29728a, false, 17564, new Class[]{Context.class, Integer.TYPE, AudioRecorderInterface.class}, Integer.TYPE)).intValue();
        }
        this.g = audioRecorderInterface2;
        if (context == null) {
            String str = f29729b;
            y.d(str, "file " + y.a() + ",fun " + y.c() + ",line " + y.b() + ": context is null");
            return -1000;
        }
        this.f29732e = i2;
        if (this.f29730c != null) {
            this.f29730c.unInit();
            y.a(f29729b, "initRecord: mAudioRecorder.unInit()");
        }
        if ((this.f29732e & 1) != 0) {
            this.f29730c = new BufferedAudioRecorder(this);
            this.f29730c.init(1);
        }
        if ((this.f29732e & 4) != 0 && !TextUtils.isEmpty(this.f29731d)) {
            this.j.setBGMVolume(this.w);
            i3 = this.j.initAudioPlayer(context, this.f29731d, this.o + this.p, this.r, this.x);
        }
        if (!(this.h == null || i3 == 0)) {
            this.h.a("record_init_record", new com.ss.android.medialib.d.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29734a;

                public final void a(@NonNull Map<String, Object> map) {
                    if (PatchProxy.isSupport(new Object[]{map}, this, f29734a, false, 17726, new Class[]{Map.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{map}, this, f29734a, false, 17726, new Class[]{Map.class}, Void.TYPE);
                        return;
                    }
                    map.put("ret", Integer.valueOf(i3));
                    map.put("audio_type", Integer.valueOf(MediaRecordPresenter.this.f29732e));
                }
            });
        }
        String str2 = f29729b;
        y.a(str2, "initRecord return: " + i3);
        return i3;
    }

    public final int a(int i2, int i3, String str, int i4, int i5, String str2, int i6, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, Integer.valueOf(i4), Integer.valueOf(i5), str2, Integer.valueOf(i6), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29728a, false, 17567, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str, Integer.valueOf(i4), Integer.valueOf(i5), str2, Integer.valueOf(i6), Byte.valueOf(z2)}, this, f29728a, false, 17567, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        y.b(f29729b, "init enter ");
        f.a().f29653b = this.j;
        e.d(0);
        e.c(0);
        final int initFaceBeautyPlay = this.j.initFaceBeautyPlay(i2, i3, str, i4, i5, str2, i6, z2);
        this.j.setTextureTimeListener(this.B);
        FaceBeautyInvoker.setRecordStopCallback(new FaceBeautyInvoker.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f29762a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f29762a, false, 17735, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f29762a, false, 17735, new Class[0], Void.TYPE);
                    return;
                }
                if (MediaRecordPresenter.this.f29730c != null) {
                    MediaRecordPresenter.this.f29730c.markRecordStop();
                }
            }
        });
        if (!(this.h == null || initFaceBeautyPlay == 0)) {
            this.h.a("record_init_fb", new com.ss.android.medialib.d.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29764a;

                public final void a(@NonNull Map<String, Object> map) {
                    Map<String, Object> map2 = map;
                    if (PatchProxy.isSupport(new Object[]{map2}, this, f29764a, false, 17736, new Class[]{Map.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{map2}, this, f29764a, false, 17736, new Class[]{Map.class}, Void.TYPE);
                        return;
                    }
                    map2.put("ret", Integer.valueOf(initFaceBeautyPlay));
                }
            });
        }
        String str3 = f29729b;
        y.b(str3, "init ret = " + initFaceBeautyPlay);
        return initFaceBeautyPlay;
    }

    public final int[] a(int i2, int i3, int i4, int i5) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f29728a, false, 17570, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, int[].class)) {
            return this.j.updateReactionCameraPos(i2, i3, i4, i5);
        }
        return (int[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f29728a, false, 17570, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, int[].class);
    }

    public final int[] a(int i2, int i3, int i4, int i5, float f2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(f2)}, this, f29728a, false, 17576, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE}, int[].class)) {
            return this.j.updateReactionCameraPosWithRotation(i2, i3, i4, i5, f2);
        }
        return (int[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(f2)}, this, f29728a, false, 17576, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE}, int[].class);
    }

    public final boolean a(String str, boolean z2) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29728a, false, 17577, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return this.j.setReactionMaskImage(str2, z2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z2)}, this, f29728a, false, 17577, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29728a, false, 17578, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29728a, false, 17578, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j.setReactionBorderParam(i2, i3);
    }

    public final void b(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f29728a, false, 17580, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f29728a, false, 17580, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j.setReactionPosMargin(i2, i3, i4, i5);
    }

    public final int a(int i2, String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2}, this, f29728a, false, 17584, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)) {
            return this.j.tryRestore(i2, str2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2}, this, f29728a, false, 17584, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)).intValue();
    }

    public final int a(int i2, float[] fArr) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), fArr}, this, f29728a, false, 17585, new Class[]{Integer.TYPE, float[].class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), fArr}, this, f29728a, false, 17585, new Class[]{Integer.TYPE, float[].class}, Integer.TYPE)).intValue();
        }
        if (!(this.n == null || this.l == null)) {
            this.n.onFrameAvailable(this.l);
        }
        return this.j.onDrawFrame(i2, fArr);
    }

    public final void a(int i2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29728a, false, 17586, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2)}, this, f29728a, false, 17586, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j.updateRotation((this.z + i2) % 360, z2);
    }

    public final void a(float f2, float f3, float f4) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(f4)}, this, f29728a, false, 17588, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(f4)}, this, f29728a, false, 17588, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.j.updateRotation(0.0f, 0.0f, f4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(byte[] r19, int r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r10 = 1
            r2[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f29728a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r10] = r3
            java.lang.Class r8 = java.lang.Integer.TYPE
            r5 = 0
            r6 = 17603(0x44c3, float:2.4667E-41)
            r3 = r18
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0052
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = f29728a
            r14 = 0
            r15 = 17603(0x44c3, float:2.4667E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r18
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0052:
            java.lang.String r1 = f29729b
            java.lang.String r2 = "onProcessData is running"
            com.ss.android.vesdk.y.b(r1, r2)
            r1 = r18
            com.ss.android.medialib.FaceBeautyInvoker r2 = r1.j
            r3 = r20
            int r0 = r2.addPCMData(r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.presenter.MediaRecordPresenter.a(byte[], int):int");
    }

    public final int a(Surface surface, String str) {
        if (PatchProxy.isSupport(new Object[]{surface, str}, this, f29728a, false, 17614, new Class[]{Surface.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{surface, str}, this, f29728a, false, 17614, new Class[]{Surface.class, String.class}, Integer.TYPE)).intValue();
        }
        if (PatchProxy.isSupport(new Object[]{surface, str, -1, -1}, this, f29728a, false, 17619, new Class[]{Surface.class, String.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{surface, str, -1, -1}, this, f29728a, false, 17619, new Class[]{Surface.class, String.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        y.b("MediaPresenter", "Start Play >>> ");
        final int startPlay = this.j.startPlay(surface, str, this.q, -1, -1);
        if (!(this.h == null || startPlay == 0)) {
            this.h.a("record_start_play", new com.ss.android.medialib.d.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29773a;

                public final void a(@NonNull Map<String, Object> map) {
                    Map<String, Object> map2 = map;
                    if (PatchProxy.isSupport(new Object[]{map2}, this, f29773a, false, 17738, new Class[]{Map.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{map2}, this, f29773a, false, 17738, new Class[]{Map.class}, Void.TYPE);
                        return;
                    }
                    map2.put("ret", Integer.valueOf(startPlay));
                }
            });
        }
        y.b("MediaPresenter", "Start Play ret = " + startPlay);
        return startPlay;
    }

    public final int a(Surface surface) {
        Surface surface2 = surface;
        if (!PatchProxy.isSupport(new Object[]{surface2}, this, f29728a, false, 17616, new Class[]{Surface.class}, Integer.TYPE)) {
            return this.j.changeSurface(surface2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{surface2}, this, f29728a, false, 17616, new Class[]{Surface.class}, Integer.TYPE)).intValue();
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29728a, false, 17621, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29728a, false, 17621, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.j.setPreviewSizeRatio(f2);
    }

    public final void b(int i2, String str) {
        int i3 = i2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2}, this, f29728a, false, 17629, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2}, this, f29728a, false, 17629, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        String str3 = f29729b;
        y.b(str3, "nativeSetBeautyFace: " + i3);
        this.j.setBeautyFace(i3, str2);
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f29728a, false, 17630, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f29728a, false, 17630, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.j.setBeautyFaceIntensity(f2, f3);
    }

    public final int a(String str, float f2, float f3) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2, Float.valueOf(f2), Float.valueOf(f3)}, this, f29728a, false, 17633, new Class[]{String.class, Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            return this.j.setReshape(str2, f2, f3);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Float.valueOf(f2), Float.valueOf(f3)}, this, f29728a, false, 17633, new Class[]{String.class, Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f29728a, false, 17642, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f29728a, false, 17642, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.j.setNativeLibraryDir(context.getApplicationInfo().nativeLibraryDir);
    }

    public final void a(String str, Map<Integer, Float> map) {
        if (PatchProxy.isSupport(new Object[]{str, map}, this, f29728a, false, 17648, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, map}, this, f29728a, false, 17648, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str}, this, f29728a, false, 17646, new Class[]{String.class}, Integer.TYPE)) {
            ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f29728a, false, 17646, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else {
            this.j.setReshapeResource(str);
        }
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                b(((Integer) next.getKey()).intValue(), ((Float) next.getValue()).floatValue());
            }
        }
    }

    public final int a(String str, int i2, int i3, boolean z2) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29728a, false, 17649, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return this.j.setStickerPath(str2, i2, i3, z2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z2)}, this, f29728a, false, 17649, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
    }

    public final void a(String str, String str2, float f2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Float.valueOf(f2)}, this, f29728a, false, 17651, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Float.valueOf(f2)}, this, f29728a, false, 17651, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE);
            return;
        }
        this.j.setFilter(str3, str4, f2);
    }

    public final void a(a.C0357a aVar) {
        a.C0357a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f29728a, false, 17655, new Class[]{a.C0357a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f29728a, false, 17655, new Class[]{a.C0357a.class}, Void.TYPE);
            return;
        }
        this.j.setOnOpenGLCallback(aVar2);
    }

    public final int a(String str, int[] iArr, boolean z2, Bitmap.CompressFormat compressFormat, a.b bVar) {
        int i2;
        final String str2 = str;
        final Bitmap.CompressFormat compressFormat2 = compressFormat;
        if (PatchProxy.isSupport(new Object[]{str2, iArr, Byte.valueOf(z2 ? (byte) 1 : 0), compressFormat2, bVar}, this, f29728a, false, 17658, new Class[]{String.class, int[].class, Boolean.TYPE, Bitmap.CompressFormat.class, a.b.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, iArr, Byte.valueOf(z2), compressFormat2, bVar}, this, f29728a, false, 17658, new Class[]{String.class, int[].class, Boolean.TYPE, Bitmap.CompressFormat.class, a.b.class}, Integer.TYPE)).intValue();
        }
        if (compressFormat2 == Bitmap.CompressFormat.JPEG) {
            i2 = 1;
        } else {
            i2 = compressFormat2 == Bitmap.CompressFormat.PNG ? 0 : -1;
        }
        return this.j.shotScreen(str, iArr, z2, i2, new FaceBeautyInvoker.OnPictureCallback() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f29737a;

            public final void onResult(int[] iArr, int i, int i2) {
                Object obj = iArr;
                if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)}, this, f29737a, false, 17739, new Class[]{int[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)}, this, f29737a, false, 17739, new Class[]{int[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                int i3 = i;
                Bitmap createBitmap = Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
                com.ss.android.medialib.common.b.a(createBitmap, str2, compressFormat2);
                if (createBitmap != null) {
                    createBitmap.recycle();
                }
            }
        }, bVar);
    }

    public final int a(String str, int i2, int i3, String str2) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i2), Integer.valueOf(i3), str4}, this, f29728a, false, 17672, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class}, Integer.TYPE)) {
            return this.j.slamSetInputText(str3, i2, i3, str4);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i2), Integer.valueOf(i3), str4}, this, f29728a, false, 17672, new Class[]{String.class, Integer.TYPE, Integer.TYPE, String.class}, Integer.TYPE)).intValue();
    }

    public final int a(FaceBeautyInvoker.OnARTextCountCallback onARTextCountCallback) {
        FaceBeautyInvoker.OnARTextCountCallback onARTextCountCallback2 = onARTextCountCallback;
        if (!PatchProxy.isSupport(new Object[]{onARTextCountCallback2}, this, f29728a, false, 17675, new Class[]{FaceBeautyInvoker.OnARTextCountCallback.class}, Integer.TYPE)) {
            return this.j.slamGetTextLimitCount(onARTextCountCallback2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{onARTextCountCallback2}, this, f29728a, false, 17675, new Class[]{FaceBeautyInvoker.OnARTextCountCallback.class}, Integer.TYPE)).intValue();
    }

    public final int a(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (!PatchProxy.isSupport(new Object[]{bitmap2}, this, f29728a, false, 17682, new Class[]{Bitmap.class}, Integer.TYPE)) {
            return this.j.setSlamFace(bitmap2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{bitmap2}, this, f29728a, false, 17682, new Class[]{Bitmap.class}, Integer.TYPE)).intValue();
    }

    public final int a(j jVar) {
        if (PatchProxy.isSupport(new Object[]{jVar}, this, f29728a, false, 17691, new Class[]{j.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{jVar}, this, f29728a, false, 17691, new Class[]{j.class}, Integer.TYPE)).intValue();
        }
        if (!(this.n == null || this.l == null)) {
            this.n.onFrameAvailable(this.l);
        }
        return this.j.onDrawFrame(jVar);
    }

    public final void a(int i2, long j2, long j3, String str) {
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j4), 0L, str}, this, f29728a, false, 17692, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i2), new Long(j4), 0L, str};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f29728a, false, 17692, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.j.sendEffectMsg(i2, j2, 0, str);
    }

    public final void a(boolean z2, long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), new Long(j3)}, this, f29728a, false, 17704, new Class[]{Boolean.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), new Long(j3)}, this, f29728a, false, 17704, new Class[]{Boolean.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        this.j.enableScan(z2, j3);
    }

    public final void a(a aVar) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f29728a, false, 17710, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f29728a, false, 17710, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.i = aVar;
        FaceBeautyInvoker faceBeautyInvoker = this.j;
        AnonymousClass5 r1 = this.n == null ? null : new FaceBeautyInvoker.OnFrameCallback() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f29759a;

            /* renamed from: b  reason: collision with root package name */
            com.ss.android.medialib.model.a f29760b = new com.ss.android.medialib.model.a();

            public final void onFrame(int i, double d2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, f29759a, false, 17734, new Class[]{Integer.TYPE, Double.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, f29759a, false, 17734, new Class[]{Integer.TYPE, Double.TYPE}, Void.TYPE);
                    return;
                }
                this.f29760b.f29701b = i;
                this.f29760b.f29705f = (long) d2;
                if (MediaRecordPresenter.this.i != null) {
                    MediaRecordPresenter.this.i.a(this.f29760b);
                }
            }

            public final void onInit(EGLContext eGLContext, int i, int i2, int i3, long j) {
                this.f29760b.f29700a = eGLContext;
                this.f29760b.f29702c = i;
                this.f29760b.f29703d = i2;
                this.f29760b.f29704e = i3;
                this.f29760b.g = j;
            }
        };
        if (aVar == null || !aVar.as_()) {
            z2 = false;
        }
        faceBeautyInvoker.setFrameCallback(r1, z2);
    }

    public final void a(FaceBeautyInvoker.OnRunningErrorCallback onRunningErrorCallback) {
        FaceBeautyInvoker.OnRunningErrorCallback onRunningErrorCallback2 = onRunningErrorCallback;
        if (PatchProxy.isSupport(new Object[]{onRunningErrorCallback2}, this, f29728a, false, 17714, new Class[]{FaceBeautyInvoker.OnRunningErrorCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onRunningErrorCallback2}, this, f29728a, false, 17714, new Class[]{FaceBeautyInvoker.OnRunningErrorCallback.class}, Void.TYPE);
            return;
        }
        this.j.setRunningErrorCallback(onRunningErrorCallback2);
    }

    public final void a(com.ss.android.medialib.c.b bVar) {
        com.ss.android.medialib.c.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f29728a, false, 17716, new Class[]{com.ss.android.medialib.c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f29728a, false, 17716, new Class[]{com.ss.android.medialib.c.b.class}, Void.TYPE);
            return;
        }
        this.j.setNativeInitListener2(bVar2);
    }

    public final void a(@Nullable IStickerRequestCallback iStickerRequestCallback) {
        IStickerRequestCallback iStickerRequestCallback2 = iStickerRequestCallback;
        if (PatchProxy.isSupport(new Object[]{iStickerRequestCallback2}, this, f29728a, false, 17717, new Class[]{IStickerRequestCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iStickerRequestCallback2}, this, f29728a, false, 17717, new Class[]{IStickerRequestCallback.class}, Void.TYPE);
            return;
        }
        this.j.setStickerRequestCallback(iStickerRequestCallback2);
    }

    public final int a(@NonNull String str, @NonNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f29728a, false, 17725, new Class[]{String.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f29728a, false, 17725, new Class[]{String.class, String.class}, Integer.TYPE)).intValue();
        } else if (str4 != null) {
            return this.j.animateImageToPreview(str3, str4);
        } else {
            y.d(f29729b, "Illegal argument. imagePath can't be null. Consider using empty string to cancel.");
            return -100;
        }
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, f29728a, false, 17561, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17561, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.medialib.log.a.f29688b = null;
        this.h = null;
    }

    private boolean q() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f29728a, false, 17599, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17599, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f29730c != null && this.f29730c.isProcessing()) {
            z2 = true;
        }
        return z2;
    }

    private void r() {
        if (PatchProxy.isSupport(new Object[0], this, f29728a, false, 17625, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17625, new Class[0], Void.TYPE);
            return;
        }
        this.j.releaseEncoder();
    }

    public final float a() {
        if (!PatchProxy.isSupport(new Object[0], this, f29728a, false, 17573, new Class[0], Float.TYPE)) {
            return this.j.getReactionCamRotation();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17573, new Class[0], Float.TYPE)).floatValue();
    }

    public final int[] b() {
        if (!PatchProxy.isSupport(new Object[0], this, f29728a, false, 17579, new Class[0], int[].class)) {
            return this.j.getReactionPosMarginInViewPixel();
        }
        return (int[]) PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17579, new Class[0], int[].class);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f29728a, false, 17582, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17582, new Class[0], Void.TYPE);
            return;
        }
        this.j.uninitFaceBeautyPlay();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f29728a, false, 17591, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17591, new Class[0], Void.TYPE);
            return;
        }
        this.j.clearFragFile();
    }

    public final long e() {
        if (!PatchProxy.isSupport(new Object[0], this, f29728a, false, 17592, new Class[0], Long.TYPE)) {
            return this.j.getEndFrameTime();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17592, new Class[0], Long.TYPE)).longValue();
    }

    public final synchronized void g() {
        if (PatchProxy.isSupport(new Object[0], this, f29728a, false, 17597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17597, new Class[0], Void.TYPE);
            return;
        }
        l(false);
    }

    public final boolean h() {
        if (!PatchProxy.isSupport(new Object[0], this, f29728a, false, 17600, new Class[0], Boolean.TYPE)) {
            return this.s.get();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17600, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void i() {
        if (PatchProxy.isSupport(new Object[0], this, f29728a, false, 17606, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17606, new Class[0], Void.TYPE);
            return;
        }
        if (this.f29730c != null && q()) {
            this.f29730c.waitUtilAudioProcessDone();
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f29728a, false, 17612, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17612, new Class[0], Void.TYPE);
            return;
        }
        k();
        c();
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f29728a, false, 17613, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17613, new Class[0], Void.TYPE);
            return;
        }
        if (this.f29730c != null) {
            this.f29730c.unInit();
            this.f29730c = null;
        }
        p();
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f29728a, false, 17622, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17622, new Class[0], Void.TYPE);
            return;
        }
        d(true);
    }

    public void lackPermission() {
        if (PatchProxy.isSupport(new Object[0], this, f29728a, false, 17607, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17607, new Class[0], Void.TYPE);
            return;
        }
        AudioRecorderInterface audioRecorderInterface = this.g;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.lackPermission();
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f29728a, false, 17626, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17626, new Class[0], Void.TYPE);
            return;
        }
        if ((!this.v || this.k) && this.f29730c != null) {
            this.f29730c.startRecording(1.0d, false);
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f29728a, false, 17627, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17627, new Class[0], Void.TYPE);
            return;
        }
        if (this.f29730c != null) {
            this.f29730c.stopRecording();
        }
    }

    public final int o() {
        if (!PatchProxy.isSupport(new Object[0], this, f29728a, false, 17711, new Class[0], Integer.TYPE)) {
            return this.j.bindEffectAudioProcessor(0, 0, false);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17711, new Class[0], Integer.TYPE)).intValue();
    }

    public MediaRecordPresenter() {
        this.j.resetPerfStats();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f29728a, false, 17593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29728a, false, 17593, new Class[0], Void.TYPE);
            return;
        }
        synchronized (this) {
            if (q()) {
                y.d(f29729b, "Audio processing, will delete after nativeCloseWavFile");
                this.u = true;
                return;
            }
            y.a(f29729b, "Delete last frag now");
            this.j.deleteLastFrag();
        }
    }

    public final MediaRecordPresenter a(boolean z2) {
        this.r = z2;
        return this;
    }

    public final MediaRecordPresenter b(int i2) {
        this.f29733f = i2;
        return this;
    }

    public final void a(SurfaceTexture surfaceTexture) {
        this.l = surfaceTexture;
    }

    public final MediaRecordPresenter b(boolean z2) {
        this.x = z2;
        return this;
    }

    private synchronized int l(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f29728a, false, 17598, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f29728a, false, 17598, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (this.s.get()) {
            return -1;
        } else {
            this.s.getAndSet(true);
            int stopRecord = this.j.stopRecord(false);
            if (this.f29730c != null) {
                this.f29730c.stopFeeding();
            }
            this.s.getAndSet(false);
            e.b(0);
            return stopRecord;
        }
    }

    public final int a(double d2) {
        if (!PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, this, f29728a, false, 17587, new Class[]{Double.TYPE}, Integer.TYPE)) {
            return this.j.onDrawFrameTime(d2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, this, f29728a, false, 17587, new Class[]{Double.TYPE}, Integer.TYPE)).intValue();
    }

    public final int c(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29728a, false, 17644, new Class[]{Float.TYPE}, Integer.TYPE)) {
            return b(10, f2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29728a, false, 17644, new Class[]{Float.TYPE}, Integer.TYPE)).intValue();
    }

    public int closeWavFile(boolean z2) {
        int closeWavFile;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29728a, false, 17605, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29728a, false, 17605, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        synchronized (this) {
            closeWavFile = this.j.closeWavFile(z2);
            AudioRecorderInterface audioRecorderInterface = this.g;
            if (audioRecorderInterface != null) {
                audioRecorderInterface.closeWavFile(z2);
            }
            if (this.u) {
                this.j.deleteLastFrag();
            }
            this.u = false;
            y.a(f29729b, "closeWavFile");
        }
        return closeWavFile;
    }

    public final int d(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29728a, false, 17654, new Class[]{Float.TYPE}, Integer.TYPE)) {
            return b(12, f2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29728a, false, 17654, new Class[]{Float.TYPE}, Integer.TYPE)).intValue();
    }

    public final int e(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f29728a, false, 17709, new Class[]{String.class}, Integer.TYPE)) {
            return this.j.setMusicNodes(str2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f29728a, false, 17709, new Class[]{String.class}, Integer.TYPE)).intValue();
    }

    public final int f(boolean z2) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 1}, this, f29728a, false, 17673, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return this.j.slamNotifyHideKeyBoard(true);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f29728a, false, 17673, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
    }

    public final void g(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29728a, false, 17678, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29728a, false, 17678, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j.pauseEffectAudio(z2);
    }

    public final void h(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29728a, false, 17679, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29728a, false, 17679, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j.enableEffectBGM(z2);
    }

    public final void i(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29728a, false, 17685, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29728a, false, 17685, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j.enableEffect(z2);
    }

    public final int j(boolean z2) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29728a, false, 17688, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return this.j.setHandDetectLowpower(z2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29728a, false, 17688, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
    }

    public final void k(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29728a, false, 17689, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29728a, false, 17689, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j.useLargeMattingModel(z2);
    }

    public void recordStatus(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29728a, false, 17608, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29728a, false, 17608, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        AudioRecorderInterface audioRecorderInterface = this.g;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.recordStatus(z2);
        }
    }

    public final int b(Context context) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{context}, this, f29728a, false, 17712, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, this, f29728a, false, 17712, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            z2 = packageManager.hasSystemFeature("android.hardware.audio.low_latency");
        }
        String str = f29729b;
        y.b(str, "has low latency ? " + z2);
        Pair a2 = com.ss.android.medialib.f.d.a(context);
        String str2 = f29729b;
        y.b(str2, "nativeSampleRate ? " + a2.first + " nativeSamleBufferSize? " + a2.second);
        return this.j.bindEffectAudioProcessor(((Integer) a2.first).intValue(), ((Integer) a2.second).intValue(), true);
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{1}, this, f29728a, false, 17569, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{1}, this, f29728a, false, 17569, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j.setEffectBuildChainType(1);
    }

    public final int d(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f29728a, false, 17674, new Class[]{String.class}, Integer.TYPE)) {
            return this.j.slamSetLanguge(str2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f29728a, false, 17674, new Class[]{String.class}, Integer.TYPE)).intValue();
    }

    public final void e(int i2) {
        if (PatchProxy.isSupport(new Object[]{2}, this, f29728a, false, 17615, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{2}, this, f29728a, false, 17615, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j.setModeChangeState(2);
    }

    public final void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f29728a, false, 17650, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f29728a, false, 17650, new Class[]{String.class}, Void.TYPE);
            return;
        }
        int filter = this.j.setFilter(str2);
        String str3 = f29729b;
        y.b(str3, "ret = " + filter);
    }

    public final void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f29728a, false, 17583, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f29728a, false, 17583, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j.setUseMusic(i2);
    }

    public final void e(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29728a, false, 17641, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29728a, false, 17641, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j.setCameraFirstFrameOptimize(z2);
    }

    public final void f(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f29728a, false, 17681, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f29728a, false, 17681, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j.setDetectInterval(i2);
    }

    public final int a(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f29728a, false, 17690, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.j.initImageDrawer(i2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f29728a, false, 17690, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final int b(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, f29728a, false, 17617, new Class[]{Surface.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{surface}, this, f29728a, false, 17617, new Class[]{Surface.class}, Integer.TYPE)).intValue();
        }
        int changeSurface = this.j.changeSurface(surface);
        e(2);
        return changeSurface;
    }

    public final void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29728a, false, 17618, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29728a, false, 17618, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.j != null) {
            this.j.setDetectionMode(z2);
        }
    }

    public final void d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f29728a, false, 17623, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f29728a, false, 17623, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f29730c != null) {
            this.j.markPlayDone();
            this.f29730c.stopRecording();
        }
        this.j.stopPlay();
        i();
        if (z2) {
            r();
        }
    }

    public final int b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f29728a, false, 17643, new Class[]{String.class}, Integer.TYPE)) {
            return this.j.setSkinTone(str2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f29728a, false, 17643, new Class[]{String.class}, Integer.TYPE)).intValue();
    }

    public final MediaRecordPresenter a(int i2, int i3) {
        this.t = i2;
        this.f29733f = i3;
        return this;
    }

    public int addPCMData(byte[] bArr, int i2) {
        if (PatchProxy.isSupport(new Object[]{bArr, Integer.valueOf(i2)}, this, f29728a, false, 17602, new Class[]{byte[].class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bArr, Integer.valueOf(i2)}, this, f29728a, false, 17602, new Class[]{byte[].class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        this.j.onAudioCallback(bArr, i2);
        AudioRecorderInterface audioRecorderInterface = this.g;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.addPCMData(bArr, i2);
            y.b(f29729b, "addPCMData is running");
        }
        return 0;
    }

    public final int b(int i2, float f2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f29728a, false, 17645, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return this.j.setIntensityByType(i2, f2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f29728a, false, 17645, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
    }

    public final int a(int i2, float f2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f29728a, false, 17639, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return b(i2, f2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f29728a, false, 17639, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
    }

    public final boolean c(int i2, int i3) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29728a, false, 17581, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return this.j.posInReactionRegion(i2, i3);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29728a, false, 17581, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    @Deprecated
    public final int b(String str, float f2, float f3) {
        return this.j.setFaceMakeUp(str, f2, f3);
    }

    @Deprecated
    public final int c(Context context, int i2, @Nullable AudioRecorderInterface audioRecorderInterface) {
        if (this.f29730c != null) {
            this.f29730c.unInit();
        }
        if ((this.f29732e & 4) != 0) {
            this.j.uninitAudioPlayer();
        }
        return a(context, i2, audioRecorderInterface);
    }

    public int initWavFile(int i2, int i3, double d2) {
        int i4 = i2;
        int i5 = i3;
        double d3 = d2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Double.valueOf(d2)}, this, f29728a, false, 17601, new Class[]{Integer.TYPE, Integer.TYPE, Double.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Double.valueOf(d2)}, this, f29728a, false, 17601, new Class[]{Integer.TYPE, Integer.TYPE, Double.TYPE}, Integer.TYPE)).intValue();
        }
        int initWavFile = this.j.initWavFile(i4, i5, d3);
        AudioRecorderInterface audioRecorderInterface = this.g;
        if (audioRecorderInterface != null) {
            audioRecorderInterface.initWavFile(i4, i5, d3);
            y.a(f29729b, "initWavFile");
        }
        return initWavFile;
    }

    public final int b(Context context, int i2, @Nullable AudioRecorderInterface audioRecorderInterface) {
        int i3 = i2;
        AudioRecorderInterface audioRecorderInterface2 = audioRecorderInterface;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i2), audioRecorderInterface2}, this, f29728a, false, 17565, new Class[]{Context.class, Integer.TYPE, AudioRecorderInterface.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i2), audioRecorderInterface2}, this, f29728a, false, 17565, new Class[]{Context.class, Integer.TYPE, AudioRecorderInterface.class}, Integer.TYPE)).intValue();
        } else if (this.f29732e == i3) {
            y.c(f29729b, "changeAudioRecord: no need");
            return 1;
        } else if (context == null) {
            String str = f29729b;
            y.d(str, "file " + y.a() + ",fun " + y.c() + ",line " + y.b() + ": context is null");
            return -1000;
        } else {
            this.g = audioRecorderInterface2;
            int i4 = -2000;
            if ((this.f29732e & 1 & i3) == 0 && this.f29730c != null) {
                this.f29730c.unInit();
                this.f29730c = null;
                y.a(f29729b, "changeAudioRecord: mAudioRecorder.unInit()");
            }
            if ((i3 & 1) != 0 && this.f29730c == null) {
                this.f29730c = new BufferedAudioRecorder(this);
                this.f29730c.init(1);
                y.a(f29729b, "changeAudioRecord: mAudioRecorder.init()");
            }
            if ((i3 & 4) != 0) {
                this.j.setBGMVolume(this.w);
                i4 = this.j.initAudioPlayer(context, this.f29731d, this.o + this.p, this.r, this.x);
                String str2 = f29729b;
                y.a(str2, "changeAudioRecord: initAudioPlayer return: " + i4);
            } else {
                this.j.uninitAudioPlayer();
                d(0);
            }
            this.f29732e = i3;
            return i4;
        }
    }

    public final synchronized int a(double d2, boolean z2, float f2, int i2, int i3, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Byte.valueOf(z2 ? (byte) 1 : 0), Float.valueOf(f2), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f29728a, false, 17595, new Class[]{Double.TYPE, Boolean.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Byte.valueOf(z2), Float.valueOf(f2), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z3)}, this, f29728a, false, 17595, new Class[]{Double.TYPE, Boolean.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        return a(d2, z2, f2, i2, i3, z3, "", "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0133, code lost:
        return r18;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(double r20, boolean r22, float r23, int r24, int r25, boolean r26, java.lang.String r27, java.lang.String r28) {
        /*
            r19 = this;
            r8 = r19
            monitor-enter(r19)
            r9 = 8
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x0134 }
            java.lang.Double r2 = java.lang.Double.valueOf(r20)     // Catch:{ all -> 0x0134 }
            r18 = 0
            r1[r18] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r22)     // Catch:{ all -> 0x0134 }
            r15 = 1
            r1[r15] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Float r2 = java.lang.Float.valueOf(r23)     // Catch:{ all -> 0x0134 }
            r10 = 2
            r1[r10] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0134 }
            r11 = 3
            r1[r11] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x0134 }
            r12 = 4
            r1[r12] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r26)     // Catch:{ all -> 0x0134 }
            r13 = 5
            r1[r13] = r2     // Catch:{ all -> 0x0134 }
            r14 = 6
            r1[r14] = r27     // Catch:{ all -> 0x0134 }
            r16 = 7
            r1[r16] = r28     // Catch:{ all -> 0x0134 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29728a     // Catch:{ all -> 0x0134 }
            r4 = 0
            r5 = 17596(0x44bc, float:2.4657E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x0134 }
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch:{ all -> 0x0134 }
            r6[r18] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0134 }
            r6[r15] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch:{ all -> 0x0134 }
            r6[r10] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0134 }
            r6[r11] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0134 }
            r6[r12] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0134 }
            r6[r13] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r14] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r16] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0134 }
            r2 = r19
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0134 }
            if (r1 == 0) goto L_0x00d7
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x0134 }
            java.lang.Double r2 = java.lang.Double.valueOf(r20)     // Catch:{ all -> 0x0134 }
            r1[r18] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r22)     // Catch:{ all -> 0x0134 }
            r1[r15] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Float r2 = java.lang.Float.valueOf(r23)     // Catch:{ all -> 0x0134 }
            r1[r10] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0134 }
            r1[r11] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x0134 }
            r1[r12] = r2     // Catch:{ all -> 0x0134 }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r26)     // Catch:{ all -> 0x0134 }
            r1[r13] = r2     // Catch:{ all -> 0x0134 }
            r1[r14] = r27     // Catch:{ all -> 0x0134 }
            r1[r16] = r28     // Catch:{ all -> 0x0134 }
            com.meituan.robust.ChangeQuickRedirect r0 = f29728a     // Catch:{ all -> 0x0134 }
            r2 = 0
            r3 = 17596(0x44bc, float:2.4657E-41)
            java.lang.Class[] r4 = new java.lang.Class[r9]     // Catch:{ all -> 0x0134 }
            java.lang.Class r5 = java.lang.Double.TYPE     // Catch:{ all -> 0x0134 }
            r4[r18] = r5     // Catch:{ all -> 0x0134 }
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0134 }
            r4[r15] = r5     // Catch:{ all -> 0x0134 }
            java.lang.Class r5 = java.lang.Float.TYPE     // Catch:{ all -> 0x0134 }
            r4[r10] = r5     // Catch:{ all -> 0x0134 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0134 }
            r4[r11] = r5     // Catch:{ all -> 0x0134 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0134 }
            r4[r12] = r5     // Catch:{ all -> 0x0134 }
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0134 }
            r4[r13] = r5     // Catch:{ all -> 0x0134 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r14] = r5     // Catch:{ all -> 0x0134 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r16] = r5     // Catch:{ all -> 0x0134 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0134 }
            r20 = r1
            r21 = r19
            r22 = r0
            r23 = r2
            r24 = r3
            r25 = r4
            r26 = r5
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0134 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0134 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0134 }
            monitor-exit(r19)
            return r0
        L_0x00d7:
            boolean r1 = r19.q()     // Catch:{ all -> 0x0134 }
            if (r1 == 0) goto L_0x00e1
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            monitor-exit(r19)
            return r0
        L_0x00e1:
            com.ss.android.medialib.FaceBeautyInvoker r1 = r8.j     // Catch:{ all -> 0x0134 }
            int r2 = r8.t     // Catch:{ all -> 0x0134 }
            int r3 = r8.f29733f     // Catch:{ all -> 0x0134 }
            r1.setVideoQuality(r2, r3)     // Catch:{ all -> 0x0134 }
            com.ss.android.medialib.FaceBeautyInvoker r9 = r8.j     // Catch:{ all -> 0x0134 }
            r10 = r20
            r12 = r22
            r13 = r23
            r14 = r24
            r1 = 1
            r15 = r25
            r16 = r27
            r17 = r28
            int r4 = r9.startRecord(r10, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0134 }
            if (r4 != 0) goto L_0x0114
            boolean r0 = r8.v     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0109
            boolean r0 = r8.k     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0114
        L_0x0109:
            org.libsdl.app.BufferedAudioRecorder r0 = r8.f29730c     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0114
            org.libsdl.app.BufferedAudioRecorder r0 = r8.f29730c     // Catch:{ all -> 0x0134 }
            r2 = r20
            r0.startRecording(r2, r1)     // Catch:{ all -> 0x0134 }
        L_0x0114:
            if (r4 != 0) goto L_0x0117
            goto L_0x0119
        L_0x0117:
            r18 = r4
        L_0x0119:
            com.ss.android.medialib.d.b r0 = r8.h     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0132
            if (r18 == 0) goto L_0x0132
            com.ss.android.medialib.d.b r0 = r8.h     // Catch:{ all -> 0x0134 }
            java.lang.String r7 = "record_start_record"
            com.ss.android.medialib.presenter.MediaRecordPresenter$8 r9 = new com.ss.android.medialib.presenter.MediaRecordPresenter$8     // Catch:{ all -> 0x0134 }
            r5 = 0
            r1 = r9
            r2 = r19
            r3 = r4
            r6 = r23
            r1.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x0134 }
            r0.a(r7, r9)     // Catch:{ all -> 0x0134 }
        L_0x0132:
            monitor-exit(r19)
            return r18
        L_0x0134:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.presenter.MediaRecordPresenter.a(double, boolean, float, int, int, boolean, java.lang.String, java.lang.String):int");
    }
}
