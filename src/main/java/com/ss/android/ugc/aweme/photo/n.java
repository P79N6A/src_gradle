package com.ss.android.ugc.aweme.photo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.photo.l;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.ss.ttuploader.TTImageInfo;
import com.ss.ttuploader.TTImageUploader;
import com.ss.ttuploader.TTImageUploaderListener;

public final /* synthetic */ class n implements TTImageUploaderListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58619a;

    /* renamed from: b  reason: collision with root package name */
    private final l.AnonymousClass3 f58620b;

    /* renamed from: c  reason: collision with root package name */
    private final TTImageUploader f58621c;

    n(l.AnonymousClass3 r1, TTImageUploader tTImageUploader) {
        this.f58620b = r1;
        this.f58621c = tTImageUploader;
    }

    public final void onNotify(int i, long j, TTImageInfo tTImageInfo) {
        int i2 = i;
        long j2 = j;
        TTImageInfo tTImageInfo2 = tTImageInfo;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), tTImageInfo2}, this, f58619a, false, 63589, new Class[]{Integer.TYPE, Long.TYPE, TTImageInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), tTImageInfo2}, this, f58619a, false, 63589, new Class[]{Integer.TYPE, Long.TYPE, TTImageInfo.class}, Void.TYPE);
            return;
        }
        l.AnonymousClass3 r0 = this.f58620b;
        TTImageUploader tTImageUploader = this.f58621c;
        if (i2 == 3) {
            tTImageUploader.close();
            r0.b(new VideoCreation().setMaterialId(tTImageInfo2.mImageUri));
        } else if (i2 == 4) {
            tTImageUploader.close();
            if (tTImageInfo2 != null) {
                r0.a((Throwable) new a((int) tTImageInfo2.mErrcode).setErrorMsg(tTImageInfo2.mErrcode == 30411 ? com.ss.android.ugc.aweme.port.in.a.f61119b.getResources().getString(C0906R.string.doy) : "upload failed."));
            } else {
                r0.a((Throwable) new IllegalArgumentException("upload failed."));
            }
        } else {
            if (i2 == 1) {
                r0.a((int) j2);
            }
        }
    }
}
