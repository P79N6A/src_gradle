package com.ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FaceBeautyInvoker;
import com.ss.android.medialib.camera.IESCameraInterface;
import com.ss.android.medialib.camera.g;
import com.ss.android.medialib.common.a;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.medialib.presenter.c;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.af;
import com.ss.android.vesdk.d.d;
import com.ss.android.vesdk.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.libsdl.app.AudioPlayerFS;
import org.libsdl.app.AudioRecorderInterface;

public final class b extends f implements com.ss.android.medialib.c.b, com.ss.android.medialib.presenter.a, com.ss.android.medialib.presenter.b, d, AudioPlayerFS.ICompletionCallback, AudioRecorderInterface {
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    final List<com.ss.android.medialib.model.b> f77900a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    String f77901b = "IESurfaceVideoRecorder";

    /* renamed from: c  reason: collision with root package name */
    g f77902c;

    /* renamed from: d  reason: collision with root package name */
    public MediaRecordPresenter f77903d;

    /* renamed from: e  reason: collision with root package name */
    SurfaceView f77904e;

    /* renamed from: f  reason: collision with root package name */
    TextureView f77905f;
    a g;
    public boolean h = false;
    public long i = 0;
    ab j;
    String k;
    private int l;
    private boolean m = true;
    private float n = 1.0f;
    private boolean o = false;
    private long p = -1;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f77921a = true;

        /* renamed from: b  reason: collision with root package name */
        public Surface f77922b;

