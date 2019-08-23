package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.LiveBroadcastFragment;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.ah;
import com.bytedance.android.livesdk.chatroom.event.t;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomVideoAnchorWidget;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomVideoGuestWidget;
import com.bytedance.android.livesdk.chatroom.interact.z;
import com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.FullVideoButtonWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkInRoomAudioWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.co;
import com.bytedance.android.livesdk.common.ViewModuleManager;
import com.bytedance.android.livesdk.honor.HonorUpgradeNotifyWidget;
import com.bytedance.android.livesdk.message.model.af;
import com.bytedance.android.livesdk.n.c;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.j;
import com.bytedance.android.livesdkapi.a.a;
import com.bytedance.android.livesdkapi.d.f;
import com.bytedance.android.livesdkapi.d.g;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PortraitInteractionFragment extends AbsInteractionFragment implements LiveBroadcastFragment.a, LiveBroadcastFragment.b, AbsInteractionFragment.d {
    public static ChangeQuickRedirect S;
    public View T;
    public TextView U;
    LinkControlWidget V;
    public z W;
    public boolean X;
    private View Y;
    private View Z;
    private View aa;
    private AnimationSet ab;
    private AnimationSet ac;
    private int ad;
    private co ae;
    private FullVideoButtonWidget af;
    private FrameLayout ag;
    private View ah;
    private g ai;

    @Nullable
    public final View c() {
        return this.aa;
    }

    public final void a(boolean z, int i) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, this, S, false, 6320, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i)}, this, S, false, 6320, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(z, i);
        if (this.m != null && z) {
            g();
        }
        if (this.o != null) {
            if (PatchProxy.isSupport(new Object[0], this, S, false, 6311, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, S, false, 6311, new Class[0], Void.TYPE);
            } else if (this.h && this.i > 0 && this.f11426c) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
                marginLayoutParams.height = -1;
                marginLayoutParams.topMargin = this.i + ((int) UIUtils.dip2Px(getContext(), 40.0f));
                this.x.lambda$put$1$DataCenter("cmd_update_sticker_position", new ah(UIUtils.getScreenHeight(getContext()) - marginLayoutParams.topMargin));
                if (this.f11426c) {
                    af afVar = new af();
                    afVar.f16444a = (UIUtils.getScreenHeight(getContext()) - marginLayoutParams.topMargin) + ((int) getContext().getResources().getDimension(C0906R.dimen.nz));
                    this.x.lambda$put$1$DataCenter("cmd_normal_gift_layout_bottom_margin_update", Integer.valueOf(afVar.f16444a));
                    af afVar2 = new af();
                    afVar2.f16444a = UIUtils.getScreenHeight(getContext()) - marginLayoutParams.topMargin;
                    this.x.lambda$put$1$DataCenter("cmd_enter_widget_layout_change", afVar2);
                }
                o();
            }
        }
    }

    public final void a(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, S, false, 6321, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, S, false, 6321, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = this.Z;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 6310, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 6310, new Class[0], Void.TYPE);
            return;
        }
        if (!a.f18615c && this.V != null) {
            this.v.add(0, this.V);
        }
        super.e();
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 6305, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 6305, new Class[0], Void.TYPE);
            return;
        }
        if (this.ah != null) {
            this.ah.findViewById(C0906R.id.m8).setVisibility(8);
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 6306, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 6306, new Class[0], Void.TYPE);
            return;
        }
        if (this.ah != null) {
            this.ah.findViewById(C0906R.id.m8).setVisibility(0);
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 6313, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 6313, new Class[0], Void.TYPE);
            return;
        }
        if (this.T != null) {
            this.T.clearAnimation();
        }
        super.onDestroy();
    }

    private void o() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 6325, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 6325, new Class[0], Void.TYPE);
            return;
        }
        if (this.aa != null && this.aa.getVisibility() == 0) {
            ((ViewGroup.MarginLayoutParams) this.aa.getLayoutParams()).topMargin = this.i - ((int) UIUtils.dip2Px(getContext(), 44.0f));
        }
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 6301, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, S, false, 6301, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (getContext() == null || getContext().getResources().getConfiguration().orientation == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final void d() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, S, false, 6309, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 6309, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (Build.VERSION.SDK_INT >= 21 && ((Integer) com.bytedance.android.livesdk.config.a.X.a()).intValue() == 1) {
            this.ae = new co(this.f11425b, getActivity(), new ek(this), this.f11427d);
            this.ae.i = this.x;
            ViewModuleManager viewModuleManager = this.y;
            co coVar = this.ae;
            if (!PatchProxy.isSupport(new Object[]{coVar}, viewModuleManager, ViewModuleManager.f13632a, false, 8090, new Class[]{com.bytedance.android.livesdk.common.a.class}, Void.TYPE)) {
                if (coVar != null && 6 != viewModuleManager.g && !viewModuleManager.f13637f.contains(coVar)) {
                    coVar.n = viewModuleManager;
                    viewModuleManager.f13637f.add(coVar);
                    while (i < viewModuleManager.g) {
                        i++;
                        switch (i) {
                            case 1:
                                coVar.a(viewModuleManager.f13634c, viewModuleManager.f13635d, viewModuleManager.f13636e);
                                break;
                            case 3:
                                coVar.a();
                                break;
                            case 5:
                                coVar.e();
                                break;
                        }
                    }
                }
            } else {
                ViewModuleManager viewModuleManager2 = viewModuleManager;
                PatchProxy.accessDispatch(new Object[]{coVar}, viewModuleManager2, ViewModuleManager.f13632a, false, 8090, new Class[]{com.bytedance.android.livesdk.common.a.class}, Void.TYPE);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.isSupport(new Object[]{configuration}, this, S, false, 6323, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration}, this, S, false, 6323, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        super.onConfigurationChanged(configuration);
        o();
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, S, false, 6302, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, S, false, 6302, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.ad = ac.c();
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, S, false, 6317, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, S, false, 6317, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (f2 > 0.0f) {
            if (this.t.isUsingCamera) {
                com.bytedance.android.livesdk.u.a.a().a((Object) new t(1));
            }
        } else if (this.t.isUsingCamera) {
            com.bytedance.android.livesdk.u.a.a().a((Object) new t(2));
        }
    }

    private AnimationSet g(boolean z) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, S, false, 6316, new Class[]{Boolean.TYPE}, AnimationSet.class)) {
            return (AnimationSet) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, S, false, 6316, new Class[]{Boolean.TYPE}, AnimationSet.class);
        }
        int width = (this.ad - this.U.getWidth()) / 2;
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new LinearOutSlowInInterpolator());
        alphaAnimation.setDuration(300);
        if (z) {
            f2 = (float) (-width);
        } else {
            f2 = (float) width;
        }
        float f6 = 50.0f;
        if (z) {
            f3 = -50.0f;
        } else {
            f3 = 50.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f2, f3, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new LinearOutSlowInInterpolator());
        translateAnimation.setDuration(300);
        if (z) {
            f4 = -50.0f;
        } else {
            f4 = 50.0f;
        }
        if (z) {
            f5 = 50.0f;
        } else {
            f5 = -50.0f;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(f4, f5, 0.0f, 0.0f);
        translateAnimation2.setInterpolator(new LinearInterpolator());
        translateAnimation2.setStartOffset(300);
        translateAnimation2.setDuration(200);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(500);
        alphaAnimation2.setInterpolator(new FastOutSlowInInterpolator());
        alphaAnimation2.setDuration(300);
        if (!z) {
            f6 = -50.0f;
        }
        if (!z) {
            width = -width;
        }
        TranslateAnimation translateAnimation3 = new TranslateAnimation(f6, (float) width, 0.0f, 0.0f);
        translateAnimation3.setStartOffset(500);
        translateAnimation3.setInterpolator(new FastOutSlowInInterpolator());
        translateAnimation3.setDuration(300);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.addAnimation(translateAnimation3);
        animationSet.setAnimationListener(new Animation.AnimationListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f11745a;

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (PatchProxy.isSupport(new Object[]{animation}, this, f11745a, false, 6332, new Class[]{Animation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animation}, this, f11745a, false, 6332, new Class[]{Animation.class}, Void.TYPE);
                    return;
                }
                PortraitInteractionFragment.this.T.setVisibility(4);
            }

            public final void onAnimationStart(Animation animation) {
                if (PatchProxy.isSupport(new Object[]{animation}, this, f11745a, false, 6331, new Class[]{Animation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animation}, this, f11745a, false, 6331, new Class[]{Animation.class}, Void.TYPE);
                    return;
                }
                PortraitInteractionFragment.this.T.setVisibility(0);
            }
        });
        return animationSet;
    }

    public final void a(View view) {
        Window window;
        int i;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, S, false, 6304, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, S, false, 6304, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.ah = view2;
        if (this.X) {
            m();
        } else {
            n();
        }
        view2.findViewById(C0906R.id.bmr).setVisibility(0);
        this.Y = view2.findViewById(C0906R.id.db);
        this.T = view2.findViewById(C0906R.id.ae1);
        this.Z = view2.findViewById(C0906R.id.bgt);
        this.U = (TextView) view2.findViewById(C0906R.id.ae2);
        this.o = view2.findViewById(C0906R.id.bmr);
        this.aa = view2.findViewById(C0906R.id.aiz);
        this.ag = (FrameLayout) view2.findViewById(C0906R.id.wc);
        if (PatchProxy.isSupport(new Object[0], this, S, false, 6324, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 6324, new Class[0], Void.TYPE);
            return;
        }
        if (com.bytedance.android.live.uikit.a.a.f()) {
            Dialog dialog = getDialog();
            if (dialog != null) {
                Window window2 = dialog.getWindow();
                if (window2 != null) {
                    if (getActivity() != null) {
                        window = getActivity().getWindow();
                    } else {
                        window = null;
                    }
                    if (com.bytedance.android.live.core.utils.g.a(getContext())) {
                        if (window != null) {
                            window.clearFlags(1024);
                        }
                        if (PatchProxy.isSupport(new Object[]{window2}, null, com.bytedance.android.live.core.utils.b.a.f8244a, true, 1438, new Class[]{Window.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{window2}, null, com.bytedance.android.live.core.utils.b.a.f8244a, true, 1438, new Class[]{Window.class}, Void.TYPE);
                        } else if (window2 != null && Build.VERSION.SDK_INT >= 21) {
                            window2.addFlags(Integer.MIN_VALUE);
                            window2.clearFlags(67108864);
                            window2.setStatusBarColor(0);
                            View decorView = window2.getDecorView();
                            int systemUiVisibility = decorView.getSystemUiVisibility();
                            if (Build.VERSION.SDK_INT >= 21) {
                                i = 1280;
                            } else if (Build.VERSION.SDK_INT >= 16) {
                                i = 256;
                            } else {
                                i = 0;
                            }
                            decorView.setSystemUiVisibility(systemUiVisibility | i);
                        }
                        UIUtils.updateLayoutMargin(this.Y, 0, UIUtils.getStatusBarHeight(getContext()), 0, 0);
                        return;
                    }
                    if (window != null) {
                        window.addFlags(1024);
                        window.setFlags(1024, 1024);
                    }
                    window2.addFlags(1024);
                    window2.setFlags(1024, 1024);
                }
            }
        }
    }

    public final void a(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, S, false, 6322, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, S, false, 6322, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
        } else if (this.f11425b == null || this.f11425b.getStreamType() != com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
            b((float) j3);
        } else {
            b((float) j4);
        }
    }

    public final void a(final View view, Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, S, false, 6307, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, S, false, 6307, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        if ((this.t == com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO || this.t == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) && !com.bytedance.android.live.uikit.a.a.b() && !com.bytedance.android.live.uikit.a.a.j()) {
            this.V = new LinkControlWidget(new LinkControlWidget.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f11740a;

                public final void a(Widget widget) {
                    Widget widget2 = widget;
                    if (PatchProxy.isSupport(new Object[]{widget2}, this, f11740a, false, 6329, new Class[]{Widget.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{widget2}, this, f11740a, false, 6329, new Class[]{Widget.class}, Void.TYPE);
                        return;
                    }
                    PortraitInteractionFragment.this.A.unload(widget2);
                }

                public final Widget a(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f11740a, false, 6328, new Class[]{Integer.TYPE}, Widget.class)) {
                        return (Widget) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f11740a, false, 6328, new Class[]{Integer.TYPE}, Widget.class);
                    }
                    Widget widget = null;
                    switch (i) {
                        case 0:
                            widget = new LinkInRoomVideoAnchorWidget(PortraitInteractionFragment.this.W);
                            if (PortraitInteractionFragment.this.f11427d && a.f18614b) {
                                ((LinkInRoomVideoAnchorWidget) widget).f10248f = PortraitInteractionFragment.this;
                            }
                            PortraitInteractionFragment.this.A.load(C0906R.id.bra, widget, false);
                            break;
                        case 1:
                            widget = new LinkInRoomVideoGuestWidget((FrameLayout) view.findViewById(C0906R.id.av1));
                            PortraitInteractionFragment.this.A.load(C0906R.id.bra, widget, false);
                            break;
                        case 2:
                            widget = new LinkCrossRoomWidget(PortraitInteractionFragment.this.W, (FrameLayout) view.findViewById(C0906R.id.av1));
                            if (PortraitInteractionFragment.this.f11427d && a.f18614b) {
                                ((LinkCrossRoomWidget) widget).f12605f = PortraitInteractionFragment.this;
                            }
                            PortraitInteractionFragment.this.A.load(C0906R.id.byb, widget, false);
                            break;
                        case 3:
                            widget = new LinkInRoomAudioWidget(PortraitInteractionFragment.this.N);
                            if (PortraitInteractionFragment.this.f11427d && a.f18614b) {
                                ((LinkInRoomAudioWidget) widget).l = PortraitInteractionFragment.this;
                            }
                            PortraitInteractionFragment.this.A.load(C0906R.id.bra, widget, false);
                            break;
                    }
                    return widget;
                }
            });
        }
        if (!this.f11427d && (this.f11425b.isThirdParty || this.f11425b.isScreenshot)) {
            this.af = new FullVideoButtonWidget();
            this.aa.setVisibility(0);
        }
        this.A.load(C0906R.id.av5, this.V).load(C0906R.id.aiz, this.af);
        FrameLayout frameLayout = this.ag;
        DataCenter dataCenter = this.x;
        if (PatchProxy.isSupport(new Object[]{frameLayout, dataCenter}, this, S, false, 6308, new Class[]{FrameLayout.class, DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{frameLayout, dataCenter}, this, S, false, 6308, new Class[]{FrameLayout.class, DataCenter.class}, Void.TYPE);
        } else if (!(this.f11425b == null || this.f11425b.getOwner() == null)) {
            f n = TTLiveSDKContext.getHostService().n();
            if (n != null) {
                this.ai = new g() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f11743a;

                    public final void a(String str, String str2, boolean z) {
                        if (PatchProxy.isSupport(new Object[]{str, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f11743a, false, 6330, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str, str2, Byte.valueOf(z)}, this, f11743a, false, 6330, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE);
                            return;
                        }
                        if (j.b(PortraitInteractionFragment.this.x)) {
                            ((com.bytedance.android.livesdkapi.c.a) b.a(com.bytedance.android.livesdkapi.c.a.class)).a(true, "live_ad", "click_product", j.c(PortraitInteractionFragment.this.x));
                        }
                    }
                };
                n.a(this, String.valueOf(this.f11425b.getOwner().getId()), String.valueOf(this.f11425b.getId()), new com.bytedance.android.livesdk.commerce.a(dataCenter, this.f11425b.hasCommerceGoods, this.f11425b, this.ai));
            }
        }
        this.A.load((int) C0906R.id.aop, HonorUpgradeNotifyWidget.class);
        if (com.bytedance.android.live.uikit.a.a.f()) {
            c cVar = (c) com.bytedance.android.livesdk.v.j.q().k().a(c.class);
            if (cVar != null && !this.h) {
                if (this.f11425b != null && this.f11425b.hasCommerceGoods()) {
                    if (!this.f11427d) {
                        this.A.load((int) C0906R.id.cb8, cVar.c());
                    } else {
                        this.A.load((int) C0906R.id.ala, cVar.d());
                    }
                }
                this.A.load((int) C0906R.id.av3, cVar.a());
                this.A.load((int) C0906R.id.dy_, cVar.h());
                UIUtils.setViewVisibility(view.findViewById(C0906R.id.n9), 0);
                this.A.load((int) C0906R.id.n9, cVar.b());
                this.J = new com.bytedance.android.livesdk.chatroom.widget.g((FrameLayout) view.findViewById(C0906R.id.a4y));
            }
        }
    }

    public final void a(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, S, false, 6315, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, S, false, 6315, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
        } else if (this.f11426c && !TextUtils.isEmpty(str)) {
            this.U.setText(str);
            if (z) {
                if (this.ab == null) {
                    this.ab = g(true);
                } else {
                    this.T.clearAnimation();
                }
                this.T.startAnimation(this.ab);
                return;
            }
            if (this.ac == null) {
                this.ac = g(false);
            } else {
                this.T.clearAnimation();
            }
            this.T.startAnimation(this.ac);
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup2, bundle}, this, S, false, 6303, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return LayoutInflater.from(getContext()).inflate(C0906R.layout.aih, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup2, bundle}, this, S, false, 6303, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i2;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, S, false, 6318, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, S, false, 6318, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (Build.VERSION.SDK_INT >= 21 && 42342 == i && this.ae != null) {
            co coVar = this.ae;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), intent2}, coVar, co.f13089a, false, 7198, new Class[]{Integer.TYPE, Intent.class}, Void.TYPE)) {
                co coVar2 = coVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), intent2}, coVar2, co.f13089a, false, 7198, new Class[]{Integer.TYPE, Intent.class}, Void.TYPE);
            } else if (i3 == 0) {
                ai.a((int) C0906R.string.daj);
                coVar.f13092d = 1;
            } else {
                coVar.f13091c = coVar.f13090b.getMediaProjection(i3, intent2);
                if (coVar.f13091c == null) {
                    ai.a((int) C0906R.string.daj);
                    coVar.f13092d = 1;
                    return;
                }
                coVar.f13091c.registerCallback(coVar.j, coVar.f13093e);
                if (1 == coVar.f13092d) {
                    coVar.a(true);
                } else if (2 == coVar.f13092d) {
                    coVar.b();
                }
            }
        }
    }
}
