package com.ss.android.ugc.aweme.commercialize.star;

import android.content.Context;
import com.bytedance.ies.dmt.ui.d.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.fe.method.BroadcastMethod;
import com.ss.android.ugc.aweme.poi.ui.publish.PoiContext;
import com.ss.android.ugc.aweme.poi.ui.publish.b;
import com.ss.android.ugc.aweme.port.in.af;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.w;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010/\u001a\u000200J\u0010\u00101\u001a\u0002002\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u0002002\u0006\u00102\u001a\u000203H\u0002J\u0010\u00105\u001a\u0002002\u0006\u00102\u001a\u000203H\u0002J\u0010\u00106\u001a\u0002002\u0006\u00102\u001a\u000203H\u0002J\b\u00107\u001a\u000200H\u0014J\b\u00108\u001a\u000200H\u0014J\u0010\u00109\u001a\u0002002\u0006\u0010:\u001a\u00020;H\u0007J\u0006\u0010<\u001a\u000200J\u0006\u0010=\u001a\u000200J\b\u0010>\u001a\u000200H\u0002R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128F@FX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020 8F@FX\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010\u0017R\u001a\u0010)\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001a\u0010,\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017¨\u0006?"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/star/StarAtlasPublishSettingItem;", "Lcom/ss/android/ugc/aweme/shortvideo/ui/PublishSettingItem;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "commerceDataContainer", "Lcom/ss/android/ugc/aweme/port/in/IPublishService$CommerceDataContainer;", "getCommerceDataContainer", "()Lcom/ss/android/ugc/aweme/port/in/IPublishService$CommerceDataContainer;", "setCommerceDataContainer", "(Lcom/ss/android/ugc/aweme/port/in/IPublishService$CommerceDataContainer;)V", "value", "", "hasStarAtlasOrder", "getHasStarAtlasOrder", "()Z", "setHasStarAtlasOrder", "(Z)V", "isChoose", "setChoose", "poiAndGoodsPublishViewHolder", "Lcom/ss/android/ugc/aweme/poi/ui/publish/PoiAndGoodsPublishViewHolder;", "getPoiAndGoodsPublishViewHolder", "()Lcom/ss/android/ugc/aweme/poi/ui/publish/PoiAndGoodsPublishViewHolder;", "setPoiAndGoodsPublishViewHolder", "(Lcom/ss/android/ugc/aweme/poi/ui/publish/PoiAndGoodsPublishViewHolder;)V", "", "starAtlasOrderId", "getStarAtlasOrderId", "()J", "setStarAtlasOrderId", "(J)V", "withStarAtlasOrderGoods", "getWithStarAtlasOrderGoods", "setWithStarAtlasOrderGoods", "withStarAtlasOrderLink", "getWithStarAtlasOrderLink", "setWithStarAtlasOrderLink", "withStarAtlasOrderPoi", "getWithStarAtlasOrderPoi", "setWithStarAtlasOrderPoi", "clearStarAtlas", "", "dealWithGoods", "data", "Lorg/json/JSONObject;", "dealWithLink", "dealWithNoComponent", "dealWithPoi", "onAttachedToWindow", "onDetachedFromWindow", "onJsBroacastReceiver", "broadCastEvent", "Lcom/ss/android/ugc/aweme/fe/method/BroadcastMethod$JsBroadCastEvent;", "setToDouyinMode", "setToI18nMode", "showStarComponentToast", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2937a;

    /* renamed from: b  reason: collision with root package name */
    boolean f2938b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private af.a f2939c;
    @Nullable
    private b j;
    private boolean k;
    private boolean l;
    private boolean m;

    @Nullable
    public final af.a getCommerceDataContainer() {
        return this.f2939c;
    }

    @Nullable
    public final b getPoiAndGoodsPublishViewHolder() {
        return this.j;
    }

    public final boolean getWithStarAtlasOrderGoods() {
        return this.k;
    }

    public final boolean getWithStarAtlasOrderLink() {
        return this.l;
    }

    public final boolean getWithStarAtlasOrderPoi() {
        return this.f2938b;
    }

    private final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2937a, false, 32051, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2937a, false, 32051, new Class[0], Void.TYPE);
            return;
        }
        e.a.a().a(getContext(), getContext().getString(C0906R.string.ccv)).a();
    }

    public final boolean getHasStarAtlasOrder() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f2937a, false, 32047, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2937a, false, 32047, new Class[0], Boolean.TYPE)).booleanValue();
        }
        af.a aVar = this.f2939c;
        if (aVar != null) {
            str = aVar.a();
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.commercialize.model.e b2 = com.ss.android.ugc.aweme.commercialize.model.e.b(str);
        Intrinsics.checkExpressionValueIsNotNull(b2, "CommercePublishModel.fro…aContainer?.commerceData)");
        return b2.f39378e;
    }

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f2937a, false, 32050, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2937a, false, 32050, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        bg.c(this);
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f2937a, false, 32052, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2937a, false, 32052, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        bg.d(this);
    }

    public final long getStarAtlasOrderId() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f2937a, false, 32044, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f2937a, false, 32044, new Class[0], Long.TYPE)).longValue();
        }
        af.a aVar = this.f2939c;
        if (aVar != null) {
            str = aVar.a();
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.commercialize.model.e b2 = com.ss.android.ugc.aweme.commercialize.model.e.b(str);
        Intrinsics.checkExpressionValueIsNotNull(b2, "CommercePublishModel.fro…aContainer?.commerceData)");
        return b2.a();
    }

    public final void setCommerceDataContainer(@Nullable af.a aVar) {
        this.f2939c = aVar;
    }

    public final void setPoiAndGoodsPublishViewHolder(@Nullable b bVar) {
        this.j = bVar;
    }

    public final void setWithStarAtlasOrderGoods(boolean z) {
        this.k = z;
    }

    public final void setWithStarAtlasOrderLink(boolean z) {
        this.l = z;
    }

    public final void setWithStarAtlasOrderPoi(boolean z) {
        this.f2938b = z;
    }

    public d(@Nullable Context context) {
        super(context);
        setDrawableLeft(2130839832);
    }

    private final void setChoose(boolean z) {
        int i;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2937a, false, 32049, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2937a, false, 32049, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.m = z;
        if (this.m) {
            if (a.a()) {
                i = C0906R.string.cd9;
            } else {
                i = C0906R.string.ccu;
            }
        } else if (a.a()) {
            i = C0906R.string.cd8;
        } else {
            i = C0906R.string.ccy;
        }
        setSubtitle(i);
    }

    public final void setHasStarAtlasOrder(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2937a, false, 32048, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2937a, false, 32048, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        af.a aVar = this.f2939c;
        if (aVar != null) {
            com.ss.android.ugc.aweme.commercialize.model.e b2 = com.ss.android.ugc.aweme.commercialize.model.e.b(aVar.a());
            Intrinsics.checkExpressionValueIsNotNull(b2, "model");
            b2.a(z);
            aVar.a(com.ss.android.ugc.aweme.commercialize.model.e.a(b2));
        }
        setChoose(z);
        if (!z || !com.ss.android.ugc.aweme.challenge.ui.header.b.a(a.b())) {
            b bVar = this.j;
            if (bVar != null) {
                bVar.d();
            }
        } else {
            b bVar2 = this.j;
            if (bVar2 != null) {
                bVar2.c();
            }
        }
    }

    public final void setStarAtlasOrderId(long j2) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f2937a, false, 32045, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f2937a, false, 32045, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        af.a aVar = this.f2939c;
        if (aVar != null) {
            com.ss.android.ugc.aweme.commercialize.model.e b2 = com.ss.android.ugc.aweme.commercialize.model.e.b(aVar.a());
            Intrinsics.checkExpressionValueIsNotNull(b2, "model");
            b2.f39377d = j2;
            aVar.a(com.ss.android.ugc.aweme.commercialize.model.e.a(b2));
        }
        if (j2 == 0) {
            z = false;
        }
        setChoose(z);
    }

    @Subscribe
    public final void onJsBroacastReceiver(@NotNull BroadcastMethod.a aVar) {
        d dVar;
        boolean z;
        d dVar2;
        JSONObject jSONObject;
        boolean z2;
        JSONObject jSONObject2;
        boolean z3;
        JSONObject jSONObject3;
        boolean z4;
        boolean z5 = true;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f2937a, false, 32053, new Class[]{BroadcastMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f2937a, false, 32053, new Class[]{BroadcastMethod.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "broadCastEvent");
        try {
            String string = aVar.f44432b.getString("eventName");
            if (string != null) {
                d dVar3 = null;
                if (!Intrinsics.areEqual((Object) string, (Object) "star_atlas_event")) {
                    string = null;
                }
                if (string != null) {
                    if (!aVar.f44432b.has("data")) {
                        string = null;
                    }
                    if (string != null) {
                        JSONObject jSONObject4 = aVar.f44432b.getJSONObject("data");
                        if (jSONObject4.has("order_id")) {
                            dVar = this;
                        } else {
                            dVar = null;
                        }
                        d dVar4 = dVar;
                        if (dVar4 != null) {
                            if (getStarAtlasOrderId() != Long.parseLong(jSONObject4.getString("order_id"))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                dVar4 = null;
                            }
                            if (dVar4 != null) {
                                if (!jSONObject4.has("component_type")) {
                                    jSONObject4.put("component_type", 0);
                                }
                                switch (jSONObject4.getInt("component_type")) {
                                    case 0:
                                        Intrinsics.checkExpressionValueIsNotNull(jSONObject4, "data");
                                        if (!PatchProxy.isSupport(new Object[]{jSONObject4}, this, f2937a, false, 32054, new Class[]{JSONObject.class}, Void.TYPE)) {
                                            if (jSONObject4.has("order_id")) {
                                                dVar2 = this;
                                            } else {
                                                dVar2 = null;
                                            }
                                            d dVar5 = dVar2;
                                            if (dVar5 != null) {
                                                if (!this.f2938b && !this.k) {
                                                    if (!this.l) {
                                                        z5 = false;
                                                    }
                                                }
                                                if (!z5) {
                                                    dVar5 = null;
                                                }
                                                if (dVar5 != null) {
                                                    this.f2938b = false;
                                                    this.k = false;
                                                    this.l = false;
                                                    b bVar = this.j;
                                                    if (bVar != null) {
                                                        bVar.f();
                                                    }
                                                    b bVar2 = this.j;
                                                    if (bVar2 != null) {
                                                        bVar2.g();
                                                    }
                                                    b bVar3 = this.j;
                                                    if (bVar3 != null) {
                                                        bVar3.e();
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            PatchProxy.accessDispatch(new Object[]{jSONObject4}, this, f2937a, false, 32054, new Class[]{JSONObject.class}, Void.TYPE);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        Intrinsics.checkExpressionValueIsNotNull(jSONObject4, "data");
                                        if (!PatchProxy.isSupport(new Object[]{jSONObject4}, this, f2937a, false, 32057, new Class[]{JSONObject.class}, Void.TYPE)) {
                                            if (jSONObject4.has("link_info")) {
                                                jSONObject = jSONObject4;
                                            } else {
                                                jSONObject = null;
                                            }
                                            if (jSONObject != null) {
                                                JSONObject jSONObject5 = jSONObject.getJSONObject("link_info");
                                                if (!jSONObject5.has("link_title") || !jSONObject5.has("link_data")) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                                if (!z2) {
                                                    jSONObject = null;
                                                }
                                                if (jSONObject != null) {
                                                    a();
                                                    JSONObject jSONObject6 = jSONObject.getJSONObject("link_info");
                                                    this.f2938b = false;
                                                    this.k = false;
                                                    this.l = true;
                                                    b bVar4 = this.j;
                                                    if (bVar4 != null) {
                                                        bVar4.g();
                                                    }
                                                    b bVar5 = this.j;
                                                    if (bVar5 != null) {
                                                        bVar5.e();
                                                    }
                                                    b bVar6 = this.j;
                                                    if (bVar6 != null) {
                                                        bVar6.f();
                                                    }
                                                    b bVar7 = this.j;
                                                    if (bVar7 != null) {
                                                        bVar7.a(jSONObject6.getString("link_data"));
                                                    }
                                                    b bVar8 = this.j;
                                                    if (bVar8 != null) {
                                                        bVar8.c(false);
                                                    }
                                                    b bVar9 = this.j;
                                                    if (bVar9 != null) {
                                                        bVar9.b(false);
                                                    }
                                                    b bVar10 = this.j;
                                                    if (bVar10 != null) {
                                                        bVar10.a(false);
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            PatchProxy.accessDispatch(new Object[]{jSONObject4}, this, f2937a, false, 32057, new Class[]{JSONObject.class}, Void.TYPE);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        Intrinsics.checkExpressionValueIsNotNull(jSONObject4, "data");
                                        if (!PatchProxy.isSupport(new Object[]{jSONObject4}, this, f2937a, false, 32055, new Class[]{JSONObject.class}, Void.TYPE)) {
                                            if (jSONObject4.has("poiInfo")) {
                                                jSONObject2 = jSONObject4;
                                            } else {
                                                jSONObject2 = null;
                                            }
                                            if (jSONObject2 != null) {
                                                JSONObject jSONObject7 = jSONObject2.getJSONObject("poiInfo");
                                                if (jSONObject7 != null) {
                                                    if (!jSONObject7.has("offline_store_info")) {
                                                        jSONObject7 = null;
                                                    }
                                                    if (jSONObject7 != null) {
                                                        JSONObject jSONObject8 = jSONObject7.getJSONObject("offline_store_info");
                                                        if (jSONObject8 != null) {
                                                            if (!jSONObject8.has("poi_id") || !jSONObject8.has("poi_name")) {
                                                                z3 = false;
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            if (!z3) {
                                                                jSONObject8 = null;
                                                            }
                                                            if (jSONObject8 != null) {
                                                                a();
                                                                PoiContext poiContext = new PoiContext();
                                                                poiContext.mSelectPoiId = jSONObject8.getString("poi_id");
                                                                poiContext.mSelectPoiName = jSONObject8.getString("poi_name");
                                                                if (jSONObject8.has("poi_longitude") && jSONObject8.has("poi_latitude")) {
                                                                    String string2 = jSONObject8.getString("poi_longitude");
                                                                    Intrinsics.checkExpressionValueIsNotNull(string2, "it.getString(\"poi_longitude\")");
                                                                    poiContext.mShootPoiLng = Double.parseDouble(string2);
                                                                    String string3 = jSONObject8.getString("poi_latitude");
                                                                    Intrinsics.checkExpressionValueIsNotNull(string3, "it.getString(\"poi_latitude\")");
                                                                    poiContext.mShootPoiLat = Double.parseDouble(string3);
                                                                }
                                                                b bVar11 = this.j;
                                                                if (bVar11 != null) {
                                                                    bVar11.g();
                                                                }
                                                                b bVar12 = this.j;
                                                                if (bVar12 != null) {
                                                                    bVar12.e();
                                                                }
                                                                b bVar13 = this.j;
                                                                if (bVar13 != null) {
                                                                    bVar13.f();
                                                                }
                                                                b bVar14 = this.j;
                                                                if (bVar14 != null) {
                                                                    bVar14.a(poiContext);
                                                                }
                                                                this.f2938b = true;
                                                                this.k = false;
                                                                this.l = false;
                                                                b bVar15 = this.j;
                                                                if (bVar15 != null) {
                                                                    bVar15.c(false);
                                                                }
                                                                b bVar16 = this.j;
                                                                if (bVar16 != null) {
                                                                    bVar16.b(false);
                                                                }
                                                                b bVar17 = this.j;
                                                                if (bVar17 != null) {
                                                                    bVar17.a(false);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            PatchProxy.accessDispatch(new Object[]{jSONObject4}, this, f2937a, false, 32055, new Class[]{JSONObject.class}, Void.TYPE);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        Intrinsics.checkExpressionValueIsNotNull(jSONObject4, "data");
                                        if (!PatchProxy.isSupport(new Object[]{jSONObject4}, this, f2937a, false, 32056, new Class[]{JSONObject.class}, Void.TYPE)) {
                                            if (jSONObject4.has("goods_info")) {
                                                jSONObject3 = jSONObject4;
                                            } else {
                                                jSONObject3 = null;
                                            }
                                            if (jSONObject3 != null) {
                                                JSONObject jSONObject9 = jSONObject3.getJSONObject("goods_info");
                                                if (!jSONObject9.has("draft_id") || !jSONObject9.has(PushConstants.TITLE)) {
                                                    z4 = false;
                                                } else {
                                                    z4 = true;
                                                }
                                                if (!z4) {
                                                    jSONObject3 = null;
                                                }
                                                if (jSONObject3 != null) {
                                                    a();
                                                    JSONObject jSONObject10 = jSONObject3.getJSONObject("goods_info");
                                                    this.f2938b = false;
                                                    this.k = true;
                                                    this.l = false;
                                                    b bVar18 = this.j;
                                                    if (bVar18 != null) {
                                                        bVar18.g();
                                                    }
                                                    b bVar19 = this.j;
                                                    if (bVar19 != null) {
                                                        bVar19.e();
                                                    }
                                                    b bVar20 = this.j;
                                                    if (bVar20 != null) {
                                                        bVar20.f();
                                                    }
                                                    b bVar21 = this.j;
                                                    if (bVar21 != null) {
                                                        bVar21.a(new BusinessGoodsPublishModel(jSONObject10.getString("draft_id"), jSONObject10.getString(PushConstants.TITLE)));
                                                    }
                                                    b bVar22 = this.j;
                                                    if (bVar22 != null) {
                                                        bVar22.c(false);
                                                    }
                                                    b bVar23 = this.j;
                                                    if (bVar23 != null) {
                                                        bVar23.b(false);
                                                    }
                                                    b bVar24 = this.j;
                                                    if (bVar24 != null) {
                                                        bVar24.a(false);
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            PatchProxy.accessDispatch(new Object[]{jSONObject4}, this, f2937a, false, 32056, new Class[]{JSONObject.class}, Void.TYPE);
                                            break;
                                        }
                                        break;
                                }
                                if (jSONObject4.has("order_id")) {
                                    dVar3 = this;
                                }
                                if (dVar3 != null) {
                                    setStarAtlasOrderId(Long.parseLong(jSONObject4.getString("order_id")));
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
