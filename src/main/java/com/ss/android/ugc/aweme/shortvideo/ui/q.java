package com.ss.android.ugc.aweme.shortvideo.ui;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.f.c;
import com.ss.android.ugc.aweme.music.util.d;

public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70916a;

    /* renamed from: b  reason: collision with root package name */
    private final OnlineMusicFragmentActivity f70917b;

    q(OnlineMusicFragmentActivity onlineMusicFragmentActivity) {
        this.f70917b = onlineMusicFragmentActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f70916a, false, 80265, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f70916a, false, 80265, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        OnlineMusicFragmentActivity onlineMusicFragmentActivity = this.f70917b;
        KeyboardUtils.c(onlineMusicFragmentActivity.f70519c);
        if (PatchProxy.isSupport(new Object[0], onlineMusicFragmentActivity, OnlineMusicFragmentActivity.f70517a, false, 80262, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], onlineMusicFragmentActivity, OnlineMusicFragmentActivity.f70517a, false, 80262, new Class[0], Void.TYPE);
            return;
        }
        d.a((Activity) onlineMusicFragmentActivity, 1);
        c.a("local_music", "click_button", "", "change_music_page", "");
    }
}
