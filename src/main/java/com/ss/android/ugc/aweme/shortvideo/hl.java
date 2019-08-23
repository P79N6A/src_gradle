package com.ss.android.ugc.aweme.shortvideo;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.Required;
import com.ss.android.ugc.aweme.base.api.c;

public class hl extends c {
    @SerializedName("appKey")
    @Required

    /* renamed from: a  reason: collision with root package name */
    public String f68154a;
    @SerializedName("fileHostName")
    @Required

    /* renamed from: b  reason: collision with root package name */
    public String f68155b;
    @SerializedName("videoHostName")
    @Required

    /* renamed from: c  reason: collision with root package name */
    public String f68156c;
    @SerializedName("sliceTimeout")

    /* renamed from: d  reason: collision with root package name */
    public int f68157d;
    @SerializedName("sliceRetryCount")

    /* renamed from: e  reason: collision with root package name */
    public int f68158e;
    @SerializedName("sliceSize")

    /* renamed from: f  reason: collision with root package name */
    public int f68159f;
    @SerializedName("fileRetryCount")
    public int g;
    @SerializedName("maxFailTime")
    public int h;
    @SerializedName("authorization")
    @Required
    public String i;
    @SerializedName("enableHttps")
    public int j;
    @SerializedName("enableExternDNS")
    public int k;
    @SerializedName("aliveMaxFailTime")
    public int l = 6;
    @SerializedName("enableTTNetDNS")
    public int m;
    @SerializedName("enablePostMethod")
    public int n;
    @SerializedName("openTimeOut")
    public int o = 5000;
    @SerializedName("uploadRegion")
    public String p;
    @SerializedName("enableExternNet")
    public int q;
    @SerializedName("enableQuic")
    public int r;
    @SerializedName("enableMutitask")
    public int s;
    @SerializedName("ttnetConfigValue")
    public int t;
    @SerializedName("is_stream_upload_enable")
    public int u;
}
