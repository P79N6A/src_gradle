package com.bytedance.android.livesdk;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.chatroom.end.LiveBroadcastEndFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15542a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastFragment f15543b;

    i(LiveBroadcastFragment liveBroadcastFragment) {
        this.f15543b = liveBroadcastFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f15542a, false, 2595, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15542a, false, 2595, new Class[0], Void.TYPE);
            return;
        }
        LiveBroadcastFragment liveBroadcastFragment = this.f15543b;
        if (liveBroadcastFragment.b_()) {
            if (liveBroadcastFragment.i != null) {
                liveBroadcastFragment.i.lambda$put$1$DataCenter("cmd_dismiss_dialog_end", new Object());
            }
            liveBroadcastFragment.b();
            if (liveBroadcastFragment.q == null) {
                a.a("LiveBroadcastFragment", "room close new LiveBroadcastEndFragment");
                liveBroadcastFragment.q = new LiveBroadcastEndFragment();
                Bundle bundle = new Bundle();
                bundle.putString("live_end_banned_url", liveBroadcastFragment.r);
                bundle.putCharSequence("live_end_banned_title", liveBroadcastFragment.s);
                bundle.putCharSequence("live_end_banned_reason", liveBroadcastFragment.t);
                bundle.putCharSequence("live_end_banned_content", liveBroadcastFragment.u);
                liveBroadcastFragment.q.setArguments(bundle);
            } else {
                Bundle arguments = liveBroadcastFragment.q.getArguments();
                if (arguments != null) {
                    arguments.putString("live_end_banned_url", liveBroadcastFragment.r);
                    arguments.putCharSequence("live_end_banned_title", liveBroadcastFragment.s);
                    arguments.putCharSequence("live_end_banned_reason", liveBroadcastFragment.t);
                    arguments.putCharSequence("live_end_banned_content", liveBroadcastFragment.u);
                }
            }
            liveBroadcastFragment.q.p = liveBroadcastFragment;
            liveBroadcastFragment.q.a(liveBroadcastFragment.getActivity(), liveBroadcastFragment.f8749c, new k(liveBroadcastFragment), "");
            FragmentManager supportFragmentManager = liveBroadcastFragment.getActivity().getSupportFragmentManager();
            liveBroadcastFragment.getView().findViewById(C0906R.id.a_5).setVisibility(0);
            if (supportFragmentManager.findFragmentById(C0906R.id.a_5) == null) {
                supportFragmentManager.beginTransaction().add((int) C0906R.id.a_5, (Fragment) liveBroadcastFragment.q).commitNowAllowingStateLoss();
            }
        }
    }
}
