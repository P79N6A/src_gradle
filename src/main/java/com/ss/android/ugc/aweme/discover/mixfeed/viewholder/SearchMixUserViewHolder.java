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
import com.ss.android.ugc.aweme.discover.model.SearchMixUserData;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.ui.SearchMixUserCell;
import com.ss.android.ugc.aweme.discover.ui.ap;
import com.ss.android.ugc.aweme.discover.ui.aw;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.bg;

public class SearchMixUserViewHolder extends AbsSearchViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f42622c;

    /* renamed from: d  reason: collision with root package name */
    SearchMixUserCell f42623d;

    public final View a() {
        if (PatchProxy.isSupport(new Object[0], this, f42622c, false, 36934, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f42622c, false, 36934, new Class[0], View.class);
        } else if (this.f42623d != null) {
            return this.f42623d.b();
        } else {
            return null;
        }
    }

    public static SearchMixUserViewHolder a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, null, f42622c, true, 36935, new Class[]{ViewGroup.class}, SearchMixUserViewHolder.class)) {
            return new SearchMixUserViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a88, viewGroup2, false), viewGroup.getContext());
        }
        return (SearchMixUserViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, null, f42622c, true, 36935, new Class[]{ViewGroup.class}, SearchMixUserViewHolder.class);
    }

    private SearchMixUserViewHolder(View view, Context context) {
        super(view);
        this.f42623d = new SearchMixUserCell(view, context, new ap.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42624a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f42624a, false, 36936, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f42624a, false, 36936, new Class[0], Void.TYPE);
                    return;
                }
                r.onEvent(MobClick.obtain().setEventName("check_more_result").setLabelName("general_search").setJsonObject(c.a().a("search_type", AllStoryActivity.f73306b).b()));
                bg.a(new h(aw.f43136d));
            }
        });
        View findViewById = view.findViewById(C0906R.id.axu);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = (int) UIUtils.dip2Px(context, 16.0f);
        layoutParams.rightMargin = (int) UIUtils.dip2Px(context, 16.0f);
        findViewById.setLayoutParams(layoutParams);
        if (this.f42623d.f3077d != null) {
            this.f42623d.f3077d.setFontType(com.bytedance.ies.dmt.ui.widget.util.c.g);
        }
    }

    public final void a(SearchMixUserData searchMixUserData, SearchResultParam searchResultParam, boolean z) {
        SearchMixUserData searchMixUserData2 = searchMixUserData;
        SearchResultParam searchResultParam2 = searchResultParam;
        if (PatchProxy.isSupport(new Object[]{searchMixUserData2, searchResultParam2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f42622c, false, 36933, new Class[]{SearchMixUserData.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchMixUserData2, searchResultParam2, Byte.valueOf(z)}, this, f42622c, false, 36933, new Class[]{SearchMixUserData.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f42623d != null) {
            this.f42623d.a(searchMixUserData, searchResultParam2, z);
        }
    }
}
