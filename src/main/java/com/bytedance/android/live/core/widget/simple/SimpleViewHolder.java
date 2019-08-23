package com.bytedance.android.live.core.widget.simple;

import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public class SimpleViewHolder extends BaseViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8365a;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, Object> f8366d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private SparseArray<View> f8367e = new SparseArray<>();

    public final void a(Object obj, int i) {
    }

    public SimpleViewHolder(View view) {
        super(view);
        this.itemView.setTag(this);
    }

    public final void b(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f8365a, false, 1536, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2}, this, f8365a, false, 1536, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f8366d.put("__________", obj2);
    }

    public final long a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f8365a, false, 1534, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, this, f8365a, false, 1534, new Class[]{String.class}, Long.TYPE)).longValue();
        }
        Object obj = this.f8366d.get(str2);
        if (obj == null) {
            return 0;
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return 0;
            }
        } else {
            try {
                return ((Long) obj).longValue();
            } catch (ClassCastException unused2) {
                return 0;
            }
        }
    }

    public final <V extends View> V a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8365a, false, 1522, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8365a, false, 1522, new Class[]{Integer.TYPE}, View.class);
        }
        V v = (View) this.f8367e.get(i);
        if (v == null) {
            v = this.itemView.findViewById(i);
            this.f8367e.put(i, v);
        }
        return v;
    }

    public final SimpleViewHolder a(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f8365a, false, 1523, new Class[]{Integer.TYPE, String.class}, SimpleViewHolder.class)) {
            return (SimpleViewHolder) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f8365a, false, 1523, new Class[]{Integer.TYPE, String.class}, SimpleViewHolder.class);
        }
        ((TextView) a(i)).setText(str2);
        return this;
    }
}
