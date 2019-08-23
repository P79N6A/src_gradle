package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.model.AudioContent;
import com.ss.android.ugc.aweme.im.sdk.utils.b;

public class VoiceMessagesSendViewHolder extends VoiceMessageViewHolder {
    public static ChangeQuickRedirect t;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 51668, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 51668, new Class[0], Void.TYPE);
            return;
        }
        super.a();
    }

    public final void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, t, false, 51669, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, t, false, 51669, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
    }

    public VoiceMessagesSendViewHolder(View view, int i) {
        super(view, i);
    }

    public final void a(n nVar, n nVar2, AudioContent audioContent, int i) {
        AlphaAnimation alphaAnimation;
        n nVar3 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar3, nVar2, audioContent, Integer.valueOf(i)}, this, t, false, 51670, new Class[]{n.class, n.class, AudioContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar3, nVar2, audioContent, Integer.valueOf(i)}, this, t, false, 51670, new Class[]{n.class, n.class, AudioContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.m = nVar3;
        this.r.a(this.m);
        if (audioContent == null) {
            this.p.setText("");
            this.f51160b.setVisibility(8);
            b(1);
            this.m.setMsgStatus(5);
            Object[] objArr = {2000, Float.valueOf(1.0f), Float.valueOf(0.3f)};
            if (PatchProxy.isSupport(objArr, null, b.f52535a, true, 53323, new Class[]{Integer.TYPE, Float.TYPE, Float.TYPE}, AlphaAnimation.class)) {
                Object[] objArr2 = {2000, Float.valueOf(1.0f), Float.valueOf(0.3f)};
                Object[] objArr3 = objArr2;
                alphaAnimation = (AlphaAnimation) PatchProxy.accessDispatch(objArr3, null, b.f52535a, true, 53323, new Class[]{Integer.TYPE, Float.TYPE, Float.TYPE}, AlphaAnimation.class);
            } else {
                alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
                alphaAnimation.setDuration(2000);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setFillBefore(false);
                alphaAnimation.setInterpolator(new LinearInterpolator());
                alphaAnimation.setRepeatMode(2);
                alphaAnimation.setRepeatCount(-1);
            }
            this.i.startAnimation(alphaAnimation);
            return;
        }
        super.a(nVar, nVar2, audioContent, i);
        this.f51160b.setVisibility(0);
        this.q.setVisibility(8);
        b.a(this.i);
    }
}
