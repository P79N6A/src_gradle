package com.ss.android.ugc.aweme.video.f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76077a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f76078b;

    /* renamed from: c  reason: collision with root package name */
    public TableLayout f76079c;

    /* renamed from: d  reason: collision with root package name */
    private Context f76080d;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76081a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f76082b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f76083c;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f76081a, false, 89363, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f76081a, false, 89363, new Class[]{String.class}, Void.TYPE);
                return;
            }
            if (this.f76083c != null) {
                this.f76083c.setText(str);
            }
        }
    }

    public b(Context context) {
        this(context, C0906R.layout.adu);
    }

    private a a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f76077a, false, 89358, new Class[]{View.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{view2}, this, f76077a, false, 89358, new Class[]{View.class}, a.class);
        }
        a aVar = (a) view.getTag();
        if (aVar == null) {
            aVar = new a((byte) 0);
            aVar.f76082b = (TextView) view2.findViewById(C0906R.id.bpn);
            aVar.f76083c = (TextView) view2.findViewById(C0906R.id.dqy);
            view2.setTag(aVar);
        }
        return aVar;
    }

    private b(Context context, int i) {
        this.f76080d = context;
        this.f76078b = (ViewGroup) LayoutInflater.from(this.f76080d).inflate(C0906R.layout.adu, null);
        this.f76079c = (TableLayout) this.f76078b.findViewById(C0906R.id.cz9);
    }

    public final View a(int i, String str) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f76077a, false, 89354, new Class[]{Integer.TYPE, String.class}, View.class)) {
            return a(this.f76080d.getString(i), str);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f76077a, false, 89354, new Class[]{Integer.TYPE, String.class}, View.class);
    }

    private View a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f76077a, false, 89353, new Class[]{String.class, String.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f76077a, false, 89353, new Class[]{String.class, String.class}, View.class);
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.layout.adw), str3, str4}, this, f76077a, false, 89357, new Class[]{Integer.TYPE, String.class, String.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.layout.adw), str3, str4}, this, f76077a, false, 89357, new Class[]{Integer.TYPE, String.class, String.class}, View.class);
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f76080d).inflate(C0906R.layout.adw, this.f76079c, false);
        if (PatchProxy.isSupport(new Object[]{viewGroup, str3, str4}, this, f76077a, false, 89359, new Class[]{View.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup, str3, str4}, this, f76077a, false, 89359, new Class[]{View.class, String.class, String.class}, Void.TYPE);
        } else {
            a a2 = a(viewGroup);
            if (PatchProxy.isSupport(new Object[]{str3}, a2, a.f76081a, false, 89362, new Class[]{String.class}, Void.TYPE)) {
                a aVar = a2;
                PatchProxy.accessDispatch(new Object[]{str3}, aVar, a.f76081a, false, 89362, new Class[]{String.class}, Void.TYPE);
            } else if (a2.f76082b != null) {
                a2.f76082b.setText(str3);
            }
            a2.a(str4);
        }
        this.f76079c.addView(viewGroup);
        return viewGroup;
    }

    public final void a(View view, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{view, str2}, this, f76077a, false, 89360, new Class[]{View.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, str2}, this, f76077a, false, 89360, new Class[]{View.class, String.class}, Void.TYPE);
            return;
        }
        a(view).a(str2);
    }
}
