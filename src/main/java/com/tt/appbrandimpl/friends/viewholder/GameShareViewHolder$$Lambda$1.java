package com.tt.appbrandimpl.friends.viewholder;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class GameShareViewHolder$$Lambda$1 implements View.OnClickListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final GameShareViewHolder arg$1;

    GameShareViewHolder$$Lambda$1(GameShareViewHolder gameShareViewHolder) {
        this.arg$1 = gameShareViewHolder;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 91941, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 91941, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.arg$1.lambda$openProfile$1$GameShareViewHolder(view2);
    }
}
