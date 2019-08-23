package com.bytedance.android.livesdk.wallet;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LiveDialogFragment;
import android.support.v4.view.ViewPager;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.d.e;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.i;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.live.core.utils.q;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.f.c;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.ui.eo;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.g.b;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.popup.d;
import com.bytedance.android.livesdk.utils.af;
import com.bytedance.android.livesdk.wallet.ReChargeHalDialogListAdapter;
import com.bytedance.android.livesdk.wallet.a.a;
import com.bytedance.android.livesdk.wallet.adapter.RechargeCnPagerAdapter;
import com.bytedance.android.livesdk.wallet.api.WalletApi;
import com.bytedance.android.livesdk.wallet.fragment.BalanceChangeDialogFragment;
import com.bytedance.android.livesdk.wallet.fragment.PreBonusHintDialogFragment;
import com.bytedance.android.livesdkapi.depend.d.k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.r;
import com.bytedance.common.utility.Lists;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.facebook.drawee.controller.ControllerListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.aspectj.lang.a;
import org.jetbrains.annotations.NotNull;

public class RechargeDialog extends LiveDialogFragment implements f {
    private static final int A = ac.a(10.0f);
    private static final int B = ac.a(72.0f);
    private static final int C = ac.a(42.0f);
    private static final int D = ac.a(16.0f);

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17799a;
    private static final int y = ac.a(3.0f);
    private static final int z = ac.a(6.0f);
    private Handler E = new Handler();
    private LoadingStatusView F;
    private ImageView G;
    private ImageView H;
    @Nullable
    private FrameLayout I;
    private RechargeCnPagerAdapter J;
    private ProgressDialog K;
    private boolean L;
    private String M;
    private String N;
    private CompositeDisposable O = new CompositeDisposable();
    private Disposable P;
    private int Q = 0;
    private long R = 0;

    /* renamed from: b  reason: collision with root package name */
    TextView f17800b;

    /* renamed from: c  reason: collision with root package name */
    public RadioButton f17801c;

    /* renamed from: d  reason: collision with root package name */
    public FrameLayout f17802d;

    /* renamed from: e  reason: collision with root package name */
    public HSImageView f17803e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    TextView f17804f;
    View g;
    TextView h;
    TextView i;
    long j;
    public ViewPager k;
    public LinearLayout l;
    public a m;
    public e n;
    public Activity o;
    public boolean p;
    public String q;
    public String r;
    @Nullable
    k s;
    public DataCenter t;
    ObjectAnimator u;
    public int v;
    public long w = 0;
    public c x;

    public interface a {
    }

