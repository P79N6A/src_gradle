package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.discover.ui.ak;
import com.ss.android.ugc.aweme.hotsearch.RankingListActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import com.ss.android.ugc.aweme.widget.flowlayout.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class HotSearchWordViewHolder extends BaseWordViewHolder<HotSearchItem> {
    public static ChangeQuickRedirect h;
    public static final List<HotSearchItem> i;
    public String j;
    public ak.b k;

    static {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new HotSearchItem());
        i = Collections.unmodifiableList(arrayList);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 35620, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 35620, new Class[0], Void.TYPE);
            return;
        }
        r.a("hot_search_icon", (Map) d.a().a("action_type", "show").f34114b);
        super.a();
    }

    public final boolean b(List<HotSearchItem> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, h, false, 35618, new Class[]{List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list}, this, h, false, 35618, new Class[]{List.class}, Boolean.TYPE)).booleanValue();
        } else if (!list.equals(i)) {
            return false;
        } else {
            v.a(this.f41549c, 0);
            v.a((View) this.f41550d, 8);
            return true;
        }
    }

    public final void c(List<HotSearchItem> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, h, false, 35619, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, h, false, 35619, new Class[]{List.class}, Void.TYPE);
            return;
        }
        v.a((View) this.f41550d, 0);
        v.a(this.f41549c, 8);
        this.g = list;
        this.f41550d.setAdapter(new a<HotSearchItem>(list) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41648a;

            public final /* synthetic */ View a(FlowLayout flowLayout, int i, Object obj) {
                FlowLayout flowLayout2 = flowLayout;
                final HotSearchItem hotSearchItem = (HotSearchItem) obj;
                if (PatchProxy.isSupport(new Object[]{flowLayout2, Integer.valueOf(i), hotSearchItem}, this, f41648a, false, 35629, new Class[]{FlowLayout.class, Integer.TYPE, HotSearchItem.class}, View.class)) {
                    return (View) PatchProxy.accessDispatch(new Object[]{flowLayout2, Integer.valueOf(i), hotSearchItem}, this, f41648a, false, 35629, new Class[]{FlowLayout.class, Integer.TYPE, HotSearchItem.class}, View.class);
                }
                View inflate = LayoutInflater.from(HotSearchWordViewHolder.this.itemView.getContext()).inflate(C0906R.layout.vq, flowLayout, false);
                TextView textView = (TextView) inflate.findViewById(C0906R.id.dcz);
                TextView textView2 = (TextView) inflate.findViewById(C0906R.id.dk_);
                if (hotSearchItem.getType() == 0) {
                    GradientDrawable gradientDrawable = (GradientDrawable) textView2.getBackground();
                    switch (hotSearchItem.getLabel()) {
                        case 0:
                            textView2.setVisibility(8);
                            break;
                        case 1:
                            textView2.setVisibility(0);
                            gradientDrawable.setColor(HotSearchWordViewHolder.this.itemView.getResources().getColor(C0906R.color.a6f));
                            textView2.setText("新");
                            break;
                        case 2:
                            textView2.setVisibility(0);
                            gradientDrawable.setColor(HotSearchWordViewHolder.this.itemView.getResources().getColor(C0906R.color.ry));
                            textView2.setText("荐");
                            break;
                        case 3:
                            textView2.setVisibility(0);
                            gradientDrawable.setColor(HotSearchWordViewHolder.this.itemView.getResources().getColor(C0906R.color.a1z));
                            textView2.setText("热");
                            break;
                        default:
                            textView2.setVisibility(8);
                            break;
                    }
                } else if (hotSearchItem.getType() == 1) {
                    textView2.setVisibility(8);
                    textView.setCompoundDrawablesWithIntrinsicBounds(com.ss.android.ugc.bytex.a.a.a.a(HotSearchWordViewHolder.this.itemView.getResources(), 2130838945), null, null, null);
                }
                textView.setText(hotSearchItem.getWord());
                final int i2 = i;
                inflate.setOnTouchListener(new ai() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f41650a;

                    public final void b(View view, MotionEvent motionEvent) {
                        String str;
                        String str2;
                        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f41650a, false, 35630, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f41650a, false, 35630, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                        } else if (HotSearchWordViewHolder.this.k == null) {
                        } else {
                            if (hotSearchItem.getType() == 0) {
                                HotSearchWordViewHolder hotSearchWordViewHolder = HotSearchWordViewHolder.this;
                                HotSearchItem hotSearchItem = hotSearchItem;
                                int i = i2;
                                if (PatchProxy.isSupport(new Object[]{hotSearchItem, Integer.valueOf(i)}, hotSearchWordViewHolder, HotSearchWordViewHolder.h, false, 35622, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE)) {
                                    HotSearchWordViewHolder hotSearchWordViewHolder2 = hotSearchWordViewHolder;
                                    PatchProxy.accessDispatch(new Object[]{hotSearchItem, Integer.valueOf(i)}, hotSearchWordViewHolder2, HotSearchWordViewHolder.h, false, 35622, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE);
                                } else {
                                    r.a("hot_search_keyword", (Map) d.a().a("action_type", "click").a("key_word", hotSearchItem.getWord()).a("key_word_type", "general_word").a("order", i + 1).a("enter_from", hotSearchWordViewHolder.j).f34114b);
                                    if (TextUtils.equals(hotSearchWordViewHolder.j, "hot_search_section_search")) {
                                        str2 = "hot_search_keyword_click";
                                    } else {
                                        str2 = "hot_search_keyword_click_detail";
                                    }
                                    if (hotSearchItem.isAd()) {
                                        g.a((g.a) new k(hotSearchItem.getAdData()), hotSearchItem.getAdData().getClickTrackUrl(), true);
                                        com.ss.android.ugc.aweme.commercialize.log.d.a().a("result_ad").b(str2).d(hotSearchWordViewHolder.j).g(hotSearchItem.getAdData().getLogExtra()).a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).a(hotSearchWordViewHolder.itemView.getContext());
                                        com.ss.android.ugc.aweme.commercialize.log.d.a().a("result_ad").b("click").g(hotSearchItem.getAdData().getLogExtra()).a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).a(hotSearchWordViewHolder.itemView.getContext());
                                    }
                                }
                                HotSearchWordViewHolder.this.k.a(hotSearchItem, i2, HotSearchWordViewHolder.this.j);
                                return;
                            }
                            if (hotSearchItem.getType() == 1) {
                                HotSearchWordViewHolder hotSearchWordViewHolder3 = HotSearchWordViewHolder.this;
                                HotSearchItem hotSearchItem2 = hotSearchItem;
                                int i2 = i2;
                                if (PatchProxy.isSupport(new Object[]{hotSearchItem2, Integer.valueOf(i2)}, hotSearchWordViewHolder3, HotSearchWordViewHolder.h, false, 35623, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE)) {
                                    HotSearchWordViewHolder hotSearchWordViewHolder4 = hotSearchWordViewHolder3;
                                    PatchProxy.accessDispatch(new Object[]{hotSearchItem2, Integer.valueOf(i2)}, hotSearchWordViewHolder4, HotSearchWordViewHolder.h, false, 35623, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE);
                                } else {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("value", hotSearchItem2.getChallengeId());
                                    } catch (JSONException unused) {
                                    }
                                    r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("hot_search_board").setJsonObject(jSONObject));
                                    int i3 = i2 + 1;
                                    r.a("enter_tag_detail", (Map) d.a().a("tag_id", hotSearchItem2.getChallengeId()).a("order", i3).a("enter_from", hotSearchWordViewHolder3.j).a("log_pb", new Gson().toJson((Object) hotSearchItem2.getLogPb())).f34114b);
                                    r.a("hot_search_keyword", (Map) d.a().a("action_type", "click").a("key_word", hotSearchItem2.getWord()).a("key_word_type", "tag").a("order", i3).a("enter_from", hotSearchWordViewHolder3.j).f34114b);
                                    if (hotSearchItem2.isAd()) {
                                        if (TextUtils.equals(hotSearchWordViewHolder3.j, "hot_search_section_search")) {
                                            str = "hot_search_keyword_click";
                                        } else {
                                            str = "hot_search_keyword_click_detail";
                                        }
                                        g.a((g.a) new l(hotSearchItem2.getAdData()), hotSearchItem2.getAdData().getClickTrackUrl(), true);
                                        com.ss.android.ugc.aweme.commercialize.log.d.a().a("result_ad").b(str).d(hotSearchWordViewHolder3.j).g(hotSearchItem2.getAdData().getLogExtra()).a(Long.valueOf(hotSearchItem2.getAdData().getCreativeId())).a(hotSearchWordViewHolder3.itemView.getContext());
                                        com.ss.android.ugc.aweme.commercialize.log.d.a().a("result_ad").b("click").g(hotSearchItem2.getAdData().getLogExtra()).a(Long.valueOf(hotSearchItem2.getAdData().getCreativeId())).a(hotSearchWordViewHolder3.itemView.getContext());
                                    }
                                }
                                h.a().a("aweme://challenge/detail/" + hotSearchItem.getChallengeId());
                            }
                        }
                    }
                });
                return inflate;
            }
        });
    }

    public final /* synthetic */ void a(Object obj, int i2) {
        String str;
        String str2;
        HotSearchItem hotSearchItem = (HotSearchItem) obj;
        if (PatchProxy.isSupport(new Object[]{hotSearchItem, Integer.valueOf(i2)}, this, h, false, 35621, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSearchItem, Integer.valueOf(i2)}, this, h, false, 35621, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        d a2 = d.a().a("action_type", "show").a("key_word", hotSearchItem.getWord());
        if (hotSearchItem.getType() == 1) {
            str = "tag";
        } else {
            str = "general_word";
        }
        r.a("hot_search_keyword", (Map) a2.a("key_word_type", str).a("order", i2 + 1).a("enter_from", this.j).f34114b);
        if (TextUtils.equals(this.j, "hot_search_section_search")) {
            str2 = "hot_search_keyword_show";
        } else {
            str2 = "hot_search_keyword_show_detail";
        }
        if (hotSearchItem.isAd()) {
            g.a((g.a) new j(this, hotSearchItem), hotSearchItem.getAdData().getTrackUrl(), true);
            com.ss.android.ugc.aweme.commercialize.log.d.a().a("result_ad").b(str2).d(this.j).g(hotSearchItem.getAdData().getLogExtra()).a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).a(this.itemView.getContext());
            com.ss.android.ugc.aweme.commercialize.log.d.a().a("result_ad").b("show").g(hotSearchItem.getAdData().getLogExtra()).a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).a(this.itemView.getContext());
        }
    }

    public static HotSearchWordViewHolder a(ViewGroup viewGroup, String str, ak.b bVar) {
        ViewGroup viewGroup2 = viewGroup;
        String str2 = str;
        ak.b bVar2 = bVar;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, str2, bVar2}, null, h, true, 35615, new Class[]{ViewGroup.class, String.class, ak.b.class}, HotSearchWordViewHolder.class)) {
            return new HotSearchWordViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vp, viewGroup2, false), str2, bVar2);
        }
        return (HotSearchWordViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, str2, bVar2}, null, h, true, 35615, new Class[]{ViewGroup.class, String.class, ak.b.class}, HotSearchWordViewHolder.class);
    }

    private HotSearchWordViewHolder(View view, String str, ak.b bVar) {
        super(view);
        boolean z;
        this.j = str;
        this.k = bVar;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 35616, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 35616, new Class[0], Void.TYPE);
            return;
        }
        this.f41548b.getPaint().setFakeBoldText(true);
        this.f41551e.setOnTouchListener(new ai() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41646a;

            public final void b(View view, MotionEvent motionEvent) {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f41646a, false, 35628, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f41646a, false, 35628, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                    return;
                }
                r.a("hot_search_icon", (Map) d.a().a("action_type", "click").f34114b);
                if (!m.a().c()) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) k.a(), HotSearchWordViewHolder.this.itemView.getResources().getString(C0906R.string.bgf)).a();
                }
                RankingListActivity.a(HotSearchWordViewHolder.this.itemView.getContext());
                v.c(HotSearchWordViewHolder.this.itemView);
                HotSearchWordViewHolder hotSearchWordViewHolder = HotSearchWordViewHolder.this;
                if (PatchProxy.isSupport(new Object[0], hotSearchWordViewHolder, HotSearchWordViewHolder.h, false, 35624, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], hotSearchWordViewHolder, HotSearchWordViewHolder.h, false, 35624, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (((Boolean) SharePrefCache.inst().getIsShowRankingIndicator().c()).booleanValue() && ((Boolean) SharePrefCache.inst().getIsHotSearchAwemeBillboardEnable().c()).booleanValue() && AbTestManager.a().az()) {
                    z = true;
                }
                if (z) {
                    SharePrefCache.inst().getIsShowRankingIndicator().a(Boolean.FALSE);
                }
            }
        });
        if (PatchProxy.isSupport(new Object[0], this, h, false, 35617, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 35617, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (TextUtils.equals(this.j, "hot_search_general_search") || TextUtils.equals(this.j, "hot_search_video_search")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f41548b.setText(C0906R.string.amk);
            this.f41551e.setVisibility(8);
        } else {
            this.f41551e.setVisibility(0);
        }
        if (TextUtils.equals(this.j, "hot_search_section_discovery")) {
            v.a(this.f41552f, 0);
        } else {
            v.a(this.f41552f, 8);
        }
    }
}
