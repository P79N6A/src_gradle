package com.ss.android.ugc.aweme.poi.ui.accelerate;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import butterknife.BindView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.agilelogger.f.e;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.newfollow.e.b;
import com.ss.android.ugc.aweme.poi.a.j;
import com.ss.android.ugc.aweme.poi.a.l;
import com.ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter;
import com.ss.android.ugc.aweme.poi.adapter.a;
import com.ss.android.ugc.aweme.poi.b;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import com.ss.android.ugc.aweme.poi.model.aa;
import com.ss.android.ugc.aweme.poi.model.an;
import com.ss.android.ugc.aweme.poi.model.o;
import com.ss.android.ugc.aweme.poi.model.s;
import com.ss.android.ugc.aweme.poi.ui.AbsPoiAwemeFeedFragment;
import com.ss.android.ugc.aweme.poi.ui.PoiContentActivity;
import com.ss.android.ugc.aweme.poi.ui.comment.PoiCommentListActivity;
import com.ss.android.ugc.aweme.poi.ui.h;
import com.ss.android.ugc.aweme.poi.ui.i;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class AcceleratedPoiAwemeFeedViewHolder extends i implements WeakHandler.IHandler, a, f, i, m {
    public static ChangeQuickRedirect s;
    private List<b> A;
    private l B;
    private s C;
    private boolean D;
    private boolean E;
    private boolean F = true;
    private PoiDetail G;
    @BindView(2131497333)
    protected View mLoadingStatusViewBg;
    boolean t;
    boolean u;
    boolean v;
    protected WeakHandler w;
    private e x;
    private k y;
    private h z;

    public final a f() {
        return this;
    }

    public final void a(AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment, View view, h hVar, com.ss.android.ugc.aweme.newfollow.b.a aVar) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{absPoiAwemeFeedFragment, view, hVar, aVar}, this, s, false, 66198, new Class[]{AbsPoiAwemeFeedFragment.class, View.class, h.class, com.ss.android.ugc.aweme.newfollow.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{absPoiAwemeFeedFragment, view, hVar, aVar}, this, s, false, 66198, new Class[]{AbsPoiAwemeFeedFragment.class, View.class, h.class, com.ss.android.ugc.aweme.newfollow.b.a.class}, Void.TYPE);
            return;
        }
        super.a(absPoiAwemeFeedFragment, view, hVar, aVar);
        if (PatchProxy.isSupport(new Object[0], this, s, false, 66200, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 66200, new Class[0], Void.TYPE);
        } else if (this.y == null) {
            this.y = new k();
            this.y.a(this);
            this.y.a(new j(this.q.l()));
        }
        if (PatchProxy.isSupport(new Object[0], this, s, false, 66201, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 66201, new Class[0], Void.TYPE);
        } else if (!c.a() && this.z == null) {
            this.z = new h();
            this.z.a(this);
            this.z.a(new g());
        }
        this.t = false;
        this.u = false;
        if (this.t || this.u) {
            z2 = true;
        }
        this.v = z2;
        this.w = new WeakHandler(this);
    }

    public final void a(List<b> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, s, false, 66202, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, s, false, 66202, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.f60805f = true;
            this.F = z2;
            if (!q()) {
                if (this.A == null) {
                    this.A = new ArrayList();
                }
                if (list != null) {
                    this.A.addAll(list);
                }
                return;
            }
            this.w.removeMessages(65282);
            if (this.j != null) {
                List data = ((PoiAwemeFeedAdapter) this.j).getData();
                a(data, list);
                ((a) this.f60804e).a(data);
                ((PoiAwemeFeedAdapter) this.j).setData(((a) this.f60804e).i().getItems());
                if (this.w != null) {
                    this.w.post(new b(this, z2));
                    return;
                }
                c(z2);
            }
        }
    }

    public final void a(boolean z2, String str, String str2, boolean z3) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), str3, str4, Byte.valueOf(z3 ? (byte) 1 : 0)}, this, s, false, 66206, new Class[]{Boolean.TYPE, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), str3, str4, Byte.valueOf(z3)}, this, s, false, 66206, new Class[]{Boolean.TYPE, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.w != null) {
            this.mLoadingStatusViewBg.setVisibility(0);
            this.w.sendEmptyMessageDelayed(65281, 500);
        } else {
            this.mLoadingStatusView.d();
        }
        if (this.f60804e != null) {
            this.f60804e.a(1, new b.a().a(this.f60803d.getPoiId()).d(this.f60803d.getAwemeId()).b(3).a());
        }
        if (this.y != null) {
            this.y.a(new b.a().a(this.f60803d.getPoiId()).b(str3).c(str4).a(z2 ? 1 : 0).d(this.f60803d.getAwemeId()).a());
        }
        if (z3) {
            if (PatchProxy.isSupport(new Object[0], this, s, false, 66199, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, s, false, 66199, new Class[0], Void.TYPE);
            } else if (this.x == null) {
                this.x = new e();
                this.x.a(this);
                this.x.a(new d());
            }
        }
        if (this.x != null) {
            e eVar = this.x;
            Object[] objArr = new Object[1];
            objArr[0] = new b.a().a(this.f60803d.getPoiId()).a(this.q != null ? this.q.g() : false).e(this.q != null ? this.q.j() : "").a();
            eVar.a(objArr);
        }
        if (this.z != null) {
            String d2 = TextUtils.isEmpty(com.ss.android.ugc.aweme.feed.c.a()) ? com.ss.android.ugc.aweme.feed.c.d() : com.ss.android.ugc.aweme.feed.c.a();
            long j = 0;
            try {
                if (!TextUtils.isEmpty(d2)) {
                    j = Long.parseLong(d2);
                }
            } catch (Exception unused) {
            }
            this.z.a(new b.a().a(this.f60803d.getPoiId()).a(j).a());
            return;
        }
        this.E = true;
    }

    public final void a(l lVar) {
        if (PatchProxy.isSupport(new Object[]{lVar}, this, s, false, 66209, new Class[]{l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lVar}, this, s, false, 66209, new Class[]{l.class}, Void.TYPE);
        } else if (lVar == null || CollectionUtils.isEmpty(lVar.f60539a) || !(lVar.f60539a.get(0) instanceof PoiDetail)) {
            if (this.w != null) {
                this.w.removeMessages(65281);
            }
            this.mLoadingStatusView.f();
        } else {
            this.B = lVar;
            this.D = true;
            r();
        }
    }

    public final void a(String str, String str2, boolean z2, int i) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, str2, Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i)}, this, s, false, 66218, new Class[]{String.class, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str2, Byte.valueOf(z2), Integer.valueOf(i)}, this, s, false, 66218, new Class[]{String.class, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.poi.a.a aVar = new com.ss.android.ugc.aweme.poi.a.a(2, 0);
        if (z2) {
            com.ss.android.ugc.aweme.poi.e.h.a(this.f60803d, "click_poi_page_more_video", d.a().a("enter_from", "poi_page").a("poi_id", this.f60803d.getPoiId()).a("enter_method", "click_video_more").a("poi_channel", this.f60803d.getPoiChannel()));
            Context context = getContext();
            String poiId = this.f60803d.getPoiId();
            if (PatchProxy.isSupport(new Object[]{context, poiId, null, aVar, str3}, null, PoiContentActivity.f60437a, true, 66030, new Class[]{Context.class, String.class, String.class, com.ss.android.ugc.aweme.poi.a.a.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, poiId, null, aVar, str3}, null, PoiContentActivity.f60437a, true, 66030, new Class[]{Context.class, String.class, String.class, com.ss.android.ugc.aweme.poi.a.a.class, String.class}, Void.TYPE);
            } else {
                Intent intent = new Intent(context, PoiContentActivity.class);
                intent.putExtra("id", poiId);
                intent.putExtra("name", null);
                intent.putExtra("aweme_id", str3);
                intent.putExtra("EXTRA_POI_AWEME_POSITION", aVar);
                context.startActivity(intent);
            }
        } else {
            com.ss.android.ugc.aweme.poi.e.h.a(this.f60803d, "outer_section_more", d.a().a("enter_from", "poi_page").a("previous_page", this.f60803d.getPreviousPage()).a("poi_id", this.f60803d.getPoiId()).a("poi_channel", this.f60803d.getPoiChannel()));
            Context context2 = getContext();
            com.ss.android.ugc.aweme.poi.c cVar = this.f60803d;
            if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), cVar}, null, PoiCommentListActivity.f60567a, true, 66262, new Class[]{Context.class, Integer.TYPE, com.ss.android.ugc.aweme.poi.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), cVar}, null, PoiCommentListActivity.f60567a, true, 66262, new Class[]{Context.class, Integer.TYPE, com.ss.android.ugc.aweme.poi.c.class}, Void.TYPE);
                return;
            }
            Intent intent2 = new Intent(context2, PoiCommentListActivity.class);
            intent2.putExtra("EXTRA_POI_BUNDLE", cVar);
            intent2.putExtra("EXTRA_COMMENT_POSITION", i);
            context2.startActivity(intent2);
        }
    }

    private boolean q() {
        if (!this.E || !this.D) {
            return false;
        }
        return true;
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 66208, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 66208, new Class[0], Void.TYPE);
            return;
        }
        ((a) this.f60804e).a((an) null);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 66210, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 66210, new Class[0], Void.TYPE);
            return;
        }
        if (this.w != null) {
            this.w.removeMessages(65281);
        }
        this.mLoadingStatusView.f();
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 66212, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 66212, new Class[0], Void.TYPE);
            return;
        }
        this.E = true;
        r();
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 66205, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 66205, new Class[0], Void.TYPE);
        } else if (isViewValid() && this.f60804e != null && this.f60804e.i() != null) {
            if (((aa) this.f60804e.i()).isDataEmpty()) {
                if (((a) this.f60804e).t) {
                    this.f60804e.a(1, new b.a().a(this.f60803d.getPoiId()).d(this.f60803d.getAwemeId()).b(3).a());
                }
            } else if (((aa) this.f60804e.i()).isHasMore()) {
                this.f60804e.a(4, new b.a().a(this.f60803d.getPoiId()).d(this.f60803d.getAwemeId()).b(3).a());
            }
        }
    }

    private void r() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 66213, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 66213, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && q()) {
            if (this.w != null) {
                this.mLoadingStatusViewBg.setVisibility(8);
                this.w.removeMessages(65281);
                this.w.sendEmptyMessageDelayed(65282, 300);
            }
            List<com.ss.android.ugc.aweme.newfollow.e.b> list = this.B.f60539a;
            this.G = (PoiDetail) list.get(0);
            this.q.a(this.G);
            this.q.v();
            a(this.G);
            if (this.C != null && this.C.a() > 0) {
                this.G.setActs(new com.ss.android.ugc.aweme.poi.a.b(this.C.f59943b).setPoiId(this.G.getPoiId()));
            }
            List<o> list2 = this.G.get3rdCommentList();
            if (!CollectionUtils.isEmpty(list2)) {
                list2.size();
                list.add(new com.ss.android.ugc.aweme.poi.a.d(false, true));
                o oVar = list2.get(0);
                oVar.setCommentId(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                oVar.setHasDivider(true);
                list.add(oVar);
            }
            this.mLoadingStatusView.b();
            if (this.j != null) {
                if (this.A != null) {
                    a(list, this.A);
                    this.A.clear();
                }
                ((a) this.f60804e).a(list);
                ((PoiAwemeFeedAdapter) this.j).setData(((a) this.f60804e).u());
            }
            if (this.w == null || this.A != null) {
                c(this.F);
                if (((a) this.f60804e).t) {
                    ((PoiAwemeFeedAdapter) this.j).showLoadMoreError();
                }
            }
        }
    }

    public final void a(an anVar) {
        an anVar2 = anVar;
        if (PatchProxy.isSupport(new Object[]{anVar2}, this, s, false, 66207, new Class[]{an.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{anVar2}, this, s, false, 66207, new Class[]{an.class}, Void.TYPE);
            return;
        }
        ((a) this.f60804e).a(anVar2);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, s, false, 66204, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, s, false, 66204, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            switch (i) {
                case 1:
                    if (this.j != null) {
                        ((PoiAwemeFeedAdapter) this.j).showLoadMoreError();
                        return;
                    }
                    break;
                case 2:
                    if (this.j != null && this.f60805f) {
                        ((PoiAwemeFeedAdapter) this.j).showLoadMoreLoading();
                        return;
                    }
                case 3:
                    if (this.j != null) {
                        ((PoiAwemeFeedAdapter) this.j).showLoadMoreEmpty();
                        break;
                    }
                    break;
            }
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, s, false, 66219, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, s, false, 66219, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        switch (message.what) {
            case 65281:
                this.mLoadingStatusView.d();
                this.mLoadingStatusViewBg.setVisibility(8);
                return;
            case 65282:
                if (!this.f60805f) {
                    if (PatchProxy.isSupport(new Object[0], this, s, false, 66214, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, s, false, 66214, new Class[0], Void.TYPE);
                        return;
                    }
                    c(this.F);
                    if (((a) this.f60804e).t) {
                        ((PoiAwemeFeedAdapter) this.j).showLoadMoreError();
                        return;
                    }
                    if (this.F) {
                        ((PoiAwemeFeedAdapter) this.j).showLoadMoreLoading();
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void a(@Nullable s sVar) {
        if (PatchProxy.isSupport(new Object[]{sVar}, this, s, false, 66211, new Class[]{s.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sVar}, this, s, false, 66211, new Class[]{s.class}, Void.TYPE);
            return;
        }
        this.E = true;
        this.C = sVar;
        r();
    }

    public final void b(List<com.ss.android.ugc.aweme.newfollow.e.b> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, s, false, 66203, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, s, false, 66203, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (this.j != null) {
                ((PoiAwemeFeedAdapter) this.j).setDataAfterLoadMore(list);
            }
            if (this.w != null) {
                this.w.post(new c(this, z2));
            } else {
                c(z2);
            }
        }
    }

    private l a(PoiDetail poiDetail, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{poiDetail, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, s, false, 66217, new Class[]{PoiDetail.class, Boolean.TYPE}, l.class)) {
            return (l) PatchProxy.accessDispatch(new Object[]{poiDetail, Byte.valueOf(z2)}, this, s, false, 66217, new Class[]{PoiDetail.class, Boolean.TYPE}, l.class);
        } else if (poiDetail.getPoiActivityInfo() == null || poiDetail.getPoiActivityInfo().getAdCard() == null) {
            return null;
        } else {
            com.ss.android.ugc.aweme.poi.model.a adCard = poiDetail.getPoiActivityInfo().getAdCard();
            if (CollectionUtils.isEmpty(adCard.getRawDatas())) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            List<AwemeRawAd> awemeRawAds = poiDetail.getAwemeRawAds();
            if (e.a(awemeRawAds)) {
                return null;
            }
            for (AwemeRawAd next : awemeRawAds) {
                if (next.isNewStyleAd()) {
                    arrayList.add(next);
                }
            }
            if (CollectionUtils.isEmpty(arrayList)) {
                return null;
            }
            l lVar = new l(arrayList, adCard.getTitle(), z2);
            lVar.f59411b = arrayList;
            return lVar;
        }
    }

    private void a(List<com.ss.android.ugc.aweme.newfollow.e.b> list, List<com.ss.android.ugc.aweme.newfollow.e.b> list2) {
        boolean z2;
        List<com.ss.android.ugc.aweme.newfollow.e.b> list3 = list;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{list3, list2}, this, s, false, 66215, new Class[]{List.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, list2}, this, s, false, 66215, new Class[]{List.class, List.class}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(list2)) {
            ArrayList arrayList = new ArrayList();
            boolean isCertificated = this.G.isCertificated();
            boolean z4 = false;
            int i = 0;
            boolean z5 = false;
            int i2 = 0;
            z2 = false;
            for (com.ss.android.ugc.aweme.newfollow.e.b next : list2) {
                if (com.ss.android.ugc.aweme.newfollow.a.b.j(next.getAweme())) {
                    if (this.v) {
                        if (isCertificated) {
                            if (i == 10) {
                                j a2 = a(this.G, j.Companion.getTYPE_NEARBY(), arrayList);
                                if (a2 != null) {
                                    a2.setHideTopDivider(false);
                                    i2 = i + 1;
                                }
                                j a3 = a(this.G, j.Companion.getTYPE_EXPLORE(), arrayList);
                                if (!(a3 == null || i2 == i + 1)) {
                                    a3.setHideTopDivider(false);
                                }
                                z4 = true;
                            }
                        } else if ((i == 1 && this.t) || (i == 2 && this.u)) {
                            j a4 = a(this.G, j.Companion.getTYPE_NEARBY(), arrayList);
                            if (a4 != null) {
                                a4.setHideTopDivider(false);
                            }
                            z4 = true;
                        } else if ((i == 3 && this.t) || (i == 6 && this.u)) {
                            j a5 = a(this.G, j.Companion.getTYPE_EXPLORE(), arrayList);
                            if (a5 != null) {
                                a5.setHideTopDivider(false);
                            }
                        }
                        z5 = true;
                    }
                    arrayList.add(next);
                    if (!z2 && i == 2) {
                        l a6 = a(this.G, true);
                        if (a6 != null) {
                            arrayList.add(a6);
                            z2 = true;
                        }
                    }
                    i++;
                }
            }
            list3.addAll(arrayList);
            if (this.v) {
                if (!z4) {
                    j a7 = a(this.G, j.Companion.getTYPE_NEARBY(), list3);
                    if (a7 != null) {
                        a7.setHideTopDivider(false);
                        i2 = i + 1;
                    }
                }
                if (!z5) {
                    j a8 = a(this.G, j.Companion.getTYPE_EXPLORE(), list3);
                    if (!(a8 == null || i2 == i + 1)) {
                        a8.setHideTopDivider(false);
                    }
                }
            }
            z3 = true;
        } else {
            z2 = false;
        }
        if (this.v && !z3) {
            a(this.G, j.Companion.getTYPE_NEARBY(), list3);
            a(this.G, j.Companion.getTYPE_EXPLORE(), list3);
        }
        if (!z2) {
            l a9 = a(this.G, z3);
            if (a9 != null) {
                list3.add(a9);
            }
        }
    }

    private j a(PoiDetail poiDetail, int i, List<com.ss.android.ugc.aweme.newfollow.e.b> list) {
        PoiDetail poiDetail2 = poiDetail;
        int i2 = i;
        List<com.ss.android.ugc.aweme.newfollow.e.b> list2 = list;
        if (PatchProxy.isSupport(new Object[]{poiDetail2, Integer.valueOf(i), list2}, this, s, false, 66216, new Class[]{PoiDetail.class, Integer.TYPE, List.class}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{poiDetail2, Integer.valueOf(i), list2}, this, s, false, 66216, new Class[]{PoiDetail.class, Integer.TYPE, List.class}, j.class);
        }
        j jVar = null;
        if (i2 == j.Companion.getTYPE_NEARBY()) {
            if (poiDetail.hasRecomemndNearbyPoi()) {
                jVar = new j(Integer.valueOf(j.Companion.getTYPE_NEARBY()), poiDetail2.recommendPoiNearby);
                list2.add(jVar);
            }
        } else if (i2 == j.Companion.getTYPE_EXPLORE()) {
            if (poiDetail.hasRecomemndExplorePoi()) {
                jVar = new j(Integer.valueOf(j.Companion.getTYPE_EXPLORE()), poiDetail2.recommendPoiExplore);
                list2.add(jVar);
            }
        } else if (i2 == j.Companion.getTYPE_HOTEL()) {
            if (poiDetail.hasRecomemndHotelPoi()) {
                jVar = new j(Integer.valueOf(j.Companion.getTYPE_HOTEL()), poiDetail2.recommendPoiHotel);
                list2.add(jVar);
            }
        } else if (i2 == j.Companion.getTYPE_SCENE()) {
            if (poiDetail.hasRecomemndScenePoi()) {
                jVar = new j(Integer.valueOf(j.Companion.getTYPE_SCENE()), poiDetail2.recommendPoiScene);
                list2.add(jVar);
            }
        } else if (i2 == j.Companion.getTYPE_FOOD() && poiDetail.hasRecomemndFoodPoi()) {
            jVar = new j(Integer.valueOf(j.Companion.getTYPE_FOOD()), poiDetail2.recommendPoiFood);
            list2.add(jVar);
        }
        if (jVar != null && jVar.hasMore()) {
            jVar.addNullItem();
        }
        return jVar;
    }
}
