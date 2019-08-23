package com.tt.appbrandimpl.friends.viewholder;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class GameShareViewHolder$$Lambda$0 implements View.OnClickListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final GameShareViewHolder arg$1;

    GameShareViewHolder$$Lambda$0(GameShareViewHolder gameShareViewHolder) {
        this.arg$1 = gameShareViewHolder;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 91940, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 91940, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.arg$1.lambda$openProfile$0$GameShareViewHolder(view2);
    }
}
