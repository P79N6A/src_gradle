package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;

public class ShareSimpleBaseViewHolder extends BaseViewHolder<BaseContent> {
    public static ChangeQuickRedirect q;
    RemoteImageView r;
    DmtTextView s;
    DmtTextView t;
    DmtTextView u;

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 51590, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 51590, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.i = this.itemView.findViewById(C0906R.id.yp);
        this.r = (RemoteImageView) this.itemView.findViewById(C0906R.id.aqj);
        this.s = (DmtTextView) this.itemView.findViewById(C0906R.id.d41);
        this.t = (DmtTextView) this.itemView.findViewById(C0906R.id.a3s);
        this.u = (DmtTextView) this.itemView.findViewById(C0906R.id.czi);
    }

    public ShareSimpleBaseViewHolder(View view, int i) {
        super(view);
    }

    public void a(n nVar, n nVar2, BaseContent baseContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, baseContent, Integer.valueOf(i)}, this, q, false, 51591, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, baseContent, Integer.valueOf(i)}, this, q, false, 51591, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, baseContent, i);
    }
}
