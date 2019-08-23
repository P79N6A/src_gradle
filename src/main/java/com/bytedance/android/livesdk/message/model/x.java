package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.message.proto.FollowGuideMessage;
import com.bytedance.android.livesdk.message.proto.ImageStruct;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class x extends c<FollowGuideMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16702a;
    @SerializedName("duration")

    /* renamed from: b  reason: collision with root package name */
    public long f16703b;
    @SerializedName("content")

    /* renamed from: c  reason: collision with root package name */
    public String f16704c;
    @SerializedName("avatar_url")

    /* renamed from: d  reason: collision with root package name */
    public ImageModel f16705d;
    @SerializedName("gift_id")

    /* renamed from: e  reason: collision with root package name */
    public long f16706e;
    @SerializedName("hour_rank_info")

    /* renamed from: f  reason: collision with root package name */
    public String f16707f;

    public x() {
        this.type = a.FOLLOW_GUIDE;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public boolean canText() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f16702a, false, 11046, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16702a, false, 11046, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!StringUtils.isEmpty(this.f16704c)) {
            z = true;
        }
        return z;
    }

    public /* synthetic */ c wrap(Message message) {
        ImageModel imageModel;
        FollowGuideMessage followGuideMessage = (FollowGuideMessage) message;
        if (PatchProxy.isSupport(new Object[]{followGuideMessage}, this, f16702a, false, 11047, new Class[]{FollowGuideMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{followGuideMessage}, this, f16702a, false, 11047, new Class[]{FollowGuideMessage.class}, c.class);
        }
        x xVar = new x();
        xVar.f16703b = ((Long) Wire.get(Long.valueOf(followGuideMessage.duration), 4000L)).longValue();
        xVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(followGuideMessage.common);
        xVar.f16704c = followGuideMessage.content;
        xVar.f16707f = (String) Wire.get(followGuideMessage.hourRankInfo, "");
        ImageStruct imageStruct = followGuideMessage.avatarUrl;
        if (PatchProxy.isSupport(new Object[]{imageStruct}, null, com.bytedance.android.livesdk.message.a.a.f16388a, true, 10964, new Class[]{ImageStruct.class}, ImageModel.class)) {
            imageModel = (ImageModel) PatchProxy.accessDispatch(new Object[]{imageStruct}, null, com.bytedance.android.livesdk.message.a.a.f16388a, true, 10964, new Class[]{ImageStruct.class}, ImageModel.class);
        } else if (imageStruct == null) {
            imageModel = null;
        } else {
            imageModel = new ImageModel(imageStruct.uri, imageStruct.url_list);
        }
        xVar.f16705d = imageModel;
        xVar.f16706e = followGuideMessage.giftId;
        return xVar;
    }
}
