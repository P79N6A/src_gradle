package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMusicContent;

public class ShareMusicMultiReceiveViewHolder extends BaseViewHolder<ShareMusicContent> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51118a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteImageView f51119b;
    private DmtTextView p;
    private DmtTextView q;
    private RemoteImageView r;
    private RemoteImageView s;
    private RemoteImageView t;

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51118a, false, 51563, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51118a, false, 51563, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.i = this.itemView.findViewById(C0906R.id.yp);
        this.f51119b = (RemoteImageView) this.itemView.findViewById(C0906R.id.aqj);
        this.p = (DmtTextView) this.itemView.findViewById(C0906R.id.d41);
        this.q = (DmtTextView) this.itemView.findViewById(C0906R.id.a3s);
        this.r = (RemoteImageView) this.itemView.findViewById(C0906R.id.arr);
        this.s = (RemoteImageView) this.itemView.findViewById(C0906R.id.ars);
        this.t = (RemoteImageView) this.itemView.findViewById(C0906R.id.art);
    }

    public final void a(View.OnLongClickListener onLongClickListener) {
        View.OnLongClickListener onLongClickListener2 = onLongClickListener;
        if (PatchProxy.isSupport(new Object[]{onLongClickListener2}, this, f51118a, false, 51566, new Class[]{View.OnLongClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onLongClickListener2}, this, f51118a, false, 51566, new Class[]{View.OnLongClickListener.class}, Void.TYPE);
            return;
        }
        this.i.setOnLongClickListener(onLongClickListener2);
    }

    public void a(View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{onClickListener2}, this, f51118a, false, 51565, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener2}, this, f51118a, false, 51565, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.i.setOnClickListener(onClickListener2);
    }

    public ShareMusicMultiReceiveViewHolder(View view, int i) {
        super(view);
    }

    public void a(n nVar, n nVar2, ShareMusicContent shareMusicContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, shareMusicContent, Integer.valueOf(i)}, this, f51118a, false, 51564, new Class[]{n.class, n.class, ShareMusicContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, shareMusicContent, Integer.valueOf(i)}, this, f51118a, false, 51564, new Class[]{n.class, n.class, ShareMusicContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, shareMusicContent, i);
        this.p.setText(shareMusicContent.getMusicName());
        this.q.setVisibility(0);
        this.q.setText(String.format(this.itemView.getContext().getResources().getString(C0906R.string.avb), new Object[]{com.ss.android.ugc.aweme.im.sdk.utils.n.a((long) shareMusicContent.getUserCount())}));
        c.a(this.f51119b, 2130840095);
        c.b(this.r, shareMusicContent.getAwemeCoverList().get(0));
        c.b(this.s, shareMusicContent.getAwemeCoverList().get(1));
        c.b(this.t, shareMusicContent.getAwemeCoverList().get(2));
        this.i.setTag(50331648, 17);
        this.i.setTag(67108864, this.m);
    }
}
