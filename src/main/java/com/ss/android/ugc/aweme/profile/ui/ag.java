package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public final class ag extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62453a;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray f62454b;

    /* renamed from: c  reason: collision with root package name */
    private Context f62455c;

    /* renamed from: d  reason: collision with root package name */
    private List<a> f62456d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f62457a;

        /* renamed from: b  reason: collision with root package name */
        boolean f62458b;

        public a(String str, boolean z) {
            this.f62457a = str;
            this.f62458b = z;
        }
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f62453a, false, 68130, new Class[0], Integer.TYPE)) {
            return this.f62456d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f62453a, false, 68130, new Class[0], Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public a getItem(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f62453a, false, 68131, new Class[]{Integer.TYPE}, a.class)) {
            return this.f62456d.get(i);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f62453a, false, 68131, new Class[]{Integer.TYPE}, a.class);
    }

    public ag(Context context, List<a> list) {
        this.f62455c = context;
        this.f62456d = list;
        this.f62454b = new SparseArray(list.size());
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, viewGroup}, this, f62453a, false, 68132, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, viewGroup}, this, f62453a, false, 68132, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
        }
        if (view == null) {
            view2 = View.inflate(this.f62455c, C0906R.layout.jp, null);
        } else {
            view2 = view;
        }
        a a2 = getItem(i);
        int i3 = i;
        this.f62454b.put(i, a2.f62457a);
        View findViewById = view2.findViewById(C0906R.id.bno);
        ((TextView) view2.findViewById(C0906R.id.dde)).setText(a2.f62457a);
        if (!a2.f62458b) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        return view2;
    }
}
