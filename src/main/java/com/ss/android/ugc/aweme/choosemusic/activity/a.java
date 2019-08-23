package com.ss.android.ugc.aweme.choosemusic.activity;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35755a;

    /* renamed from: b  reason: collision with root package name */
    private final ChooseMusicActivity f35756b;

    a(ChooseMusicActivity chooseMusicActivity) {
        this.f35756b = chooseMusicActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f35755a, false, 26452, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f35755a, false, 26452, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ChooseMusicActivity chooseMusicActivity = this.f35756b;
        chooseMusicActivity.a();
        chooseMusicActivity.finish();
    }
}
