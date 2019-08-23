package com.ss.android.ugc.aweme.photomovie.edit;

import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.f;
import com.ss.android.ugc.aweme.draft.l;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.r;
import com.ss.android.ugc.aweme.tools.a.e;
import com.ss.android.ugc.aweme.tools.a.g;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58888a;

    public static com.ss.android.ugc.aweme.draft.a.c a(PhotoMovieContext photoMovieContext) {
        PhotoMovieContext photoMovieContext2 = photoMovieContext;
        if (PatchProxy.isSupport(new Object[]{photoMovieContext2}, null, f58888a, true, 64047, new Class[]{PhotoMovieContext.class}, com.ss.android.ugc.aweme.draft.a.c.class)) {
            return (com.ss.android.ugc.aweme.draft.a.c) PatchProxy.accessDispatch(new Object[]{photoMovieContext2}, null, f58888a, true, 64047, new Class[]{PhotoMovieContext.class}, com.ss.android.ugc.aweme.draft.a.c.class);
        }
        com.ss.android.ugc.aweme.draft.a.c cVar = new com.ss.android.ugc.aweme.draft.a.c();
        if (StringUtils.isEmpty(photoMovieContext2.mFinalVideoTmpPath)) {
            String b2 = ff.b("-concat-v");
            cVar.b(b2);
            photoMovieContext2.mFinalVideoTmpPath = b2;
        } else {
            cVar.b(photoMovieContext2.mFinalVideoTmpPath);
        }
        cVar.f43436d = photoMovieContext2;
        cVar.f(2);
        if (photoMovieContext2.mMusic != null) {
            cVar.f43438f = photoMovieContext2.mMusic;
        }
        cVar.a(photoMovieContext2.mCoverStartTm);
        cVar.h = photoMovieContext2.mMusicPath;
        cVar.D = System.currentTimeMillis();
        cVar.C = a.x.d();
        cVar.j(a.m.a(photoMovieContext2.poiId));
        cVar.P = photoMovieContext2.mHeight;
        cVar.O = photoMovieContext2.mWidth;
        cVar.a(photoMovieContext2.mSaveModel);
        g.a(r.a((BaseShortVideoContext) photoMovieContext), r.a(cVar.T), e.PUBLISH, e.DRAFT);
        cVar.T.q = photoMovieContext2.poiData;
        if (photoMovieContext2.draftEditTransferModel == null) {
            cVar.a(System.currentTimeMillis());
        } else {
            cVar.a(photoMovieContext2.draftEditTransferModel.getCreateTime());
        }
        photoMovieContext2.draftEditTransferModel = new f(l.a(cVar), cVar.O());
        return cVar;
    }
}
