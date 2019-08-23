package com.ss.android.ugc.aweme.shortvideo;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.Required;
import com.ss.android.ugc.aweme.base.api.c;

public class hh extends c {
    @SerializedName("appKey")

    /* renamed from: a  reason: collision with root package name */
    public String f68135a;
    @SerializedName("fileHostName")

    /* renamed from: b  reason: collision with root package name */
    public String f68136b;
    @SerializedName("imageHostName")

    /* renamed from: c  reason: collision with root package name */
    public String f68137c;
    @SerializedName("fileRetryCount")

    /* renamed from: d  reason: collision with root package name */
    public int f68138d;
    @SerializedName("sliceSize")

    /* renamed from: e  reason: collision with root package name */
    public int f68139e;
    @SerializedName("sliceTimeout")

    /* renamed from: f  reason: collision with root package name */
    public int f68140f;
    @SerializedName("sliceRetryCount")
    public int g;
    @SerializedName("authorization")
    @Required
    public String h;
}
