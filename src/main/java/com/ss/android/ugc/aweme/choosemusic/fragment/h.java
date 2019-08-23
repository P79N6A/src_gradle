package com.ss.android.ugc.aweme.choosemusic.fragment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35978a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicClassDetailFragment f35979b;

    h(MusicClassDetailFragment musicClassDetailFragment) {
        this.f35979b = musicClassDetailFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f35978a, false, 26612, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f35978a, false, 26612, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        MusicClassDetailFragment musicClassDetailFragment = this.f35979b;
        if (AbTestManager.a().bw() != 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "change_music_page");
            hashMap.put("category_name", musicClassDetailFragment.j);
            r.a("click_ad_sticker", (Map) hashMap);
            if (!g.a(musicClassDetailFragment.getContext(), musicClassDetailFragment.k.f39384b.f39387c, false)) {
                g.a(musicClassDetailFragment.getContext(), musicClassDetailFragment.k.f39384b.f39388d, musicClassDetailFragment.k.f39384b.f39389e);
            }
        }
    }
}
