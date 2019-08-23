package com.bytedance.android.livesdk.widget;

import com.bytedance.android.livesdk.chatroom.model.Game;
import com.bytedance.android.livesdk.game.SelectGameDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ag implements SelectGameDialogFragment.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18425a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f18426b;

    /* renamed from: c  reason: collision with root package name */
    private final SelectGameDialogFragment f18427c;

    ag(aa aaVar, SelectGameDialogFragment selectGameDialogFragment) {
        this.f18426b = aaVar;
        this.f18427c = selectGameDialogFragment;
    }

    public final void a(Game game) {
        if (PatchProxy.isSupport(new Object[]{game}, this, f18425a, false, 14694, new Class[]{Game.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{game}, this, f18425a, false, 14694, new Class[]{Game.class}, Void.TYPE);
            return;
        }
        aa aaVar = this.f18426b;
        SelectGameDialogFragment selectGameDialogFragment = this.f18427c;
        aaVar.l = game;
        aaVar.a(game);
        selectGameDialogFragment.dismiss();
        if (game == null) {
            aaVar.k.a("hotsoon.pref.LAST_SET_GAME", (Object) "").a();
        } else {
            aaVar.k.a("hotsoon.pref.LAST_SET_GAME", (Object) game.toJsonString()).a();
        }
    }
}
