package com.bytedance.android.livesdk.game;

import android.view.View;
import com.bytedance.android.livesdk.game.SelectGameDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14669a;

    /* renamed from: b  reason: collision with root package name */
    private final SelectGameDialogFragment.GamesAdapter f14670b;

    d(SelectGameDialogFragment.GamesAdapter gamesAdapter) {
        this.f14670b = gamesAdapter;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f14669a, false, 9199, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f14669a, false, 9199, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f14670b.f14651c.a(null);
    }
}
