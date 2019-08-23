package com.ss.android.ugc.aweme.profile.adapter;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.ss.android.ugc.aweme.draft.a.c;

public class DraftBoxViewHolder extends AnimatedViewHolder<c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61244a;

    /* renamed from: b  reason: collision with root package name */
    Context f61245b;

    /* renamed from: c  reason: collision with root package name */
    public RemoteImageView f61246c;

    public final void a() {
    }

    public DraftBoxViewHolder(View view) {
        super(view);
        this.f61245b = view.getContext();
        this.f61246c = (RemoteImageView) view.findViewById(C0906R.id.a1a);
        this.f61246c.setOnClickListener(new a(this));
    }

    public final void a(c cVar, int i) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2, Integer.valueOf(i)}, this, f61244a, false, 67380, new Class[]{c.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, Integer.valueOf(i)}, this, f61244a, false, 67380, new Class[]{c.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (cVar2 != null) {
            a.b(new b(this, cVar2, i));
        }
    }
}
