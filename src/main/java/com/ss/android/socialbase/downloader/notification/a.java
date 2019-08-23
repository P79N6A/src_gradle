package com.ss.android.socialbase.downloader.notification;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public int f31094a;

    /* renamed from: b  reason: collision with root package name */
    public long f31095b;

    /* renamed from: c  reason: collision with root package name */
    public long f31096c;

    /* renamed from: d  reason: collision with root package name */
    public String f31097d;

    /* renamed from: e  reason: collision with root package name */
    public int f31098e;

    /* renamed from: f  reason: collision with root package name */
    protected long f31099f;

    /* access modifiers changed from: protected */
    public abstract void a(BaseException baseException, boolean z);

    public void a(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            this.f31094a = downloadInfo.getId();
            this.f31097d = downloadInfo.getTitle();
        }
    }

    public a(int i, String str) {
        this.f31094a = i;
        this.f31097d = str;
    }

    public final void a(long j, long j2) {
        this.f31095b = j;
        this.f31096c = j2;
        this.f31098e = 4;
        a((BaseException) null, false);
    }

    public final void a(int i, BaseException baseException, boolean z) {
        if (this.f31098e != i) {
            this.f31098e = i;
            a(baseException, z);
        }
    }
}
