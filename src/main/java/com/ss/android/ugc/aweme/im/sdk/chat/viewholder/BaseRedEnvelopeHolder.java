package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseRedEnvelopeContent;

public abstract class BaseRedEnvelopeHolder<CONTENT extends BaseRedEnvelopeContent> extends BaseViewHolder<CONTENT> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51044a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteImageView f51045b;
    private DmtTextView p;
    private DmtTextView q;
    private DmtTextView r;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51044a, false, 51420, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51044a, false, 51420, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.n.a(this.i);
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51044a, false, 51419, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51044a, false, 51419, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.i = this.itemView.findViewById(C0906R.id.yp);
        this.f51045b = (RemoteImageView) this.itemView.findViewById(C0906R.id.aqj);
        this.p = (DmtTextView) this.itemView.findViewById(C0906R.id.d41);
        this.q = (DmtTextView) this.itemView.findViewById(C0906R.id.a3s);
        this.r = (DmtTextView) this.itemView.findViewById(C0906R.id.czi);
    }

    public BaseRedEnvelopeHolder(View view, int i) {
        super(view);
    }

    public void a(n nVar, n nVar2, CONTENT content, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, content, Integer.valueOf(i)}, this, f51044a, false, 51421, new Class[]{n.class, n.class, BaseRedEnvelopeContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, content, Integer.valueOf(i)}, this, f51044a, false, 51421, new Class[]{n.class, n.class, BaseRedEnvelopeContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, content, i);
        this.p.setText(content.getRedEnvelopeTitle());
        this.q.setVisibility(0);
        this.q.setMaxLines(Integer.MAX_VALUE);
        this.q.setText(C0906R.string.b0o);
        this.r.setText(C0906R.string.azs);
        c.a(this.f51045b, 2130840087);
        this.i.setTag(50331648, 30);
        this.i.setTag(67108864, this.m);
    }
}
