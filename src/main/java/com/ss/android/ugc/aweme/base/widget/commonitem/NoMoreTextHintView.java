package com.ss.android.ugc.aweme.base.widget.commonitem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.mvvm.d;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.base.widget.commonitem.a.a;

public class NoMoreTextHintView implements d<a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private TextView mView;

    public void refresh() {
    }

    public View getAndroidView() {
        return this.mView;
    }

    public NoMoreTextHintView(Context context) {
    }

    public void bind(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 25442, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 25442, new Class[]{a.class}, Void.TYPE);
            return;
        }
        v.a(this.mView, (CharSequence) aVar.f35126a);
        if (aVar.f35127b != 0) {
            this.mView.setBackgroundColor(aVar.f35127b);
        }
    }

    public d create(Context context, ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{context, viewGroup}, this, changeQuickRedirect, false, 25441, new Class[]{Context.class, ViewGroup.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{context, viewGroup}, this, changeQuickRedirect, false, 25441, new Class[]{Context.class, ViewGroup.class}, d.class);
        }
        this.mView = (TextView) LayoutInflater.from(context).inflate(C0906R.layout.asz, viewGroup, false);
        return this;
    }
}
