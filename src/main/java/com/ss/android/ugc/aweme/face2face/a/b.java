package com.ss.android.ugc.aweme.face2face.a;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.face2face.widget.Face2FaceNoticeWidget;
import java.util.Iterator;

public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43912a;

    /* renamed from: b  reason: collision with root package name */
    private Face2FaceNoticeWidget f43913b;

    b(Face2FaceNoticeWidget face2FaceNoticeWidget) {
        this.f43913b = face2FaceNoticeWidget;
    }

    public final void a(@NonNull com.ss.android.ugc.aweme.face2face.net.b bVar, @NonNull i iVar) {
        if (PatchProxy.isSupport(new Object[]{bVar, iVar}, this, f43912a, false, 39156, new Class[]{com.ss.android.ugc.aweme.face2face.net.b.class, i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, iVar}, this, f43912a, false, 39156, new Class[]{com.ss.android.ugc.aweme.face2face.net.b.class, i.class}, Void.TYPE);
            return;
        }
        Face2FaceNoticeWidget face2FaceNoticeWidget = this.f43913b;
        String str = bVar.getFroInviteUser().uId;
        if (PatchProxy.isSupport(new Object[]{str}, face2FaceNoticeWidget, Face2FaceNoticeWidget.f3104a, false, 39321, new Class[]{String.class}, Void.TYPE)) {
            Face2FaceNoticeWidget face2FaceNoticeWidget2 = face2FaceNoticeWidget;
            PatchProxy.accessDispatch(new Object[]{str}, face2FaceNoticeWidget2, Face2FaceNoticeWidget.f3104a, false, 39321, new Class[]{String.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(face2FaceNoticeWidget.f3106c)) {
            Iterator<com.ss.android.ugc.aweme.face2face.net.b> it2 = face2FaceNoticeWidget.f3106c.iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals(str, it2.next().getFroInviteUser().uId)) {
                    it2.remove();
                }
            }
        }
        iVar.a();
    }
}
