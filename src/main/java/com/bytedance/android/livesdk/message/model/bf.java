package com.bytedance.android.livesdk.message.model;

import android.support.annotation.IdRes;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class bf {
    @SerializedName("content")

    /* renamed from: a  reason: collision with root package name */
    public String f16554a;
    @SerializedName("color")

    /* renamed from: b  reason: collision with root package name */
    public String f16555b;
    @SerializedName("traceid")

    /* renamed from: c  reason: collision with root package name */
    public String f16556c;
    @SerializedName("icon")

    /* renamed from: d  reason: collision with root package name */
    public ImageModel f16557d;
    @SerializedName("action_content")

    /* renamed from: e  reason: collision with root package name */
    public String f16558e;
    @SerializedName("action_type")

    /* renamed from: f  reason: collision with root package name */
    public String f16559f = PushConstants.PUSH_TYPE_NOTIFY;
    @SerializedName("push_message_display_time")
    public long g;
    @SerializedName("background_image")
    public ImageModel h;
    @SerializedName("new_background_image")
    public ImageModel i;
    @SerializedName("action_icon")
    public ImageModel j;
    @IdRes
    public transient int k;

    public final long a() {
        if (this.g == 0) {
            return 3;
        }
        return this.g;
    }
}
