package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.choosemusic.adapter.MusicSheetAdapter;
import com.ss.android.ugc.aweme.choosemusic.b.a;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;

public final class i extends BaseMusicListView<MusicCollectionItem> {
    public static ChangeQuickRedirect g;

    public final BaseAdapter e() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 26856, new Class[0], BaseAdapter.class)) {
            return (BaseAdapter) PatchProxy.accessDispatch(new Object[0], this, g, false, 26856, new Class[0], BaseAdapter.class);
        }
        MusicSheetAdapter musicSheetAdapter = new MusicSheetAdapter();
        musicSheetAdapter.f35779b = new j(this);
        return musicSheetAdapter;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(MusicCollectionItem musicCollectionItem, int i) {
        if (this.f36004c != null) {
            this.f36004c.a(musicCollectionItem, i);
        }
    }

    public i(Context context, View view, a aVar, LoadMoreRecyclerViewAdapter.a aVar2, int i) {
        super(context, view, aVar, C0906R.string.bhi, aVar2, null, i);
    }
}
