package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.LifecycleOwner;
import android.graphics.Bitmap;
import android.support.v4.os.CancellationSignal;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.common.utility.DigestUtils;
import com.google.common.a.v;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.model.e;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IFestivalService;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.aweme.shortvideo.cut.ap;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.el;
import com.ss.android.ugc.aweme.shortvideo.fg;
import com.ss.android.ugc.aweme.shortvideo.gq;
import com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.q.b.c;
import com.ss.android.ugc.aweme.shortvideo.q.b.d;
import com.ss.android.ugc.aweme.shortvideo.q.b.i;
import com.ss.android.ugc.aweme.shortvideo.q.b.m;
import com.ss.android.ugc.aweme.shortvideo.upload.CancellationArraySignal;
import com.ss.android.ugc.aweme.shortvideo.upload.a;
import com.ss.android.ugc.aweme.shortvideo.upload.b.b;
import com.ss.android.ugc.aweme.shortvideo.upload.g;
import com.ss.android.ugc.aweme.shortvideo.upload.h;
import com.ss.android.ugc.aweme.shortvideo.upload.k;
import com.ss.android.ugc.aweme.shortvideo.upload.o;
import com.ss.android.ugc.aweme.shortvideo.upload.p;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.utils.fa;
import com.ss.android.ugc.aweme.utils.x;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.ttuploader.TTExternFileReader;
import com.ss.ttuploader.TTUploadResolver;
import com.ss.ttuploader.TTVideoInfo;
import com.ss.ttuploader.TTVideoUploader;
import com.ss.ttuploader.TTVideoUploaderListener;
import dmt.av.video.ad;
import dmt.av.video.ah;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

