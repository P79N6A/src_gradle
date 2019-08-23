package com.ss.android.ugc.aweme.poi.c;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b0\u0018\u00002\u00020\u0001:\u00015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001c\u0010 \u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\u001c\u0010#\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\nR\u001c\u0010&\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\nR\u001c\u0010)\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\nR\u001c\u0010,\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR\u001c\u0010/\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\b\"\u0004\b1\u0010\nR\u001c\u00102\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\b\"\u0004\b4\u0010\n¨\u00066"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/mob/PoiMobEventParams;", "", "builder", "Lcom/ss/android/ugc/aweme/poi/mob/PoiMobEventParams$Builder;", "(Lcom/ss/android/ugc/aweme/poi/mob/PoiMobEventParams$Builder;)V", "authorId", "", "getAuthorId", "()Ljava/lang/String;", "setAuthorId", "(Ljava/lang/String;)V", "backendType", "getBackendType", "setBackendType", "contentType", "getContentType", "setContentType", "couponId", "getCouponId", "setCouponId", "couponType", "getCouponType", "setCouponType", "duration", "getDuration", "setDuration", "enterFrom", "getEnterFrom", "setEnterFrom", "enterMethod", "getEnterMethod", "setEnterMethod", "groupId", "getGroupId", "setGroupId", "poiChannel", "getPoiChannel", "setPoiChannel", "poiCity", "getPoiCity", "setPoiCity", "poiId", "getPoiId", "setPoiId", "poiType", "getPoiType", "setPoiType", "previousPage", "getPreviousPage", "setPreviousPage", "sourceType", "getSourceType", "setSourceType", "Builder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public String f59755a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f59756b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f59757c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f59758d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f59759e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f59760f;
    @Nullable
    public String g;
    @Nullable
    public String h;
    @Nullable
    public String i;
    @Nullable
    public String j;
    @Nullable
    public String k;
    @Nullable
    public String l;
    @Nullable
    public String m = "";
    @Nullable
    public String n = "";
    @Nullable
    public String o = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0006\u00103\u001a\u000204J\u0010\u00105\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004J\u0010\u0010'\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0004J\u0010\u00106\u001a\u00020\u00002\b\u00107\u001a\u0004\u0018\u000108J\u0010\u00109\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u00010:J\u0010\u0010*\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0004J\u0010\u0010-\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010\u0004J\u0010\u00100\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\b¨\u0006;"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/mob/PoiMobEventParams$Builder;", "", "()V", "authorId", "", "getAuthorId", "()Ljava/lang/String;", "setAuthorId", "(Ljava/lang/String;)V", "backendType", "getBackendType", "setBackendType", "contentType", "getContentType", "setContentType", "couponId", "getCouponId", "setCouponId", "couponType", "getCouponType", "setCouponType", "duration", "getDuration", "setDuration", "enterFrom", "getEnterFrom", "setEnterFrom", "enterMethod", "getEnterMethod", "setEnterMethod", "groupId", "getGroupId", "setGroupId", "poiChannel", "getPoiChannel", "setPoiChannel", "poiCity", "getPoiCity", "setPoiCity", "poiId", "getPoiId", "setPoiId", "poiType", "getPoiType", "setPoiType", "previousPage", "getPreviousPage", "setPreviousPage", "sourceType", "getSourceType", "setSourceType", "build", "Lcom/ss/android/ugc/aweme/poi/mob/PoiMobEventParams;", "channel", "poiSimpleBundle", "poiBundle", "Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "poiStruct", "Lcom/ss/android/ugc/aweme/poi/model/PoiStruct;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.poi.c.a$a  reason: collision with other inner class name */
    public static final class C0670a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59761a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public String f59762b = "";
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public String f59763c = "";
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public String f59764d = "";
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public String f59765e = "";
        @Nullable

        /* renamed from: f  reason: collision with root package name */
        public String f59766f = "";
        @Nullable
        public String g = "";
        @Nullable
        public String h = "";
        @Nullable
        public String i = "";
        @Nullable
        public String j = "";
        @Nullable
        public String k = "";
        @Nullable
        public String l = "";
        @Nullable
        public String m = "";
        @Nullable
        public String n = "";
        @Nullable
        public String o = "";
        @Nullable
        public String p = "";

        @NotNull
        public final a a() {
            if (!PatchProxy.isSupport(new Object[0], this, f59761a, false, 64983, new Class[0], a.class)) {
                return new a(this);
            }
            return (a) PatchProxy.accessDispatch(new Object[0], this, f59761a, false, 64983, new Class[0], a.class);
        }

        @NotNull
        public final C0670a a(@Nullable String str) {
            this.f59762b = str;
            return this;
        }

        @NotNull
        public final C0670a b(@Nullable String str) {
            this.f59763c = str;
            return this;
        }

        @NotNull
        public final C0670a c(@Nullable String str) {
            this.f59764d = str;
            return this;
        }

        @NotNull
        public final C0670a d(@Nullable String str) {
            this.f59765e = str;
            return this;
        }

        @NotNull
        public final C0670a e(@Nullable String str) {
            this.f59766f = str;
            return this;
        }

        @NotNull
        public final C0670a f(@Nullable String str) {
            this.g = str;
            return this;
        }

        @NotNull
        public final C0670a g(@Nullable String str) {
            this.h = str;
            return this;
        }

        @NotNull
        public final C0670a h(@Nullable String str) {
            this.i = str;
            return this;
        }

        @NotNull
        public final C0670a i(@Nullable String str) {
            this.k = str;
            return this;
        }

        @NotNull
        public final C0670a j(@Nullable String str) {
            this.m = str;
            return this;
        }

        @NotNull
        public final C0670a a(@Nullable c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f59761a, false, 64982, new Class[]{c.class}, C0670a.class)) {
                return (C0670a) PatchProxy.accessDispatch(new Object[]{cVar}, this, f59761a, false, 64982, new Class[]{c.class}, C0670a.class);
            }
            if (cVar != null) {
                this.o = cVar.getBackendType();
                this.p = cVar.getPoiCity();
            }
            return this;
        }

        @NotNull
        public final C0670a a(@Nullable PoiStruct poiStruct) {
            if (PatchProxy.isSupport(new Object[]{poiStruct}, this, f59761a, false, 64981, new Class[]{PoiStruct.class}, C0670a.class)) {
                return (C0670a) PatchProxy.accessDispatch(new Object[]{poiStruct}, this, f59761a, false, 64981, new Class[]{PoiStruct.class}, C0670a.class);
            }
            if (poiStruct != null) {
                this.o = poiStruct.getBackendTypeCode();
                if (!TextUtils.isEmpty(poiStruct.getCityCode())) {
                    this.p = poiStruct.getCityCode();
                }
            }
            return this;
        }
    }

    public a(@NotNull C0670a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "builder");
        this.f59755a = aVar.f59762b;
        this.f59756b = aVar.f59763c;
        this.f59757c = aVar.f59764d;
        this.f59758d = aVar.f59765e;
        this.f59759e = aVar.f59766f;
        this.f59760f = aVar.g;
        this.g = aVar.h;
        this.h = aVar.i;
        this.i = aVar.j;
        this.j = aVar.k;
        this.k = aVar.l;
        this.l = aVar.m;
        this.m = aVar.n;
        this.n = aVar.o;
        this.o = aVar.p;
    }
}
