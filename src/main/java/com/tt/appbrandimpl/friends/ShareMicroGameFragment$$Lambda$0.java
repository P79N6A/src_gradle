package com.tt.appbrandimpl.friends;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ShareMicroGameFragment$$Lambda$0 implements View.OnClickListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ShareMicroGameFragment arg$1;

    ShareMicroGameFragment$$Lambda$0(ShareMicroGameFragment shareMicroGameFragment) {
        this.arg$1 = shareMicroGameFragment;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 91929, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 91929, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.arg$1.lambda$init$0$ShareMicroGameFragment(view2);
    }
}
