package com.bytedance.android.livesdk.verify.model;

import android.support.annotation.Keep;

@Keep
public class ZhimaStatusResponse {
    public String cert_id;
    public int certification_step;
    public boolean is_verified;
    public String real_name;
}
