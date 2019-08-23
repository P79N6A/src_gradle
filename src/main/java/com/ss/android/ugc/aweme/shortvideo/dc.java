package com.ss.android.ugc.aweme.shortvideo;

import a.g;
import a.i;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.JobIntentService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.tools.extract.upload.VideoFramesUploadService;
import com.ss.android.ugc.aweme.tools.extract.upload.a;
import com.ss.android.ugc.aweme.tools.extract.upload.b;

public final /* synthetic */ class dc implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66734a;

    /* renamed from: b  reason: collision with root package name */
    private final OriginFramesUploader f66735b;

    /* renamed from: c  reason: collision with root package name */
    private final c f66736c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f66737d;

    /* renamed from: e  reason: collision with root package name */
    private final String f66738e;

    /* renamed from: f  reason: collision with root package name */
    private final String f66739f;
    private final Context g;
    private final int h;

    dc(OriginFramesUploader originFramesUploader, c cVar, Object obj, String str, String str2, Context context, int i) {
        this.f66735b = originFramesUploader;
        this.f66736c = cVar;
        this.f66737d = obj;
        this.f66738e = str;
        this.f66739f = str2;
        this.g = context;
        this.h = i;
    }

    public final Object then(i iVar) {
        ExtractFramesModel extractFramesModel;
        String str;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f66734a, false, 74249, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f66734a, false, 74249, new Class[]{i.class}, Object.class);
        }
        OriginFramesUploader originFramesUploader = this.f66735b;
        c cVar = this.f66736c;
        Object obj = this.f66737d;
        String str2 = this.f66738e;
        String str3 = this.f66739f;
        Context context = this.g;
        int i = this.h;
        originFramesUploader.a(cVar, obj);
        if (iVar.c() || iVar.d()) {
            return null;
        }
        if (obj instanceof PhotoMovieContext) {
            extractFramesModel = ((PhotoMovieContext) obj).extractFramesModel;
        } else {
            cb cbVar = (cb) obj;
            extractFramesModel = cbVar.extractFramesModel;
            if (extractFramesModel != null) {
                extractFramesModel.setStickerIds(cbVar.mStickerID);
            }
        }
        ExtractFramesModel extractFramesModel2 = extractFramesModel;
        if (extractFramesModel2 != null) {
            b bVar = new b(str2, str3, "", "", extractFramesModel2, System.currentTimeMillis());
            a.a(context).a(bVar);
        }
        Intent intent = new Intent();
        if (i == 1) {
            str = com.ss.android.ugc.aweme.port.in.a.L.e(e.a.SdkV4AuthKey);
        } else {
            str = com.ss.android.ugc.aweme.port.in.a.L.e(e.a.StorySdkV4AuthKey);
        }
        intent.putExtra("authkey", str);
        JobIntentService.enqueueWork(context.getApplicationContext(), VideoFramesUploadService.class, 3009, intent);
        return null;
    }
}
