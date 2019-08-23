package com.bytedance.ies.dmt.ui.input.emoji;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.input.IInputView;
import com.bytedance.ies.dmt.ui.input.b;
import com.bytedance.ies.dmt.ui.input.d;
import com.bytedance.ies.dmt.ui.input.tab.TabIndicatorAdapter;
import com.bytedance.ies.dmt.ui.input.tab.a;
import com.bytedance.ies.uikit.viewpager.SwipeControlledViewPager;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Iterator;

public final class c extends b implements a {

    /* renamed from: c  reason: collision with root package name */
    public Button f20390c;

    /* renamed from: d  reason: collision with root package name */
    RecyclerView f20391d;

    /* renamed from: e  reason: collision with root package name */
    TabIndicatorAdapter f20392e;

    /* renamed from: f  reason: collision with root package name */
    public e f20393f;
    LinearLayoutManager g;
    public IInputView h;
    int i;
    private View l;
    private SwipeControlledViewPager m;
    private RecyclerView n;
    private com.bytedance.ies.dmt.ui.input.indicator.b o;
    private EmojiPageAdapter p;
    private com.bytedance.ies.dmt.ui.base.c q;

    public final int d() {
        return C0906R.layout.ap4;
    }

    public final e e() {
        return this.f20393f;
    }

    public final View a() {
        return super.a();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void c() {
        this.q = new com.bytedance.ies.dmt.ui.base.c() {
            public final void onClick(View view) {
                if (view.equals(c.this.f20390c) && c.this.h == null) {
                    c.this.h = new h(c.this.f20359b, view.getContext());
                }
            }
        };
        this.f20390c.setOnClickListener(this.q);
        a(this.f20390c);
    }

    public final void f() {
        this.n.setVisibility(0);
        if (this.f20393f.a() == this.o.a()) {
            this.o.a(this.f20393f.b());
        } else {
            this.o.a(this.f20393f.a(), this.f20393f.b());
        }
    }

    public final void b() {
        this.f20393f = new e(this.f20358a.getContext());
        this.f20390c = (Button) this.f20358a.findViewById(C0906R.id.a9k);
        this.m = (SwipeControlledViewPager) this.f20358a.findViewById(C0906R.id.a9h);
        this.n = (RecyclerView) this.f20358a.findViewById(C0906R.id.a9d);
        this.f20391d = (RecyclerView) this.f20358a.findViewById(C0906R.id.a9n);
        this.l = this.f20358a.findViewById(C0906R.id.a9j);
        this.p = new EmojiPageAdapter(this.f20359b, this);
        this.m.setAdapter(this.p);
        this.g = new LinearLayoutManager(this.f20391d.getContext(), 0, false);
        this.f20391d.setLayoutManager(this.g);
        this.f20392e = new TabIndicatorAdapter(this);
        this.f20391d.setAdapter(this.f20392e);
        this.o = new com.bytedance.ies.dmt.ui.input.indicator.b(this.n);
        if (d.a(this.f20358a.getContext()) > 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.l.getLayoutParams();
            layoutParams.height = d.a(this.f20358a.getContext());
            this.l.setLayoutParams(layoutParams);
        }
        f();
        this.m.addOnPageChangeListener(new EmojiChoosePanel$2(this));
        this.p.notifyDataSetChanged();
    }

    public final void a(int i2) {
        int i3;
        if (this.f20393f != null) {
            this.f20393f.a(i2);
            SwipeControlledViewPager swipeControlledViewPager = this.m;
            e eVar = this.f20393f;
            Iterator<com.bytedance.ies.dmt.ui.input.c> it2 = eVar.f20398c.iterator();
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i3 = 0;
                    break;
                }
                com.bytedance.ies.dmt.ui.input.c next = it2.next();
                if (next == eVar.f20396a) {
                    i3 = eVar.f20396a.c() + i4;
                    break;
                }
                i4 += next.d();
            }
            swipeControlledViewPager.setCurrentItem(i3, false);
        }
    }

    public c(Context context, IInputView iInputView) {
        super(context, iInputView);
    }
}
