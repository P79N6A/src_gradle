package com.ss.android.ugc.aweme.utils;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class ad {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75486a;

    /* renamed from: b  reason: collision with root package name */
    public Bundle f75487b = new Bundle();

    public final ad a(@Nullable String str, @Nullable String[] strArr) {
        if (PatchProxy.isSupport(new Object[]{str, strArr}, this, f75486a, false, 88045, new Class[]{String.class, String[].class}, ad.class)) {
            return (ad) PatchProxy.accessDispatch(new Object[]{str, strArr}, this, f75486a, false, 88045, new Class[]{String.class, String[].class}, ad.class);
        }
        this.f75487b.putStringArray(str, strArr);
        return this;
    }

    public static ad a() {
        if (PatchProxy.isSupport(new Object[0], null, f75486a, true, 88038, new Class[0], ad.class)) {
            return (ad) PatchProxy.accessDispatch(new Object[0], null, f75486a, true, 88038, new Class[0], ad.class);
        }
        return new ad();
    }

    public final ad a(@Nullable String str, float f2) {
        if (PatchProxy.isSupport(new Object[]{str, Float.valueOf(0.1f)}, this, f75486a, false, 88044, new Class[]{String.class, Float.TYPE}, ad.class)) {
            return (ad) PatchProxy.accessDispatch(new Object[]{str, Float.valueOf(0.1f)}, this, f75486a, false, 88044, new Class[]{String.class, Float.TYPE}, ad.class);
        }
        this.f75487b.putFloat(str, 0.1f);
        return this;
    }

    public final ad a(@Nullable String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f75486a, false, 88039, new Class[]{String.class, Integer.TYPE}, ad.class)) {
            return (ad) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f75486a, false, 88039, new Class[]{String.class, Integer.TYPE}, ad.class);
        }
        this.f75487b.putInt(str, i);
        return this;
    }

    public final ad a(@Nullable String str, @Nullable Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{str, parcelable}, this, f75486a, false, 88043, new Class[]{String.class, Parcelable.class}, ad.class)) {
            return (ad) PatchProxy.accessDispatch(new Object[]{str, parcelable}, this, f75486a, false, 88043, new Class[]{String.class, Parcelable.class}, ad.class);
        }
        this.f75487b.putParcelable(str, parcelable);
        return this;
    }

    public final ad a(@Nullable String str, @Nullable Serializable serializable) {
        if (PatchProxy.isSupport(new Object[]{str, serializable}, this, f75486a, false, 88042, new Class[]{String.class, Serializable.class}, ad.class)) {
            return (ad) PatchProxy.accessDispatch(new Object[]{str, serializable}, this, f75486a, false, 88042, new Class[]{String.class, Serializable.class}, ad.class);
        }
        this.f75487b.putSerializable(str, serializable);
        return this;
    }

    public final ad a(@Nullable String str, @Nullable String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f75486a, false, 88040, new Class[]{String.class, String.class}, ad.class)) {
            return (ad) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f75486a, false, 88040, new Class[]{String.class, String.class}, ad.class);
        }
        this.f75487b.putString(str, str2);
        return this;
    }

    public final ad a(@Nullable String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f75486a, false, 88041, new Class[]{String.class, Boolean.TYPE}, ad.class)) {
            return (ad) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f75486a, false, 88041, new Class[]{String.class, Boolean.TYPE}, ad.class);
        }
        this.f75487b.putBoolean(str, z);
        return this;
    }
}
