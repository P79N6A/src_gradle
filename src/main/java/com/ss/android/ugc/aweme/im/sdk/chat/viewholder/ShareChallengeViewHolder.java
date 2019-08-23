package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareChallengeContent;

public class ShareChallengeViewHolder extends BaseViewHolder<ShareChallengeContent> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51105b;

    /* renamed from: a  reason: collision with root package name */
    private RemoteImageView f51106a;
    private DmtTextView p;
    private DmtTextView q;
    private RemoteImageView r;
    private RemoteImageView s;
    private RemoteImageView t;

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51105b, false, 51537, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51105b, false, 51537, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.i = this.itemView.findViewById(C0906R.id.yp);
        this.f51106a = (RemoteImageView) this.itemView.findViewById(C0906R.id.aqj);
        this.p = (DmtTextView) this.itemView.findViewById(C0906R.id.d41);
        this.q = (DmtTextView) this.itemView.findViewById(C0906R.id.a3s);
        this.r = (RemoteImageView) this.itemView.findViewById(C0906R.id.arr);
        this.s = (RemoteImageView) this.itemView.findViewById(C0906R.id.ars);
        this.t = (RemoteImageView) this.itemView.findViewById(C0906R.id.art);
        this.f51106a.setImageResource(2130840070);
    }

    public ShareChallengeViewHolder(View view, int i) {
        super(view);
    }

    public void a(n nVar, n nVar2, ShareChallengeContent shareChallengeContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, shareChallengeContent, Integer.valueOf(i)}, this, f51105b, false, 51538, new Class[]{n.class, n.class, ShareChallengeContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, shareChallengeContent, Integer.valueOf(i)}, this, f51105b, false, 51538, new Class[]{n.class, n.class, ShareChallengeContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, shareChallengeContent, i);
        this.p.setText(shareChallengeContent.getTitle());
        this.q.setVisibility(0);
        this.q.setText(String.format(this.itemView.getContext().getResources().getString(C0906R.string.aps), new Object[]{com.ss.android.ugc.aweme.im.sdk.utils.n.a(shareChallengeContent.getUserCount())}));
        c.b(this.r, shareChallengeContent.getCoverUrl().get(0));
        c.b(this.s, shareChallengeContent.getCoverUrl().get(1));
        c.b(this.t, shareChallengeContent.getCoverUrl().get(2));
        this.i.setTag(50331648, 18);
        this.i.setTag(67108864, shareChallengeContent.getChallengeId());
    }
}
