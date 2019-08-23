package com.ss.android.ugc.aweme.friends.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.face2face.Face2FacePermissionActivity;
import java.util.Map;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49461a;

    /* renamed from: b  reason: collision with root package name */
    private final FindFriendsFragment f49462b;

    i(FindFriendsFragment findFriendsFragment) {
        this.f49462b = findFriendsFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49461a, false, 47166, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49461a, false, 47166, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Face2FacePermissionActivity.a(this.f49462b.j, "discovery");
        r.a("face_to_face_click", (Map) d.a().a("event_type", "spring_festival").a("enter_from", "discovery").a("enter_method", "button").f34114b);
    }
}