        public a(Surface surface, boolean z) {
            this.f77922b = surface;
        }
    }

    public final void lackPermission() {
    }

    public final void onComplete(boolean z) {
    }

    public final void recordStatus(boolean z) {
    }

    public final void a(int i2) {
        if (ar_()) {
            int i3 = this.H.getVideoRes().f77890a;
            int i4 = this.H.getVideoRes().f77891b;
            float[] fArr = this.N.f77875c;
            float f2 = (float) i4;
            float f3 = (float) i3;
            this.f77903d.b((int) (fArr[0] * f2), (int) (fArr[1] * f2), (int) (fArr[2] * f3), (int) (fArr[3] * f3));
            this.f77903d.b(2, 0);
            float[] fArr2 = this.N.f77876d;
            this.f77903d.a(0, 0, (int) (fArr2[2] * f3), (int) (fArr2[3] * f2));
        }
        if (this.t != null) {
            this.t.b(i2, "onNativeInitCallBack");
        }
        if (i2 >= 0) {
            if (!this.j.f77868e) {
                int i5 = this.T.f31201a;
                String str = this.T.f31202b;
                this.T.f31201a = i5;
                this.T.f31202b = str;
                this.f77903d.b(i5, str);
                float f4 = this.T.f31203c;
                float f5 = this.T.f31204d;
                this.T.f31203c = f4;
                this.T.f31204d = f5;
                this.f77903d.a(f4, f5);
                if (!TextUtils.isEmpty(this.V.f31215a) || !TextUtils.isEmpty(this.V.f31216b)) {
                    String str2 = this.V.f31215a;
                    String str3 = this.V.f31216b;
                    float f6 = this.V.f31217c;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "";
                    }
                    this.V.f31215a = str2;
                    this.V.f31216b = str3;
                    this.V.f31217c = f6;
                    this.V.f31219e = true;
                    this.f77903d.a(str2, str3, f6);
                    if (!this.V.f31219e) {
                        this.f77903d.d(this.V.f31218d);
                    }
                }
                String str4 = this.W.f31220a;
                float f7 = this.W.f31221b;
                float f8 = this.W.f31222c;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "";
                    this.f77903d.a("", 0.0f, 0.0f);
                } else {
                    this.f77903d.a(str4, f7, f8);
                }
                this.W.f31220a = str4;
                this.W.f31221b = f7;
                this.W.f31222c = f8;
                String str5 = this.W.f31220a;
                Map<Integer, Float> map = this.W.f31223d;
                this.W.f31220a = str5;
                this.W.a(map);
                this.f77903d.a(str5, map);
                String str6 = this.X.f31210a;
                float f9 = this.X.f31211b;
                float f10 = this.X.f31212c;
                this.X.f31210a = str6;
                this.X.f31211b = f9;
                this.X.f31212c = f10;
                if (TextUtils.isEmpty(str6)) {
                    this.X.f31210a = "";
                    this.f77903d.b("", 0.0f, 0.0f);
                } else {
                    this.X.f31210a = str6;
                    this.f77903d.b(str6, f9, f10);
                }
                if (!TextUtils.isEmpty(this.X.f31210a)) {
                    a(19, this.X.f31213d);
                    a(20, this.X.f31214e);
                }
                String str7 = this.U.f31205a;
                int i6 = this.U.f31208d;
                int i7 = this.U.f31209e;
                boolean z = this.U.f31207c;
                if (TextUtils.isEmpty(str7)) {
                    str7 = "";
                    this.f77903d.a("", i6, i7, z);
                } else {
                    this.f77903d.a(str7, i6, i7, z);
                }
                this.U.f31205a = str7;
                this.U.f31206b = false;
                this.U.f31207c = z;
                this.U.f31208d = i6;
                this.U.f31209e = i7;
            }
            this.f77903d.d();
            int a2 = this.f77903d.a(this.f77900a.size(), this.k);
            if (a2 != 0) {
                String str8 = this.f77901b;
                y.d(str8, "tryRestore ret: " + a2);
            } else {
                this.i = (long) com.ss.android.medialib.model.b.a(this.f77900a);
            }
            i();
            this.f77903d.a((MediaRecordPresenter.a) this.E == null ? null : new MediaRecordPresenter.a() {
                public final boolean as_() {
                    if (b.this.E == null || !b.this.E.a()) {
                        return false;
                    }
                    return true;
                }

                public final void a(com.ss.android.medialib.model.a aVar) {
                    b.this.E.a(aVar.f29700a, aVar.f29701b, aVar.f29702c, aVar.f29703d, aVar.f29704e, aVar.f29705f);
                }
            });
        }
    }

    public final void a(Surface surface) {
        this.Z = false;
        y.b(this.f77901b, "surfaceCreated");
        this.f77904e.getHolder().setType(3);
        this.g = new a(this.f77904e.getHolder().getSurface(), true);
        if (this.f77904e != null) {
            this.f77904e.getHolder();
        }
        k();
        this.f77904e.setLayoutParams(this.f77904e.getLayoutParams());
        this.f77904e.requestLayout();
    }

    public final void a(Surface surface, int i2, int i3, int i4) {
        if (this.r != null && this.r.f77938f) {
            this.f77903d.a(surface);
            this.f77903d.e(2);
        }
    }

    public final void a(am amVar) {
        super.a(amVar);
        if (amVar.f77898a > -1.0f) {
            this.f77903d.a(amVar.f77898a);
        }
        this.f77903d.b(amVar.f77899b);
    }

    public final void a(@Nullable Surface surface, VEListener.c cVar) {
        y.c(this.f77901b, "startPreviewAsync is now not asynchronous!!!");
        this.g = new a(surface, true);
        k();
        if (cVar != null) {
            cVar.a(0);
        }
    }

    public final void a(VEListener.c cVar) {
        y.c(this.f77901b, "stopPreviewAsync is now not asynchronous!!!");
        l();
        if (cVar != null) {
            cVar.a(0);
        }
    }

    public final void a(final af.c cVar) {
        super.a(cVar);
        this.f77903d.a((MediaRecordPresenter.a) cVar == null ? null : new MediaRecordPresenter.a() {
            public final boolean as_() {
                if (cVar == null || !cVar.a()) {
                    return false;
                }
                return true;
            }

            public final void a(com.ss.android.medialib.model.a aVar) {
                cVar.a(aVar.f29700a, aVar.f29701b, aVar.f29702c, aVar.f29703d, aVar.f29704e, aVar.f29705f);
            }
        });
    }

    public final long b() {
        return this.f77903d.e();
    }

    public final void e() {
        this.f77903d.m();
    }

    public final void f() {
        this.f77903d.n();
    }

    public final boolean ar_() {
        if (this.O != ae.REACTION || this.N == null || this.N.f77874b == null || this.N.f77873a == null) {
            return false;
        }
        return true;
    }

    private void i() {
        float f2;
        if (!"landscape".equals(this.G.k)) {
            f2 = ((float) this.f77902c.c()) / ((float) this.f77902c.d());
        } else {
            f2 = ((float) this.f77902c.d()) / ((float) this.f77902c.c());
        }
        this.f77903d.b(f2);
    }

    private void k() {
        FaceBeautyInvoker.setNativeInitListener(this);
        this.f77902c.a((c) this.f77903d);
        this.f77902c.f29528d = this;
        this.f77902c.f29529e = this;
        if (this.o) {
            this.f77902c.a((IESCameraInterface.d) new IESCameraInterface.d() {
                public final boolean a() {
                    if (b.this.w == null || !b.this.w.a()) {
                        return false;
                    }
                    return true;
                }

                public final void a(int i, float f2, boolean z) {
                    if (b.this.w != null) {
                        b.this.w.a(i, f2, z);
                    }
                }

                public final void a(int i, boolean z, boolean z2, float f2, List<Integer> list) {
                    if (b.this.w != null) {
                        b.this.w.a(i, z, z2, f2, list);
                    }
                }
            });
        }
        j();
    }

    private void l() {
        if (this.f77903d != null) {
            g();
        }
        synchronized (this) {
            if (this.f77902c != null) {
                this.f77902c.j();
                this.f77902c.f29528d = null;
                this.f77902c.f29529e = null;
                this.f77902c.a((IESCameraInterface.d) null);
            }
        }
        if (this.f77903d != null) {
            this.f77903d.l();
            this.f77903d.j();
            FaceBeautyInvoker.setNativeInitListener(null);
            this.f77903d.a((a.C0357a) null);
            FaceBeautyInvoker.setFaceDetectListener(null);
        }
    }

    public final void d() {
        if (!this.Z) {
            l();
        }
        this.V = null;
        this.W = null;
        this.X = null;
        this.T = null;
        this.U = null;
        this.f77902c = null;
        this.f77904e = null;
        this.u = null;
        this.t = null;
        this.v = null;
        this.w = null;
        this.f77905f = null;
        this.q = null;
        this.f77903d = null;
        if (this.r != null) {
            this.r.b((d) this);
        }
        super.d();
    }

    private void j() {
        int i2;
        String str = this.f77901b;
        y.b(str, "initCamera... thread id = " + Thread.currentThread().getId());
        if (!this.o) {
            y.d(this.f77901b, "No init!!!");
            return;
        }
        AnonymousClass7 r0 = new com.ss.android.medialib.camera.c() {
            public final void a(int i) {
                boolean z;
                int i2;
                int i3;
                boolean z2;
                synchronized (this) {
                    if (b.this.f77902c != null && b.this.f77902c.h()) {
                        b bVar = b.this;
                        int i4 = bVar.H.getVideoRes().f77890a;
                        int i5 = bVar.H.getVideoRes().f77891b;
                        boolean z3 = !TextUtils.isEmpty(bVar.P);
                        if (bVar.O != ae.DUET || bVar.M == null || bVar.M.f78031a == null || bVar.M.f78032b == null) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            i5 /= 2;
                        }
                        int i6 = i5;
                        aj ajVar = bVar.j.f77864a;
                        bVar.f77903d.c(1);
                        MediaRecordPresenter mediaRecordPresenter = bVar.f77903d;
                        if (ajVar == null) {
                            i2 = 1280;
                        } else {
                            i2 = ajVar.f77891b;
                        }
                        if (ajVar == null) {
                            i3 = 720;
                        } else {
                            i3 = ajVar.f77890a;
                        }
                        mediaRecordPresenter.a(i2, i3, bVar.k, i6, i4, bVar.K, z3 ? 1 : 0, bVar.L);
                        bVar.f77903d.a(bVar.F);
                        if (z) {
                            bVar.f77903d.a(bVar.M.f78031a, bVar.M.f78032b, bVar.M.f78033c, bVar.M.f78034d, bVar.M.f78035e, bVar.M.f78036f);
                        } else if (bVar.ar_()) {
                            bVar.f77903d.a(bVar.f77904e.getContext(), bVar.N.f77873a, bVar.N.f77874b);
                        }
                        bVar.f77903d.j.enableBlindWaterMark(false);
                        bVar.f77903d.e(bVar.j.f77867d);
                        bVar.f77902c.c(bVar.G.l);
                        y.b(bVar.f77901b, "onOpenSuccess... thread id = " + Thread.currentThread().getId());
                        bVar.f77902c.a(bVar.q);
                        MediaRecordPresenter mediaRecordPresenter2 = bVar.f77903d;
                        if (bVar.O == ae.DEFAULT && bVar.S == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        mediaRecordPresenter2.a(z2);
                        bVar.f77903d.a(bVar.q.getApplicationContext(), bVar.a(false), (AudioRecorderInterface) bVar);
                        bVar.f77903d.c(1);
                        bVar.f77903d.c(bVar.j.f77866c);
                        bVar.f77903d.a(bVar.g.f77922b, Build.DEVICE);
                    }
                }
            }

            public final void a(int i, int i2, String str) {
                b bVar = b.this;
                if (bVar.u != null) {
                    bVar.u.a(i2);
                }
            }
        };
        l.b bVar = l.b.FACING_BACK;
        if (this.G != null) {
            bVar = this.G.j;
        }
        g gVar = this.f77902c;
        if (bVar == l.b.FACING_WIDE_ANGLE) {
            i2 = 2;
        } else if (bVar == l.b.FACING_FRONT) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        gVar.a(i2, (com.ss.android.medialib.camera.c) r0);
    }

    public final int g() {
        float f2;
        if (this.m || !this.h) {
            return 0;
        }
        this.h = false;
        this.f77903d.g();
        while (this.f77903d.h()) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException unused) {
            }
        }
        long e2 = this.f77903d.e() / 1000;
        this.f77900a.add(new com.ss.android.medialib.model.b(e2, (double) this.n));
        synchronized (this) {
            this.p = -1;
            f2 = (float) e2;
            this.i = (long) (((float) this.i) + ((1.0f * f2) / this.n));
        }
        this.m = true;
        return (int) (f2 / this.n);
    }

    public final void a() {
        y.a(this.f77901b, "delete last frag !!!");
        if (this.f77900a.size() > 0) {
            this.f77900a.remove(this.f77900a.size() - 1);
            this.i = (long) com.ss.android.medialib.model.b.a(this.f77900a);
            this.f77903d.f();
        }
    }

    public final void b(int i2) {
        this.l = i2;
    }

    public final int closeWavFile(boolean z) {
        y.b(this.f77901b, "closeWavFile...");
        return 0;
    }

    public final void b(Surface surface) {
        l();
        this.Z = true;
    }

    public final int c(Surface surface) {
        this.g = new a(surface, true);
        int a2 = this.f77903d.a(surface);
        this.f77903d.e(2);
        return a2;
    }

    public final void b(VEListener.c cVar) {
        y.c(this.f77901b, "stopRecordAsync is now not asynchronous!!!");
        int g2 = g();
        if (cVar != null) {
            cVar.a(g2);
        }
    }

    public final void b(boolean z) {
        this.f77903d.d(z ? 1 : 0);
    }

    private int a(float f2) {
        int i2;
        if (!this.m) {
            return -105;
        }
        this.h = true;
        this.n = f2;
        this.f77903d.b(this.q, a(true), (AudioRecorderInterface) this);
        this.f77903d.a(this.Q, this.i);
        if (this.H == null || this.H.getBitrateMode() != VEVideoEncodeSettings.c.ENCODE_BITRATE_CRF) {
            this.f77903d.a(VEVideoEncodeSettings.c.ENCODE_BITRATE_QP.ordinal(), this.H.getSwQP());
        } else {
            int swCRF = this.H.getSwCRF();
            MediaRecordPresenter mediaRecordPresenter = this.f77903d;
            int ordinal = VEVideoEncodeSettings.c.ENCODE_BITRATE_CRF.ordinal();
            if (swCRF < 12) {
                swCRF = 12;
            }
            mediaRecordPresenter.a(ordinal, swCRF);
        }
        float f3 = this.n;
        VEVideoEncodeSettings vEVideoEncodeSettings = this.H;
        float bps = (((float) vEVideoEncodeSettings.getBps()) * 1.0f) / 4194304.0f;
        if (vEVideoEncodeSettings.getEncodeProfile() == VEVideoEncodeSettings.e.ENCODE_PROFILE_MAIN.ordinal()) {
            i2 = 2;
        } else if (vEVideoEncodeSettings.getEncodeProfile() == VEVideoEncodeSettings.e.ENCODE_PROFILE_HIGH.ordinal()) {
            i2 = 8;
        } else {
            i2 = 1;
        }
        int a2 = this.f77903d.a((double) f3, !vEVideoEncodeSettings.isSupportHwEnc(), bps, 1, i2, false);
        this.m = false;
        synchronized (this) {
            this.p = 0;
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final int a(boolean z) {
        if (!this.j.f77865b && !z) {
            return 0;
        }
        if (this.O == ae.DUET || this.O == ae.REACTION || !TextUtils.isEmpty(this.P)) {
            return 5;
        }
        return 1;
    }

    public final void a(int i2, int i3) {
        boolean z;
        if (this.t != null) {
            VEListener.q qVar = this.t;
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            qVar.a(z);
        }
    }

    public final int addPCMData(byte[] bArr, int i2) {
        y.b(this.f77901b, "addPCMData...");
        if (this.v != null) {
            Arrays.copyOf(bArr, i2);
        }
        return 0;
    }

    public final void b(int i2, int i3) {
        y.b(this.f77901b, "previewSize");
        i();
    }

    public final void a(float f2, VEListener.c cVar) {
        y.c(this.f77901b, "startRecordAsync is now not asynchronous!!!");
        int a2 = a(f2);
        if (cVar != null) {
            cVar.a(a2);
        }
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
        return this.f77903d.a(i2, f2);
    }

    public final int initWavFile(int i2, int i3, double d2) {
        y.b(this.f77901b, "initWavFile...");
        return 0;
    }

    public b(Context context, com.ss.android.vesdk.runtime.d dVar, com.ss.android.vesdk.d.c cVar) {
        super(context, dVar, cVar);
        if (cVar instanceof com.ss.android.vesdk.d.a) {
            this.f77904e = ((com.ss.android.vesdk.d.a) cVar).f77931a;
        } else if (cVar instanceof com.ss.android.vesdk.d.b) {
            this.f77905f = ((com.ss.android.vesdk.d.b) cVar).f77932a;
        }
        if (this.r != null) {
            this.r.a((d) this);
        }
        this.q = context;
        this.f77902c = g.b();
        this.f77903d = new MediaRecordPresenter();
    }

    public final int a(String str, long j2, long j3, int i2) {
        boolean z;
        super.a(str, j2, j3, i2);
        if (this.O == ae.DEFAULT) {
            MediaRecordPresenter a2 = this.f77903d.a(str).a(j2, 0);
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            a2.a(z);
            if (TextUtils.isEmpty(this.P)) {
                this.f77903d.b(this.q.getApplicationContext(), 1, (AudioRecorderInterface) this);
            } else {
                this.f77903d.b(this.q.getApplicationContext(), 5, (AudioRecorderInterface) this);
            }
        }
        return 0;
    }

    public final int a(@NonNull List<ak> list, String str, int i2, int i3) {
        List list2;
        a(str, (long) i2, this.R, i3);
        this.f77900a.clear();
        List<com.ss.android.medialib.model.b> list3 = this.f77900a;
        if (list == null || list.size() == 0) {
            list2 = Collections.emptyList();
        } else {
            list2 = new ArrayList();
            for (ak next : list) {
                list2.add(new com.ss.android.medialib.model.b(next.f29707b, next.f29708c));
            }
        }
        list3.addAll(list2);
        this.i = (long) com.ss.android.medialib.model.b.a(this.f77900a);
        return this.f77903d.a(list.size(), this.k);
    }

    public final int a(String str, int i2, int i3, boolean z, boolean z2, Bitmap.CompressFormat compressFormat, af.b bVar) {
        int i4 = i2;
        int i5 = i3;
        String str2 = this.f77901b;
        y.b(str2, "shot screen save to " + str);
        if (i4 <= 720) {
            final boolean z3 = z;
            final af.b bVar2 = bVar;
            AnonymousClass3 r12 = new a.b() {
                public final void a(int i) {
                    bVar2.a(i);
                }
            };
            return this.f77903d.a(str, new int[]{i4, i5}, z2, compressFormat, (a.b) r12);
        }
        final boolean z4 = z;
        final af.b bVar3 = bVar;
        final String str3 = str;
        final Bitmap.CompressFormat compressFormat2 = compressFormat;
        final AnonymousClass5 r0 = new MediaRecordPresenter.b() {
            public final void a(Bitmap bitmap, int i) {
                bVar3.a(i);
                com.ss.android.medialib.common.b.a(bitmap, str3, compressFormat2);
                if (i != 0 || z4) {
                    g b2 = g.b();
                    if (PatchProxy.isSupport(new Object[0], b2, g.f29525a, false, 16784, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], b2, g.f29525a, false, 16784, new Class[0], Void.TYPE);
                        return;
                    }
                    y.b("IESCameraManager", "re-startPreview...");
                    synchronized (b2.s) {
                        if (b2.f29527c != null) {
                            b2.f29527c.d();
                        }
                    }
                }
            }
        };
        MediaRecordPresenter mediaRecordPresenter = this.f77903d;
        AnonymousClass6 r2 = new MediaRecordPresenter.c() {
            public final void a(Bitmap bitmap) {
                r0.a(bitmap, 0);
            }

            public final void a(int i) {
                if (i < 0) {
                    r0.a(null, i);
                }
            }
        };
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), 0, r2}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17694, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, MediaRecordPresenter.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), 0, r2}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17694, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, MediaRecordPresenter.c.class}, Void.TYPE);
        } else {
            y.b(MediaRecordPresenter.f29729b, "start ======");
            g b2 = g.b();
            MediaRecordPresenter.AnonymousClass3 r02 = new IESCameraInterface.b(r2, i2, i3, 0) {

                /* renamed from: a */
                public static ChangeQuickRedirect f29747a;

                /* renamed from: b */
                final /* synthetic */ c f29748b;

                /* renamed from: c */
                final /* synthetic */ int f29749c;

                /* renamed from: d */
                final /* synthetic */ int f29750d;

                /* renamed from: e */
                final /* synthetic */ int f29751e;

                public final void a(
/*
Method generation error in method: com.ss.android.medialib.presenter.MediaRecordPresenter.3.a(com.ss.android.medialib.camera.j):void, dex: classes4.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.medialib.presenter.MediaRecordPresenter.3.a(com.ss.android.medialib.camera.j):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                
*/
            };
            b2.a(i5, i4, (IESCameraInterface.b) r02);
        }
        return 0;
    }
}
