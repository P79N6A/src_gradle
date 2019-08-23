package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

public class ShareUserMultiReceiveViewHolder extends BaseViewHolder<ShareUserContent> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51131a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteImageView f51132b;
    private DmtTextView p;
    private DmtTextView q;
    private RemoteImageView r;
    private RemoteImageView s;
    private RemoteImageView t;
    private TextView u;

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51131a, false, 51592, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51131a, false, 51592, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.i = this.itemView.findViewById(C0906R.id.yp);
        this.f51132b = (RemoteImageView) this.itemView.findViewById(C0906R.id.aqj);
        this.p = (DmtTextView) this.itemView.findViewById(C0906R.id.d41);
        this.q = (DmtTextView) this.itemView.findViewById(C0906R.id.a3s);
        this.r = (RemoteImageView) this.itemView.findViewById(C0906R.id.arr);
        this.s = (RemoteImageView) this.itemView.findViewById(C0906R.id.ars);
        this.t = (RemoteImageView) this.itemView.findViewById(C0906R.id.art);
        this.u = (TextView) this.itemView.findViewById(C0906R.id.ah8);
    }

    public void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51131a, false, 51594, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51131a, false, 51594, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.i.setOnClickListener(onClickListener);
        this.u.setOnClickListener(onClickListener);
    }

    public final void a(View.OnLongClickListener onLongClickListener) {
        View.OnLongClickListener onLongClickListener2 = onLongClickListener;
        if (PatchProxy.isSupport(new Object[]{onLongClickListener2}, this, f51131a, false, 51595, new Class[]{View.OnLongClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onLongClickListener2}, this, f51131a, false, 51595, new Class[]{View.OnLongClickListener.class}, Void.TYPE);
            return;
        }
        this.i.setOnLongClickListener(onLongClickListener2);
    }

    public ShareUserMultiReceiveViewHolder(View view, int i) {
        super(view);
    }

    public void a(n nVar, n nVar2, ShareUserContent shareUserContent, int i) {
        int i2;
        n nVar3 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar3, nVar2, shareUserContent, Integer.valueOf(i)}, this, f51131a, false, 51593, new Class[]{n.class, n.class, ShareUserContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar3, nVar2, shareUserContent, Integer.valueOf(i)}, this, f51131a, false, 51593, new Class[]{n.class, n.class, ShareUserContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, shareUserContent, i);
        this.p.setText(shareUserContent.getName());
        this.q.setVisibility(0);
        if (m.b()) {
            DmtTextView dmtTextView = this.q;
            dmtTextView.setText("@" + shareUserContent.getDesc());
        } else {
            DmtTextView dmtTextView2 = this.q;
            dmtTextView2.setText(GlobalContext.getContext().getString(C0906R.string.ao6) + shareUserContent.getDesc());
        }
        c.b(this.f51132b, shareUserContent.getAvatar());
        c.b(this.r, shareUserContent.getAwemeCoverList().get(0));
        c.b(this.s, shareUserContent.getAwemeCoverList().get(1));
        c.b(this.t, shareUserContent.getAwemeCoverList().get(2));
        IMUser b2 = e.a().b(shareUserContent.getUid());
        if (b2 == null) {
            i2 = 0;
        } else {
            i2 = b2.getFollowStatus();
        }
        if (i2 == 0) {
            this.u.setVisibility(0);
        } else {
            this.u.setVisibility(8);
        }
        this.i.setTag(50331648, 21);
        this.i.setTag(67108864, this.m);
        this.u.setTag(50331648, 5);
        this.u.setTag(67108864, nVar);
    }
}
