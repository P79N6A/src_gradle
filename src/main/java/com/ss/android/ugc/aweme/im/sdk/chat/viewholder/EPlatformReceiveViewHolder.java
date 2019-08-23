package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.EPlatformCardContent;
import com.ss.android.ugc.aweme.im.sdk.e.a;
import com.ss.android.ugc.aweme.im.sdk.widget.EPlatformSpanInterceptNoTextView;

public class EPlatformReceiveViewHolder extends BaseViewHolder<EPlatformCardContent> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51061a;

    /* renamed from: b  reason: collision with root package name */
    boolean f51062b = true;
    private TextView p;

    public EPlatformReceiveViewHolder(View view, int i) {
        super(view);
        this.p = (TextView) view.findViewById(C0906R.id.bnw);
        this.i = view.findViewById(C0906R.id.yp);
    }

    public void a(n nVar, n nVar2, EPlatformCardContent ePlatformCardContent, int i) {
        EPlatformCardContent ePlatformCardContent2 = ePlatformCardContent;
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, ePlatformCardContent2, Integer.valueOf(i)}, this, f51061a, false, 51452, new Class[]{n.class, n.class, EPlatformCardContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, ePlatformCardContent2, Integer.valueOf(i)}, this, f51061a, false, 51452, new Class[]{n.class, n.class, EPlatformCardContent.class, Integer.TYPE}, Void.TYPE);
        } else if (ePlatformCardContent2 != null) {
            super.a(nVar, nVar2, ePlatformCardContent, i);
            if (this.f51062b) {
                a.a(this.p, ePlatformCardContent2.content, ePlatformCardContent2.actions, this.h, nVar.getMsgId(), this.itemView.getContext().getResources().getColor(C0906R.color.sa));
                ((EPlatformSpanInterceptNoTextView) this.p).f52753b = this.itemView.getContext().getResources().getColor(C0906R.color.py);
            } else {
                a.a(this.p, ePlatformCardContent2.content, ePlatformCardContent2.actions, this.h, nVar.getMsgId(), -1);
                ((EPlatformSpanInterceptNoTextView) this.p).f52753b = this.itemView.getContext().getResources().getColor(C0906R.color.pz);
            }
            ((EPlatformSpanInterceptNoTextView) this.p).setContentArea(this.i);
            this.i.setTag(50331648, 36);
        }
    }
}
