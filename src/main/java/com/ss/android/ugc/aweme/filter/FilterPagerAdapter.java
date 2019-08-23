package com.ss.android.ugc.aweme.filter;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.widget.TextView;
import com.bytedance.ies.uikit.viewpager.AbsPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import java.util.ArrayList;
import java.util.List;

public class FilterPagerAdapter extends AbsPagerAdapter implements Observer<List<h>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47421a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f47422b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f47423c;

    /* renamed from: d  reason: collision with root package name */
    private List<com.ss.android.ugc.aweme.filter.model.a> f47424d;

    /* renamed from: e  reason: collision with root package name */
    private h f47425e;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        CircleImageView f47428a;

        /* renamed from: b  reason: collision with root package name */
        TextView f47429b;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public int getCount() {
        if (PatchProxy.isSupport(new Object[0], this, f47421a, false, 44317, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47421a, false, 44317, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f47424d == null) {
            return 0;
        } else {
            return this.f47424d.size();
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        List<h> list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list}, this, f47421a, false, 44320, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f47421a, false, 44320, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.f47425e == null) {
            this.f47425e = (h) list.get(0);
        }
        if (this.f47424d == null) {
            this.f47424d = new ArrayList();
        } else {
            this.f47424d.clear();
        }
        for (h hVar : list) {
            this.f47424d.add(new com.ss.android.ugc.aweme.filter.model.a(hVar.g, hVar.f47599c));
        }
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.ss.android.ugc.aweme.filter.FilterPagerAdapter$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r14, android.view.View r15, android.view.ViewGroup r16) {
        /*
            r13 = this;
            r7 = r13
            r8 = r14
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r10 = 0
            r0[r10] = r1
            r11 = 1
            r0[r11] = r15
            r12 = 2
            r0[r12] = r16
            com.meituan.robust.ChangeQuickRedirect r2 = f47421a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r12] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r3 = 0
            r4 = 44318(0xad1e, float:6.2103E-41)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0059
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r10] = r1
            r0[r11] = r15
            r0[r12] = r16
            com.meituan.robust.ChangeQuickRedirect r2 = f47421a
            r3 = 0
            r4 = 44318(0xad1e, float:6.2103E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r12] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r1 = r13
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.view.View r0 = (android.view.View) r0
            return r0
        L_0x0059:
            if (r15 != 0) goto L_0x0096
            boolean r0 = r7.f47422b
            if (r0 == 0) goto L_0x0063
            r0 = 2131689958(0x7f0f01e6, float:1.9008946E38)
            goto L_0x0066
        L_0x0063:
            r0 = 2131689957(0x7f0f01e5, float:1.9008944E38)
        L_0x0066:
            android.view.LayoutInflater r1 = r7.mInflater
            r2 = 0
            android.view.View r0 = r1.inflate(r0, r2, r10)
            com.ss.android.ugc.aweme.filter.FilterPagerAdapter$a r1 = new com.ss.android.ugc.aweme.filter.FilterPagerAdapter$a
            r1.<init>(r10)
            r2 = 2131166722(0x7f070602, float:1.7947697E38)
            android.view.View r2 = r0.findViewById(r2)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r2 = (com.ss.android.ugc.aweme.base.ui.CircleImageView) r2
            r1.f47428a = r2
            r2 = 2131166727(0x7f070607, float:1.7947708E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f47429b = r2
            com.ss.android.ugc.aweme.base.ui.CircleImageView r2 = r1.f47428a
            com.ss.android.ugc.aweme.filter.FilterPagerAdapter$1 r3 = new com.ss.android.ugc.aweme.filter.FilterPagerAdapter$1
            r3.<init>()
            r2.setOnClickListener(r3)
            r0.setTag(r1)
            goto L_0x009e
        L_0x0096:
            java.lang.Object r0 = r15.getTag()
            r1 = r0
            com.ss.android.ugc.aweme.filter.FilterPagerAdapter$a r1 = (com.ss.android.ugc.aweme.filter.FilterPagerAdapter.a) r1
            r0 = r15
        L_0x009e:
            if (r8 != 0) goto L_0x00c0
            com.ss.android.ugc.aweme.base.ui.CircleImageView r2 = r1.f47428a
            r3 = 2130839262(0x7f0206de, float:1.728353E38)
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r2, (int) r3)
            boolean r2 = com.ss.android.g.a.b()
            if (r2 == 0) goto L_0x00b7
            android.widget.TextView r2 = r1.f47429b
            r3 = 2131560003(0x7f0d0643, float:1.8745366E38)
            r2.setText(r3)
            goto L_0x00e2
        L_0x00b7:
            android.widget.TextView r2 = r1.f47429b
            r3 = 2131560004(0x7f0d0644, float:1.8745368E38)
            r2.setText(r3)
            goto L_0x00e2
        L_0x00c0:
            com.ss.android.ugc.aweme.base.ui.CircleImageView r2 = r1.f47428a
            java.util.List<com.ss.android.ugc.aweme.filter.model.a> r3 = r7.f47424d
            java.lang.Object r3 = r3.get(r14)
            com.ss.android.ugc.aweme.filter.model.a r3 = (com.ss.android.ugc.aweme.filter.model.a) r3
            android.net.Uri r3 = r3.f47638a
            java.lang.String r3 = r3.toString()
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r2, (java.lang.String) r3)
            android.widget.TextView r2 = r1.f47429b
            java.util.List<com.ss.android.ugc.aweme.filter.model.a> r3 = r7.f47424d
            java.lang.Object r3 = r3.get(r14)
            com.ss.android.ugc.aweme.filter.model.a r3 = (com.ss.android.ugc.aweme.filter.model.a) r3
            java.lang.String r3 = r3.f47639b
            r2.setText(r3)
        L_0x00e2:
            boolean r2 = com.ss.android.g.a.b()
            if (r2 != 0) goto L_0x00ec
            boolean r2 = r7.f47423c
            if (r2 != 0) goto L_0x00f3
        L_0x00ec:
            android.widget.TextView r1 = r1.f47429b
            r2 = 8
            r1.setVisibility(r2)
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.filter.FilterPagerAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
