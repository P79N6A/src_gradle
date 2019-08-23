package com.ss.android.ugc.aweme.poi.nearby.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SquareImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassFilterOptionStruct;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct;
import com.ss.android.ugc.aweme.feed.model.poi.PoiOptionStruct;
import com.ss.android.ugc.aweme.feed.model.poi.PoiRankFilterOptionResponse;
import com.ss.android.ugc.aweme.feed.model.poi.PoiRankFilterOptionStruct;
import com.ss.android.ugc.aweme.feed.model.poi.PoiRankFilterResponse;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.poi.e.o;
import com.ss.android.ugc.aweme.poi.model.ap;
import com.ss.android.ugc.aweme.poi.model.aq;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.poi.model.n;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiFilterAdapter;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiFilterDetailAdapter;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter;
import com.ss.android.ugc.aweme.poi.nearby.b.i;
import com.ss.android.ugc.aweme.poi.nearby.b.j;
import com.ss.android.ugc.aweme.poi.nearby.b.k;
import com.ss.android.ugc.aweme.poi.nearby.b.l;
import com.ss.android.ugc.aweme.poi.nearby.widget.a;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.views.DmtLoadingDialog;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class PoiRankListActivity extends AmeSlideSSActivity implements PoiFilterAdapter.a, PoiFilterDetailAdapter.a, PoiRankListAdapter.a, j, l {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f60050b;
    private long A;
    private long B;
    private long C;
    private String D;
    private boolean E;

    /* renamed from: c  reason: collision with root package name */
    PoiFilterAdapter f60051c;

    /* renamed from: d  reason: collision with root package name */
    private DmtLoadingDialog f60052d;

    /* renamed from: e  reason: collision with root package name */
    private PoiRankListAdapter f60053e;

    /* renamed from: f  reason: collision with root package name */
    private a f60054f;
    private i g;
    private k h;
    private List<PoiClassFilterOptionStruct> i;
    private List<PoiOptionStruct> j;
    private List<SimplePoiInfoStruct> k;
    private int l;
    private String m = "";
    @BindView(2131494566)
    DmtTextView mHeadDesc;
    @BindView(2131494570)
    SquareImageView mHeadImg;
    @BindView(2131494571)
    RelativeLayout mHeadImgContainer;
    @BindView(2131496280)
    RecyclerView mPoiFilterRecycler;
    @BindView(2131496315)
    ImageView mPoiRankBg;
    @BindView(2131496368)
    RecyclerView mPoiTypeDetailRecycler;
    @BindView(2131496920)
    AppBarLayout mScrollLayout;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131497604)
    NormalTitleBar mTitleBar;
    private String n = "";
    private String o = "";
    private n p;
    private String q = "";
    private boolean r = true;
    private int s;
    private String t;
    private long u;
    private String v = "";
    private String w = "";
    private boolean x;
    private boolean y;
    private long z;

    public void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f60050b, false, 65295, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f60050b, false, 65295, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiRankListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60050b, false, 65281, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60050b, false, 65281, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        d();
        this.x = true;
        this.A = System.currentTimeMillis();
        this.D = PushConstants.PUSH_TYPE_NOTIFY;
        f();
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f60050b, false, 65282, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60050b, false, 65282, new Class[0], Void.TYPE);
            return;
        }
        this.mPoiFilterRecycler.setVisibility(8);
        this.mHeadImgContainer.post(new d(this));
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f60050b, false, 65289, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60050b, false, 65289, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.g != null) {
            this.g.k();
        }
        if (this.h != null) {
            this.h.k();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f60050b, false, 65290, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60050b, false, 65290, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiRankListActivity", "onResume", true);
        super.onResume();
        this.u = System.currentTimeMillis();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiRankListActivity", "onResume", false);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f60050b, false, 65292, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60050b, false, 65292, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    private void f() {
        long j2;
        if (PatchProxy.isSupport(new Object[0], this, f60050b, false, 65293, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60050b, false, 65293, new Class[0], Void.TYPE);
        } else if (!this.E && this.x && this.y) {
            this.E = true;
            long j3 = 0;
            if (this.z > 0) {
                j2 = this.A - this.z;
            } else {
                j2 = 0;
            }
            if (this.B > 0) {
                j3 = this.C - this.B;
            }
            if (j3 > j2) {
                j2 = j3;
            }
            o.a("poi_rank", j2, this.D);
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f60050b, false, 65294, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60050b, false, 65294, new Class[0], Void.TYPE);
            return;
        }
        c a2 = c.a();
        a2.a("citycode", aa.a());
        a2.a("classcode", this.o);
        a2.a("businessarea", this.n);
        a2.a("poichannel", aa.f75005b);
        o.a("poi_empty_rank", a2.b());
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f60050b, false, 65291, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60050b, false, 65291, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        r.a("stay_time", (Map) d.a().a("enter_from", "poi_leaderboard").a("duration", System.currentTimeMillis() - this.u).a("enter_method", this.w).a("poi_channel", aa.b()).a("city_info", aa.a()).f34114b);
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f60050b, false, 65288, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60050b, false, 65288, new Class[0], Void.TYPE);
        } else if (this.i != null && this.k != null) {
            if (this.f60052d != null && this.f60052d.isShowing()) {
                this.f60052d.dismiss();
            }
            if (this.r) {
                for (PoiClassFilterOptionStruct next : this.i) {
                    if (!CollectionUtils.isEmpty(next.optionStructList)) {
                        if (this.p != null) {
                            this.t = this.p.classOption.getName();
                            List<PoiOptionStruct> list = next.optionStructList;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= list.size()) {
                                    break;
                                }
                                PoiOptionStruct poiOptionStruct = list.get(i2);
                                if (poiOptionStruct.getCode() == this.p.classOption.getCode()) {
                                    poiOptionStruct.setSelected(true);
                                    if (i2 > 0) {
                                        next.subTitle = poiOptionStruct.getName();
                                    }
                                } else {
                                    i2++;
                                }
                            }
                        } else {
                            this.t = next.optionStructList.get(0).getName();
                            next.optionStructList.get(0).setSelected(true);
                        }
                    }
                }
                this.f60053e.a(this.t);
            }
            this.r = false;
            this.f60051c.a(this.i);
            if (CollectionUtils.isEmpty(this.k)) {
                this.f60053e.clearData();
                this.mStatusView.e();
                com.bytedance.ies.dmt.ui.d.a.a((Context) this, (int) C0906R.string.bp1).a();
                g();
            } else {
                this.f60053e.setShowFooter(false);
                this.f60053e.setData(this.k);
                this.mStatusView.b();
            }
            this.mPoiTypeDetailRecycler.scrollToPosition(0);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f60050b, false, 65278, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60050b, false, 65278, new Class[0], Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(this)) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgf).a();
        } else {
            this.mStatusView.d();
            if (this.i == null) {
                this.g.a(this.m, Integer.valueOf(this.l));
                this.z = System.currentTimeMillis();
            }
            this.h.a(this.n, this.o, this.m, Integer.valueOf(this.l), this.q);
            this.B = System.currentTimeMillis();
        }
    }

    public final void a(PoiRankFilterResponse poiRankFilterResponse) {
        UrlModel urlModel;
        if (PatchProxy.isSupport(new Object[]{poiRankFilterResponse}, this, f60050b, false, 65283, new Class[]{PoiRankFilterResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiRankFilterResponse}, this, f60050b, false, 65283, new Class[]{PoiRankFilterResponse.class}, Void.TYPE);
            return;
        }
        this.y = true;
        this.C = System.currentTimeMillis();
        this.D = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        if (poiRankFilterResponse != null) {
            this.k = poiRankFilterResponse.poiInfoStructList;
            PoiClassRankBannerStruct poiClassRankBannerStruct = poiRankFilterResponse.poiClassRankBannerStruct;
            if (poiClassRankBannerStruct != null) {
                if (com.ss.android.ugc.aweme.app.a.a.a((Activity) this) || com.ss.android.ugc.aweme.app.a.a.b((Activity) this)) {
                    urlModel = poiClassRankBannerStruct.getNotchBannerUrl();
                } else {
                    urlModel = poiClassRankBannerStruct.getBannerUrl();
                }
                com.ss.android.ugc.aweme.base.c.b(this.mHeadImg, urlModel);
                this.mHeadDesc.setText(poiClassRankBannerStruct.getDescription());
                this.mTitleBar.setTitle((CharSequence) poiClassRankBannerStruct.getDescription());
            }
            e();
            f();
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60050b, false, 65284, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60050b, false, 65284, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.y = true;
        this.C = System.currentTimeMillis();
        this.D = PushConstants.PUSH_TYPE_NOTIFY;
        f();
    }

    public final void a(PoiRankFilterOptionResponse poiRankFilterOptionResponse) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{poiRankFilterOptionResponse}, this, f60050b, false, 65280, new Class[]{PoiRankFilterOptionResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiRankFilterOptionResponse}, this, f60050b, false, 65280, new Class[]{PoiRankFilterOptionResponse.class}, Void.TYPE);
            return;
        }
        this.x = true;
        this.A = System.currentTimeMillis();
        this.D = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        if (poiRankFilterOptionResponse == null) {
            d();
            return;
        }
        PoiRankFilterOptionStruct poiRankFilterOptionStruct = poiRankFilterOptionResponse.poiRankFilterOptionStruct;
        if (poiRankFilterOptionStruct == null) {
            d();
            return;
        }
        this.i = poiRankFilterOptionStruct.filterOptionList;
        Iterator<PoiClassFilterOptionStruct> it2 = this.i.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            PoiClassFilterOptionStruct next = it2.next();
            if (next != null && !CollectionUtils.isEmpty(next.optionStructList) && next.optionStructList.size() > 1) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            d();
            this.f60053e.f59972b = false;
        } else {
            this.f60053e.f59972b = true;
        }
        e();
        f();
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f60050b, false, 65276, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f60050b, false, 65276, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiRankListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.d4);
        if (PatchProxy.isSupport(new Object[0], this, f60050b, false, 65277, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60050b, false, 65277, new Class[0], Void.TYPE);
        } else {
            this.mPoiFilterRecycler.setLayoutManager(new WrapLinearLayoutManager(this, 0, false));
            this.f60051c = new PoiFilterAdapter(this);
            this.mPoiFilterRecycler.setAdapter(this.f60051c);
            this.mPoiTypeDetailRecycler.setLayoutManager(new WrapLinearLayoutManager(this, 1, false));
            this.f60053e = new PoiRankListAdapter(this);
            this.mPoiTypeDetailRecycler.setAdapter(this.f60053e);
            this.mTitleBar.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f60055a;

                public final void b(View view) {
                }

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f60055a, false, 65301, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f60055a, false, 65301, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    PoiRankListActivity.this.onBackPressed();
                }
            });
            this.mHeadImgContainer.post(new a(this));
            this.mScrollLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new com.ss.android.ugc.aweme.hotsearch.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f60057a;

                public final void a(AppBarLayout appBarLayout, int i) {
                    if (PatchProxy.isSupport(new Object[]{appBarLayout, Integer.valueOf(i)}, this, f60057a, false, 65302, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{appBarLayout, Integer.valueOf(i)}, this, f60057a, false, 65302, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    int totalScrollRange = appBarLayout.getTotalScrollRange();
                    if (i == 0) {
                        PoiRankListActivity.this.mHeadImg.setAlpha(1.0f);
                        PoiRankListActivity.this.mHeadDesc.setAlpha(1.0f);
                        PoiRankListActivity.this.mTitleBar.getTitleView().setAlpha(0.0f);
                        PoiRankListActivity.this.mTitleBar.showDividerLine(false);
                        return;
                    }
                    float abs = 1.0f - Math.abs((((float) i) * 1.0f) / ((float) totalScrollRange));
                    PoiRankListActivity.this.mHeadImg.setAlpha(abs);
                    PoiRankListActivity.this.mHeadDesc.setAlpha(abs);
                    double d2 = (double) abs;
                    if (d2 > 0.5d) {
                        PoiRankListActivity.this.mTitleBar.getTitleView().setAlpha(0.0f);
                        PoiRankListActivity.this.mTitleBar.showDividerLine(false);
                    }
                    if (d2 < 0.2d) {
                        PoiRankListActivity.this.mTitleBar.getTitleView().setAlpha(1.0f - abs);
                        PoiRankListActivity.this.mTitleBar.showDividerLine(true);
                    }
                }
            });
            this.mStatusView.setBuilder(DmtStatusView.a.a((Context) this).a().a(new c.a(this).b((int) C0906R.string.bol).c(C0906R.string.bow).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, C0906R.string.dms, new b(this)).f20493a).a(2130840142, C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new c(this)));
        }
        if (PatchProxy.isSupport(new Object[0], this, f60050b, false, 65279, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60050b, false, 65279, new Class[0], Void.TYPE);
        } else {
            Intent intent = getIntent();
            if (intent != null) {
                if (intent.hasExtra("poi_class_code")) {
                    this.l = intent.getIntExtra("poi_class_code", 0);
                    this.f60053e.f59974d = this.l;
                }
                if (intent.hasExtra("enter_from")) {
                    this.v = intent.getStringExtra("enter_from");
                    PoiRankListAdapter poiRankListAdapter = this.f60053e;
                    String str3 = this.v;
                    if (PatchProxy.isSupport(new Object[]{str3}, poiRankListAdapter, PoiRankListAdapter.f59971a, false, 65193, new Class[]{String.class}, Void.TYPE)) {
                        PoiRankListAdapter poiRankListAdapter2 = poiRankListAdapter;
                        PatchProxy.accessDispatch(new Object[]{str3}, poiRankListAdapter2, PoiRankListAdapter.f59971a, false, 65193, new Class[]{String.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(str3, "<set-?>");
                        poiRankListAdapter.f59973c = str3;
                    }
                }
                if (intent.hasExtra("enter_method")) {
                    this.w = intent.getStringExtra("enter_method");
                }
                if (intent.hasExtra("poi_rank")) {
                    this.p = (n) intent.getSerializableExtra("poi_rank");
                }
                if (intent.hasExtra("district_code") && !TextUtils.isEmpty(intent.getStringExtra("district_code"))) {
                    this.q = intent.getStringExtra("district_code");
                    PoiRankListAdapter poiRankListAdapter3 = this.f60053e;
                    String str4 = this.q;
                    if (PatchProxy.isSupport(new Object[]{str4}, poiRankListAdapter3, PoiRankListAdapter.f59971a, false, 65194, new Class[]{String.class}, Void.TYPE)) {
                        PoiRankListAdapter poiRankListAdapter4 = poiRankListAdapter3;
                        PatchProxy.accessDispatch(new Object[]{str4}, poiRankListAdapter4, PoiRankListAdapter.f59971a, false, 65194, new Class[]{String.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(str4, "<set-?>");
                        poiRankListAdapter3.f59975e = str4;
                    }
                }
            }
            this.g = new i();
            this.g.a(new aq());
            this.g.a(this);
            this.h = new k();
            this.h.a(new ap());
            this.h.a(this);
            this.m = com.ss.android.ugc.aweme.feed.c.a();
            if (TextUtils.isEmpty(this.m)) {
                this.m = com.ss.android.ugc.aweme.feed.c.d();
            }
            if (this.p != null) {
                this.l = (int) this.p.poiClassCode;
                this.f60053e.f59974d = this.l;
                this.m = this.p.cityCode;
                if (this.p.classOption != null) {
                    str = String.valueOf(this.p.classOption.getCode());
                } else {
                    str = "";
                }
                this.o = str;
                if (this.p.businessAreaOption != null) {
                    str2 = String.valueOf(this.p.businessAreaOption.getCode());
                } else {
                    str2 = "";
                }
                this.n = str2;
            }
            if (!NetworkUtils.isNetworkAvailable(this)) {
                this.mHeadImg.setImageResource(C0906R.color.yx);
                this.mStatusView.f();
            } else {
                c();
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiRankListActivity", "onCreate", false);
    }

    public final void a(int i2, PoiOptionStruct poiOptionStruct) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), poiOptionStruct}, this, f60050b, false, 65286, new Class[]{Integer.TYPE, PoiOptionStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), poiOptionStruct}, this, f60050b, false, 65286, new Class[]{Integer.TYPE, PoiOptionStruct.class}, Void.TYPE);
            return;
        }
        if (this.f60054f != null) {
            this.f60054f.dismiss();
        }
        if (!NetworkUtils.isNetworkAvailable(this)) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgf).a();
            return;
        }
        if (i2 == 0) {
            this.i.get(this.s).subTitle = "";
        } else {
            this.i.get(this.s).subTitle = poiOptionStruct.getName();
        }
        this.t = poiOptionStruct.getName();
        this.f60053e.a(this.t);
        for (PoiOptionStruct next : this.j) {
            if (next.getCode() == poiOptionStruct.getCode()) {
                next.setSelected(true);
            } else {
                next.setSelected(false);
            }
        }
        this.o = String.valueOf(poiOptionStruct.getCode());
        if (this.f60052d == null) {
            this.f60052d = new DmtLoadingDialog(this);
        }
        this.f60052d.show();
        this.h.a(this.n, this.o, this.m, Integer.valueOf(this.l), this.q);
    }

    public final void a(PoiClassFilterOptionStruct poiClassFilterOptionStruct, int i2) {
        if (PatchProxy.isSupport(new Object[]{poiClassFilterOptionStruct, Integer.valueOf(i2)}, this, f60050b, false, 65285, new Class[]{PoiClassFilterOptionStruct.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiClassFilterOptionStruct, Integer.valueOf(i2)}, this, f60050b, false, 65285, new Class[]{PoiClassFilterOptionStruct.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.s = i2;
        if (this.f60054f == null) {
            this.f60054f = new a(this, this);
            this.f60054f.setOnDismissListener(new e(this));
        }
        this.j = this.i.get(i2).optionStructList;
        if (!CollectionUtils.isEmpty(this.j)) {
            this.f60054f.a(this.j);
            this.f60054f.showAsDropDown(this.mPoiFilterRecycler, 0, 1);
            r.a("click_poi_leaderboard_filter", (Map) d.a().a("enter_from", this.v).a("enter_method", "poi_type").a("poi_channel", this.l).a("city_info", aa.a()).f34114b);
        }
    }

    public final void a(SimplePoiInfoStruct simplePoiInfoStruct, String str, int i2) {
        SimplePoiInfoStruct simplePoiInfoStruct2 = simplePoiInfoStruct;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{simplePoiInfoStruct2, str2, Integer.valueOf(i2)}, this, f60050b, false, 65287, new Class[]{SimplePoiInfoStruct.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{simplePoiInfoStruct2, str2, Integer.valueOf(i2)}, this, f60050b, false, 65287, new Class[]{SimplePoiInfoStruct.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        l.a o2 = new l.a().c(simplePoiInfoStruct2.poiId).g(simplePoiInfoStruct2.poiName).a(simplePoiInfoStruct).i("poi_leaderboard").l(this.w).m(String.valueOf(this.l)).o(str2);
        o2.m = this.q;
        o2.k = String.valueOf(i2 + 1);
        o2.l = this.t;
        PoiDetailActivity.a(this, o2.a());
    }
}
