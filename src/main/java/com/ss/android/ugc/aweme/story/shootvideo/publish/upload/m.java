package com.ss.android.ugc.aweme.story.shootvideo.publish.upload;

import android.graphics.Bitmap;
import android.support.v4.os.CancellationSignal;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.shortvideo.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.ei;
import com.ss.android.ugc.aweme.shortvideo.fl;
import com.ss.android.ugc.aweme.shortvideo.fo;
import com.ss.android.ugc.aweme.shortvideo.k;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.w;
import java.io.IOException;
import java.util.LinkedHashMap;

public final class m extends k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73758a;

    /* renamed from: c  reason: collision with root package name */
    private final fl f73759c = new fl();

    /* renamed from: d  reason: collision with root package name */
    private final TTUploaderService f73760d;

    /* renamed from: e  reason: collision with root package name */
    private fo f73761e;

    public m(TTUploaderService tTUploaderService) {
        this.f73760d = tTUploaderService;
        this.f73761e = new fo(tTUploaderService);
    }

    public final long b(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, this, f73758a, false, 85505, new Class[]{Object.class}, Long.TYPE)) {
            return this.f73759c.c(obj2);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{obj2}, this, f73758a, false, 85505, new Class[]{Object.class}, Long.TYPE)).longValue();
    }

    public final Bitmap c(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, this, f73758a, false, 85504, new Class[]{Object.class}, Bitmap.class)) {
            return this.f73759c.b(obj2);
        }
        return (Bitmap) PatchProxy.accessDispatch(new Object[]{obj2}, this, f73758a, false, 85504, new Class[]{Object.class}, Bitmap.class);
    }

    public final boolean d(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, this, f73758a, false, 85506, new Class[]{Object.class}, Boolean.TYPE)) {
            return this.f73759c.d(obj2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f73758a, false, 85506, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final ei<SynthetiseResult> a(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, this, f73758a, false, 85498, new Class[]{Object.class}, ei.class)) {
            return this.f73759c.a(obj2);
        }
        return (ei) PatchProxy.accessDispatch(new Object[]{obj2}, this, f73758a, false, 85498, new Class[]{Object.class}, ei.class);
    }

    public final q<VideoCreation> a(Object obj, SynthetiseResult synthetiseResult) {
        if (PatchProxy.isSupport(new Object[]{obj, synthetiseResult}, this, f73758a, false, 85500, new Class[]{Object.class, SynthetiseResult.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{obj, synthetiseResult}, this, f73758a, false, 85500, new Class[]{Object.class, SynthetiseResult.class}, q.class);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aweme_type", "14");
        q<VideoCreation> a2 = this.f73760d.a(linkedHashMap);
        l.a(a2, new bl(), com.ss.android.ugc.aweme.base.k.f34752b);
        l.a(a2, new d(), com.ss.android.ugc.aweme.base.k.f34752b);
        return a2;
    }

    public final ei<SynthetiseResult> a(Object obj, CancellationSignal cancellationSignal) {
        Object obj2 = obj;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        if (!PatchProxy.isSupport(new Object[]{obj2, cancellationSignal2}, this, f73758a, false, 85499, new Class[]{Object.class, CancellationSignal.class}, ei.class)) {
            return this.f73759c.a(obj2, cancellationSignal2);
        }
        return (ei) PatchProxy.accessDispatch(new Object[]{obj2, cancellationSignal2}, this, f73758a, false, 85499, new Class[]{Object.class, CancellationSignal.class}, ei.class);
    }

    public final ei<VideoCreation> a(Object obj, VideoCreation videoCreation) {
        String str;
        VideoCreation videoCreation2 = videoCreation;
        if (PatchProxy.isSupport(new Object[]{obj, videoCreation2}, this, f73758a, false, 85501, new Class[]{Object.class, VideoCreation.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{obj, videoCreation2}, this, f73758a, false, 85501, new Class[]{Object.class, VideoCreation.class}, ei.class);
        }
        cb cbVar = (cb) obj;
        fo foVar = this.f73761e;
        String outputFile = cbVar.getOutputFile();
        float f2 = cbVar.mVideoCoverStartTm;
        if (cbVar.mFromCut || cbVar.mFromMultiCut) {
            str = f.i();
        } else {
            str = f.h();
        }
        ei<VideoCreation> a2 = foVar.a(outputFile, f2, str, videoCreation2);
        l.a(a2, new p(), com.ss.android.ugc.aweme.base.k.f34752b);
        return a2;
    }

    public final q<? extends at> a(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        q<? extends at> qVar;
        Object obj2 = obj;
        VideoCreation videoCreation2 = videoCreation;
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        if (PatchProxy.isSupport(new Object[]{obj2, videoCreation2, synthetiseResult2}, this, f73758a, false, 85502, new Class[]{Object.class, VideoCreation.class, SynthetiseResult.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{obj2, videoCreation2, synthetiseResult2}, this, f73758a, false, 85502, new Class[]{Object.class, VideoCreation.class, SynthetiseResult.class}, q.class);
        }
        cb cbVar = (cb) obj2;
        if (PatchProxy.isSupport(new Object[]{cbVar, videoCreation2}, this, f73758a, false, 85503, new Class[]{cb.class, VideoCreation.class}, q.class)) {
            qVar = (q) PatchProxy.accessDispatch(new Object[]{cbVar, videoCreation2}, this, f73758a, false, 85503, new Class[]{cb.class, VideoCreation.class}, q.class);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("media_type", "14");
            if (cbVar.videoType == 9) {
                linkedHashMap.put("dynamic_image", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            e.a(cbVar, linkedHashMap);
            qVar = a.z.a(videoCreation2.materialId, linkedHashMap);
            if (com.ss.android.g.a.a()) {
                qVar = l.a(qVar, IOException.class, new o(videoCreation2, linkedHashMap), v.a());
            }
            l.a(qVar, new a(), v.a());
        }
        return l.a(qVar, com.ss.android.ugc.aweme.base.api.a.b.a.class, w.a(new n(this, obj2, videoCreation2, synthetiseResult2)), com.ss.android.ugc.aweme.base.k.f34752b);
    }
}
