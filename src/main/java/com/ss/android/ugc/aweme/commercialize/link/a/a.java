package com.ss.android.ugc.aweme.commercialize.link.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.model.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0001.BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003JS\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\fHÖ\u0001J\u0010\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+J\u0010\u0010,\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/link/utils/AdLinkLogParams;", "", "label", "", "linkData", "Lcom/ss/android/ugc/aweme/commercialize/model/LinkData;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "fromCommentDialog", "", "useLinkExtra", "visibleRatio", "", "showDuration", "", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/commercialize/model/LinkData;Lcom/ss/android/ugc/aweme/feed/model/Aweme;ZZIJ)V", "getAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getFromCommentDialog", "()Z", "getLabel", "()Ljava/lang/String;", "getLinkData", "()Lcom/ss/android/ugc/aweme/commercialize/model/LinkData;", "getShowDuration", "()J", "getUseLinkExtra", "getVisibleRatio", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "putAdExtraData", "", "ext", "Lorg/json/JSONObject;", "putExtraData", "toString", "Builder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38951a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f38952b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final j f38953c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final Aweme f38954d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f38955e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f38956f;
    public final int g;
    public final long h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0006\u0010*\u001a\u00020+J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\nJ\u000e\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/link/utils/AdLinkLogParams$Builder;", "", "()V", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "fromCommentDialog", "", "getFromCommentDialog", "()Z", "setFromCommentDialog", "(Z)V", "label", "", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "linkData", "Lcom/ss/android/ugc/aweme/commercialize/model/LinkData;", "getLinkData", "()Lcom/ss/android/ugc/aweme/commercialize/model/LinkData;", "setLinkData", "(Lcom/ss/android/ugc/aweme/commercialize/model/LinkData;)V", "showDuration", "", "getShowDuration", "()J", "setShowDuration", "(J)V", "useLinkExtra", "getUseLinkExtra", "setUseLinkExtra", "visibleRatio", "", "getVisibleRatio", "()I", "setVisibleRatio", "(I)V", "build", "Lcom/ss/android/ugc/aweme/commercialize/link/utils/AdLinkLogParams;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.a.a$a  reason: collision with other inner class name */
    public static final class C0509a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38957a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public String f38958b = "";
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public j f38959c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public Aweme f38960d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f38961e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f38962f = true;
        public int g = -1;
        public long h = -1;

        @NotNull
        public final a a() {
            if (PatchProxy.isSupport(new Object[0], this, f38957a, false, 30907, new Class[0], a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[0], this, f38957a, false, 30907, new Class[0], a.class);
            }
            a aVar = new a(this.f38958b, this.f38959c, this.f38960d, this.f38961e, this.f38962f, this.g, this.h);
            return aVar;
        }

        @NotNull
        public final C0509a a(int i) {
            C0509a aVar = this;
            aVar.g = i;
            return aVar;
        }

        @NotNull
        public final C0509a a(long j) {
            C0509a aVar = this;
            aVar.h = j;
            return aVar;
        }

        @NotNull
        public final C0509a a(@Nullable j jVar) {
            C0509a aVar = this;
            aVar.f38959c = jVar;
            return aVar;
        }

        @NotNull
        public final C0509a a(@Nullable Aweme aweme) {
            C0509a aVar = this;
            aVar.f38960d = aweme;
            return aVar;
        }

        @NotNull
        public final C0509a a(@Nullable String str) {
            C0509a aVar = this;
            aVar.f38958b = str;
            return aVar;
        }

        @NotNull
        public final C0509a a(boolean z) {
            C0509a aVar = this;
            aVar.f38961e = z;
            return aVar;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f38951a, false, 30905, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f38951a, false, 30905, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (Intrinsics.areEqual((Object) this.f38952b, (Object) aVar.f38952b) && Intrinsics.areEqual((Object) this.f38953c, (Object) aVar.f38953c) && Intrinsics.areEqual((Object) this.f38954d, (Object) aVar.f38954d)) {
                    if (this.f38955e == aVar.f38955e) {
                        if (this.f38956f == aVar.f38956f) {
                            if (this.g == aVar.g) {
                                if (this.h == aVar.h) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f38951a, false, 30904, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f38951a, false, 30904, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f38952b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        j jVar = this.f38953c;
        int hashCode2 = (hashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        Aweme aweme = this.f38954d;
        if (aweme != null) {
            i = aweme.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f38955e;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f38956f;
        if (z2) {
            z2 = true;
        }
        long j = this.h;
        return ((((i3 + (z2 ? 1 : 0)) * 31) + this.g) * 31) + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f38951a, false, 30903, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f38951a, false, 30903, new Class[0], String.class);
        }
        return "AdLinkLogParams(label=" + this.f38952b + ", linkData=" + this.f38953c + ", aweme=" + this.f38954d + ", fromCommentDialog=" + this.f38955e + ", useLinkExtra=" + this.f38956f + ", visibleRatio=" + this.g + ", showDuration=" + this.h + ")";
    }

    public final void a(@Nullable JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f38951a, false, 30900, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f38951a, false, 30900, new Class[]{JSONObject.class}, Void.TYPE);
        } else if (jSONObject != null) {
            try {
                if (jSONObject.has("ad_extra_data")) {
                    jSONObject2 = jSONObject.getJSONObject("ad_extra_data");
                    Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "ext.getJSONObject(Commer…izeMob.Key.AD_EXTRA_DATA)");
                } else {
                    jSONObject2 = new JSONObject();
                }
                if (this.g >= 0) {
                    jSONObject2.put("pixel_pct", this.g);
                }
                jSONObject.put("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
            }
        }
    }

    public final void b(@Nullable JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f38951a, false, 30901, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f38951a, false, 30901, new Class[]{JSONObject.class}, Void.TYPE);
        } else if (jSONObject != null) {
            try {
                if (this.h >= 0) {
                    jSONObject.put("duration", this.h);
                }
            } catch (Exception unused) {
            }
        }
    }

    public a(@NotNull String str, @Nullable j jVar, @Nullable Aweme aweme, boolean z, boolean z2, int i, long j) {
        Intrinsics.checkParameterIsNotNull(str, "label");
        this.f38952b = str;
        this.f38953c = jVar;
        this.f38954d = aweme;
        this.f38955e = z;
        this.f38956f = z2;
        this.g = i;
        this.h = j;
    }
}
