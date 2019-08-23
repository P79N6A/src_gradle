package com.bytedance.android.livesdk.game;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.model.Game;
import com.bytedance.android.livesdk.game.SelectGameDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14671a;

    /* renamed from: b  reason: collision with root package name */
    private final SelectGameDialogFragment.GamesAdapter f14672b;

    /* renamed from: c  reason: collision with root package name */
    private final Game f14673c;

    e(SelectGameDialogFragment.GamesAdapter gamesAdapter, Game game) {
        this.f14672b = gamesAdapter;
        this.f14673c = game;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f14671a, false, 9200, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f14671a, false, 9200, new Class[]{View.class}, Void.TYPE);
            return;
        }
        SelectGameDialogFragment.GamesAdapter gamesAdapter = this.f14672b;
        gamesAdapter.f14651c.a(this.f14673c);
    }
}
