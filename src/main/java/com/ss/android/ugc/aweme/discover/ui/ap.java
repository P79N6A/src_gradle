package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;

public abstract class ap<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3074a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f3075b;

    /* renamed from: c  reason: collision with root package name */
    protected View f3076c;

    /* renamed from: d  reason: collision with root package name */
    public DmtTextView f3077d;

    /* renamed from: e  reason: collision with root package name */
    protected TextView f3078e;

    /* renamed from: f  reason: collision with root package name */
    protected ViewGroup f3079f;
    protected LinearLayout g;
    protected a h;

    public interface a {
        void a();
    }

    public final View b() {
        return this.f3076c;
    }

    @CallSuper
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3074a, false, 37982, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3074a, false, 37982, new Class[0], Void.TYPE);
            return;
        }
        this.f3077d = (DmtTextView) this.f3076c.findViewById(C0906R.id.cll);
        this.g = (LinearLayout) this.f3076c.findViewById(C0906R.id.cli);
        this.f3078e = (TextView) this.f3076c.findViewById(C0906R.id.clq);
        this.f3079f = (ViewGroup) this.f3076c.findViewById(C0906R.id.cln);
        this.f3079f.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f43127a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f43127a, false, 37986, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f43127a, false, 37986, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (ap.this.h != null) {
                    ap.this.h.a();
                }
            }
        });
        v.a(!com.ss.android.g.a.a(), this.f3076c.findViewById(C0906R.id.axu));
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3074a, false, 37985, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3074a, false, 37985, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.f3079f.setVisibility(0);
        } else {
            this.f3079f.setVisibility(8);
        }
    }

    public ap(View view, Context context) {
        this(view, context, null);
    }

    public final void a(T t, SearchResultParam searchResultParam) {
        T t2 = t;
        SearchResultParam searchResultParam2 = searchResultParam;
        if (PatchProxy.isSupport(new Object[]{t2, searchResultParam2}, this, f3074a, false, 37983, new Class[]{Object.class, SearchResultParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t2, searchResultParam2}, this, f3074a, false, 37983, new Class[]{Object.class, SearchResultParam.class}, Void.TYPE);
            return;
        }
        a(t2, searchResultParam2, true);
    }

    public ap(View view, Context context, a aVar) {
        this.f3076c = view;
        this.f3075b = context;
        this.h = aVar;
        a();
    }

    public void a(T t, SearchResultParam searchResultParam, boolean z) {
        if (PatchProxy.isSupport(new Object[]{t, searchResultParam, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3074a, false, 37984, new Class[]{Object.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t, searchResultParam, Byte.valueOf(z)}, this, f3074a, false, 37984, new Class[]{Object.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(z);
    }
}
