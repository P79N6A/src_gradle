package com.ss.android.ugc.aweme.discover.mixfeed.ui;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commercialize.model.n;
import com.ss.android.ugc.aweme.commercialize.model.p;
import com.ss.android.ugc.aweme.commercialize.views.SearchAdView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.discover.adapter.RelatedWordViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.SearchCommodityViewHolder;
import com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.mixfeed.a;
import com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixChallengeViewHolder;
import com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixCommodityViewHolder;
import com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixHotSearchViewHolder;
import com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMiniAppViewHolder;
import com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMovieViewHolder;
import com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMusicViewHolder;
import com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixPoiViewHolder;
import com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixUserViewHolder;
import com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixVideoViewHolder;
import com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixXiGuaVideoViewHolder;
import com.ss.android.ugc.aweme.discover.mob.e;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.model.SearchXiGuaVideo;
import com.ss.android.ugc.aweme.discover.model.XiGuaVideo;
import com.ss.android.ugc.aweme.discover.ui.ar;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.newfollow.adapter.FeedAdapter;
import com.ss.android.ugc.aweme.newfollow.e.b;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FollowVideoViewHolder;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class SearchMixFeedAdapter extends FeedAdapter<a> {
    private static final a C = new a();

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f42566f;
    private boolean A;
    private a B;
    private p D;
    private a E;
    public SearchResultParam g;
    public n h;
    private MusicPlayHelper z;

    private Activity l() {
        if (PatchProxy.isSupport(new Object[0], this, f42566f, false, 36819, new Class[0], Activity.class)) {
            return (Activity) PatchProxy.accessDispatch(new Object[0], this, f42566f, false, 36819, new Class[0], Activity.class);
        }
        Activity[] activityStack = ActivityStack.getActivityStack();
        for (int length = activityStack.length - 1; length >= 0; length--) {
            Activity activity = activityStack[length];
            if (activity instanceof SearchResultActivity) {
                return activity;
            }
        }
        return null;
    }

    public final void A_() {
        if (PatchProxy.isSupport(new Object[0], this, f42566f, false, 36816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42566f, false, 36816, new Class[0], Void.TYPE);
            return;
        }
        this.z.a();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f42566f, false, 36815, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42566f, false, 36815, new Class[0], Void.TYPE);
            return;
        }
        A_();
        super.d();
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f42566f, false, 36811, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f42566f, false, 36811, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mItems == null || this.mItems.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f42566f, false, 36814, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f42566f, false, 36814, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        A_();
        super.a(aweme);
    }

    public final BaseFollowViewHolder a(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f42566f, false, 36808, new Class[]{ViewGroup.class}, BaseFollowViewHolder.class)) {
            return (BaseFollowViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f42566f, false, 36808, new Class[]{ViewGroup.class}, BaseFollowViewHolder.class);
        }
        SearchMixVideoViewHolder searchMixVideoViewHolder = new SearchMixVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup, false), this.r, this.j, this.o, this.q);
        searchMixVideoViewHolder.V = this;
        return searchMixVideoViewHolder;
    }

    public void setData(List<a> list) {
        List<a> list2;
        if (PatchProxy.isSupport(new Object[]{list}, this, f42566f, false, 36810, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f42566f, false, 36810, new Class[]{List.class}, Void.TYPE);
            return;
        }
        super.setData(list);
        A_();
        if (list == null) {
            list2 = new ArrayList<>();
            setShowFooter(false);
        } else {
            list2 = list;
        }
        this.mItems = list2;
        notifyDataSetChanged();
    }

    public int getBasicItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42566f, false, 36809, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42566f, false, 36809, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.A && this.mItems.get(i) == C) {
            return 256;
        } else {
            int basicItemViewType = super.getBasicItemViewType(i);
            if (basicItemViewType != -1) {
                return basicItemViewType;
            }
            b bVar = (b) this.mItems.get(i);
            if (bVar.getFeedType() == 65456) {
                return SearchJediMixFeedAdapter.f42517f;
            }
            if (bVar.getFeedType() == 65466) {
                return 224;
            }
            if (bVar.getFeedType() == 65457) {
                return SearchJediMixFeedAdapter.f42516e;
            }
            if (bVar.getFeedType() == 65458) {
                return 96;
            }
            if (bVar.getFeedType() == 65459) {
                return SearchJediMixFeedAdapter.g;
            }
            if (bVar.getFeedType() == 65460) {
                return 160;
            }
            if (bVar.getFeedType() == 65461) {
                return 176;
            }
            if (bVar.getFeedType() == 65462) {
                return 80;
            }
            if (bVar.getFeedType() == 65463) {
                return 192;
            }
            if (bVar.getFeedType() == 65464) {
                return 208;
            }
            return -1;
        }
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        String str;
        String str2;
        String str3;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f42566f, false, 36812, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f42566f, false, 36812, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder2 instanceof FollowVideoViewHolder) {
            Aweme aweme = ((FollowVideoViewHolder) viewHolder2).j;
            if (PatchProxy.isSupport(new Object[]{aweme}, this, f42566f, false, 36820, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme}, this, f42566f, false, 36820, new Class[]{Aweme.class}, Void.TYPE);
            } else {
                if (aweme != null) {
                    r.a("search_result_show_video", (Map) d.a().a("enter_from", "general_search").a("log_pb", ai.a().a(aweme.getRequestId())).a("group_id", aa.m(aweme)).f34114b);
                }
            }
        } else if (viewHolder2 instanceof SearchMixCommodityViewHolder) {
            SearchMixCommodityViewHolder searchMixCommodityViewHolder = (SearchMixCommodityViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[0], searchMixCommodityViewHolder, SearchMixCommodityViewHolder.f42593c, false, 36900, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], searchMixCommodityViewHolder, SearchMixCommodityViewHolder.f42593c, false, 36900, new Class[0], Void.TYPE);
            } else {
                ar arVar = searchMixCommodityViewHolder.f42594d;
                if (PatchProxy.isSupport(new Object[0], arVar, ar.i, false, 37991, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], arVar, ar.i, false, 37991, new Class[0], Void.TYPE);
                } else {
                    for (SearchCommodityViewHolder c2 : arVar.j) {
                        c2.c();
                    }
                }
            }
        } else if (viewHolder2 instanceof SearchMixXiGuaVideoViewHolder) {
            SearchMixXiGuaVideoViewHolder searchMixXiGuaVideoViewHolder = (SearchMixXiGuaVideoViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[0], searchMixXiGuaVideoViewHolder, SearchMixXiGuaVideoViewHolder.f42632c, false, 36943, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], searchMixXiGuaVideoViewHolder, SearchMixXiGuaVideoViewHolder.f42632c, false, 36943, new Class[0], Void.TYPE);
                return;
            }
            d a2 = d.a().a("enter_from", "general_search").a("rank", searchMixXiGuaVideoViewHolder.getAdapterPosition()).a("token_type", "xigua_mp");
            LogPbBean logPbBean = null;
            if (PatchProxy.isSupport(new Object[0], searchMixXiGuaVideoViewHolder, SearchMixXiGuaVideoViewHolder.f42632c, false, 36944, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], searchMixXiGuaVideoViewHolder, SearchMixXiGuaVideoViewHolder.f42632c, false, 36944, new Class[0], String.class);
            } else {
                List arrayList = new ArrayList();
                a aVar = searchMixXiGuaVideoViewHolder.f42634e;
                if (aVar != null) {
                    List<SearchXiGuaVideo> list = aVar.o;
                    if (list != null) {
                        for (SearchXiGuaVideo video : list) {
                            XiGuaVideo video2 = video.getVideo();
                            if (video2 != null) {
                                str3 = video2.getVideoId();
                            } else {
                                str3 = null;
                            }
                            arrayList.add(str3);
                        }
                    }
                }
                str = arrayList.toString();
            }
            d a3 = a2.a("aladdin_id_list", str).a("search_id", e.a().a(3));
            SearchResultParam searchResultParam = searchMixXiGuaVideoViewHolder.f42633d;
            if (searchResultParam != null) {
                str2 = searchResultParam.getKeyword();
            } else {
                str2 = null;
            }
            d a4 = a3.a("query", str2);
            a aVar2 = searchMixXiGuaVideoViewHolder.f42634e;
            if (aVar2 != null) {
                logPbBean = aVar2.s;
            }
            r.a("search_result_show", (Map) a4.a("log_pb", logPbBean).f34114b);
        }
    }

    public final void a(Aweme aweme, String str) {
        if (PatchProxy.isSupport(new Object[]{aweme, str}, this, f42566f, false, 36817, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str}, this, f42566f, false, 36817, new Class[]{Aweme.class, String.class}, Void.TYPE);
        } else if (aweme != null && TextUtils.equals(str, this.u)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.s.getLayoutManager();
            if (linearLayoutManager != null) {
                for (a aVar : this.mItems) {
                    Aweme aweme2 = aVar.getAweme();
                    if (aVar.getFeedType() == 65280 && aweme2 != null && TextUtils.equals(aweme2.getAid(), aweme.getAid())) {
                        linearLayoutManager.scrollToPositionWithOffset(this.mItems.indexOf(aVar), 0);
                        return;
                    }
                }
            }
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        Object accessDispatch;
        Object accessDispatch2;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f42566f, false, 36807, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f42566f, false, 36807, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        switch (i) {
            case 80:
                if (!PatchProxy.isSupport(new Object[]{viewGroup2}, null, SearchMixHotSearchViewHolder.f42597c, true, 36904, new Class[]{ViewGroup.class}, SearchMixHotSearchViewHolder.class)) {
                    return new SearchMixHotSearchViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aro, viewGroup2, false), viewGroup.getContext());
                }
                return (SearchMixHotSearchViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, null, SearchMixHotSearchViewHolder.f42597c, true, 36904, new Class[]{ViewGroup.class}, SearchMixHotSearchViewHolder.class);
            case SearchJediMixFeedAdapter.f42515d:
                return SearchMixUserViewHolder.a(viewGroup);
            case SearchJediMixFeedAdapter.f42516e:
                return SearchMixMusicViewHolder.a(viewGroup);
            case SearchJediMixFeedAdapter.f42517f:
                return SearchMixChallengeViewHolder.a(viewGroup);
            case SearchJediMixFeedAdapter.g:
                RelatedWordViewHolder.a aVar = RelatedWordViewHolder.k;
                if (PatchProxy.isSupport(new Object[]{viewGroup2}, aVar, RelatedWordViewHolder.a.f41769a, false, 35766, new Class[]{ViewGroup.class}, RelatedWordViewHolder.class)) {
                    return (RelatedWordViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, aVar, RelatedWordViewHolder.a.f41769a, false, 35766, new Class[]{ViewGroup.class}, RelatedWordViewHolder.class);
                }
                Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vp, viewGroup2, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
                return new RelatedWordViewHolder(inflate);
            case 160:
                if (!PatchProxy.isSupport(new Object[]{viewGroup2}, null, SearchMixPoiViewHolder.f42620c, true, 36932, new Class[]{ViewGroup.class}, SearchMixPoiViewHolder.class)) {
                    return new SearchMixPoiViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a85, viewGroup2, false), viewGroup.getContext());
                }
                return (SearchMixPoiViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, null, SearchMixPoiViewHolder.f42620c, true, 36932, new Class[]{ViewGroup.class}, SearchMixPoiViewHolder.class);
            case 176:
                if (!PatchProxy.isSupport(new Object[]{viewGroup2}, null, SearchMixMiniAppViewHolder.f42600c, true, 36908, new Class[]{ViewGroup.class}, SearchMixMiniAppViewHolder.class)) {
                    return new SearchMixMiniAppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a85, viewGroup2, false), viewGroup.getContext());
                }
                return (SearchMixMiniAppViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, null, SearchMixMiniAppViewHolder.f42600c, true, 36908, new Class[]{ViewGroup.class}, SearchMixMiniAppViewHolder.class);
            case 192:
                if (!PatchProxy.isSupport(new Object[]{viewGroup2}, null, SearchMixCommodityViewHolder.f42593c, true, 36898, new Class[]{ViewGroup.class}, SearchMixCommodityViewHolder.class)) {
                    return new SearchMixCommodityViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a85, viewGroup2, false));
                }
                return (SearchMixCommodityViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, null, SearchMixCommodityViewHolder.f42593c, true, 36898, new Class[]{ViewGroup.class}, SearchMixCommodityViewHolder.class);
            case 208:
                if (PatchProxy.isSupport(new Object[]{viewGroup2}, null, SearchMixXiGuaVideoViewHolder.f42632c, true, 36945, new Class[]{ViewGroup.class}, SearchMixXiGuaVideoViewHolder.class)) {
                    accessDispatch = PatchProxy.accessDispatch(new Object[]{viewGroup2}, null, SearchMixXiGuaVideoViewHolder.f42632c, true, 36945, new Class[]{ViewGroup.class}, SearchMixXiGuaVideoViewHolder.class);
                } else {
                    SearchMixXiGuaVideoViewHolder.a aVar2 = SearchMixXiGuaVideoViewHolder.g;
                    if (PatchProxy.isSupport(new Object[]{viewGroup2}, aVar2, SearchMixXiGuaVideoViewHolder.a.f42636a, false, 36948, new Class[]{ViewGroup.class}, SearchMixXiGuaVideoViewHolder.class)) {
                        SearchMixXiGuaVideoViewHolder.a aVar3 = aVar2;
                        accessDispatch = PatchProxy.accessDispatch(new Object[]{viewGroup2}, aVar3, SearchMixXiGuaVideoViewHolder.a.f42636a, false, 36948, new Class[]{ViewGroup.class}, SearchMixXiGuaVideoViewHolder.class);
                    } else {
                        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
                        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a85, viewGroup2, false);
                        Intrinsics.checkExpressionValueIsNotNull(inflate2, "view");
                        return new SearchMixXiGuaVideoViewHolder(inflate2);
                    }
                }
                return (SearchMixXiGuaVideoViewHolder) accessDispatch;
            case 224:
                if (PatchProxy.isSupport(new Object[]{viewGroup2}, null, SearchMixMovieViewHolder.f42602c, true, 36921, new Class[]{ViewGroup.class}, SearchMixMovieViewHolder.class)) {
                    accessDispatch2 = PatchProxy.accessDispatch(new Object[]{viewGroup2}, null, SearchMixMovieViewHolder.f42602c, true, 36921, new Class[]{ViewGroup.class}, SearchMixMovieViewHolder.class);
                } else {
                    SearchMixMovieViewHolder.a aVar4 = SearchMixMovieViewHolder.m;
                    if (PatchProxy.isSupport(new Object[]{viewGroup2}, aVar4, SearchMixMovieViewHolder.a.f42606a, false, 36922, new Class[]{ViewGroup.class}, SearchMixMovieViewHolder.class)) {
                        SearchMixMovieViewHolder.a aVar5 = aVar4;
                        accessDispatch2 = PatchProxy.accessDispatch(new Object[]{viewGroup2}, aVar5, SearchMixMovieViewHolder.a.f42606a, false, 36922, new Class[]{ViewGroup.class}, SearchMixMovieViewHolder.class);
                    } else {
                        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
                        View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a09, viewGroup2, false);
                        Intrinsics.checkExpressionValueIsNotNull(inflate3, "view");
                        Context context = viewGroup.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
                        return new SearchMixMovieViewHolder(inflate3, context);
                    }
                }
                return (SearchMixMovieViewHolder) accessDispatch2;
            case 256:
                return new SearchAdView.ViewHolder(viewGroup2);
            default:
                return super.onCreateBasicViewHolder(viewGroup, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01c2, code lost:
        if (r0.intValue() != 2) goto L_0x01d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x025f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindBasicViewHolder(android.support.v7.widget.RecyclerView.ViewHolder r21, int r22) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r12 = 1
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f42566f
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r1 = android.support.v7.widget.RecyclerView.ViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 36806(0x8fc6, float:5.1576E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f42566f
            r3 = 0
            r4 = 36806(0x8fc6, float:5.1576E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r1 = android.support.v7.widget.RecyclerView.ViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004f:
            java.util.List r0 = r7.mItems
            java.lang.Object r0 = r0.get(r9)
            com.ss.android.ugc.aweme.discover.mixfeed.a r0 = (com.ss.android.ugc.aweme.discover.mixfeed.a) r0
            int r1 = r7.getBasicItemViewType(r9)
            r2 = 16
            if (r1 != r2) goto L_0x0080
            com.ss.android.ugc.aweme.discover.mixfeed.a r2 = r7.B
            if (r0 != r2) goto L_0x006c
            r2 = r8
            com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder r2 = (com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder) r2
            com.ss.android.ugc.aweme.commercialize.model.n r3 = r7.h
            r2.a((com.ss.android.ugc.aweme.commercialize.log.aa.a) r3)
            goto L_0x0080
        L_0x006c:
            com.ss.android.ugc.aweme.discover.mixfeed.a r2 = r7.E
            if (r0 != r2) goto L_0x0079
            r2 = r8
            com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder r2 = (com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder) r2
            com.ss.android.ugc.aweme.commercialize.model.p r3 = r7.D
            r2.a((com.ss.android.ugc.aweme.commercialize.log.aa.a) r3)
            goto L_0x0080
        L_0x0079:
            r2 = r8
            com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder r2 = (com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder) r2
            r3 = 0
            r2.a((com.ss.android.ugc.aweme.commercialize.log.aa.a) r3)
        L_0x0080:
            boolean r2 = r8 instanceof com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixVideoViewHolder
            if (r2 == 0) goto L_0x008b
            r2 = r8
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixVideoViewHolder r2 = (com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixVideoViewHolder) r2
            com.ss.android.ugc.aweme.discover.model.SearchResultParam r3 = r7.g
            r2.f42627b = r3
        L_0x008b:
            r2 = 3
            switch(r1) {
                case 80: goto L_0x052e;
                case 96: goto L_0x050d;
                case 112: goto L_0x0500;
                case 128: goto L_0x04f3;
                case 144: goto L_0x0497;
                case 160: goto L_0x042f;
                case 176: goto L_0x03c7;
                case 192: goto L_0x032b;
                case 208: goto L_0x02bb;
                case 224: goto L_0x00d6;
                case 256: goto L_0x0093;
                default: goto L_0x008f;
            }
        L_0x008f:
            super.onBindBasicViewHolder(r21, r22)
            return
        L_0x0093:
            r1 = r8
            com.ss.android.ugc.aweme.commercialize.views.SearchAdView$ViewHolder r1 = (com.ss.android.ugc.aweme.commercialize.views.SearchAdView.ViewHolder) r1
            com.ss.android.ugc.aweme.commercialize.model.n r0 = r0.q
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commercialize.views.SearchAdView.ViewHolder.f39998a
            r16 = 0
            r17 = 32994(0x80e2, float:4.6234E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.model.n> r3 = com.ss.android.ugc.aweme.commercialize.model.n.class
            r2[r11] = r3
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x00ce
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commercialize.views.SearchAdView.ViewHolder.f39998a
            r16 = 0
            r17 = 32994(0x80e2, float:4.6234E-41)
            java.lang.Class[] r0 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.model.n> r2 = com.ss.android.ugc.aweme.commercialize.model.n.class
            r0[r11] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x00ce:
            android.view.View r1 = r1.itemView
            com.ss.android.ugc.aweme.commercialize.views.SearchAdView r1 = (com.ss.android.ugc.aweme.commercialize.views.SearchAdView) r1
            r1.setup(r0)
            return
        L_0x00d6:
            r9 = r8
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMovieViewHolder r9 = (com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMovieViewHolder) r9
            com.ss.android.ugc.aweme.discover.model.SearchMovie r1 = r0.m
            com.ss.android.ugc.aweme.discover.model.Movie r1 = r1.getMovie()
            com.ss.android.ugc.aweme.discover.model.SearchResultParam r3 = r7.g
            boolean r0 = r0.p
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r11] = r1
            r13[r12] = r3
            java.lang.Byte r4 = java.lang.Byte.valueOf(r0)
            r13[r10] = r4
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMovieViewHolder.f42602c
            r16 = 0
            r17 = 36918(0x9036, float:5.1733E-41)
            java.lang.Class[] r4 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.Movie> r5 = com.ss.android.ugc.aweme.discover.model.Movie.class
            r4[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchResultParam> r5 = com.ss.android.ugc.aweme.discover.model.SearchResultParam.class
            r4[r12] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r4[r10] = r5
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r9
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x0138
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r11] = r1
            r8[r12] = r3
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r8[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r0 = com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMovieViewHolder.f42602c
            r1 = 0
            r3 = 36918(0x9036, float:5.1733E-41)
            java.lang.Class[] r13 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.Movie> r2 = com.ss.android.ugc.aweme.discover.model.Movie.class
            r13[r11] = r2
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchResultParam> r2 = com.ss.android.ugc.aweme.discover.model.SearchResultParam.class
            r13[r12] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r13[r10] = r2
            java.lang.Class r14 = java.lang.Void.TYPE
            r10 = r0
            r11 = r1
            r12 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0138:
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
            java.lang.String r0 = "param"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r9.i
            java.lang.String r2 = r1.getImg()
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (java.lang.String) r2)
            android.widget.TextView r0 = r9.f42603d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "#"
            r2.<init>(r3)
            java.lang.String r3 = r1.getTitle()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            android.widget.TextView r0 = r9.f42604e
            java.lang.String r2 = r1.getActor()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            android.widget.TextView r0 = r9.f42605f
            java.lang.String r2 = r1.getType()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            android.widget.TextView r0 = r9.g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r1.getUptime()
            r2.append(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            android.content.Context r3 = r9.l
            r4 = 2131561288(0x7f0d0b48, float:1.8747972E38)
            java.lang.String r3 = r3.getString(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            java.lang.String r0 = r1.getLight_app_tickets_url()
            r2 = 8
            if (r0 == 0) goto L_0x01d6
            java.lang.Integer r0 = r1.getStat()
            if (r0 != 0) goto L_0x01b1
            goto L_0x01b7
        L_0x01b1:
            int r0 = r0.intValue()
            if (r0 == r12) goto L_0x01c4
        L_0x01b7:
            java.lang.Integer r0 = r1.getStat()
            if (r0 != 0) goto L_0x01be
            goto L_0x01d6
        L_0x01be:
            int r0 = r0.intValue()
            if (r0 != r10) goto L_0x01d6
        L_0x01c4:
            android.widget.Button r0 = r9.j
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMovieViewHolder$b r3 = new com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMovieViewHolder$b
            r3.<init>(r9, r1)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r0.setOnClickListener(r3)
            android.widget.Button r0 = r9.j
            r0.setVisibility(r11)
            goto L_0x01db
        L_0x01d6:
            android.widget.Button r0 = r9.j
            r0.setVisibility(r2)
        L_0x01db:
            java.lang.Integer r0 = r1.getStat()
            if (r0 != 0) goto L_0x01e2
            goto L_0x01fe
        L_0x01e2:
            int r0 = r0.intValue()
            if (r0 != r12) goto L_0x01fe
            android.widget.TextView r0 = r9.k
            android.content.Context r2 = r9.l
            r3 = 2131561289(0x7f0d0b49, float:1.8747974E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            android.widget.TextView r0 = r9.k
            r0.setVisibility(r11)
            goto L_0x0226
        L_0x01fe:
            java.lang.Integer r0 = r1.getStat()
            if (r0 != 0) goto L_0x0205
            goto L_0x0211
        L_0x0205:
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0211
            android.widget.TextView r0 = r9.k
            r0.setVisibility(r2)
            goto L_0x0226
        L_0x0211:
            android.widget.TextView r0 = r9.k
            android.content.Context r2 = r9.l
            r3 = 2131561290(0x7f0d0b4a, float:1.8747976E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            android.widget.TextView r0 = r9.k
            r0.setVisibility(r11)
        L_0x0226:
            java.lang.String r0 = r1.getMaoyan_score()
            boolean r0 = com.bytedance.g.c.c.a(r0)
            r2 = 2131170293(0x7f0713f5, float:1.795494E38)
            if (r0 != 0) goto L_0x025f
            android.widget.TextView r0 = r9.h
            java.lang.String r3 = r1.getMaoyan_score()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
            android.view.View r0 = r9.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r2 = "itemView.textView10"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.content.Context r2 = r9.l
            r3 = 2131561158(0x7f0d0ac6, float:1.8747709E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            goto L_0x02a2
        L_0x025f:
            java.lang.Integer r0 = r1.getWish()
            if (r0 == 0) goto L_0x02a2
            android.widget.TextView r0 = r9.h
            java.lang.Integer r3 = r1.getWish()
            if (r3 != 0) goto L_0x0270
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0270:
            int r3 = r3.intValue()
            long r3 = (long) r3
            java.lang.String r3 = com.ss.android.ugc.aweme.i18n.b.a(r3)
            java.lang.String r3 = r3.toString()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
            android.view.View r0 = r9.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r2 = "itemView.textView10"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.content.Context r2 = r9.l
            r3 = 2131561159(0x7f0d0ac7, float:1.874771E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
        L_0x02a2:
            android.view.View r0 = r9.itemView
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMovieViewHolder$c r2 = new com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMovieViewHolder$c
            r2.<init>(r9, r1)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r9.f42603d
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMovieViewHolder$d r2 = new com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMovieViewHolder$d
            r2.<init>(r9, r1)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            return
        L_0x02bb:
            r9 = r8
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixXiGuaVideoViewHolder r9 = (com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixXiGuaVideoViewHolder) r9
            com.ss.android.ugc.aweme.discover.model.SearchResultParam r1 = r7.g
            boolean r3 = r0.p
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r11] = r0
            r13[r12] = r1
            java.lang.Byte r4 = java.lang.Byte.valueOf(r3)
            r13[r10] = r4
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixXiGuaVideoViewHolder.f42632c
            r16 = 0
            r17 = 36941(0x904d, float:5.1765E-41)
            java.lang.Class[] r4 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.discover.mixfeed.a> r5 = com.ss.android.ugc.aweme.discover.mixfeed.a.class
            r4[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchResultParam> r5 = com.ss.android.ugc.aweme.discover.model.SearchResultParam.class
            r4[r12] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r4[r10] = r5
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r9
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x0317
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r11] = r0
            r8[r12] = r1
            java.lang.Byte r0 = java.lang.Byte.valueOf(r3)
            r8[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r0 = com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixXiGuaVideoViewHolder.f42632c
            r1 = 0
            r3 = 36941(0x904d, float:5.1765E-41)
            java.lang.Class[] r13 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.discover.mixfeed.a> r2 = com.ss.android.ugc.aweme.discover.mixfeed.a.class
            r13[r11] = r2
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchResultParam> r2 = com.ss.android.ugc.aweme.discover.model.SearchResultParam.class
            r13[r12] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r13[r10] = r2
            java.lang.Class r14 = java.lang.Void.TYPE
            r10 = r0
            r11 = r1
            r12 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0317:
            java.lang.String r2 = "mixFeed"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            java.lang.String r2 = "param"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            r9.f42634e = r0
            r9.f42633d = r1
            com.ss.android.ugc.aweme.discover.ui.av r2 = r9.f42635f
            r2.a((com.ss.android.ugc.aweme.discover.mixfeed.a) r0, (com.ss.android.ugc.aweme.discover.model.SearchResultParam) r1, (boolean) r3)
            return
        L_0x032b:
            r9 = r8
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixCommodityViewHolder r9 = (com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixCommodityViewHolder) r9
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.discover.mixfeed.a.f42540a
            r16 = 0
            r17 = 36777(0x8fa9, float:5.1536E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchMixCommodityData> r19 = com.ss.android.ugc.aweme.discover.model.SearchMixCommodityData.class
            r14 = r0
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L_0x035b
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.discover.mixfeed.a.f42540a
            r16 = 0
            r17 = 36777(0x8fa9, float:5.1536E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchMixCommodityData> r19 = com.ss.android.ugc.aweme.discover.model.SearchMixCommodityData.class
            r14 = r0
            r18 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            com.ss.android.ugc.aweme.discover.model.SearchMixCommodityData r1 = (com.ss.android.ugc.aweme.discover.model.SearchMixCommodityData) r1
            goto L_0x0364
        L_0x035b:
            com.ss.android.ugc.aweme.discover.model.SearchMixCommodityData r1 = new com.ss.android.ugc.aweme.discover.model.SearchMixCommodityData
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchCommodity> r3 = r0.l
            boolean r4 = r0.n
            r1.<init>(r3, r4)
        L_0x0364:
            com.ss.android.ugc.aweme.discover.model.SearchResultParam r3 = r7.g
            boolean r0 = r0.p
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r11] = r1
            r13[r12] = r3
            java.lang.Byte r4 = java.lang.Byte.valueOf(r0)
            r13[r10] = r4
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixCommodityViewHolder.f42593c
            r16 = 0
            r17 = 36899(0x9023, float:5.1707E-41)
            java.lang.Class[] r4 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchMixCommodityData> r5 = com.ss.android.ugc.aweme.discover.model.SearchMixCommodityData.class
            r4[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchResultParam> r5 = com.ss.android.ugc.aweme.discover.model.SearchResultParam.class
            r4[r12] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r4[r10] = r5
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r9
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x03bd
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r11] = r1
            r8[r12] = r3
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r8[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r0 = com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixCommodityViewHolder.f42593c
            r1 = 0
            r3 = 36899(0x9023, float:5.1707E-41)
            java.lang.Class[] r13 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchMixCommodityData> r2 = com.ss.android.ugc.aweme.discover.model.SearchMixCommodityData.class
            r13[r11] = r2
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchResultParam> r2 = com.ss.android.ugc.aweme.discover.model.SearchResultParam.class
            r13[r12] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r13[r10] = r2
            java.lang.Class r14 = java.lang.Void.TYPE
            r10 = r0
            r11 = r1
            r12 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x03bd:
            com.ss.android.ugc.aweme.discover.ui.ar r2 = r9.f42594d
            if (r2 == 0) goto L_0x03c6
            com.ss.android.ugc.aweme.discover.ui.ar r2 = r9.f42594d
            r2.a((com.ss.android.ugc.aweme.discover.model.SearchMixCommodityData) r1, (com.ss.android.ugc.aweme.discover.model.SearchResultParam) r3, (boolean) r0)
        L_0x03c6:
            return
        L_0x03c7:
            r9 = r8
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMiniAppViewHolder r9 = (com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMiniAppViewHolder) r9
            com.ss.android.ugc.aweme.discover.model.MicroAppStruct r1 = r0.k
            com.ss.android.ugc.aweme.discover.model.SearchResultParam r3 = r7.g
            boolean r0 = r0.p
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r11] = r1
            r13[r12] = r3
            java.lang.Byte r4 = java.lang.Byte.valueOf(r0)
            r13[r10] = r4
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMiniAppViewHolder.f42600c
            r16 = 0
            r17 = 36906(0x902a, float:5.1716E-41)
            java.lang.Class[] r4 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.MicroAppStruct> r5 = com.ss.android.ugc.aweme.discover.model.MicroAppStruct.class
            r4[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchResultParam> r5 = com.ss.android.ugc.aweme.discover.model.SearchResultParam.class
            r4[r12] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r4[r10] = r5
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r9
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x0425
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r11] = r1
            r8[r12] = r3
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r8[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r0 = com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMiniAppViewHolder.f42600c
            r1 = 0
            r3 = 36906(0x902a, float:5.1716E-41)
            java.lang.Class[] r13 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.MicroAppStruct> r2 = com.ss.android.ugc.aweme.discover.model.MicroAppStruct.class
            r13[r11] = r2
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchResultParam> r2 = com.ss.android.ugc.aweme.discover.model.SearchResultParam.class
            r13[r12] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r13[r10] = r2
            java.lang.Class r14 = java.lang.Void.TYPE
            r10 = r0
            r11 = r1
            r12 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0425:
            com.ss.android.ugc.aweme.discover.ui.as r2 = r9.f42601d
            if (r2 == 0) goto L_0x042e
            com.ss.android.ugc.aweme.discover.ui.as r2 = r9.f42601d
            r2.a((com.ss.android.ugc.aweme.discover.model.MicroAppStruct) r1, (com.ss.android.ugc.aweme.discover.model.SearchResultParam) r3, (boolean) r0)
        L_0x042e:
            return
        L_0x042f:
            r9 = r8
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixPoiViewHolder r9 = (com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixPoiViewHolder) r9
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchPoi> r1 = r0.j
            com.ss.android.ugc.aweme.discover.model.SearchResultParam r3 = r7.g
            boolean r0 = r0.p
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r11] = r1
            r13[r12] = r3
            java.lang.Byte r4 = java.lang.Byte.valueOf(r0)
            r13[r10] = r4
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixPoiViewHolder.f42620c
            r16 = 0
            r17 = 36930(0x9042, float:5.175E-41)
            java.lang.Class[] r4 = new java.lang.Class[r2]
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r4[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchResultParam> r5 = com.ss.android.ugc.aweme.discover.model.SearchResultParam.class
            r4[r12] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r4[r10] = r5
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r9
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x048d
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r11] = r1
            r8[r12] = r3
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r8[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r0 = com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixPoiViewHolder.f42620c
            r1 = 0
            r3 = 36930(0x9042, float:5.175E-41)
            java.lang.Class[] r13 = new java.lang.Class[r2]
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r13[r11] = r2
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchResultParam> r2 = com.ss.android.ugc.aweme.discover.model.SearchResultParam.class
            r13[r12] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r13[r10] = r2
            java.lang.Class r14 = java.lang.Void.TYPE
            r10 = r0
            r11 = r1
            r12 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x048d:
            com.ss.android.ugc.aweme.discover.ui.au r2 = r9.f42621d
            if (r2 == 0) goto L_0x0496
            com.ss.android.ugc.aweme.discover.ui.au r2 = r9.f42621d
            r2.a((java.util.List<com.ss.android.ugc.aweme.discover.model.SearchPoi>) r1, (com.ss.android.ugc.aweme.discover.model.SearchResultParam) r3, (boolean) r0)
        L_0x0496:
            return
        L_0x0497:
            r9 = r8
            com.ss.android.ugc.aweme.discover.adapter.RelatedWordViewHolder r9 = (com.ss.android.ugc.aweme.discover.adapter.RelatedWordViewHolder) r9
            com.ss.android.ugc.aweme.discover.model.SearchResultParam r1 = r7.g
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r13[r11] = r0
            r13[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.discover.adapter.RelatedWordViewHolder.h
            r16 = 0
            r17 = 35762(0x8bb2, float:5.0113E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.discover.mixfeed.a> r3 = com.ss.android.ugc.aweme.discover.mixfeed.a.class
            r2[r11] = r3
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchResultParam> r3 = com.ss.android.ugc.aweme.discover.model.SearchResultParam.class
            r2[r12] = r3
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r9
            r18 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x04dd
            java.lang.Object[] r8 = new java.lang.Object[r10]
            r8[r11] = r0
            r8[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r0 = com.ss.android.ugc.aweme.discover.adapter.RelatedWordViewHolder.h
            r1 = 0
            r2 = 35762(0x8bb2, float:5.0113E-41)
            java.lang.Class[] r13 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.discover.mixfeed.a> r3 = com.ss.android.ugc.aweme.discover.mixfeed.a.class
            r13[r11] = r3
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchResultParam> r3 = com.ss.android.ugc.aweme.discover.model.SearchResultParam.class
            r13[r12] = r3
            java.lang.Class r14 = java.lang.Void.TYPE
            r10 = r0
            r11 = r1
            r12 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x04dd:
            java.lang.String r2 = "mixFeed"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            java.lang.String r2 = "param"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob r2 = r0.r
            r9.i = r2
            r9.j = r1
            java.util.List<com.ss.android.ugc.aweme.discover.model.RelatedSearchWordItem> r0 = r0.i
            r9.a(r0)
            return
        L_0x04f3:
            r1 = r8
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixChallengeViewHolder r1 = (com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixChallengeViewHolder) r1
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchChallenge> r2 = r0.f42545f
            com.ss.android.ugc.aweme.discover.model.SearchResultParam r3 = r7.g
            boolean r0 = r0.p
            r1.a(r2, r3, r0)
            return
        L_0x0500:
            r1 = r8
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMusicViewHolder r1 = (com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMusicViewHolder) r1
            java.util.List<com.ss.android.ugc.aweme.music.model.Music> r2 = r0.f42544e
            com.ss.android.ugc.aweme.discover.model.SearchResultParam r3 = r7.g
            boolean r0 = r0.p
            r1.a(r2, r3, r0)
            return
        L_0x050d:
            com.ss.android.ugc.aweme.discover.model.SearchMixUserData r1 = new com.ss.android.ugc.aweme.discover.model.SearchMixUserData
            r1.<init>()
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchUser> r2 = r0.f42543d
            com.ss.android.ugc.aweme.discover.model.SearchMixUserData r1 = r1.setUsers(r2)
            boolean r2 = r0.g
            com.ss.android.ugc.aweme.discover.model.SearchMixUserData r1 = r1.setHasTopUser(r2)
            com.ss.android.ugc.aweme.commercialize.model.n r2 = r0.q
            r1.setAd(r2)
            r2 = r8
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixUserViewHolder r2 = (com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixUserViewHolder) r2
            com.ss.android.ugc.aweme.discover.model.SearchResultParam r3 = r7.g
            boolean r0 = r0.p
            r2.a(r1, r3, r0)
            return
        L_0x052e:
            r9 = r8
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixHotSearchViewHolder r9 = (com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixHotSearchViewHolder) r9
            com.ss.android.ugc.aweme.discover.model.SearchResultParam r0 = r7.g
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixHotSearchViewHolder.f42597c
            r16 = 0
            r17 = 36902(0x9026, float:5.1711E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchResultParam> r2 = com.ss.android.ugc.aweme.discover.model.SearchResultParam.class
            r1[r11] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r9
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L_0x0567
            java.lang.Object[] r8 = new java.lang.Object[r12]
            r8[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r10 = com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixHotSearchViewHolder.f42597c
            r0 = 0
            r1 = 36902(0x9026, float:5.1711E-41)
            java.lang.Class[] r13 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchResultParam> r2 = com.ss.android.ugc.aweme.discover.model.SearchResultParam.class
            r13[r11] = r2
            java.lang.Class r14 = java.lang.Void.TYPE
            r11 = r0
            r12 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0567:
            java.lang.String r1 = r0.getKeyword()
            int r1 = com.ss.android.ugc.aweme.hotsearch.d.a.a((java.lang.String) r1)
            if (r1 <= 0) goto L_0x0595
            r9.a(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r9.f42599e
            android.content.Context r3 = r9.f42598d
            r4 = 2131564604(0x7f0d183c, float:1.8754698E38)
            java.lang.Object[] r5 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r11] = r1
            java.lang.String r1 = r3.getString(r4, r5)
            r2.setText(r1)
            android.view.View r1 = r9.itemView
            com.ss.android.ugc.aweme.discover.mixfeed.viewholder.a r2 = new com.ss.android.ugc.aweme.discover.mixfeed.viewholder.a
            r2.<init>(r9, r0)
            r1.setOnClickListener(r2)
            return
        L_0x0595:
            r9.a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.mixfeed.ui.SearchMixFeedAdapter.onBindBasicViewHolder(android.support.v7.widget.RecyclerView$ViewHolder, int):void");
    }

    public SearchMixFeedAdapter(RecyclerView recyclerView, com.ss.android.ugc.aweme.feed.d dVar, SearchResultParam searchResultParam) {
        super(recyclerView, dVar);
        this.g = searchResultParam;
        FragmentActivity fragmentActivity = (FragmentActivity) v.c((View) recyclerView);
        this.z = (MusicPlayHelper) ViewModelProviders.of(fragmentActivity).get(MusicPlayHelper.class);
        this.z.a(fragmentActivity, new b(this));
    }

    public final void a(Aweme aweme, boolean z2, String str, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{aweme, Byte.valueOf(z2 ? (byte) 1 : 0), str, new Long(j2)}, this, f42566f, false, 36818, new Class[]{Aweme.class, Boolean.TYPE, String.class, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {aweme, Byte.valueOf(z2), str, new Long(j2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f42566f, false, 36818, new Class[]{Aweme.class, Boolean.TYPE, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        if (v.c((View) this.s) == l()) {
            super.a(aweme, z2, str, j);
        }
    }
}