public final class an extends k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65624a;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f65625c;

    /* renamed from: d  reason: collision with root package name */
    public h f65626d;

    /* renamed from: e  reason: collision with root package name */
    public hi f65627e;

    /* renamed from: f  reason: collision with root package name */
    public b f65628f = new b();
    private fo g;
    private ei<SynthetiseResult> h;
    private q<VideoCreation> i;
    private ei<VideoCreation> j;
    private CancellationSignal k;
    private final TTUploaderService l;
    private final fl m;
    private k n;
    private CancellationArraySignal o;
    private ec p;
    private String q;
    private boolean r;

    public final synchronized ei<VideoCreation> a(Object obj, VideoCreation videoCreation) {
        String str;
        ei<VideoCreation> eiVar;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{obj, videoCreation}, this, f65624a, false, 74023, new Class[]{Object.class, VideoCreation.class}, ei.class)) {
                ei<VideoCreation> eiVar2 = (ei) PatchProxy.accessDispatch(new Object[]{obj, videoCreation}, this, f65624a, false, 74023, new Class[]{Object.class, VideoCreation.class}, ei.class);
                return eiVar2;
            }
            if (this.j == null) {
                cb cbVar = (cb) obj;
                this.f65627e = new hi(cbVar, this, 0);
                this.f65627e.a();
                String str2 = cbVar.mParallelUploadOutputFile;
                float f2 = cbVar.mVideoCoverStartTm;
                if (cbVar.mOrigin == 0) {
                    str = f.i();
                } else {
                    str = f.h();
                }
                String str3 = str;
                String str4 = cbVar.creationId;
                com.ss.android.ugc.aweme.shortvideo.upload.a.b bVar = cbVar.uploadSpeedInfo;
                String str5 = str4;
                if (PatchProxy.isSupport(new Object[]{str2, Float.valueOf(f2), str3, videoCreation, str4, bVar}, this, f65624a, false, 74024, new Class[]{String.class, Float.TYPE, String.class, VideoCreation.class, String.class, com.ss.android.ugc.aweme.shortvideo.upload.a.b.class}, ei.class)) {
                    eiVar = (ei) PatchProxy.accessDispatch(new Object[]{str2, Float.valueOf(f2), str3, videoCreation, str5, bVar}, this, f65624a, false, 74024, new Class[]{String.class, Float.TYPE, String.class, VideoCreation.class, String.class, com.ss.android.ugc.aweme.shortvideo.upload.a.b.class}, ei.class);
                } else {
                    final hl hlVar = ((hf) videoCreation).f68131a;
                    final String str6 = str2;
                    final float f3 = f2;
                    final String str7 = str5;
                    AnonymousClass5 r1 = new ei<VideoCreation>("ConcurrentUploader") {
                        {
                            final TTVideoUploader tTVideoUploader;
                            boolean z;
                            try {
                                final File file = new File(str6);
                                tTVideoUploader = new TTVideoUploader();
                                tTVideoUploader.setListener(new TTVideoUploaderListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f65640a;

                                    public final void onLog(int i, int i2, String str) {
                                    }

                                    public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
                                        int i2 = i;
                                        long j2 = j;
                                        TTVideoInfo tTVideoInfo2 = tTVideoInfo;
                                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), tTVideoInfo2}, this, f65640a, false, 74038, new Class[]{Integer.TYPE, Long.TYPE, TTVideoInfo.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), tTVideoInfo2}, this, f65640a, false, 74038, new Class[]{Integer.TYPE, Long.TYPE, TTVideoInfo.class}, Void.TYPE);
                                        } else if (i2 == 0) {
                                            tTVideoUploader.close();
                                            AnonymousClass5.this.b(fa.a(tTVideoInfo));
                                            an.this.f65627e.a(true, "", null);
                                            an.this.a(true);
                                        } else if (i2 == 2) {
                                            tTVideoUploader.close();
                                            AnonymousClass5.this.a((Throwable) new p(tTVideoInfo2));
                                            hi hiVar = an.this.f65627e;
                                            hiVar.a(false, "errorCode:" + tTVideoInfo2.mErrcode, String.valueOf(tTVideoInfo2.mErrcode));
                                            an.this.a(false);
                                        } else {
                                            if (i2 == 1) {
                                                AnonymousClass5.this.a((int) j2);
                                            }
                                        }
                                    }
                                });
                                tTVideoUploader.setExternFileReader(new TTExternFileReader() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f65643a;

                                    public final void cancel() {
                                    }

                                    public final long getValue(int i) {
                                        int i2;
                                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65643a, false, 74042, new Class[]{Integer.TYPE}, Long.TYPE)) {
                                            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65643a, false, 74042, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
                                        } else if (i == 0 && an.this.f65626d.d()) {
                                            return file.length();
                                        } else {
                                            if (i != 1) {
                                                return -1;
                                            }
                                            try {
                                                i2 = an.this.f65626d.a();
                                            } catch (Exception e2) {
                                                AnonymousClass5.this.a((Throwable) e2);
                                                i2 = -1;
                                            }
                                            return (long) i2;
                                        }
                                    }

                                    public final long getCrc32ByOffset(long j, int i) {
                                        long j2 = j;
                                        if (!PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i)}, this, f65643a, false, 74041, new Class[]{Long.TYPE, Integer.TYPE}, Long.TYPE)) {
                                            return an.this.f65626d.a(j2, (long) i);
                                        }
                                        return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i)}, this, f65643a, false, 74041, new Class[]{Long.TYPE, Integer.TYPE}, Long.TYPE)).longValue();
                                    }

                                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
                                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
                                    /* JADX WARNING: Multi-variable type inference failed */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final int readSlice(int r20, byte[] r21, int r22) {
                                        /*
                                            r19 = this;
                                            r0 = r21
                                            r1 = 3
                                            java.lang.Object[] r2 = new java.lang.Object[r1]
                                            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
                                            r9 = 0
                                            r2[r9] = r3
                                            r10 = 1
                                            r2[r10] = r0
                                            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
                                            r11 = 2
                                            r2[r11] = r3
                                            com.meituan.robust.ChangeQuickRedirect r4 = f65643a
                                            java.lang.Class[] r7 = new java.lang.Class[r1]
                                            java.lang.Class r3 = java.lang.Integer.TYPE
                                            r7[r9] = r3
                                            java.lang.Class<byte[]> r3 = byte[].class
                                            r7[r10] = r3
                                            java.lang.Class r3 = java.lang.Integer.TYPE
                                            r7[r11] = r3
                                            java.lang.Class r8 = java.lang.Integer.TYPE
                                            r5 = 0
                                            r6 = 74039(0x12137, float:1.03751E-40)
                                            r3 = r19
                                            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                                            if (r2 == 0) goto L_0x0069
                                            java.lang.Object[] r12 = new java.lang.Object[r1]
                                            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
                                            r12[r9] = r2
                                            r12[r10] = r0
                                            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
                                            r12[r11] = r0
                                            com.meituan.robust.ChangeQuickRedirect r14 = f65643a
                                            r15 = 0
                                            r16 = 74039(0x12137, float:1.03751E-40)
                                            java.lang.Class[] r0 = new java.lang.Class[r1]
                                            java.lang.Class r1 = java.lang.Integer.TYPE
                                            r0[r9] = r1
                                            java.lang.Class<byte[]> r1 = byte[].class
                                            r0[r10] = r1
                                            java.lang.Class r1 = java.lang.Integer.TYPE
                                            r0[r11] = r1
                                            java.lang.Class r18 = java.lang.Integer.TYPE
                                            r13 = r19
                                            r17 = r0
                                            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                                            java.lang.Integer r0 = (java.lang.Integer) r0
                                            int r0 = r0.intValue()
                                            return r0
                                        L_0x0069:
                                            r1 = r19
                                            com.ss.android.ugc.aweme.shortvideo.an$5 r2 = com.ss.android.ugc.aweme.shortvideo.an.AnonymousClass5.this     // Catch:{ Exception -> 0x007a }
                                            com.ss.android.ugc.aweme.shortvideo.an r2 = com.ss.android.ugc.aweme.shortvideo.an.this     // Catch:{ Exception -> 0x007a }
                                            com.ss.android.ugc.aweme.shortvideo.upload.h r2 = r2.f65626d     // Catch:{ Exception -> 0x007a }
                                            r3 = r20
                                            r4 = r22
                                            int r0 = r2.a(r3, r0, r4)     // Catch:{ Exception -> 0x007a }
                                            goto L_0x007b
                                        L_0x007a:
                                            r0 = -1
                                        L_0x007b:
                                            return r0
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.an.AnonymousClass5.AnonymousClass2.readSlice(int, byte[], int):int");
                                    }

                                    public final int readSliceByOffset(long j, byte[] bArr, int i, int i2) {
                                        int i3;
                                        long j2 = j;
                                        if (PatchProxy.isSupport(new Object[]{new Long(j2), bArr, Integer.valueOf(i), Integer.valueOf(i2)}, this, f65643a, false, 74040, new Class[]{Long.TYPE, byte[].class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                                            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), bArr, Integer.valueOf(i), Integer.valueOf(i2)}, this, f65643a, false, 74040, new Class[]{Long.TYPE, byte[].class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
                                        }
                                        try {
                                            i3 = an.this.f65626d.a(j, bArr, i, i2);
                                        } catch (Exception e2) {
                                            AnonymousClass5.this.a((Throwable) e2);
                                            i3 = -1;
                                        }
                                        return i3;
                                    }
                                });
                                if (hlVar.q == 1) {
                                    tTVideoUploader.setEnableExternNet(hlVar.t);
                                    tTVideoUploader.setTTExternLoader(new gu());
                                    tTVideoUploader.setEnableQuic(hlVar.r);
                                }
                                if (a.a()) {
                                    tTVideoUploader.setEnableUpHost(1);
                                    tTVideoUploader.setEnableServerHost(1);
                                    tTVideoUploader.setEnableExternDNS(hlVar.k);
                                    tTVideoUploader.setAliveMaxFailTime(hlVar.l);
                                    tTVideoUploader.setTcpOpenTimeOutMilliSec(hlVar.o);
                                    TTUploadResolver.setEnableTTNetDNS(hlVar.m);
                                    String str = hlVar.p;
                                    str = TextUtils.isEmpty(str) ? com.ss.android.ugc.aweme.port.in.a.h.c() : str;
                                    tTVideoUploader.setServerParameter("region=" + str);
                                }
                                gw.a(tTVideoUploader, hlVar.j);
                                tTVideoUploader.setEnablePostMethod(hlVar.n);
                                tTVideoUploader.setMaxFailTime(hlVar.h);
                                tTVideoUploader.setSliceSize(hlVar.f68159f);
                                tTVideoUploader.setFileUploadDomain(hlVar.f68155b);
                                tTVideoUploader.setVideoUploadDomain(hlVar.f68156c);
                                tTVideoUploader.setSliceTimeout(hlVar.f68157d);
                                tTVideoUploader.setSliceReTryCount(hlVar.f68158e);
                                if (hlVar.u == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                tTVideoUploader.setOpenResume(z);
                                tTVideoUploader.setPoster(f3);
                                HashMap hashMap = new HashMap(1);
                                hashMap.put(69, str7);
                                tTVideoUploader.setTraceIDConfig(hashMap);
                                if (a.c()) {
                                    tTVideoUploader.setFileRetryCount(hlVar.g);
                                } else {
                                    tTVideoUploader.setFileRetryCount(1);
                                }
                                tTVideoUploader.setUserKey(hlVar.f68154a);
                                tTVideoUploader.setAuthorization(hlVar.i);
                                tTVideoUploader.setSocketNum(1);
                                tTVideoUploader.setEnableMutiTask(hlVar.s);
                                tTVideoUploader.setOpenBoe(x.a().f4300b);
                                tTVideoUploader.start();
                            } catch (Exception e2) {
                                tTVideoUploader.close();
                                throw e2;
                            } catch (Exception e3) {
                                a((Throwable) e3);
                            }
                        }
                    };
                    l.a(r1, new com.ss.android.ugc.aweme.shortvideo.upload.q(str2, str3, bVar, this.f65628f), com.ss.android.ugc.aweme.base.k.f34752b);
                    eiVar = r1;
                }
                this.j = eiVar;
                this.o.a(new ConcurrentUploadFutureFactory$$Lambda$0(this));
            }
            ei<VideoCreation> eiVar3 = this.j;
            return eiVar3;
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65624a, false, 74025, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65624a, false, 74025, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        o a2 = o.a();
        a2.a("shutDown " + z);
        if (z) {
            this.f65626d.b();
            this.p.a(true);
            return;
        }
        if (!this.f65625c) {
            this.f65625c = true;
            if (!this.h.isDone()) {
                this.k.cancel();
            }
            this.f65626d.b();
            this.p.a(false);
        }
    }

    public final long b(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f65624a, false, 74030, new Class[]{Object.class}, Long.TYPE)) {
            return new File(((cb) obj).mParallelUploadOutputFile).length();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{obj}, this, f65624a, false, 74030, new Class[]{Object.class}, Long.TYPE)).longValue();
    }

    public final Bitmap c(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, this, f65624a, false, 74029, new Class[]{Object.class}, Bitmap.class)) {
            return this.g.c(obj2);
        }
        return (Bitmap) PatchProxy.accessDispatch(new Object[]{obj2}, this, f65624a, false, 74029, new Class[]{Object.class}, Bitmap.class);
    }

    public final boolean d(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, this, f65624a, false, 74028, new Class[]{Object.class}, Boolean.TYPE)) {
            return this.g.d(obj2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f65624a, false, 74028, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final ei<SynthetiseResult> a(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f65624a, false, 74019, new Class[]{Object.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{obj2}, this, f65624a, false, 74019, new Class[]{Object.class}, ei.class);
        }
        return a(obj2, new CancellationSignal());
    }

    public final synchronized q<VideoCreation> a(final Object obj, SynthetiseResult synthetiseResult) {
        if (PatchProxy.isSupport(new Object[]{obj, synthetiseResult}, this, f65624a, false, 74022, new Class[]{Object.class, SynthetiseResult.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{obj, synthetiseResult}, this, f65624a, false, 74022, new Class[]{Object.class, SynthetiseResult.class}, q.class);
        }
        if (this.i == null) {
            this.i = this.l.a((LinkedHashMap<String, String>) null);
            l.a(this.i, new com.google.common.util.concurrent.k<VideoCreation>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65634a;

                public final void onFailure(@NotNull Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f65634a, false, 74037, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f65634a, false, 74037, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    an.this.a(false);
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    VideoCreation videoCreation = (VideoCreation) obj;
                    if (PatchProxy.isSupport(new Object[]{videoCreation}, this, f65634a, false, 74036, new Class[]{VideoCreation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{videoCreation}, this, f65634a, false, 74036, new Class[]{VideoCreation.class}, Void.TYPE);
                        return;
                    }
                    if (!an.this.f65625c) {
                        an.this.a(obj, videoCreation);
                    }
                }
            }, com.ss.android.ugc.aweme.base.k.f34752b);
            l.a(this.i, new g(), com.ss.android.ugc.aweme.base.k.f34752b);
        }
        return this.i;
    }

    private ei<SynthetiseResult> a(cb cbVar, CancellationSignal cancellationSignal) {
        VEWatermarkParam vEWatermarkParam;
        ei<SynthetiseResult> eiVar;
        String str;
        boolean z;
        Bitmap bitmap;
        String[] strArr;
        String[] strArr2;
        float f2;
        final cb cbVar2 = cbVar;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        if (PatchProxy.isSupport(new Object[]{cbVar2, cancellationSignal2}, this, f65624a, false, 74021, new Class[]{cb.class, CancellationSignal.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{cbVar2, cancellationSignal2}, this, f65624a, false, 74021, new Class[]{cb.class, CancellationSignal.class}, ei.class);
        }
        this.n = new k();
        k kVar = this.n;
        if (PatchProxy.isSupport(new Object[0], kVar, k.f71019a, false, 80781, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], kVar, k.f71019a, false, 80781, new Class[0], Void.TYPE);
        } else {
            kVar.f71020b = com.google.common.a.q.b();
        }
        this.p = new ec(cbVar2, this.q, this.r);
        ec ecVar = this.p;
        if (PatchProxy.isSupport(new Object[0], ecVar, ec.f66832a, false, 74385, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], ecVar, ec.f66832a, false, 74385, new Class[0], Void.TYPE);
        } else if (ecVar.f66834c) {
            ecVar.f66833b = com.google.common.a.q.a((v) el.e.f67575b);
        }
        if (cbVar.isSaveLocalWithWaterMark()) {
            String md5Hex = DigestUtils.md5Hex(cbVar2.mPath);
            e e2 = com.ss.android.ugc.aweme.port.in.a.x.e();
            if (e2 == null) {
                str = "";
            } else if (TextUtils.isEmpty(e2.a())) {
                str = e2.b();
            } else {
                str = e2.a();
            }
            if (!a.a()) {
                str = com.ss.android.ugc.aweme.port.in.a.f61119b.getString(C0906R.string.iw, new Object[]{str});
            }
            File file = new File(fg.k);
            if (file.exists() || file.mkdirs()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return new ei<SynthetiseResult>() {
                    {
                        a((Throwable) new gq("unable to mkdir " + fg.k, new SynthetiseResult()));
                    }
                };
            }
            int[] a2 = i.a(cbVar);
            if (a.a()) {
                com.ss.android.ugc.aweme.shortvideo.q.b.b[] a3 = d.a(a2[0], a2[1], str, true, ey.a(cbVar2.mSaveModel.getSaveType()), true, new c.a().a(((IFestivalService) ServiceManager.get().getService(IFestivalService.class)).getWaterPicDir()).a());
                bitmap = a3[0].f68959b;
                strArr = d.a(a3, fg.k, md5Hex + "_leftalign");
                strArr2 = d.a(d.a(a2[0], a2[1], str, true, ey.a(cbVar2.mSaveModel.getSaveType()), false, new c.a().a(((IFestivalService) ServiceManager.get().getService(IFestivalService.class)).getWaterPicDir()).a()), fg.k, md5Hex + "_rightalign");
            } else {
                com.ss.android.ugc.aweme.shortvideo.q.b.l[] a4 = m.a(str, true);
                bitmap = a4[0].f68996b;
                strArr = m.a(a4, fg.k, md5Hex + "_leftalign");
                strArr2 = m.a(m.a(str, false), fg.k, md5Hex + "_rightalign");
            }
            vEWatermarkParam = new VEWatermarkParam();
            vEWatermarkParam.needExtFile = true;
            vEWatermarkParam.extFile = cbVar.getLocalTempPath();
            vEWatermarkParam.images = strArr;
            vEWatermarkParam.secondHalfImages = strArr2;
            vEWatermarkParam.interval = 2;
            vEWatermarkParam.xOffset = 16;
            vEWatermarkParam.yOffset = 20;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i2 = a2[0];
            int i3 = a2[1];
            if (i2 < i3) {
                f2 = 0.08695652f;
            } else {
                f2 = 0.13122173f;
            }
            float max = Math.max(((float) i3) * f2, 58.0f);
            float f3 = (float) width;
            float f4 = (f3 * max) / ((float) height);
            vEWatermarkParam.width = (int) f4;
            vEWatermarkParam.height = (int) max;
            float f5 = f4 / f3;
            vEWatermarkParam.xOffset = (int) (((float) vEWatermarkParam.xOffset) * f5);
            vEWatermarkParam.yOffset = (int) (((float) vEWatermarkParam.yOffset) * f5);
            if (cbVar2.mSaveModel != null && ey.a(cbVar2.mSaveModel.getSaveType())) {
                int i4 = a2[1] - a2[0];
                if (i4 > 0) {
                    vEWatermarkParam.yOffset += i4 / 2;
                }
            }
        } else {
            vEWatermarkParam = null;
        }
        try {
            this.f65626d = new am(cbVar2.mParallelUploadOutputFile);
            com.ss.android.ugc.aweme.port.in.a.f();
            this.k = cancellationSignal2;
            this.k.setOnCancelListener(this.o);
            com.ss.android.ugc.aweme.shortvideo.upload.a aVar = new com.ss.android.ugc.aweme.shortvideo.upload.a(this.f65626d, this.o, 0);
            if (PatchProxy.isSupport(new Object[]{cbVar2, vEWatermarkParam, null}, aVar, com.ss.android.ugc.aweme.shortvideo.upload.a.f70946a, false, 80765, new Class[]{cb.class, VEWatermarkParam.class, CancellationSignal.class}, ei.class)) {
                eiVar = (ei) PatchProxy.accessDispatch(new Object[]{cbVar2, vEWatermarkParam, null}, aVar, com.ss.android.ugc.aweme.shortvideo.upload.a.f70946a, false, 80765, new Class[]{cb.class, VEWatermarkParam.class, CancellationSignal.class}, ei.class);
            } else {
                a.AnonymousClass1 r2 = new ei<SynthetiseResult>("ConcurrentUploadCompiler", cbVar2, vEWatermarkParam) {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ cb f70952a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ VEWatermarkParam f70953b;

                    {
                        this.f70952a = r9;
                        this.f70953b = r10;
                        final ad a2 = dmt.av.video.k.a(this.f70952a, (LifecycleOwner) a.this, (SurfaceView) null);
                        final SynthetiseResult synthetiseResult = new SynthetiseResult();
                        synthetiseResult.draftHardEncode = this.f70952a.mHardEncode;
                        synthetiseResult.outputFile = this.f70952a.getOutputFile();
                        synthetiseResult.needRecode = dmt.av.video.k.b(this.f70952a);
                        synthetiseResult.flags |= 1;
                        synthetiseResult.isEnableFpsSet = com.ss.android.ugc.aweme.port.in.a.L.a(e.a.EnableSyntheticFpsSet);
                        synthetiseResult.inputVideoFile = this.f70952a.getInputVideoFile();
                        synthetiseResult.isFastImport = this.f70952a.isFastImport;
                        synthetiseResult.fastImportResolution = this.f70952a.fastImportResolution;
                        if (synthetiseResult.isFastImport && this.f70952a.previewConfigure != null) {
                            ArrayList arrayList = new ArrayList(this.f70952a.previewConfigure.getVideoSegments().size());
                            for (VEVideoSegment next : this.f70952a.previewConfigure.getVideoSegments()) {
                                arrayList.add(new com.ss.android.ugc.aweme.shortvideo.cut.model.h(next.videoPath, next.width, next.height, next.duration));
                            }
                            ap.f66376b.a(arrayList, a2.q);
                        }
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a((com.ss.android.vesdk.p) a2.q, this.f70952a.mainBusinessData);
                        a2.q.c(a.this.f70950e);
                        a2.q.a((com.ss.android.vesdk.m) new b(this, synthetiseResult, a2));
                        a2.q.b((com.ss.android.vesdk.m) new com.ss.android.vesdk.m() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f70955a;

                            /* renamed from: b  reason: collision with root package name */
                            AtomicInteger f70956b = new AtomicInteger(0);

                            public final void a(int i, int i2, float f2, String str) {
                                int i3;
                                int i4 = i;
                                int i5 = i2;
                                float f3 = f2;
                                boolean z = false;
                                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f70955a, false, 80769, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f70955a, false, 80769, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE);
                                    return;
                                }
                                if (AnonymousClass1.this.f70953b == null) {
                                    i3 = 0;
                                } else {
                                    i3 = 1;
                                }
                                if (i4 == 4103) {
                                    ai.d("TE_INFO_COMPILE_DONE ext:" + i5 + " videoExt:" + i3 + " isDone():" + AnonymousClass1.this.isDone());
                                } else if (i4 == 4118) {
                                    String str2 = "TE_INFO_HW_FAILED_TRY_SW_COMPILE ext:" + i5 + " videoExt:" + i3;
                                    ai.b(str2);
                                    n.a("aweme_synthesis_compile_log_vesdk", bi.a().a("log", str2).b());
                                }
                                if (!AnonymousClass1.this.isDone()) {
                                    if (i4 == 4103) {
                                        if (i5 == 0) {
                                            synthetiseResult.videoLength = f3;
                                        }
                                        if (PatchProxy.isSupport(new Object[0], this, f70955a, false, 80768, new Class[0], Boolean.TYPE)) {
                                            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f70955a, false, 80768, new Class[0], Boolean.TYPE)).booleanValue();
                                        } else if (AnonymousClass1.this.f70953b == null || this.f70956b.incrementAndGet() == 2) {
                                            z = true;
                                        }
                                        if (z) {
                                            synthetiseResult.fileFps = (double) ah.b(AnonymousClass1.this.f70952a.mOutputFile);
                                            try {
                                                new dmt.av.video.e().a(AnonymousClass1.this.f70952a);
                                                if (AnonymousClass1.this.f70952a.isSaveLocalWithoutWaterMark()) {
                                                    com.ss.android.ugc.aweme.video.b.e(fg.k);
                                                    com.ss.android.ugc.aweme.video.b.c(synthetiseResult.outputFile, AnonymousClass1.this.f70952a.getLocalTempPath());
                                                }
                                            } catch (Throwable unused) {
                                            }
                                            if (AnonymousClass1.this.b(synthetiseResult)) {
                                                a.i.a((Callable<TResult>) new c<TResult>(a2));
                                            }
                                        }
                                    } else if (i4 == 4105 && i5 == i3) {
                                        AnonymousClass1.this.a((int) (100.0f * f3));
                                    } else if (i4 == 4112) {
                                        synthetiseResult.synthetiseCPUEncode = i5 ^ 1;
                                    } else if (i4 == 4113) {
                                        synthetiseResult.audioLength = f3;
                                    } else if (i4 == 4114) {
                                        a.i.a((Callable<TResult>) new d<TResult>(this, i4, i5, f3), a.i.f1052b);
                                    }
                                }
                            }
                        });
                        a.this.f70949d.a(new ConcurrentUploadCompiler$1$$Lambda$1(this, synthetiseResult, a2, this.f70953b));
                        a2.q.x = new VEListener.j() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f70960a;

                            public final void a(byte[] bArr, int i, int i2, boolean z) {
                                Object obj = bArr;
                                if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f70960a, false, 80772, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f70960a, false, 80772, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                                    return;
                                }
                                try {
                                    a.this.f70947b.a(bArr, i, i2, z);
                                } catch (Exception e2) {
                                    SynthetiseResult clone = synthetiseResult.clone();
                                    clone.ret = gq.FAIL_CODE_PRODUCE_DATA;
                                    if (AnonymousClass1.this.a((Throwable) new gq((Throwable) e2, clone))) {
                                        a2.q.k();
                                    }
                                }
                            }
                        };
                        try {
                            VEVideoEncodeSettings a3 = dmt.av.video.k.a(this.f70952a, synthetiseResult, this.f70953b);
                            a2.q.a("isFastImport", String.valueOf(this.f70952a.isFastImport ? 1 : 0));
                            a2.q.a(this.f70952a.getOutputFile(), (String) null, a3);
                        } catch (Throwable th) {
                            a(th);
                        }
                    }
                };
                l.a(r2, new com.ss.android.ugc.aweme.shortvideo.upload.n(cbVar2.mParallelUploadOutputFile, (long) cbVar.getVideoLength(), cbVar.isMvThemeVideoType()), a.i.f1052b);
                l.a(r2, new gp(), a.i.f1052b);
                l.a(r2, new gr(aVar.f70948c), a.i.f1052b);
                eiVar = r2;
            }
            this.h = eiVar;
            b bVar = this.f65628f;
            if (PatchProxy.isSupport(new Object[0], bVar, b.f71006a, false, 80832, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bVar, b.f71006a, false, 80832, new Class[0], Void.TYPE);
            } else {
                bVar.f71007b = System.currentTimeMillis();
            }
            l.a(this.h, new com.google.common.util.concurrent.k<SynthetiseResult>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65632a;

                public final void onFailure(@NotNull Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f65632a, false, 74035, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f65632a, false, 74035, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    an.this.a(false);
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
                    if (PatchProxy.isSupport(new Object[]{synthetiseResult}, this, f65632a, false, 74034, new Class[]{SynthetiseResult.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{synthetiseResult}, this, f65632a, false, 74034, new Class[]{SynthetiseResult.class}, Void.TYPE);
                        return;
                    }
                    b bVar = an.this.f65628f;
                    if (PatchProxy.isSupport(new Object[0], bVar, b.f71006a, false, 80833, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], bVar, b.f71006a, false, 80833, new Class[0], Void.TYPE);
                    } else {
                        bVar.f71008c = System.currentTimeMillis();
                    }
                    an.this.f65628f.f71009d = an.this.f65626d.e();
                    an.this.f65628f.f71010e = an.this.f65626d.f() - an.this.f65626d.e();
                }
            }, com.ss.android.ugc.aweme.base.k.f34752b);
            a((Object) cbVar2, (SynthetiseResult) null);
            return this.h;
        } catch (Exception unused) {
            return new ei<SynthetiseResult>() {
                {
                    a((Throwable) new gq("unable to mkdir " + cbVar2.mParallelUploadOutputFile, new SynthetiseResult()));
                }
            };
        }
    }

    public final ei<SynthetiseResult> a(Object obj, CancellationSignal cancellationSignal) {
        CancellationSignal cancellationSignal2 = cancellationSignal;
        if (PatchProxy.isSupport(new Object[]{obj, cancellationSignal2}, this, f65624a, false, 74020, new Class[]{Object.class, CancellationSignal.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{obj, cancellationSignal2}, this, f65624a, false, 74020, new Class[]{Object.class, CancellationSignal.class}, ei.class);
        }
        return a((cb) obj, cancellationSignal2);
    }

    an(TTUploaderService tTUploaderService, String str, boolean z) {
        this.l = tTUploaderService;
        this.g = new fo(tTUploaderService);
        this.m = new fl();
        this.o = new CancellationArraySignal();
        this.q = str;
        this.r = z;
    }

    public final q<? extends at> a(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        q<? extends at> qVar;
        Object obj2 = obj;
        VideoCreation videoCreation2 = videoCreation;
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        if (PatchProxy.isSupport(new Object[]{obj2, videoCreation2, synthetiseResult2}, this, f65624a, false, 74026, new Class[]{Object.class, VideoCreation.class, SynthetiseResult.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{obj2, videoCreation2, synthetiseResult2}, this, f65624a, false, 74026, new Class[]{Object.class, VideoCreation.class, SynthetiseResult.class}, q.class);
        }
        cb cbVar = (cb) obj2;
        if (PatchProxy.isSupport(new Object[]{cbVar, videoCreation2, synthetiseResult2}, this, f65624a, false, 74027, new Class[]{cb.class, VideoCreation.class, SynthetiseResult.class}, q.class)) {
            qVar = (q) PatchProxy.accessDispatch(new Object[]{cbVar, videoCreation2, synthetiseResult2}, this, f65624a, false, 74027, new Class[]{cb.class, VideoCreation.class, SynthetiseResult.class}, q.class);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("video_id", videoCreation2.materialId);
            linkedHashMap.put("new_sdk", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            fa.a(videoCreation2, linkedHashMap);
            this.m.a(cbVar, linkedHashMap);
            this.m.a(cbVar, synthetiseResult2, linkedHashMap);
            q<? extends at> a2 = com.ss.android.ugc.aweme.port.in.a.t.a((String) null, linkedHashMap);
            if (com.ss.android.g.a.a()) {
                qVar = l.a(a2, IOException.class, new ap(linkedHashMap), com.google.common.util.concurrent.v.a());
            } else {
                qVar = a2;
            }
            l.a(qVar, new ar(this.n, cbVar.mParallelUploadOutputFile, cbVar.isMvThemeVideoType()), com.google.common.util.concurrent.v.a());
        }
        return l.a(qVar, com.ss.android.ugc.aweme.base.api.a.b.a.class, w.a(new ao(this, obj2, videoCreation2, synthetiseResult2)), com.ss.android.ugc.aweme.base.k.f34752b);
    }
}
