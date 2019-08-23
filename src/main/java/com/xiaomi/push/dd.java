package com.xiaomi.push;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.push.dh;

public class dd extends dh.d {

    /* renamed from: a  reason: collision with root package name */
    protected String f81926a = "MessageDeleteJob";

    public dd(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr);
        this.f81926a = str3;
    }

    public static dd a(String str) {
        return new dd(str, "status = ?", new String[]{PushConstants.PUSH_TYPE_UPLOAD_LOG}, "a job build to delete uploaded job");
    }
}
