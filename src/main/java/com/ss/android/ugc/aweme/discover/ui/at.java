package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.p;
import com.ss.android.ugc.aweme.discover.adapter.s;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.ui.ap;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;

public class at extends ap<List<Music>> {
    public static ChangeQuickRedirect i;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 37995, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 37995, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.f3077d.setText(C0906R.string.be9);
        if (!a.a()) {
            this.f3078e.setText(C0906R.string.ea);
        }
    }

    public at(View view, Context context, ap.a aVar) {
        super(view, context, aVar);
    }

    public final void a(List<Music> list, SearchResultParam searchResultParam, boolean z) {
        SearchMusicViewHolder searchMusicViewHolder;
        if (PatchProxy.isSupport(new Object[]{list, searchResultParam, Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 37996, new Class[]{List.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, searchResultParam, Byte.valueOf(z)}, this, i, false, 37996, new Class[]{List.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(list, searchResultParam, z);
        this.g.removeAllViews();
        for (Music next : list) {
            ViewGroup viewGroup = (ViewGroup) this.f3076c;
            String keyword = searchResultParam.getKeyword();
            if (PatchProxy.isSupport(new Object[]{viewGroup, keyword, null, null}, null, SearchMusicViewHolder.f41842c, true, 35852, new Class[]{ViewGroup.class, String.class, SearchMusicViewHolder.b.class, p.class}, SearchMusicViewHolder.class)) {
                searchMusicViewHolder = (SearchMusicViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, keyword, null, null}, null, SearchMusicViewHolder.f41842c, true, 35852, new Class[]{ViewGroup.class, String.class, SearchMusicViewHolder.b.class, p.class}, SearchMusicViewHolder.class);
            } else {
                searchMusicViewHolder = SearchMusicViewHolder.j.a(viewGroup, keyword, null, null);
            }
            searchMusicViewHolder.a(next, searchResultParam.getKeyword());
            searchMusicViewHolder.a(new s(true));
            searchMusicViewHolder.a("general_search");
            this.g.addView(searchMusicViewHolder.a());
        }
    }
}
