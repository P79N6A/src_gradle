package com.ss.android.ugc.aweme.profile.ui.header;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62900a;

    /* renamed from: b  reason: collision with root package name */
    private final a f62901b;

    /* renamed from: c  reason: collision with root package name */
    private final User f62902c;

    g(a aVar, User user) {
        this.f62901b = aVar;
        this.f62902c = user;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62900a, false, 69398, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62900a, false, 69398, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        a aVar = this.f62901b;
        User user = this.f62902c;
        r.a("click_link", (Map) new d().a("enter_from", user.isMe() ? "personal_homepage" : "others_homepage").a("link_type", "starmap").a("author_id", user.getUid()).f34114b);
        try {
            Intent intent = new Intent(aVar.getContext(), CrossPlatformActivity.class);
            intent.setData(Uri.parse(com.ss.android.ugc.aweme.global.config.settings.g.b().by()).buildUpon().appendQueryParameter("scene", "promotion").appendQueryParameter("source_user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID()).appendQueryParameter("author_id", user.getUid()).build());
            aVar.getContext().startActivity(intent);
        } catch (a unused) {
        }
    }
}
