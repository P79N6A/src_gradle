package com.ss.android.ugc.aweme.choosemusic.activity;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.f.c;
import com.ss.android.ugc.aweme.music.util.d;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35757a;

    /* renamed from: b  reason: collision with root package name */
    private final ChooseMusicActivity f35758b;

    b(ChooseMusicActivity chooseMusicActivity) {
        this.f35758b = chooseMusicActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f35757a, false, 26453, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f35757a, false, 26453, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ChooseMusicActivity chooseMusicActivity = this.f35758b;
        KeyboardUtils.c(chooseMusicActivity.f35748b);
        if (PatchProxy.isSupport(new Object[0], chooseMusicActivity, ChooseMusicActivity.f35747a, false, 26442, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], chooseMusicActivity, ChooseMusicActivity.f35747a, false, 26442, new Class[0], Void.TYPE);
            return;
        }
        d.a((Activity) chooseMusicActivity, 1);
        c.a("local_music", "click_button", "", "change_music_page", "");
    }
}
