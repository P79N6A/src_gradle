package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Category;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.Map;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41935a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoryNewViewHolder f41936b;

    /* renamed from: c  reason: collision with root package name */
    private final Music f41937c;

    /* renamed from: d  reason: collision with root package name */
    private final Category f41938d;

    c(CategoryNewViewHolder categoryNewViewHolder, Music music, Category category) {
        this.f41936b = categoryNewViewHolder;
        this.f41937c = music;
        this.f41938d = category;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f41935a, false, 35527, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f41935a, false, 35527, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CategoryNewViewHolder categoryNewViewHolder = this.f41936b;
        Music music = this.f41937c;
        Category category = this.f41938d;
        h.a().a(j.a("aweme://aweme/detail/" + music.getCategoryCover().getAwemeId()).a("refer", "discovery").a("video_from", "from_music").a("video_type", 0).a("music_id", String.valueOf(music.getId())).a());
        categoryNewViewHolder.a(category.getWord());
        r.a("cell_click", (Map) d.a().a("enter_from", "discovery").a("music_id", music.getId()).f34114b);
    }
}
