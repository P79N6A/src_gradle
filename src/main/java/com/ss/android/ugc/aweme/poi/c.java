package com.ss.android.ugc.aweme.poi;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "Ljava/io/Serializable;", "()V", "activityId", "", "getActivityId", "()Ljava/lang/String;", "setActivityId", "(Ljava/lang/String;)V", "awemeId", "getAwemeId", "setAwemeId", "backendType", "getBackendType", "setBackendType", "poiChannel", "getPoiChannel", "setPoiChannel", "poiCity", "getPoiCity", "setPoiCity", "poiId", "getPoiId", "setPoiId", "poiType", "getPoiType", "setPoiType", "previousPage", "getPreviousPage", "setPreviousPage", "Builder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String activityId;
    @Nullable
    private String awemeId;
    @Nullable
    private String backendType;
    @Nullable
    private String poiChannel;
    @Nullable
    private String poiCity;
    @Nullable
    private String poiId;
    @Nullable
    private String poiType;
    @Nullable
    private String previousPage;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u001e\u001a\u00020\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle$Builder;", "", "()V", "activityId", "", "getActivityId", "()Ljava/lang/String;", "setActivityId", "(Ljava/lang/String;)V", "awemeId", "getAwemeId", "setAwemeId", "backendType", "getBackendType", "setBackendType", "poiChannel", "getPoiChannel", "setPoiChannel", "poiCity", "getPoiCity", "setPoiCity", "poiId", "getPoiId", "setPoiId", "poiType", "getPoiType", "setPoiType", "previousPage", "getPreviousPage", "setPreviousPage", "setup", "Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59749a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public String f59750b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public String f59751c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public String f59752d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public String f59753e;
        @Nullable

        /* renamed from: f  reason: collision with root package name */
        public String f59754f;
        @Nullable
        public String g;
        @Nullable
        public String h;
        @Nullable
        public String i;

        @NotNull
        public final c a() {
            if (PatchProxy.isSupport(new Object[0], this, f59749a, false, 64736, new Class[0], c.class)) {
                return (c) PatchProxy.accessDispatch(new Object[0], this, f59749a, false, 64736, new Class[0], c.class);
            }
            c cVar = new c();
            cVar.setPoiId(this.f59750b);
            cVar.setPoiType(this.f59751c);
            cVar.setPoiChannel(this.f59752d);
            cVar.setActivityId(this.f59753e);
            cVar.setAwemeId(this.f59754f);
            cVar.setPreviousPage(this.g);
            cVar.setBackendType(this.h);
            cVar.setPoiCity(this.i);
            return cVar;
        }

        @NotNull
        public final a a(@Nullable String str) {
            this.f59750b = str;
            return this;
        }

        @NotNull
        public final a b(@Nullable String str) {
            this.f59751c = str;
            return this;
        }

        @NotNull
        public final a c(@Nullable String str) {
            this.f59754f = str;
            return this;
        }

        @NotNull
        public final a d(@Nullable String str) {
            this.h = str;
            return this;
        }

        @NotNull
        public final a e(@Nullable String str) {
            this.i = str;
            return this;
        }
    }

    @Nullable
    public final String getActivityId() {
        return this.activityId;
    }

    @Nullable
    public final String getAwemeId() {
        return this.awemeId;
    }

    @Nullable
    public final String getBackendType() {
        return this.backendType;
    }

    @Nullable
    public final String getPoiChannel() {
        return this.poiChannel;
    }

    @Nullable
    public final String getPoiCity() {
        return this.poiCity;
    }

    @Nullable
    public final String getPoiId() {
        return this.poiId;
    }

    @Nullable
    public final String getPoiType() {
        return this.poiType;
    }

    @Nullable
    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final void setActivityId(@Nullable String str) {
        this.activityId = str;
    }

    public final void setAwemeId(@Nullable String str) {
        this.awemeId = str;
    }

    public final void setBackendType(@Nullable String str) {
        this.backendType = str;
    }

    public final void setPoiChannel(@Nullable String str) {
        this.poiChannel = str;
    }

    public final void setPoiCity(@Nullable String str) {
        this.poiCity = str;
    }

    public final void setPoiId(@Nullable String str) {
        this.poiId = str;
    }

    public final void setPoiType(@Nullable String str) {
        this.poiType = str;
    }

    public final void setPreviousPage(@Nullable String str) {
        this.previousPage = str;
    }
}
