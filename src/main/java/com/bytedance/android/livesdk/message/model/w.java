package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.FansclubReviewMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class w extends c<FansclubReviewMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16699a;

    /* renamed from: b  reason: collision with root package name */
    public int f16700b;

    /* renamed from: c  reason: collision with root package name */
    public String f16701c;

    public w() {
        this.type = a.FANS_CLUB_REVIEW;
    }

    public /* synthetic */ c wrap(Message message) {
        FansclubReviewMessage fansclubReviewMessage = (FansclubReviewMessage) message;
        if (PatchProxy.isSupport(new Object[]{fansclubReviewMessage}, this, f16699a, false, 11044, new Class[]{FansclubReviewMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{fansclubReviewMessage}, this, f16699a, false, 11044, new Class[]{FansclubReviewMessage.class}, c.class);
        }
        w wVar = new w();
        wVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(fansclubReviewMessage.common);
        wVar.f16700b = ((Integer) Wire.get(fansclubReviewMessage.action, 0)).intValue();
        wVar.f16701c = fansclubReviewMessage.content;
        return wVar;
    }
}
