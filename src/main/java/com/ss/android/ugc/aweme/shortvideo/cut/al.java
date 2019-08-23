package com.ss.android.ugc.aweme.shortvideo.cut;

import android.support.v4.util.Pair;
import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.medialib.e;
import com.ss.android.medialib.model.Point;
import com.ss.android.medialib.model.Segment;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.a.d;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;
import com.ss.android.ugc.aweme.shortvideo.e.j;
import com.ss.android.ugc.aweme.shortvideo.ff;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public final class al implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66362a;

    /* renamed from: b  reason: collision with root package name */
    e f66363b;

    /* renamed from: c  reason: collision with root package name */
    public a f66364c;

    /* renamed from: d  reason: collision with root package name */
    public long f66365d = ff.a();

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shortvideo.cut.model.a f66366e;

    /* renamed from: f  reason: collision with root package name */
    private d f66367f;
    private Pair<Long, Long> g;
    private List<String> h;

    public interface a {
        void a(int i);

        void b(int i);
    }

    public final void run() {
        int i;
        FFMpegManager.a aVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (PatchProxy.isSupport(new Object[0], this, f66362a, false, 75528, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66362a, false, 75528, new Class[0], Void.TYPE);
        } else if (Lists.isEmpty(this.h) || this.g == null) {
            throw new IllegalArgumentException("数据错误，视频合成失败！");
        } else {
            FFMpegManager.a aVar2 = new FFMpegManager.a();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            int size = this.h.size();
            int i2 = 0;
            float f2 = 0.0f;
            while (i2 < size) {
                int size2 = this.f66366e.getVideoSegmentList().size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        i = size;
                        aVar = aVar2;
                        arrayList = arrayList7;
                        arrayList2 = arrayList8;
                        break;
                    }
                    h hVar = this.f66366e.getVideoSegmentList().get(i3);
                    if (hVar.f66495b.equals(this.h.get(i2))) {
                        Segment segment = new Segment();
                        segment.setPath(hVar.f66495b);
                        segment.setSpeed(this.f66366e.totalSpeed * hVar.f66499f);
                        segment.setRotateAngle(hVar.k);
                        ArrayList arrayList11 = new ArrayList();
                        long a2 = a(i3);
                        i = size;
                        aVar = aVar2;
                        if (this.h.size() == 1) {
                            arrayList4 = arrayList7;
                            arrayList3 = arrayList8;
                            arrayList11.add(new Point(((Long) this.g.first).longValue() - a2, ((Long) this.g.second).longValue() - a2));
                        } else {
                            arrayList4 = arrayList7;
                            arrayList3 = arrayList8;
                            if (i2 == 0) {
                                arrayList11.add(new Point(((Long) this.g.first).longValue() - a2, hVar.f66498e));
                            } else if (i2 == this.h.size() - 1) {
                                arrayList11.add(new Point(hVar.f66497d, ((Long) this.g.second).longValue() - a2));
                            } else {
                                arrayList11.add(new Point(hVar.f66497d, hVar.f66498e));
                            }
                        }
                        segment.setPoints(arrayList11);
                        f2 += ((float) (((Point) arrayList11.get(0)).getRight() - ((Point) arrayList11.get(0)).getLeft())) / hVar.f66499f;
                        arrayList5.add(segment);
                        String a3 = j.a.a(new File(hVar.f66495b));
                        hVar.o = a3;
                        arrayList10.add(a3);
                        arrayList6.add(hVar.f66495b);
                        arrayList = arrayList4;
                        arrayList.add(Integer.valueOf((int) hVar.f66496c));
                        arrayList2 = arrayList3;
                        arrayList2.add(Integer.valueOf(hVar.g));
                        arrayList9.add(Integer.valueOf(hVar.h));
                    } else {
                        int i4 = size;
                        FFMpegManager.a aVar3 = aVar2;
                        ArrayList arrayList12 = arrayList7;
                        ArrayList arrayList13 = arrayList8;
                        i3++;
                    }
                }
                i2++;
                arrayList7 = arrayList;
                arrayList8 = arrayList2;
                size = i;
                aVar2 = aVar;
            }
            FFMpegManager.a aVar4 = aVar2;
            ArrayList arrayList14 = arrayList7;
            ArrayList arrayList15 = arrayList8;
            if (BigDecimal.valueOf((double) (f2 / 1000.0f)).setScale(1, RoundingMode.HALF_UP).floatValue() < ((float) (this.f66365d / 1000)) * 1.0f) {
                if (this.f66364c != null) {
                    this.f66364c.b(-1);
                }
                return;
            }
            int i5 = -2;
            if (BigDecimal.valueOf((double) (f2 / 60000.0f)).setScale(1, RoundingMode.HALF_UP).floatValue() > 60.0f) {
                if (this.f66364c != null) {
                    this.f66364c.b(-2);
                }
                return;
            }
            FFMpegManager.a aVar5 = aVar4;
            aVar5.w = arrayList5;
            aVar5.f29316b = this.f66367f.c().getPath();
            aVar5.f29317c = this.f66367f.d().getPath();
            aVar5.o = com.ss.android.ugc.aweme.port.in.a.r.getVideoWidth();
            aVar5.p = com.ss.android.ugc.aweme.port.in.a.r.getVideoHeight();
            aVar5.i = j.a(false, true, com.ss.android.ugc.aweme.port.in.a.f61119b, arrayList6, arrayList14, arrayList15, arrayList9, arrayList10, null);
            aVar5.u = true;
            aVar5.q = f.l();
            aVar5.r = f.o();
            aVar5.s = f.n();
            aVar5.t = (int) f.m();
            FFMpegManager.a aVar6 = aVar5;
            if (PatchProxy.isSupport(new Object[]{aVar5}, this, f66362a, false, 75529, new Class[]{FFMpegManager.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar6}, this, f66362a, false, 75529, new Class[]{FFMpegManager.a.class}, Void.TYPE);
            } else if (com.ss.android.ugc.aweme.g.a.a() && (TextUtils.isEmpty(aVar6.f29317c) || TextUtils.isEmpty(aVar6.f29316b))) {
                throw new IllegalStateException("multi video encode params error: " + aVar6);
            }
            if (this.f66363b != null) {
                FFMpegManager.a().a(this.f66363b);
            }
            FFMpegManager a4 = FFMpegManager.a();
            if (PatchProxy.isSupport(new Object[]{aVar6}, a4, FFMpegManager.f29312a, false, 16200, new Class[]{FFMpegManager.a.class}, Integer.TYPE)) {
                FFMpegManager fFMpegManager = a4;
                i5 = ((Integer) PatchProxy.accessDispatch(new Object[]{aVar6}, fFMpegManager, FFMpegManager.f29312a, false, 16200, new Class[]{FFMpegManager.a.class}, Integer.TYPE)).intValue();
            } else {
                com.ss.android.medialib.a.a(0);
                if (aVar6.w != null && !aVar6.w.isEmpty()) {
                    Segment[] segmentArr = new Segment[aVar6.w.size()];
                    aVar6.w.toArray(segmentArr);
                    i5 = a4.f29314b.rencodeAndSplitMutliFile(segmentArr, aVar6.f29316b, aVar6.f29317c, aVar6.i, aVar6.k, aVar6.m, aVar6.u, aVar6.o, aVar6.p, aVar6.q, aVar6.r, aVar6.s, aVar6.t, aVar6.x, aVar6.v);
                    com.ss.android.medialib.a.a(10000);
                }
            }
            FFMpegManager a5 = FFMpegManager.a();
            if (PatchProxy.isSupport(new Object[0], a5, FFMpegManager.f29312a, false, 16195, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], a5, FFMpegManager.f29312a, false, 16195, new Class[0], Void.TYPE);
            } else {
                a5.f29314b.stopGetFrameThumbnail();
            }
            if (this.f66364c != null) {
                this.f66364c.a(i5);
            }
        }
    }

    private long a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66362a, false, 75530, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66362a, false, 75530, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
        } else if (i2 == 0) {
            return 0;
        } else {
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                h hVar = this.f66366e.getVideoSegmentList().get(i4);
                if (!hVar.j) {
                    i3 = (int) (((long) i3) + hVar.f66496c);
                }
            }
            return (long) i3;
        }
    }

    public al(com.ss.android.ugc.aweme.shortvideo.cut.model.a aVar, d dVar, Pair<Long, Long> pair, List<String> list, e eVar) {
        this.f66366e = aVar;
        this.f66367f = dVar;
        this.g = pair;
        this.h = list;
        this.f66363b = eVar;
    }
}
