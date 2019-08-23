package com.ss.android.ugc.aweme.hotsearch.fragment;

import a.g;
import a.i;
import android.os.Bundle;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.b.c;
import com.ss.android.ugc.aweme.hotsearch.b.e;
import com.ss.android.ugc.aweme.hotsearch.view.a;
import com.ss.android.ugc.aweme.hotsearch.view.l;

public class RankingListVideoFragment extends BaseRankingListFragment implements f<Aweme> {
    public static ChangeQuickRedirect h;

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 49677, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 49677, new Class[0], Void.TYPE);
        } else if (this.f49753b == 1) {
            this.f49755d.a();
        } else {
            if (this.f49753b == 3) {
                c cVar = this.f49755d;
                if (PatchProxy.isSupport(new Object[0], cVar, c.f49680a, false, 49724, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], cVar, c.f49680a, false, 49724, new Class[0], Void.TYPE);
                    return;
                }
                cVar.f49682c.getPositiveEnergyList().a((g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(cVar), i.f1052b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final a b(View view) {
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{view2}, this, h, false, 49678, new Class[]{View.class}, a.class)) {
            return new l(view2, getActivity(), this);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{view2}, this, h, false, 49678, new Class[]{View.class}, a.class);
    }

    public final /* synthetic */ void a(Object obj, int i) {
        Aweme aweme = (Aweme) obj;
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, h, false, 49680, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, h, false, 49680, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.hotsearch.c.a.a(aweme, i, "show", this.f49753b);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, h, false, 49676, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, h, false, 49676, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
    }

    public final /* synthetic */ void b(Object obj, int i) {
        Aweme aweme = (Aweme) obj;
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, h, false, 49679, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, h, false, 49679, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.hotsearch.c.a.a(aweme, i + 1, "click", this.f49753b);
        b bVar = (b) this.f49754c.a("hot_search_data");
        if (bVar != null) {
            com.ss.android.ugc.aweme.feed.a.a().f44610c = (com.ss.android.ugc.aweme.common.f.a) bVar.a("hot_search_video_model");
            if (this.f49753b == 1) {
                h a2 = h.a();
                a2.a(j.a("aweme://aweme/detail/" + aweme.getAid()).a("refer", "hot_search_video_board").a("video_from", "from_hot_search_aweme").a());
                return;
            }
            h a3 = h.a();
            a3.a(j.a("aweme://aweme/detail/" + aweme.getAid()).a("refer", "politic_board").a("video_from", "from_hot_search_positive_aweme").a());
        }
    }
}
