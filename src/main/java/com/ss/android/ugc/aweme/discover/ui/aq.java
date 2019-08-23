package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.s;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.ui.ap;
import java.util.List;

public class aq extends ap<List<SearchChallenge>> {
    public static ChangeQuickRedirect i;

    public aq(View view, Context context, ap.a aVar) {
        super(view, context, aVar);
        this.f3077d.setText(C0906R.string.r9);
        if (!a.a()) {
            this.f3078e.setText(C0906R.string.e8);
        }
    }

    public final void a(List<SearchChallenge> list, SearchResultParam searchResultParam, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, searchResultParam, Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 37987, new Class[]{List.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, searchResultParam, Byte.valueOf(z)}, this, i, false, 37987, new Class[]{List.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(list, searchResultParam, z);
        this.g.removeAllViews();
        for (SearchChallenge a2 : list) {
            SearchChallengeViewHolder a3 = SearchChallengeViewHolder.a(this.g, searchResultParam.getKeyword(), null, "challenge");
            a3.f41781f = "general_search";
            a3.a(a2, searchResultParam.getKeyword());
            a3.a(new s(true));
            this.g.addView(a3.itemView);
        }
    }
}
