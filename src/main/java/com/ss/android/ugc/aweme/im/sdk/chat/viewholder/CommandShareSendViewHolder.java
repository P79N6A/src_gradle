package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.CommandShareContent;

public class CommandShareSendViewHolder extends CommandShareViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51053a;

    public CommandShareSendViewHolder(View view, int i) {
        super(view, i);
    }

    public final void a(n nVar, n nVar2, CommandShareContent commandShareContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, commandShareContent, Integer.valueOf(i)}, this, f51053a, false, 51437, new Class[]{n.class, n.class, CommandShareContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, commandShareContent, Integer.valueOf(i)}, this, f51053a, false, 51437, new Class[]{n.class, n.class, CommandShareContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, commandShareContent, i);
        this.p.setText(C0906R.string.aq9);
    }
}
