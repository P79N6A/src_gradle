package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;

public final /* synthetic */ class r implements MvImageChooseAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68626a;

    /* renamed from: b  reason: collision with root package name */
    private final MvImageChooseAdapter f68627b;

    /* renamed from: c  reason: collision with root package name */
    private final MvImageChooseAdapter.ViewHolder f68628c;

    r(MvImageChooseAdapter mvImageChooseAdapter, MvImageChooseAdapter.ViewHolder viewHolder) {
        this.f68627b = mvImageChooseAdapter;
        this.f68628c = viewHolder;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68626a, false, 78015, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68626a, false, 78015, new Class[0], Void.TYPE);
            return;
        }
        MvImageChooseAdapter mvImageChooseAdapter = this.f68627b;
        MvImageChooseAdapter.ViewHolder viewHolder = this.f68628c;
        if (mvImageChooseAdapter.f68569e.size() == mvImageChooseAdapter.f68566b) {
            mvImageChooseAdapter.notifyDataSetChanged();
        } else {
            mvImageChooseAdapter.f68569e.add(viewHolder.h);
            viewHolder.h.f68588b = mvImageChooseAdapter.f68569e.size();
            if (mvImageChooseAdapter.f68569e.size() == mvImageChooseAdapter.f68566b) {
                mvImageChooseAdapter.notifyDataSetChanged();
            } else {
                mvImageChooseAdapter.notifyItemChanged(viewHolder.i);
            }
        }
        if (mvImageChooseAdapter.g != null) {
            mvImageChooseAdapter.g.a(mvImageChooseAdapter.f68569e);
        }
        viewHolder.f68582b.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300).start();
        viewHolder.f68586f.setAlpha(0.0f);
        viewHolder.f68586f.setVisibility(0);
        viewHolder.f68586f.animate().alpha(1.0f).setDuration(300).start();
    }
}
