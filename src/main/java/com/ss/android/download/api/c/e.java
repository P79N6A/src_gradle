package com.ss.android.download.api.c;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public long f28491a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f28492b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f28493c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f28494d = -1;

    /* renamed from: e  reason: collision with root package name */
    public String f28495e;

    public final void a(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            this.f28491a = (long) downloadInfo.getId();
            int i = 16;
            switch (downloadInfo.getStatus()) {
                case -3:
                    i = 8;
                    break;
                case -2:
                    i = 4;
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    i = 2;
                    break;
            }
            this.f28492b = i;
            this.f28494d = downloadInfo.getCurBytes();
            this.f28493c = downloadInfo.getTotalBytes();
            this.f28495e = downloadInfo.getTargetFilePath();
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!(obj instanceof e) || obj == null) {
            return super.equals(obj);
        }
        e eVar = (e) obj;
        if (this.f28491a == eVar.f28491a) {
            z = true;
        } else {
            z = false;
        }
        if (this.f28492b == eVar.f28492b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f28493c == eVar.f28493c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((!TextUtils.isEmpty(this.f28495e) || !TextUtils.isEmpty(eVar.f28495e)) && (TextUtils.isEmpty(this.f28495e) || TextUtils.isEmpty(eVar.f28495e) || !this.f28495e.equals(eVar.f28495e))) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z || !z2 || !z3 || !z4) {
            return false;
        }
        return true;
    }
}
