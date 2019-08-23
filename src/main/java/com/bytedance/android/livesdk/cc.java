package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.chatroom.model.Game;
import com.bytedance.android.livesdk.game.SelectGameDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cc implements SelectGameDialogFragment.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9679a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f9680b;

    /* renamed from: c  reason: collision with root package name */
    private final SelectGameDialogFragment f9681c;

    cc(StartLiveFragmentDefault startLiveFragmentDefault, SelectGameDialogFragment selectGameDialogFragment) {
        this.f9680b = startLiveFragmentDefault;
        this.f9681c = selectGameDialogFragment;
    }

    public final void a(Game game) {
        if (PatchProxy.isSupport(new Object[]{game}, this, f9679a, false, 2952, new Class[]{Game.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{game}, this, f9679a, false, 2952, new Class[]{Game.class}, Void.TYPE);
            return;
        }
        StartLiveFragmentDefault startLiveFragmentDefault = this.f9680b;
        SelectGameDialogFragment selectGameDialogFragment = this.f9681c;
        startLiveFragmentDefault.A = game;
        startLiveFragmentDefault.a(game);
        selectGameDialogFragment.dismiss();
        if (game == null) {
            startLiveFragmentDefault.v.a("hotsoon.pref.LAST_SET_GAME", (Object) "").a();
        } else {
            startLiveFragmentDefault.v.a("hotsoon.pref.LAST_SET_GAME", (Object) game.toJsonString()).a();
        }
    }
}
