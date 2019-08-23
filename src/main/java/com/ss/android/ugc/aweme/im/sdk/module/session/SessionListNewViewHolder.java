package com.ss.android.ugc.aweme.im.sdk.module.session;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.bytedance.im.core.d.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.service.session.a;

public class SessionListNewViewHolder extends SessionListViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51881a;

    /* renamed from: e  reason: collision with root package name */
    private final AppCompatTextView f51882e;

    public final void a(a aVar, int i) {
        if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i)}, this, f51881a, false, 52449, new Class[]{a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i)}, this, f51881a, false, 52449, new Class[]{a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(aVar, i);
        if (aVar.b() == 0) {
            com.ss.android.ugc.aweme.im.sdk.module.session.a.a aVar2 = (com.ss.android.ugc.aweme.im.sdk.module.session.a.a) aVar;
            if (aVar2.c() == null || aVar2.c().getFollowStatus() != 2) {
                this.f51882e.setVisibility(8);
            } else {
                int a2 = com.ss.android.ugc.aweme.im.sdk.feedupdate.a.a().a(String.valueOf(e.a(aVar.O_())));
                if (a2 > 1) {
                    this.f51882e.setText(GlobalContext.getContext().getString(C0906R.string.aze, new Object[]{com.ss.android.ugc.aweme.im.sdk.feedupdate.a.a().a(a2)}));
                    this.f51882e.setVisibility(0);
                } else if (a2 == 1) {
                    this.f51882e.setText(GlobalContext.getContext().getString(C0906R.string.azf));
                    this.f51882e.setVisibility(0);
                } else {
                    this.f51882e.setVisibility(8);
                }
            }
            return;
        }
        this.f51882e.setVisibility(8);
    }

    public SessionListNewViewHolder(View view, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        super(view, onClickListener, onLongClickListener);
        this.f51882e = (AppCompatTextView) view.findViewById(C0906R.id.czi);
    }
}
