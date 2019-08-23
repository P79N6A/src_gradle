package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMiniAppContent;

public class ShareMiniAppViewHolder extends ShareSimpleBaseViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51117b;

    public ShareMiniAppViewHolder(View view, int i) {
        super(view, i);
    }

    public void a(n nVar, n nVar2, BaseContent baseContent, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, baseContent, Integer.valueOf(i)}, this, f51117b, false, 51562, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, baseContent, Integer.valueOf(i)}, this, f51117b, false, 51562, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, baseContent, i);
        ShareMiniAppContent shareMiniAppContent = (ShareMiniAppContent) baseContent;
        this.s.setMaxLines(1);
        this.s.setText(shareMiniAppContent.getAppName());
        this.t.setVisibility(0);
        this.t.setMaxLines(2);
        this.t.setText(shareMiniAppContent.getTitle());
        if (shareMiniAppContent.isGame()) {
            this.u.setText(C0906R.string.av4);
        } else {
            this.u.setText(C0906R.string.av2);
        }
        if (!TextUtils.isEmpty(shareMiniAppContent.getImageUrl())) {
            c.a(this.r, shareMiniAppContent.getImageUrl());
        } else {
            RemoteImageView remoteImageView = this.r;
            if (shareMiniAppContent.isGame()) {
                i2 = 2130840531;
            } else {
                i2 = 2130840530;
            }
            c.a(remoteImageView, i2);
        }
        this.i.setTag(50331648, 20);
    }
}
