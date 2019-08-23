package com.bytedance.android.livesdk.gift.panel.widget;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.ListPopupWindow;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.ui.NumberInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.ui.SimpleInputDialogFragment;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.impl.a;
import com.bytedance.android.livesdk.gift.model.a.a;
import com.bytedance.android.livesdk.gift.panel.a.c;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.popup.d;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.widget.SpecialCombView;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.i.b;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.e.b;
import com.bytedance.ies.sdk.widgets.Widget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class GiftPanelBottomWidget extends Widget implements View.OnClickListener, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15270a;
    private static final boolean n;

    /* renamed from: b  reason: collision with root package name */
    TextView f15271b;

    /* renamed from: c  reason: collision with root package name */
    TextView f15272c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f15273d;

    /* renamed from: e  reason: collision with root package name */
    SpecialCombView f15274e;

    /* renamed from: f  reason: collision with root package name */
    public ListPopupWindow f15275f;
    public b g;
    public NumberInputDialogFragment h;
    a i;
    int j = ((Integer) com.bytedance.android.livesdk.config.a.G.a()).intValue();
    ObjectAnimator k;
    Handler l = new WeakHandler(this);
    GiftDialogViewModel m;
    private View o;
    private TextView p;
    private View q;
    private TextView r;
    private View s;
    private GiftDialogViewModel.b t = GiftDialogViewModel.b.DIAMOND;
    private int u;
    private boolean v;
    private Disposable w;
    private CompositeDisposable x = new CompositeDisposable();
    private String y = ((String) LiveConfigSettingKeys.LIVE_GOLDEN_BEAN_TASK_SCHEMA.a());

    /* renamed from: com.bytedance.android.livesdk.gift.panel.widget.GiftPanelBottomWidget$8  reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15294a = new int[GiftDialogViewModel.b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$b[] r0 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15294a = r0
                int[] r0 = f15294a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$b r1 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.b.GOLDEN_BEAN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f15294a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$b r1 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.b.DIAMOND     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.panel.widget.GiftPanelBottomWidget.AnonymousClass8.<clinit>():void");
        }
    }

    public int getLayoutId() {
        return C0906R.layout.ag3;
    }

    static {
        boolean z;
        if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) {
            z = true;
        } else {
            z = false;
        }
        n = z;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f15270a, false, 9971, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15270a, false, 9971, new Class[0], Void.TYPE);
            return;
        }
        this.m.q.postValue(Boolean.TRUE);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f15270a, false, 9956, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15270a, false, 9956, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        ((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).walletCenter().e();
    }

    private boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f15270a, false, 9960, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f15270a, false, 9960, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.v || !com.bytedance.android.live.uikit.a.a.l()) {
            return false;
        } else {
            User user = (User) this.dataCenter.get("data_user_in_room");
            if (!((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().c()) {
                return true;
            }
            if (user != null) {
                return user.isNeverRecharge();
            }
            if (((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a().getPayScores() <= 0) {
                return true;
            }
            return false;
        }
    }

    private boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f15270a, false, 9979, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f15270a, false, 9979, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (((Integer) LiveConfigSettingKeys.SHOW_RECHARGE_REWARD_POPUP_IN_GIFT_DIALOG.a()).intValue() != 1) {
            return false;
        } else {
            long longValue = ((Long) com.bytedance.android.livesdk.w.b.aP.a()).longValue();
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(longValue);
            int i2 = instance.get(7);
            long currentTimeMillis = System.currentTimeMillis();
            Calendar.getInstance();
            if (instance.get(7) == i2 && currentTimeMillis - longValue <= 86400000) {
                return false;
            }
            com.bytedance.android.livesdk.w.b.aP.a(Long.valueOf(currentTimeMillis));
            return true;
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f15270a, false, 9978, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15270a, false, 9978, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.l.hasMessages(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST)) {
            this.l.removeMessages(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
        }
        if (this.w != null && !this.w.isDisposed()) {
            this.w.dispose();
        }
        this.m.a(this);
        if (this.x != null && !this.x.isDisposed()) {
            this.x.dispose();
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f15270a, false, 9966, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15270a, false, 9966, new Class[0], Void.TYPE);
            return;
        }
        a aVar = (a) this.m.s.getValue();
        int a2 = this.m.a();
        com.bytedance.android.livesdk.gift.panel.a.b bVar = (com.bytedance.android.livesdk.gift.panel.a.b) this.m.t.getValue();
        if (bVar == null) {
            if (aVar != null) {
                c cVar = new c(b(aVar.f15095a), aVar.o(), a2, aVar.f());
                this.m.p.postValue(cVar);
            }
        } else if (bVar.f15167a.size() < ((Integer) com.bytedance.android.livesdk.config.a.E.a()).intValue()) {
            this.m.u.postValue(Boolean.TRUE);
        } else {
            this.m.p.postValue(new c(GiftDialogViewModel.c.DOODLE_GIFT, bVar, true));
        }
    }

    public void onCreate() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f15270a, false, 9955, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15270a, false, 9955, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g = b.a(this.context);
        this.m = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
        this.v = this.m.f15263b;
        if (PatchProxy.isSupport(new Object[0], this, f15270a, false, 9957, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15270a, false, 9957, new Class[0], Void.TYPE);
        } else {
            this.o = this.contentView.findViewById(C0906R.id.caz);
            this.p = (TextView) this.contentView.findViewById(C0906R.id.db0);
            this.f15271b = (TextView) this.contentView.findViewById(C0906R.id.s2);
            this.q = this.contentView.findViewById(C0906R.id.s1);
            this.r = (TextView) this.contentView.findViewById(C0906R.id.cax);
            this.s = this.contentView.findViewById(C0906R.id.cav);
            this.f15272c = (TextView) this.contentView.findViewById(C0906R.id.cnn);
            this.f15273d = (TextView) this.contentView.findViewById(C0906R.id.cnu);
            this.f15274e = (SpecialCombView) this.contentView.findViewById(C0906R.id.co2);
            this.f15271b.setOnClickListener(this);
            this.q.setOnClickListener(this);
            this.f15272c.setOnClickListener(this);
            this.f15273d.setOnClickListener(this);
            this.f15274e.setOnClickListener(this);
            this.f15274e.setCountDownTime(this.j);
            this.q.setVisibility(8);
            Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(this.context.getResources(), 2130841132);
            a2.setBounds(new Rect(0, 0, (int) ak.a(this.context, 16.0f), (int) UIUtils.dip2Px(this.context, 16.0f)));
            if (com.bytedance.android.live.uikit.d.c.a(this.context)) {
                this.p.setCompoundDrawables(null, null, a2, null);
            } else {
                this.p.setCompoundDrawables(a2, null, null, null);
            }
            a((a) null);
        }
        if (PatchProxy.isSupport(new Object[0], this, f15270a, false, 9958, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15270a, false, 9958, new Class[0], Void.TYPE);
        } else {
            a(((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).walletCenter());
            this.w = ((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).walletCenter().a().subscribe((Consumer<? super T>) new Consumer<Integer>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f15278a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    Integer num = (Integer) obj;
                    if (PatchProxy.isSupport(new Object[]{num}, this, f15278a, false, 9985, new Class[]{Integer.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{num}, this, f15278a, false, 9985, new Class[]{Integer.class}, Void.TYPE);
                        return;
                    }
                    GiftPanelBottomWidget giftPanelBottomWidget = GiftPanelBottomWidget.this;
                    if (PatchProxy.isSupport(new Object[0], giftPanelBottomWidget, GiftPanelBottomWidget.f15270a, false, 9969, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], giftPanelBottomWidget, GiftPanelBottomWidget.f15270a, false, 9969, new Class[0], Void.TYPE);
                        return;
                    }
                    if (giftPanelBottomWidget.isViewValid()) {
                        com.bytedance.android.live.f.a walletCenter = ((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).walletCenter();
                        if (!TextUtils.isEmpty(walletCenter.f())) {
                            giftPanelBottomWidget.f15271b.setText(walletCenter.f());
                        } else {
                            giftPanelBottomWidget.f15271b.setText(C0906R.string.dkq);
                        }
                        giftPanelBottomWidget.a(walletCenter);
                        giftPanelBottomWidget.a(giftPanelBottomWidget.i);
                    }
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f15270a, false, 9959, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15270a, false, 9959, new Class[0], Void.TYPE);
        } else if (b()) {
            String a3 = ac.a((int) C0906R.string.dab);
            String a4 = ac.a((int) C0906R.string.dac);
            if (a4 == null) {
                i2 = 0;
            } else {
                i2 = a4.length();
            }
            SpannableString spannableString = new SpannableString(a3);
            ImageSpan imageSpan = new ImageSpan(this.context, 2130841218, 1);
            int d2 = ac.d(C0906R.dimen.pt);
            imageSpan.getDrawable().setBounds(0, 0, d2, d2);
            int i3 = i2 + 1;
            if (PatchProxy.isSupport(new Object[]{spannableString, imageSpan, Integer.valueOf(i2), Integer.valueOf(i3), 33}, null, g.f15352a, true, 9994, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {spannableString, imageSpan, Integer.valueOf(i2), Integer.valueOf(i3), 33};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, null, g.f15352a, true, 9994, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                spannableString.setSpan(imageSpan, i2, i3, 33);
            }
            this.r.setText(spannableString);
            this.s.setOnClickListener(new f(this));
            HashMap hashMap = new HashMap();
            hashMap.put("discount_type", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            com.bytedance.android.livesdk.j.a.a().a("discount_recharge_show", hashMap, Room.class, new j().a("live_detail").c("enableGift").b("live_function"), new k());
        }
        this.m.s.observe(this, new c(this));
        this.m.n.observe(this, new d(this));
        this.m.t.observe(this, new e(this));
        this.x.clear();
        this.x.add(com.bytedance.android.livesdk.u.a.a().a(com.bytedance.android.livesdk.g.c.class).subscribe((Consumer<? super T>) new Consumer<com.bytedance.android.livesdk.g.c>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15276a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                com.bytedance.android.livesdk.g.c cVar = (com.bytedance.android.livesdk.g.c) obj;
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f15276a, false, 9984, new Class[]{com.bytedance.android.livesdk.g.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f15276a, false, 9984, new Class[]{com.bytedance.android.livesdk.g.c.class}, Void.TYPE);
                    return;
                }
                GiftPanelBottomWidget.this.onEvent(cVar);
            }
        }));
    }

    private static GiftDialogViewModel.c b(int i2) {
        if (i2 == 4) {
            return GiftDialogViewModel.c.TASK_GIFT;
        }
        if (i2 == 6) {
            return GiftDialogViewModel.c.GIFT_AD;
        }
        switch (i2) {
            case 1:
                return GiftDialogViewModel.c.GIFT;
            case 2:
                return GiftDialogViewModel.c.PROP;
            default:
                return GiftDialogViewModel.c.NORMAL;
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f15270a, false, 9974, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f15270a, false, 9974, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.u = i2;
        this.m.f15266e = i2;
        this.f15273d.setText(String.valueOf(this.u));
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f15270a, false, 9977, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f15270a, false, 9977, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message.what == 1001) {
            this.f15272c.setVisibility(0);
            this.f15274e.setVisibility(8);
            if (this.k != null && this.k.isStarted()) {
                this.k.cancel();
            }
            a(this.i);
            this.m.b();
            this.m.c();
            this.m.n.postValue(Boolean.FALSE);
        }
    }

    public void onEvent(com.bytedance.android.livesdk.g.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f15270a, false, 9970, new Class[]{com.bytedance.android.livesdk.g.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f15270a, false, 9970, new Class[]{com.bytedance.android.livesdk.g.c.class}, Void.TYPE);
            return;
        }
        ((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).walletCenter().e();
        a(this.i);
    }

    private void a(GiftDialogViewModel.b bVar) {
        Drawable drawable;
        int i2;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f15270a, false, 9964, new Class[]{GiftDialogViewModel.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f15270a, false, 9964, new Class[]{GiftDialogViewModel.b.class}, Void.TYPE);
        } else if (this.t != bVar) {
            com.bytedance.android.live.f.a walletCenter = ((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).walletCenter();
            this.t = bVar;
            if (AnonymousClass8.f15294a[bVar.ordinal()] != 1) {
                drawable = com.ss.android.ugc.bytex.a.a.a.a(this.context.getResources(), 2130841132);
                this.q.setVisibility(8);
                this.f15271b.setVisibility(0);
                a(walletCenter);
            } else {
                drawable = com.ss.android.ugc.bytex.a.a.a.a(this.context.getResources(), 2130841186);
                View view = this.q;
                if (TextUtils.isEmpty(this.y)) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                view.setVisibility(i2);
                this.f15271b.setVisibility(8);
                a(walletCenter);
            }
            drawable.setBounds(new Rect(0, 0, (int) ak.a(this.context, 16.0f), (int) UIUtils.dip2Px(this.context, 16.0f)));
            if (com.bytedance.android.live.uikit.d.c.a(this.context)) {
                this.p.setCompoundDrawables(null, null, drawable, null);
            } else {
                this.p.setCompoundDrawables(drawable, null, null, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(com.bytedance.android.live.f.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f15270a, false, 9967, new Class[]{com.bytedance.android.live.f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f15270a, false, 9967, new Class[]{com.bytedance.android.live.f.a.class}, Void.TYPE);
            return;
        }
        long j2 = 0;
        if (this.t == GiftDialogViewModel.b.GOLDEN_BEAN) {
            TextView textView = this.p;
            if (((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().c()) {
                j2 = (long) aVar.h();
            }
            textView.setText(String.valueOf(j2));
            return;
        }
        TextView textView2 = this.p;
        if (((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().c()) {
            j2 = (long) aVar.b();
        }
        textView2.setText(String.valueOf(j2));
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f15270a, false, 9962, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f15270a, false, 9962, new Class[]{a.class}, Void.TYPE);
            return;
        }
        a(aVar2, false);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f15270a, false, 9965, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f15270a, false, 9965, new Class[]{View.class}, Void.TYPE);
        } else if (view.getId() == C0906R.id.s2) {
            a();
        } else {
            if (view.getId() == C0906R.id.s1) {
                if (com.bytedance.android.live.uikit.a.a.g() && this.t == GiftDialogViewModel.b.GOLDEN_BEAN && !TextUtils.isEmpty(this.y)) {
                    String str = this.y;
                    if (PatchProxy.isSupport(new Object[]{str}, this, f15270a, false, 9968, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f15270a, false, 9968, new Class[]{String.class}, Void.TYPE);
                    } else {
                        ((com.bytedance.android.livesdk.schema.a.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdk.schema.a.a.class)).a(this.context, Uri.parse(new i(str).a()));
                        this.m.r.postValue(Boolean.TRUE);
                    }
                }
            } else if (view.getId() == C0906R.id.cnn) {
                if (this.i != null) {
                    c();
                } else if (((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).walletCenter().b() <= 0) {
                    a();
                }
            } else if (view.getId() == C0906R.id.cnu || view.getId() == C0906R.id.cnv) {
                if (PatchProxy.isSupport(new Object[0], this, f15270a, false, 9972, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f15270a, false, 9972, new Class[0], Void.TYPE);
                } else {
                    if (this.f15275f == null || !this.f15275f.isShowing()) {
                        if (this.f15275f == null) {
                            if (PatchProxy.isSupport(new Object[0], this, f15270a, false, 9961, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f15270a, false, 9961, new Class[0], Void.TYPE);
                            } else {
                                this.f15275f = new ListPopupWindow(this.context);
                                this.f15275f.setOnDismissListener(new PopupWindow.OnDismissListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f15280a;

                                    public final void onDismiss() {
                                        if (PatchProxy.isSupport(new Object[0], this, f15280a, false, 9986, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f15280a, false, 9986, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(GiftPanelBottomWidget.this.context.getResources(), 2130841278);
                                        a2.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
                                        if (GiftPanelBottomWidget.this.f15273d.getId() == C0906R.id.cnv) {
                                            GiftPanelBottomWidget.this.f15273d.setCompoundDrawables(a2, null, null, null);
                                        } else {
                                            GiftPanelBottomWidget.this.f15273d.setCompoundDrawables(null, null, a2, null);
                                        }
                                        GiftPanelBottomWidget.this.f15275f = null;
                                    }
                                });
                                this.f15275f.setContentWidth(this.context.getResources().getDimensionPixelSize(C0906R.dimen.o9));
                                this.f15275f.setHeight(this.context.getResources().getDimensionPixelSize(C0906R.dimen.o7));
                                this.f15275f.setVerticalOffset(this.context.getResources().getDimensionPixelSize(C0906R.dimen.o8));
                                if (com.bytedance.android.live.uikit.d.c.a(this.context)) {
                                    this.f15275f.setHorizontalOffset(-this.context.getResources().getDimensionPixelSize(C0906R.dimen.o6));
                                } else {
                                    this.f15275f.setHorizontalOffset(this.context.getResources().getDimensionPixelSize(C0906R.dimen.o6));
                                }
                                this.f15275f.setAdapter(new com.bytedance.android.livesdk.gift.impl.a(GiftManager.inst().getGroupCountInfo(), new a.C0107a() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f15282a;

                                    public final void a() {
                                        NumberInputDialogFragment numberInputDialogFragment;
                                        if (PatchProxy.isSupport(new Object[0], this, f15282a, false, 9988, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f15282a, false, 9988, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        GiftPanelBottomWidget.this.f15275f.dismiss();
                                        GiftPanelBottomWidget.this.dataCenter.lambda$put$1$DataCenter("data_pre_show_keyboard", Boolean.TRUE);
                                        GiftPanelBottomWidget giftPanelBottomWidget = GiftPanelBottomWidget.this;
                                        if (PatchProxy.isSupport(new Object[0], giftPanelBottomWidget, GiftPanelBottomWidget.f15270a, false, 9973, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], giftPanelBottomWidget, GiftPanelBottomWidget.f15270a, false, 9973, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        if (giftPanelBottomWidget.h == null) {
                                            boolean z = giftPanelBottomWidget.m.f15263b;
                                            String string = giftPanelBottomWidget.context.getString(C0906R.string.cy4);
                                            if (PatchProxy.isSupport(new Object[]{string, 1, 1314, Byte.valueOf(z ? (byte) 1 : 0)}, null, NumberInputDialogFragment.f11735a, true, 6295, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, NumberInputDialogFragment.class)) {
                                                numberInputDialogFragment = (NumberInputDialogFragment) PatchProxy.accessDispatch(new Object[]{string, 1, 1314, Byte.valueOf(z)}, null, NumberInputDialogFragment.f11735a, true, 6295, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, NumberInputDialogFragment.class);
                                            } else {
                                                NumberInputDialogFragment numberInputDialogFragment2 = new NumberInputDialogFragment();
                                                Bundle bundle = new Bundle();
                                                bundle.putString("live.intent.extra.HINT", string);
                                                bundle.putBoolean("live.intent.extra.TOUCH_MODAL", true);
                                                bundle.putInt("live.intent.extra.MIN", 1);
                                                bundle.putInt("live.intent.extra.MAX", 1314);
                                                bundle.putBoolean("live.intent.extra.IS_BROADCASTER", z);
                                                numberInputDialogFragment2.setArguments(bundle);
                                                numberInputDialogFragment = numberInputDialogFragment2;
                                            }
                                            giftPanelBottomWidget.h = numberInputDialogFragment;
                                            giftPanelBottomWidget.h.f11781f = new SimpleInputDialogFragment.a() {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f15292a;

                                                public final void a(String str) {
                                                    int i;
                                                    if (PatchProxy.isSupport(new Object[]{str}, this, f15292a, false, 9992, new Class[]{String.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{str}, this, f15292a, false, 9992, new Class[]{String.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    GiftPanelBottomWidget.this.h.b();
                                                    try {
                                                        i = Integer.parseInt(str);
                                                    } catch (Exception unused) {
                                                        i = 0;
                                                    }
                                                    if (i > 0 && i <= 1314) {
                                                        GiftPanelBottomWidget.this.g.a("hotsoon.pref.GIFT_GROUP_COUNT", (Object) Integer.valueOf(i)).a();
                                                        GiftPanelBottomWidget.this.a(i);
                                                    }
                                                }

                                                public final void b(String str) {
                                                    if (PatchProxy.isSupport(new Object[]{str}, this, f15292a, false, 9993, new Class[]{String.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{str}, this, f15292a, false, 9993, new Class[]{String.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    GiftPanelBottomWidget.this.h = null;
                                                    GiftPanelBottomWidget.this.dataCenter.lambda$put$1$DataCenter("data_pre_show_keyboard", Boolean.FALSE);
                                                }
                                            };
                                            giftPanelBottomWidget.h.show(((FragmentActivity) giftPanelBottomWidget.context).getSupportFragmentManager(), "CountInputDialog");
                                        }
                                    }

                                    public final void a(int i) {
                                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f15282a, false, 9987, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f15282a, false, 9987, new Class[]{Integer.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        GiftPanelBottomWidget.this.f15275f.dismiss();
                                        if (i > 0 && i <= 1314) {
                                            GiftPanelBottomWidget.this.g.a("hotsoon.pref.GIFT_GROUP_COUNT", (Object) Integer.valueOf(i)).a();
                                            GiftPanelBottomWidget.this.a(i);
                                        }
                                    }
                                }));
                                this.f15275f.setAnchorView(this.f15273d);
                                this.f15275f.setBackgroundDrawable(com.ss.android.ugc.bytex.a.a.a.a(this.context.getResources(), 2130840742));
                                this.f15275f.setModal(true);
                            }
                        }
                        Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(this.context.getResources(), 2130841279);
                        a2.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
                        if (this.f15273d.getId() == C0906R.id.cnv) {
                            this.f15273d.setCompoundDrawables(a2, null, null, null);
                        } else {
                            this.f15273d.setCompoundDrawables(null, null, a2, null);
                        }
                        this.f15275f.show();
                        Resources resources = this.context.getResources();
                        ListView listView = this.f15275f.getListView();
                        if (listView != null) {
                            listView.setVerticalScrollBarEnabled(false);
                            if (n) {
                                listView.setPadding(0, (int) ak.a(this.context, 6.0f), 0, (int) ak.a(this.context, 6.0f));
                            } else {
                                listView.setDivider(new ColorDrawable(resources.getColor(C0906R.color.acz)));
                                listView.setDividerHeight(resources.getDimensionPixelSize(C0906R.dimen.o5));
                            }
                        }
                    }
                }
            } else if (view.getId() == C0906R.id.co2) {
                c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(com.bytedance.android.livesdk.gift.model.a.a aVar, boolean z) {
        int i2;
        GiftDialogViewModel.b bVar;
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{aVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f15270a, false, 9963, new Class[]{com.bytedance.android.livesdk.gift.model.a.a.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Byte.valueOf(z)}, this, f15270a, false, 9963, new Class[]{com.bytedance.android.livesdk.gift.model.a.a.class, Boolean.TYPE}, Void.TYPE);
        } else if (this.i == null || this.i != aVar || z) {
            TextView textView = this.f15272c;
            if (n) {
                i2 = C0906R.string.cyl;
            } else {
                i2 = C0906R.string.djd;
            }
            textView.setText(i2);
            this.i = aVar;
            int i5 = 8;
            if (aVar == null) {
                if (((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).walletCenter().b() <= 0) {
                    this.f15272c.setBackgroundResource(2130840840);
                    this.f15272c.setText(C0906R.string.dkq);
                } else {
                    this.f15272c.setBackgroundResource(2130840813);
                }
                this.f15272c.setVisibility(0);
                this.f15273d.setVisibility(8);
                a(1);
            } else if (aVar.f15095a == 4 || this.m.t.getValue() != null || !aVar.c()) {
                this.f15272c.setBackgroundResource(2130840840);
                this.f15272c.setVisibility(0);
                this.f15273d.setVisibility(8);
                a(1);
            } else {
                this.u = this.g.a("hotsoon.pref.GIFT_GROUP_COUNT", 1);
                this.f15273d.setText(String.valueOf(this.u));
                this.f15273d.setVisibility(0);
                TextView textView2 = this.f15273d;
                if (com.bytedance.android.live.uikit.d.c.a(this.context)) {
                    i4 = 2130840815;
                } else {
                    i4 = 2130840814;
                }
                textView2.setBackgroundResource(i4);
                this.f15272c.setBackgroundResource(2130840840);
                this.f15272c.setVisibility(0);
                a(this.u);
            }
            if (aVar != null || !b()) {
                this.r.setVisibility(8);
                this.s.setVisibility(8);
                TextView textView3 = this.f15271b;
                if (this.t != GiftDialogViewModel.b.GOLDEN_BEAN) {
                    i5 = 0;
                }
                textView3.setVisibility(i5);
                this.p.setVisibility(0);
                this.f15272c.setVisibility(0);
            } else if (com.bytedance.android.live.uikit.a.a.g()) {
                this.r.setVisibility(8);
                this.s.setVisibility(8);
                TextView textView4 = this.f15271b;
                if (this.t != GiftDialogViewModel.b.GOLDEN_BEAN) {
                    i5 = 0;
                }
                textView4.setVisibility(i5);
                this.q.setVisibility(0);
                this.p.setVisibility(0);
                this.f15272c.setVisibility(0);
                if (LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE_V2.a() != null && d()) {
                    String str = "";
                    Iterator<a.C0134a> it2 = ((com.bytedance.android.livesdkapi.i.b) LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE_V2.a()).f18808b.g.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        a.C0134a next = it2.next();
                        if ("USD".equals(next.f18684a)) {
                            str = next.f18685b;
                            break;
                        }
                    }
                    StringBuilder sb = new StringBuilder(ac.a((int) C0906R.string.cv2));
                    sb.append(" + ");
                    List<b.a> list = ((com.bytedance.android.livesdkapi.i.b) LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE_V2.a()).f18807a;
                    for (int i6 = 0; i6 < list.size(); i6++) {
                        sb.append(((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).parsePatternAndGetSpannable(list.get(i6).f18809a, ""));
                        if (i6 != list.size() - 1) {
                            sb.append(" + ");
                        }
                    }
                    View inflate = LayoutInflater.from(this.context).inflate(C0906R.layout.aoj, null);
                    ((TextView) inflate.findViewById(C0906R.id.dlk)).setText(ac.a((int) C0906R.string.cxd, str, sb.toString()));
                    Drawable background = inflate.findViewById(C0906R.id.ca6).getBackground();
                    if (background != null && Build.VERSION.SDK_INT >= 19) {
                        background.setAutoMirrored(true);
                    }
                    inflate.measure(0, 0);
                    final d dVar = (d) ((d) ((d) d.a(this.context).a(inflate, -2, inflate.getMeasuredHeight())).a(true)).a((d.a) new d.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f15284a;

                        public final void a(View view, d dVar) {
                            View view2 = view;
                            final d dVar2 = dVar;
                            if (PatchProxy.isSupport(new Object[]{view2, dVar2}, this, f15284a, false, 9989, new Class[]{View.class, d.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view2, dVar2}, this, f15284a, false, 9989, new Class[]{View.class, d.class}, Void.TYPE);
                                return;
                            }
                            view2.setOnClickListener(new View.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f15286a;

                                public final void onClick(View view) {
                                    if (PatchProxy.isSupport(new Object[]{view}, this, f15286a, false, 9990, new Class[]{View.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{view}, this, f15286a, false, 9990, new Class[]{View.class}, Void.TYPE);
                                        return;
                                    }
                                    dVar2.dismiss();
                                    GiftPanelBottomWidget.this.a();
                                }
                            });
                        }
                    }).b();
                    TextView textView5 = this.f15272c;
                    if (com.bytedance.android.live.uikit.d.c.a(this.context)) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    dVar.a(textView5, 0, i3, 0, 0);
                    this.f15272c.postDelayed(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f15289a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f15289a, false, 9991, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f15289a, false, 9991, new Class[0], Void.TYPE);
                                return;
                            }
                            dVar.dismiss();
                        }
                    }, 5000);
                } else {
                    return;
                }
            } else {
                this.r.setVisibility(0);
                this.s.setVisibility(0);
                this.f15271b.setVisibility(8);
                this.q.setVisibility(4);
                this.p.setVisibility(4);
                this.f15272c.setVisibility(4);
            }
            if (aVar == null || !aVar.e()) {
                bVar = GiftDialogViewModel.b.DIAMOND;
            } else {
                bVar = GiftDialogViewModel.b.GOLDEN_BEAN;
            }
            a(bVar);
        }
    }
}
