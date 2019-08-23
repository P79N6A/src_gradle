package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent;

public class SharePoiSimpleViewHolder extends ShareSimpleBaseViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51126b;

    public SharePoiSimpleViewHolder(View view, int i) {
        super(view, i);
    }

    public void a(n nVar, n nVar2, BaseContent baseContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, baseContent, Integer.valueOf(i)}, this, f51126b, false, 51583, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, baseContent, Integer.valueOf(i)}, this, f51126b, false, 51583, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, baseContent, i);
        SharePoiContent sharePoiContent = (SharePoiContent) baseContent;
        this.s.setText(sharePoiContent.getTitle());
        this.t.setVisibility(0);
        this.t.setText(String.format(this.itemView.getContext().getResources().getString(C0906R.string.awc), new Object[]{com.ss.android.ugc.aweme.im.sdk.utils.n.a((long) sharePoiContent.getUserCount())}));
        this.u.setText(C0906R.string.awb);
        c.b(this.r, sharePoiContent.getMapUrl());
        this.i.setTag(50331648, 16);
        this.i.setTag(67108864, sharePoiContent.getPoiId());
        this.i.setTag(50331649, this.h);
    }
}
