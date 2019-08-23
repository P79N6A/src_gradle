package com.bytedance.android.livesdk.effect.model;

import com.google.gson.annotations.SerializedName;

public final class a {
    @SerializedName("whitening")

    /* renamed from: a  reason: collision with root package name */
    public C0097a f13829a = new C0097a(0.5f, 0.35f);
    @SerializedName("beauty_skin")

    /* renamed from: b  reason: collision with root package name */
    public C0097a f13830b = new C0097a(1.0f, 0.35f);
    @SerializedName("big_eyes")

    /* renamed from: c  reason: collision with root package name */
    public C0097a f13831c = new C0097a(1.0f, 0.5f);
    @SerializedName("face_lift")

    /* renamed from: d  reason: collision with root package name */
    public C0097a f13832d = new C0097a(1.0f, 0.5f);
    @SerializedName("sharp")

    /* renamed from: e  reason: collision with root package name */
    public C0097a f13833e = new C0097a(1.0f, 0.05f);

    /* renamed from: com.bytedance.android.livesdk.effect.model.a$a  reason: collision with other inner class name */
    public class C0097a {
        @SerializedName("scale")

        /* renamed from: a  reason: collision with root package name */
        public float f13834a;
        @SerializedName("default")

        /* renamed from: b  reason: collision with root package name */
        public float f13835b;

        public C0097a(float f2, float f3) {
            this.f13834a = f2;
            this.f13835b = f3;
        }
    }
}
