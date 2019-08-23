package com.ss.android.ugc.aweme.poi.ui.publish;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.commercialize.link.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.c;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.IPOIService;
import com.ss.android.ugc.aweme.poi.e.e;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.ay;
import com.ss.android.ugc.aweme.poi.model.az;
import com.ss.android.ugc.aweme.poi.ui.publish.SpeedRecommendPoiAdapter;
import com.ss.android.ugc.aweme.port.in.af;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.shortvideo.edit.v;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.j;
import com.ss.android.ugc.aweme.shortvideo.ui.k;
import com.ss.android.ugc.aweme.shortvideo.ui.x;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b implements SpeedRecommendPoiAdapter.a, l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60849a;
    private a A;
    private v B;
    private String C;

    /* renamed from: b  reason: collision with root package name */
    k f60850b;

    /* renamed from: c  reason: collision with root package name */
    j f60851c;

    /* renamed from: d  reason: collision with root package name */
    com.ss.android.ugc.aweme.shortvideo.ui.a f60852d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    d f60853e;

    /* renamed from: f  reason: collision with root package name */
    public String f60854f = "";
    public String g = "";
    public String h;
    public boolean i;
    public PoiContext j;
    BusinessGoodsPublishModel k;
    String l;
    @Nullable
    public com.ss.android.ugc.aweme.draft.a.d m;
    public com.ss.android.ugc.aweme.commercialize.star.d n;
    private Fragment o;
    private LinearLayout p;
    private AVPublishContentType q;
    private x r;
    private LinearLayout s;
    private n t;
    private MentionEditText u;
    private List<az> v;
    private m w;
    private boolean x;
    private boolean y;
    private boolean z;

    public interface a {
        void a();
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f60849a, false, 66629, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f60849a, false, 66629, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z2) {
            this.f60850b.setAlpha(1.0f);
            this.f60850b.setEnable(true);
        } else {
            this.f60850b.setAlpha(0.5f);
            this.s.setVisibility(8);
            this.f60850b.setEnable(false);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f60849a, false, 66632, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f60849a, false, 66632, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f60853e != null) {
            this.f60853e.setLinkData(str);
        }
    }

    public final void a(BusinessGoodsPublishModel businessGoodsPublishModel) {
        if (PatchProxy.isSupport(new Object[]{businessGoodsPublishModel}, this, f60849a, false, 66638, new Class[]{BusinessGoodsPublishModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{businessGoodsPublishModel}, this, f60849a, false, 66638, new Class[]{BusinessGoodsPublishModel.class}, Void.TYPE);
        } else if (businessGoodsPublishModel != null) {
            this.k = businessGoodsPublishModel;
            this.f60852d.setBusinessGoodsInfo(businessGoodsPublishModel);
            this.f60852d.a(false);
        }
    }

    public final void a(PoiContext poiContext) {
        if (PatchProxy.isSupport(new Object[]{poiContext}, this, f60849a, false, 66642, new Class[]{PoiContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiContext}, this, f60849a, false, 66642, new Class[]{PoiContext.class}, Void.TYPE);
        } else if (this.z) {
            this.j = poiContext;
            if (p.b() && e.l()) {
                if (poiContext != null && !TextUtils.isEmpty(poiContext.mShootPoiId)) {
                    this.u.setHint(C0906R.string.bnj);
                }
                if (m()) {
                    this.f60851c.setVisibility(0);
                    this.f60851c.setPoiActivity(poiContext);
                    f();
                    b(false);
                    return;
                }
                if (poiContext != null && !TextUtils.isEmpty(poiContext.mSelectPoiId)) {
                    this.f60850b.setVisibility(0);
                    PoiStruct poiStruct = new PoiStruct();
                    poiStruct.poiId = poiContext.mSelectPoiId;
                    poiStruct.poiName = poiContext.mSelectPoiName;
                    a(poiStruct);
                    f();
                    b(false);
                }
                if (!i() && !j() && !k()) {
                    s();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2, String str3, String str4, String str5, PoiStruct poiStruct) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        PoiStruct poiStruct2 = poiStruct;
        if (PatchProxy.isSupport(new Object[]{str6, str7, str8, str9, str10, poiStruct2}, this, f60849a, false, 66648, new Class[]{String.class, String.class, String.class, String.class, String.class, PoiStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str6, str7, str8, str9, str10, poiStruct2}, this, f60849a, false, 66648, new Class[]{String.class, String.class, String.class, String.class, String.class, PoiStruct.class}, Void.TYPE);
            return;
        }
        this.C = str6;
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
        a2.a("enter_from", "edit_page").a("poi_type", String.valueOf(poiStruct2.iconType)).a("poi_id", poiStruct2.poiId).a("enter_method", str6).a("content_type", this.l).a("log_pb", str9).a("order", str8).a("key_word", str7).a("is_media_location", poiStruct.isCandidate()).a("distance_info", poiStruct.getDistance()).a("search_region_type", str10);
        h.a(poiStruct2, "choose_poi", a2);
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.f.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f60849a, false, 66652, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f60849a, false, 66652, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            this.k = aVar.f67632a;
            this.f60852d.setBusinessGoodsInfo(this.k);
            this.f60852d.a(false);
        }
    }

    public final boolean o() {
        if (this.k != null) {
            return true;
        }
        return false;
    }

    public final String p() {
        return this.k.draftId;
    }

    public final boolean m() {
        if (this.j == null || this.j.mPoiActivity == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public Activity a() {
        if (!PatchProxy.isSupport(new Object[0], this, f60849a, false, 66621, new Class[0], Activity.class)) {
            return this.o.getActivity();
        }
        return (Activity) PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66621, new Class[0], Activity.class);
    }

    /* access modifiers changed from: package-private */
    public Context b() {
        if (!PatchProxy.isSupport(new Object[0], this, f60849a, false, 66622, new Class[0], Context.class)) {
            return this.o.getContext();
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66622, new Class[0], Context.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66625, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66625, new Class[0], Void.TYPE);
            return;
        }
        this.u.d();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66626, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66626, new Class[0], Void.TYPE);
            return;
        }
        this.f60850b.setLocation(null);
        a((PoiContext) null);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66628, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66628, new Class[0], Void.TYPE);
            return;
        }
        if (this.f60853e != null) {
            this.f60853e.setLinkData("");
        }
        c(true);
    }

    public final boolean h() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66633, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66633, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (com.ss.android.g.a.a() && this.n != null && this.n.getHasStarAtlasOrder()) {
            z2 = true;
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66634, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66634, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.n != null && this.n.getWithStarAtlasOrderPoi()) {
            z2 = true;
        }
        return z2;
    }

    public final boolean j() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66635, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66635, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.n != null && this.n.getWithStarAtlasOrderGoods()) {
            z2 = true;
        }
        return z2;
    }

    public final boolean k() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66636, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66636, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.n != null && this.n.getWithStarAtlasOrderLink()) {
            z2 = true;
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        if (!PatchProxy.isSupport(new Object[0], this, f60849a, false, 66651, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.utils.permission.a.a(b(), af.f2626c);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66651, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66627, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66627, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            com.ss.android.ugc.aweme.shortvideo.util.h.a(this.k.videoPath);
        }
        this.f60852d.setBusinessGoodsInfo(new BusinessGoodsPublishModel("", ""));
        this.k = null;
        b(true);
    }

    public final String n() {
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66644, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66644, new Class[0], String.class);
        } else if (m()) {
            return PoiContext.serializeToStr(this.j);
        } else {
            if (!TextUtils.isEmpty(this.f60850b.getPoiId())) {
                if (this.j == null) {
                    this.j = new PoiContext();
                }
                this.j.mSelectPoiId = this.f60850b.getPoiId();
                this.j.mSelectPoiName = this.f60850b.getPoiName();
            } else if (this.j != null) {
                this.j.mSelectPoiId = "";
                this.j.mSelectPoiName = "";
            }
            return PoiContext.serializeToStr(this.j);
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66647, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66647, new Class[0], Void.TYPE);
            return;
        }
        IPOIService iPOIService = (IPOIService) ServiceManager.get().getService(IPOIService.class);
        if (iPOIService != null) {
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(this.h)) {
                bundle.putString("candidateloc", this.h);
            }
            bundle.putBoolean("enable_global_search", this.x);
            bundle.putBoolean("is_over_sea", this.y);
            iPOIService.getPOISearchDialog(a(), bundle, new i(this)).show();
            r.onEvent(MobClick.obtain().setEventName("add_poi").setLabelName("edit_page"));
        }
    }

    private void s() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66645, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66645, new Class[0], Void.TYPE);
            return;
        }
        this.f60850b.setVisibility(0);
        com.ss.android.ugc.aweme.poi.a f2 = af.a((Context) com.ss.android.ugc.aweme.app.k.a()).f();
        af.a(com.ss.android.ugc.aweme.base.utils.d.a()).d();
        this.t = new n(b());
        this.t.setOnItemClick(this);
        this.w = new m();
        this.w.a(this);
        if (f2 != null) {
            String[] a2 = p.a(f2);
            this.g = a2[0];
            this.f60854f = a2[1];
        }
        m mVar = this.w;
        Object[] objArr = new Object[3];
        objArr[0] = this.f60854f;
        objArr[1] = this.g;
        if (this.m == null) {
            str = "";
        } else {
            str = this.m.getStickerPoi().getDoorplateLevelId();
        }
        objArr[2] = str;
        mVar.a(objArr);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66624, new Class[0], Void.TYPE);
            return;
        }
        this.u.setStarAtlasMentionTextColor(b().getResources().getColor(C0906R.color.a51));
        MentionEditText mentionEditText = this.u;
        String b2 = com.ss.android.ugc.aweme.commercialize.star.a.b();
        if (PatchProxy.isSupport(new Object[]{1, b2, "", (byte) 1}, mentionEditText, MentionEditText.f76487d, false, 89717, new Class[]{Integer.TYPE, String.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            MentionEditText mentionEditText2 = mentionEditText;
            ((Boolean) PatchProxy.accessDispatch(new Object[]{1, b2, "", (byte) 1}, mentionEditText2, MentionEditText.f76487d, false, 89717, new Class[]{Integer.TYPE, String.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else {
            mentionEditText.a(1, b2, "", "", true);
        }
    }

    public final Map<String, String> l() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66643, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66643, new Class[0], Map.class);
        }
        HashMap hashMap = new HashMap();
        if (this.i) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        hashMap.put("poi_campaign_show", str);
        PoiStruct poiStruct = this.f60850b.getPoiStruct();
        if (poiStruct != null) {
            hashMap.put("poi_id", poiStruct.getPoiId());
            hashMap.put("is_media_location", poiStruct.isCandidate());
            hashMap.put("distance_info", poiStruct.getDistance());
            hashMap.put("poi_backend_type", poiStruct.getBackendTypeCode());
            String cityCode = poiStruct.getCityCode();
            if (!TextUtils.isEmpty(cityCode)) {
                hashMap.put("poi_city", cityCode);
                if (cityCode.equalsIgnoreCase(c.d())) {
                    str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str2 = PushConstants.PUSH_TYPE_NOTIFY;
                }
                hashMap.put("poi_device_samecity", str2);
            }
            if (!TextUtils.isEmpty(this.C)) {
                hashMap.put("poi_enter_method", this.C);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public String a(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60849a, false, 66623, new Class[]{Integer.TYPE}, String.class)) {
            return this.o.getString(i2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60849a, false, 66623, new Class[]{Integer.TYPE}, String.class);
    }

    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f60849a, false, 66641, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f60849a, false, 66641, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        bundle2.putSerializable("poiStruct", this.f60850b.getPoiStruct());
    }

    public final void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f60849a, false, 66631, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f60849a, false, 66631, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f60853e != null) {
            if (z2) {
                this.f60853e.setAlpha(1.0f);
                this.f60853e.setEnable(true);
                return;
            }
            this.f60853e.setAlpha(0.5f);
            this.f60853e.setEnable(false);
        }
    }

    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f60849a, false, 66640, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f60849a, false, 66640, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        this.f60850b.setLocation((PoiStruct) bundle2.getSerializable("poiStruct"));
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f60849a, false, 66654, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f60849a, false, 66654, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.videoPath = str;
            com.ss.android.ugc.aweme.shortvideo.util.h.a(this.k);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(PoiStruct poiStruct) {
        if (PatchProxy.isSupport(new Object[]{poiStruct}, this, f60849a, false, 66649, new Class[]{PoiStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiStruct}, this, f60849a, false, 66649, new Class[]{PoiStruct.class}, Void.TYPE);
            return;
        }
        this.f60850b.setLocation(poiStruct);
        if (this.A != null) {
            this.A.a();
        }
        if (this.s.getVisibility() == 0 && this.t != null) {
            this.t.a(poiStruct, this.v);
        }
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f60849a, false, 66630, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f60849a, false, 66630, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z2) {
            this.f60852d.setAlpha(1.0f);
            this.f60852d.setEnable(true);
        } else {
            this.f60852d.setAlpha(0.5f);
            this.f60852d.setEnable(false);
        }
    }

    public final void a(ay ayVar) {
        String str;
        boolean z2;
        int i2;
        if (PatchProxy.isSupport(new Object[]{ayVar}, this, f60849a, false, 66650, new Class[]{ay.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ayVar}, this, f60849a, false, 66650, new Class[]{ay.class}, Void.TYPE);
        } else if (ayVar != null) {
            this.x = ayVar.h;
            this.y = ayVar.i;
            if (ayVar.g != null) {
                this.i = true;
                this.f60850b.a(ayVar.g.getActivityUrl());
            }
            if (!CollectionUtils.isEmpty(ayVar.f59904b)) {
                if (this.f60850b.i) {
                    this.s.setVisibility(0);
                }
                if (this.j == null || !this.j.hasRecommendPoi(this.g, this.f60854f)) {
                    str = null;
                } else {
                    str = this.j.mShootPoiId;
                }
                this.v = new ArrayList();
                if (this.m == null || this.m.isCancelSelect()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (TextUtils.isEmpty(str)) {
                    i2 = 6;
                } else {
                    i2 = 5;
                }
                PoiStruct poiStruct = null;
                int i3 = 0;
                for (PoiStruct next : ayVar.f59904b) {
                    if (i3 >= i2) {
                        break;
                    }
                    if (!next.getPoiId().equalsIgnoreCase(str)) {
                        az azVar = new az();
                        azVar.f59909a = next;
                        azVar.f59910b = false;
                        azVar.f59911c = ayVar.f59908f;
                        azVar.f59912d = i3;
                        azVar.f59913e = false;
                        if (z2 && poiStruct == null && next.isTopRecommend) {
                            poiStruct = next;
                        }
                        this.v.add(azVar);
                    }
                    i3++;
                }
                if (!TextUtils.isEmpty(str)) {
                    PoiStruct poiStruct2 = new PoiStruct();
                    poiStruct2.poiId = this.j.mShootPoiId;
                    poiStruct2.poiName = this.j.mShootPoiName;
                    poiStruct2.poiLatitude = String.valueOf(this.j.mShootPoiLat);
                    poiStruct2.poiLongitude = String.valueOf(this.j.mShootPoiLng);
                    az azVar2 = new az();
                    azVar2.f59909a = poiStruct2;
                    azVar2.f59910b = false;
                    azVar2.f59911c = ayVar.f59908f;
                    azVar2.f59912d = -1;
                    azVar2.f59913e = true;
                    this.v.add(0, azVar2);
                }
                this.t.setData(this.v);
                this.s.removeAllViews();
                this.s.addView(this.t);
                if (this.f60850b.getVisibility() == 0) {
                    if (!TextUtils.isEmpty(this.f60850b.getPoiId()) && !TextUtils.isEmpty(this.f60850b.getPoiName())) {
                        PoiStruct poiStruct3 = new PoiStruct();
                        poiStruct3.poiId = this.f60850b.getPoiId();
                        poiStruct3.poiName = this.f60850b.getPoiName();
                        a(poiStruct3);
                    } else if (poiStruct != null) {
                        a(poiStruct);
                        this.m.setCancelSelect(true);
                    }
                }
            }
        }
    }

    public final void a(az azVar, boolean z2) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{azVar, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f60849a, false, 66646, new Class[]{az.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{azVar, Byte.valueOf(z2)}, this, f60849a, false, 66646, new Class[]{az.class, Boolean.TYPE}, Void.TYPE);
        } else if (this.f60852d.f70735b) {
            UIUtils.displayToast(b(), a((int) C0906R.string.yj));
        } else if (z2) {
            q();
            if (r()) {
                str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str2 = PushConstants.PUSH_TYPE_NOTIFY;
            }
            new com.ss.android.ugc.aweme.u.b().a("video_post_page").b(str2).c(this.l).e();
        } else if (azVar == null) {
            a((PoiStruct) null);
        } else {
            a(azVar.f59909a);
            if (azVar.f59913e) {
                str = "poi_shoot";
            } else {
                str = "recommend_poi";
            }
            String str3 = str;
            a(str3, "", String.valueOf(azVar.f59912d), ai.a().a(azVar.f59911c), "", azVar.f59909a);
        }
    }

    public b(Fragment fragment, LinearLayout linearLayout, AVPublishContentType aVPublishContentType, boolean z2, v vVar, a aVar, boolean z3) {
        int i2;
        k kVar;
        int i3;
        boolean z4;
        LinearLayout linearLayout2;
        com.ss.android.ugc.aweme.shortvideo.ui.a aVar2;
        j jVar;
        x xVar;
        d dVar;
        Fragment fragment2 = fragment;
        boolean z5 = z2;
        v vVar2 = vVar;
        this.o = fragment2;
        this.p = linearLayout;
        this.q = aVPublishContentType;
        this.A = aVar;
        this.l = aVPublishContentType.getContentType();
        this.B = vVar2;
        this.z = z3;
        this.u = (MentionEditText) fragment.getView().findViewById(C0906R.id.a92);
        com.ss.android.ugc.aweme.commercialize.model.d dVar2 = null;
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66655, new Class[0], k.class)) {
            i2 = -1;
            kVar = (k) PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66655, new Class[0], k.class);
        } else {
            i2 = -1;
            kVar = new k(this.p.getContext(), null);
            this.p.addView(kVar, new LinearLayout.LayoutParams(-1, (int) UIUtils.dip2Px(this.p.getContext(), 52.0f)));
            kVar.setGravity(16);
            kVar.setOrientation(0);
            kVar.setVisibility(8);
        }
        this.f60850b = kVar;
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66657, new Class[0], LinearLayout.class)) {
            z4 = true;
            i3 = -2;
            linearLayout2 = (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66657, new Class[0], LinearLayout.class);
        } else {
            z4 = true;
            i3 = -2;
            linearLayout2 = new LinearLayout(this.p.getContext());
            this.p.addView(linearLayout2, new LinearLayout.LayoutParams(i2, -2));
            linearLayout2.setOrientation(1);
            linearLayout2.setPadding(0, 0, 0, (int) UIUtils.dip2Px(this.p.getContext(), 10.0f));
            linearLayout2.setVisibility(8);
        }
        this.s = linearLayout2;
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66658, new Class[0], com.ss.android.ugc.aweme.shortvideo.ui.a.class)) {
            aVar2 = (com.ss.android.ugc.aweme.shortvideo.ui.a) PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66658, new Class[0], com.ss.android.ugc.aweme.shortvideo.ui.a.class);
        } else {
            aVar2 = new com.ss.android.ugc.aweme.shortvideo.ui.a(this.p.getContext(), null);
            this.p.addView(aVar2, new LinearLayout.LayoutParams(i2, (int) UIUtils.dip2Px(this.p.getContext(), 52.0f)));
            aVar2.setGravity(16);
            aVar2.setOrientation(0);
        }
        this.f60852d = aVar2;
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66656, new Class[0], j.class)) {
            jVar = (j) PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66656, new Class[0], j.class);
        } else {
            jVar = new j(this.p.getContext());
            this.p.addView(jVar, new LinearLayout.LayoutParams(i2, i3));
            jVar.setVisibility(8);
        }
        this.f60851c = jVar;
        if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66659, new Class[0], x.class)) {
            xVar = (x) PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66659, new Class[0], x.class);
        } else {
            xVar = new x(this.p.getContext());
            this.p.addView(xVar, new LinearLayout.LayoutParams(i2, (int) UIUtils.dip2Px(this.p.getContext(), 52.0f)));
            xVar.setVisibility(8);
        }
        this.r = xVar;
        if (com.ss.android.ugc.aweme.commercialize.link.a.a()) {
            if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66660, new Class[0], d.class)) {
                dVar = (d) PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66660, new Class[0], d.class);
            } else if (this.q == AVPublishContentType.Photo) {
                dVar = null;
            } else {
                dVar = new d(this.p.getContext());
                this.p.addView(dVar, new LinearLayout.LayoutParams(i2, (int) UIUtils.dip2Px(this.p.getContext(), 52.0f)));
                dVar.setGravity(16);
                dVar.setOrientation(0);
                dVar.setVisibility(8);
            }
            this.f60853e = dVar;
            if (this.f60853e != null) {
                this.f60853e.setVisibility(0);
                this.f60853e.setOnClickListener(new c(this));
                com.ss.android.ugc.aweme.commercialize.link.c.a("video_post_page");
            }
        } else {
            this.f60853e = null;
        }
        if (this.f60853e != null) {
            this.f60853e.setVisibility(0);
            if (fragment2 instanceof com.ss.android.ugc.aweme.commercialize.model.d) {
                dVar2 = (com.ss.android.ugc.aweme.commercialize.model.d) fragment2;
            } else if (fragment2 instanceof af.a) {
                final af.a aVar3 = (af.a) fragment2;
                dVar2 = new com.ss.android.ugc.aweme.commercialize.model.d() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f60855a;

                    public final String a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f60855a, false, 66669, new Class[0], String.class)) {
                            return aVar3.a();
                        }
                        return (String) PatchProxy.accessDispatch(new Object[0], this, f60855a, false, 66669, new Class[0], String.class);
                    }

                    public final boolean b() {
                        if (!PatchProxy.isSupport(new Object[0], this, f60855a, false, 66671, new Class[0], Boolean.TYPE)) {
                            return aVar3.b();
                        }
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60855a, false, 66671, new Class[0], Boolean.TYPE)).booleanValue();
                    }

                    public final void a(String str) {
                        String str2 = str;
                        if (PatchProxy.isSupport(new Object[]{str2}, this, f60855a, false, 66670, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str2}, this, f60855a, false, 66670, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        aVar3.a(str2);
                    }
                };
            }
            if (dVar2 != null) {
                this.f60853e.setCommerceDataContainer(dVar2);
            }
        }
        this.f60850b.setStateChangeCB(new d(this));
        this.f60852d.setStateChangeCB(new e(this));
        boolean hasCommerceVideoRights = com.ss.android.ugc.aweme.account.d.a().hasCommerceVideoRights();
        if (vVar2 != null || com.ss.android.ugc.aweme.i18n.c.a() || !hasCommerceVideoRights || !((Boolean) com.ss.android.ugc.aweme.app.x.a().N().c()).booleanValue()) {
            this.f60852d.setVisibility(8);
        } else {
            this.f60852d.setVisibility(0);
        }
        if (vVar2 != null) {
            a(false);
            this.f60852d.f70735b = z4;
            this.r.setVisibility(0);
            this.r.setTitle(vVar.getTitle());
            String str = (String) SharePrefCache.inst().getOrderShareIntroUrl().c();
            if (!TextUtils.isEmpty(str)) {
                this.r.setOnClickListener(new f(this, str));
            }
        }
        an<Boolean> showAddBusinessGoodsDot = SharePrefCache.inst().getShowAddBusinessGoodsDot();
        if (showAddBusinessGoodsDot == null || ((Boolean) showAddBusinessGoodsDot.c()).booleanValue()) {
            this.f60852d.a(z4);
        } else {
            this.f60852d.a(false);
        }
        this.f60852d.setOnClickListener(new g(this, z5));
        this.f60850b.setOnClickListener(new h(this, z5));
        if (z5) {
            if (PatchProxy.isSupport(new Object[0], this, f60849a, false, 66637, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60849a, false, 66637, new Class[0], Void.TYPE);
                return;
            }
            b(false);
            a(false);
        }
    }
}
