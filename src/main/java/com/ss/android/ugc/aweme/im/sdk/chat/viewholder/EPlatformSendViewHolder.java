package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.EPlatformCardContent;

public class EPlatformSendViewHolder extends EPlatformReceiveViewHolder {
    public static ChangeQuickRedirect p;
    private c q;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 51453, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 51453, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.j = (ImageView) a((int) C0906R.id.cv9);
        this.q = new c(this.j);
    }

    public final void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, p, false, 51454, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, p, false, 51454, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.j.setOnClickListener(onClickListener);
        this.n.a(this.j);
    }

    public EPlatformSendViewHolder(View view, int i) {
        super(view, i);
    }

    public final void a(n nVar, n nVar2, EPlatformCardContent ePlatformCardContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, ePlatformCardContent, Integer.valueOf(i)}, this, p, false, 51455, new Class[]{n.class, n.class, EPlatformCardContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, ePlatformCardContent, Integer.valueOf(i)}, this, p, false, 51455, new Class[]{n.class, n.class, EPlatformCardContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f51062b = false;
        super.a(nVar, nVar2, ePlatformCardContent, i);
        this.q.a(this.m);
    }
}
