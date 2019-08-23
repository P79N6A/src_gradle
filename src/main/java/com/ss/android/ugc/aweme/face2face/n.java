package com.ss.android.ugc.aweme.face2face;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.face2face.ui.d;
import java.util.Map;

public final class n extends d.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43948a;

    /* renamed from: b  reason: collision with root package name */
    private String f43949b;

    public final String a() {
        return "face_to_face_follow";
    }

    public final String b() {
        return "click_follow";
    }

    public n(String str) {
        this.f43949b = str;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43948a, false, 39113, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43948a, false, 39113, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(i);
        if (i == 1) {
            r.a("follow", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("event_type", "spring_festival").a("enter_from", "face_to_face").a("to_user_id", this.f43949b).a("relation_from", "in_app ").f34114b);
        }
    }
}
