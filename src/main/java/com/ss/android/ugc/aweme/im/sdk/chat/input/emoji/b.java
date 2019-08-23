package com.ss.android.ugc.aweme.im.sdk.chat.input.emoji;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.uikit.viewpager.SwipeControlledViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.input.IInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.input.p;
import com.ss.android.ugc.aweme.im.sdk.chat.input.tab.TabIndicatorAdapter;
import com.ss.android.ugc.aweme.im.sdk.chat.input.tab.a;
import com.ss.android.ugc.aweme.im.sdk.resources.c;
import com.ss.android.ugc.aweme.im.sdk.resources.d;
import com.ss.android.ugc.aweme.im.sdk.resources.f;
import com.ss.android.ugc.aweme.im.sdk.resources.k;
import com.ss.android.ugc.aweme.im.sdk.resources.model.e;
import java.util.LinkedHashMap;
import java.util.List;

public final class b extends com.ss.android.ugc.aweme.im.sdk.chat.input.b implements a, d, f {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f50552d;

    /* renamed from: e  reason: collision with root package name */
    public Button f50553e;

    /* renamed from: f  reason: collision with root package name */
    RecyclerView f50554f;
    TabIndicatorAdapter g;
    public e h;
    LinearLayoutManager i;
    public IInputView j;
    int k;
    private SwipeControlledViewPager l;
    private RecyclerView m;
    private com.ss.android.ugc.aweme.im.sdk.chat.input.indicator.b n;
    private EmojiPageAdapter q;

    public final int d() {
        return C0906R.layout.a1o;
    }

    public final e f() {
        return this.h;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50552d, false, 50784, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50552d, false, 50784, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f50553e.setEnabled(z);
        if (z) {
            this.f50553e.setTextColor(this.f50553e.getContext().getResources().getColor(C0906R.color.rk));
        } else {
            this.f50553e.setTextColor(this.f50553e.getContext().getResources().getColor(C0906R.color.q7));
        }
    }

