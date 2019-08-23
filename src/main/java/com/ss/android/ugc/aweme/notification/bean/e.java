package com.ss.android.ugc.aweme.notification.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/bean/LinkProfitNotice;", "", "title", "", "content", "schemaUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getSchemaUrl", "setSchemaUrl", "getTitle", "setTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58000a;
    @SerializedName("title")
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f58001b;
    @SerializedName("content")
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public String f58002c;
    @SerializedName("schema_url")
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public String f58003d;

    public e() {
        this(null, null, null, 7);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f58000a, false, 63093, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f58000a, false, 63093, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (!Intrinsics.areEqual((Object) this.f58001b, (Object) eVar.f58001b) || !Intrinsics.areEqual((Object) this.f58002c, (Object) eVar.f58002c) || !Intrinsics.areEqual((Object) this.f58003d, (Object) eVar.f58003d)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f58000a, false, 63092, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f58000a, false, 63092, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f58001b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f58002c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f58003d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f58000a, false, 63091, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f58000a, false, 63091, new Class[0], String.class);
        }
        return "LinkProfitNotice(title=" + this.f58001b + ", content=" + this.f58002c + ", schemaUrl=" + this.f58003d + ")";
    }

    private e(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkParameterIsNotNull(str, PushConstants.TITLE);
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.CONTENT);
        Intrinsics.checkParameterIsNotNull(str3, "schemaUrl");
        this.f58001b = str;
        this.f58002c = str2;
        this.f58003d = str3;
    }

    private /* synthetic */ e(String str, String str2, String str3, int i) {
        this("", "", "");
    }
}
