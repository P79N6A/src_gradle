package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FaceBeautyInvoker;
import com.ss.android.medialib.model.FaceAttribute;
import com.ss.android.medialib.model.FaceAttributeInfo;
import com.ss.android.medialib.model.FaceDetectInfo;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;

public final /* synthetic */ class cd implements FaceBeautyInvoker.FaceInfoCallback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70858a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity.AnonymousClass7 f70859b;

    cd(VideoRecordNewActivity.AnonymousClass7 r1) {
        this.f70859b = r1;
    }

    public final void onResult(FaceAttributeInfo faceAttributeInfo, FaceDetectInfo faceDetectInfo) {
        if (PatchProxy.isSupport(new Object[]{faceAttributeInfo, faceDetectInfo}, this, f70858a, false, 80668, new Class[]{FaceAttributeInfo.class, FaceDetectInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceAttributeInfo, faceDetectInfo}, this, f70858a, false, 80668, new Class[]{FaceAttributeInfo.class, FaceDetectInfo.class}, Void.TYPE);
            return;
        }
        VideoRecordNewActivity.AnonymousClass7 r2 = this.f70859b;
        if (faceAttributeInfo != null && faceAttributeInfo.getInfo() != null) {
            for (FaceAttribute boyProb : faceAttributeInfo.getInfo()) {
                if (boyProb.getBoyProb() > a.L.d(e.a.MALE_PROB_THRESHOLD)) {
                    VideoRecordNewActivity.this.u.a(true);
                    return;
                }
            }
            VideoRecordNewActivity.this.u.a(false);
        }
    }
}
