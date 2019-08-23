package com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0004R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010%\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001c\u0010(\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000b\"\u0004\b*\u0010\u000e¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/data/PixaloopData;", "", "()V", "imgPath", "", "algorithmName", "isDiscernment", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "algorithmImgK", "getAlgorithmImgK", "()Ljava/lang/String;", "getAlgorithmName", "setAlgorithmName", "(Ljava/lang/String;)V", "allalgorithmData", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/data/PixaloopAllalgorithmData;", "getAllalgorithmData", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/data/PixaloopAllalgorithmData;", "setAllalgorithmData", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/data/PixaloopAllalgorithmData;)V", "allalgorithmList", "", "getAllalgorithmList", "()Ljava/util/List;", "getImgPath", "setImgPath", "()Z", "setDiscernment", "(Z)V", "isValid", "showGuide", "getShowGuide", "()Ljava/lang/Boolean;", "setShowGuide", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "showLoading", "getShowLoading", "setShowLoading", "stickerId", "getStickerId", "setStickerId", "parseAlgorithm", "sdkExtra", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69360a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f69361b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f69362c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f69363d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f69364e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public Boolean f69365f = Boolean.TRUE;
    @Nullable
    public Boolean g = Boolean.TRUE;
    @NotNull
    public a h = new a();

    @NotNull
    public final List<String> a() {
        return this.h.f69357a;
    }

    @Nullable
    public final String b() {
        return this.h.f69358b;
    }

    public b() {
    }

    @NotNull
    public final b a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f69360a, false, 78943, new Class[]{String.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str}, this, f69360a, false, 78943, new Class[]{String.class}, b.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "sdkExtra");
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("pl");
            if (optJSONObject != null) {
                this.f69365f = Boolean.valueOf(optJSONObject.optBoolean("guide", true));
                this.g = Boolean.valueOf(optJSONObject.optBoolean("loading", true));
                this.h.f69358b = optJSONObject.optString("imgK");
                this.h.f69359c = optJSONObject.optString("relation");
                JSONArray optJSONArray = optJSONObject.optJSONArray("alg");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = optJSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            List<String> list = this.h.f69357a;
                            Intrinsics.checkExpressionValueIsNotNull(string, "str");
                            list.add(string);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return this;
    }

    public b(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "imgPath");
        Intrinsics.checkParameterIsNotNull(str2, "algorithmName");
        this.f69361b = str;
        this.f69362c = str2;
        this.f69363d = z;
    }
}
