package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.d.n;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent;

public class SharePoiViewHolder extends BaseViewHolder<SharePoiContent> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51127b;

    /* renamed from: a  reason: collision with root package name */
    private RemoteImageView f51128a;
    private DmtTextView p;
    private DmtTextView q;
    private RemoteImageView r;
    private RemoteImageView s;
    private RemoteImageView t;

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51127b, false, 51584, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51127b, false, 51584, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.i = this.itemView.findViewById(C0906R.id.yp);
        this.f51128a = (RemoteImageView) this.itemView.findViewById(C0906R.id.aqj);
        this.p = (DmtTextView) this.itemView.findViewById(C0906R.id.d41);
        this.q = (DmtTextView) this.itemView.findViewById(C0906R.id.a3s);
        this.r = (RemoteImageView) this.itemView.findViewById(C0906R.id.arr);
        this.s = (RemoteImageView) this.itemView.findViewById(C0906R.id.ars);
        this.t = (RemoteImageView) this.itemView.findViewById(C0906R.id.art);
    }

    public SharePoiViewHolder(View view, int i) {
        super(view);
    }

    public void a(n nVar, n nVar2, SharePoiContent sharePoiContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, sharePoiContent, Integer.valueOf(i)}, this, f51127b, false, 51585, new Class[]{n.class, n.class, SharePoiContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, sharePoiContent, Integer.valueOf(i)}, this, f51127b, false, 51585, new Class[]{n.class, n.class, SharePoiContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, sharePoiContent, i);
        this.p.setText(sharePoiContent.getTitle());
        this.q.setVisibility(0);
        this.q.setText(String.format(this.itemView.getContext().getResources().getString(C0906R.string.awc), new Object[]{com.ss.android.ugc.aweme.im.sdk.utils.n.a((long) sharePoiContent.getUserCount())}));
        ((GenericDraweeHierarchy) this.f51128a.getHierarchy()).setPlaceholderImage(2130840106);
        ((GenericDraweeHierarchy) this.f51128a.getHierarchy()).setFailureImage(2130840106);
        c.a(this.f51128a, 2130840105);
        c.b(this.r, sharePoiContent.getCoverUrl().get(0));
        c.b(this.s, sharePoiContent.getCoverUrl().get(1));
        c.b(this.t, sharePoiContent.getCoverUrl().get(2));
        this.i.setTag(50331648, 16);
        this.i.setTag(67108864, sharePoiContent.getPoiId());
        this.i.setTag(50331649, this.h);
    }
}
