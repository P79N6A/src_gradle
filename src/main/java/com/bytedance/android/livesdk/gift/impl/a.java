package com.bytedance.android.livesdk.gift.impl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.model.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public final class a extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15046a;

    /* renamed from: b  reason: collision with root package name */
    public final C0107a f15047b;

    /* renamed from: c  reason: collision with root package name */
    private final List<d> f15048c;

    /* renamed from: d  reason: collision with root package name */
    private final d f15049d;

    /* renamed from: com.bytedance.android.livesdk.gift.impl.a$a  reason: collision with other inner class name */
    public interface C0107a {
        void a();

        void a(int i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f15046a, false, 9774, new Class[0], Integer.TYPE)) {
            return this.f15048c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f15046a, false, 9774, new Class[0], Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public d getItem(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f15046a, false, 9775, new Class[]{Integer.TYPE}, d.class)) {
            return this.f15048c.get(i);
        }
        return (d) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f15046a, false, 9775, new Class[]{Integer.TYPE}, d.class);
    }

    public final int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f15046a, false, 9776, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f15046a, false, 9776, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (com.bytedance.android.live.uikit.a.a.a() || com.bytedance.android.live.uikit.a.a.b()) {
            return 0;
        } else if (getItem(i) == this.f15049d) {
            return 1024;
        } else {
            return 0;
        }
    }

    public a(List<d> list, C0107a aVar) {
        this.f15047b = aVar;
        if (list == null) {
            this.f15048c = new ArrayList();
        } else {
            this.f15048c = list;
        }
        this.f15049d = new d();
        if (!com.bytedance.android.live.uikit.a.a.a() && !com.bytedance.android.live.uikit.a.a.b()) {
            this.f15048c.add(0, this.f15049d);
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        View view3;
        View view4;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, viewGroup2}, this, f15046a, false, 9777, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, viewGroup2}, this, f15046a, false, 9777, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
        } else if (com.bytedance.android.live.uikit.a.a.a() || com.bytedance.android.live.uikit.a.a.b()) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, viewGroup2}, this, f15046a, false, 9778, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, viewGroup2}, this, f15046a, false, 9778, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
            }
            if (view == null) {
                view2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ajd, viewGroup2, false);
            } else {
                view2 = view;
            }
            final d a2 = getItem(i);
            ((TextView) view2.findViewById(C0906R.id.d0j)).setText(String.valueOf(a2.f15112a));
            view2.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f15050a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f15050a, false, 9780, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f15050a, false, 9780, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (a.this.f15047b != null) {
                        a.this.f15047b.a(a2.f15112a);
                    }
                }
            });
            return view2;
        } else {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, viewGroup2}, this, f15046a, false, 9779, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, viewGroup2}, this, f15046a, false, 9779, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
            }
            if (getItemViewType(i) == 1024) {
                if (view == null) {
                    view3 = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aje, viewGroup2, false);
                } else {
                    view3 = view;
                }
                view3.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f15053a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f15053a, false, 9781, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f15053a, false, 9781, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        if (a.this.f15047b != null) {
                            a.this.f15047b.a();
                        }
                    }
                });
            } else {
                if (view == null) {
                    view4 = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ajd, viewGroup2, false);
                } else {
                    view4 = view;
                }
                final d a3 = getItem(i);
                ((TextView) view3.findViewById(C0906R.id.d0j)).setText(String.valueOf(a3.f15112a));
                ((TextView) view3.findViewById(C0906R.id.d15)).setText(String.valueOf(a3.f15113b));
                view3.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f15055a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f15055a, false, 9782, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f15055a, false, 9782, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        if (a.this.f15047b != null) {
                            a.this.f15047b.a(a3.f15112a);
                        }
                    }
                });
            }
            return view3;
        }
    }
}
