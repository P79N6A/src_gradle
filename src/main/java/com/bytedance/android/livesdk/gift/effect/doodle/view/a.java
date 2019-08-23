package com.bytedance.android.livesdk.gift.effect.doodle.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.e;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.effect.doodle.c.b;
import com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView;
import com.bytedance.android.livesdk.message.model.q;
import com.bytedance.android.livesdk.widget.GiftUserInfoView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayDeque;
import java.util.Queue;

public final class a extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14804a;

    /* renamed from: b  reason: collision with root package name */
    public Queue<b> f14805b;

    /* renamed from: c  reason: collision with root package name */
    public DoodleGiftView f14806c;

    /* renamed from: d  reason: collision with root package name */
    public GiftUserInfoView f14807d;

    /* renamed from: e  reason: collision with root package name */
    int f14808e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14809f;
    AnimatorSet g;
    ObjectAnimator h;
    private com.bytedance.android.livesdk.gift.effect.doodle.a.a i;
    private e j;
    private long k;
    private int l = ((Integer) LiveSettingKeys.LIVE_MESSAGE_QUEUE_MAX_LENGTH.a()).intValue();

    private int getLayoutResource() {
        return C0906R.layout.am7;
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f14804a, false, 9403, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14804a, false, 9403, new Class[0], Void.TYPE);
            return;
        }
        if (this.f14805b.size() > this.l) {
            this.f14805b.remove();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14804a, false, 9404, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14804a, false, 9404, new Class[0], Void.TYPE);
        } else if (!this.f14805b.isEmpty() && !this.f14809f) {
            b poll = this.f14805b.poll();
            setUserInfo(poll);
            this.f14806c.a(poll).a();
            this.f14809f = true;
            com.bytedance.android.live.core.c.a.b("DoodleAnimationView", "播放涂鸦礼物动画， giftMessageId=" + poll.i);
        }
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f14804a, false, 9401, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14804a, false, 9401, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f14804a, false, 9410, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14804a, false, 9410, new Class[0], Void.TYPE);
        } else {
            this.f14805b.clear();
            this.f14809f = false;
            if (this.f14806c != null) {
                this.f14806c.f14801e = true;
                this.f14806c.setVisibility(4);
            }
            if (this.f14807d != null) {
                this.f14807d.setVisibility(4);
            }
            if (this.g != null && this.g.isRunning()) {
                this.g.cancel();
            }
            if (this.h != null && this.h.isRunning()) {
                this.h.cancel();
            }
        }
        super.onDetachedFromWindow();
    }

    public final void setUserEventListener(e eVar) {
        this.j = eVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f14804a, false, 9411, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f14804a, false, 9411, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (this.j != null && this.f14809f) {
            this.j.a(this.k);
        }
    }

    public a(@NonNull Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[]{context}, this, f14804a, false, 9400, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f14804a, false, 9400, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        this.f14808e = (int) getResources().getDimension(C0906R.dimen.r6);
        this.f14807d = (GiftUserInfoView) findViewById(C0906R.id.akr);
        this.f14807d.setOnClickListener(this);
        this.f14807d.setVisibility(4);
        this.f14806c = (DoodleGiftView) findViewById(C0906R.id.a69);
        DoodleGiftView a2 = this.f14806c.a(DoodleGiftView.a.play);
        a2.f14800d = new com.bytedance.android.livesdk.gift.effect.doodle.b.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14810a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f14810a, false, 9414, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f14810a, false, 9414, new Class[0], Void.TYPE);
                    return;
                }
                a.this.f14806c.setVisibility(4);
                a.this.f14807d.setVisibility(4);
                a.this.f14809f = false;
                a.this.a();
            }

            public final void a(long j) {
                if (PatchProxy.isSupport(new Object[]{300L}, this, f14810a, false, 9413, new Class[]{Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{300L}, this, f14810a, false, 9413, new Class[]{Long.TYPE}, Void.TYPE);
                    return;
                }
                a aVar = a.this;
                if (PatchProxy.isSupport(new Object[]{new Long(300)}, aVar, a.f14804a, false, 9408, new Class[]{Long.TYPE}, Void.TYPE)) {
                    a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{new Long(300)}, aVar2, a.f14804a, false, 9408, new Class[]{Long.TYPE}, Void.TYPE);
                    return;
                }
                aVar.h = ObjectAnimator.ofFloat(aVar.f14807d, "alpha", new float[]{1.0f, 0.0f}).setDuration(300);
                aVar.h.start();
            }

            public final void a(long j, float f2) {
                if (PatchProxy.isSupport(new Object[]{300L, Float.valueOf(f2)}, this, f14810a, false, 9412, new Class[]{Long.TYPE, Float.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{300L, Float.valueOf(f2)}, this, f14810a, false, 9412, new Class[]{Long.TYPE, Float.TYPE}, Void.TYPE);
                    return;
                }
                a.this.f14806c.setVisibility(0);
                a.this.f14807d.setVisibility(0);
                a aVar = a.this;
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, aVar, a.f14804a, false, 9406, new Class[]{Float.TYPE}, Void.TYPE)) {
                    a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, aVar2, a.f14804a, false, 9406, new Class[]{Float.TYPE}, Void.TYPE);
                } else {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar.f14807d.getLayoutParams();
                    layoutParams.topMargin = (((int) f2) - ((int) aVar.getResources().getDimension(C0906R.dimen.no))) - ((int) aVar.getResources().getDimension(C0906R.dimen.n3));
                    if (layoutParams.topMargin <= aVar.f14808e) {
                        layoutParams.topMargin = aVar.f14808e;
                    }
                    aVar.f14807d.setLayoutParams(layoutParams);
                }
                a aVar3 = a.this;
                if (PatchProxy.isSupport(new Object[]{new Long(300)}, aVar3, a.f14804a, false, 9407, new Class[]{Long.TYPE}, Void.TYPE)) {
                    a aVar4 = aVar3;
                    PatchProxy.accessDispatch(new Object[]{new Long(300)}, aVar4, a.f14804a, false, 9407, new Class[]{Long.TYPE}, Void.TYPE);
                    return;
                }
                ObjectAnimator duration = ObjectAnimator.ofFloat(aVar3.f14807d, "alpha", new float[]{0.0f, 1.0f}).setDuration(300);
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(aVar3.f14807d, "scaleX", new float[]{0.0f, 1.0f}).setDuration(300);
                ObjectAnimator duration3 = ObjectAnimator.ofFloat(aVar3.f14807d, "scaleY", new float[]{0.0f, 1.0f}).setDuration(300);
                aVar3.g = new AnimatorSet();
                aVar3.g.playTogether(new Animator[]{duration, duration2, duration3});
                aVar3.g.start();
                aVar3.f14807d.post(new Runnable(300) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f14812a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ long f14813b;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f14812a, false, 9415, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f14812a, false, 9415, new Class[0], Void.TYPE);
                            return;
                        }
                        a.this.f14807d.a(this.f14813b);
                    }

                    {
                        this.f14813b = r2;
                    }
                });
            }
        };
        a2.setVisibility(4);
        this.i = new com.bytedance.android.livesdk.gift.effect.doodle.a.a();
        this.f14805b = new ArrayDeque();
    }

    private void setUserInfo(b bVar) {
        ImageModel imageModel;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f14804a, false, 9405, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f14804a, false, 9405, new Class[]{b.class}, Void.TYPE);
        } else if (bVar.l != null) {
            this.k = bVar.l.getId();
            if (!(bVar.l == null || bVar.l.getAvatarThumb() == null)) {
                this.f14807d.setAvatarImage(bVar.l.getAvatarThumb());
            }
            if (bVar.l != null) {
                GiftUserInfoView giftUserInfoView = this.f14807d;
                if (bVar.l.getBorder() != null) {
                    imageModel = bVar.l.getBorder().f7750b;
                } else {
                    imageModel = null;
                }
                giftUserInfoView.setAvatarBorder(imageModel);
            }
            if (!(bVar.l == null || bVar.l.getUserHonor() == null || bVar.l.getUserHonor().k() == null)) {
                this.f14807d.setHonorImage(bVar.l.getUserHonor().k());
            }
            this.f14807d.setUserNameText(bVar.l.getNickName());
            this.f14807d.setDescriptionText(bVar.k);
            this.f14807d.setUserId(this.k);
        }
    }

    public final void a(q qVar) {
        if (PatchProxy.isSupport(new Object[]{qVar}, this, f14804a, false, 9402, new Class[]{q.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{qVar}, this, f14804a, false, 9402, new Class[]{q.class}, Void.TYPE);
            return;
        }
        b a2 = this.i.a(qVar);
        if (a2 != null) {
            this.f14805b.add(a2);
            b();
        }
        a();
    }
}
