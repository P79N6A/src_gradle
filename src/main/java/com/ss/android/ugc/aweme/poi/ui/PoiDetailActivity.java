package com.ss.android.ugc.aweme.poi.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.monitor.annotation.AddPageTrace;
import com.bytedance.common.utility.StringUtils;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;
import org.greenrobot.eventbus.Subscribe;

@AddPageTrace
public class PoiDetailActivity extends AmeSlideSSActivity {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f3755b;

    /* renamed from: c  reason: collision with root package name */
    l f3756c;

    /* renamed from: d  reason: collision with root package name */
    private long f3757d;

    /* renamed from: e  reason: collision with root package name */
    private String f3758e;

    /* renamed from: f  reason: collision with root package name */
    private String f3759f;
    private String g;

    public final boolean ad_() {
        return false;
    }

    public final boolean b() {
        return true;
    }

    public Analysis getAnalysis() {
        return null;
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3755b, false, 66053, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3755b, false, 66053, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3755b, false, 66048, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3755b, false, 66048, new Class[0], Void.TYPE);
            return;
        }
        this.f3757d = System.currentTimeMillis();
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f3755b, false, 66051, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3755b, false, 66051, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (isTaskRoot()) {
            h.a().a((Activity) this, "aweme://main");
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3755b, false, 66043, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3755b, false, 66043, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
        bg.d(this);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3755b, false, 66047, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3755b, false, 66047, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        d();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3755b, false, 66046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3755b, false, 66046, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity", "onResume", true);
        super.onResume();
        c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity", "onResume", false);
    }

    private void d() {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[0], this, f3755b, false, 66049, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3755b, false, 66049, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3757d != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f3757d;
            if (currentTimeMillis > 0) {
                a.a(this, "stay_time", "poi_page", currentTimeMillis, 0);
                l lVar = this.f3756c;
                d a2 = d.a().a("enter_from", "poi_page").a("city_info", aa.a()).a("enter_method", this.g).a("duration", currentTimeMillis).a("poi_id", this.f3758e);
                if (this.f3756c != null) {
                    str = this.f3756c.poiType;
                } else {
                    str = "";
                }
                d a3 = a2.a("poi_type", str);
                if (this.f3756c != null) {
                    str2 = this.f3756c.awemeid;
                } else {
                    str2 = "";
                }
                d a4 = a3.a("group_id", str2);
                if (this.f3756c != null) {
                    str3 = this.f3756c.authorId;
                } else {
                    str3 = "";
                }
                com.ss.android.ugc.aweme.poi.e.h.a(lVar, "stay_time", a4.a("author_id", str3).a("poi_channel", this.f3759f).a("page_type", "list").a("previous_page", this.g));
            }
            this.f3757d = -1;
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.poi.b.d dVar) {
        com.ss.android.ugc.aweme.poi.b.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f3755b, false, 66050, new Class[]{com.ss.android.ugc.aweme.poi.b.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f3755b, false, 66050, new Class[]{com.ss.android.ugc.aweme.poi.b.d.class}, Void.TYPE);
            return;
        }
        if (dVar2 != null && !TextUtils.isEmpty(dVar2.f59748c)) {
            if (dVar2.f59748c.equalsIgnoreCase(this.f3758e)) {
                if (dVar2.f59747b.booleanValue()) {
                    c();
                    return;
                }
                d();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i;
        String str14;
        String str15;
        String str16;
        HashMap<String, String> hashMap;
        String str17;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3755b, false, 66042, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3755b, false, 66042, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.b1);
        findViewById(C0906R.id.y9).setBackgroundColor(getResources().getColor(C0906R.color.a25));
        TimeLockRuler.disableStartActivityIfNeeded(this);
        if (PatchProxy.isSupport(new Object[0], this, f3755b, false, 66045, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3755b, false, 66045, new Class[0], Void.TYPE);
        } else {
            this.f3756c = (l) getIntent().getSerializableExtra("poi_bundle");
            if (this.f3756c == null) {
                this.f3756c = new l(getIntent().getStringExtra("id"));
            }
            l lVar = this.f3756c;
            if (PatchProxy.isSupport(new Object[]{lVar}, this, f3755b, false, 66044, new Class[]{l.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{lVar}, this, f3755b, false, 66044, new Class[]{l.class}, Void.TYPE);
            } else {
                if (lVar != null) {
                    str4 = lVar.from;
                } else {
                    str4 = "";
                }
                d a2 = d.a();
                d a3 = a2.a("enter_from", str4);
                if (lVar != null) {
                    str5 = lVar.awemeid;
                } else {
                    str5 = "";
                }
                d a4 = a3.a("group_id", str5);
                if (lVar != null) {
                    str6 = lVar.poiType;
                } else {
                    str6 = "";
                }
                d a5 = a4.a("poi_type", str6);
                if (lVar != null) {
                    str7 = lVar.poiId;
                } else {
                    str7 = "";
                }
                d a6 = a5.a("poi_id", str7);
                if (lVar != null) {
                    str8 = lVar.toUserId;
                } else {
                    str8 = "";
                }
                d a7 = a6.a("to_user_id", str8);
                if (lVar != null) {
                    str9 = lVar.fromUserId;
                } else {
                    str9 = "";
                }
                d a8 = a7.a("from_user_id", str9).a("poi_channel", aa.b());
                if (lVar != null) {
                    str10 = lVar.clickMethod;
                } else {
                    str10 = "";
                }
                d a9 = a8.a("enter_method", str10);
                if (lVar != null) {
                    str11 = lVar.authorId;
                } else {
                    str11 = "";
                }
                d a10 = a9.a("author_id", str11).a("city_info", aa.a());
                if (lVar != null) {
                    str12 = lVar.isCoupon;
                } else {
                    str12 = "";
                }
                d a11 = a10.a("is_coupon", str12);
                if (lVar != null) {
                    str13 = lVar.distanceInfo;
                } else {
                    str13 = "";
                }
                d a12 = a11.a("distance_info", str13);
                if (lVar != null) {
                    i = lVar.order;
                } else {
                    i = -1;
                }
                d a13 = a12.a("order", i);
                if (lVar != null) {
                    str14 = lVar.searchKeyWord;
                } else {
                    str14 = "";
                }
                d a14 = a13.a("search_keyword", str14);
                if (lVar != null) {
                    str15 = lVar.contentType;
                } else {
                    str15 = "";
                }
                d a15 = a14.a("content_type", str15);
                if (lVar != null) {
                    str16 = lVar.playMode;
                } else {
                    str16 = "";
                }
                d a16 = a15.a("play_mode", str16);
                String str18 = null;
                if (lVar != null) {
                    hashMap = lVar.forwardTypeV3Params;
                } else {
                    hashMap = null;
                }
                a16.a(hashMap);
                if (lVar != null) {
                    if (!TextUtils.isEmpty(lVar.bannerId)) {
                        a2.a("banner_id", lVar.bannerId);
                    }
                    if (!TextUtils.isEmpty(lVar.fromPoiId)) {
                        a2.a("from_poi_id", lVar.fromPoiId);
                    }
                    if (!TextUtils.isEmpty(lVar.poiLabelType)) {
                        a2.a("poi_label_type", lVar.poiLabelType);
                    }
                    if (!TextUtils.isEmpty(lVar.activityId)) {
                        a2.a("from_activity_id", lVar.activityId);
                    }
                    if (!TextUtils.isEmpty(lVar.couponId)) {
                        a2.a("from_coupon_id", lVar.couponId);
                    }
                    if (!TextUtils.isEmpty(lVar.rankIndex)) {
                        a2.a("rank_index", lVar.rankIndex);
                    }
                    if (!TextUtils.isEmpty(lVar.subClass)) {
                        a2.a("sub_class", lVar.subClass);
                    }
                    if (!TextUtils.isEmpty(lVar.districtCode)) {
                        a2.a("district_code", lVar.districtCode);
                    }
                }
                if (aa.d(str4)) {
                    if (lVar != null) {
                        str17 = lVar.logPb;
                    } else {
                        str17 = "";
                    }
                    if (TextUtils.isEmpty(str17)) {
                        ai a17 = ai.a();
                        if (lVar != null) {
                            str18 = lVar.requestId;
                        }
                        str17 = a17.a(str18);
                    }
                    a2.a("log_pb", str17);
                    if (PatchProxy.isSupport(new Object[]{lVar, "enter_poi_detail", a2}, null, com.ss.android.ugc.aweme.poi.e.h.f59792a, true, 66844, new Class[]{l.class, String.class, d.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{lVar, "enter_poi_detail", a2}, null, com.ss.android.ugc.aweme.poi.e.h.f59792a, true, 66844, new Class[]{l.class, String.class, d.class}, Void.TYPE);
                    } else {
                        if (lVar != null) {
                            if (!TextUtils.isEmpty(lVar.backendType)) {
                                a2.a("poi_backend_type", lVar.backendType);
                            }
                            com.ss.android.ugc.aweme.poi.e.h.a(lVar.cityCode, a2);
                        }
                        r.a("enter_poi_detail", aa.a(a2.f34114b));
                    }
                } else {
                    com.ss.android.ugc.aweme.poi.e.h.a(lVar, "enter_poi_detail", a2);
                }
            }
            if (this.f3756c != null) {
                str = this.f3756c.poiId;
            } else {
                str = "";
            }
            this.f3758e = str;
            if (this.f3756c != null) {
                str2 = this.f3756c.from;
            } else {
                str2 = "";
            }
            this.g = str2;
            if (this.f3756c != null) {
                str3 = this.f3756c.poiChannel;
            } else {
                str3 = "";
            }
            this.f3759f = str3;
            if (StringUtils.isEmpty(this.f3758e) || !p.b()) {
                finish();
            } else {
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                AmeBaseFragment createPoiDetailFragment = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createPoiDetailFragment(this.f3756c);
                if (createPoiDetailFragment == null) {
                    finish();
                } else {
                    createPoiDetailFragment.setUserVisibleHint(true);
                    beginTransaction.replace(C0906R.id.y9, createPoiDetailFragment, "poi_detail_fragment_tag");
                    beginTransaction.commitAllowingStateLoss();
                }
            }
        }
        ImmersionBar.with((Activity) this).fitsSystemWindows(true).statusBarDarkFont(com.ss.android.g.a.b()).init();
        bg.c(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity", "onCreate", false);
    }

    public static void a(Context context, l lVar) {
        Context context2 = context;
        l lVar2 = lVar;
        if (PatchProxy.isSupport(new Object[]{context2, lVar2}, null, f3755b, true, 66041, new Class[]{Context.class, l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, lVar2}, null, f3755b, true, 66041, new Class[]{Context.class, l.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, PoiDetailActivity.class);
        intent.putExtra("poi_bundle", lVar2);
        context2.startActivity(intent);
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), strArr, iArr}, this, f3755b, false, 66052, new Class[]{Integer.TYPE, String[].class, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), strArr, iArr}, this, f3755b, false, 66052, new Class[]{Integer.TYPE, String[].class, int[].class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.utils.permission.a.a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, Aweme aweme, String str5) {
        Context context2 = context;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        Aweme aweme2 = aweme;
        String str10 = str5;
        if (PatchProxy.isSupport(new Object[]{context2, str6, str7, str8, str9, aweme2, str10}, null, f3755b, true, 66040, new Class[]{Context.class, String.class, String.class, String.class, String.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str6, str7, str8, str9, aweme2, str10}, null, f3755b, true, 66040, new Class[]{Context.class, String.class, String.class, String.class, String.class, Aweme.class, String.class}, Void.TYPE);
            return;
        }
        a(context2, new l.a().c(str6).g(str7).f(str8).a(aweme2).a(aweme.getPoiStruct()).j(str10).i(str9).a());
    }
}
