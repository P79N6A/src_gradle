package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.event.ah;
import com.bytedance.android.livesdk.chatroom.event.o;
import com.bytedance.android.livesdk.chatroom.presenter.i;
import com.bytedance.android.livesdk.chatroom.ui.SimpleInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.ui.eq;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f;
import com.bytedance.android.livesdk.chatroom.widget.e;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.c;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.aspectj.lang.a;
import org.json.JSONArray;
import org.json.JSONObject;

public class DecorationWrapperWidget extends LiveWidget implements Observer<KVData>, i.a, e.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12475a = null;
    private static final String i = "DecorationWrapperWidget";
    private static long p;
    private static long q;

    /* renamed from: b  reason: collision with root package name */
    int[] f12476b = new int[4];

    /* renamed from: c  reason: collision with root package name */
    List<e> f12477c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public i f12478d;

    /* renamed from: e  reason: collision with root package name */
    public String f12479e = "";

    /* renamed from: f  reason: collision with root package name */
    public eq f12480f;
    public a g;
    public SimpleInputDialogFragment h = null;
    private int[] j = new int[4];
    private long k;
    private boolean l;
    private boolean m = false;
    private boolean n = false;
    private Room o;
    private SimpleInputDialogFragment.a r = new SimpleInputDialogFragment.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12481a;

        public final void b(String str) {
            DecorationWrapperWidget.this.h = null;
        }

        public final void a(String str) {
            String str2;
            if (PatchProxy.isSupport(new Object[]{str}, this, f12481a, false, 6767, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f12481a, false, 6767, new Class[]{String.class}, Void.TYPE);
            } else if (DecorationWrapperWidget.this.f12478d != null) {
                if (!DecorationWrapperWidget.this.f12478d.a()) {
                    com.bytedance.android.live.uikit.d.a.a(DecorationWrapperWidget.this.context, DecorationWrapperWidget.this.context.getString(C0906R.string.dfl, new Object[]{com.bytedance.android.livesdk.config.a.M.a()}));
                } else if (!DecorationWrapperWidget.this.f12478d.f11361b) {
                    if (TextUtils.isEmpty(str)) {
                        str2 = DecorationWrapperWidget.this.f12479e;
                    } else {
                        str2 = str;
                    }
                    if (str2.length() <= 8) {
                        DecorationWrapperWidget.this.f12478d.a(str2);
                    } else {
                        com.bytedance.android.live.uikit.d.a.a(DecorationWrapperWidget.this.context, (int) C0906R.string.cus);
                    }
                }
            }
        }
    };

    public interface a {
        void e(boolean z);
    }

    class b implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12485a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f12486c;

        public final void a(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12485a, false, 6771, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12485a, false, 6771, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12485a, false, 6773, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12485a, false, 6773, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12485a, false, 6772, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12485a, false, 6772, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f12485a, true, 6770, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f12485a, true, 6770, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("DecorationWrapperWidget.java", b.class);
            f12486c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget$ToolbarDecorationBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 543);
        }

        private b() {
        }

        public void onClick(View view) {
            int i;
            if (PatchProxy.isSupport(new Object[]{view}, this, f12485a, false, 6769, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12485a, false, 6769, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f12486c, this, this, view));
            if (DecorationWrapperWidget.this.f12480f == null) {
                DecorationWrapperWidget decorationWrapperWidget = DecorationWrapperWidget.this;
                Context context = DecorationWrapperWidget.this.getContext();
                if (ac.f()) {
                    i = C0906R.style.vr;
                } else {
                    i = C0906R.style.vs;
                }
                decorationWrapperWidget.f12480f = new eq(context, i);
            }
            if (!DecorationWrapperWidget.this.f12480f.isShowing()) {
                DecorationWrapperWidget.this.f12480f.show();
            }
        }

        /* synthetic */ b(DecorationWrapperWidget decorationWrapperWidget, byte b2) {
            this();
        }
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12475a, false, 6763, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12475a, false, 6763, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12475a, false, 6764, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12475a, false, 6764, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.aop;
    }

    public static long e() {
        return p;
    }

    public static long f() {
        return q;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f12475a, false, 6755, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f12475a, false, 6755, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.e(z);
        }
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f12475a, false, 6757, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12475a, false, 6757, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.b();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f12475a, false, 6756, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12475a, false, 6756, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            i();
        }
    }

    public final int[] d() {
        if (PatchProxy.isSupport(new Object[0], this, f12475a, false, 6749, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], this, f12475a, false, 6749, new Class[0], int[].class);
        }
        return new int[]{UIUtils.getScreenWidth(this.context), UIUtils.getScreenHeight(this.context)};
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f12475a, false, 6742, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12475a, false, 6742, new Class[0], Void.TYPE);
        } else if (isViewValid() && this.context != null && !this.m) {
            int[] iArr = new int[2];
            this.contentView.getLocationInWindow(iArr);
            this.f12476b[0] = 0;
            this.f12476b[1] = (iArr[1] + this.contentView.getHeight()) - ac.d(C0906R.dimen.mq);
            this.f12476b[2] = 0;
            this.f12476b[3] = UIUtils.getScreenWidth(this.context);
            this.j = Arrays.copyOf(this.f12476b, this.f12476b.length);
            this.m = true;
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f12475a, false, 6761, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12475a, false, 6761, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            for (e next : this.f12477c) {
                if (next != null && next.getType() == 1) {
                    if (PatchProxy.isSupport(new Object[0], next, e.f13474a, false, 7823, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], next, e.f13474a, false, 7823, new Class[0], Void.TYPE);
                    } else {
                        next.k = next.f13475b.f18717d;
                        next.f13476c.setText(next.k);
                    }
                }
            }
            g();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12475a, false, 6741, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12475a, false, 6741, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.dataCenter.removeObserver(this);
        i();
        this.f12478d.d();
        q = 0;
        p = 0;
        if (this.f12480f != null) {
            this.f12480f.dismiss();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f12475a, false, 6740, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12475a, false, 6740, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        boolean equals = Build.BRAND.equals("HUAWEI");
        if (!this.l && equals) {
            if (this.n) {
                this.n = false;
            }
            ((ViewGroup) this.contentView).removeAllViews();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f12475a, false, 6739, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12475a, false, 6739, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        boolean equals = Build.BRAND.equals("HUAWEI");
        if (!this.l && equals && !this.n && !CollectionUtils.isEmpty(this.o.getDecorationList())) {
            ArrayList arrayList = new ArrayList();
            for (c cVar : this.o.getDecorationList()) {
                arrayList.add(new c(cVar));
            }
            b((List<c>) arrayList);
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f12475a, false, 6753, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12475a, false, 6753, new Class[0], Void.TYPE);
        } else if (isViewValid() && this.l && this.f12478d != null) {
            JSONArray jSONArray = new JSONArray();
            for (e next : this.f12477c) {
                if (next != null) {
                    JSONObject decorationInfo = next.getDecorationInfo();
                    if (decorationInfo != null) {
                        jSONArray.put(decorationInfo);
                    }
                }
            }
            this.f12478d.b(jSONArray.toString());
            ArrayList arrayList = new ArrayList();
            for (e next2 : this.f12477c) {
                if (next2 != null) {
                    arrayList.add(next2.getRoomDecoration());
                }
            }
            String json = j.q().c().toJson((Object) arrayList);
            com.bytedance.android.livesdk.w.b.at.a(Long.valueOf(this.k));
            com.bytedance.android.livesdk.w.b.au.a(json);
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12475a, false, 6738, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12475a, false, 6738, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.l = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.o = (Room) this.dataCenter.get("data_room");
        if (this.o.getOwner() != null) {
            this.k = this.o.getOwner().getId();
        }
        i iVar = new i(this.o.getId(), this.o.getOwner().getId(), this.l);
        this.f12478d = iVar;
        this.f12478d.a((i.a) this);
        com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.b().a(f.DECORATION, (d.a) new b(this, (byte) 0));
        if (!this.l && !CollectionUtils.isEmpty(this.o.getDecorationList())) {
            ArrayList arrayList = new ArrayList();
            for (c cVar : this.o.getDecorationList()) {
                arrayList.add(new c(cVar));
            }
            b((List<c>) arrayList);
            this.n = true;
        }
        com.bytedance.android.livesdk.u.a.a().a(com.bytedance.android.livesdk.chatroom.event.ac.class).compose(getAutoUnbindTransformer()).subscribe((Consumer<? super T>) new Consumer<com.bytedance.android.livesdk.chatroom.event.ac>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12483a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                com.bytedance.android.livesdk.chatroom.event.ac acVar = (com.bytedance.android.livesdk.chatroom.event.ac) obj;
                if (PatchProxy.isSupport(new Object[]{acVar}, this, f12483a, false, 6768, new Class[]{com.bytedance.android.livesdk.chatroom.event.ac.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{acVar}, this, f12483a, false, 6768, new Class[]{com.bytedance.android.livesdk.chatroom.event.ac.class}, Void.TYPE);
                    return;
                }
                DecorationWrapperWidget.this.onEvent(acVar);
            }
        });
        this.dataCenter.observeForever("cmd_pk_state_change", this).observe("cmd_update_sticker_position", this, true);
    }

    private FragmentActivity a(Context context) {
        Context context2 = context;
        while (true) {
            if (PatchProxy.isSupport(new Object[]{context2}, this, f12475a, false, 6758, new Class[]{Context.class}, FragmentActivity.class)) {
                return (FragmentActivity) PatchProxy.accessDispatch(new Object[]{context2}, this, f12475a, false, 6758, new Class[]{Context.class}, FragmentActivity.class);
            } else if (context2 instanceof FragmentActivity) {
                return (FragmentActivity) context2;
            } else {
                if (!(context2 instanceof ContextWrapper)) {
                    return null;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
    }

    private void d(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f12475a, false, 6747, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f12475a, false, 6747, new Class[]{c.class}, Void.TYPE);
        } else if (isViewValid()) {
            Iterator<e> it2 = this.f12477c.iterator();
            while (it2.hasNext()) {
                e next = it2.next();
                if (next != null && next.getType() == cVar.g) {
                    ((ViewGroup) this.contentView).removeView(next);
                    it2.remove();
                }
            }
            if (this.l) {
                if (1 == cVar.g) {
                    p = 0;
                    return;
                }
                if (2 == cVar.g) {
                    q = 0;
                }
            }
        }
    }

    public final void b(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f12475a, false, 6748, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f12475a, false, 6748, new Class[]{c.class}, Void.TYPE);
        } else if (isViewValid() && cVar != null) {
            d(cVar);
        }
    }

    public void onEvent(com.bytedance.android.livesdk.chatroom.event.ac acVar) {
        if (PatchProxy.isSupport(new Object[]{acVar}, this, f12475a, false, 6750, new Class[]{com.bytedance.android.livesdk.chatroom.event.ac.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{acVar}, this, f12475a, false, 6750, new Class[]{com.bytedance.android.livesdk.chatroom.event.ac.class}, Void.TYPE);
        } else if (isViewValid() && acVar != null && acVar.f10135a != null) {
            c cVar = acVar.f10135a;
            a(cVar);
            g();
            c(cVar);
        }
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f12475a, false, 6746, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f12475a, false, 6746, new Class[]{c.class}, Void.TYPE);
        } else if (isViewValid() && cVar != null) {
            d(cVar);
            h();
            e eVar = new e(this.context, cVar, this.l, this.f12476b, this, (ViewGroup) this.contentView);
            if (cVar.g == 1 && this.f12478d != null) {
                eVar.setText(this.f12478d.a(cVar));
                this.f12479e = cVar.f18717d;
            }
            ((ViewGroup) this.contentView).addView(eVar);
            this.f12477c.add(eVar);
            if (this.l) {
                if (1 == cVar.g) {
                    p = cVar.h;
                    return;
                }
                if (2 == cVar.g) {
                    q = cVar.h;
                }
            }
        }
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f12475a, false, 6760, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f12475a, false, 6760, new Class[]{String.class}, Void.TYPE);
        } else if (isViewValid()) {
            for (e next : this.f12477c) {
                if (next != null && next.getType() == 1) {
                    next.setText(str2);
                }
            }
            g();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(c cVar) {
        boolean z;
        long j2;
        String str;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f12475a, false, 6751, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f12475a, false, 6751, new Class[]{c.class}, Void.TYPE);
        } else if (this.l) {
            if (cVar.g == 1) {
                z = true;
            } else {
                z = false;
            }
            if (this.o != null) {
                j2 = this.o.getId();
            } else {
                j2 = 0;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(j2));
            hashMap.put("prop_id", String.valueOf(cVar.h));
            if (z) {
                hashMap.put("words", cVar.f18717d);
            }
            com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
            if (z) {
                str = "live_character_prop_show";
            } else {
                str = "live_picture_prop_show";
            }
            a2.a(str, hashMap, new com.bytedance.android.livesdk.j.c.j().a("live_take_detail").f("other").b("live_take"), new k());
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f12475a, false, 6759, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f12475a, false, 6759, new Class[]{String.class}, Void.TYPE);
        } else if (isViewValid()) {
            com.bytedance.android.live.uikit.d.a.a(this.context, str2);
        }
    }

    public final void b(List<c> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f12475a, false, 6745, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f12475a, false, 6745, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.contentView.post(new y(this, list));
    }

    public final void c(String str) {
        SimpleInputDialogFragment simpleInputDialogFragment;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f12475a, false, 6754, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f12475a, false, 6754, new Class[]{String.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.dataCenter.lambda$put$1$DataCenter("data_pre_show_keyboard", Boolean.TRUE);
            if (this.h == null) {
                FragmentActivity a2 = a(this.context);
                if (a2 != null) {
                    String string = this.context.getString(C0906R.string.cus);
                    boolean z = this.l;
                    if (PatchProxy.isSupport(new Object[]{str2, string, 8, (byte) 0, Byte.valueOf(z ? (byte) 1 : 0)}, null, SimpleInputDialogFragment.f11776d, true, 6421, new Class[]{String.class, String.class, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, SimpleInputDialogFragment.class)) {
                        simpleInputDialogFragment = (SimpleInputDialogFragment) PatchProxy.accessDispatch(new Object[]{str2, string, 8, (byte) 0, Byte.valueOf(z)}, null, SimpleInputDialogFragment.f11776d, true, 6421, new Class[]{String.class, String.class, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, SimpleInputDialogFragment.class);
                    } else {
                        SimpleInputDialogFragment simpleInputDialogFragment2 = new SimpleInputDialogFragment();
                        Bundle bundle = new Bundle();
                        bundle.putString("live.intent.extra.INPUT", str2);
                        bundle.putString("live.intent.extra.HINT", string);
                        bundle.putInt("live.intent.extra.MAX_LENGTH", 8);
                        bundle.putBoolean("live.intent.extra.TOUCH_MODAL", false);
                        bundle.putBoolean("live.intent.extra.IS_BROADCASTER", z);
                        simpleInputDialogFragment2.setArguments(bundle);
                        simpleInputDialogFragment = simpleInputDialogFragment2;
                    }
                    this.h = simpleInputDialogFragment;
                    this.h.f11781f = this.r;
                    try {
                        this.h.show(a2.getSupportFragmentManager(), i);
                    } catch (IllegalStateException unused) {
                        this.h = null;
                    }
                }
                return;
            }
            this.h.a(str2);
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f12475a, false, 6762, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f12475a, false, 6762, new Class[]{KVData.class}, Void.TYPE);
        } else if (isViewValid() && kVData != null && !TextUtils.isEmpty(kVData.getKey()) && kVData.getData() != null) {
            String key = kVData.getKey();
            char c2 = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1540323875) {
                if (hashCode == 421233308 && key.equals("cmd_update_sticker_position")) {
                    c2 = 1;
                }
            } else if (key.equals("cmd_pk_state_change")) {
                c2 = 0;
            }
            switch (c2) {
                case 0:
                    o oVar = (o) kVData.getData();
                    if (PatchProxy.isSupport(new Object[]{oVar}, this, f12475a, false, 6752, new Class[]{o.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{oVar}, this, f12475a, false, 6752, new Class[]{o.class}, Void.TYPE);
                        break;
                    } else {
                        if (oVar.f10187a == 0) {
                            this.f12476b[1] = LinkCrossRoomWidget.i() + LinkCrossRoomWidget.k();
                        } else if (oVar.f10187a == 1) {
                            this.f12476b = this.j;
                        }
                        for (e a2 : this.f12477c) {
                            a2.a(this.f12476b);
                        }
                        return;
                    }
                case 1:
                    if (this.l) {
                        ah ahVar = (ah) kVData.getData();
                        if (!PatchProxy.isSupport(new Object[]{ahVar}, this, f12475a, false, 6743, new Class[]{ah.class}, Void.TYPE)) {
                            if (isViewValid() && this.context != null) {
                                this.contentView.post(new x(this, ahVar));
                                break;
                            } else {
                                return;
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[]{ahVar}, this, f12475a, false, 6743, new Class[]{ah.class}, Void.TYPE);
                            return;
                        }
                    }
                    break;
            }
        }
    }

    public final void a(List<c> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f12475a, false, 6744, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f12475a, false, 6744, new Class[]{List.class}, Void.TYPE);
        } else if (isViewValid() && !this.l) {
            for (e removeView : this.f12477c) {
                ((ViewGroup) this.contentView).removeView(removeView);
            }
            this.f12477c.clear();
            if (list != null) {
                for (c next : list) {
                    if (next != null) {
                        a(next);
                    }
                }
                if (this.o != null) {
                    this.o.setDecorationList(list);
                }
            }
        }
    }
}