    private <T> void a(Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f17799a, false, 14042, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls}, this, f17799a, false, 14042, new Class[]{Class.class}, Void.TYPE);
            return;
        }
        this.O.add(com.bytedance.android.livesdk.u.a.a().a(cls).subscribe((Consumer<? super T>) new Consumer<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f17819a;

            public final void accept(T t) throws Exception {
                if (PatchProxy.isSupport(new Object[]{t}, this, f17819a, false, 14094, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{t}, this, f17819a, false, 14094, new Class[]{Object.class}, Void.TYPE);
                } else if (t instanceof b) {
                    RechargeDialog.this.onEvent((b) t);
                } else {
                    if (t instanceof com.bytedance.android.livesdk.g.c) {
                        RechargeDialog.this.onEvent((com.bytedance.android.livesdk.g.c) t);
                    }
                }
            }
        }));
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f17799a, false, 14048, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f17799a, false, 14048, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        c(exc2, 0);
    }

    public final void a(int i2, com.bytedance.android.livesdk.wallet.a.a aVar) {
        PreBonusHintDialogFragment preBonusHintDialogFragment;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), aVar}, this, f17799a, false, 14049, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), aVar}, this, f17799a, false, 14049, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.g.c(i2));
        boolean z3 = TTLiveSDKContext.getHostService().k().a().getPayScores() <= 0;
        TTLiveSDKContext.getHostService().k().e();
        if (!z3 || LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE.a() == null) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f17799a, false, 14050, new Class[]{com.bytedance.android.livesdk.wallet.a.a.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f17799a, false, 14050, new Class[]{com.bytedance.android.livesdk.wallet.a.a.class}, Boolean.TYPE)).booleanValue();
            } else if (!(aVar == null || aVar.b() == null)) {
                a.b b2 = aVar.b();
                if (!TextUtils.isEmpty(b2.f17866b)) {
                    String str = b2.f17866b;
                    List<com.bytedance.android.livesdk.wallet.a.b> list = b2.f17868d;
                    boolean z4 = this.p;
                    if (PatchProxy.isSupport(new Object[]{str, list, Byte.valueOf(z4 ? (byte) 1 : 0)}, null, PreBonusHintDialogFragment.f18094a, true, 14199, new Class[]{String.class, List.class, Boolean.TYPE}, PreBonusHintDialogFragment.class)) {
                        preBonusHintDialogFragment = (PreBonusHintDialogFragment) PatchProxy.accessDispatch(new Object[]{str, list, Byte.valueOf(z4)}, null, PreBonusHintDialogFragment.f18094a, true, 14199, new Class[]{String.class, List.class, Boolean.TYPE}, PreBonusHintDialogFragment.class);
                    } else {
                        PreBonusHintDialogFragment preBonusHintDialogFragment2 = new PreBonusHintDialogFragment();
                        Bundle bundle = new Bundle();
                        bundle.putString("KEY_PREBONUS_HINT_TITLE", str);
                        preBonusHintDialogFragment2.f18097d = z4;
                        preBonusHintDialogFragment2.f18098e = list;
                        preBonusHintDialogFragment2.setArguments(bundle);
                        preBonusHintDialogFragment = preBonusHintDialogFragment2;
                    }
                    preBonusHintDialogFragment.f18095b = new c() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f17853a;

                        public final void a(DialogInterface dialogInterface) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f17853a, false, 14087, new Class[]{DialogInterface.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f17853a, false, 14087, new Class[]{DialogInterface.class}, Void.TYPE);
                                return;
                            }
                            RechargeDialog.this.dismissAllowingStateLoss();
                        }
                    };
                    preBonusHintDialogFragment.f18096c = new PreBonusHintDialogFragment.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f17855a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f17855a, false, 14088, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f17855a, false, 14088, new Class[0], Void.TYPE);
                                return;
                            }
                            RechargeDialog.this.a(false);
                        }
                    };
                    FragmentManager supportFragmentManager = ((FragmentActivity) this.o).getSupportFragmentManager();
                    if (supportFragmentManager.findFragmentByTag("PRE_BONUS_HINT_FRAGMENT_TAG") == null) {
                        preBonusHintDialogFragment.show(supportFragmentManager, "PRE_BONUS_HINT_FRAGMENT_TAG");
                        z2 = true;
                    }
                }
            }
            if (!z2) {
                com.bytedance.android.live.uikit.d.a.a((Context) this.o, this.o.getResources().getString(C0906R.string.cqj));
                dismissAllowingStateLoss();
            } else if (this.n != null) {
                this.n.c();
            }
        } else {
            com.bytedance.android.live.uikit.d.a.a((Context) this.o, this.o.getResources().getString(C0906R.string.d2v));
            dismissAllowingStateLoss();
        }
        if (this.m != null && this.m.isShowing()) {
            this.m.setOnDismissListener(null);
            this.m.dismiss();
            this.m = null;
        }
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.b bVar) {
        com.bytedance.android.livesdk.popup.a aVar;
        com.bytedance.android.livesdkapi.depend.model.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f17799a, false, 14055, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f17799a, false, 14055, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.class}, Void.TYPE);
            return;
        }
        if (bVar2 == null || bVar2.f18686a.isEmpty()) {
            this.F.c();
            a((List<com.bytedance.android.livesdkapi.depend.model.a>) new ArrayList<com.bytedance.android.livesdkapi.depend.model.a>(), 0);
        } else {
            this.F.a();
            a(bVar2.f18686a, bVar2.f18687b.f18688a);
            if (this.p && this.I != null && this.I.getVisibility() == 0 && !((Boolean) com.bytedance.android.livesdk.w.b.ao.a()).booleanValue()) {
                View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.alu, null);
                ((ImageView) inflate.findViewById(C0906R.id.az0)).setColorFilter(ac.b((int) C0906R.color.aa9));
                d a2 = d.a(getContext());
                if (PatchProxy.isSupport(new Object[]{inflate}, a2, com.bytedance.android.livesdk.popup.a.f16841a, false, 12775, new Class[]{View.class}, com.bytedance.android.livesdk.popup.a.class)) {
                    d dVar = a2;
                    aVar = (com.bytedance.android.livesdk.popup.a) PatchProxy.accessDispatch(new Object[]{inflate}, dVar, com.bytedance.android.livesdk.popup.a.f16841a, false, 12775, new Class[]{View.class}, com.bytedance.android.livesdk.popup.a.class);
                } else {
                    a2.f16844d = inflate;
                    a2.f16845e = 0;
                    aVar = a2.a();
                }
                final d dVar2 = (d) ((d) ((d) ((d) aVar).b(C)).a(true)).b();
                dVar2.a(this.I, 1, 3, D, 0);
                this.E.postDelayed(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f17857a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f17857a, false, 14089, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f17857a, false, 14089, new Class[0], Void.TYPE);
                            return;
                        }
                        dVar2.dismiss();
                    }
                }, 3000);
                com.bytedance.android.livesdk.w.b.ao.a(Boolean.TRUE);
            }
            if (com.bytedance.android.live.uikit.a.a.d() && !((Boolean) com.bytedance.android.livesdk.w.b.ap.a()).booleanValue() && this.J.getCount() > 1) {
                b(false);
            }
        }
        com.bytedance.android.livesdk.wallet.b.b.d(0, SystemClock.uptimeMillis() - this.w, null);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f17799a, false, 14056, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f17799a, false, 14056, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        String a2 = ac.a(i2);
        if (this.K == null) {
            this.K = af.a(this.o, a2);
            this.K.setCancelable(false);
            this.K.setCanceledOnTouchOutside(false);
        }
        if (this.K != null && !this.K.isShowing()) {
            this.K.setMessage(a2);
            this.K.show();
        }
    }

    public final void a(Exception exc, int i2) {
        if (PatchProxy.isSupport(new Object[]{exc, 0}, this, f17799a, false, 14058, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, 0}, this, f17799a, false, 14058, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.F.d();
        a((List<com.bytedance.android.livesdkapi.depend.model.a>) new ArrayList<com.bytedance.android.livesdkapi.depend.model.a>(), 0);
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", exc.getMessage());
        long uptimeMillis = SystemClock.uptimeMillis() - this.w;
        if (PatchProxy.isSupport(new Object[]{1, new Long(uptimeMillis), hashMap}, null, com.bytedance.android.livesdk.wallet.b.b.f17975a, true, 14241, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{1, new Long(uptimeMillis), hashMap}, null, com.bytedance.android.livesdk.wallet.b.b.f17975a, true, 14241, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE);
        } else {
            e.a(com.bytedance.android.live.core.d.d.b("ttlive_charge_package_list_status"), 1, uptimeMillis, (Map<String, Object>) hashMap);
        }
        com.bytedance.android.livesdk.wallet.b.b.d(1, SystemClock.uptimeMillis() - this.w, hashMap);
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar) {
        com.bytedance.android.livesdkapi.depend.model.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f17799a, false, 14061, new Class[]{com.bytedance.android.livesdkapi.depend.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17799a, false, 14061, new Class[]{com.bytedance.android.livesdkapi.depend.model.a.class}, Void.TYPE);
        } else if (this.o == null || this.o.isFinishing()) {
            com.bytedance.android.live.core.c.a.c("RechargeDialog", String.valueOf(getActivity()));
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("money", String.valueOf(aVar2.f18682e + aVar2.f18683f));
            hashMap.put("request_page", this.r);
            hashMap.put("charge_reason", this.q);
            if (this.Q == 1 || this.Q == 2) {
                hashMap.put("panel_type", "first_recharge");
            } else {
                hashMap.put("panel_type", "normal");
            }
            if (d.a() == 1) {
                hashMap.put("cj_checkout", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                this.n.a(aVar2, !this.L || this.o.getResources().getConfiguration().orientation == 2, (a) new a() {
                });
            } else {
                hashMap.put("cj_checkout", PushConstants.PUSH_TYPE_NOTIFY);
                if (this.m == null) {
                    if (com.bytedance.android.live.uikit.a.a.a() || com.bytedance.android.live.uikit.a.a.f() || com.bytedance.android.live.uikit.a.a.b()) {
                        ae aeVar = new ae(this.o, this.n, this.q, this.r, this.Q);
                        this.m = aeVar;
                    } else {
                        this.m = new v(this.o, ((Integer) LiveSettingKeys.SHOW_HUOLI_BUY_DIAMON.a()).intValue() == 1, this.q, this.r);
                    }
                    this.m.setOnDismissListener(new DialogInterface.OnDismissListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f17807a;

                        public final void onDismiss(DialogInterface dialogInterface) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f17807a, false, 14090, new Class[]{DialogInterface.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f17807a, false, 14090, new Class[]{DialogInterface.class}, Void.TYPE);
                                return;
                            }
                            RechargeDialog.this.a(false);
                            RechargeDialog.this.m = null;
                        }
                    });
                } else if (this.m.isShowing()) {
                    this.m.dismiss();
                }
                this.m.a(aVar2);
                this.m.setCanceledOnTouchOutside(true);
                this.m.show();
                com.bytedance.android.livesdk.j.a.a().a("livesdk_check_out_show", hashMap, j.class, Room.class);
            }
            com.bytedance.android.livesdk.j.a.a().a("livesdk_recharge_click", hashMap, j.class, Room.class);
            a(true);
        }
    }

    public final void a(final boolean z2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f17799a, false, 14062, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f17799a, false, 14062, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        final View view = getView();
        if (view != null) {
            if (z2) {
                if (this.p) {
                    i2 = view.getHeight();
                } else {
                    i2 = view.getWidth();
                }
                this.v = i2;
            }
            view.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17813a;

                public final void run() {
                    TranslateAnimation translateAnimation;
                    float f2;
                    float f3;
                    float f4;
                    float f5;
                    if (PatchProxy.isSupport(new Object[0], this, f17813a, false, 14092, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f17813a, false, 14092, new Class[0], Void.TYPE);
                        return;
                    }
                    if (RechargeDialog.this.p) {
                        if (z2) {
                            f4 = 0.0f;
                        } else {
                            f4 = (float) RechargeDialog.this.v;
                        }
                        if (z2) {
                            f5 = (float) RechargeDialog.this.v;
                        } else {
                            f5 = 0.0f;
                        }
                        new TranslateAnimation(0.0f, 0.0f, f4, f5);
                    } else {
                        if (z2) {
                            f2 = 0.0f;
                        } else {
                            f2 = (float) RechargeDialog.this.v;
                        }
                        if (z2) {
                            f3 = (float) RechargeDialog.this.v;
                        } else {
                            f3 = 0.0f;
                        }
                        new TranslateAnimation(f2, f3, 0.0f, 0.0f);
                    }
                    translateAnimation.setDuration(300);
                    translateAnimation.setFillAfter(true);
                    view.startAnimation(translateAnimation);
                }
            });
        }
    }

    private void a(List<com.bytedance.android.livesdkapi.depend.model.a> list, int i2) {
        View view;
        List<com.bytedance.android.livesdkapi.depend.model.a> list2 = list;
        int i3 = i2;
        int i4 = 2;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i2)}, this, f17799a, false, 14064, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i2)}, this, f17799a, false, 14064, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.l.removeAllViews();
        if (Lists.isEmpty(list)) {
            this.J.a(new ArrayList(), 0);
        } else {
            this.J.a(list, i3);
        }
        if (list.size() > 3 && list.size() <= 9) {
            i4 = list.size() / 3;
            if (list.size() % 3 != 0) {
                i4++;
            }
        }
        int i5 = i4 * B;
        if (this.k.getHeight() != i5) {
            ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
            layoutParams.height = i5;
            this.k.setLayoutParams(layoutParams);
        }
        this.J.notifyDataSetChanged();
        int count = this.J.getCount();
        if (count > 1) {
            int i6 = 0;
            while (true) {
                if (i6 >= list.size()) {
                    break;
                } else if (((long) i3) == list.get(i6).f18678a) {
                    this.k.setCurrentItem(i6 / 6);
                    break;
                } else {
                    i6++;
                }
            }
            int i7 = 0;
            while (i7 < count) {
                LinearLayout linearLayout = this.l;
                byte b2 = this.k.getCurrentItem() == i7 ? (byte) 1 : 0;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(b2)}, this, f17799a, false, 14065, new Class[]{Boolean.TYPE}, View.class)) {
                    view = (View) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(b2)}, this, f17799a, false, 14065, new Class[]{Boolean.TYPE}, View.class);
                } else {
                    view = new View(getContext());
                    view.setBackgroundResource(b2 != 0 ? 2130841513 : 2130841514);
                    int i8 = z;
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i8, i8);
                    marginLayoutParams.leftMargin = y;
                    marginLayoutParams.rightMargin = y;
                    view.setLayoutParams(marginLayoutParams);
                }
                linearLayout.addView(view);
                i7++;
            }
        }
    }

    private static String a(DataCenter dataCenter, String str) {
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{dataCenter2, str}, null, f17799a, true, 14073, new Class[]{DataCenter.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{dataCenter2, str}, null, f17799a, true, 14073, new Class[]{DataCenter.class, String.class}, String.class);
        }
        com.bytedance.android.livesdkapi.i.c cVar = (com.bytedance.android.livesdkapi.i.c) LiveSettingKeys.LIVE_FIRST_CHARGE_TIP_INFO.a();
        User user = (User) dataCenter2.get("data_user_in_room");
        if (!com.bytedance.android.live.uikit.a.a.a() || user == null || !user.isNeverRecharge() || cVar == null || cVar.f18815d != 1) {
            return null;
        }
        return cVar.f18812a;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f17799a, false, 14053, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17799a, false, 14053, new Class[0], Void.TYPE);
            return;
        }
        this.F.b();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f17799a, false, 14054, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17799a, false, 14054, new Class[0], Void.TYPE);
            return;
        }
        this.F.a();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f17799a, false, 14057, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17799a, false, 14057, new Class[0], Void.TYPE);
            return;
        }
        if (this.K != null && this.K.isShowing()) {
            this.K.dismiss();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f17799a, false, 14052, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17799a, false, 14052, new Class[0], Void.TYPE);
            return;
        }
        if (((Integer) LiveSettingKeys.TTLIVE_PAY_TYPE.a()).intValue() == 1) {
            a(false);
        }
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f17799a, false, 14067, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17799a, false, 14067, new Class[0], Void.TYPE);
        } else if (getFragmentManager() != null) {
            super.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f17799a, false, 14046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17799a, false, 14046, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.android.live.f.a n2 = com.bytedance.android.livesdk.v.j.q().n();
        View view = this.g;
        if (TextUtils.isEmpty(n2.f())) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (!TextUtils.isEmpty(n2.f())) {
            this.h.setText(n2.f());
            List<com.bytedance.android.livesdk.wallet.a.b> g2 = n2.g();
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf("");
            if (g2 != null) {
                for (int i3 = 0; i3 < g2.size(); i3++) {
                    com.bytedance.android.livesdk.wallet.a.b bVar = g2.get(i3);
                    String str = bVar.f17870b;
                    String str2 = bVar.f17869a;
                    int length = valueOf.length();
                    valueOf.append(str).append(str2).append("   ");
                    valueOf.setSpan(new ForegroundColorSpan(ac.b((int) C0906R.color.aa9)), str.length() + length, length + str.length() + str2.length(), 33);
                }
            }
            this.i.setText(valueOf);
        }
    }

    public void onCreate(Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f17799a, false, 14040, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f17799a, false, 14040, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (this.p) {
            i2 = C0906R.style.v0;
        } else {
            i2 = C0906R.style.v1;
        }
        setStyle(1, i2);
        this.R = SystemClock.uptimeMillis();
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f17799a, false, 14044, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f17799a, false, 14044, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            if (this.p) {
                window.setGravity(80);
                window.setLayout(-1, -2);
            } else {
                window.addFlags(1024);
                int b2 = ac.b();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 8388693;
                window.setLayout(b2, b2);
                window.setAttributes(attributes);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return onCreateDialog;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f17799a, false, 14066, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f17799a, false, 14066, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onDismiss(dialogInterface);
        if (this.x != null) {
            this.x.a(dialogInterface);
        }
        if (this.n != null) {
            this.n.d();
        }
        if (this.P != null && !this.P.isDisposed()) {
            this.P.dispose();
        }
        if (this.O != null) {
            this.O.clear();
        }
        if (this.m != null && this.m.isShowing()) {
            this.m.dismiss();
        }
        this.E.removeCallbacksAndMessages(null);
        if (this.u != null) {
            this.u.cancel();
        }
    }

    public void onEvent(com.bytedance.android.livesdk.g.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f17799a, false, 14060, new Class[]{com.bytedance.android.livesdk.g.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f17799a, false, 14060, new Class[]{com.bytedance.android.livesdk.g.c.class}, Void.TYPE);
            return;
        }
        if (this.m != null && this.m.isShowing()) {
            this.m.dismiss();
        }
        if (!com.bytedance.android.live.uikit.a.a.d()) {
            dismissAllowingStateLoss();
        }
    }

    public final void b(boolean z2) {
        float f2;
        float f3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f17799a, false, 14063, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f17799a, false, 14063, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int width = this.f17802d.getWidth();
        FrameLayout frameLayout = this.f17802d;
        float[] fArr = new float[2];
        if (z2) {
            f2 = 0.0f;
        } else {
            f2 = (float) width;
        }
        fArr[0] = f2;
        if (z2) {
            f3 = (float) width;
        } else {
            f3 = 0.0f;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, "translationX", fArr);
        ofFloat.setDuration(500);
        ofFloat.start();
        if (!z2) {
            this.u = ObjectAnimator.ofFloat(this.H, "translationX", new float[]{0.0f, (float) A});
            this.u.setDuration(560);
            this.u.setRepeatCount(-1);
            this.u.setRepeatMode(2);
            this.u.start();
            return;
        }
        if (this.u != null) {
            this.u.cancel();
        }
    }

    public void onEvent(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f17799a, false, 14059, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f17799a, false, 14059, new Class[]{b.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdkapi.depend.model.a aVar = bVar.f14629a;
        if (aVar != null) {
            if (bVar.f14630b == r.ALIPAY || bVar.f14630b == r.TEST || bVar.f14630b == r.WEIXIN) {
                this.n.a(aVar, bVar.f14630b);
                return;
            }
            if (bVar.f14630b == r.FIRE) {
                try {
                    com.bytedance.android.livesdk.v.j.q().f().a(getContext(), com.bytedance.android.livesdk.browser.c.c.b(i.a("https://hotsoon.snssdk.com/hotsoon/in_app/charge/exchange/balance_pay/?from=app&diamond_count=%d&giving_count=%d&price=%d&diamond_id=%d", Integer.valueOf(aVar.f18682e), Integer.valueOf(aVar.f18683f), Integer.valueOf(aVar.f18680c), Long.valueOf(aVar.f18678a))));
                    if (this.m != null && this.m.isShowing()) {
                        this.m.dismiss();
                    }
                } catch (NullPointerException unused) {
                }
            }
        }
    }

    private void c(Exception exc, int i2) {
        if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i2)}, this, f17799a, false, 14047, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i2)}, this, f17799a, false, 14047, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
        } else if (exc instanceof com.bytedance.android.live.a.a.b.a) {
            com.bytedance.android.live.uikit.d.a.a((Context) this.o, ((com.bytedance.android.live.a.a.b.a) exc).getPrompt());
        } else if (i2 <= 0) {
            com.bytedance.android.live.uikit.d.a.a((Context) this.o, (int) C0906R.string.cqc);
        } else {
            com.bytedance.android.live.uikit.d.a.a((Context) this.o, i2);
        }
    }

    public final void b(Exception exc, int i2) {
        if (PatchProxy.isSupport(new Object[]{exc, 0}, this, f17799a, false, 14051, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, 0}, this, f17799a, false, 14051, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        c(exc, 0);
        if (((Integer) LiveSettingKeys.TTLIVE_PAY_TYPE.a()).intValue() == 1) {
            a(false);
        }
    }

    public static RechargeDialog a(@NonNull FragmentActivity fragmentActivity, boolean z2, String str) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity, Byte.valueOf(z2 ? (byte) 1 : 0), str}, null, f17799a, true, 14069, new Class[]{FragmentActivity.class, Boolean.TYPE, String.class}, RechargeDialog.class)) {
            return a(fragmentActivity, z2, str, "live_detail", 0, null, null);
        }
        return (RechargeDialog) PatchProxy.accessDispatch(new Object[]{fragmentActivity, Byte.valueOf(z2), str}, null, f17799a, true, 14069, new Class[]{FragmentActivity.class, Boolean.TYPE, String.class}, RechargeDialog.class);
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        k kVar;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f17799a, false, 14041, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f17799a, false, 14041, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.ah7, viewGroup2, false);
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f17799a, false, 14043, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f17799a, false, 14043, new Class[]{View.class}, Void.TYPE);
        } else {
            this.F = (LoadingStatusView) inflate.findViewById(C0906R.id.cvd);
            View inflate2 = LayoutInflater.from(getContext()).inflate(C0906R.layout.al5, null);
            inflate2.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17821a;

                /* renamed from: c  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f17822c;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f17821a, true, 14096, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f17821a, true, 14096, new Class[0], Void.TYPE);
                        return;
                    }
                    org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("RechargeDialog.java", AnonymousClass16.class);
                    f17822c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.wallet.RechargeDialog$5", "android.view.View", NotifyType.VIBRATE, "", "void"), 360);
                }

                public void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f17821a, false, 14095, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f17821a, false, 14095, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f17822c, this, this, view));
                    RechargeDialog.this.w = SystemClock.uptimeMillis();
                    RechargeDialog.this.n.c();
                }
            });
            this.F.setBuilder(LoadingStatusView.a.a(getContext()).b((int) C0906R.string.cvn).c(inflate2).a(getContext().getResources().getDimensionPixelSize(C0906R.dimen.ms)));
            this.f17800b = (TextView) inflate.findViewById(C0906R.id.ja);
            this.G = (ImageView) inflate.findViewById(C0906R.id.b0m);
            this.f17803e = (HSImageView) inflate.findViewById(C0906R.id.je);
            if (!TextUtils.isEmpty(this.N)) {
                this.f17803e.setVisibility(0);
                com.bytedance.android.live.core.utils.fresco.a.a(inflate.getContext()).a(this.N).a(ImageView.ScaleType.CENTER_INSIDE).a((ControllerListener) new k.a(null, new q.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f17824a;

                    public final void a(ImageModel imageModel) {
                    }

                    public final void a(ImageModel imageModel, Exception exc) {
                        if (PatchProxy.isSupport(new Object[]{imageModel, exc}, this, f17824a, false, 14098, new Class[]{ImageModel.class, Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{imageModel, exc}, this, f17824a, false, 14098, new Class[]{ImageModel.class, Exception.class}, Void.TYPE);
                            return;
                        }
                        RechargeDialog.this.f17803e.setVisibility(8);
                    }

                    public final void a(ImageModel imageModel, int i, int i2, boolean z) {
                        if (PatchProxy.isSupport(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f17824a, false, 14097, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f17824a, false, 14097, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams = RechargeDialog.this.f17803e.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) RechargeDialog.this.f17803e.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = (int) (((((float) (ac.c() - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin))) * 1.0f) / ((float) i)) * ((float) i2));
                        RechargeDialog.this.f17803e.setLayoutParams(layoutParams);
                    }
                })).a((ImageView) this.f17803e);
            }
            this.f17802d = (FrameLayout) inflate.findViewById(C0906R.id.ai5);
            this.f17802d.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17826a;

                /* renamed from: c  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f17827c;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f17826a, true, 14100, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f17826a, true, 14100, new Class[0], Void.TYPE);
                        return;
                    }
                    org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("RechargeDialog.java", AnonymousClass18.class);
                    f17827c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.wallet.RechargeDialog$7", "android.view.View", NotifyType.VIBRATE, "", "void"), 406);
                }

                public void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f17826a, false, 14099, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f17826a, false, 14099, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f17827c, this, this, view));
                    RechargeDialog.this.k.setCurrentItem(1);
                }
            });
            this.H = (ImageView) inflate.findViewById(C0906R.id.az6);
            TextView textView = (TextView) inflate.findViewById(C0906R.id.a4u);
            this.f17801c = (RadioButton) inflate.findViewById(C0906R.id.ca5);
            this.f17801c.setChecked(((Boolean) com.bytedance.android.livesdkapi.e.a.f18751f.a()).booleanValue());
            this.f17801c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17829a;

                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f17829a, false, 14101, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f17829a, false, 14101, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdkapi.e.a.f18751f.a(Boolean.valueOf(z));
                }
            });
            String a2 = ac.a((int) C0906R.string.cqg);
            String a3 = ac.a((int) C0906R.string.cqi);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(a2 + a3);
            valueOf.setSpan(new UnderlineSpan() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17833a;

                public final void updateDrawState(@NonNull TextPaint textPaint) {
                    TextPaint textPaint2 = textPaint;
                    if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f17833a, false, 14102, new Class[]{TextPaint.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f17833a, false, 14102, new Class[]{TextPaint.class}, Void.TYPE);
                        return;
                    }
                    textPaint2.setColor(ac.b((int) C0906R.color.a_v));
                    textPaint2.setUnderlineText(true);
                }
            }, 0, a2.length(), 18);
            valueOf.setSpan(new UnderlineSpan() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17831a;

                public final void updateDrawState(@NonNull TextPaint textPaint) {
                    TextPaint textPaint2 = textPaint;
                    if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f17831a, false, 14076, new Class[]{TextPaint.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f17831a, false, 14076, new Class[]{TextPaint.class}, Void.TYPE);
                        return;
                    }
                    textPaint2.setColor(ac.b((int) C0906R.color.aa9));
                    textPaint2.setUnderlineText(true);
                }
            }, a2.length(), a2.length() + a3.length(), 18);
            textView.setText(valueOf);
            textView.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17835a;

                /* renamed from: c  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f17836c;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f17835a, true, 14078, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f17835a, true, 14078, new Class[0], Void.TYPE);
                        return;
                    }
                    org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("RechargeDialog.java", AnonymousClass3.class);
                    f17836c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.wallet.RechargeDialog$11", "android.view.View", NotifyType.VIBRATE, "", "void"), 444);
                }

                public void onClick(View view) {
                    String str;
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f17835a, false, 14077, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f17835a, false, 14077, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f17836c, this, this, view2));
                    com.bytedance.android.livesdk.browser.c.b f2 = com.bytedance.android.livesdk.v.j.q().f();
                    Context context = RechargeDialog.this.getContext();
                    if (PatchProxy.isSupport(new Object[0], null, RechargeDialog.f17799a, true, 14074, new Class[0], String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[0], null, RechargeDialog.f17799a, true, 14074, new Class[0], String.class);
                    } else if (com.bytedance.android.live.uikit.a.a.a()) {
                        str = "https://webcast.amemv.com/falcon/webcast_douyin/page/agreement/pay/index.html";
                    } else if (com.bytedance.android.live.uikit.a.a.f()) {
                        str = "https://i.snssdk.com/videolive/fe/pay-agreement/";
                    } else if (com.bytedance.android.live.uikit.a.a.b()) {
                        str = "https://webcast-ppx.snssdk.com/falcon/webcast_pipixia/page/agreement/pay/index.html";
                    } else {
                        str = "https://webcast.huoshan.com/falcon/webcast_huoshan/page/recharge_agreement/index.html";
                    }
                    f2.a(context, com.bytedance.android.livesdk.browser.c.c.b(str));
                }
            });
            if (com.bytedance.android.live.uikit.a.a.a() || com.bytedance.android.live.uikit.a.a.f() || com.bytedance.android.live.uikit.a.a.b()) {
                this.G.setImageDrawable(ac.c(2130841132));
                this.f17801c.setVisibility(8);
            }
            this.g = inflate.findViewById(C0906R.id.atz);
            this.h = (TextView) this.g.findViewById(C0906R.id.dgi);
            this.i = (TextView) this.g.findViewById(C0906R.id.dgh);
            e();
            this.k = (ViewPager) inflate.findViewById(C0906R.id.dua);
            this.k.setOverScrollMode(2);
            this.k.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17811a;

                public void onPageScrollStateChanged(int i) {
                }

                public void onPageScrolled(int i, float f2, int i2) {
                }

                public void onPageSelected(int i) {
                    int i2;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f17811a, false, 14079, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f17811a, false, 14079, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    for (int i3 = 0; i3 < RechargeDialog.this.l.getChildCount(); i3++) {
                        View childAt = RechargeDialog.this.l.getChildAt(i3);
                        if (i == i3) {
                            i2 = 2130841513;
                        } else {
                            i2 = 2130841514;
                        }
                        childAt.setBackgroundResource(i2);
                    }
                    if (RechargeDialog.this.f17802d.getTranslationX() == 0.0f) {
                        RechargeDialog.this.b(true);
                        com.bytedance.android.livesdk.w.b.ap.a(Boolean.TRUE);
                    }
                }
            });
            this.J = new RechargeCnPagerAdapter(new ReChargeHalDialogListAdapter.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17838a;

                public final void a(@NotNull final com.bytedance.android.livesdkapi.depend.model.a aVar) {
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f17838a, false, 14080, new Class[]{com.bytedance.android.livesdkapi.depend.model.a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f17838a, false, 14080, new Class[]{com.bytedance.android.livesdkapi.depend.model.a.class}, Void.TYPE);
                        return;
                    }
                    if (com.bytedance.android.live.uikit.a.a.d()) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (uptimeMillis - RechargeDialog.this.j >= 500) {
                            RechargeDialog.this.j = uptimeMillis;
                            if (!RechargeDialog.this.f17801c.isChecked()) {
                                new eo.a(RechargeDialog.this.getContext(), 2).a((int) C0906R.string.cqh).a(ac.a((int) C0906R.string.cpz), new DialogInterface.OnClickListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f17843a;

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17843a, false, 14082, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17843a, false, 14082, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        dialogInterface.dismiss();
                                    }
                                }).b(ac.a((int) C0906R.string.dle), new DialogInterface.OnClickListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f17840a;

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17840a, false, 14081, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17840a, false, 14081, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        dialogInterface.dismiss();
                                        RechargeDialog.this.f17801c.setChecked(true);
                                        RechargeDialog.this.a(aVar);
                                    }
                                }).b();
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    RechargeDialog.this.a(aVar);
                }
            });
            this.k.setAdapter(this.J);
            this.l = (LinearLayout) inflate.findViewById(C0906R.id.bhe);
            this.I = (FrameLayout) inflate.findViewById(C0906R.id.ai4);
            this.f17804f = (TextView) inflate.findViewById(C0906R.id.d9t);
            if (this.f17804f != null && com.bytedance.android.live.uikit.a.a.d()) {
                this.f17804f.setText(String.valueOf(com.bytedance.android.livesdk.v.j.q().n().d() / 100));
            }
            if (this.I != null && this.p) {
                Map<String, String> a4 = TTLiveSDKContext.getHostService().f().a();
                String str = PushConstants.PUSH_TYPE_NOTIFY;
                if (a4 != null) {
                    str = a4.get("show_exchange_score");
                }
                if (com.bytedance.android.live.uikit.a.a.d() && PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(str)) {
                    this.I.setVisibility(0);
                    final HashMap hashMap = new HashMap();
                    hashMap.put("request_page", this.r);
                    hashMap.put("charge_reason", "exchange_diamond");
                    TTLiveSDKContext.getHostService().d().a("livesdk_exchange_diamond_show", hashMap);
                    this.I.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f17845a;

                        /* renamed from: d  reason: collision with root package name */
                        private static final /* synthetic */ a.C0900a f17846d;

                        static {
                            if (PatchProxy.isSupport(new Object[0], null, f17845a, true, 14084, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], null, f17845a, true, 14084, new Class[0], Void.TYPE);
                                return;
                            }
                            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("RechargeDialog.java", AnonymousClass5.class);
                            f17846d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.wallet.RechargeDialog$14", "android.view.View", NotifyType.VIBRATE, "", "void"), 548);
                        }

                        public void onClick(View view) {
                            BalanceChangeDialogFragment balanceChangeDialogFragment;
                            View view2 = view;
                            if (PatchProxy.isSupport(new Object[]{view2}, this, f17845a, false, 14083, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view2}, this, f17845a, false, 14083, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f17846d, this, this, view2));
                            if (RechargeDialog.this.o instanceof FragmentActivity) {
                                FragmentManager childFragmentManager = RechargeDialog.this.getChildFragmentManager();
                                if (childFragmentManager.findFragmentByTag("BALANCE_FRAGMENT_TAG") == null) {
                                    if (RechargeDialog.this.t != null) {
                                        RechargeDialog.this.t.lambda$put$1$DataCenter("data_pre_show_keyboard", Boolean.TRUE);
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putString("KEY_BUNDLE_REQUEST_PAGE", RechargeDialog.this.r);
                                    bundle.putString("KEY_BUNDLE_CHARGE_REASON", RechargeDialog.this.q);
                                    Activity activity = RechargeDialog.this.o;
                                    AnonymousClass1 r3 = new BalanceChangeDialogFragment.a() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f17849a;

                                        public final void a(long j) {
                                            long j2 = j;
                                            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f17849a, false, 14085, new Class[]{Long.TYPE}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f17849a, false, 14085, new Class[]{Long.TYPE}, Void.TYPE);
                                                return;
                                            }
                                            RechargeDialog.this.dismissAllowingStateLoss();
                                        }
                                    };
                                    if (PatchProxy.isSupport(new Object[]{activity, bundle, r3}, null, BalanceChangeDialogFragment.f18046a, true, 14159, new Class[]{Activity.class, Bundle.class, BalanceChangeDialogFragment.a.class}, BalanceChangeDialogFragment.class)) {
                                        balanceChangeDialogFragment = (BalanceChangeDialogFragment) PatchProxy.accessDispatch(new Object[]{activity, bundle, r3}, null, BalanceChangeDialogFragment.f18046a, true, 14159, new Class[]{Activity.class, Bundle.class, BalanceChangeDialogFragment.a.class}, BalanceChangeDialogFragment.class);
                                    } else {
                                        BalanceChangeDialogFragment balanceChangeDialogFragment2 = new BalanceChangeDialogFragment();
                                        balanceChangeDialogFragment2.setArguments(bundle);
                                        balanceChangeDialogFragment2.f18048c = activity;
                                        balanceChangeDialogFragment2.h = r3;
                                        balanceChangeDialogFragment = balanceChangeDialogFragment2;
                                    }
                                    balanceChangeDialogFragment.g = new c() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f17851a;

                                        public final void a(DialogInterface dialogInterface) {
                                            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f17851a, false, 14086, new Class[]{DialogInterface.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f17851a, false, 14086, new Class[]{DialogInterface.class}, Void.TYPE);
                                                return;
                                            }
                                            RechargeDialog.this.a(false);
                                        }
                                    };
                                    TTLiveSDKContext.getHostService().d().a("livesdk_exchange_diamond_click", hashMap);
                                    balanceChangeDialogFragment.show(childFragmentManager, "BALANCE_FRAGMENT_TAG");
                                    RechargeDialog.this.a(true);
                                }
                            }
                        }
                    });
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("request_page", this.r);
        hashMap2.put("charge_reason", this.q);
        hashMap2.put("flame_from", this.M);
        String str2 = "normal";
        if (this.Q == 1 || this.Q == 2) {
            str2 = "first_recharge";
        }
        hashMap2.put("panel_type", str2);
        com.bytedance.android.livesdk.j.a.a().a("livesdk_recharge_show", hashMap2, j.class, Room.class);
        TTLiveSDKContext.getHostService().k().e().subscribe();
        if (com.bytedance.android.live.uikit.a.a.a() || com.bytedance.android.live.uikit.a.a.f() || com.bytedance.android.live.uikit.a.a.b()) {
            kVar = new k() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17805a;

                public final Observable<com.bytedance.android.livesdkapi.depend.model.b> a() {
                    if (!PatchProxy.isSupport(new Object[0], this, f17805a, false, 14075, new Class[0], Observable.class)) {
                        return ((WalletApi) com.bytedance.android.livesdk.v.j.q().d().a(WalletApi.class)).getDiamondList().compose(com.bytedance.android.live.core.rxutils.i.a());
                    }
                    return (Observable) PatchProxy.accessDispatch(new Object[0], this, f17805a, false, 14075, new Class[0], Observable.class);
                }
            };
        } else {
            kVar = new k() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17809a;

                public final Observable<com.bytedance.android.livesdkapi.depend.model.b> a() {
                    if (!PatchProxy.isSupport(new Object[0], this, f17809a, false, 14091, new Class[0], Observable.class)) {
                        return ((WalletApi) com.bytedance.android.livesdk.v.j.q().d().a(WalletApi.class)).getDiamondList(2).compose(com.bytedance.android.live.core.rxutils.i.a());
                    }
                    return (Observable) PatchProxy.accessDispatch(new Object[0], this, f17809a, false, 14091, new Class[0], Observable.class);
                }
            };
        }
        e eVar = new e(this.o, kVar, this.q, this.r, 0, this.M);
        this.n = eVar;
        this.n.a(this);
        this.w = SystemClock.uptimeMillis();
        this.n.c();
        this.P = com.bytedance.android.livesdk.v.j.q().n().a().subscribe((Consumer<? super T>) new Consumer<Integer>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f17817a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                Integer num = (Integer) obj;
                if (PatchProxy.isSupport(new Object[]{num}, this, f17817a, false, 14093, new Class[]{Integer.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{num}, this, f17817a, false, 14093, new Class[]{Integer.class}, Void.TYPE);
                    return;
                }
                RechargeDialog rechargeDialog = RechargeDialog.this;
                int b2 = com.bytedance.android.livesdk.v.j.q().n().b();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(b2)}, rechargeDialog, RechargeDialog.f17799a, false, 14045, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    RechargeDialog rechargeDialog2 = rechargeDialog;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(b2)}, rechargeDialog2, RechargeDialog.f17799a, false, 14045, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                rechargeDialog.f17800b.setText(String.valueOf(b2));
                if (rechargeDialog.f17804f != null) {
                    rechargeDialog.f17804f.setText(String.valueOf(com.bytedance.android.livesdk.v.j.q().n().d() / 100));
                }
                rechargeDialog.e();
            }
        });
        com.bytedance.android.livesdk.v.j.q().n().e();
        if (this.O != null) {
            this.O.clear();
        }
        a(b.class);
        a(com.bytedance.android.livesdk.g.c.class);
        return inflate;
    }

    public static RechargeDialog a(@NonNull FragmentActivity fragmentActivity, boolean z2, String str, DataCenter dataCenter) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity, Byte.valueOf(z2 ? (byte) 1 : 0), str, dataCenter}, null, f17799a, true, 14070, new Class[]{FragmentActivity.class, Boolean.TYPE, String.class, DataCenter.class}, RechargeDialog.class)) {
            return a(fragmentActivity, z2, str, "live_detail", 0, dataCenter, null);
        }
        return (RechargeDialog) PatchProxy.accessDispatch(new Object[]{fragmentActivity, Byte.valueOf(z2), str, dataCenter}, null, f17799a, true, 14070, new Class[]{FragmentActivity.class, Boolean.TYPE, String.class, DataCenter.class}, RechargeDialog.class);
    }

    public static RechargeDialog a(@NonNull FragmentActivity fragmentActivity, boolean z2, String str, int i2, DataCenter dataCenter) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity, Byte.valueOf(z2 ? (byte) 1 : 0), str, Integer.valueOf(i2), dataCenter}, null, f17799a, true, 14071, new Class[]{FragmentActivity.class, Boolean.TYPE, String.class, Integer.TYPE, DataCenter.class}, RechargeDialog.class)) {
            return a(fragmentActivity, z2, str, "live_detail", i2, dataCenter, null);
        }
        Object[] objArr = {fragmentActivity, Byte.valueOf(z2), str, Integer.valueOf(i2), dataCenter};
        return (RechargeDialog) PatchProxy.accessDispatch(objArr, null, f17799a, true, 14071, new Class[]{FragmentActivity.class, Boolean.TYPE, String.class, Integer.TYPE, DataCenter.class}, RechargeDialog.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.android.livesdk.wallet.RechargeDialog a(@android.support.annotation.NonNull android.support.v4.app.FragmentActivity r20, boolean r21, java.lang.String r22, java.lang.String r23, int r24, com.bytedance.ies.sdk.widgets.DataCenter r25, com.bytedance.android.livesdkapi.depend.d.k r26) {
        /*
            r9 = r20
            r3 = r22
            r7 = r25
            r0 = 7
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r1 = 0
            r10[r1] = r9
            java.lang.Byte r2 = java.lang.Byte.valueOf(r21)
            r5 = 1
            r10[r5] = r2
            r2 = 2
            r10[r2] = r3
            r6 = 3
            r10[r6] = r23
            java.lang.Integer r8 = java.lang.Integer.valueOf(r24)
            r17 = 4
            r10[r17] = r8
            r8 = 5
            r10[r8] = r7
            r18 = 6
            r19 = 0
            r10[r18] = r19
            com.meituan.robust.ChangeQuickRedirect r12 = f17799a
            java.lang.Class[] r15 = new java.lang.Class[r0]
            java.lang.Class<android.support.v4.app.FragmentActivity> r11 = android.support.v4.app.FragmentActivity.class
            r15[r1] = r11
            java.lang.Class r11 = java.lang.Boolean.TYPE
            r15[r5] = r11
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r15[r2] = r11
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r15[r6] = r11
            java.lang.Class r11 = java.lang.Integer.TYPE
            r15[r17] = r11
            java.lang.Class<com.bytedance.ies.sdk.widgets.DataCenter> r11 = com.bytedance.ies.sdk.widgets.DataCenter.class
            r15[r8] = r11
            java.lang.Class<com.bytedance.android.livesdkapi.depend.d.k> r11 = com.bytedance.android.livesdkapi.depend.d.k.class
            r15[r18] = r11
            java.lang.Class<com.bytedance.android.livesdk.wallet.RechargeDialog> r16 = com.bytedance.android.livesdk.wallet.RechargeDialog.class
            r11 = 0
            r13 = 1
            r14 = 14072(0x36f8, float:1.9719E-41)
            boolean r10 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r10 == 0) goto L_0x00a9
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r10[r1] = r9
            java.lang.Byte r9 = java.lang.Byte.valueOf(r21)
            r10[r5] = r9
            r10[r2] = r3
            r10[r6] = r23
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
            r10[r17] = r3
            r10[r8] = r7
            r10[r18] = r19
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f17799a
            r7 = 1
            r9 = 14072(0x36f8, float:1.9719E-41)
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.support.v4.app.FragmentActivity> r11 = android.support.v4.app.FragmentActivity.class
            r0[r1] = r11
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r5] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r2] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r6] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r17] = r1
            java.lang.Class<com.bytedance.ies.sdk.widgets.DataCenter> r1 = com.bytedance.ies.sdk.widgets.DataCenter.class
            r0[r8] = r1
            java.lang.Class<com.bytedance.android.livesdkapi.depend.d.k> r1 = com.bytedance.android.livesdkapi.depend.d.k.class
            r0[r18] = r1
            java.lang.Class<com.bytedance.android.livesdk.wallet.RechargeDialog> r1 = com.bytedance.android.livesdk.wallet.RechargeDialog.class
            r20 = r10
            r21 = r3
            r22 = r4
            r23 = r7
            r24 = r9
            r25 = r0
            r26 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            com.bytedance.android.livesdk.wallet.RechargeDialog r0 = (com.bytedance.android.livesdk.wallet.RechargeDialog) r0
            return r0
        L_0x00a9:
            boolean r0 = com.bytedance.android.live.uikit.a.a.d()
            if (r0 != 0) goto L_0x030e
            boolean r0 = com.bytedance.android.live.uikit.a.a.a()
            if (r0 == 0) goto L_0x00c3
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_RECHARGE_DIALOG_TYPE
            java.lang.Object r0 = r0.a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x030e
        L_0x00c3:
            boolean r0 = com.bytedance.android.live.uikit.a.a.f()
            if (r0 == 0) goto L_0x00d7
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_RECHARGE_DIALOG_TYPE
            java.lang.Object r0 = r0.a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x030e
        L_0x00d7:
            boolean r0 = com.bytedance.android.live.uikit.a.a.b()
            if (r0 == 0) goto L_0x00ed
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_RECHARGE_DIALOG_TYPE
            java.lang.Object r0 = r0.a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x00ed
            goto L_0x030e
        L_0x00ed:
            android.support.v4.app.FragmentManager r0 = r20.getSupportFragmentManager()
            java.lang.String r2 = "RechargeDialog"
            android.support.v4.app.Fragment r0 = r0.findFragmentByTag(r2)
            if (r0 == 0) goto L_0x0100
            boolean r0 = r0.isAdded()
            if (r0 == 0) goto L_0x0100
            return r19
        L_0x0100:
            android.content.res.Resources r0 = r20.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            if (r0 != r5) goto L_0x010e
            r0 = 1
            goto L_0x010f
        L_0x010e:
            r0 = 0
        L_0x010f:
            r2 = 1070050836(0x3fc7ae14, float:1.56)
            boolean r4 = com.bytedance.android.live.uikit.a.a.f()
            if (r4 == 0) goto L_0x011b
            r2 = 1067030938(0x3f99999a, float:1.2)
        L_0x011b:
            if (r0 == 0) goto L_0x0127
            int r4 = com.bytedance.android.live.core.utils.ac.c()
        L_0x0121:
            float r4 = com.bytedance.android.live.core.utils.ac.e(r4)
            int r4 = (int) r4
            goto L_0x012c
        L_0x0127:
            int r4 = com.bytedance.android.live.core.utils.ac.b()
            goto L_0x0121
        L_0x012c:
            if (r0 == 0) goto L_0x0139
            int r6 = com.bytedance.android.live.core.utils.ac.c()
            float r6 = com.bytedance.android.live.core.utils.ac.e(r6)
            float r6 = r6 / r2
            int r2 = (int) r6
            goto L_0x0143
        L_0x0139:
            int r6 = com.bytedance.android.live.core.utils.ac.b()
            float r6 = com.bytedance.android.live.core.utils.ac.e(r6)
            float r6 = r6 / r2
            int r2 = (int) r6
        L_0x0143:
            com.bytedance.android.livesdkapi.k.a.e r6 = new com.bytedance.android.livesdkapi.k.a.e
            com.bytedance.android.live.core.setting.l<java.lang.String> r7 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_RECHARGE_URL
            java.lang.Object r7 = r7.a()
            java.lang.String r7 = (java.lang.String) r7
            r6.<init>(r7)
            com.bytedance.android.livesdk.j.a r7 = com.bytedance.android.livesdk.j.a.a()
            java.lang.Class<com.bytedance.android.livesdk.j.c.j> r8 = com.bytedance.android.livesdk.j.c.j.class
            com.bytedance.android.livesdk.j.b.g r7 = r7.a((java.lang.Class) r8)
            if (r7 == 0) goto L_0x020f
            boolean r8 = r7 instanceof com.bytedance.android.livesdk.j.b.k
            if (r8 == 0) goto L_0x020f
            com.bytedance.android.livesdk.j.b.k r7 = (com.bytedance.android.livesdk.j.b.k) r7
            java.lang.String r8 = ""
            java.util.Map r10 = r7.a()
            java.lang.String r11 = "enter_from"
            boolean r10 = r10.containsKey(r11)
            if (r10 == 0) goto L_0x0179
            java.util.Map r10 = r7.a()
            java.lang.String r11 = "enter_from"
            r10.get(r11)
        L_0x0179:
            java.util.Map r10 = r7.a()
            java.lang.String r11 = "source"
            boolean r10 = r10.containsKey(r11)
            if (r10 == 0) goto L_0x018e
            java.util.Map r10 = r7.a()
            java.lang.String r11 = "source"
            r10.get(r11)
        L_0x018e:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.String r11 = "enter_from_merge"
            java.lang.Object r11 = r10.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "enter_method"
            java.lang.Object r10 = r10.get(r12)
            java.lang.String r10 = (java.lang.String) r10
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L_0x01c5
            java.util.Map r12 = r7.a()
            java.lang.String r13 = "enter_from_merge"
            boolean r12 = r12.containsKey(r13)
            if (r12 == 0) goto L_0x01c5
            java.util.Map r11 = r7.a()
            java.lang.String r12 = "enter_from_merge"
            java.lang.Object r11 = r11.get(r12)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L_0x01c5
            java.lang.String r11 = ""
        L_0x01c5:
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 == 0) goto L_0x01e7
            java.util.Map r12 = r7.a()
            java.lang.String r13 = "enter_method"
            boolean r12 = r12.containsKey(r13)
            if (r12 == 0) goto L_0x01e7
            java.util.Map r10 = r7.a()
            java.lang.String r12 = "enter_method"
            java.lang.Object r10 = r10.get(r12)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L_0x01e7
            java.lang.String r10 = ""
        L_0x01e7:
            java.util.Map r12 = r7.a()
            java.lang.String r13 = "action_type"
            boolean r12 = r12.containsKey(r13)
            if (r12 == 0) goto L_0x0200
            java.util.Map r7 = r7.a()
            java.lang.String r8 = "action_type"
            java.lang.Object r7 = r7.get(r8)
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
        L_0x0200:
            java.lang.String r7 = "enter_from_merge"
            r6.a((java.lang.String) r7, (java.lang.String) r11)
            java.lang.String r7 = "enter_method"
            r6.a((java.lang.String) r7, (java.lang.String) r10)
            java.lang.String r7 = "action_type"
            r6.a((java.lang.String) r7, (java.lang.String) r8)
        L_0x020f:
            com.bytedance.android.livesdk.j.a r7 = com.bytedance.android.livesdk.j.a.a()
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r8 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            com.bytedance.android.livesdk.j.b.g r7 = r7.a((java.lang.Class) r8)
            if (r7 == 0) goto L_0x0295
            boolean r8 = r7 instanceof com.bytedance.android.livesdk.j.b.n
            if (r8 == 0) goto L_0x0295
            com.bytedance.android.livesdk.j.b.n r7 = (com.bytedance.android.livesdk.j.b.n) r7
            java.util.Map r8 = r7.a()
            java.lang.String r10 = "anchor_id"
            boolean r8 = r8.containsKey(r10)
            if (r8 == 0) goto L_0x023e
            java.util.Map r8 = r7.a()
            java.lang.String r10 = "anchor_id"
            java.lang.Object r8 = r8.get(r10)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = "anchor_id"
            r6.a((java.lang.String) r10, (java.lang.String) r8)
        L_0x023e:
            java.util.Map r8 = r7.a()
            java.lang.String r10 = "room_id"
            boolean r8 = r8.containsKey(r10)
            if (r8 == 0) goto L_0x025b
            java.util.Map r8 = r7.a()
            java.lang.String r10 = "room_id"
            java.lang.Object r8 = r8.get(r10)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = "room_id"
            r6.a((java.lang.String) r10, (java.lang.String) r8)
        L_0x025b:
            java.util.Map r8 = r7.a()
            java.lang.String r10 = "log_pb"
            boolean r8 = r8.containsKey(r10)
            if (r8 == 0) goto L_0x0278
            java.util.Map r8 = r7.a()
            java.lang.String r10 = "log_pb"
            java.lang.Object r8 = r8.get(r10)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = "log_pb"
            r6.a((java.lang.String) r10, (java.lang.String) r8)
        L_0x0278:
            java.util.Map r8 = r7.a()
            java.lang.String r10 = "request_id"
            boolean r8 = r8.containsKey(r10)
            if (r8 == 0) goto L_0x0295
            java.util.Map r7 = r7.a()
            java.lang.String r8 = "request_id"
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "request_id"
            r6.a((java.lang.String) r8, (java.lang.String) r7)
        L_0x0295:
            java.lang.String r7 = "diamond"
            com.bytedance.android.livesdk.v.f r8 = com.bytedance.android.livesdk.v.j.q()
            com.bytedance.android.live.f.a r8 = r8.n()
            int r8 = r8.b()
            r6.a((java.lang.String) r7, (int) r8)
            java.lang.String r7 = "request_page"
            java.lang.String r8 = "live_detail"
            r6.a((java.lang.String) r7, (java.lang.String) r8)
            java.lang.String r7 = "charge_reason"
            r6.a((java.lang.String) r7, (java.lang.String) r3)
            java.lang.String r3 = r6.a()
            com.bytedance.android.livesdk.browser.c.b$b r3 = com.bytedance.android.livesdk.browser.c.c.a(r3)
            if (r0 == 0) goto L_0x02bf
            r6 = 80
            goto L_0x02c2
        L_0x02bf:
            r6 = 8388693(0x800055, float:1.1755063E-38)
        L_0x02c2:
            com.bytedance.android.livesdk.browser.c.b$b r3 = r3.e(r6)
            com.bytedance.android.livesdk.browser.c.b$b r3 = r3.a((int) r4)
            com.bytedance.android.livesdk.browser.c.b$b r2 = r3.b((int) r2)
            r3 = 8
            if (r0 == 0) goto L_0x02d4
            r4 = 0
            goto L_0x02d6
        L_0x02d4:
            r4 = 8
        L_0x02d6:
            com.bytedance.android.livesdk.browser.c.b$b r2 = r2.c((int) r4)
            com.bytedance.android.livesdk.browser.c.b$b r2 = r2.b((boolean) r5)
            java.lang.String r4 = "ttlive_charge_open_fe_detail"
            java.lang.String r4 = com.bytedance.android.live.core.d.d.a(r4)
            com.bytedance.android.livesdk.browser.c.b$b r2 = r2.b((java.lang.String) r4)
            if (r0 == 0) goto L_0x02ef
            com.bytedance.android.livesdk.browser.c.b$b r0 = r2.a(r3, r3, r1, r1)
            goto L_0x02f3
        L_0x02ef:
            com.bytedance.android.livesdk.browser.c.b$b r0 = r2.d(r3)
        L_0x02f3:
            java.lang.String r1 = "ttlive_charge_open_fe"
            com.bytedance.android.live.b.b r1 = com.bytedance.android.livesdk.wallet.b.b.a((java.lang.String) r1)
            r0.a((com.bytedance.android.live.b.b) r1)
            com.bytedance.android.livesdk.v.f r1 = com.bytedance.android.livesdk.v.j.q()
            com.bytedance.android.livesdk.browser.c.b r1 = r1.f()
            com.bytedance.android.live.core.widget.BaseDialogFragment r0 = r1.a((com.bytedance.android.livesdk.browser.c.b.C0073b) r0)
            java.lang.String r1 = "RechargeDialog"
            com.bytedance.android.live.core.widget.BaseDialogFragment.a(r9, r0, r1)
            return r19
        L_0x030e:
            android.content.res.Resources r0 = r20.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            if (r0 != r5) goto L_0x031c
            r2 = 1
            goto L_0x031d
        L_0x031c:
            r2 = 0
        L_0x031d:
            java.lang.String r6 = a((com.bytedance.ies.sdk.widgets.DataCenter) r7, (java.lang.String) r3)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0329
            r8 = 1
            goto L_0x032b
        L_0x0329:
            r8 = r24
        L_0x032b:
            r10 = 0
            r0 = r20
            r1 = r21
            r3 = r22
            r4 = r23
            r5 = r6
            r6 = r8
            r7 = r25
            r8 = r10
            com.bytedance.android.livesdk.wallet.RechargeDialog r0 = a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            android.support.v4.app.FragmentManager r1 = r20.getSupportFragmentManager()
            java.lang.String r2 = "RechargeDialog"
            android.support.v4.app.Fragment r1 = r1.findFragmentByTag(r2)
            if (r1 != 0) goto L_0x0353
            android.support.v4.app.FragmentManager r1 = r20.getSupportFragmentManager()
            java.lang.String r2 = "RechargeDialog"
            r0.show((android.support.v4.app.FragmentManager) r1, (java.lang.String) r2)
            return r0
        L_0x0353:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.wallet.RechargeDialog.a(android.support.v4.app.FragmentActivity, boolean, java.lang.String, java.lang.String, int, com.bytedance.ies.sdk.widgets.DataCenter, com.bytedance.android.livesdkapi.depend.d.k):com.bytedance.android.livesdk.wallet.RechargeDialog");
    }

    private static RechargeDialog a(@NonNull Activity activity, boolean z2, boolean z3, String str, String str2, String str3, int i2, DataCenter dataCenter, com.bytedance.android.livesdkapi.depend.d.k kVar) {
        Activity activity2 = activity;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        DataCenter dataCenter2 = dataCenter;
        com.bytedance.android.livesdkapi.depend.d.k kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{activity2, Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), str4, str5, str6, Integer.valueOf(i2), dataCenter2, kVar2}, null, f17799a, true, 14038, new Class[]{Activity.class, Boolean.TYPE, Boolean.TYPE, String.class, String.class, String.class, Integer.TYPE, DataCenter.class, com.bytedance.android.livesdkapi.depend.d.k.class}, RechargeDialog.class)) {
            return (RechargeDialog) PatchProxy.accessDispatch(new Object[]{activity2, Byte.valueOf(z2), Byte.valueOf(z3), str4, str5, str6, Integer.valueOf(i2), dataCenter2, kVar2}, null, f17799a, true, 14038, new Class[]{Activity.class, Boolean.TYPE, Boolean.TYPE, String.class, String.class, String.class, Integer.TYPE, DataCenter.class, com.bytedance.android.livesdkapi.depend.d.k.class}, RechargeDialog.class);
        }
        Object[] objArr = {activity2, Byte.valueOf(z2), Byte.valueOf(z3), str4, str5, str6, Integer.valueOf(i2), dataCenter2, kVar2, ""};
        if (PatchProxy.isSupport(objArr, null, f17799a, true, 14039, new Class[]{Activity.class, Boolean.TYPE, Boolean.TYPE, String.class, String.class, String.class, Integer.TYPE, DataCenter.class, com.bytedance.android.livesdkapi.depend.d.k.class, String.class}, RechargeDialog.class)) {
            return (RechargeDialog) PatchProxy.accessDispatch(new Object[]{activity2, Byte.valueOf(z2), Byte.valueOf(z3), str4, str5, str6, Integer.valueOf(i2), dataCenter2, kVar2, ""}, null, f17799a, true, 14039, new Class[]{Activity.class, Boolean.TYPE, Boolean.TYPE, String.class, String.class, String.class, Integer.TYPE, DataCenter.class, com.bytedance.android.livesdkapi.depend.d.k.class, String.class}, RechargeDialog.class);
        }
        Bundle bundle = new Bundle();
        RechargeDialog rechargeDialog = new RechargeDialog();
        rechargeDialog.o = activity2;
        rechargeDialog.L = z2;
        rechargeDialog.p = z3;
        rechargeDialog.q = str4;
        rechargeDialog.t = dataCenter2;
        rechargeDialog.s = kVar2;
        rechargeDialog.r = str5;
        rechargeDialog.N = str6;
        rechargeDialog.Q = i2;
        rechargeDialog.M = "";
        rechargeDialog.setArguments(bundle);
        return rechargeDialog;
    }
}
