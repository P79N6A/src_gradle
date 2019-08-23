package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.choosemusic.a;
import com.ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter;
import com.ss.android.ugc.aweme.choosemusic.b.b;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

public final class h extends BaseMusicListView<MusicModel> {
    public static ChangeQuickRedirect g;
    boolean h;

    public final BaseAdapter e() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 26854, new Class[0], BaseAdapter.class)) {
            return (BaseAdapter) PatchProxy.accessDispatch(new Object[0], this, g, false, 26854, new Class[0], BaseAdapter.class);
        }
        MusicAdapter musicAdapter = new MusicAdapter(this.f36005d);
        musicAdapter.g = this.h;
        musicAdapter.i = this.f36006e;
        return musicAdapter;
    }

    public final void a(a aVar) {
        if (this.f36003b instanceof MusicAdapter) {
            ((MusicAdapter) this.f36003b).f35768f = aVar;
        }
    }

    public final void a(b bVar) {
        if (this.f36003b instanceof MusicAdapter) {
            ((MusicAdapter) this.f36003b).f35764b = bVar;
        }
    }

    public final void a(boolean z) {
        this.h = z;
        if (this.f36003b instanceof MusicAdapter) {
            ((MusicAdapter) this.f36003b).g = this.h;
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, g, false, 26852, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, g, false, 26852, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mTitleBar.setTitle(i);
    }

    public h(Context context, View view, com.ss.android.ugc.aweme.choosemusic.b.a aVar, int i, LoadMoreRecyclerViewAdapter.a aVar2, f<com.ss.android.ugc.aweme.choosemusic.a.b> fVar, int i2) {
        super(context, view, aVar, i, aVar2, fVar, i2);
    }
}
