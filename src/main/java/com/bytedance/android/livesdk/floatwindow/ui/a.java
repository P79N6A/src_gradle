package com.bytedance.android.livesdk.floatwindow.ui;

import android.widget.TextView;
import com.bytedance.android.live.core.utils.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class a implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14604a;

    /* renamed from: b  reason: collision with root package name */
    private final GameMsgView f14605b;

    a(GameMsgView gameMsgView) {
        this.f14605b = gameMsgView;
    }

    public final void accept(Object obj) {
        String str;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14604a, false, 9132, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14604a, false, 9132, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GameMsgView gameMsgView = this.f14605b;
        if (GameMsgView.h >= 0) {
            TextView textView = gameMsgView.f14590c;
            int i = GameMsgView.h;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, gameMsgView, GameMsgView.f14588a, false, 9126, new Class[]{Integer.TYPE}, String.class)) {
                GameMsgView gameMsgView2 = gameMsgView;
                str = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, gameMsgView2, GameMsgView.f14588a, false, 9126, new Class[]{Integer.TYPE}, String.class);
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(e.c((long) i));
                stringBuffer.append("在线");
                str = stringBuffer.toString();
            }
            textView.setText(str);
        }
        if (gameMsgView.f14589b.getVisibility() == 0) {
            gameMsgView.a();
        }
        if (gameMsgView.f14591d.getVisibility() == 0) {
            if (PatchProxy.isSupport(new Object[0], gameMsgView, GameMsgView.f14588a, false, 9124, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], gameMsgView, GameMsgView.f14588a, false, 9124, new Class[0], Void.TYPE);
                return;
            }
            try {
                gameMsgView.f14593f.notifyDataSetChanged();
                int size = gameMsgView.f14593f.f14598b.size();
                if (size > 0) {
                    gameMsgView.f14591d.smoothScrollToPosition(size);
                }
            } catch (Throwable unused) {
                gameMsgView.f14591d.getRecycledViewPool().clear();
                gameMsgView.f14593f.notifyDataSetChanged();
            }
        }
    }
}
