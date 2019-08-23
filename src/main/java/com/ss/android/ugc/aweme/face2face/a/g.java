package com.ss.android.ugc.aweme.face2face.a;

import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.face2face.net.b;
import com.ss.android.ugc.aweme.face2face.widget.Face2FaceNoticeWidget;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43920a;

    /* renamed from: b  reason: collision with root package name */
    private FragmentActivity f43921b;

    /* renamed from: c  reason: collision with root package name */
    private Face2FaceNoticeWidget f43922c;

    public final h a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f43920a, false, 39160, new Class[]{b.class}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{bVar}, this, f43920a, false, 39160, new Class[]{b.class}, h.class);
        } else if (bVar.subType == 11) {
            return new f(this.f43921b);
        } else {
            if (bVar.subType == 13) {
                return new a(this.f43921b);
            }
            if (bVar.subType == 12) {
                return new b(this.f43922c);
            }
            if (bVar.subType == 14) {
                return new d(this.f43921b);
            }
            return new c();
        }
    }

    public g(FragmentActivity fragmentActivity, Face2FaceNoticeWidget face2FaceNoticeWidget) {
        this.f43921b = fragmentActivity;
        this.f43922c = face2FaceNoticeWidget;
    }
}
