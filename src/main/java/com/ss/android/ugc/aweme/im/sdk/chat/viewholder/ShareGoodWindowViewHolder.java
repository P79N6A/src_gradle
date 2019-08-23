package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.im.core.d.n;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareGoodWindowContent;
import java.util.Locale;

public class ShareGoodWindowViewHolder extends ShareSimpleBaseViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51112b;

    public ShareGoodWindowViewHolder(View view, int i) {
        super(view, i);
    }

    public void a(n nVar, n nVar2, BaseContent baseContent, int i) {
        BaseContent baseContent2 = baseContent;
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, baseContent2, Integer.valueOf(i)}, this, f51112b, false, 51551, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, baseContent2, Integer.valueOf(i)}, this, f51112b, false, 51551, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, baseContent, i);
        if (baseContent2 instanceof ShareGoodWindowContent) {
            ShareGoodWindowContent shareGoodWindowContent = (ShareGoodWindowContent) baseContent2;
            this.s.setText(String.format(Locale.getDefault(), this.s.getContext().getString(C0906R.string.as1), new Object[]{shareGoodWindowContent.getName()}));
            this.t.setVisibility(8);
            this.u.setText(C0906R.string.as0);
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.setRoundAsCircle(true);
            ((GenericDraweeHierarchy) this.r.getHierarchy()).setRoundingParams(roundingParams);
            ((GenericDraweeHierarchy) this.r.getHierarchy()).setPlaceholderImage(2130840153);
            c.b(this.r, shareGoodWindowContent.getAvatar());
            this.i.setTag(50331648, 35);
            this.i.setTag(67108864, shareGoodWindowContent);
        }
    }
}
