package com.ss.android.ugc.aweme.photomovie;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.am.a;
import com.ss.android.ugc.aweme.photomovie.f;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.ss.android.ugc.aweme.shortvideo.aq;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.shortvideo.bk;
import com.ss.android.ugc.aweme.shortvideo.bl;
import com.ss.android.ugc.aweme.shortvideo.ei;
import com.ss.android.ugc.aweme.shortvideo.fo;
import com.ss.android.ugc.aweme.shortvideo.hg;
import com.ss.android.ugc.aweme.shortvideo.k;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.w;
import com.ss.android.ugc.aweme.utils.fa;
import com.ss.android.ugc.aweme.utils.fb;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.util.LinkedHashMap;

public final class j extends k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59005a;

    /* renamed from: c  reason: collision with root package name */
    private f f59006c = new f();

    /* renamed from: d  reason: collision with root package name */
    private TTUploaderService f59007d;

    public j(TTUploaderService tTUploaderService) {
        this.f59007d = tTUploaderService;
    }

    public final Bitmap c(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f59005a, false, 63966, new Class[]{Object.class}, Bitmap.class)) {
            return fb.a().a(((PhotoMovieContext) obj).mImageList.get(0), 90, 110, 1);
        }
        return (Bitmap) PatchProxy.accessDispatch(new Object[]{obj}, this, f59005a, false, 63966, new Class[]{Object.class}, Bitmap.class);
    }

    public final ei<SynthetiseResult> a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f59005a, false, 63961, new Class[]{Object.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{obj}, this, f59005a, false, 63961, new Class[]{Object.class}, ei.class);
        }
        f fVar = this.f59006c;
        if (PatchProxy.isSupport(new Object[]{obj}, fVar, f.f58993a, false, 63950, new Class[]{Object.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{obj}, fVar, f.f58993a, false, 63950, new Class[]{Object.class}, ei.class);
        }
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) obj;
        if (PatchProxy.isSupport(new Object[]{photoMovieContext}, fVar, f.f58993a, false, 63951, new Class[]{PhotoMovieContext.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{photoMovieContext}, fVar, f.f58993a, false, 63951, new Class[]{PhotoMovieContext.class}, ei.class);
        }
        f.AnonymousClass1 r1 = new ei<SynthetiseResult>("PhotoMovieCompiler", photoMovieContext) {

            /* renamed from: a */
            final /* synthetic */ PhotoMovieContext f58994a;
        };
        l.a(r1, new u(), v.a());
        return r1;
    }

    public final long b(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f59005a, false, 63965, new Class[]{Object.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{obj}, this, f59005a, false, 63965, new Class[]{Object.class}, Long.TYPE)).longValue();
        }
        f fVar = this.f59006c;
        if (!PatchProxy.isSupport(new Object[]{obj}, fVar, f.f58993a, false, 63952, new Class[]{Object.class}, Long.TYPE)) {
            return new File(((PhotoMovieContext) obj).mOutputVideoPath).length();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{obj}, fVar, f.f58993a, false, 63952, new Class[]{Object.class}, Long.TYPE)).longValue();
    }

    public final boolean d(Object obj) {
        boolean z;
        String str;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f59005a, false, 63967, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f59005a, false, 63967, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        f fVar = this.f59006c;
        if (PatchProxy.isSupport(new Object[]{obj}, fVar, f.f58993a, false, 63953, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, fVar, f.f58993a, false, 63953, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) obj;
        if (photoMovieContext.isSaveLocal()) {
            String localTempPath = photoMovieContext.getLocalTempPath();
            boolean isSaveToLocalPathInsteadOfAlbum = photoMovieContext.isSaveToLocalPathInsteadOfAlbum();
            if (photoMovieContext.isSaveToAlbum() || !isSaveToLocalPathInsteadOfAlbum) {
                z = true;
            } else {
                z = false;
            }
            if (!TextUtils.isEmpty(localTempPath) && new File(localTempPath).exists() && new File(localTempPath).length() > 0) {
                if (z) {
                    str = a.a(com.ss.android.ugc.aweme.port.in.a.f61119b) + new File(localTempPath).getName();
                } else {
                    str = com.ss.android.ugc.aweme.port.in.a.v.a((Context) com.ss.android.ugc.aweme.port.in.a.f61119b) + new File(localTempPath).getName();
                }
                b.c(localTempPath, str);
                photoMovieContext.mSaveModel.setLocalFinalPath(str);
                if (z) {
                    com.ss.android.ugc.aweme.photo.b.a.a(com.ss.android.ugc.aweme.port.in.a.f61119b, str);
                }
                return true;
            }
        }
        return false;
    }

    public final q<VideoCreation> a(Object obj, SynthetiseResult synthetiseResult) {
        if (PatchProxy.isSupport(new Object[]{obj, synthetiseResult}, this, f59005a, false, 63963, new Class[]{Object.class, SynthetiseResult.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{obj, synthetiseResult}, this, f59005a, false, 63963, new Class[]{Object.class, SynthetiseResult.class}, q.class);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f59006c.a((PhotoMovieContext) obj, synthetiseResult, linkedHashMap);
        q<VideoCreation> a2 = this.f59007d.a(linkedHashMap);
        l.a(a2, new bl(), com.ss.android.ugc.aweme.base.k.f34752b);
        l.a(a2, new bk(), com.ss.android.ugc.aweme.base.k.f34752b);
        return a2;
    }

    public final ei<VideoCreation> a(Object obj, VideoCreation videoCreation) {
        VideoCreation videoCreation2 = videoCreation;
        if (PatchProxy.isSupport(new Object[]{obj, videoCreation2}, this, f59005a, false, 63962, new Class[]{Object.class, VideoCreation.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{obj, videoCreation2}, this, f59005a, false, 63962, new Class[]{Object.class, VideoCreation.class}, ei.class);
        }
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) obj;
        ei<VideoCreation> a2 = new fo(this.f59007d).a(photoMovieContext.mOutputVideoPath, photoMovieContext.mCoverStartTm, com.ss.android.ugc.aweme.property.f.i(), videoCreation2);
        l.a(a2, new hg(), com.ss.android.ugc.aweme.base.k.f34752b);
        return a2;
    }

    public final q<at> a(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        q<? extends at> qVar;
        Object obj2 = obj;
        VideoCreation videoCreation2 = videoCreation;
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        if (PatchProxy.isSupport(new Object[]{obj2, videoCreation2, synthetiseResult2}, this, f59005a, false, 63964, new Class[]{Object.class, VideoCreation.class, SynthetiseResult.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{obj2, videoCreation2, synthetiseResult2}, this, f59005a, false, 63964, new Class[]{Object.class, VideoCreation.class, SynthetiseResult.class}, q.class);
        }
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) obj2;
        if (PatchProxy.isSupport(new Object[]{photoMovieContext, videoCreation2, synthetiseResult2}, this, f59005a, false, 63968, new Class[]{PhotoMovieContext.class, VideoCreation.class, SynthetiseResult.class}, q.class)) {
            qVar = (q) PatchProxy.accessDispatch(new Object[]{photoMovieContext, videoCreation2, synthetiseResult2}, this, f59005a, false, 63968, new Class[]{PhotoMovieContext.class, VideoCreation.class, SynthetiseResult.class}, q.class);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("new_sdk", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            linkedHashMap.put("video_id", videoCreation2.materialId);
            fa.a(videoCreation2, linkedHashMap);
            f fVar = this.f59006c;
            if (PatchProxy.isSupport(new Object[]{photoMovieContext, videoCreation2, synthetiseResult2, linkedHashMap}, fVar, f.f58993a, false, 63955, new Class[]{PhotoMovieContext.class, VideoCreation.class, SynthetiseResult.class, LinkedHashMap.class}, q.class)) {
                Object[] objArr = {photoMovieContext, videoCreation2, synthetiseResult2, linkedHashMap};
                Object[] objArr2 = objArr;
                f fVar2 = fVar;
                qVar = (q) PatchProxy.accessDispatch(objArr2, fVar2, f.f58993a, false, 63955, new Class[]{PhotoMovieContext.class, VideoCreation.class, SynthetiseResult.class, LinkedHashMap.class}, q.class);
            } else {
                fVar.a(photoMovieContext, synthetiseResult2, linkedHashMap);
                qVar = com.ss.android.ugc.aweme.port.in.a.t.a(videoCreation2.materialId, linkedHashMap);
                l.a(qVar, new aq(), com.ss.android.ugc.aweme.base.k.f34752b);
            }
        }
        return l.a(qVar, com.ss.android.ugc.aweme.base.api.a.b.a.class, w.a(new k(this, obj2, videoCreation2, synthetiseResult2)), com.ss.android.ugc.aweme.base.k.f34752b);
    }
}
