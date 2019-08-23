package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareLiveContent;

public class ShareLiveSendViewHolder extends ShareLiveReceiveViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51115b;
    private c p;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51115b, false, 51556, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51115b, false, 51556, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.j = (ImageView) this.itemView.findViewById(C0906R.id.cv9);
        this.p = new c(this.j);
    }

    public final void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51115b, false, 51557, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51115b, false, 51557, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.j.setOnClickListener(onClickListener);
        this.n.a(this.j);
    }

    public ShareLiveSendViewHolder(View view, int i) {
        super(view, i);
    }

    public final void a(n nVar, n nVar2, ShareLiveContent shareLiveContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, shareLiveContent, Integer.valueOf(i)}, this, f51115b, false, 51558, new Class[]{n.class, n.class, ShareLiveContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, shareLiveContent, Integer.valueOf(i)}, this, f51115b, false, 51558, new Class[]{n.class, n.class, ShareLiveContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, shareLiveContent, i);
        this.p.a(this.m);
    }
}
