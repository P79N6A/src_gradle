package com.ss.android.ugc.aweme.choosemusic.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.choosemusic.adapter.MusicSheetAdapter;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35795a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicSheetAdapter.MusicSheetViewHolder f35796b;

    f(MusicSheetAdapter.MusicSheetViewHolder musicSheetViewHolder) {
        this.f35796b = musicSheetViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f35795a, false, 26496, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f35795a, false, 26496, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        MusicSheetAdapter.MusicSheetViewHolder musicSheetViewHolder = this.f35796b;
        if (MusicSheetAdapter.this.f35779b != null) {
            MusicSheetAdapter.this.f35779b.a(musicSheetViewHolder.f35781b, musicSheetViewHolder.getLayoutPosition());
        }
    }
}
