package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareRankingListContent;
import com.ss.android.ugc.aweme.im.sdk.utils.z;

public class ShareRankingSimpleViewHolder extends ShareSimpleBaseViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51130b;

    public ShareRankingSimpleViewHolder(View view, int i) {
        super(view, i);
    }

    public void a(n nVar, n nVar2, BaseContent baseContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, baseContent, Integer.valueOf(i)}, this, f51130b, false, 51589, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, baseContent, Integer.valueOf(i)}, this, f51130b, false, 51589, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, baseContent, i);
        ShareRankingListContent shareRankingListContent = (ShareRankingListContent) baseContent;
        int type = shareRankingListContent.getType();
        if (type != 2301) {
            switch (type) {
                case 1801:
                    this.s.setText(C0906R.string.ay7);
                    c.a(this.r, 2130840537);
                    break;
                case 1802:
                    this.s.setText(C0906R.string.ay6);
                    c.a(this.r, 2130840536);
                    break;
                case 1803:
                    this.s.setText(C0906R.string.ay5);
                    c.a(this.r, 2130840535);
                    break;
            }
        } else {
            this.s.setText(C0906R.string.ay4);
            c.a(this.r, 2130840534);
        }
        this.t.setVisibility(0);
        this.t.setText(String.format(this.itemView.getContext().getResources().getString(C0906R.string.awe), new Object[]{shareRankingListContent.getLastUpdateTime()}));
        this.u.setText(C0906R.string.awd);
        this.i.setTag(50331648, 15);
        z.a().a(shareRankingListContent, this.h, this.m.getConversationId(), false);
    }
}
