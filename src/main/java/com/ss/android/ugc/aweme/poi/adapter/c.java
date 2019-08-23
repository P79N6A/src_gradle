package com.ss.android.ugc.aweme.poi.adapter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.k;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct;
import com.ss.android.ugc.aweme.feed.model.poi.PoiOptionStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;
import com.ss.android.ugc.aweme.u.aa;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/adapter/PoiBannerMobUtil;", "", "poiSimpleBundle", "Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "fromPage", "", "poiClassCode", "", "(Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;Ljava/lang/String;I)V", "getFromPage", "()Ljava/lang/String;", "setFromPage", "(Ljava/lang/String;)V", "getPoiClassCode", "()I", "setPoiClassCode", "(I)V", "mobBannerClickEvent", "", "struct", "Lcom/ss/android/ugc/aweme/feed/model/poi/PoiClassRankBannerStruct;", "position", "mobChallengeBannerEvent", "mobRankBannerEvent", "performClick", "context", "Landroid/content/Context;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59476a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f59477b;

    /* renamed from: c  reason: collision with root package name */
    public int f59478c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.poi.c f59479d;

    public c(@Nullable com.ss.android.ugc.aweme.poi.c cVar, @NotNull String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "fromPage");
        this.f59479d = cVar;
        this.f59477b = str;
        this.f59478c = i;
    }

    public final void a(@NotNull Context context, @NotNull PoiClassRankBannerStruct poiClassRankBannerStruct, int i) {
        String str;
        String str2;
        String str3;
        Context context2 = context;
        PoiClassRankBannerStruct poiClassRankBannerStruct2 = poiClassRankBannerStruct;
        if (PatchProxy.isSupport(new Object[]{context2, poiClassRankBannerStruct2, Integer.valueOf(i)}, this, f59476a, false, 64760, new Class[]{Context.class, PoiClassRankBannerStruct.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, poiClassRankBannerStruct2, Integer.valueOf(i)}, this, f59476a, false, 64760, new Class[]{Context.class, PoiClassRankBannerStruct.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(poiClassRankBannerStruct2, "struct");
        String str4 = null;
        if (PatchProxy.isSupport(new Object[]{poiClassRankBannerStruct2, Integer.valueOf(i)}, this, f59476a, false, 64761, new Class[]{PoiClassRankBannerStruct.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiClassRankBannerStruct2, Integer.valueOf(i)}, this, f59476a, false, 64761, new Class[]{PoiClassRankBannerStruct.class, Integer.TYPE}, Void.TYPE);
        } else {
            d a2 = d.a().a("enter_from", this.f59477b).a("previous_page", this.f59477b).a("banner_id", poiClassRankBannerStruct.getBid()).a("client_order", i).a("city_info", aa.a()).a("poi_channel", this.f59478c);
            com.ss.android.ugc.aweme.poi.c cVar = this.f59479d;
            if (cVar != null) {
                str2 = cVar.getPoiId();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                com.ss.android.ugc.aweme.poi.c cVar2 = this.f59479d;
                if (cVar2 != null) {
                    str3 = cVar2.getPoiId();
                } else {
                    str3 = null;
                }
                a2.a("from_poi_id", str3);
            }
            h.a(this.f59479d, "banner_click", a2);
        }
        if (TextUtils.isEmpty(poiClassRankBannerStruct.getSchema())) {
            if (PatchProxy.isSupport(new Object[]{poiClassRankBannerStruct2}, this, f59476a, false, 64762, new Class[]{PoiClassRankBannerStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{poiClassRankBannerStruct2}, this, f59476a, false, 64762, new Class[]{PoiClassRankBannerStruct.class}, Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.poi.c cVar3 = this.f59479d;
                d a3 = d.a().a("enter_from", this.f59477b).a("city_info", aa.a()).a("enter_method", "click_leaderboard_banner").a("poi_channel", this.f59478c);
                PoiOptionStruct classOption = poiClassRankBannerStruct.getClassOption();
                Intrinsics.checkExpressionValueIsNotNull(classOption, "struct.classOption");
                h.a(cVar3, "enter_poi_leaderboard", a3.a("sub_class", classOption.getName()).a("district_code", poiClassRankBannerStruct.getDistrictCode()));
            }
            IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
            if (iBridgeService != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("poi_class_code", this.f59478c);
                bundle.putString("enter_from", "categorized_city_poi");
                bundle.putString("enter_method", "click_leaderboard_banner");
                bundle.putString("district_code", poiClassRankBannerStruct.getDistrictCode());
                iBridgeService.enterPoiRankActivity(context2, bundle);
            }
        } else if (k.a("aweme://poi/detail/:id", poiClassRankBannerStruct.getSchema())) {
            l.a aVar = new l.a();
            String schema = poiClassRankBannerStruct.getSchema();
            Intrinsics.checkExpressionValueIsNotNull(schema, "struct.schema");
            String schema2 = poiClassRankBannerStruct.getSchema();
            Intrinsics.checkExpressionValueIsNotNull(schema2, "struct.schema");
            int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) schema2, '/', 0, false, 6, (Object) null) + 1;
            if (schema != null) {
                String substring = schema.substring(lastIndexOf$default);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
                l.a p = aVar.c(substring).a(this.f59479d).i(this.f59477b).l("click_poi_banner").m(String.valueOf(this.f59478c)).p(poiClassRankBannerStruct.getBid());
                com.ss.android.ugc.aweme.poi.c cVar4 = this.f59479d;
                if (cVar4 != null) {
                    str4 = cVar4.getPoiId();
                }
                PoiDetailActivity.a(context2, p.q(str4).a());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } else {
            String schema3 = poiClassRankBannerStruct.getSchema();
            Intrinsics.checkExpressionValueIsNotNull(schema3, "struct.schema");
            if (StringsKt.contains$default((CharSequence) schema3, (CharSequence) "poi/detail", false, 2, (Object) null)) {
                l.a p2 = new l.a().c(k.b(poiClassRankBannerStruct.getSchema(), "id")).a(this.f59479d).i(this.f59477b).l("click_poi_banner").m(String.valueOf(this.f59478c)).p(poiClassRankBannerStruct.getBid());
                com.ss.android.ugc.aweme.poi.c cVar5 = this.f59479d;
                if (cVar5 != null) {
                    str4 = cVar5.getPoiId();
                }
                PoiDetailActivity.a(context2, p2.q(str4).a());
                return;
            }
            String schema4 = poiClassRankBannerStruct.getSchema();
            Intrinsics.checkExpressionValueIsNotNull(schema4, "struct.schema");
            if (StringsKt.startsWith$default(schema4, "http", false, 2, null)) {
                String schema5 = poiClassRankBannerStruct.getSchema();
                Intrinsics.checkExpressionValueIsNotNull(schema5, "struct.schema");
                if (!StringsKt.contains$default((CharSequence) schema5, (CharSequence) "title=", false, 2, (Object) null)) {
                    String schema6 = poiClassRankBannerStruct.getSchema();
                    Intrinsics.checkExpressionValueIsNotNull(schema6, "struct.schema");
                    if (StringsKt.indexOf$default((CharSequence) schema6, "?", 0, false, 6, (Object) null) != -1) {
                        poiClassRankBannerStruct2.updateSchema(poiClassRankBannerStruct.getSchema() + "&title=" + poiClassRankBannerStruct.getTitle());
                    } else {
                        poiClassRankBannerStruct2.updateSchema(poiClassRankBannerStruct.getSchema() + "?title=" + poiClassRankBannerStruct.getTitle());
                    }
                }
                com.ss.android.ugc.aweme.ag.h.a().a("aweme://webview/?url=" + Uri.encode(poiClassRankBannerStruct.getSchema()));
                return;
            }
            com.ss.android.ugc.aweme.ag.h.a().a(poiClassRankBannerStruct.getSchema());
            if (k.a("aweme://challenge/detail/:id", poiClassRankBannerStruct.getSchema())) {
                if (PatchProxy.isSupport(new Object[]{poiClassRankBannerStruct2}, this, f59476a, false, 64763, new Class[]{PoiClassRankBannerStruct.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{poiClassRankBannerStruct2}, this, f59476a, false, 64763, new Class[]{PoiClassRankBannerStruct.class}, Void.TYPE);
                    return;
                }
                d a4 = d.a().a("enter_from", this.f59477b).a("enter_method", "click_poi_banner").a("banner_id", poiClassRankBannerStruct.getBid());
                String schema7 = poiClassRankBannerStruct.getSchema();
                Intrinsics.checkExpressionValueIsNotNull(schema7, "struct.schema");
                String schema8 = poiClassRankBannerStruct.getSchema();
                Intrinsics.checkExpressionValueIsNotNull(schema8, "struct.schema");
                int lastIndexOf$default2 = StringsKt.lastIndexOf$default((CharSequence) schema8, '/', 0, false, 6, (Object) null) + 1;
                if (schema7 != null) {
                    String substring2 = schema7.substring(lastIndexOf$default2);
                    Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
                    d a5 = a4.a("tag_id", substring2).a("poi_channel", this.f59478c).a("city_info", aa.a());
                    com.ss.android.ugc.aweme.poi.c cVar6 = this.f59479d;
                    if (cVar6 != null) {
                        str = cVar6.getPoiId();
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        com.ss.android.ugc.aweme.poi.c cVar7 = this.f59479d;
                        if (cVar7 != null) {
                            str4 = cVar7.getPoiId();
                        }
                        a5.a("from_poi_id", str4);
                    }
                    h.a(this.f59479d, "enter_tag_detail", a5);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
    }
}
