package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareWebContent;

public class ShareWebReceiveViewHolder extends ShareSimpleBaseViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51137a;

    public ShareWebReceiveViewHolder(View view, int i) {
        super(view, i);
    }

    public void a(n nVar, n nVar2, BaseContent baseContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, baseContent, Integer.valueOf(i)}, this, f51137a, false, 51606, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, baseContent, Integer.valueOf(i)}, this, f51137a, false, 51606, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, baseContent, i);
        ShareWebContent shareWebContent = (ShareWebContent) baseContent;
        this.s.setText(shareWebContent.getTitle());
        this.t.setVisibility(0);
        if (shareWebContent.getDesc() == null || shareWebContent.getDesc().trim().length() <= 0) {
            this.t.setVisibility(8);
        } else {
            this.t.setText(shareWebContent.getDesc());
            this.t.setVisibility(0);
        }
        this.u.setText(C0906R.string.azq);
        if (!TextUtils.isEmpty(shareWebContent.getImage())) {
            c.a(this.r, shareWebContent.getImage());
        } else {
            c.a(this.r, 2130840540);
        }
        this.i.setTag(50331648, 22);
        this.i.setTag(50331649, Boolean.valueOf(shareWebContent.isCard));
        this.i.setTag(50331650, this.h);
        this.i.setTag(50331651, Long.valueOf(nVar.getMsgId()));
    }
}
