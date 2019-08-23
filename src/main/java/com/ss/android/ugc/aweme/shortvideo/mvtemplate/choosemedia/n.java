package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import java.util.Map;

public final /* synthetic */ class n implements MvChoosePhotoActivity.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68614a;

    /* renamed from: b  reason: collision with root package name */
    private final MvChoosePhotoActivity f68615b;

    n(MvChoosePhotoActivity mvChoosePhotoActivity) {
        this.f68615b = mvChoosePhotoActivity;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68614a, false, 77970, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68614a, false, 77970, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        MvChoosePhotoActivity mvChoosePhotoActivity = this.f68615b;
        r.a("change_upload_mode", (Map) d.a().a("creation_id", mvChoosePhotoActivity.j.q).a("shoot_way", mvChoosePhotoActivity.j.r).a("to_status", z ? "multiple" : "single").f34114b);
    }
}
