package com.ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.FaceBeautyInvoker;
import com.ss.android.medialib.c.b;
import com.ss.android.medialib.camera.j;
import com.ss.android.medialib.camera.l;
import com.ss.android.medialib.common.a;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.ac;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.f.b;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.af;
import com.ss.android.vesdk.d.c;
import com.ss.android.vesdk.d.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.libsdl.app.AudioRecorderInterface;

public class e extends f implements FaceBeautyInvoker.OnRunningErrorCallback, b, MediaRecordPresenter.a, d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f77939a = "e";
    public static final Object i = new Object();
    private boolean Z;
    private final aj aa = new aj(1280, 720);
    private String ab;
    private float ac = 1.0f;
    private long ad = 0;
    private long ae = -1;
    private boolean af;
    private Surface ag;
    private ab ah;
    private final ExecutorService ai = h.a(m.a(p.FIXED).a(1).a());
    private a.C0357a aj = new a.C0357a() {
        public final void b() {
            y.e(e.f77939a, "onOpenGLDestroy");
            e.this.m.b();
            e.this.n.b(e.this.o);
            if (e.this.t != null && (e.this.t instanceof VEListener.p)) {
                ((VEListener.p) e.this.t).a(10001, 0, "Render Env Destroyed.");
            }
        }

        public final void a() {
            y.e(e.f77939a, "onOpenGLCreate");
            e.this.m.a();
            e.this.f77941c.a(e.this.m.f29615c);
            e eVar = e.this;
            com.ss.android.vesdk.b.b bVar = new com.ss.android.vesdk.b.b(new ac(e.this.f77944f.f77890a, e.this.f77944f.f77891b), e.this.p, true, e.this.m.f29614b, e.this.m.f29615c);
            eVar.o = bVar;
            e.this.n.a(e.this.o);
            if (e.this.f77942d != null) {
                e.this.f77942d.a(e.this.n);
                return;
            }
            if (e.this.t != null && (e.this.t instanceof VEListener.p)) {
                ((VEListener.p) e.this.t).a(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, 0, "Render Env Created.");
            }
        }

        public final int c() {
            float f2;
            int i;
            y.e(e.f77939a, "onOpenGLRunning");
            if (e.this.h) {
                synchronized (e.i) {
                    if (e.this.f77943e.f77890a > 0 && e.this.f77943e.f77891b > 0) {
                        if (!e.this.o.f77927e) {
                            f2 = (float) e.this.f77943e.f77890a;
                            i = e.this.f77943e.f77891b;
                        } else {
                            f2 = (float) e.this.f77943e.f77891b;
                            i = e.this.f77943e.f77890a;
                        }
                        e.this.f77941c.b(f2 / ((float) i));
                    }
                    boolean z = true;
                    if (e.this.k != 1) {
                        z = false;
                    }
                    e.this.f77941c.a(e.this.g, z);
                    e.this.h = false;
                }
            }
            if (e.this.j) {
                return -1;
            }
            try {
                e.this.m.c();
                if (e.this.m.f29615c != null) {
                    e.this.f77941c.a(e.this.m.d());
                }
            } catch (Exception e2) {
                String str = e.f77939a;
                y.d(str, "onOpenGLRunning error: " + e2.getMessage());
            }
            return 0;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    final List<com.ss.android.medialib.model.b> f77940b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public MediaRecordPresenter f77941c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.vesdk.a.a f77942d;

    /* renamed from: e  reason: collision with root package name */
    public aj f77943e = new aj(0, 0);

    /* renamed from: f  reason: collision with root package name */
    public aj f77944f = this.aa;
    public int g = -1;
    public boolean h;
    public boolean j;
    public int k = 0;
    public int l = 0;
    public l m = new l();
    public a<com.ss.android.vesdk.b.a> n = new a<>();
    public com.ss.android.vesdk.b.b o;
    b.a p = new b.a() {
        public final void onFrameCaptured(com.ss.android.ttvecamera.e eVar) {
            int i;
            float[] fArr;
            if (!(e.this.f77943e.f77890a == eVar.d().f31335a && e.this.f77943e.f77891b == eVar.d().f31336b)) {
                e.this.f77943e.f77890a = eVar.d().f31335a;
                e.this.f77943e.f77891b = eVar.d().f31336b;
            }
            int i2 = 1;
            if (!(e.this.k == eVar.f() && e.this.g == eVar.c())) {
                synchronized (e.i) {
                    e.this.k = eVar.f();
                    e.this.g = eVar.c();
                    e.this.h = true;
                }
            }
            e.b e2 = eVar.e();
            if (e2 == e.b.PIXEL_FORMAT_OpenGL_OES) {
                MediaRecordPresenter mediaRecordPresenter = e.this.f77941c;
                if (eVar.f31402d instanceof e.c) {
                    i = ((e.c) eVar.f31402d).f31406a;
                } else {
                    i = 0;
                }
                if (eVar.f31402d instanceof e.c) {
                    fArr = ((e.c) eVar.f31402d).f31407b;
                } else {
                    fArr = null;
                }
                mediaRecordPresenter.a(i, fArr);
            } else if (eVar.f31402d.f31410e == 3) {
                e.this.f77941c.a(new j(com.ss.android.vesdk.utils.a.a(eVar.b()), -2, eVar.d().f31335a, eVar.d().f31336b));
            } else if (e2 == e.b.PIXEL_FORMAT_NV21 || e2 == e.b.PIXEL_FORMAT_JPEG) {
                if (e2 == e.b.PIXEL_FORMAT_NV21) {
                    i2 = -3;
                }
                e.this.f77941c.a(new j(eVar.a(), i2, eVar.d().f31335a, eVar.d().f31336b));
            } else {
                y.d(e.f77939a, "Not support now!!");
            }
        }
    };

    public final MediaRecordPresenter c() {
        return this.f77941c;
    }

    public final int h() {
        return this.l;
    }

    public final void a(Surface surface) {
        this.ag = surface;
        this.Z = false;
        a(surface, (VEListener.c) null);
    }

    public final void a(Surface surface, int i2, int i3, int i4) {
        if (this.r != null && this.r.f77938f) {
            c(surface);
        }
    }

    public final void a(@Nullable final Surface surface, final VEListener.c cVar) {
        this.ai.submit(new Runnable() {
            public final void run() {
                int d2 = e.this.d(surface);
                if (cVar != null) {
                    cVar.a(d2);
                }
            }
        });
        l();
    }

    public final void a(final VEListener.c cVar) {
        m();
        this.ai.submit(new Runnable() {
            public final void run() {
                e.this.j();
                if (cVar != null) {
                    cVar.a(0);
                }
            }
        });
    }

    public final synchronized void a() {
        if (this.l != 3) {
            int size = this.f77940b.size();
            if (size > 0) {
                this.f77940b.remove(size - 1);
                this.ad = (long) com.ss.android.medialib.model.b.a(this.f77940b);
            }
            this.f77941c.f();
        } else {
            throw new r(-105, "nativeDeleteLastFrag could not be executed in mode: " + this.l);
        }
    }

    public final void a(@NonNull String str, @NonNull String str2, int i2, @NonNull String str3, @NonNull String str4, VEListener.c cVar) {
        ExecutorService executorService = this.ai;
        final VEListener.c cVar2 = cVar;
        final String str5 = str;
        final String str6 = str2;
        final int i3 = i2;
        final String str7 = str3;
        final String str8 = str4;
        AnonymousClass11 r0 = new Runnable() {
            public final void run() {
                int i;
                if (e.this.l == 3 || e.this.l == 0) {
                    if (cVar2 != null) {
                        cVar2.a(-105);
                    }
                    return;
                }
                MediaRecordPresenter mediaRecordPresenter = e.this.f77941c;
                String str = str5;
                String str2 = str6;
                int i2 = i3;
                String str3 = str7;
                String str4 = str8;
                boolean isOptRemuxWithCopy = e.this.H.isOptRemuxWithCopy();
                if (PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(i2), str3, str4, Byte.valueOf(isOptRemuxWithCopy ? (byte) 1 : 0)}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17611, new Class[]{String.class, String.class, Integer.TYPE, String.class, String.class, Boolean.TYPE}, Integer.TYPE)) {
                    MediaRecordPresenter mediaRecordPresenter2 = mediaRecordPresenter;
                    i = ((Integer) PatchProxy.accessDispatch(new Object[]{str, str2, Integer.valueOf(i2), str3, str4, Byte.valueOf(isOptRemuxWithCopy)}, mediaRecordPresenter2, MediaRecordPresenter.f29728a, false, 17611, new Class[]{String.class, String.class, Integer.TYPE, String.class, String.class, Boolean.TYPE}, Integer.TYPE)).intValue();
                } else {
                    mediaRecordPresenter.i();
                    i = mediaRecordPresenter.j.concat(str, str2, i2, str3, str4, isOptRemuxWithCopy);
                }
                if (cVar2 != null) {
                    cVar2.a(i);
                }
            }
        };
        executorService.submit(r0);
    }

    public final void a(af.c cVar) {
        super.a(cVar);
        this.f77941c.a((MediaRecordPresenter.a) cVar == null ? null : this);
    }

    public final void a(am amVar) {
        if (amVar.f77898a > -1.0f) {
            this.f77941c.a(amVar.f77898a);
        }
        this.f77941c.b(amVar.f77899b);
    }

    public final void a(com.ss.android.vesdk.a.b bVar) {
        if (bVar != null) {
            aj i2 = bVar.i();
            com.ss.android.vesdk.b.a aVar = null;
            Iterator it2 = this.n.b().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                com.ss.android.vesdk.b.a aVar2 = (com.ss.android.vesdk.b.a) it2.next();
                if (aVar2.f77926d) {
                    aVar = aVar2;
                    break;
                }
            }
            if (!(i2 == null || aVar == null || aVar.f77924b == null)) {
                aVar.f77924b.f31335a = i2.f77890a;
                aVar.f77924b.f31336b = i2.f77891b;
            }
            bVar.a(this.n);
        }
    }

    public final void a(int i2) {
        if (i2 == 0) {
            if (!this.ah.f77868e) {
                int i3 = this.T.f31201a;
                String str = this.T.f31202b;
                this.T.f31201a = i3;
                this.T.f31202b = str;
                this.f77941c.b(i3, str);
                float f2 = this.T.f31203c;
                float f3 = this.T.f31204d;
                this.T.f31203c = f2;
                this.T.f31204d = f3;
                this.f77941c.a(f2, f3);
                if (!TextUtils.isEmpty(this.V.f31215a) || !TextUtils.isEmpty(this.V.f31216b)) {
                    String str2 = this.V.f31215a;
                    String str3 = this.V.f31216b;
                    float f4 = this.V.f31217c;
                    this.V.f31215a = str2;
                    this.V.f31216b = str3;
                    this.V.f31217c = f4;
                    this.V.f31219e = true;
                    this.f77941c.a(com.ss.android.vesdk.utils.b.a(str2), com.ss.android.vesdk.utils.b.a(str3), f4);
                    if (!this.V.f31219e) {
                        this.f77941c.d(this.V.f31218d);
                    }
                }
                String str4 = this.W.f31220a;
                float f5 = this.W.f31221b;
                float f6 = this.W.f31222c;
                this.W.f31220a = str4;
                this.W.f31221b = f5;
                this.W.f31222c = f6;
                this.f77941c.a(com.ss.android.vesdk.utils.b.a(str4), f5, f6);
                String str5 = this.W.f31220a;
                Map<Integer, Float> map = this.W.f31223d;
                this.W.f31220a = str5;
                this.W.a(map);
                this.f77941c.a(str5, map);
                String str6 = this.X.f31210a;
                float f7 = this.X.f31211b;
                float f8 = this.X.f31212c;
                this.X.f31210a = str6;
                this.X.f31211b = f7;
                this.X.f31212c = f8;
                this.f77941c.b(com.ss.android.vesdk.utils.b.a(str6), f7, f8);
                if (!TextUtils.isEmpty(this.X.f31210a)) {
                    a(19, this.X.f31213d);
                    a(20, this.X.f31214e);
                }
                String str7 = this.U.f31205a;
                int i4 = this.U.f31208d;
                int i5 = this.U.f31209e;
                boolean z = this.U.f31207c;
                this.U.f31205a = str7;
                this.U.f31207c = z;
                this.U.f31209e = i5;
                this.U.f31208d = i4;
                this.f77941c.a(com.ss.android.vesdk.utils.b.a(str7), i4, i5, z);
            }
            this.f77941c.d();
            int a2 = this.f77941c.a(this.f77940b.size(), this.ab);
            if (a2 != 0) {
                String str8 = f77939a;
                y.d(str8, "tryRestore ret: " + a2);
            } else {
                this.ad = (long) com.ss.android.medialib.model.b.a(this.f77940b);
            }
            this.f77941c.a((MediaRecordPresenter.a) this.E == null ? null : this);
        } else {
            y.d(f77939a, "Create native GL env failed");
        }
        if (this.t != null) {
            this.t.b(i2, "onNativeInitCallBack");
            if (this.t instanceof VEListener.p) {
                ((VEListener.p) this.t).a(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, i2, "Init onNativeInitCallBack");
            }
        }
    }

    public final void a(int i2, int i3) {
        if (this.t != null) {
            int i4 = 1;
            boolean z = i2 != 0;
            this.t.a(z);
            if (this.t instanceof VEListener.p) {
                VEListener.p pVar = (VEListener.p) this.t;
                if (!z) {
                    i4 = -1;
                }
                pVar.a(1003, i4, "Init HardEncode");
            }
        }
    }

    public final void a(com.ss.android.medialib.model.a aVar) {
        if (this.E != null) {
            this.E.a(aVar.f29700a, aVar.f29701b, aVar.f29702c, aVar.f29703d, aVar.f29704e, aVar.f29705f);
        }
    }

    public final long b() {
        return this.f77941c.e();
    }

    public final void e() {
        this.f77941c.m();
    }

    public final void f() {
        this.f77941c.n();
    }

    private void l() {
        if (this.f77942d != null) {
            this.f77942d.b();
        }
    }

    private void m() {
        if (this.f77942d != null) {
            this.f77942d.e();
        }
    }

    public final boolean as_() {
        if (this.E == null || !this.E.a()) {
            return false;
        }
        return true;
    }

    public final void i() {
        this.f77941c.c();
        this.l = 0;
    }

    public final synchronized void j() {
        if ((this.l & 2) == 0) {
            String str = f77939a;
            y.c(str, "stopRecordPreview status error: " + this.l);
            return;
        }
        this.f77941c.d(false);
        this.l = 1;
        this.f77941c.k();
        this.f77941c.a((com.ss.android.medialib.c.b) null);
        this.f77941c.a((FaceBeautyInvoker.OnRunningErrorCallback) null);
    }

    private int k() {
        int i2;
        if (this.l != 0) {
            y.d(f77939a, "initInternalRecorder called in a invalid state: " + this.l + "should be : 0");
            return -105;
        }
        this.f77941c.a(this.q);
        int i3 = this.H.getVideoRes().f77890a;
        int i4 = this.H.getVideoRes().f77891b;
        boolean z = !TextUtils.isEmpty(this.P);
        if (this.O == ae.DUET) {
            i4 /= 2;
        }
        int i5 = i4;
        aj ajVar = this.ah.f77864a;
        MediaRecordPresenter mediaRecordPresenter = this.f77941c;
        int i6 = ajVar.f77891b;
        int i7 = ajVar.f77890a;
        String str = this.ab;
        String str2 = this.K;
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int a2 = mediaRecordPresenter.a(i6, i7, str, i5, i3, str2, i2, this.L);
        if (a2 == 0) {
            this.l = 1;
        }
        return a2;
    }

    public final void d() {
        if (!this.Z) {
            a((VEListener.c) null);
        }
        if (this.r != null) {
            this.r.b((d) this);
        }
        if (this.f77942d != null) {
            this.f77942d.f();
        }
        if (this.B != null) {
            com.ss.android.medialib.h.a().b(this.B);
        }
        MediaRecordPresenter mediaRecordPresenter = this.f77941c;
        if (PatchProxy.isSupport(new Object[]{null}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17715, new Class[]{com.ss.android.medialib.c.a.class}, Void.TYPE)) {
            MediaRecordPresenter mediaRecordPresenter2 = mediaRecordPresenter;
            PatchProxy.accessDispatch(new Object[]{null}, mediaRecordPresenter2, MediaRecordPresenter.f29728a, false, 17715, new Class[]{com.ss.android.medialib.c.a.class}, Void.TYPE);
        } else {
            mediaRecordPresenter.j.setFaceDetectListener2(null);
        }
        this.ai.submit(new Runnable() {
            public final void run() {
                e.this.i();
            }
        });
        this.ai.shutdown();
        super.d();
    }

    public final synchronized int g() {
        float f2;
        if (this.l != 3) {
            String str = f77939a;
            y.d(str, "nativeStopRecord called in a invalid state: " + this.l);
            return -105;
        }
        this.f77941c.g();
        long e2 = (long) (((float) this.f77941c.e()) / 1000.0f);
        this.f77940b.add(new com.ss.android.medialib.model.b(e2, (double) this.ac));
        synchronized (i) {
            this.ae = -1;
            f2 = (float) e2;
            this.ad = (long) (((float) this.ad) + ((1.0f * f2) / this.ac));
        }
        this.l = 2;
        return (int) (f2 / this.ac);
    }

    public final void b(Surface surface) {
        a((VEListener.c) null);
        this.Z = true;
    }

    public final int c(Surface surface) {
        int a2 = this.f77941c.a(surface);
        this.f77941c.e(2);
        return a2;
    }

    public static int a(e.b bVar) {
        switch (bVar) {
            case PIXEL_FORMAT_JPEG:
                return 1;
            case PIXEL_FORMAT_NV21:
                return -3;
            case PIXEL_FORMAT_YUV420:
                return -2;
            default:
                return -1;
        }
    }

    public final void b(final VEListener.c cVar) {
        this.ai.submit(new Runnable() {
            public final void run() {
                int g = e.this.g();
                if (cVar != null) {
                    cVar.a(g);
                }
            }
        });
    }

    private int a(boolean z) {
        if (!this.ah.f77865b && !z) {
            return 0;
        }
        if (this.O == ae.DUET || this.O == ae.REACTION || !TextUtils.isEmpty(this.P)) {
            return 5;
        }
        return 1;
    }

    public final void b(boolean z) {
        this.af = z;
        this.f77941c.d(this.af ? 1 : 0);
    }

    public void onError(int i2) {
        String str = f77939a;
        y.d(str, "running error: " + i2);
        int i3 = -601;
        if (i2 == -602) {
            i3 = -602;
        } else if (i2 != -601) {
            i3 = 0;
        }
        if (this.t instanceof VEListener.p) {
            ((VEListener.p) this.t).a(i3, "");
        }
    }

    public final synchronized int a(float f2) {
        int i2;
        if (this.H == null) {
            return -108;
        }
        if (this.l != 2) {
            String str = f77939a;
            y.d(str, "nativeStartRecord called in a invalid state: " + this.l + "should be : 2");
            return -105;
        }
        this.l = 3;
        this.f77941c.b(this.q, a(true), (AudioRecorderInterface) null);
        this.ac = f2;
        this.f77941c.a(this.Q, this.ad);
        if (this.H.getBitrateMode() == VEVideoEncodeSettings.c.ENCODE_BITRATE_CRF) {
            int swCRF = this.H.getSwCRF();
            MediaRecordPresenter mediaRecordPresenter = this.f77941c;
            int ordinal = VEVideoEncodeSettings.c.ENCODE_BITRATE_CRF.ordinal();
            if (swCRF < 12) {
                swCRF = 12;
            }
            mediaRecordPresenter.a(ordinal, swCRF);
        } else {
            this.f77941c.a(VEVideoEncodeSettings.c.ENCODE_BITRATE_QP.ordinal(), this.H.getSwQP());
        }
        float bps = (((float) this.H.getBps()) * 1.0f) / 4194304.0f;
        if (this.H.getEncodeProfile() == VEVideoEncodeSettings.e.ENCODE_PROFILE_MAIN.ordinal()) {
            i2 = 2;
        } else if (this.H.getEncodeProfile() == VEVideoEncodeSettings.e.ENCODE_PROFILE_HIGH.ordinal()) {
            i2 = 8;
        } else {
            i2 = 1;
        }
        int a2 = this.f77941c.a((double) f2, !this.H.isSupportHwEnc(), bps, 1, i2, false, this.H.getDescription(), this.H.getComment());
        if (a2 != 0) {
            String str2 = f77939a;
            y.d(str2, "nativeStartRecord error: " + a2);
        }
        synchronized (i) {
            this.ae = 0;
        }
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01d8, code lost:
        return r15;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int d(android.view.Surface r15) {
        /*
            r14 = this;
            monitor-enter(r14)
            int r0 = r14.l     // Catch:{ all -> 0x01d9 }
            if (r0 != 0) goto L_0x0025
            r14.i()     // Catch:{ all -> 0x01d9 }
            int r0 = r14.k()     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r15 = f77939a     // Catch:{ all -> 0x01d9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            java.lang.String r2 = "nativeInitFaceBeautyPlay error: "
            r1.<init>(r2)     // Catch:{ all -> 0x01d9 }
            r1.append(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.y.d(r15, r0)     // Catch:{ all -> 0x01d9 }
            r15 = -108(0xffffffffffffff94, float:NaN)
            monitor-exit(r14)
            return r15
        L_0x0025:
            int r0 = r14.l     // Catch:{ all -> 0x01d9 }
            r1 = 1
            if (r0 == r1) goto L_0x004c
            java.lang.String r0 = f77939a     // Catch:{ all -> 0x01d9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            java.lang.String r2 = "startRecordPreview statue error: "
            r1.<init>(r2)     // Catch:{ all -> 0x01d9 }
            int r2 = r14.l     // Catch:{ all -> 0x01d9 }
            r1.append(r2)     // Catch:{ all -> 0x01d9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.y.d(r0, r1)     // Catch:{ all -> 0x01d9 }
            android.view.Surface r0 = r14.ag     // Catch:{ all -> 0x01d9 }
            if (r0 == r15) goto L_0x0048
            r14.c(r15)     // Catch:{ all -> 0x01d9 }
            r14.ag = r15     // Catch:{ all -> 0x01d9 }
        L_0x0048:
            r15 = -105(0xffffffffffffff97, float:NaN)
            monitor-exit(r14)
            return r15
        L_0x004c:
            r14.ag = r15     // Catch:{ all -> 0x01d9 }
            r0 = -1
            r14.g = r0     // Catch:{ all -> 0x01d9 }
            r2 = 0
            r14.k = r2     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.aj r3 = r14.f77943e     // Catch:{ all -> 0x01d9 }
            r3.f77890a = r2     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.aj r3 = r14.f77943e     // Catch:{ all -> 0x01d9 }
            r3.f77891b = r2     // Catch:{ all -> 0x01d9 }
            com.ss.android.medialib.presenter.MediaRecordPresenter r3 = r14.f77941c     // Catch:{ all -> 0x01d9 }
            com.ss.android.medialib.presenter.IStickerRequestCallback r4 = r14.F     // Catch:{ all -> 0x01d9 }
            r3.a((com.ss.android.medialib.presenter.IStickerRequestCallback) r4)     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.ae r3 = r14.O     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.ae r4 = com.ss.android.vesdk.ae.DUET     // Catch:{ all -> 0x01d9 }
            if (r3 != r4) goto L_0x0087
            com.ss.android.medialib.presenter.MediaRecordPresenter r5 = r14.f77941c     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.o r3 = r14.M     // Catch:{ all -> 0x01d9 }
            java.lang.String r6 = r3.f78031a     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.o r3 = r14.M     // Catch:{ all -> 0x01d9 }
            java.lang.String r7 = r3.f78032b     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.o r3 = r14.M     // Catch:{ all -> 0x01d9 }
            float r8 = r3.f78033c     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.o r3 = r14.M     // Catch:{ all -> 0x01d9 }
            float r9 = r3.f78034d     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.o r3 = r14.M     // Catch:{ all -> 0x01d9 }
            float r10 = r3.f78035e     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.o r3 = r14.M     // Catch:{ all -> 0x01d9 }
            boolean r11 = r3.f78036f     // Catch:{ all -> 0x01d9 }
            r5.a((java.lang.String) r6, (java.lang.String) r7, (float) r8, (float) r9, (float) r10, (boolean) r11)     // Catch:{ all -> 0x01d9 }
            goto L_0x00b7
        L_0x0087:
            com.ss.android.vesdk.ae r3 = r14.O     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.ae r4 = com.ss.android.vesdk.ae.REACTION     // Catch:{ all -> 0x01d9 }
            if (r3 != r4) goto L_0x009d
            com.ss.android.medialib.presenter.MediaRecordPresenter r3 = r14.f77941c     // Catch:{ all -> 0x01d9 }
            android.content.Context r4 = r14.q     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.ad r5 = r14.N     // Catch:{ all -> 0x01d9 }
            java.lang.String r5 = r5.f77873a     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.ad r6 = r14.N     // Catch:{ all -> 0x01d9 }
            java.lang.String r6 = r6.f77874b     // Catch:{ all -> 0x01d9 }
            r3.a((android.content.Context) r4, (java.lang.String) r5, (java.lang.String) r6)     // Catch:{ all -> 0x01d9 }
            goto L_0x00b7
        L_0x009d:
            com.ss.android.medialib.presenter.MediaRecordPresenter r3 = r14.f77941c     // Catch:{ all -> 0x01d9 }
            java.lang.String r4 = r14.P     // Catch:{ all -> 0x01d9 }
            com.ss.android.medialib.presenter.MediaRecordPresenter r3 = r3.a((java.lang.String) r4)     // Catch:{ all -> 0x01d9 }
            int r4 = r14.S     // Catch:{ all -> 0x01d9 }
            if (r4 != r1) goto L_0x00ab
            r4 = 1
            goto L_0x00ac
        L_0x00ab:
            r4 = 0
        L_0x00ac:
            com.ss.android.medialib.presenter.MediaRecordPresenter r3 = r3.a((boolean) r4)     // Catch:{ all -> 0x01d9 }
            long r4 = r14.Q     // Catch:{ all -> 0x01d9 }
            r6 = 0
            r3.a((long) r4, (long) r6)     // Catch:{ all -> 0x01d9 }
        L_0x00b7:
            com.ss.android.medialib.presenter.MediaRecordPresenter r3 = r14.f77941c     // Catch:{ all -> 0x01d9 }
            r3.c((int) r1)     // Catch:{ all -> 0x01d9 }
            com.ss.android.medialib.presenter.MediaRecordPresenter r3 = r14.f77941c     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.ab r4 = r14.ah     // Catch:{ all -> 0x01d9 }
            boolean r4 = r4.f77866c     // Catch:{ all -> 0x01d9 }
            r3.c((boolean) r4)     // Catch:{ all -> 0x01d9 }
            com.ss.android.medialib.presenter.MediaRecordPresenter r3 = r14.f77941c     // Catch:{ all -> 0x01d9 }
            r3.a((com.ss.android.medialib.c.b) r14)     // Catch:{ all -> 0x01d9 }
            com.ss.android.medialib.presenter.MediaRecordPresenter r3 = r14.f77941c     // Catch:{ all -> 0x01d9 }
            r3.a((com.ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback) r14)     // Catch:{ all -> 0x01d9 }
            com.ss.android.medialib.presenter.MediaRecordPresenter r3 = r14.f77941c     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.ab r4 = r14.ah     // Catch:{ all -> 0x01d9 }
            boolean r4 = r4.f77867d     // Catch:{ all -> 0x01d9 }
            r3.e((boolean) r4)     // Catch:{ all -> 0x01d9 }
            r3 = 2
            if (r15 == 0) goto L_0x00e5
            com.ss.android.medialib.presenter.MediaRecordPresenter r0 = r14.f77941c     // Catch:{ all -> 0x01d9 }
            java.lang.String r4 = android.os.Build.DEVICE     // Catch:{ all -> 0x01d9 }
            int r15 = r0.a((android.view.Surface) r15, (java.lang.String) r4)     // Catch:{ all -> 0x01d9 }
            goto L_0x0158
        L_0x00e5:
            com.ss.android.vesdk.d.c r15 = r14.r     // Catch:{ all -> 0x01d9 }
            if (r15 == 0) goto L_0x00ef
            com.ss.android.vesdk.d.c r15 = r14.r     // Catch:{ all -> 0x01d9 }
            int r15 = r15.f77935c     // Catch:{ all -> 0x01d9 }
            r5 = r15
            goto L_0x00f0
        L_0x00ef:
            r5 = -1
        L_0x00f0:
            com.ss.android.vesdk.d.c r15 = r14.r     // Catch:{ all -> 0x01d9 }
            if (r15 == 0) goto L_0x00fa
            com.ss.android.vesdk.d.c r15 = r14.r     // Catch:{ all -> 0x01d9 }
            int r0 = r15.f77936d     // Catch:{ all -> 0x01d9 }
            r6 = r0
            goto L_0x00fb
        L_0x00fa:
            r6 = -1
        L_0x00fb:
            com.ss.android.medialib.presenter.MediaRecordPresenter r15 = r14.f77941c     // Catch:{ all -> 0x01d9 }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x01d9 }
            r7[r2] = r0     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01d9 }
            r7[r1] = r0     // Catch:{ all -> 0x01d9 }
            com.meituan.robust.ChangeQuickRedirect r9 = com.ss.android.medialib.presenter.MediaRecordPresenter.f29728a     // Catch:{ all -> 0x01d9 }
            r10 = 0
            r11 = 17620(0x44d4, float:2.4691E-41)
            java.lang.Class[] r12 = new java.lang.Class[r3]     // Catch:{ all -> 0x01d9 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01d9 }
            r12[r2] = r0     // Catch:{ all -> 0x01d9 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01d9 }
            r12[r1] = r0     // Catch:{ all -> 0x01d9 }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01d9 }
            r8 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x014e
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x01d9 }
            r7[r2] = r0     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01d9 }
            r7[r1] = r0     // Catch:{ all -> 0x01d9 }
            com.meituan.robust.ChangeQuickRedirect r9 = com.ss.android.medialib.presenter.MediaRecordPresenter.f29728a     // Catch:{ all -> 0x01d9 }
            r10 = 0
            r11 = 17620(0x44d4, float:2.4691E-41)
            java.lang.Class[] r12 = new java.lang.Class[r3]     // Catch:{ all -> 0x01d9 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01d9 }
            r12[r2] = r0     // Catch:{ all -> 0x01d9 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01d9 }
            r12[r1] = r0     // Catch:{ all -> 0x01d9 }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01d9 }
            r8 = r15
            java.lang.Object r15 = com.meituan.robust.PatchProxy.accessDispatch(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ all -> 0x01d9 }
            int r15 = r15.intValue()     // Catch:{ all -> 0x01d9 }
            goto L_0x0158
        L_0x014e:
            com.ss.android.medialib.FaceBeautyInvoker r4 = r15.j     // Catch:{ all -> 0x01d9 }
            java.lang.String r7 = android.os.Build.DEVICE     // Catch:{ all -> 0x01d9 }
            r8 = -1
            r9 = -1
            int r15 = r4.startPlay((int) r5, (int) r6, (java.lang.String) r7, (int) r8, (int) r9)     // Catch:{ all -> 0x01d9 }
        L_0x0158:
            if (r15 == 0) goto L_0x016d
            java.lang.String r0 = f77939a     // Catch:{ all -> 0x01d9 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            java.lang.String r5 = "nativeStartPlay error: "
            r4.<init>(r5)     // Catch:{ all -> 0x01d9 }
            r4.append(r15)     // Catch:{ all -> 0x01d9 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01d9 }
            com.ss.android.vesdk.y.d(r0, r4)     // Catch:{ all -> 0x01d9 }
        L_0x016d:
            com.ss.android.vesdk.VEListener$o r0 = r14.x     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x017b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            java.lang.String r4 = "nativeStartPlay error: "
            r0.<init>(r4)     // Catch:{ all -> 0x01d9 }
            r0.append(r15)     // Catch:{ all -> 0x01d9 }
        L_0x017b:
            r14.l = r3     // Catch:{ all -> 0x01d9 }
            com.ss.android.medialib.presenter.MediaRecordPresenter r11 = r14.f77941c     // Catch:{ all -> 0x01d9 }
            android.content.Context r0 = r14.q     // Catch:{ all -> 0x01d9 }
            int r12 = r14.a((boolean) r2)     // Catch:{ all -> 0x01d9 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x01d9 }
            r4[r2] = r0     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x01d9 }
            r4[r1] = r5     // Catch:{ all -> 0x01d9 }
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.medialib.presenter.MediaRecordPresenter.f29728a     // Catch:{ all -> 0x01d9 }
            r7 = 0
            r8 = 17563(0x449b, float:2.4611E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x01d9 }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r9[r2] = r5     // Catch:{ all -> 0x01d9 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01d9 }
            r9[r1] = r5     // Catch:{ all -> 0x01d9 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01d9 }
            r5 = r11
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01d9 }
            if (r4 == 0) goto L_0x01d3
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x01d9 }
            r4[r2] = r0     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x01d9 }
            r4[r1] = r0     // Catch:{ all -> 0x01d9 }
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.medialib.presenter.MediaRecordPresenter.f29728a     // Catch:{ all -> 0x01d9 }
            r6 = 0
            r7 = 17563(0x449b, float:2.4611E-41)
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ all -> 0x01d9 }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r8[r2] = r0     // Catch:{ all -> 0x01d9 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01d9 }
            r8[r1] = r0     // Catch:{ all -> 0x01d9 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01d9 }
            r0 = r4
            r1 = r11
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r8
            r6 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01d9 }
            r0.intValue()     // Catch:{ all -> 0x01d9 }
            goto L_0x01d7
        L_0x01d3:
            r1 = 0
            r11.a((android.content.Context) r0, (int) r12, (org.libsdl.app.AudioRecorderInterface) r1)     // Catch:{ all -> 0x01d9 }
        L_0x01d7:
            monitor-exit(r14)
            return r15
        L_0x01d9:
            r15 = move-exception
            monitor-exit(r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.e.d(android.view.Surface):int");
    }

    public final void a(final float f2, final VEListener.c cVar) {
        this.ai.submit(new Runnable() {
            public final void run() {
                int a2 = e.this.a(f2);
                if (cVar != null) {
                    cVar.a(a2);
                }
            }
        });
    }

    private int a(int i2, float f2) {
        switch (i2) {
            case 1:
                this.T.f31204d = f2;
                break;
            case 2:
                this.T.f31203c = f2;
                break;
            case 4:
                this.W.f31221b = f2;
                break;
            case 5:
                this.W.f31222c = f2;
                break;
            case 17:
                this.X.f31211b = f2;
                break;
            case 18:
                this.X.f31212c = f2;
                break;
            case 19:
                this.X.f31213d = f2;
                break;
            case 20:
                this.X.f31214e = f2;
                break;
        }
        this.f77941c.a(i2, f2);
        return 0;
    }

    public e(Context context, com.ss.android.vesdk.runtime.d dVar, c cVar) {
        super(context, dVar, cVar);
        if (this.r != null) {
            this.r.a((d) this);
        }
        this.f77941c = new MediaRecordPresenter();
        this.f77941c.a(this.aj);
        com.ss.android.ttve.monitor.e.a("iesve_use_new_record", 1);
    }

    public final int a(String str, long j2, long j3, int i2) {
        super.a(str, j2, j3, i2);
        MediaRecordPresenter a2 = this.f77941c.a(this.P);
        boolean z = true;
        if (this.S != 1) {
            z = false;
        }
        a2.a(z).a(this.Q, this.ad);
        this.f77941c.b(this.q, a(false), (AudioRecorderInterface) null);
        return 0;
    }

    public final int a(List<ak> list, String str, int i2, int i3) {
        a(str, (long) i2, this.R, i3);
        this.f77940b.clear();
        this.f77940b.addAll(list);
        this.ad = (long) com.ss.android.medialib.model.b.a(this.f77940b);
        return this.f77941c.a(list.size(), this.ab);
    }

    public final int a(com.ss.android.vesdk.a.a aVar, VEVideoEncodeSettings vEVideoEncodeSettings, j jVar, ab abVar, String str, String str2) {
        this.f77942d = aVar;
        if (this.f77942d != null) {
            this.f77944f = this.f77942d.i();
        }
        this.ab = str + File.separator;
        this.H = vEVideoEncodeSettings;
        this.I = jVar;
        this.ah = abVar;
        this.J = str;
        this.K = str2;
        return k();
    }

    public final int a(String str, final int i2, final int i3, final boolean z, boolean z2, Bitmap.CompressFormat compressFormat, final af.b bVar) {
        if (i2 <= 720) {
            AnonymousClass2 r7 = new a.b() {
                public final void a(int i) {
                    bVar.a(i);
                }
            };
            return this.f77941c.a(str, new int[]{i2, i3}, z2, compressFormat, (a.b) r7);
        } else if (this.f77942d != null) {
            final af.b bVar2 = bVar;
            final String str2 = str;
            final Bitmap.CompressFormat compressFormat2 = compressFormat;
            final boolean z3 = z;
            final AnonymousClass4 r1 = new MediaRecordPresenter.b() {
                public final void a(Bitmap bitmap, int i) {
                    bVar2.a(i);
                    com.ss.android.medialib.common.b.a(bitmap, str2, compressFormat2);
                    if (i != 0 || z3) {
                        e.this.f77942d.c();
                    }
                }
            };
            this.f77942d.a(i2, i3, new TECameraSettings.e() {
                public final void a() {
                    r1.a(null, -1000);
                }

                public final void a(com.ss.android.ttvecamera.e eVar, com.ss.android.ttvecamera.c cVar) {
                    com.ss.android.ttvecamera.c cVar2 = cVar;
                    j jVar = null;
                    if (eVar == null) {
                        r1.a(null, -1000);
                        return;
                    }
                    if (cVar2 instanceof com.ss.android.ttvecamera.a) {
                        jVar = new j(eVar.a(), e.a(eVar.e()), eVar.d().f31335a, eVar.d().f31336b);
                    } else if (cVar2 instanceof com.ss.android.ttvecamera.b) {
                        jVar = new j(com.ss.android.vesdk.utils.a.a(eVar.b()), e.a(eVar.e()), eVar.d().f31335a, eVar.d().f31336b);
                    }
                    MediaRecordPresenter mediaRecordPresenter = e.this.f77941c;
                    int i = i2;
                    int i2 = i3;
                    AnonymousClass1 r12 = new MediaRecordPresenter.c() {
                        public final void a(int i) {
                            if (i < 0) {
                                r1.a(null, i);
                            }
                        }

                        public final void a(Bitmap bitmap) {
                            r1.a(bitmap, 0);
                        }
                    };
                    if (PatchProxy.isSupport(new Object[]{jVar, Integer.valueOf(i), Integer.valueOf(i2), 0, r12}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17695, new Class[]{j.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, MediaRecordPresenter.c.class}, Void.TYPE)) {
                        MediaRecordPresenter mediaRecordPresenter2 = mediaRecordPresenter;
                        PatchProxy.accessDispatch(new Object[]{jVar, Integer.valueOf(i), Integer.valueOf(i2), 0, r12}, mediaRecordPresenter2, MediaRecordPresenter.f29728a, false, 17695, new Class[]{j.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, MediaRecordPresenter.c.class}, Void.TYPE);
                        return;
                    }
                    y.b(MediaRecordPresenter.f29729b, "start renderPicture ======");
                    int renderPicture = mediaRecordPresenter.j.renderPicture(jVar, i, i2, new FaceBeautyInvoker.OnPictureCallbackV2(r12, 0) {

                        /* renamed from: a */
                        public static ChangeQuickRedirect f29755a;

                        /* renamed from: b */
                        final /* synthetic */ c f29756b;

                        /* renamed from: c */
                        final /* synthetic */ int f29757c;

                        public final void onResult(
/*
Method generation error in method: com.ss.android.medialib.presenter.MediaRecordPresenter.4.onResult(int, int):void, dex: classes4.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.medialib.presenter.MediaRecordPresenter.4.onResult(int, int):void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                        
*/

                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void onImage(
/*
Method generation error in method: com.ss.android.medialib.presenter.MediaRecordPresenter.4.onImage(int[], int, int):void, dex: classes4.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.medialib.presenter.MediaRecordPresenter.4.onImage(int[], int, int):void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                        
*/
                    });
                    if (renderPicture < 0) {
                        r12.a(renderPicture);
                    }
                }
            });
            return 0;
        } else {
            throw new IllegalStateException("No Camera capture to capture");
        }
    }
}
