package com.bytedance.android.livesdk.rank;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class LiveBackRoomView extends RelativeLayout implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16892a;

    /* renamed from: b  reason: collision with root package name */
    final WeakHandler f16893b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f16894c;

    /* renamed from: d  reason: collision with root package name */
    long f16895d;

    /* renamed from: e  reason: collision with root package name */
    private final int f16896e;

    /* renamed from: f  reason: collision with root package name */
    private HSImageView f16897f;

    public LiveBackRoomView(Context context) {
        this(context, null);
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f16892a, false, 12968, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f16892a, false, 12968, new Class[]{Message.class}, Void.TYPE);
        } else if (message2 != null) {
            if (1100 == message2.what) {
                UIUtils.setViewVisibility(this, 8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setPreHostAvatar(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f16892a, false, 12966, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f16892a, false, 12966, new Class[]{Parcelable.class}, Void.TYPE);
            return;
        }
        if (parcelable instanceof ImageModel) {
            k.a(this.f16897f, (ImageModel) parcelable, this.f16896e, this.f16896e);
        }
    }

    public LiveBackRoomView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveBackRoomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16893b = new WeakHandler(Looper.getMainLooper(), this);
        this.f16895d = 0;
        if (PatchProxy.isSupport(new Object[]{context}, this, f16892a, false, 12965, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16892a, false, 12965, new Class[]{Context.class}, Void.TYPE);
        } else if (context != null) {
            LayoutInflater.from(context).inflate(C0906R.layout.aer, this, true);
            this.f16897f = (HSImageView) findViewById(C0906R.id.dp2);
            UIUtils.updateLayout(this, -3, (int) UIUtils.dip2Px(context, 26.0f));
        }
        this.f16896e = (int) UIUtils.dip2Px(context, 20.0f);
    }
}
