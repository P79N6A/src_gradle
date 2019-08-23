package com.ss.android.ugc.aweme.im.sdk.chat.net.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.net.x;
import com.ss.ttuploader.TTImageInfo;
import com.ss.ttuploader.TTImageUploaderListener;

public final /* synthetic */ class e implements TTImageUploaderListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51001a;

    /* renamed from: b  reason: collision with root package name */
    private final UploadManager f51002b;

    /* renamed from: c  reason: collision with root package name */
    private final x f51003c;

    /* renamed from: d  reason: collision with root package name */
    private final int f51004d;

    /* renamed from: e  reason: collision with root package name */
    private final String f51005e;

    e(UploadManager uploadManager, x xVar, int i, String str) {
        this.f51002b = uploadManager;
        this.f51003c = xVar;
        this.f51004d = i;
        this.f51005e = str;
    }

    public final void onNotify(int i, long j, TTImageInfo tTImageInfo) {
        int i2 = i;
        long j2 = j;
        TTImageInfo tTImageInfo2 = tTImageInfo;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), tTImageInfo2}, this, f51001a, false, 51335, new Class[]{Integer.TYPE, Long.TYPE, TTImageInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), tTImageInfo2}, this, f51001a, false, 51335, new Class[]{Integer.TYPE, Long.TYPE, TTImageInfo.class}, Void.TYPE);
            return;
        }
        UploadManager uploadManager = this.f51002b;
        x xVar = this.f51003c;
        int i3 = this.f51004d;
        String str = this.f51005e;
        if (i2 != 1) {
            switch (i2) {
                case 3:
                    if (xVar != null) {
                        if (i3 == 1) {
                            UrlModel urlModel = new UrlModel();
                            urlModel.setUri(tTImageInfo2.mImageUri);
                            xVar.a(str, urlModel);
                            return;
                        } else if (i3 == 0) {
                            a aVar = new a();
                            aVar.setOid(tTImageInfo2.mObjectId);
                            aVar.setMd5(tTImageInfo2.mSourceMd5);
                            aVar.setSkey(tTImageInfo2.mSecretKey);
                            xVar.a(str, aVar);
                            return;
                        }
                    }
                    break;
                case 4:
                    long j3 = tTImageInfo2.mErrcode;
                    if ((j3 == 10401 || j3 == 10402 || j3 == 10403 || j3 == 10408) && uploadManager.f50994b < 2) {
                        uploadManager.f50994b++;
                        uploadManager.a(str, i3, xVar, true);
                        return;
                    } else if (xVar != null) {
                        xVar.a(String.valueOf(j3));
                        return;
                    }
                    break;
            }
        } else if (xVar != null) {
            xVar.a((double) ((((float) j2) * 1.0f) / 100.0f));
        }
    }
}
