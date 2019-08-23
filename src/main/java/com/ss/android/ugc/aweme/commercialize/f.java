package com.ss.android.ugc.aweme.commercialize;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.commercialize.model.e;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.v;
import com.ss.android.ugc.aweme.shortvideo.publish.b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\rH\u0016J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/CommercePublishServiceExtension;", "Lcom/ss/android/ugc/aweme/shortvideo/publish/IAVPublishServiceExtension;", "()V", "name", "", "getName", "()Ljava/lang/String;", "writeFieldMap", "", "photoContext", "Lcom/ss/android/ugc/aweme/photo/PhotoContext;", "fieldMap", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "videoContext", "Lcom/ss/android/ugc/aweme/shortvideo/BaseShortVideoContext;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38682a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final String f38683b = "CommercePublishServiceExtension";

    public final void a(@NotNull PhotoContext photoContext, @NotNull LinkedHashMap<String, String> linkedHashMap) {
        String str;
        PhotoContext photoContext2 = photoContext;
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        if (PatchProxy.isSupport(new Object[]{photoContext2, linkedHashMap2}, this, f38682a, false, 30254, new Class[]{PhotoContext.class, LinkedHashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoContext2, linkedHashMap2}, this, f38682a, false, 30254, new Class[]{PhotoContext.class, LinkedHashMap.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(photoContext2, "photoContext");
        Intrinsics.checkParameterIsNotNull(linkedHashMap2, "fieldMap");
        e a2 = e.a(photoContext);
        Intrinsics.checkExpressionValueIsNotNull(a2, "commercePublishModel");
        v vVar = a2.f39379f;
        if (vVar != null) {
            ShopOrderShareStruct shopOrderShareStruct = vVar.getShopOrderShareStruct();
            if (shopOrderShareStruct != null) {
                String json = m.d().toJson((Object) shopOrderShareStruct);
                Intrinsics.checkExpressionValueIsNotNull(json, "RetrofitFactory.getGson().toJson(it)");
                linkedHashMap2.put("shop_order_share", json);
            }
        }
        Map map = linkedHashMap2;
        if (a2.f39375b) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        map.put("commerce_ad_link", str);
    }

    public final void a(@NotNull BaseShortVideoContext baseShortVideoContext, @NotNull LinkedHashMap<String, String> linkedHashMap) {
        BaseShortVideoContext baseShortVideoContext2 = baseShortVideoContext;
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        if (PatchProxy.isSupport(new Object[]{baseShortVideoContext2, linkedHashMap2}, this, f38682a, false, 30253, new Class[]{BaseShortVideoContext.class, LinkedHashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseShortVideoContext2, linkedHashMap2}, this, f38682a, false, 30253, new Class[]{BaseShortVideoContext.class, LinkedHashMap.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(baseShortVideoContext2, "videoContext");
        Intrinsics.checkParameterIsNotNull(linkedHashMap2, "fieldMap");
        e a2 = e.a(baseShortVideoContext);
        if (a2.f39375b) {
            Map map = linkedHashMap2;
            map.put("commerce_ad_link", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            if (!TextUtils.isEmpty(a2.f39376c)) {
                String str = a2.f39376c;
                Intrinsics.checkExpressionValueIsNotNull(str, "commercePublishModel.commerceAdLinkTags");
                map.put("commerce_ad_link_tags", str);
            }
        } else {
            linkedHashMap2.put("commerce_ad_link", PushConstants.PUSH_TYPE_NOTIFY);
        }
        if (a.a()) {
            Intrinsics.checkExpressionValueIsNotNull(a2, "commercePublishModel");
            if (a2.f39378e) {
                linkedHashMap2.put("is_star_atlas", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            } else {
                linkedHashMap2.put("is_star_atlas", PushConstants.PUSH_TYPE_NOTIFY);
            }
        } else {
            Intrinsics.checkExpressionValueIsNotNull(a2, "commercePublishModel");
            if (a2.a() != 0) {
                linkedHashMap2.put("star_atlas_order_id", String.valueOf(a2.a()));
            }
        }
        v vVar = a2.f39379f;
        if (vVar != null) {
            ShopOrderShareStruct shopOrderShareStruct = vVar.getShopOrderShareStruct();
            if (shopOrderShareStruct != null) {
                String json = m.d().toJson((Object) shopOrderShareStruct);
                Intrinsics.checkExpressionValueIsNotNull(json, "RetrofitFactory.getGson().toJson(it)");
                linkedHashMap2.put("shop_order_share", json);
            }
        }
    }
}
