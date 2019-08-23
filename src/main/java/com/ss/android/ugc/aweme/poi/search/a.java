package com.ss.android.ugc.aweme.poi.search;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.d.f;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.ay;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.utils.permission.a;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;
import java.util.Map;

public class a extends FrameLayout implements f, LoadMoreRecyclerViewAdapter.a, c<PoiStruct> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60331a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f60332b;

    /* renamed from: c  reason: collision with root package name */
    String f60333c = "";

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f60334d;

    /* renamed from: e  reason: collision with root package name */
    private BaseAdapter f60335e;

    /* renamed from: f  reason: collision with root package name */
    private DmtStatusView f60336f;
    private i g;
    private l h;
    private boolean i;
    private String j;
    private String k;
    private String l;
    private ay m;
    private C0027a n;

    /* renamed from: com.ss.android.ugc.aweme.poi.search.a$a  reason: collision with other inner class name */
    public interface C0027a {
        void a();
    }

    public final void c(List<PoiStruct> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public String getPoiSearchRegionType() {
        return "domestic";
    }

    public int getSearchType() {
        return 0;
    }

    public final void z_() {
    }

    public final void W_() {
        if (PatchProxy.isSupport(new Object[0], this, f60331a, false, 65693, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60331a, false, 65693, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.poi.a f2 = af.a(getContext()).f();
        if (f2 != null) {
            a(f2);
        }
        a(true, this.f60333c);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f60331a, false, 65702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60331a, false, 65702, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.a();
        }
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f60331a, false, 65692, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60331a, false, 65692, new Class[0], Void.TYPE);
            return;
        }
        this.g.a(4);
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f60331a, false, 65685, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60331a, false, 65685, new Class[0], Void.TYPE);
            return;
        }
        this.f60334d.setVisibility(4);
        this.f60336f.d();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f60331a, false, 65694, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60331a, false, 65694, new Class[0], Void.TYPE);
            return;
        }
        af.a((Context) k.a()).c(this);
        super.onDetachedFromWindow();
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f60331a, false, 65689, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60331a, false, 65689, new Class[0], Void.TYPE);
            return;
        }
        this.f60335e.showLoadMoreLoading();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String getCreationId() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f60331a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 65703(0x100a7, float:9.207E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f60331a
            r5 = 0
            r6 = 65703(0x100a7, float:9.207E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0028:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.ss.android.ugc.aweme.services.IAVService) r0
            android.content.Context r1 = r9.getContext()
            java.util.Map r0 = r0.getTrickyMapByActivity(r1)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0051
            java.lang.String r2 = "creation_id"
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x0051
            java.lang.String r1 = "creation_id"
            java.lang.Object r0 = r0.get(r1)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.a.getCreationId():java.lang.String");
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f60331a, false, 65699, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60331a, false, 65699, new Class[0], Void.TYPE);
            return;
        }
        n.a("location_log", "", com.ss.android.ugc.aweme.app.d.c.a().a("service", "search location").a("errorDesc", "no available locations near by").a("action", this.f60333c).a("longitude", this.j).a("latitude", this.k).a("type", String.valueOf(getSearchType())).b());
    }

    public final void b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f60331a, false, 65681, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60331a, false, 65681, new Class[0], Void.TYPE);
            return;
        }
        i iVar = this.g;
        Object[] objArr = new Object[6];
        objArr[0] = 1;
        objArr[1] = this.f60333c;
        objArr[2] = this.j;
        objArr[3] = this.k;
        objArr[4] = Integer.valueOf(getSearchType());
        if (TextUtils.isEmpty(this.l)) {
            str = "";
        } else {
            str = this.l;
        }
        objArr[5] = str;
        iVar.a(objArr);
        g();
    }

    public void getLocation() {
        if (PatchProxy.isSupport(new Object[0], this, f60331a, false, 65683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60331a, false, 65683, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.poi.a a2 = af.a((Context) k.a()).a((f) this);
        if (a2 != null) {
            af.a(getContext()).d();
            a(a2);
        }
        b();
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f60331a, false, 65687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60331a, false, 65687, new Class[0], Void.TYPE);
            return;
        }
        if (this.f60335e.mShowFooter) {
            this.f60335e.setShowFooter(false);
            this.f60335e.notifyDataSetChanged();
            this.f60335e.showLoadMoreEmpty();
        }
        this.f60334d.setVisibility(4);
        this.f60336f.e();
        i();
        a(false);
    }

    private void g() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f60331a, false, 65696, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60331a, false, 65696, new Class[0], Void.TYPE);
        } else if (!h()) {
            r.onEvent(new MobClick().setLabelName("video_publish_page").setEventName("search_poi").setJsonObject(new t().a("key_word", this.f60333c).a()));
            d a2 = d.a().a("enter_from", "video_publish_page");
            if (TextUtils.isEmpty(this.f60333c)) {
                str = "default_search_poi";
            } else {
                str = "search_poi";
            }
            r.a("search_poi", (Map) a2.a("enter_method", str).a("key_word", this.f60333c).a("has_gps", (Object) Boolean.valueOf(this.i)).a("search_region_type", getPoiSearchRegionType()).f34114b);
        }
    }

    private boolean h() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f60331a, false, 65697, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60331a, false, 65697, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String detectIsFromEditOrStory = ((IAVService) ServiceManager.get().getService(IAVService.class)).detectIsFromEditOrStory(getContext());
        if (TextUtils.isEmpty(detectIsFromEditOrStory)) {
            return false;
        }
        d a2 = d.a().a("creation_id", getCreationId()).a("enter_from", detectIsFromEditOrStory);
        if (TextUtils.isEmpty(this.f60333c)) {
            str = "default_search_poi";
        } else {
            str = "search_poi";
        }
        r.a("search_poi", (Map) a2.a("enter_method", str).a("key_word", this.f60333c).a("has_gps", (Object) Boolean.valueOf(this.i)).a("search_region_type", getPoiSearchRegionType()).f34114b);
        return true;
    }

    public void setHideImmListener(C0027a aVar) {
        this.n = aVar;
    }

    public void setNotShowNoMyLocation(boolean z) {
        if (this.f60335e instanceof POISearchAdapterSuper) {
            ((POISearchAdapterSuper) this.f60335e).f60311b = z;
        }
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60331a, false, 65690, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60331a, false, 65690, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.f60335e.showLoadMoreError();
    }

    private com.bytedance.ies.dmt.ui.widget.c a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f60331a, false, 65695, new Class[]{String.class}, com.bytedance.ies.dmt.ui.widget.c.class)) {
            return new c.a(getContext()).b((int) C0906R.string.dmm).b(str2).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, C0906R.string.dms, new c(this)).f20493a;
        }
        return (com.bytedance.ies.dmt.ui.widget.c) PatchProxy.accessDispatch(new Object[]{str2}, this, f60331a, false, 65695, new Class[]{String.class}, com.bytedance.ies.dmt.ui.widget.c.class);
    }

    private void a(@NonNull com.ss.android.ugc.aweme.poi.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f60331a, false, 65684, new Class[]{com.ss.android.ugc.aweme.poi.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f60331a, false, 65684, new Class[]{com.ss.android.ugc.aweme.poi.a.class}, Void.TYPE);
            return;
        }
        this.i = aVar.isValid();
        String[] a2 = p.a(aVar);
        this.k = a2[0];
        this.j = a2[1];
    }

    private boolean b(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60331a, false, 65701, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60331a, false, 65701, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        String detectIsFromEditOrStory = ((IAVService) ServiceManager.get().getService(IAVService.class)).detectIsFromEditOrStory(getContext());
        if (TextUtils.isEmpty(detectIsFromEditOrStory)) {
            return false;
        }
        d a2 = d.a().a("creation_id", getCreationId()).a("enter_from", detectIsFromEditOrStory);
        if (TextUtils.isEmpty(this.f60333c)) {
            str = "default_search_poi";
        } else {
            str = "search_poi";
        }
        r.a("search_poi_result", (Map) a2.a("enter_method", str).a("key_word", this.f60333c).a("is_success", z ? 1 : 0).a("log_pb", this.g.c()).a("search_region_type", getPoiSearchRegionType()).f34114b);
        return true;
    }

    private void a(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60331a, false, 65700, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60331a, false, 65700, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!b(z)) {
            d a2 = d.a().a("enter_from", "video_publish_page");
            if (TextUtils.isEmpty(this.f60333c)) {
                str = "default_search_poi";
            } else {
                str = "search_poi";
            }
            r.a("search_poi_result", (Map) a2.a("enter_method", str).a("key_word", this.f60333c).a("is_success", z ? 1 : 0).a("log_pb", this.g.c()).a("search_region_type", getPoiSearchRegionType()).f34114b);
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60331a, false, 65686, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60331a, false, 65686, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.f60334d.setVisibility(4);
        if (this.f60335e.mShowFooter) {
            this.f60335e.setShowFooter(false);
            this.f60335e.notifyDataSetChanged();
        }
        if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            this.f60336f.setBuilder(this.f60336f.a().b(a(((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorMsg())));
            if (PatchProxy.isSupport(new Object[0], this, f60331a, false, 65698, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60331a, false, 65698, new Class[0], Void.TYPE);
            } else {
                for (int i2 = 0; i2 < this.f60336f.getChildCount(); i2++) {
                    this.f60336f.getChildAt(i2).setOnClickListener(new d(this));
                }
            }
        }
        this.f60336f.f();
        a(false);
        i();
    }

    public final void a(List<PoiStruct> list, boolean z) {
        PoiStruct poiStruct;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f60331a, false, 65688, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f60331a, false, 65688, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f60335e.setShowFooter(true);
        if (!z) {
            this.f60335e.showLoadMoreEmpty();
        } else {
            this.f60335e.resetLoadMoreState();
        }
        if (this.h != null) {
            g gVar = (g) this.f60335e;
            l lVar = this.h;
            if (lVar.mData == null) {
                poiStruct = null;
            } else {
                poiStruct = ((ay) lVar.mData).f59907e;
            }
            gVar.a(poiStruct);
        }
        if (TextUtils.isEmpty(this.f60333c)) {
            if (this.m == null) {
                this.m = ay.a((ay) this.h.getData());
            } else {
                f();
                this.f60334d.scrollToPosition(0);
            }
        }
        this.f60335e.setData(list);
        this.f60334d.setVisibility(0);
        this.f60336f.b();
        a(true);
    }

    public final void b(List<PoiStruct> list, boolean z) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f60331a, false, 65691, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f60331a, false, 65691, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (list != null && !list.isEmpty()) {
            z2 = z;
        }
        if (!z2) {
            this.f60335e.showLoadMoreEmpty();
        } else {
            this.f60335e.resetLoadMoreState();
        }
        if (TextUtils.isEmpty(this.f60333c)) {
            this.m = ay.a((ay) this.h.getData());
        }
        this.f60335e.setDataAfterLoadMore(list);
    }

    public final void a(boolean z, String str) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f60331a, false, 65680, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f60331a, false, 65680, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (this.f60335e instanceof g) {
            ((g) this.f60335e).a(str);
        }
        if (TextUtils.isEmpty(str) && this.m != null) {
            this.h.mData = this.m;
            this.h.f60350b = str;
            this.f60333c = "";
            a(this.m.f59904b, this.m.f59905c);
        } else if (TextUtils.isEmpty(str) || !TextUtils.equals(this.f60333c, str) || this.f60336f.i()) {
            this.f60333c = str;
            if (StringUtils.isEmpty(this.j) || StringUtils.isEmpty(this.k)) {
                if (PatchProxy.isSupport(new Object[0], this, f60331a, false, 65682, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f60331a, false, 65682, new Class[0], Void.TYPE);
                } else if (!com.ss.android.ugc.aweme.utils.permission.a.a((Context) (Activity) getContext(), af.f2626c)) {
                    com.ss.android.ugc.aweme.utils.permission.a.b((Activity) getContext(), PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, af.f2626c, new a.C0792a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f60337a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f60337a, false, 65708, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f60337a, false, 65708, new Class[0], Void.TYPE);
                                return;
                            }
                            a.this.getLocation();
                        }

                        public final void b() {
                            if (PatchProxy.isSupport(new Object[0], this, f60337a, false, 65709, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f60337a, false, 65709, new Class[0], Void.TYPE);
                                return;
                            }
                            a.this.b();
                        }
                    });
                } else {
                    getLocation();
                }
                if (!z) {
                    return;
                }
            }
            b();
        }
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, String str, boolean z) {
        super(context, attributeSet, i2);
        this.l = str;
        this.f60332b = z;
        if (PatchProxy.isSupport(new Object[0], this, f60331a, false, 65678, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60331a, false, 65678, new Class[0], Void.TYPE);
        } else {
            LayoutInflater.from(getContext()).inflate(C0906R.layout.f4509pl, this, true);
            this.f60334d = (RecyclerView) findViewById(C0906R.id.c3f);
            this.f60336f = (DmtStatusView) findViewById(C0906R.id.cvd);
            DmtStatusView dmtStatusView = this.f60336f;
            DmtStatusView.a a2 = DmtStatusView.a.a(getContext());
            b bVar = new b(this);
            a2.a(new c.a(a2.f20473a).b((int) C0906R.string.f4486dmt).c(C0906R.string.dmu).f20493a);
            a2.f20475c.setOnClickListener(bVar);
            dmtStatusView.setBuilder(a2.b(a(getContext().getString(C0906R.string.dml))));
            this.f60335e = new POISearchAdapterSuper();
            this.f60334d.setLayoutManager(new WrapLinearLayoutManager(getContext()));
            this.f60335e.setLoadMoreListener(this);
            this.f60335e.showLoadMoreEmpty();
            this.f60335e.setShowFooter(true);
            this.f60334d.setAdapter(this.f60335e);
            this.f60334d.addOnScrollListener(new BasePoiSearchLayout$1(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f60331a, false, 65679, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60331a, false, 65679, new Class[0], Void.TYPE);
            return;
        }
        this.g = new i();
        this.h = new l();
        this.g.a(this);
        this.g.a(this.h);
        this.f60336f.d();
    }
}
