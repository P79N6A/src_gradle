package com.aweme.storage;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

public class a {
    @SerializedName("interval")

    /* renamed from: a  reason: collision with root package name */
    public int f7363a;
    @SerializedName("force")

    /* renamed from: b  reason: collision with root package name */
    public String[] f7364b;
    @SerializedName("file_limit")

    /* renamed from: c  reason: collision with root package name */
    public int f7365c;
    @SerializedName("dir_limit")

    /* renamed from: d  reason: collision with root package name */
    public int f7366d;
    @SerializedName("non_active_duration")

    /* renamed from: e  reason: collision with root package name */
    public int f7367e;
    @SerializedName("non_active_count")

    /* renamed from: f  reason: collision with root package name */
    public int f7368f;
    @SerializedName("non_active_times")
    public int g;
    @SerializedName("too_large_limit")
    public int h;
    @SerializedName("non_active_limit")
    public int i;

    public String toString() {
        return "CacheStrategy{interval=" + this.f7363a + ", forceList=" + Arrays.toString(this.f7364b) + ", fileLimit=" + this.f7365c + ", dirLimit=" + this.f7366d + ", nonActiveDuration=" + this.f7367e + ", nonActiveLimit=" + this.i + '}';
    }
}
