package com.ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.a.h;
import com.ss.android.ugc.aweme.discover.adapter.AbsSearchViewHolder;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.ui.ap;
import com.ss.android.ugc.aweme.discover.ui.aq;
import com.ss.android.ugc.aweme.discover.ui.aw;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.List;

public class SearchMixChallengeViewHolder extends AbsSearchViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f42589c;

    /* renamed from: d  reason: collision with root package name */
    aq f42590d;

    public final View a() {
        if (PatchProxy.isSupport(new Object[0], this, f42589c, false, 36895, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f42589c, false, 36895, new Class[0], View.class);
        } else if (this.f42590d != null) {
            return this.f42590d.b();
        } else {
            return null;
        }
    }

    public static SearchMixChallengeViewHolder a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, null, f42589c, true, 36896, new Class[]{ViewGroup.class}, SearchMixChallengeViewHolder.class)) {
            return new SearchMixChallengeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a85, viewGroup2, false), viewGroup.getContext());
        }
        return (SearchMixChallengeViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, null, f42589c, true, 36896, new Class[]{ViewGroup.class}, SearchMixChallengeViewHolder.class);
    }

    private SearchMixChallengeViewHolder(View view, Context context) {
        super(view);
        this.f42590d = new aq(view, context, new ap.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42591a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f42591a, false, 36897, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f42591a, false, 36897, new Class[0], Void.TYPE);
                    return;
                }
                r.onEvent(MobClick.obtain().setEventName("check_more_result").setLabelName("general_search").setJsonObject(c.a().a("search_type", "challenge").b()));
                bg.a(new h(aw.g));
            }
        });
        View findViewById = view.findViewById(C0906R.id.axu);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = (int) UIUtils.dip2Px(context, 16.0f);
        layoutParams.rightMargin = (int) UIUtils.dip2Px(context, 16.0f);
        findViewById.setLayoutParams(layoutParams);
        if (this.f42590d.f3077d != null) {
            this.f42590d.f3077d.setFontType(com.bytedance.ies.dmt.ui.widget.util.c.g);
        }
    }

    public final void a(List<SearchChallenge> list, SearchResultParam searchResultParam, boolean z) {
        List<SearchChallenge> list2 = list;
        SearchResultParam searchResultParam2 = searchResultParam;
        if (PatchProxy.isSupport(new Object[]{list2, searchResultParam2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f42589c, false, 36894, new Class[]{List.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, searchResultParam2, Byte.valueOf(z)}, this, f42589c, false, 36894, new Class[]{List.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f42590d != null) {
            this.f42590d.a(list, searchResultParam2, z);
        }
    }
}
