package com.ss.android.ugc.aweme.commerce.preview.pops.a;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0006\u0010\u0018\u001a\u00020\u0003R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/pops/sku/AddCartRequest;", "", "originType", "", "originId", "comboId", "comboNum", "specDesc", "deviceId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComboId", "()Ljava/lang/String;", "setComboId", "(Ljava/lang/String;)V", "getComboNum", "setComboNum", "getDeviceId", "setDeviceId", "getOriginId", "setOriginId", "getOriginType", "setOriginType", "getSpecDesc", "setSpecDesc", "toJsonString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37556a;
    @SerializedName("origin_type")
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f37557b;
    @SerializedName("origin_id")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f37558c;
    @SerializedName("combo_id")
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f37559d;
    @SerializedName("combo_num")
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f37560e;
    @SerializedName("spec_desc")
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f37561f;
    @SerializedName("device_id")
    @Nullable
    public String g;

    public a() {
        this(null, null, null, null, null, null, 63);
    }

    @NotNull
    public final String a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f37556a, false, 29108, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f37556a, false, 29108, new Class[0], String.class);
        }
        try {
            str = new Gson().toJson((Object) this);
            Intrinsics.checkExpressionValueIsNotNull(str, "Gson().toJson(this)");
        } catch (Exception unused) {
            str = "";
        }
        return str;
    }

    public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.f37557b = str;
        this.f37558c = str2;
        this.f37559d = str3;
        this.f37560e = str4;
        this.f37561f = str5;
        this.g = str6;
    }

    private /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this(null, null, null, null, null, null);
    }
}
