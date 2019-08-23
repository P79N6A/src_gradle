package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.a.h;
import com.ss.android.ugc.aweme.discover.adapter.SearchPoiViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.s;
import com.ss.android.ugc.aweme.discover.model.SearchPoi;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.ui.ap;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.List;

public class au extends ap<List<SearchPoi>> {
    public static ChangeQuickRedirect i;
    private String j;
    private String k;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 37999, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 37999, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.f3077d.setText(C0906R.string.c2k);
        this.f3078e.setText(C0906R.string.ec);
    }

    public au(View view, Context context) {
        super(view, context);
        this.h = new ap.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f43131a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f43131a, false, 38001, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f43131a, false, 38001, new Class[0], Void.TYPE);
                    return;
                }
                r.onEvent(MobClick.obtain().setEventName("check_more_result").setLabelName("general_search").setJsonObject(c.a().a("search_type", "poi").b()));
                bg.a(new h(aw.f43137e));
            }
        };
    }

    public final void a(List<SearchPoi> list, SearchResultParam searchResultParam, boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{list, searchResultParam, Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 38000, new Class[]{List.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, searchResultParam, Byte.valueOf(z)}, this, i, false, 38000, new Class[]{List.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(list, searchResultParam, z);
        this.g.removeAllViews();
        this.j = searchResultParam.getKeyword();
        this.k = searchResultParam.getEnterFrom();
        for (SearchPoi next : list) {
            if (i2 < 3) {
                SearchPoiViewHolder a2 = SearchPoiViewHolder.a((ViewGroup) this.f3076c, searchResultParam.getKeyword(), af.a(this.f3075b).f(), true);
                a2.a(next, searchResultParam.getKeyword());
                a2.a(new s(true));
                this.g.addView(a2.a());
                i2++;
            } else {
                return;
            }
        }
    }
}
