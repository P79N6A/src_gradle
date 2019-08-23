package com.ss.android.ugc.aweme.commercialize.model;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.link.a;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.v;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39374a;
    @SerializedName("commerce_ad_link")

    /* renamed from: b  reason: collision with root package name */
    public boolean f39375b = a.b();
    @SerializedName("commerce_ad_link_tags")

    /* renamed from: c  reason: collision with root package name */
    public String f39376c;
    @SerializedName("star_atlas_order_id")

    /* renamed from: d  reason: collision with root package name */
    public long f39377d = 0;
    @SerializedName("is_star_atlas")

    /* renamed from: e  reason: collision with root package name */
    public boolean f39378e;
    @SerializedName("shop_order_share_structinfo")

    /* renamed from: f  reason: collision with root package name */
    public v f39379f;

    public final long a() {
        if (PatchProxy.isSupport(new Object[0], this, f39374a, false, 31908, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f39374a, false, 31908, new Class[0], Long.TYPE)).longValue();
        } else if (com.ss.android.ugc.aweme.commercialize.star.a.a()) {
            return this.f39377d;
        } else {
            return 0;
        }
    }

    public static e a(PhotoContext photoContext) {
        PhotoContext photoContext2 = photoContext;
        if (PatchProxy.isSupport(new Object[]{photoContext2}, null, f39374a, true, 31901, new Class[]{PhotoContext.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{photoContext2}, null, f39374a, true, 31901, new Class[]{PhotoContext.class}, e.class);
        } else if (photoContext2 == null || TextUtils.isEmpty(photoContext2.commerceData)) {
            return new e();
        } else {
            return (e) new Gson().fromJson(photoContext2.commerceData, e.class);
        }
    }

    public static e b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f39374a, true, 31906, new Class[]{String.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{str2}, null, f39374a, true, 31906, new Class[]{String.class}, e.class);
        } else if (TextUtils.isEmpty(str)) {
            return new e();
        } else {
            return (e) new Gson().fromJson(str2, e.class);
        }
    }

    public static e a(BaseShortVideoContext baseShortVideoContext) {
        BaseShortVideoContext baseShortVideoContext2 = baseShortVideoContext;
        if (PatchProxy.isSupport(new Object[]{baseShortVideoContext2}, null, f39374a, true, 31902, new Class[]{BaseShortVideoContext.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{baseShortVideoContext2}, null, f39374a, true, 31902, new Class[]{BaseShortVideoContext.class}, e.class);
        } else if (baseShortVideoContext2 == null || TextUtils.isEmpty(baseShortVideoContext2.commerceData)) {
            return new e();
        } else {
            return (e) new Gson().fromJson(baseShortVideoContext2.commerceData, e.class);
        }
    }

    public static e a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f39374a, true, 31903, new Class[]{String.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{str2}, null, f39374a, true, 31903, new Class[]{String.class}, e.class);
        } else if (TextUtils.isEmpty(str)) {
            return new e();
        } else {
            return (e) new Gson().fromJson(str2, e.class);
        }
    }

    public static String a(e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, null, f39374a, true, 31907, new Class[]{e.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{eVar2}, null, f39374a, true, 31907, new Class[]{e.class}, String.class);
        } else if (eVar2 == null) {
            return null;
        } else {
            return new Gson().toJson((Object) eVar2);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39374a, false, 31909, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39374a, false, 31909, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.commercialize.star.a.a()) {
            this.f39378e = z;
        } else {
            this.f39378e = false;
        }
    }
}
