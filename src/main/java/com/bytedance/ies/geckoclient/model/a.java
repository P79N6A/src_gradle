package com.bytedance.ies.geckoclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public final class a {
    @SerializedName("common")

    /* renamed from: a  reason: collision with root package name */
    public b f20777a;
    @SerializedName("deployment")

    /* renamed from: b  reason: collision with root package name */
    public Map<String, List<C0190a>> f20778b;

    /* renamed from: com.bytedance.ies.geckoclient.model.a$a  reason: collision with other inner class name */
    public static class C0190a {
        @SerializedName("channel")

        /* renamed from: a  reason: collision with root package name */
        private String f20779a;
        @SerializedName("local_version")

        /* renamed from: b  reason: collision with root package name */
        private int f20780b;

        public C0190a(String str, int i) {
            this.f20779a = str;
            this.f20780b = i;
        }
    }

    public static class b {
        @SerializedName("aid")

        /* renamed from: a  reason: collision with root package name */
        private int f20781a;
        @SerializedName("app_version")

        /* renamed from: b  reason: collision with root package name */
        private String f20782b;
        @SerializedName("device_id")

        /* renamed from: c  reason: collision with root package name */
        private String f20783c;

        public b(int i, String str, String str2) {
            this.f20781a = i;
            this.f20782b = str;
            this.f20783c = str2;
        }
    }
}
