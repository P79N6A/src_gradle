package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.v;

public abstract class AbsSearchViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41523a;

    /* renamed from: b  reason: collision with root package name */
    protected s f41524b = new s(false);

    public abstract View a();

    public final FragmentActivity b() {
        if (!PatchProxy.isSupport(new Object[0], this, f41523a, false, 35482, new Class[0], FragmentActivity.class)) {
            return (FragmentActivity) v.c(a());
        }
        return (FragmentActivity) PatchProxy.accessDispatch(new Object[0], this, f41523a, false, 35482, new Class[0], FragmentActivity.class);
    }

    public final AbsSearchViewHolder a(s sVar) {
        if (sVar != null) {
            this.f41524b = sVar;
        }
        return this;
    }

    public AbsSearchViewHolder(View view) {
        super(view);
    }
}
