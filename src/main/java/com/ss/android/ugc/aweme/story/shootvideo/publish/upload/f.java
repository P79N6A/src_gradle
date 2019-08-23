package com.ss.android.ugc.aweme.story.shootvideo.publish.upload;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.e.c;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.l;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.services.photo.IPhotoProcessService;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.ei;
import com.ss.android.ugc.aweme.shortvideo.fg;
import com.ss.android.ugc.aweme.shortvideo.k;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.w;
import com.ss.android.ugc.aweme.utils.fb;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;

public final class f extends k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73731a;

    /* renamed from: c  reason: collision with root package name */
    private final TTUploaderService f73732c;

    /* renamed from: d  reason: collision with root package name */
    private l f73733d;

    public f(TTUploaderService tTUploaderService) {
        this.f73732c = tTUploaderService;
        this.f73733d = new l(tTUploaderService);
    }

    public final long b(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f73731a, false, 85472, new Class[]{Object.class}, Long.TYPE)) {
            return new File(((cb) obj).getOutputFile()).length();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{obj}, this, f73731a, false, 85472, new Class[]{Object.class}, Long.TYPE)).longValue();
    }

    public final Bitmap c(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f73731a, false, 85473, new Class[]{Object.class}, Bitmap.class)) {
            return fb.a().a(((cb) obj).getOutputFile(), 90, 110, 1);
        }
        return (Bitmap) PatchProxy.accessDispatch(new Object[]{obj}, this, f73731a, false, 85473, new Class[]{Object.class}, Bitmap.class);
    }

    public final ei<SynthetiseResult> a(Object obj) {
        final Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, this, f73731a, false, 85467, new Class[]{Object.class}, ei.class)) {
            return new ei<SynthetiseResult>() {
                {
                    SynthetiseResult synthetiseResult = new SynthetiseResult();
                    if (obj2 instanceof cb) {
                        cb cbVar = (cb) obj2;
                        synthetiseResult.videoHeight = cbVar.mVideoHeight;
                        synthetiseResult.videoWidth = cbVar.mVideoWidth;
                        synthetiseResult.outputFile = cbVar.mOutputFile;
                        synthetiseResult.texts = cbVar.texts;
                    }
                    b(synthetiseResult);
                }
            };
        }
        return (ei) PatchProxy.accessDispatch(new Object[]{obj2}, this, f73731a, false, 85467, new Class[]{Object.class}, ei.class);
    }

    public final boolean d(Object obj) {
        boolean z;
        String str;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f73731a, false, 85474, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f73731a, false, 85474, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        cb cbVar = (cb) obj;
        if (!cbVar.isSaveLocal()) {
            return false;
        }
        boolean isSaveLocalWithWaterMark = cbVar.isSaveLocalWithWaterMark();
        String localTempPath = cbVar.getLocalTempPath();
        boolean isSaveToLocalPathInsteadOfAlbum = cbVar.isSaveToLocalPathInsteadOfAlbum();
        if (cbVar.isSaveToAlbum() || !isSaveToLocalPathInsteadOfAlbum) {
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(localTempPath) || !new File(localTempPath).exists() || new File(localTempPath).length() <= 0) {
            return false;
        }
        if (z) {
            str = fg.y + new File(localTempPath).getName();
        } else {
            str = a.v.a((Context) a.f61119b) + new File(localTempPath).getName();
        }
        String outputFile = cbVar.getOutputFile();
        if (PatchProxy.isSupport(new Object[]{outputFile, Byte.valueOf(isSaveLocalWithWaterMark ? (byte) 1 : 0), -1, str, null}, null, l.f73755a, true, 85493, new Class[]{String.class, Boolean.TYPE, Integer.TYPE, String.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{outputFile, Byte.valueOf(isSaveLocalWithWaterMark), -1, str, null}, null, l.f73755a, true, 85493, new Class[]{String.class, Boolean.TYPE, Integer.TYPE, String.class, c.class}, Void.TYPE);
        } else if (!isSaveLocalWithWaterMark) {
            b.c(outputFile, str);
            com.ss.android.ugc.aweme.photo.b.a.a(a.f61119b, str);
        } else {
            new com.ss.android.ugc.aweme.photo.a.a().photoAddStoryWaterMarker(outputFile, str, new IPhotoProcessService.IPhotoServiceListener(null) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73756a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f73757b;

                public final void onWaterMakerAdded(@Nullable Bitmap bitmap) {
                }

                {
                    this.f73757b = r1;
                }

                public final void onSaved(int i, @Nullable PhotoContext photoContext) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), photoContext}, this, f73756a, false, 85496, new Class[]{Integer.TYPE, PhotoContext.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), photoContext}, this, f73756a, false, 85496, new Class[]{Integer.TYPE, PhotoContext.class}, Void.TYPE);
                        return;
                    }
                    if (this.f73757b != null) {
                        if (i == 0) {
                            this.f73757b.a(null);
                            return;
                        }
                        c cVar = this.f73757b;
                        cVar.a(new Exception("error code is " + i));
                    }
                }
            });
        }
        cbVar.mSaveModel.setLocalFinalPath(str);
        return true;
    }

    public final q<VideoCreation> a(Object obj, SynthetiseResult synthetiseResult) {
        if (PatchProxy.isSupport(new Object[]{obj, synthetiseResult}, this, f73731a, false, 85469, new Class[]{Object.class, SynthetiseResult.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{obj, synthetiseResult}, this, f73731a, false, 85469, new Class[]{Object.class, SynthetiseResult.class}, q.class);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aweme_type", "15");
        q<VideoCreation> a2 = this.f73732c.a(linkedHashMap);
        com.google.common.util.concurrent.l.a(a2, new c(), com.ss.android.ugc.aweme.base.k.f34752b);
        return a2;
    }

    public final ei<VideoCreation> a(Object obj, VideoCreation videoCreation) {
        VideoCreation videoCreation2 = videoCreation;
        if (PatchProxy.isSupport(new Object[]{obj, videoCreation2}, this, f73731a, false, 85468, new Class[]{Object.class, VideoCreation.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{obj, videoCreation2}, this, f73731a, false, 85468, new Class[]{Object.class, VideoCreation.class}, ei.class);
        }
        ei<VideoCreation> a2 = this.f73733d.a(((cb) obj).getOutputFile(), videoCreation2);
        com.google.common.util.concurrent.l.a(a2, new q(), com.ss.android.ugc.aweme.base.k.f34752b);
        return a2;
    }

    public final q<? extends at> a(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        q<? extends at> qVar;
        Object obj2 = obj;
        VideoCreation videoCreation2 = videoCreation;
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        if (PatchProxy.isSupport(new Object[]{obj2, videoCreation2, synthetiseResult2}, this, f73731a, false, 85470, new Class[]{Object.class, VideoCreation.class, SynthetiseResult.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{obj2, videoCreation2, synthetiseResult2}, this, f73731a, false, 85470, new Class[]{Object.class, VideoCreation.class, SynthetiseResult.class}, q.class);
        }
        cb cbVar = (cb) obj2;
        if (PatchProxy.isSupport(new Object[]{cbVar, videoCreation2}, this, f73731a, false, 85471, new Class[]{cb.class, VideoCreation.class}, q.class)) {
            qVar = (q) PatchProxy.accessDispatch(new Object[]{cbVar, videoCreation2}, this, f73731a, false, 85471, new Class[]{cb.class, VideoCreation.class}, q.class);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("media_type", "15");
            linkedHashMap.put("dynamic_image", PushConstants.PUSH_TYPE_NOTIFY);
            linkedHashMap.put("notcompress_image", String.valueOf(cbVar.isStoryTextRecord ? 1 : 0));
            e.a(cbVar, linkedHashMap);
            qVar = a.z.a(videoCreation2.materialId, linkedHashMap);
            if (com.ss.android.g.a.a()) {
                qVar = com.google.common.util.concurrent.l.a(qVar, IOException.class, new h(videoCreation2, linkedHashMap), v.a());
            }
            com.google.common.util.concurrent.l.a(qVar, new b(), v.a());
        }
        return com.google.common.util.concurrent.l.a(qVar, com.ss.android.ugc.aweme.base.api.a.b.a.class, w.a(new g(this, obj2, videoCreation2, synthetiseResult2)), com.ss.android.ugc.aweme.base.k.f34752b);
    }
}
