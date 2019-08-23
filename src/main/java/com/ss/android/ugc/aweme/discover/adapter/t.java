package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.a;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.presenter.j;
import java.util.ArrayList;
import java.util.Map;

public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41975a;

    /* renamed from: b  reason: collision with root package name */
    private final Music f41976b;

    t(Music music) {
        this.f41976b = music;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f41975a, false, 35697, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f41975a, false, 35697, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Music music = this.f41976b;
        j jVar = new j();
        jVar.setItems(new ArrayList());
        a.a().f44610c = jVar;
        h.a().a(com.ss.android.ugc.aweme.ag.j.a("aweme://aweme/detail/0").a("refer", "discovery").a("video_from", "from_music").a("video_type", 0).a("music_id", String.valueOf(music.getId())).a());
        r.a("cell_click", (Map) d.a().a("enter_from", "discovery").a("music_id", music.getId()).f34114b);
    }
}
