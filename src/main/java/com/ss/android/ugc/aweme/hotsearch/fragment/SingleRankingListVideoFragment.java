package com.ss.android.ugc.aweme.hotsearch.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.view.k;

public class SingleRankingListVideoFragment extends BaseSingleRankingListFragment implements f<Aweme> {
    public static ChangeQuickRedirect p;

    public final int m() {
        return 4;
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 49714, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 49714, new Class[0], Void.TYPE);
            return;
        }
        this.f49755d.a();
    }

    public final Uri o() {
        if (!PatchProxy.isSupport(new Object[0], this, p, false, 49712, new Class[0], Uri.class)) {
            return Uri.parse("");
        }
        return (Uri) PatchProxy.accessDispatch(new Object[0], this, p, false, 49712, new Class[0], Uri.class);
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 49713, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 49713, new Class[0], Void.TYPE);
            return;
        }
        new a.C0185a(getContext()).a((int) C0906R.string.bv6).b((int) C0906R.string.bv8).a((int) C0906R.string.a0v, e.f49769b).a().b();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.hotsearch.view.a b(View view) {
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{view2}, this, p, false, 49710, new Class[]{View.class}, com.ss.android.ugc.aweme.hotsearch.view.a.class)) {
            return new k(view2, getActivity(), this);
        }
        return (com.ss.android.ugc.aweme.hotsearch.view.a) PatchProxy.accessDispatch(new Object[]{view2}, this, p, false, 49710, new Class[]{View.class}, com.ss.android.ugc.aweme.hotsearch.view.a.class);
    }

    public final /* synthetic */ void a(Object obj, int i) {
        Aweme aweme = (Aweme) obj;
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, p, false, 49716, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, p, false, 49716, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.hotsearch.c.a.a(aweme, i, "show", this.f49753b);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, p, false, 49711, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, p, false, 49711, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.j.a((int) C0906R.string.cne);
        this.j.b(2130838141);
    }

    public final /* synthetic */ void b(Object obj, int i) {
        Aweme aweme = (Aweme) obj;
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, p, false, 49715, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, p, false, 49715, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.hotsearch.c.a.a(aweme, i + 1, "click", this.f49753b);
        b bVar = (b) this.f49754c.a("hot_search_data");
        if (bVar != null) {
            com.ss.android.ugc.aweme.feed.a.a().f44610c = (com.ss.android.ugc.aweme.common.f.a) bVar.a("hot_search_video_model");
            h a2 = h.a();
            a2.a(j.a("aweme://aweme/detail/" + aweme.getAid()).a("refer", "hot_search_video_board").a("video_from", "from_hot_search_aweme").a());
        }
    }
}
