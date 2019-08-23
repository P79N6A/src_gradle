package com.ss.android.ugc.aweme.main;

import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.follow.f;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;
import com.ss.android.ugc.aweme.utils.bg;

public final /* synthetic */ class x implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55002a;

    /* renamed from: b  reason: collision with root package name */
    private final MainFragment f55003b;

    x(MainFragment mainFragment) {
        this.f55003b = mainFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55002a, false, 57326, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55002a, false, 57326, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        MainFragment mainFragment = this.f55003b;
        if (mainFragment.getActivity() != null) {
            mainFragment.b();
            bg.a(new f());
            Intent intent = new Intent();
            intent.putExtra("enter_from", "homepage_hot");
            intent.putExtra("enter_method", "click_camera");
            intent.putExtra("extra_launch_type", 2);
            ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class)).launchRecord(mainFragment.getActivity(), intent);
        }
    }
}
