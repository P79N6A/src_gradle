package com.ss.android.ugc.aweme.shortvideo;

import android.graphics.Bitmap;
import android.support.v4.os.CancellationSignal;
import android.text.TextUtils;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.k;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.upload.a.b;
import com.ss.android.ugc.aweme.utils.fa;
import com.ss.android.ugc.aweme.utils.x;
import com.ss.ttuploader.TTUploadResolver;
import com.ss.ttuploader.TTVideoInfo;
import com.ss.ttuploader.TTVideoUploader;
import com.ss.ttuploader.TTVideoUploaderListener;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public final class fo extends k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67761a;

    /* renamed from: c  reason: collision with root package name */
    private final fl f67762c = new fl();

    /* renamed from: d  reason: collision with root package name */
    private final TTUploaderService f67763d;

    public final ei<VideoCreation> a(Object obj, VideoCreation videoCreation) {
        String str;
        if (PatchProxy.isSupport(new Object[]{obj, videoCreation}, this, f67761a, false, 74646, new Class[]{Object.class, VideoCreation.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{obj, videoCreation}, this, f67761a, false, 74646, new Class[]{Object.class, VideoCreation.class}, ei.class);
        }
        cb cbVar = (cb) obj;
        String outputFile = cbVar.getOutputFile();
        float f2 = cbVar.mVideoCoverStartTm;
        if (cbVar.mOrigin == 0) {
            str = f.i();
        } else {
            str = f.h();
        }
        return a(outputFile, f2, str, videoCreation, cbVar.uploadSpeedInfo);
    }

    public final ei<VideoCreation> a(String str, float f2, String str2, VideoCreation videoCreation) {
        if (PatchProxy.isSupport(new Object[]{str, Float.valueOf(f2), str2, videoCreation}, this, f67761a, false, 74647, new Class[]{String.class, Float.TYPE, String.class, VideoCreation.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{str, Float.valueOf(f2), str2, videoCreation}, this, f67761a, false, 74647, new Class[]{String.class, Float.TYPE, String.class, VideoCreation.class}, ei.class);
        }
        return a(str, f2, str2, videoCreation, new b());
    }

    public fo(TTUploaderService tTUploaderService) {
        this.f67763d = tTUploaderService;
    }

    public final long b(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, this, f67761a, false, 74652, new Class[]{Object.class}, Long.TYPE)) {
            return this.f67762c.c(obj2);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{obj2}, this, f67761a, false, 74652, new Class[]{Object.class}, Long.TYPE)).longValue();
    }

    public final Bitmap c(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, this, f67761a, false, 74651, new Class[]{Object.class}, Bitmap.class)) {
            return this.f67762c.b(obj2);
        }
        return (Bitmap) PatchProxy.accessDispatch(new Object[]{obj2}, this, f67761a, false, 74651, new Class[]{Object.class}, Bitmap.class);
    }

    public final boolean d(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, this, f67761a, false, 74653, new Class[]{Object.class}, Boolean.TYPE)) {
            return this.f67762c.d(obj2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f67761a, false, 74653, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final ei<SynthetiseResult> a(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, this, f67761a, false, 74643, new Class[]{Object.class}, ei.class)) {
            return this.f67762c.a(obj2);
        }
        return (ei) PatchProxy.accessDispatch(new Object[]{obj2}, this, f67761a, false, 74643, new Class[]{Object.class}, ei.class);
    }

    public final q<VideoCreation> a(Object obj, SynthetiseResult synthetiseResult) {
        if (PatchProxy.isSupport(new Object[]{obj, synthetiseResult}, this, f67761a, false, 74645, new Class[]{Object.class, SynthetiseResult.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{obj, synthetiseResult}, this, f67761a, false, 74645, new Class[]{Object.class, SynthetiseResult.class}, q.class);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        cb cbVar = (cb) obj;
        if (!a.a()) {
            this.f67762c.a(cbVar, linkedHashMap);
            this.f67762c.a(cbVar, synthetiseResult, linkedHashMap);
        }
        q<VideoCreation> a2 = this.f67763d.a(linkedHashMap);
        l.a(a2, new bl(), k.f34752b);
        l.a(a2, new bk(), k.f34752b);
        return a2;
    }

    public final ei<SynthetiseResult> a(Object obj, CancellationSignal cancellationSignal) {
        Object obj2 = obj;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        if (!PatchProxy.isSupport(new Object[]{obj2, cancellationSignal2}, this, f67761a, false, 74644, new Class[]{Object.class, CancellationSignal.class}, ei.class)) {
            return this.f67762c.a(obj2, cancellationSignal2);
        }
        return (ei) PatchProxy.accessDispatch(new Object[]{obj2, cancellationSignal2}, this, f67761a, false, 74644, new Class[]{Object.class, CancellationSignal.class}, ei.class);
    }

    public final q<? extends at> a(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        q<? extends at> qVar;
        Object obj2 = obj;
        VideoCreation videoCreation2 = videoCreation;
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        if (PatchProxy.isSupport(new Object[]{obj2, videoCreation2, synthetiseResult2}, this, f67761a, false, 74649, new Class[]{Object.class, VideoCreation.class, SynthetiseResult.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{obj2, videoCreation2, synthetiseResult2}, this, f67761a, false, 74649, new Class[]{Object.class, VideoCreation.class, SynthetiseResult.class}, q.class);
        }
        cb cbVar = (cb) obj2;
        if (PatchProxy.isSupport(new Object[]{cbVar, videoCreation2, synthetiseResult2}, this, f67761a, false, 74650, new Class[]{cb.class, VideoCreation.class, SynthetiseResult.class}, q.class)) {
            qVar = (q) PatchProxy.accessDispatch(new Object[]{cbVar, videoCreation2, synthetiseResult2}, this, f67761a, false, 74650, new Class[]{cb.class, VideoCreation.class, SynthetiseResult.class}, q.class);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("video_id", videoCreation2.materialId);
            linkedHashMap.put("new_sdk", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            fa.a(videoCreation2, linkedHashMap);
            this.f67762c.a(cbVar, linkedHashMap);
            this.f67762c.a(cbVar, synthetiseResult2, linkedHashMap);
            q<? extends at> a2 = com.ss.android.ugc.aweme.port.in.a.t.a((String) null, linkedHashMap);
            if (a.a()) {
                qVar = l.a(a2, IOException.class, new fq(linkedHashMap), v.a());
            } else {
                qVar = a2;
            }
            l.a(qVar, new as(), v.a());
        }
        return l.a(qVar, com.ss.android.ugc.aweme.base.api.a.b.a.class, w.a(new fp(this, obj2, videoCreation2, synthetiseResult2)), k.f34752b);
    }

    private ei<VideoCreation> a(String str, float f2, String str2, VideoCreation videoCreation, b bVar) {
        String str3 = str;
        String str4 = str2;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{str3, Float.valueOf(f2), str4, videoCreation, bVar2}, this, f67761a, false, 74648, new Class[]{String.class, Float.TYPE, String.class, VideoCreation.class, b.class}, ei.class)) {
            Object[] objArr = {str3, Float.valueOf(f2), str4, videoCreation, bVar2};
            return (ei) PatchProxy.accessDispatch(objArr, this, f67761a, false, 74648, new Class[]{String.class, Float.TYPE, String.class, VideoCreation.class, b.class}, ei.class);
        }
        final hl hlVar = ((hf) videoCreation).f68131a;
        final float f3 = f2;
        final String str5 = str;
        AnonymousClass1 r0 = new ei<VideoCreation>("ShortVideoUploader") {
            {
                final TTVideoUploader tTVideoUploader;
                boolean z;
                try {
                    tTVideoUploader = new TTVideoUploader();
                    tTVideoUploader.setListener(new TTVideoUploaderListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f67767a;

                        public final void onLog(int i, int i2, String str) {
                        }

                        public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
                            int i2 = i;
                            long j2 = j;
                            TTVideoInfo tTVideoInfo2 = tTVideoInfo;
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), tTVideoInfo2}, this, f67767a, false, 74656, new Class[]{Integer.TYPE, Long.TYPE, TTVideoInfo.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), tTVideoInfo2}, this, f67767a, false, 74656, new Class[]{Integer.TYPE, Long.TYPE, TTVideoInfo.class}, Void.TYPE);
                            } else if (i2 == 0) {
                                tTVideoUploader.close();
                                AnonymousClass1.this.b(fa.a(tTVideoInfo));
                            } else if (i2 == 2) {
                                tTVideoUploader.close();
                                if (tTVideoInfo2 == null || tTVideoInfo2.mErrcode != 30411) {
                                    AnonymousClass1.this.a((Throwable) new IllegalArgumentException("upload failed."));
                                } else {
                                    AnonymousClass1.this.a((Throwable) new com.ss.android.ugc.aweme.base.api.a.b.a((int) tTVideoInfo2.mErrcode).setErrorMsg(com.ss.android.ugc.aweme.port.in.a.f61119b.getResources().getString(C0906R.string.doy)));
                                }
                            } else {
                                if (i2 == 1) {
                                    AnonymousClass1.this.a((int) j2);
                                }
                            }
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
                    tTVideoUploader.setPoster(f3);
                    tTVideoUploader.setPathName(str5);
                    int i2 = 0;
                    if (hlVar.u == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tTVideoUploader.setOpenResume(z);
                    if (a.c()) {
                        tTVideoUploader.setFileRetryCount(hlVar.g);
                    } else {
                        tTVideoUploader.setFileRetryCount(1);
                    }
                    tTVideoUploader.setUserKey(hlVar.f68154a);
                    tTVideoUploader.setAuthorization(hlVar.i);
                    tTVideoUploader.setSocketNum(1);
                    tTVideoUploader.setEnableMutiTask(hlVar.s);
                    int b2 = com.ss.android.ugc.aweme.port.in.a.L.b(e.a.MaxFansCount);
                    if (b2 > 0) {
                        com.ss.android.ugc.aweme.account.model.e e2 = com.ss.android.ugc.aweme.port.in.a.x.e();
                        i2 = e2 != null ? e2.i() : i2;
                        TreeMap treeMap = new TreeMap();
                        double d2 = (double) i2;
                        Double.isNaN(d2);
                        double d3 = (double) b2;
                        Double.isNaN(d3);
                        treeMap.put("priority", Long.valueOf(Math.min(Math.round(((d2 * 1.0d) / d3) * 100.0d), 100)));
                        tTVideoUploader.setCustomConfig(treeMap);
                    }
                    tTVideoUploader.setOpenBoe(x.a().f4300b);
                    tTVideoUploader.start();
                } catch (Exception e3) {
                    tTVideoUploader.close();
                    throw e3;
                } catch (Exception e4) {
                    a((Throwable) e4);
                }
            }
        };
        l.a(r0, new hj(str3, str4, bVar2), k.f34752b);
        l.a(r0, new hk(str3), k.f34752b);
        return r0;
    }
}
