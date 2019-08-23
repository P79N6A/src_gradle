package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseRedEnvelopeContent;

public abstract class BaseRedEnvelopeSendHolder<CONTENT extends BaseRedEnvelopeContent> extends BaseRedEnvelopeHolder<CONTENT> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51046b;
    private c p;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51046b, false, 51422, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51046b, false, 51422, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.j = (ImageView) a((int) C0906R.id.cv9);
        this.p = new c(this.j);
    }

    public final void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51046b, false, 51423, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51046b, false, 51423, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.j.setOnClickListener(onClickListener);
        this.n.a(this.j);
    }

    public BaseRedEnvelopeSendHolder(View view, int i) {
        super(view, i);
    }

    public final void a(n nVar, n nVar2, CONTENT content, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, content, Integer.valueOf(i)}, this, f51046b, false, 51424, new Class[]{n.class, n.class, BaseRedEnvelopeContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, content, Integer.valueOf(i)}, this, f51046b, false, 51424, new Class[]{n.class, n.class, BaseRedEnvelopeContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, content, i);
        this.p.a(this.m);
    }
}
