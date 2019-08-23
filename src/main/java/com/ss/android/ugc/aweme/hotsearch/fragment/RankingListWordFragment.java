package com.ss.android.ugc.aweme.hotsearch.fragment;

import a.g;
import a.i;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.discover.helper.b;
import com.ss.android.ugc.aweme.discover.hotspot.HotSpotDetailActivity;
import com.ss.android.ugc.aweme.discover.model.HotSearchAdData;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.b.c;
import com.ss.android.ugc.aweme.hotsearch.b.d;
import com.ss.android.ugc.aweme.hotsearch.view.m;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class RankingListWordFragment extends BaseRankingListFragment implements f<HotSearchItem> {
    public static ChangeQuickRedirect h;
    private final Map<HotSearchAdData, Boolean> i = new WeakHashMap();

    public final DataCenter e() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 49685, new Class[0], DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[0], this, h, false, 49685, new Class[0], DataCenter.class);
        }
        DataCenter e2 = super.e();
        e2.a("hot_search_data", (Observer<a>) new a<a>(this));
        return e2;
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 49683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 49683, new Class[0], Void.TYPE);
            return;
        }
        c cVar = this.f49755d;
        if (PatchProxy.isSupport(new Object[0], cVar, c.f49680a, false, 49723, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cVar, c.f49680a, false, 49723, new Class[0], Void.TYPE);
            return;
        }
        cVar.f49682c.getHotSearchList(1).a((g<TResult, TContinuationResult>) new d<TResult,TContinuationResult>(cVar), i.f1052b);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.hotsearch.view.a b(View view) {
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{view2}, this, h, false, 49684, new Class[]{View.class}, com.ss.android.ugc.aweme.hotsearch.view.a.class)) {
            return new m(view2, getActivity(), this);
        }
        return (com.ss.android.ugc.aweme.hotsearch.view.a) PatchProxy.accessDispatch(new Object[]{view2}, this, h, false, 49684, new Class[]{View.class}, com.ss.android.ugc.aweme.hotsearch.view.a.class);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, h, false, 49682, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, h, false, 49682, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
    }

    public final /* synthetic */ void a(Object obj, int i2) {
        String str;
        HotSearchItem hotSearchItem = (HotSearchItem) obj;
        if (PatchProxy.isSupport(new Object[]{hotSearchItem, Integer.valueOf(i2)}, this, h, false, 49687, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSearchItem, Integer.valueOf(i2)}, this, h, false, 49687, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "show").a("key_word", hotSearchItem.getWord());
        if (hotSearchItem.getType() == 1) {
            str = "tag";
        } else {
            str = "general_word";
        }
        r.a("hot_search_keyword", (Map) a2.a("key_word_type", str).a("order", i2).a("enter_from", "hot_search_board").f34114b);
        if (hotSearchItem.isAd() && !this.i.containsKey(hotSearchItem.getAdData())) {
            this.i.put(hotSearchItem.getAdData(), Boolean.TRUE);
            com.ss.android.ugc.aweme.commercialize.log.g.a((g.a) new c(this, hotSearchItem), hotSearchItem.getAdData().getTrackUrl(), true);
            com.ss.android.ugc.aweme.commercialize.log.d.a().a("result_ad").b("hot_search_keyword_show").d("hot_search_board").g(hotSearchItem.getAdData().getLogExtra()).a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).a(getContext());
            com.ss.android.ugc.aweme.commercialize.log.d.a().a("result_ad").b("show").g(hotSearchItem.getAdData().getLogExtra()).a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).a(getContext());
        }
    }

    public final /* synthetic */ void b(Object obj, int i2) {
        String str;
        HotSearchItem hotSearchItem = (HotSearchItem) obj;
        if (PatchProxy.isSupport(new Object[]{hotSearchItem, Integer.valueOf(i2)}, this, h, false, 49686, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSearchItem, Integer.valueOf(i2)}, this, h, false, 49686, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (hotSearchItem.getType() == 0) {
            SearchResultParam searchResultParam = new SearchResultParam();
            searchResultParam.setKeyword(hotSearchItem.getWord()).setPosition(hotSearchItem.getPosition()).setRealSearchWord(hotSearchItem.getRealSearchWord()).setAd(hotSearchItem.isAd()).setSearchFrom(2).setSource("hot_search_bord").setEnterFrom("hot_search_board");
            FragmentActivity activity = getActivity();
            if (activity != null && !activity.isFinishing()) {
                if (b.e()) {
                    HotSpotDetailActivity.a(activity, searchResultParam);
                } else {
                    SearchResultActivity.a((Context) activity, searchResultParam);
                }
            }
        } else if (hotSearchItem.getType() == 1) {
            try {
                jSONObject.put("value", hotSearchItem.getChallengeId());
            } catch (JSONException unused) {
            }
            r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("hot_search_board").setJsonObject(jSONObject));
            r.a("enter_tag_detail", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("tag_id", hotSearchItem.getChallengeId()).a("order", i2 + 1).a("enter_from", "hot_search_board").a("log_pb", new Gson().toJson((Object) (LogPbBean) ((com.ss.android.ugc.aweme.arch.b) this.f49754c.a("hot_search_data")).a("hot_search_log_pb"))).f34114b);
            h.a().a("aweme://challenge/detail/" + hotSearchItem.getChallengeId());
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "click").a("key_word", hotSearchItem.getWord());
        if (hotSearchItem.getType() == 0) {
            str = "general_word";
        } else {
            str = "tag";
        }
        r.a("hot_search_keyword", (Map) a2.a("key_word_type", str).a("order", i2 + 1).a("enter_from", "hot_search_board").f34114b);
        if (hotSearchItem.isAd()) {
            com.ss.android.ugc.aweme.commercialize.log.g.a((g.a) new b(this, hotSearchItem), hotSearchItem.getAdData().getClickTrackUrl(), true);
            com.ss.android.ugc.aweme.commercialize.log.d.a().a("result_ad").b("hot_search_keyword_click").d("hot_search_board").g(hotSearchItem.getAdData().getLogExtra()).a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).a(getContext());
            com.ss.android.ugc.aweme.commercialize.log.d.a().a("result_ad").b("click").g(hotSearchItem.getAdData().getLogExtra()).a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).a(getContext());
        }
    }
}
