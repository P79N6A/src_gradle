package com.ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.a.a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u001c\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001a\u001a\u00020\u0004H\u0003J>\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0013H\u0007J>\u0010 \u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0013H\u0007J>\u0010!\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0013H\u0007J<\u0010\"\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0013H\u0007J4\u0010#\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0013H\u0007JB\u0010$\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0013H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/log/InteractStickerAdLogHelper;", "", "()V", "KEY_AD_EXTRA", "", "KEY_POI_ID_AD_EXTRA", "KEY_POI_ID_LOG_EXTRA", "KEY_VOTE_CLICK_AREA", "TAG", "getCreativeId", "awemeRawAd", "Lcom/ss/android/ugc/aweme/feed/model/AwemeRawAd;", "getExtJson", "Lorg/json/JSONObject;", "context", "Landroid/content/Context;", "logExtra", "value", "getGroupId", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getPoiExtJson", "json", "poiId", "getVoteClickExtJson", "area", "logAdPoiClick", "", "pageFrom", "cid", "gid", "logAdPoiJump", "logAdPoiShow", "logAdVoteClick", "logAdVoteShow", "onV1AdEvent", "tag", "label", "extJson", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39352a;

    /* renamed from: b  reason: collision with root package name */
    public static final w f39353b = new w();

    private w() {
    }

    @JvmStatic
    public static final void a(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String str4, long j) {
        Context context2 = context;
        String str5 = str;
        String str6 = str2;
        String str7 = str4;
        long j2 = j;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context2, str5, str6, str3, str7, new Long(j2)}, null, f39352a, true, 31803, new Class[]{Context.class, String.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str5, str6, str3, str7, new Long(j2)}, null, f39352a, true, 31803, new Class[]{Context.class, String.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str7, "cid");
        CharSequence charSequence = str6;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (!z) {
            a(context, "draw_ad", "poi_sticker_show", a(a(context2, str6, "ad poi show event"), str5), str3, str4, j);
        }
    }

    @JvmStatic
    public static final void a(Context context, String str, String str2, JSONObject jSONObject, String str3, String str4, long j) {
        String str5;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, jSONObject, str3, str4, new Long(j2)}, null, f39352a, true, 31810, new Class[]{Context.class, String.class, String.class, JSONObject.class, String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, jSONObject, str3, str4, new Long(j2)}, null, f39352a, true, 31810, new Class[]{Context.class, String.class, String.class, JSONObject.class, String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        CharSequence charSequence = str3;
        if (TextUtils.equals(charSequence, "challenge") || TextUtils.equals(charSequence, "challenge_fresh")) {
            str5 = TextUtils.equals(str, "background_ad") ? "background_ads" : "topic_ads";
        } else {
            str5 = str;
        }
        g.a(context, str5, str2, jSONObject, str4, j);
    }

    @JvmStatic
    public static final long a(@NotNull Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f39352a, true, 31800, new Class[]{Aweme.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{aweme2}, null, f39352a, true, 31800, new Class[]{Aweme.class}, Long.TYPE)).longValue();
        }
        Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
        if (!aweme.isAd()) {
            return 0;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            return g.a(awemeRawAd);
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0048, code lost:
        if (r0 == null) goto L_0x004a;
     */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.feed.model.AwemeRawAd r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f39352a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r3 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 31801(0x7c39, float:4.4563E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f39352a
            r13 = 1
            r14 = 31801(0x7c39, float:4.4563E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r0 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0035:
            java.lang.String r1 = "awemeRawAd"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            java.lang.Long r0 = r17.getCreativeId()
            if (r0 == 0) goto L_0x004a
            long r0 = r0.longValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r0 != 0) goto L_0x004c
        L_0x004a:
            java.lang.String r0 = "0"
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.log.w.a(com.ss.android.ugc.aweme.feed.model.AwemeRawAd):java.lang.String");
    }

    @JvmStatic
    public static final JSONObject b(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{jSONObject, str2}, null, f39352a, true, 31809, new Class[]{JSONObject.class, String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{jSONObject, str2}, null, f39352a, true, 31809, new Class[]{JSONObject.class, String.class}, JSONObject.class);
        }
        if (jSONObject == null) {
            jSONObject2 = new JSONObject();
        } else {
            jSONObject2 = jSONObject;
        }
        JSONObject jSONObject3 = (JSONObject) jSONObject2.opt("ad_extra_data");
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        try {
            jSONObject3.put("poll_click_area", str2);
            jSONObject2.put("ad_extra_data", jSONObject3);
        } catch (JSONException e2) {
            a.a((Exception) e2);
        }
        return jSONObject2;
    }

    @JvmStatic
    @NotNull
    public static final JSONObject a(@Nullable JSONObject jSONObject, @Nullable String str) {
        JSONObject jSONObject2;
        String str2 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{jSONObject, str2}, null, f39352a, true, 31802, new Class[]{JSONObject.class, String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{jSONObject, str2}, null, f39352a, true, 31802, new Class[]{JSONObject.class, String.class}, JSONObject.class);
        }
        if (jSONObject == null) {
            jSONObject2 = new JSONObject();
        } else {
            jSONObject2 = jSONObject;
        }
        JSONObject jSONObject3 = (JSONObject) jSONObject2.opt("ad_extra_data");
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        try {
            CharSequence charSequence = str2;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            if (!z) {
                jSONObject3.put("poi_ad_list", str2);
            }
            jSONObject2.put("ad_extra_data", jSONObject3);
        } catch (JSONException e2) {
            a.a((Exception) e2);
        }
        return jSONObject2;
    }

    @JvmStatic
    public static final JSONObject a(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str2}, null, f39352a, true, 31808, new Class[]{Context.class, String.class, String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{context2, str3, str2}, null, f39352a, true, 31808, new Class[]{Context.class, String.class, String.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            g.a(context2, jSONObject, str3);
        } catch (JSONException e2) {
            a.a((Exception) e2);
        }
        return jSONObject;
    }

    @JvmStatic
    public static final void a(@NotNull Context context, @Nullable String str, @Nullable String str2, @NotNull String str3, long j) {
        Context context2 = context;
        String str4 = str;
        String str5 = str3;
        long j2 = j;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str2, str5, new Long(j2)}, null, f39352a, true, 31806, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {context2, str4, str2, str5, new Long(j2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39352a, true, 31806, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str5, "cid");
        CharSequence charSequence = str4;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (!z) {
            a(context, "draw_ad", "poll_sticker_show", a(context2, str4, "ad vote show event"), str2, str3, j);
        }
    }
}
