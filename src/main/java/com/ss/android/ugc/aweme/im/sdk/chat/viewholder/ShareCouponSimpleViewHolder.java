package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareCouponContent;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import java.util.HashMap;
import java.util.Map;

public class ShareCouponSimpleViewHolder extends ShareSimpleBaseViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51108b;

    public ShareCouponSimpleViewHolder(View view, int i) {
        super(view, i);
    }

    public void a(n nVar, n nVar2, BaseContent baseContent, int i) {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, baseContent, Integer.valueOf(i)}, this, f51108b, false, 51542, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, baseContent, Integer.valueOf(i)}, this, f51108b, false, 51542, new Class[]{n.class, n.class, BaseContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, baseContent, i);
        ShareCouponContent shareCouponContent = (ShareCouponContent) baseContent;
        this.s.setText(shareCouponContent.getCouponDesc());
        this.t.setVisibility(0);
        this.t.setText(shareCouponContent.getPoiName());
        this.u.setText(C0906R.string.aqj);
        c.b(this.r, shareCouponContent.getMerchantIconUrl());
        this.i.setTag(50331648, 33);
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", shareCouponContent.getPoiId());
        hashMap.put("activity_id", shareCouponContent.getActivityId());
        hashMap.put("coupon_id", shareCouponContent.getCouponId());
        if (nVar.isSelf()) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        hashMap.put("is_self", str);
        hashMap.put("uid", this.h);
        this.i.setTag(67108864, hashMap);
        boolean isSelf = nVar.isSelf();
        if (PatchProxy.isSupport(new Object[]{shareCouponContent, Byte.valueOf(isSelf ? (byte) 1 : 0)}, this, f51108b, false, 51543, new Class[]{ShareCouponContent.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareCouponContent, Byte.valueOf(isSelf)}, this, f51108b, false, 51543, new Class[]{ShareCouponContent.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (isSelf) {
            str2 = this.h;
        } else {
            str2 = d.b().toString();
        }
        if (isSelf) {
            str3 = d.b().toString();
        } else {
            str3 = this.h;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("enter_from", "chat");
        hashMap2.put("from_user_id", str3);
        hashMap2.put("conversation_id", this.m.getConversationId());
        hashMap2.put("to_user_id", str2);
        hashMap2.put("poi_id", shareCouponContent.getPoiId());
        hashMap2.put("coupon_id", shareCouponContent.getCouponId());
        hashMap2.put("activity_id", shareCouponContent.getActivityId());
        r.a("show_receive_coupon_inner", (Map) hashMap2);
    }
}
