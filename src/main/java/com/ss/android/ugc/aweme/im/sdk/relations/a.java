package com.ss.android.ugc.aweme.im.sdk.relations;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.relations.IndexView;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.IndexerListAdapter;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.List;

public final class a extends c {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f52026e;
    private FloatingBarItemDecoration A;

    /* renamed from: f  reason: collision with root package name */
    public IndexView f52027f;
    public LinearLayoutManager g;
    public float h;
    private View y;
    private TextView z;

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f52026e, false, 52666, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52026e, false, 52666, new Class[0], Void.TYPE);
            return;
        }
        super.e();
        this.p.l = null;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f52026e, false, 52669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52026e, false, 52669, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        if (this.l) {
            this.f52027f.setVisibility(8);
            return;
        }
        this.f52027f.setIndexLetters(((b) this.f22841d).f52111c.i);
        this.f52027f.setVisibility(0);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52026e, false, 52665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52026e, false, 52665, new Class[0], Void.TYPE);
            return;
        }
        this.r = (ImTextTitleBar) this.f22840c.findViewById(C0906R.id.d3m);
        this.o = (DmtStatusView) this.f22840c.findViewById(C0906R.id.cvd);
        this.q = (RecyclerView) this.f22840c.findViewById(C0906R.id.cc4);
        this.g = new LinearLayoutManager(c());
        this.q.setLayoutManager(this.g);
        this.q.addOnScrollListener(new NewRelationView$1(this, this.f22839b));
        this.q.addOnItemTouchListener(new NewRelationView$2(this));
        this.y = this.f22840c.findViewById(C0906R.id.clg);
        this.m = (EditText) this.y.findViewById(C0906R.id.cla);
        this.m.setTag("relation_search_tag");
        this.n = (ImageView) this.y.findViewById(C0906R.id.ns);
        this.f52027f = (IndexView) this.f22840c.findViewById(C0906R.id.au5);
        this.z = (TextView) this.f22840c.findViewById(C0906R.id.au3);
        this.f52027f.setOnLetterTouchListener(new IndexView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52028a;

            public final void a(String str, int i) {
                if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f52028a, false, 52674, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f52028a, false, 52674, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                a.this.g.scrollToPositionWithOffset(((IndexerListAdapter) a.this.p).getPositionForSection(i) + a.this.p.c(), 0);
            }
        });
        this.f52027f.setIndexLetterTv(this.z);
    }

    public final void a(List<IMContact> list) {
        com.ss.android.ugc.aweme.im.sdk.relations.adapter.a aVar;
        List<IMContact> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f52026e, false, 52667, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f52026e, false, 52667, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.l = false;
        List<String> list3 = ((b) this.f22841d).f52111c.i;
        List<Integer> list4 = ((b) this.f22841d).f52111c.j;
        if (!list3.isEmpty() && !list4.isEmpty()) {
            if (PatchProxy.isSupport(new Object[]{list3, list4}, this, f52026e, false, 52670, new Class[]{List.class, List.class}, com.ss.android.ugc.aweme.im.sdk.relations.adapter.a.class)) {
                aVar = (com.ss.android.ugc.aweme.im.sdk.relations.adapter.a) PatchProxy.accessDispatch(new Object[]{list3, list4}, this, f52026e, false, 52670, new Class[]{List.class, List.class}, com.ss.android.ugc.aweme.im.sdk.relations.adapter.a.class);
            } else {
                int[] iArr = new int[list4.size()];
                for (int i = 0; i < list4.size(); i++) {
                    iArr[i] = list4.get(i).intValue();
                }
                String[] strArr = new String[list3.size()];
                list3.toArray(strArr);
                aVar = new com.ss.android.ugc.aweme.im.sdk.relations.adapter.a(strArr, iArr);
            }
            IndexerListAdapter indexerListAdapter = (IndexerListAdapter) this.p;
            if (PatchProxy.isSupport(new Object[]{aVar}, indexerListAdapter, IndexerListAdapter.f52070a, false, 52845, new Class[]{SectionIndexer.class}, Void.TYPE)) {
                IndexerListAdapter indexerListAdapter2 = indexerListAdapter;
                PatchProxy.accessDispatch(new Object[]{aVar}, indexerListAdapter2, IndexerListAdapter.f52070a, false, 52845, new Class[]{SectionIndexer.class}, Void.TYPE);
            } else {
                indexerListAdapter.o = aVar;
                indexerListAdapter.p.f52071a = -1;
            }
            this.p.a(list2);
            if (this.A != null) {
                this.q.removeItemDecoration(this.A);
            }
            this.A = new FloatingBarItemDecoration(this.f22839b, list3, list4);
            this.q.addItemDecoration(this.A);
            f();
        }
    }

    public final void a(List<IMContact> list, CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{list, charSequence}, this, f52026e, false, 52668, new Class[]{List.class, CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, charSequence}, this, f52026e, false, 52668, new Class[]{List.class, CharSequence.class}, Void.TYPE);
            return;
        }
        this.l = true;
        if (this.A != null) {
            this.q.removeItemDecoration(this.A);
        }
        this.p.a(list, charSequence);
        f();
    }

    public a(Context context, View view, boolean z2) {
        super(context, view, z2);
        this.h = UIUtils.dip2Px(context, 32.0f);
    }
}
