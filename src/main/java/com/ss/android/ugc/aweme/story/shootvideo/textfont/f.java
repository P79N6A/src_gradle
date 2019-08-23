package com.ss.android.ugc.aweme.story.shootvideo.textfont;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.d;
import java.util.ArrayList;
import java.util.List;

public class f extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74186a;

    /* renamed from: b  reason: collision with root package name */
    public List<c> f74187b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public String f74188c;

    /* renamed from: d  reason: collision with root package name */
    d f74189d;

    /* renamed from: e  reason: collision with root package name */
    public LinearLayout f74190e;

    /* renamed from: f  reason: collision with root package name */
    private a f74191f;
    private List<e> g = new ArrayList();

    public interface a {
        void a(c cVar);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74186a, false, 86116, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74186a, false, 86116, new Class[0], Void.TYPE);
            return;
        }
        for (e next : this.g) {
            String str = d.a().f74173c;
            if (TextUtils.isEmpty(str) || !str.equals(next.getTag())) {
                next.setBackground(0);
            } else if (next.a()) {
                next.setBackground(1);
                next.b();
                this.f74189d.a(next);
            }
        }
    }

    public void setClickFontStyleListener(a aVar) {
        this.f74191f = aVar;
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f74186a, false, 86115, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f74186a, false, 86115, new Class[]{c.class}, Void.TYPE);
            return;
        }
        if (this.f74191f != null) {
            this.f74191f.a(cVar);
        }
        a();
    }

    public final void a(List<c> list) {
        e eVar;
        boolean z;
        List<c> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f74186a, false, 86112, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f74186a, false, 86112, new Class[]{List.class}, Void.TYPE);
        } else if (!com.bytedance.framwork.core.c.a.a(list) && com.bytedance.framwork.core.c.a.a(this.f74187b)) {
            this.f74187b = list2;
            for (int i = 0; i < this.f74187b.size(); i++) {
                if (this.f74187b.get(i) != null) {
                    c cVar = this.f74187b.get(i);
                    if (PatchProxy.isSupport(new Object[]{cVar, Integer.valueOf(i)}, this, f74186a, false, 86113, new Class[]{c.class, Integer.TYPE}, e.class)) {
                        eVar = (e) PatchProxy.accessDispatch(new Object[]{cVar, Integer.valueOf(i)}, this, f74186a, false, 86113, new Class[]{c.class, Integer.TYPE}, e.class);
                    } else {
                        eVar = new e(getContext());
                        if (PatchProxy.isSupport(new Object[]{cVar}, eVar, e.f74180a, false, 86100, new Class[]{c.class}, Void.TYPE)) {
                            e eVar2 = eVar;
                            PatchProxy.accessDispatch(new Object[]{cVar}, eVar2, e.f74180a, false, 86100, new Class[]{c.class}, Void.TYPE);
                        } else if (cVar != null) {
                            eVar.setFontData(cVar);
                            eVar.d();
                            eVar.b();
                            eVar.f74181b.l = eVar;
                        }
                        eVar.setBackground(0);
                        d a2 = d.a();
                        if (PatchProxy.isSupport(new Object[0], a2, d.f74170a, false, 86077, new Class[0], Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, d.f74170a, false, 86077, new Class[0], Boolean.TYPE)).booleanValue();
                        } else {
                            z = "default".equals(a2.f74173c);
                        }
                        if (!z) {
                            String str = d.a().f74173c;
                            if (!TextUtils.isEmpty(str) && str.equals(cVar.h) && eVar.a()) {
                                eVar.setBackground(1);
                            }
                        } else if (i == 0 && cVar != null && eVar.a()) {
                            d.a().f74173c = cVar.h;
                            eVar.setBackground(1);
                        }
                        eVar.setTag(cVar.h);
                        eVar.setOnClickListener(new g(this, eVar));
                        eVar.setDownloadCallback(new a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f74192a;

                            public final void a(boolean z) {
                            }

                            public final void a(c cVar, boolean z, boolean z2) {
                                c cVar2 = cVar;
                                if (PatchProxy.isSupport(new Object[]{cVar2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74192a, false, 86119, new Class[]{c.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{cVar2, Byte.valueOf(z), Byte.valueOf(z2)}, this, f74192a, false, 86119, new Class[]{c.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                                    return;
                                }
                                if (z && cVar2 != null && !TextUtils.isEmpty(cVar2.h) && cVar2.h.equals(f.this.f74188c)) {
                                    f.this.a(cVar);
                                }
                            }
                        });
                    }
                    this.g.add(eVar);
                    this.f74190e.addView(eVar);
                }
            }
        }
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, null);
        if (PatchProxy.isSupport(new Object[0], this, f74186a, false, 86111, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74186a, false, 86111, new Class[0], Void.TYPE);
            return;
        }
        this.f74190e = new LinearLayout(getContext());
        this.f74189d = new d(getContext(), null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f74190e.setPadding((int) UIUtils.dip2Px(getContext(), 12.0f), 0, 0, 0);
        this.f74189d.addView(this.f74190e, layoutParams);
        this.f74189d.setHorizontalScrollBarEnabled(false);
        addView(this.f74189d, new FrameLayout.LayoutParams(-1, -1));
    }
}
