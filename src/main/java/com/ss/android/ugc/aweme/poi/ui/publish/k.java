package com.ss.android.ugc.aweme.poi.ui.publish;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.publish.b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\rH\u0016J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\rH\u0016J4\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\rH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/publish/PoiPublishServiceExtension;", "Lcom/ss/android/ugc/aweme/shortvideo/publish/IAVPublishServiceExtension;", "()V", "name", "", "getName", "()Ljava/lang/String;", "writeFieldMap", "", "photoContext", "Lcom/ss/android/ugc/aweme/photo/PhotoContext;", "fieldMap", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "videoContext", "Lcom/ss/android/ugc/aweme/shortvideo/BaseShortVideoContext;", "writePoiContext", "poiContext", "Lcom/ss/android/ugc/aweme/poi/ui/publish/PoiContext;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class k implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60877a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final String f60878b = "PoiPublishServiceExtension";

    private final void a(PoiContext poiContext, LinkedHashMap<String, String> linkedHashMap) {
        PoiContext poiContext2 = poiContext;
        if (PatchProxy.isSupport(new Object[]{poiContext2, linkedHashMap}, this, f60877a, false, 66681, new Class[]{PoiContext.class, LinkedHashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiContext2, linkedHashMap}, this, f60877a, false, 66681, new Class[]{PoiContext.class, LinkedHashMap.class}, Void.TYPE);
            return;
        }
        if (poiContext2.mPoiActivity != null) {
            Map map = linkedHashMap;
            map.put("activity_id", poiContext2.mPoiActivity.getId());
            if (!TextUtils.isEmpty(poiContext2.mShootPoiId)) {
                String str = poiContext2.mShootPoiId;
                Intrinsics.checkExpressionValueIsNotNull(str, "poiContext.mShootPoiId");
                map.put("poi_id", str);
            }
            if (!TextUtils.isEmpty(poiContext2.mShootPoiName)) {
                String str2 = poiContext2.mShootPoiName;
                Intrinsics.checkExpressionValueIsNotNull(str2, "poiContext.mShootPoiName");
                map.put("poi_name", str2);
            }
        } else {
            if (!TextUtils.isEmpty(poiContext2.mSelectPoiId)) {
                String str3 = poiContext2.mSelectPoiId;
                Intrinsics.checkExpressionValueIsNotNull(str3, "poiContext.mSelectPoiId");
                linkedHashMap.put("poi_id", str3);
            }
            if (!TextUtils.isEmpty(poiContext2.mSelectPoiName)) {
                String str4 = poiContext2.mSelectPoiName;
                Intrinsics.checkExpressionValueIsNotNull(str4, "poiContext.mSelectPoiName");
                linkedHashMap.put("poi_name", str4);
            }
        }
    }

    public final void a(@NotNull PhotoContext photoContext, @NotNull LinkedHashMap<String, String> linkedHashMap) {
        PoiContext poiContext;
        PhotoContext photoContext2 = photoContext;
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        if (PatchProxy.isSupport(new Object[]{photoContext2, linkedHashMap2}, this, f60877a, false, 66680, new Class[]{PhotoContext.class, LinkedHashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoContext2, linkedHashMap2}, this, f60877a, false, 66680, new Class[]{PhotoContext.class, LinkedHashMap.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(photoContext2, "photoContext");
        Intrinsics.checkParameterIsNotNull(linkedHashMap2, "fieldMap");
        String str = photoContext2.mPoiId;
        if (str != null) {
            poiContext = PoiContext.unserializeFromJson(str);
        } else {
            poiContext = null;
        }
        if (poiContext != null) {
            a(poiContext, linkedHashMap2);
            return;
        }
        if (!TextUtils.isEmpty(photoContext2.mPoiId)) {
            String str2 = photoContext2.mPoiId;
            Intrinsics.checkExpressionValueIsNotNull(str2, "photoContext.mPoiId");
            linkedHashMap2.put("poi_id", str2);
        }
        if (!TextUtils.isEmpty(photoContext2.mPoiName)) {
            String str3 = photoContext2.mPoiName;
            Intrinsics.checkExpressionValueIsNotNull(str3, "photoContext.mPoiName");
            linkedHashMap2.put("poi_name", str3);
        }
    }

    public final void a(@NotNull BaseShortVideoContext baseShortVideoContext, @NotNull LinkedHashMap<String, String> linkedHashMap) {
        PoiContext poiContext;
        BaseShortVideoContext baseShortVideoContext2 = baseShortVideoContext;
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        if (PatchProxy.isSupport(new Object[]{baseShortVideoContext2, linkedHashMap2}, this, f60877a, false, 66679, new Class[]{BaseShortVideoContext.class, LinkedHashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseShortVideoContext2, linkedHashMap2}, this, f60877a, false, 66679, new Class[]{BaseShortVideoContext.class, LinkedHashMap.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(baseShortVideoContext2, "videoContext");
        Intrinsics.checkParameterIsNotNull(linkedHashMap2, "fieldMap");
        String str = baseShortVideoContext2.poiId;
        if (str != null) {
            poiContext = PoiContext.unserializeFromJson(str);
        } else {
            poiContext = null;
        }
        if (poiContext != null) {
            a(poiContext, linkedHashMap2);
            return;
        }
        if (!TextUtils.isEmpty(baseShortVideoContext2.poiId)) {
            String str2 = baseShortVideoContext2.poiId;
            Intrinsics.checkExpressionValueIsNotNull(str2, "videoContext.poiId");
            linkedHashMap2.put("poi_id", str2);
        }
        if (!TextUtils.isEmpty(baseShortVideoContext2.poiName)) {
            String str3 = baseShortVideoContext2.poiName;
            Intrinsics.checkExpressionValueIsNotNull(str3, "videoContext.poiName");
            linkedHashMap2.put("poi_name", str3);
        }
    }
}