    public final void a(List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list, boolean z, String str) {
        List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0), str}, this, f50552d, false, 50796, new Class[]{List.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z), str}, this, f50552d, false, 50796, new Class[]{List.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (z) {
            this.h.a(list);
            i();
            this.l.setCurrentItem(this.h.b(), false);
        }
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f50552d, false, 50790, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50552d, false, 50790, new Class[0], Void.TYPE);
            return;
        }
        this.q.notifyDataSetChanged();
    }

    public final View a() {
        if (!PatchProxy.isSupport(new Object[0], this, f50552d, false, 50782, new Class[0], View.class)) {
            return super.a();
        }
        return (View) PatchProxy.accessDispatch(new Object[0], this, f50552d, false, 50782, new Class[0], View.class);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f50552d, false, 50787, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50552d, false, 50787, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.ugc.aweme.im.sdk.resources.b.a().d()) {
            this.h.a();
            i();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f50552d, false, 50785, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50552d, false, 50785, new Class[0], Void.TYPE);
            return;
        }
        this.f50553e.setOnClickListener(new p() {

            /* renamed from: b  reason: collision with root package name */
            public static ChangeQuickRedirect f50555b;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f50555b, false, 50799, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f50555b, false, 50799, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                if (view.equals(b.this.f50553e)) {
                    if (b.this.j == null) {
                        b.this.j = new com.ss.android.ugc.aweme.im.sdk.a.d(b.this.f50436c, view.getContext());
                    }
                    b.this.j.b();
                }
            }
        });
        a(this.f50553e);
        k.a().e();
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f50552d, false, 50792, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50552d, false, 50792, new Class[0], Void.TYPE);
        } else if (this.h.f50562b.h() == 3 && this.h.f50562b.i() == 0) {
            this.m.setVisibility(4);
        } else {
            this.m.setVisibility(0);
            if (this.h.c() == this.n.a()) {
                this.n.a(this.h.d());
            } else {
                this.n.a(this.h.c(), this.h.d());
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f50552d, false, 50786, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50552d, false, 50786, new Class[0], Void.TYPE);
            return;
        }
        Context context = this.f50435b.getContext();
        this.h = new e(context);
        this.f50553e = (Button) this.f50435b.findViewById(C0906R.id.a9k);
        this.l = (SwipeControlledViewPager) this.f50435b.findViewById(C0906R.id.a9h);
        this.m = (RecyclerView) this.f50435b.findViewById(C0906R.id.a9d);
        this.f50554f = (RecyclerView) this.f50435b.findViewById(C0906R.id.a9n);
        this.q = new EmojiPageAdapter(this.f50436c, this.l, this);
        this.l.setAdapter(this.q);
        this.i = new LinearLayoutManager(context, 0, false);
        this.f50554f.setLayoutManager(this.i);
        this.g = new TabIndicatorAdapter(this);
        this.f50554f.setAdapter(this.g);
        this.n = new com.ss.android.ugc.aweme.im.sdk.chat.input.indicator.b(this.m);
        g();
        this.l.addOnPageChangeListener(new EmojiChoosePanel$2(this));
        i();
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f50552d, false, 50789, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f50552d, false, 50789, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.a(i2);
            this.l.setCurrentItem(this.h.b(), false);
        }
    }

    public final void a(LinkedHashMap<e, List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>> linkedHashMap) {
        if (PatchProxy.isSupport(new Object[]{linkedHashMap}, this, f50552d, false, 50793, new Class[]{LinkedHashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linkedHashMap}, this, f50552d, false, 50793, new Class[]{LinkedHashMap.class}, Void.TYPE);
            return;
        }
        e();
    }

    public final void a(List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f50552d, false, 50798, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f50552d, false, 50798, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.h.a(list);
        i();
        this.l.setCurrentItem(this.h.b(), false);
    }

    public b(Context context, IInputView iInputView) {
        super(context, iInputView);
        boolean z;
        k.a().a((f) this);
        com.ss.android.ugc.aweme.im.sdk.resources.b a2 = com.ss.android.ugc.aweme.im.sdk.resources.b.a();
        if (PatchProxy.isSupport(new Object[]{this}, a2, com.ss.android.ugc.aweme.im.sdk.resources.b.f52260a, false, 53073, new Class[]{d.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.im.sdk.resources.b bVar = a2;
            PatchProxy.accessDispatch(new Object[]{this}, bVar, com.ss.android.ugc.aweme.im.sdk.resources.b.f52260a, false, 53073, new Class[]{d.class}, Void.TYPE);
        } else if (!a2.f52265e.contains(this)) {
            a2.f52265e.add(this);
        }
        com.ss.android.ugc.aweme.im.sdk.resources.b a3 = com.ss.android.ugc.aweme.im.sdk.resources.b.a();
        if (PatchProxy.isSupport(new Object[0], a3, com.ss.android.ugc.aweme.im.sdk.resources.b.f52260a, false, 53071, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a3, com.ss.android.ugc.aweme.im.sdk.resources.b.f52260a, false, 53071, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            z = c.b().f52294d;
        }
        if (z) {
            com.ss.android.ugc.aweme.im.sdk.resources.b.a().b();
        }
    }

    public final void a(e eVar, List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list) {
        if (PatchProxy.isSupport(new Object[]{eVar, list}, this, f50552d, false, 50794, new Class[]{e.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, list}, this, f50552d, false, 50794, new Class[]{e.class, List.class}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(list)) {
            for (int i2 = 0; i2 < this.h.e(); i2++) {
                com.ss.android.ugc.aweme.im.sdk.chat.input.c e2 = this.h.e(i2);
                if (e2.h() == 2) {
                    g gVar = (g) e2;
                    if (gVar.f50579e.equals(eVar)) {
                        gVar.f50580f = list;
                        this.h.a(this.h.f50564d);
                        i();
                        this.l.setCurrentItem(this.h.b(), false);
                        return;
                    }
                }
            }
        }
    }

    public final void b(List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list, boolean z, String str) {
        List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list2 = list;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f50552d, false, 50797, new Class[]{List.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z), str2}, this, f50552d, false, 50797, new Class[]{List.class, Boolean.TYPE, String.class}, Void.TYPE);
        } else if (z) {
            com.bytedance.ies.dmt.ui.d.a.a(GlobalContext.getContext(), (int) C0906R.string.ar4, 1).a();
            this.h.a(list);
            i();
            this.l.setCurrentItem(this.h.b(), false);
        } else {
            com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), str2, 1).a();
        }
    }

    public final void a(List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list, com.ss.android.ugc.aweme.im.sdk.resources.model.a aVar, boolean z, String str) {
        List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, aVar, Byte.valueOf(z ? (byte) 1 : 0), str}, this, f50552d, false, 50795, new Class[]{List.class, com.ss.android.ugc.aweme.im.sdk.resources.model.a.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, aVar, Byte.valueOf(z), str}, this, f50552d, false, 50795, new Class[]{List.class, com.ss.android.ugc.aweme.im.sdk.resources.model.a.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (z) {
            this.h.a(list);
            i();
            this.l.setCurrentItem(this.h.b(), false);
        }
    }
}
