package com.ss.android.ugc.aweme.im.sdk;

import android.support.annotation.CallSuper;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.input.p;
import com.ss.android.ugc.aweme.im.sdk.utils.au;

public class BaseViewHolder<DATA> extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3360a;

    /* renamed from: b  reason: collision with root package name */
    protected p f3361b;

    public void a(DATA data) {
    }

    public void a(DATA data, int i) {
    }

    public void b() {
    }

    @CallSuper
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3360a, false, 50116, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3360a, false, 50116, new Class[0], Void.TYPE);
            return;
        }
        b();
        c();
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3360a, false, 50117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3360a, false, 50117, new Class[0], Void.TYPE);
            return;
        }
        au.a(this.itemView);
    }

    public BaseViewHolder(View view) {
        super(view);
        a();
    }

    public BaseViewHolder(View view, p pVar) {
        super(view);
        this.f3361b = pVar;
        a();
    }

    public BaseViewHolder(ViewGroup viewGroup, @LayoutRes int i) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        a();
    }
}
