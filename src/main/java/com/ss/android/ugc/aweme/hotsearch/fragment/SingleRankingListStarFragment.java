package com.ss.android.ugc.aweme.hotsearch.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.b.k;
import com.ss.android.ugc.aweme.hotsearch.view.a;
import com.ss.android.ugc.aweme.hotsearch.view.j;
import java.util.Map;

public class SingleRankingListStarFragment extends BaseSingleRankingListFragment implements f<k> {
    public static ChangeQuickRedirect p;

    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
    }

    public final int m() {
        return 1;
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 49704, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 49704, new Class[0], Void.TYPE);
        } else if (this.k == 0) {
            this.f49755d.b(Integer.valueOf(this.k), null);
        } else {
            this.f49755d.b(Integer.valueOf(this.k), this.l);
        }
    }

    public final Uri o() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 49707, new Class[0], Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[0], this, p, false, 49707, new Class[0], Uri.class);
        }
        try {
            return Uri.parse((String) SharePrefCache.inst().getStarBillboardRuleUrl().c());
        } catch (Exception unused) {
            return Uri.parse("");
        }
    }

    /* access modifiers changed from: package-private */
    public final a b(View view) {
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{view2}, this, p, false, 49705, new Class[]{View.class}, a.class)) {
            return new j(view2, getActivity(), this);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{view2}, this, p, false, 49705, new Class[]{View.class}, a.class);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, p, false, 49706, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, p, false, 49706, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.j.a((int) C0906R.string.bv7);
        this.j.b(2130838140);
    }

    public final /* synthetic */ void b(Object obj, int i) {
        k kVar = (k) obj;
        if (PatchProxy.isSupport(new Object[]{kVar, Integer.valueOf(i)}, this, p, false, 49708, new Class[]{k.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar, Integer.valueOf(i)}, this, p, false, 49708, new Class[]{k.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        r.a("enter_personal_detail", (Map) d.a().a("enter_from", "star_board").a("scene_id", 1021).a("to_user_id", kVar.f49704b.getUid()).f34114b);
        h a2 = h.a();
        a2.a(com.ss.android.ugc.aweme.ag.j.a("aweme://user/profile/" + kVar.f49704b.getUid()).a("sec_user_id", kVar.f49704b.getSecUid()).a());
    }
}
