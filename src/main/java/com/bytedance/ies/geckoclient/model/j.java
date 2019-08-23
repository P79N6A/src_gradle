package com.bytedance.ies.geckoclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class j {
    @SerializedName("package_version")

    /* renamed from: a  reason: collision with root package name */
    public int f20811a;
    @SerializedName("channel")

    /* renamed from: b  reason: collision with root package name */
    public String f20812b;
    @SerializedName("package_type")

    /* renamed from: c  reason: collision with root package name */
    public int f20813c;

    /* renamed from: d  reason: collision with root package name */
    public String f20814d;

    /* renamed from: e  reason: collision with root package name */
    public long f20815e;
    @SerializedName("content")

    /* renamed from: f  reason: collision with root package name */
    private a f20816f;

    public static class a {
        @SerializedName("package")

        /* renamed from: a  reason: collision with root package name */
        public b f20817a;
        @SerializedName("patch")

        /* renamed from: b  reason: collision with root package name */
        public b f20818b;
        @SerializedName("strategies")

        /* renamed from: c  reason: collision with root package name */
        public i f20819c;
    }

    public static class b {
        @SerializedName("id")

        /* renamed from: a  reason: collision with root package name */
        public int f20820a;
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public String f20821b;
        @SerializedName("url_list")

        /* renamed from: c  reason: collision with root package name */
        public List<String> f20822c;
        @SerializedName("md5")

        /* renamed from: d  reason: collision with root package name */
        public String f20823d;

        /* renamed from: e  reason: collision with root package name */
        public String f20824e;

        /* renamed from: f  reason: collision with root package name */
        public String f20825f;

        public final String toString() {
            return "Package{url='" + this.f20821b + '\'' + ", md5='" + this.f20823d + '\'' + '}';
        }
    }

    public final b a() {
        return this.f20816f.f20817a;
    }

    public final b b() {
        return this.f20816f.f20818b;
    }

    public final i c() {
        return this.f20816f.f20819c;
    }

    public final String toString() {
        return "UpdatePackage{version=" + this.f20811a + ", channel='" + this.f20812b + '\'' + ", content=" + this.f20816f + ", packageType=" + this.f20813c + ", afterPatchZip='" + this.f20814d + '\'' + ", downloadFileSize=" + this.f20815e + '}';
    }
}
