package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.model.AudioContent;

public class VoiceMessageViewHolder extends BaseViewHolder<AudioContent> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51159a;

    /* renamed from: b  reason: collision with root package name */
    protected ImageView f51160b;
    protected TextView p;
    protected View q;
    protected c r;
    public String s = "";
    private final float t = ((float) ((int) UIUtils.dip2Px(GlobalContext.getContext(), 244.0f)));
    private final float u = ((float) ((int) UIUtils.dip2Px(GlobalContext.getContext(), 71.0f)));
    private final int v = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 3.0f));

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51159a, false, 51663, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51159a, false, 51663, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.i = (View) a((int) C0906R.id.yp);
        this.f51160b = (ImageView) a((int) C0906R.id.dv8);
        this.p = (TextView) a((int) C0906R.id.dv9);
        this.q = (View) a((int) C0906R.id.dvc);
        this.j = (ImageView) a((int) C0906R.id.cv9);
        this.r = new c(this.j);
        if (this.i != null) {
            Drawable background = this.i.getBackground();
            if (background != null && Build.VERSION.SDK_INT >= 19) {
                background.setAutoMirrored(true);
            }
        }
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f51159a, false, 51666, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f51159a, false, 51666, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i > 0 && i <= 60) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
            if (i <= 3) {
                layoutParams.width = (int) this.u;
            } else {
                layoutParams.width = (int) (this.u + ((float) (this.v * (i - 3))));
            }
            if (((float) layoutParams.width) > this.t) {
                layoutParams.width = (int) this.t;
            }
            this.i.setLayoutParams(layoutParams);
        }
    }

    public void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51159a, false, 51664, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51159a, false, 51664, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.i.setOnClickListener(onClickListener);
        this.n.a(this.i);
        this.j.setOnClickListener(onClickListener);
        this.n.a(this.j);
    }

    public VoiceMessageViewHolder(View view, int i) {
        super(view);
    }

    public void a(n nVar, n nVar2, AudioContent audioContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, audioContent, Integer.valueOf(i)}, this, f51159a, false, 51665, new Class[]{n.class, n.class, AudioContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, audioContent, Integer.valueOf(i)}, this, f51159a, false, 51665, new Class[]{n.class, n.class, AudioContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, audioContent, i);
        this.r.a(this.m);
        int duration = ((int) audioContent.getDuration()) / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        if (nVar.getLocalExt().get("isPlayed") == null || !nVar.getLocalExt().get("isPlayed").equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
            this.q.setVisibility(0);
        } else {
            this.q.setVisibility(8);
        }
        boolean z = !TextUtils.equals(nVar.getUuid(), this.s);
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51159a, false, 51667, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51159a, false, 51667, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            if (this.f51160b.getBackground() instanceof AnimationDrawable) {
                ((AnimationDrawable) this.f51160b.getBackground()).stop();
            }
            this.f51160b.setBackgroundResource(2130839020);
        } else {
            this.f51160b.setBackgroundResource(2130837619);
            ((AnimationDrawable) this.f51160b.getBackground()).start();
        }
        b(duration);
        this.p.setText(duration + "''");
        this.i.setTag(50331648, 19);
        this.i.setTag(67108864, this.m);
    }
}
