package com.bytedance.android.livesdk.game;

import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdk.game.SelectGameDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14665a;

    /* renamed from: b  reason: collision with root package name */
    private final SelectGameDialogFragment f14666b;

    b(SelectGameDialogFragment selectGameDialogFragment) {
        this.f14666b = selectGameDialogFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14665a, false, 9189, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14665a, false, 9189, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        SelectGameDialogFragment.GamesAdapter gamesAdapter = this.f14666b.f14638c;
        List list = ((c) obj).f7867b;
        if (PatchProxy.isSupport(new Object[]{list}, gamesAdapter, SelectGameDialogFragment.GamesAdapter.f14649a, false, 9194, new Class[]{List.class}, Void.TYPE)) {
            SelectGameDialogFragment.GamesAdapter gamesAdapter2 = gamesAdapter;
            PatchProxy.accessDispatch(new Object[]{list}, gamesAdapter2, SelectGameDialogFragment.GamesAdapter.f14649a, false, 9194, new Class[]{List.class}, Void.TYPE);
            return;
        }
        gamesAdapter.f14650b.clear();
        if (list != null) {
            gamesAdapter.f14650b.addAll(list);
        }
        gamesAdapter.notifyDataSetChanged();
    }
}
