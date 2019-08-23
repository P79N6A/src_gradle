package com.ss.android.ugc.aweme.commerce.sdk.e;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/util/TraceUtils;", "", "()V", "getExtJson", "Lorg/json/JSONObject;", "awemeId", "", "commodityId", "enterMethod", "uid", "commodityType", "", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37731a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f37732b = new d();

    private d() {
    }

    @NotNull
    public final JSONObject a(@Nullable String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, int i) {
        String str5;
        String str6;
        String str7;
        String str8 = str2;
        String str9 = str3;
        if (PatchProxy.isSupport(new Object[]{str, str8, str9, str4, Integer.valueOf(i)}, this, f37731a, false, 29583, new Class[]{String.class, String.class, String.class, String.class, Integer.TYPE}, JSONObject.class)) {
            Object[] objArr = {str, str8, str9, str4, Integer.valueOf(i)};
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, f37731a, false, 29583, new Class[]{String.class, String.class, String.class, String.class, Integer.TYPE}, JSONObject.class);
        }
        Intrinsics.checkParameterIsNotNull(str8, "commodityId");
        Intrinsics.checkParameterIsNotNull(str9, "enterMethod");
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(str)) {
                str5 = "";
            } else {
                str5 = str;
            }
            jSONObject.put("group_id", str5);
            if (TextUtils.isEmpty(str8)) {
                str8 = "";
            }
            jSONObject.put("commodity_id", str8);
            if (str4 == null) {
                str6 = "";
            } else {
                str6 = str4;
            }
            jSONObject.put("page_uid", str6);
            jSONObject.put("commodity_type", i);
            if (TextUtils.isEmpty(str9)) {
                str7 = "";
            } else {
                str7 = str9;
            }
            jSONObject.put("enter_method", str7);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
