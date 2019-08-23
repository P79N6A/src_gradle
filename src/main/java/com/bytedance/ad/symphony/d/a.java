package com.bytedance.ad.symphony.d;

import android.net.Uri;
import com.bytedance.common.utility.StringUtils;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private String f7611a;

    /* renamed from: b  reason: collision with root package name */
    private String f7612b;

    /* renamed from: c  reason: collision with root package name */
    private String f7613c;

    /* renamed from: d  reason: collision with root package name */
    private String f7614d;

    /* renamed from: e  reason: collision with root package name */
    private String f7615e;

    /* renamed from: f  reason: collision with root package name */
    private String f7616f;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!StringUtils.isEmpty(this.f7611a)) {
            sb.append("&aid=");
            sb.append(Uri.encode(this.f7611a));
        }
        if (!StringUtils.isEmpty(this.f7612b)) {
            sb.append("&channel=");
            sb.append(Uri.encode(this.f7612b));
        }
        if (!StringUtils.isEmpty(this.f7613c)) {
            sb.append("&device_id=");
            sb.append(Uri.encode(this.f7613c));
        }
        if (!StringUtils.isEmpty(this.f7614d)) {
            sb.append("&openudid=");
            sb.append(Uri.encode(this.f7614d));
        }
        if (!StringUtils.isEmpty(this.f7615e)) {
            sb.append("&iid=");
            sb.append(Uri.encode(this.f7615e));
        }
        if (!StringUtils.isEmpty(this.f7616f)) {
            sb.append("&version_code=");
            sb.append(Uri.encode(this.f7616f));
        }
        return sb.toString();
    }
}
