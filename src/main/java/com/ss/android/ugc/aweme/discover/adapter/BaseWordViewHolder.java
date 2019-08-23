package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import java.util.List;

public abstract class BaseWordViewHolder<T> extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41547a;

    /* renamed from: b  reason: collision with root package name */
    protected TextView f41548b;

    /* renamed from: c  reason: collision with root package name */
    protected View f41549c;

    /* renamed from: d  reason: collision with root package name */
    protected TagFlowLayout f41550d;

    /* renamed from: e  reason: collision with root package name */
    protected View f41551e;

    /* renamed from: f  reason: collision with root package name */
    protected View f41552f;
    protected List<T> g;

    public abstract void a(T t, int i);

    public abstract boolean b(List<T> list);

    public abstract void c(List<T> list);

    public void a() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f41547a, false, 35502, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41547a, false, 35502, new Class[0], Void.TYPE);
            return;
        }
        int visibleViewCount = this.f41550d.getVisibleViewCount();
        while (i < visibleViewCount && i < this.g.size()) {
            a(this.g.get(i), i);
            i++;
        }
    }

    public BaseWordViewHolder(View view) {
        super(view);
        if (PatchProxy.isSupport(new Object[0], this, f41547a, false, 35500, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41547a, false, 35500, new Class[0], Void.TYPE);
            return;
        }
        this.f41548b = (TextView) this.itemView.findViewById(C0906R.id.dkk);
        this.f41549c = this.itemView.findViewById(C0906R.id.bi9);
        this.f41550d = (TagFlowLayout) this.itemView.findViewById(C0906R.id.d2_);
        this.f41551e = this.itemView.findViewById(C0906R.id.bii);
        this.f41552f = this.itemView.findViewById(C0906R.id.dtr);
    }

    public final void a(List<T> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f41547a, false, 35501, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f41547a, false, 35501, new Class[]{List.class}, Void.TYPE);
        } else if (CollectionUtils.isEmpty(list)) {
            v.a(this.itemView, 8);
        } else if (!b(list)) {
            c(list);
            this.f41550d.post(new a(this));
        }
    }
}
