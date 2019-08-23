package com.ss.android.ugc.aweme.main.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.mvvm.d;
import com.ss.android.ugc.aweme.base.mvvm.impl.IViewDefault;
import com.ss.android.ugc.aweme.base.widget.commonitem.a.b;

public class StoryFeedLoadMoreProgressBar extends IViewDefault<b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mContext;

    public StoryFeedLoadMoreProgressBar(Context context) {
        super(context);
        this.mContext = context;
    }

    public void bind(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, changeQuickRedirect, false, 58313, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, changeQuickRedirect, false, 58313, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (bVar2.f35128a != 0) {
            this.mView.setBackgroundColor(bVar2.f35128a);
        }
    }

    public d create(Context context, ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{context, viewGroup}, this, changeQuickRedirect, false, 58312, new Class[]{Context.class, ViewGroup.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{context, viewGroup}, this, changeQuickRedirect, false, 58312, new Class[]{Context.class, ViewGroup.class}, d.class);
        }
        this.mView = LayoutInflater.from(this.mContext).inflate(C0906R.layout.asv, viewGroup, false);
        return this;
    }
}
