package com.ss.android.ugc.aweme.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;

public final /* synthetic */ class cc implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54706a;

    /* renamed from: b  reason: collision with root package name */
    private final cb f54707b;

    cc(cb cbVar) {
        this.f54707b = cbVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f54706a, false, 57727, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54706a, false, 57727, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        cb cbVar = this.f54707b;
        Intent intent = new Intent(cbVar.f54700b, CrossPlatformActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_load_dialog", true);
        intent.putExtra("hide_nav_bar", true);
        intent.putExtra("hide_status_bar", true);
        intent.putExtras(bundle);
        intent.setData(Uri.parse("https://www.douyin.com/falcon/douyin_falcon/user_agreement/"));
        cbVar.f54700b.startActivity(intent);
    }
}
