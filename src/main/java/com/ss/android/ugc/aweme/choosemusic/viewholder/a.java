package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36159a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicBoardViewHolder f36160b;

    a(MusicBoardViewHolder musicBoardViewHolder) {
        this.f36160b = musicBoardViewHolder;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f36159a, false, 26887, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f36159a, false, 26887, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        MusicBoardViewHolder musicBoardViewHolder = this.f36160b;
        if (musicBoardViewHolder.f36070d != null) {
            musicBoardViewHolder.f36070d.a(null, view2, null, 0);
        }
    }
}
