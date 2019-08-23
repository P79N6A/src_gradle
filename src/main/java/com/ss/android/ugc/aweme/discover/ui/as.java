package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.utils.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.SearchMiniAppViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.s;
import com.ss.android.ugc.aweme.discover.model.MicroAppStruct;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.util.Map;

public final class as extends ap<MicroAppStruct> {
    public static ChangeQuickRedirect i;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 37992, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 37992, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.f3079f.setVisibility(8);
    }

    public as(View view, Context context) {
        super(view, context);
    }

    public final void a(MicroAppStruct microAppStruct, SearchResultParam searchResultParam, boolean z) {
        SearchMiniAppViewHolder searchMiniAppViewHolder;
        String str;
        MicroAppStruct microAppStruct2 = microAppStruct;
        if (PatchProxy.isSupport(new Object[]{microAppStruct2, searchResultParam, Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 37993, new Class[]{MicroAppStruct.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{microAppStruct2, searchResultParam, Byte.valueOf(z)}, this, i, false, 37993, new Class[]{MicroAppStruct.class, SearchResultParam.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g.removeAllViews();
        if (microAppStruct2.type == 2) {
            this.f3077d.setText(C0906R.string.bbr);
        } else {
            this.f3077d.setText(C0906R.string.bbl);
        }
        ViewGroup viewGroup = (ViewGroup) this.f3076c;
        if (PatchProxy.isSupport(new Object[]{viewGroup}, null, SearchMiniAppViewHolder.f41822c, true, 35813, new Class[]{ViewGroup.class}, SearchMiniAppViewHolder.class)) {
            searchMiniAppViewHolder = (SearchMiniAppViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, null, SearchMiniAppViewHolder.f41822c, true, 35813, new Class[]{ViewGroup.class}, SearchMiniAppViewHolder.class);
        } else {
            searchMiniAppViewHolder = new SearchMiniAppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a07, viewGroup, false));
        }
        if (PatchProxy.isSupport(new Object[]{microAppStruct2, searchResultParam}, searchMiniAppViewHolder, SearchMiniAppViewHolder.f41822c, false, 35814, new Class[]{MicroAppStruct.class, SearchResultParam.class}, Void.TYPE)) {
            SearchMiniAppViewHolder searchMiniAppViewHolder2 = searchMiniAppViewHolder;
            PatchProxy.accessDispatch(new Object[]{microAppStruct2, searchResultParam}, searchMiniAppViewHolder2, SearchMiniAppViewHolder.f41822c, false, 35814, new Class[]{MicroAppStruct.class, SearchResultParam.class}, Void.TYPE);
        } else {
            searchMiniAppViewHolder.f41823d = microAppStruct2;
            if (!TextUtils.isEmpty(microAppStruct2.icon)) {
                c.a(searchMiniAppViewHolder.mAvatarIV, microAppStruct2.icon);
            }
            if (!TextUtils.isEmpty(microAppStruct2.appName)) {
                String str2 = microAppStruct2.appName;
                String keyword = searchResultParam.getKeyword();
                int indexOf = str2.indexOf(keyword);
                if (indexOf >= 0) {
                    searchMiniAppViewHolder.mTitleTV.setText(a.a(new SpannableString(str2), indexOf, keyword.length() + indexOf, searchMiniAppViewHolder.mTitleTV.getContext().getResources().getColor(C0906R.color.zl)));
                } else {
                    searchMiniAppViewHolder.mTitleTV.setText(str2);
                }
            }
            if (!TextUtils.isEmpty(microAppStruct2.summary)) {
                searchMiniAppViewHolder.mSummaryTV.setText(microAppStruct2.summary);
            }
            if (microAppStruct2.type == 2) {
                searchMiniAppViewHolder.mAvatarSmallIV.setBackgroundResource(2130840286);
            } else {
                searchMiniAppViewHolder.mAvatarSmallIV.setBackgroundResource(2130840287);
            }
        }
        searchMiniAppViewHolder.a(new s(true));
        this.g.addView(searchMiniAppViewHolder.a());
        ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).preloadMiniApp(microAppStruct2.appId, microAppStruct2.type);
        d a2 = d.a().a("enter_from", "general_search").a("mp_id", microAppStruct2.appId);
        if (microAppStruct2.type == 2) {
            str = "micro_game";
        } else {
            str = "micro_app";
        }
        r.a("mp_show", (Map) a2.a("_param_for_special", str).f34114b);
    }
}
