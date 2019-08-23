package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;

public class ShareWebSendViewHolder extends ShareWebReceiveViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51138b;
    private c p;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51138b, false, 51607, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51138b, false, 51607, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.j = (ImageView) a((int) C0906R.id.cv9);
        this.p = new c(this.j);
    }

    public final void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51138b, false, 51608, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51138b, false, 51608, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.j.setOnClickListener(onClickListener);
        this.n.a(this.j);
    }

    public ShareWebSendViewHolder(View view, int i) {
        super(view, i);
    }

    public final void a(n nVar, n nVar2, BaseContent baseContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, baseContent, Integer.valueOf(i)}, this, f51138b, false, 51609, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, baseContent, Integer.valueOf(i)}, this, f51138b, false, 51609, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, baseContent, i);
        this.p.a(this.m);
    }
}
