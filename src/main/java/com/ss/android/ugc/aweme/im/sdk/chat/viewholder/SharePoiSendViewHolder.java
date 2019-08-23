package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent;

public class SharePoiSendViewHolder extends SharePoiViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51124a;
    private c p;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51124a, false, 51577, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51124a, false, 51577, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.j = (ImageView) a((int) C0906R.id.cv9);
        this.p = new c(this.j);
    }

    public final void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51124a, false, 51578, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51124a, false, 51578, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.j.setOnClickListener(onClickListener);
        this.n.a(this.j);
    }

    public SharePoiSendViewHolder(View view, int i) {
        super(view, i);
    }

    public final void a(n nVar, n nVar2, SharePoiContent sharePoiContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, sharePoiContent, Integer.valueOf(i)}, this, f51124a, false, 51579, new Class[]{n.class, n.class, SharePoiContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, sharePoiContent, Integer.valueOf(i)}, this, f51124a, false, 51579, new Class[]{n.class, n.class, SharePoiContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, sharePoiContent, i);
        this.p.a(this.m);
    }
}
