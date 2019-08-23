package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.Observer;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.bytedance.android.livesdk.chatroom.c.d;
import com.bytedance.android.livesdk.chatroom.interact.c.gc;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.concurrent.TimeUnit;

public class LinkPKStealTowerWidget extends LinkCrossRoomWidget.SubWidget implements Observer<KVData>, gc.a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f12630e;

    /* renamed from: f  reason: collision with root package name */
    static final int f12631f = Color.parseColor("#ffee00");
    View g;
    View h;
    ForegroundColorSpan i;
    c<TextView> j;
    private boolean k;
    private gc l;
    private ViewGroup m;
    private TextView n;
    private ProgressBar o;
    private ConstraintLayout.LayoutParams p;
    private ConstraintLayout.LayoutParams q;
    private d r;

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12630e, false, 7119, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12630e, false, 7119, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12630e, false, 7120, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12630e, false, 7120, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12630e, false, 7110, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12630e, false, 7110, new Class[0], Void.TYPE);
            return;
        }
        this.f12607b.removeObserver(this);
        this.r.a();
        this.l.d();
        super.onDestroy();
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12630e, false, 7109, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12630e, false, 7109, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.k = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.m = (ViewGroup) this.contentView.findViewById(C0906R.id.bac);
        this.g = this.contentView.findViewById(C0906R.id.djp);
        this.h = this.contentView.findViewById(C0906R.id.djq);
        this.n = (TextView) this.contentView.findViewById(C0906R.id.djs);
        this.o = (ProgressBar) this.contentView.findViewById(C0906R.id.c7z);
        this.p = (ConstraintLayout.LayoutParams) this.g.getLayoutParams();
        this.q = (ConstraintLayout.LayoutParams) this.h.getLayoutParams();
        if (PatchProxy.isSupport(new Object[0], this, f12630e, false, 7111, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12630e, false, 7111, new Class[0], Void.TYPE);
        } else {
            this.r = new d(this.f12607b, this.contentView);
            this.j = this.r.a(C0906R.id.djr).a("data_pk_steal_tower_score", new bx(this)).a();
        }
        this.l = new gc(this.dataCenter);
        this.l.a((gc.a) this);
        this.f12607b.observe("data_pk_steal_tower_state", this);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12630e, false, 7116, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12630e, false, 7116, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.n.setText(ac.a((int) C0906R.string.d78, ah.a((long) i2)));
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12630e, false, 7118, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12630e, false, 7118, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.n.setText(ac.a((int) C0906R.string.d7j, ah.a((long) i2)));
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        long j2;
        ConstraintLayout.LayoutParams layoutParams;
        ConstraintLayout.LayoutParams layoutParams2;
        int i2;
        int i3;
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f12630e, false, 7108, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f12630e, false, 7108, new Class[]{KVData.class}, Void.TYPE);
        } else if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c2 = 65535;
            if (key.hashCode() == 436641052 && key.equals("data_pk_steal_tower_state")) {
                c2 = 0;
            }
            if (c2 == 0) {
                if (kVData.getData().equals(LinkCrossRoomDataHolder.e.READY)) {
                    if (PatchProxy.isSupport(new Object[0], this, f12630e, false, 7112, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f12630e, false, 7112, new Class[0], Void.TYPE);
                    } else {
                        this.m.setVisibility(8);
                        this.o.setVisibility(0);
                        this.n.setBackgroundResource(0);
                        this.n.setVisibility(0);
                        this.g.setBackgroundResource(2130841394);
                        this.h.setBackgroundResource(2130841396);
                    }
                } else if (kVData.getData().equals(LinkCrossRoomDataHolder.e.IN_PROCESS)) {
                    if (PatchProxy.isSupport(new Object[0], this, f12630e, false, 7114, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f12630e, false, 7114, new Class[0], Void.TYPE);
                    } else {
                        this.o.setVisibility(8);
                        this.n.setBackgroundResource(2130840826);
                        a((View) this.j.f9861c, true);
                        a(this.h, true);
                        a(this.g, true);
                        boolean z = this.f12607b.s.f9034b;
                        View view = this.g;
                        if (z) {
                            layoutParams = this.p;
                        } else {
                            layoutParams = this.q;
                        }
                        view.setLayoutParams(layoutParams);
                        View view2 = this.h;
                        if (z) {
                            layoutParams2 = this.q;
                        } else {
                            layoutParams2 = this.p;
                        }
                        view2.setLayoutParams(layoutParams2);
                        switch (this.f12607b.s.g) {
                            case 1:
                                i3 = C0906R.string.d7_;
                                if (!this.k) {
                                    i2 = C0906R.string.d7d;
                                    break;
                                } else {
                                    i2 = C0906R.string.d7a;
                                    break;
                                }
                            case 2:
                                i3 = C0906R.string.d7g;
                                if (!this.k) {
                                    i2 = C0906R.string.d7e;
                                    break;
                                } else {
                                    i2 = C0906R.string.d7b;
                                    break;
                                }
                            default:
                                i3 = C0906R.string.d7i;
                                if (!this.k) {
                                    i2 = C0906R.string.d7f;
                                    break;
                                } else {
                                    i2 = C0906R.string.d7c;
                                    break;
                                }
                        }
                        ai.a(i3);
                        this.l.a(ac.a(i2));
                    }
                } else if (kVData.getData().equals(LinkCrossRoomDataHolder.e.ENDED)) {
                    if (PatchProxy.isSupport(new Object[0], this, f12630e, false, 7115, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f12630e, false, 7115, new Class[0], Void.TYPE);
                        return;
                    }
                    this.m.setVisibility(0);
                    this.n.setVisibility(8);
                    if (this.f12607b.s.f9038f) {
                        ((TextView) this.j.f9861c).setText(C0906R.string.d7h);
                        this.h.setBackgroundResource(2130841397);
                    } else {
                        ((TextView) this.j.f9861c).setText(C0906R.string.d79);
                        this.g.setBackgroundResource(2130841395);
                    }
                    if (this.f12607b.s.f9038f) {
                        j2 = 3000;
                    } else {
                        j2 = 5000;
                    }
                    Observable.timer(j2, TimeUnit.MILLISECONDS).compose(getAutoUnbindTransformer()).observeOn(AndroidSchedulers.mainThread()).subscribe(new by(this), new bz(this));
                }
            }
        }
    }

    LinkPKStealTowerWidget(View view, ViewGroup viewGroup) {
        super(view, viewGroup);
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12630e, false, 7117, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12630e, false, 7117, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.o.getMax() != i3) {
            this.o.setMax(i3);
        }
        this.o.setProgress(i2);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, boolean z) {
        final View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f12630e, false, 7113, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z)}, this, f12630e, false, 7113, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200);
            view2.startAnimation(alphaAnimation);
            view2.setVisibility(0);
        } else {
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(200);
            view2.startAnimation(alphaAnimation2);
            alphaAnimation2.setAnimationListener(new Animation.AnimationListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12632a;

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (PatchProxy.isSupport(new Object[]{animation}, this, f12632a, false, 7124, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation}, this, f12632a, false, 7124, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    view2.setVisibility(8);
                }
            });
        }
    }
}
