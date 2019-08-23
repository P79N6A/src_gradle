package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.d.n;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.utils.m;

public class ShareUserSimpleReceiveViewHolder extends BaseViewHolder<ShareUserContent> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51134a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteImageView f51135b;
    private DmtTextView p;
    private DmtTextView q;
    private DmtTextView r;

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51134a, false, 51599, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51134a, false, 51599, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.i = this.itemView.findViewById(C0906R.id.yp);
        this.f51135b = (RemoteImageView) this.itemView.findViewById(C0906R.id.aqj);
        this.p = (DmtTextView) this.itemView.findViewById(C0906R.id.d41);
        this.q = (DmtTextView) this.itemView.findViewById(C0906R.id.a3s);
        this.r = (DmtTextView) this.itemView.findViewById(C0906R.id.czi);
    }

    public final void a(View.OnLongClickListener onLongClickListener) {
        View.OnLongClickListener onLongClickListener2 = onLongClickListener;
        if (PatchProxy.isSupport(new Object[]{onLongClickListener2}, this, f51134a, false, 51602, new Class[]{View.OnLongClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onLongClickListener2}, this, f51134a, false, 51602, new Class[]{View.OnLongClickListener.class}, Void.TYPE);
            return;
        }
        this.i.setOnLongClickListener(onLongClickListener2);
    }

    public void a(View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{onClickListener2}, this, f51134a, false, 51601, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener2}, this, f51134a, false, 51601, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.i.setOnClickListener(onClickListener2);
    }

    public ShareUserSimpleReceiveViewHolder(View view, int i) {
        super(view);
    }

    public void a(n nVar, n nVar2, ShareUserContent shareUserContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, shareUserContent, Integer.valueOf(i)}, this, f51134a, false, 51600, new Class[]{n.class, n.class, ShareUserContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, shareUserContent, Integer.valueOf(i)}, this, f51134a, false, 51600, new Class[]{n.class, n.class, ShareUserContent.class, Integer.TYPE}, Void.TYPE);
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
        this.r.setText(C0906R.string.azk);
        RoundingParams roundingParams = ((GenericDraweeHierarchy) this.f51135b.getHierarchy()).getRoundingParams();
        roundingParams.setRoundAsCircle(true);
        ((GenericDraweeHierarchy) this.f51135b.getHierarchy()).setRoundingParams(roundingParams);
        c.b(this.f51135b, shareUserContent.getAvatar());
        this.i.setTag(50331648, 21);
        this.i.setTag(67108864, this.m);
    }
}
