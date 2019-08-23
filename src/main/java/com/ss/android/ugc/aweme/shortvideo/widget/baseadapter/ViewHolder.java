package com.ss.android.ugc.aweme.shortvideo.widget.baseadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71418a;

    /* renamed from: b  reason: collision with root package name */
    public View f71419b;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray<View> f71420c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    private Context f71421d;

    private ViewHolder(Context context, View view) {
        super(view);
        this.f71421d = context;
        this.f71419b = view;
    }

    public static ViewHolder a(Context context, View view) {
        Context context2 = context;
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{context2, view2}, null, f71418a, true, 81534, new Class[]{Context.class, View.class}, ViewHolder.class)) {
            return new ViewHolder(context2, view2);
        }
        return (ViewHolder) PatchProxy.accessDispatch(new Object[]{context2, view2}, null, f71418a, true, 81534, new Class[]{Context.class, View.class}, ViewHolder.class);
    }
}
