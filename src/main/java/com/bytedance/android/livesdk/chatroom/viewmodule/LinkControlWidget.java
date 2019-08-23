package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Dialog;
import android.arch.lifecycle.Observer;
import android.content.DialogInterface;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.interact.LinkDialog;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomVideoAnchorWidget;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomVideoGuestWidget;
import com.bytedance.android.livesdk.chatroom.interact.a.h;
import com.bytedance.android.livesdk.chatroom.interact.c.bl;
import com.bytedance.android.livesdk.chatroom.interact.c.bp;
import com.bytedance.android.livesdk.chatroom.interact.c.bq;
import com.bytedance.android.livesdk.chatroom.interact.data.LinkAutoMatchModel;
import com.bytedance.android.livesdk.chatroom.interact.k;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.Widget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.aspectj.lang.a;

public class LinkControlWidget extends LiveWidget implements Observer<KVData>, bl.a, com.bytedance.android.livesdk.d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12576a;

    /* renamed from: b  reason: collision with root package name */
    public LinkInRoomVideoAnchorWidget f12577b;

    /* renamed from: c  reason: collision with root package name */
    public LinkInRoomVideoGuestWidget f12578c;

    /* renamed from: d  reason: collision with root package name */
    public LinkCrossRoomWidget f12579d;

    /* renamed from: e  reason: collision with root package name */
    public LinkInRoomAudioWidget f12580e;

    /* renamed from: f  reason: collision with root package name */
    public bl f12581f;
    public Room g;
    public com.bytedance.android.livesdkapi.depend.model.live.a h;
    public boolean i;
    @Mode
    public int j;
    public LinkDialog k;
    public LinkAutoMatchModel l;
    public Disposable m;
    public c n = new c(this, (byte) 0);
    public boolean o;
    private TextView p;
    private a q;
    private Disposable r;
    private b s = new b(this, (byte) 0);
    private Dialog t;
    private long u;
    private h.a v = new h.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12582a;

        public final boolean c() {
            if (PatchProxy.isSupport(new Object[0], this, f12582a, false, 6967, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f12582a, false, 6967, new Class[0], Boolean.TYPE)).booleanValue();
            }
            LinkControlWidget.this.l = null;
            LinkControlWidget.this.n.a();
            return false;
        }

        public final boolean a() {
            if (PatchProxy.isSupport(new Object[0], this, f12582a, false, 6964, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f12582a, false, 6964, new Class[0], Boolean.TYPE)).booleanValue();
            }
            c cVar = LinkControlWidget.this.n;
            if (PatchProxy.isSupport(new Object[0], cVar, c.f12594a, false, 6984, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, c.f12594a, false, 6984, new Class[0], Void.TYPE);
            } else {
                cVar.f12598e.setVisibility(0);
                cVar.f12598e.startAnimation(cVar.f12599f);
            }
            return false;
        }

        public final boolean b() {
            LinkDialog linkDialog;
            if (PatchProxy.isSupport(new Object[0], this, f12582a, false, 6966, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f12582a, false, 6966, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (LinkControlWidget.this.k != null && LinkControlWidget.this.k.isViewValid()) {
                LinkControlWidget.this.n.a();
            } else if (((Boolean) com.bytedance.android.livesdk.w.b.aG.a()).booleanValue()) {
                LinkControlWidget.this.m = ((ab) Observable.timer(3, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).as(LinkControlWidget.this.autoDispose())).a(new Consumer<Long>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f12584a;

                    public final /* synthetic */ void accept(Object obj) throws Exception {
                        Long l = (Long) obj;
                        if (PatchProxy.isSupport(new Object[]{l}, this, f12584a, false, 6968, new Class[]{Long.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{l}, this, f12584a, false, 6968, new Class[]{Long.class}, Void.TYPE);
                            return;
                        }
                        com.bytedance.android.livesdk.chatroom.interact.a.a.a().a(LinkControlWidget.this.g.getId());
                    }
                }, new Consumer<Throwable>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f12586a;

                    public final /* synthetic */ void accept(Object obj) throws Exception {
                        Throwable th = (Throwable) obj;
                        if (PatchProxy.isSupport(new Object[]{th}, this, f12586a, false, 6969, new Class[]{Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{th}, this, f12586a, false, 6969, new Class[]{Throwable.class}, Void.TYPE);
                            return;
                        }
                        LinkControlWidget.this.a(th);
                    }
                });
            } else {
                LinkControlWidget linkControlWidget = LinkControlWidget.this;
                LinkDialog.a a2 = LinkDialog.a(LinkControlWidget.this.dataCenter, LinkControlWidget.this);
                LinkAutoMatchModel linkAutoMatchModel = LinkControlWidget.this.l;
                if (PatchProxy.isSupport(new Object[]{linkAutoMatchModel}, a2, LinkDialog.a.f10237a, false, 4340, new Class[]{LinkAutoMatchModel.class}, LinkDialog.class)) {
                    LinkDialog.a aVar = a2;
                    linkDialog = (LinkDialog) PatchProxy.accessDispatch(new Object[]{linkAutoMatchModel}, aVar, LinkDialog.a.f10237a, false, 4340, new Class[]{LinkAutoMatchModel.class}, LinkDialog.class);
                } else {
                    a2.f10242f = linkAutoMatchModel;
                    linkDialog = a2.a(3);
                }
                linkControlWidget.k = linkDialog;
                LinkControlWidget.this.k.show(((FragmentActivity) LinkControlWidget.this.context).getSupportFragmentManager(), "LinkDialog");
                LinkControlWidget.this.n.a();
            }
            LinkControlWidget.this.l = null;
            return false;
        }

        public final boolean a(LinkAutoMatchModel linkAutoMatchModel) {
            LinkControlWidget.this.l = linkAutoMatchModel;
            return false;
        }

        public final boolean b(LinkAutoMatchModel linkAutoMatchModel) {
            if (PatchProxy.isSupport(new Object[]{linkAutoMatchModel}, this, f12582a, false, 6965, new Class[]{LinkAutoMatchModel.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{linkAutoMatchModel}, this, f12582a, false, 6965, new Class[]{LinkAutoMatchModel.class}, Boolean.TYPE)).booleanValue();
            }
            LinkControlWidget.this.l = null;
            LinkControlWidget.this.n.a();
            if (LinkControlWidget.this.k != null && LinkControlWidget.this.k.isViewValid()) {
                return false;
            }
            LinkControlWidget.this.k = LinkDialog.a(LinkControlWidget.this.dataCenter, LinkControlWidget.this).a(linkAutoMatchModel);
            LinkControlWidget.this.k.show(((FragmentActivity) LinkControlWidget.this.context).getSupportFragmentManager(), "LinkDialog");
            return false;
        }
    };

    public @interface Mode {
    }

    public interface a {
        Widget a(int i);

        void a(Widget widget);
    }

    class b implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12588a;

        /* renamed from: f  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f12589f;

        /* renamed from: b  reason: collision with root package name */
        View f12590b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f12591c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f12592d;

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12588a, false, 6978, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12588a, false, 6978, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12588a, false, 6977, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12588a, false, 6977, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f12588a, true, 6976, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f12588a, true, 6976, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LinkControlWidget.java", b.class);
            f12589f = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$ToolbarInteractBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 709);
        }

        private b() {
        }

        static final /* synthetic */ void a(DialogInterface dialogInterface) {
            com.bytedance.android.livesdk.chatroom.interact.a.a.a().b();
            dialogInterface.dismiss();
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f12588a, false, 6972, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f12588a, false, 6972, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.f12590b != null) {
                this.f12590b.setVisibility(i);
            }
        }

        public final void b(@DrawableRes int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f12588a, false, 6973, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f12588a, false, 6973, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.f12590b != null) {
                this.f12590b.setBackgroundResource(i);
            }
        }

        public void onClick(View view) {
            LinkDialog linkDialog;
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f12588a, false, 6971, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f12588a, false, 6971, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f12589f, this, this, view2));
            LinkCrossRoomDataHolder.d dVar = (LinkCrossRoomDataHolder.d) LinkCrossRoomDataHolder.a().get("data_pk_state");
            if (Build.VERSION.SDK_INT < 17) {
                ai.a((int) C0906R.string.d7l);
            } else if (!com.bytedance.android.livesdkapi.a.a.f18614b && LinkControlWidget.this.h == com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO && !((Boolean) com.bytedance.android.livesdk.config.a.L.a()).booleanValue()) {
                ai.a(LinkControlWidget.this.context.getString(C0906R.string.d5q));
            } else if (LinkControlWidget.this.j == 1) {
                if (LinkControlWidget.this.i) {
                    LinkInRoomVideoAnchorWidget linkInRoomVideoAnchorWidget = LinkControlWidget.this.f12577b;
                    if (PatchProxy.isSupport(new Object[0], linkInRoomVideoAnchorWidget, LinkInRoomVideoAnchorWidget.f10243a, false, 4360, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], linkInRoomVideoAnchorWidget, LinkInRoomVideoAnchorWidget.f10243a, false, 4360, new Class[0], Void.TYPE);
                    } else {
                        linkInRoomVideoAnchorWidget.f10245c.a();
                    }
                } else {
                    LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget = LinkControlWidget.this.f12578c;
                    if (PatchProxy.isSupport(new Object[0], linkInRoomVideoGuestWidget, LinkInRoomVideoGuestWidget.f10253a, false, 4386, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], linkInRoomVideoGuestWidget, LinkInRoomVideoGuestWidget.f10253a, false, 4386, new Class[0], Void.TYPE);
                    } else if (!TTLiveSDKContext.getHostService().k().c()) {
                        TTLiveSDKContext.getHostService().k().a(linkInRoomVideoGuestWidget.context, i.a().a(ac.a((int) C0906R.string.d5n)).c("interact").a(0).a()).compose(linkInRoomVideoGuestWidget.getAutoUnbindTransformer()).subscribe((io.reactivex.Observer<? super T>) new g<Object>());
                    } else if (!TTLiveSDKContext.getHostService().k().a(com.bytedance.android.livesdk.user.h.INTERACT)) {
                        if (linkInRoomVideoGuestWidget.f10256d.d() > 0 || ((Integer) e.a().f9041c).intValue() != 0) {
                            linkInRoomVideoGuestWidget.f10255c.a();
                        } else {
                            linkInRoomVideoGuestWidget.f10255c.c();
                        }
                    }
                }
                aa.a(LinkControlWidget.this.g, "click_connection_button", "anchor_connection", true);
            } else if (LinkControlWidget.this.j != 2) {
                if (LinkControlWidget.this.h == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                    if (LinkControlWidget.this.j == 0) {
                        LinkControlWidget linkControlWidget = LinkControlWidget.this;
                        if (PatchProxy.isSupport(new Object[0], linkControlWidget, LinkControlWidget.f12576a, false, 6929, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], linkControlWidget, LinkControlWidget.f12576a, false, 6929, new Class[0], Void.TYPE);
                        } else {
                            new m.a(linkControlWidget.context).a(false).d((int) C0906R.string.d05).c((CharSequence) linkControlWidget.context.getString(C0906R.string.d_z)).b(0, (int) C0906R.string.cqy, (DialogInterface.OnClickListener) new an(linkControlWidget)).b(1, (int) C0906R.string.cpz, ao.f12983b).c();
                        }
                    } else {
                        LinkInRoomAudioWidget linkInRoomAudioWidget = LinkControlWidget.this.f12580e;
                        if (PatchProxy.isSupport(new Object[0], linkInRoomAudioWidget, LinkInRoomAudioWidget.f12610a, false, 7045, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], linkInRoomAudioWidget, LinkInRoomAudioWidget.f12610a, false, 7045, new Class[0], Void.TYPE);
                        } else if (!TTLiveSDKContext.getHostService().k().c()) {
                            TTLiveSDKContext.getHostService().k().a(linkInRoomAudioWidget.context, i.a().a(ac.a((int) C0906R.string.d5n)).c("interact").a(0).a()).compose(linkInRoomAudioWidget.getAutoUnbindTransformer()).subscribe((io.reactivex.Observer<? super T>) new g<Object>());
                        } else {
                            if (!TTLiveSDKContext.getHostService().k().a(com.bytedance.android.livesdk.user.h.INTERACT)) {
                                if (linkInRoomAudioWidget.f12614e.d() > 0 || ((Integer) e.a().f9041c).intValue() != 0) {
                                    linkInRoomAudioWidget.f12612c.l();
                                } else {
                                    linkInRoomAudioWidget.f12612c.j();
                                }
                            }
                        }
                    }
                } else if (LinkControlWidget.this.j == 0 && com.bytedance.android.livesdk.chatroom.interact.a.a.a().c()) {
                    new m.a(LinkControlWidget.this.context).a((CharSequence) LinkControlWidget.this.context.getString(C0906R.string.d50)).b(0, (int) C0906R.string.dg_, at.f12993b).b(1, (int) C0906R.string.cpz, au.f12995b).c();
                } else if (LinkControlWidget.this.k == null || !LinkControlWidget.this.k.isVisible()) {
                    if (com.bytedance.android.live.uikit.a.a.a() || (this.f12592d && !this.f12591c)) {
                        LinkControlWidget.this.o = false;
                        LinkControlWidget.this.f12581f.a();
                        HashMap hashMap = new HashMap();
                        hashMap.put("connection_type", "anchor");
                        com.bytedance.android.livesdk.j.a.a().a("connection_click", hashMap, new j().a("live_detail").b("live").f("click"), Room.class);
                    } else if (this.f12592d || !this.f12591c) {
                        LinkControlWidget linkControlWidget2 = LinkControlWidget.this;
                        LinkDialog.a a2 = LinkDialog.a(LinkControlWidget.this.dataCenter, LinkControlWidget.this);
                        if (PatchProxy.isSupport(new Object[0], a2, LinkDialog.a.f10237a, false, 4344, new Class[0], LinkDialog.class)) {
                            linkDialog = (LinkDialog) PatchProxy.accessDispatch(new Object[0], a2, LinkDialog.a.f10237a, false, 4344, new Class[0], LinkDialog.class);
                        } else {
                            linkDialog = a2.a(0);
                        }
                        linkControlWidget2.k = linkDialog;
                        LinkControlWidget.this.k.show(((FragmentActivity) LinkControlWidget.this.context).getSupportFragmentManager(), "LinkDialog");
                        if (LinkControlWidget.this.m != null) {
                            LinkControlWidget.this.m.dispose();
                        }
                    } else {
                        LinkControlWidget.this.i();
                    }
                }
            } else if (dVar != LinkCrossRoomDataHolder.d.DISABLED) {
                ai.a((int) C0906R.string.d4u);
            } else {
                LinkControlWidget.this.f12579d.g();
            }
        }

        /* synthetic */ b(LinkControlWidget linkControlWidget, byte b2) {
            this();
        }

        public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12588a, false, 6970, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12588a, false, 6970, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            this.f12590b = view;
            if (!com.bytedance.android.live.uikit.a.a.g() || LinkControlWidget.this.h != com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO || !LinkControlWidget.this.i) {
                this.f12592d = true;
                this.f12591c = true;
                return;
            }
            this.f12590b.setVisibility(8);
        }
    }

    class c implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12594a;
        private static final /* synthetic */ a.C0900a h;

        /* renamed from: b  reason: collision with root package name */
        final int f12595b;

        /* renamed from: c  reason: collision with root package name */
        com.bytedance.android.livesdk.popup.a f12596c;

        /* renamed from: d  reason: collision with root package name */
        public View f12597d;

        /* renamed from: e  reason: collision with root package name */
        View f12598e;

        /* renamed from: f  reason: collision with root package name */
        Animation f12599f;

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12594a, false, 6991, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12594a, false, 6991, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f12594a, false, 6985, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12594a, false, 6985, new Class[0], Void.TYPE);
                return;
            }
            this.f12598e.setVisibility(8);
            this.f12598e.clearAnimation();
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f12594a, false, 6989, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12594a, false, 6989, new Class[0], Void.TYPE);
                return;
            }
            if (this.f12596c != null && this.f12596c.f()) {
                this.f12596c.dismiss();
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f12594a, true, 6990, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f12594a, true, 6990, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LinkControlWidget.java", c.class);
            h = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$ToolbarPkBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 828);
        }

        private c() {
            int i;
            if (com.bytedance.android.live.uikit.a.a.f()) {
                i = 2;
            } else {
                i = 1;
            }
            this.f12595b = i;
        }

        public final void a(@DrawableRes int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f12594a, false, 6987, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f12594a, false, 6987, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.f12597d != null) {
                this.f12597d.setBackgroundResource(i);
            }
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f12594a, false, 6983, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12594a, false, 6983, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(h, this, this, view));
            LinkCrossRoomDataHolder.d dVar = (LinkCrossRoomDataHolder.d) LinkCrossRoomDataHolder.a().get("data_pk_state");
            if (Build.VERSION.SDK_INT < 17) {
                ai.a((int) C0906R.string.d7l);
            } else if (!((Boolean) com.bytedance.android.livesdk.config.a.L.a()).booleanValue()) {
                ai.a(LinkControlWidget.this.context.getString(C0906R.string.d5q));
            } else if (LinkControlWidget.this.j == 0) {
                if (com.bytedance.android.livesdk.chatroom.interact.a.a.a().c() || (LinkControlWidget.this.m != null && !LinkControlWidget.this.m.isDisposed())) {
                    LinkControlWidget.this.k = LinkDialog.a(LinkControlWidget.this.dataCenter, LinkControlWidget.this).a(LinkControlWidget.this.l);
                    LinkControlWidget.this.k.show(((FragmentActivity) LinkControlWidget.this.context).getSupportFragmentManager(), "LinkDialog");
                    return;
                }
                LinkControlWidget.this.o = true;
                LinkControlWidget.this.f12581f.a();
            } else if (LinkControlWidget.this.j != 2 || dVar == LinkCrossRoomDataHolder.d.DISABLED) {
                ai.a((int) C0906R.string.d4v);
            } else {
                LinkControlWidget.this.f12579d.g();
            }
        }

        /* synthetic */ c(LinkControlWidget linkControlWidget, byte b2) {
            this();
        }

        public final void b(@NonNull View view, @NonNull DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12594a, false, 6982, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12594a, false, 6982, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            a();
            b();
        }

        public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12594a, false, 6981, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12594a, false, 6981, new Class[]{View.class, DataCenter.class}, Void.TYPE);
                return;
            }
            this.f12597d = view;
            this.f12598e = this.f12597d.findViewById(C0906R.id.b41);
            this.f12599f = AnimationUtils.loadAnimation(LinkControlWidget.this.context, C0906R.anim.dw);
            this.f12599f.setInterpolator(new LinearInterpolator());
            if (com.bytedance.android.live.uikit.a.a.g() && LinkControlWidget.this.h == com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO && LinkControlWidget.this.i) {
                this.f12597d.setVisibility(8);
            }
        }
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12576a, false, 6956, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12576a, false, 6956, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12576a, false, 6957, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12576a, false, 6957, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.aml;
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f12576a, false, 6941, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12576a, false, 6941, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (this.k != null && this.k.isVisible()) {
                this.k.dismiss();
            }
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f12576a, false, 6931, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12576a, false, 6931, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.app.dataholder.d.a().a(Boolean.TRUE);
        if (this.g.isLiveTypeAudio()) {
            b(3);
        } else {
            b(1);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f12576a, false, 6933, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12576a, false, 6933, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.app.dataholder.d.a().a(Boolean.FALSE);
        b(0);
        if (!this.i) {
            this.s.a(8);
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f12576a, false, 6936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12576a, false, 6936, new Class[0], Void.TYPE);
            return;
        }
        b(0);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f12576a, false, 6939, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12576a, false, 6939, new Class[0], Void.TYPE);
        } else if (!isViewValid() || this.j == 2) {
        } else {
            if (this.j != 1 || !this.i) {
                b(0);
            }
        }
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f12576a, false, 6945, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12576a, false, 6945, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.i && LinkCrossRoomDataHolder.a().p == 1 && ((Boolean) com.bytedance.android.livesdk.w.b.aG.a()).booleanValue()) {
            this.k = LinkDialog.a(this.dataCenter, this).a((LinkAutoMatchModel) null);
            this.k.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f12576a, false, 6934, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12576a, false, 6934, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null && this.k.isVisible()) {
            this.k.dismiss();
        }
        if (this.r != null) {
            this.r.dispose();
        }
        b(2);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f12576a, false, 6940, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12576a, false, 6940, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            j();
            if (LinkCrossRoomDataHolder.a().p == 1) {
                ai.a((int) C0906R.string.czh, 1);
                k();
                return;
            }
            ai.a((int) C0906R.string.d4w, 1);
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f12576a, false, 6930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12576a, false, 6930, new Class[0], Void.TYPE);
            return;
        }
        if (this.t != null) {
            av.a(this.t);
        }
        if (this.k != null) {
            this.k.dismiss();
        }
        aa.a(this.g, "click_connection_button", "anchor_connection", true);
        if (com.bytedance.android.live.uikit.a.a.g()) {
            this.t = new m.a(this.context).a(false).d((int) C0906R.string.cz_).b(0, (int) C0906R.string.cqy, (DialogInterface.OnClickListener) new ap(this)).b(1, (int) C0906R.string.cpz, aq.f12987b).c();
        } else {
            this.f12581f.a(0);
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12576a, false, 6949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12576a, false, 6949, new Class[0], Void.TYPE);
            return;
        }
        this.dataCenter.removeObserver(this);
        if (LinkCrossRoomDataHolder.a() != LinkCrossRoomDataHolder.f9028b) {
            LinkCrossRoomDataHolder.a().removeObserver(this);
        }
        this.q = null;
        this.f12581f.d();
        j();
        com.bytedance.android.livesdk.chatroom.interact.a.a.a().a(this.v);
        com.bytedance.android.livesdk.chatroom.interact.a.a.a().b();
        super.onDestroy();
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12576a, false, 6928, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12576a, false, 6928, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g = (Room) this.dataCenter.get("data_room");
        this.i = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.h = (com.bytedance.android.livesdkapi.depend.model.live.a) this.dataCenter.get("data_live_mode");
        d a2 = com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.a();
        a2.a(f.INTERACTION, (d.a) this.s);
        a2.a(f.PK, (d.a) this.n);
        this.p = (TextView) this.contentView.findViewById(C0906R.id.av4);
        if (!this.i) {
            this.s.a(8);
        }
        this.f12581f = new bl(this.g, this.i, this.h);
        this.f12581f.a((bl.a) this);
        com.bytedance.android.livesdk.chatroom.interact.a.a a3 = com.bytedance.android.livesdk.chatroom.interact.a.a.a();
        h.a aVar = this.v;
        if (PatchProxy.isSupport(new Object[]{aVar}, a3, com.bytedance.android.livesdk.chatroom.interact.a.a.f10262a, false, 4605, new Class[]{h.a.class}, Void.TYPE)) {
            com.bytedance.android.livesdk.chatroom.interact.a.a aVar2 = a3;
            PatchProxy.accessDispatch(new Object[]{aVar}, aVar2, com.bytedance.android.livesdk.chatroom.interact.a.a.f10262a, false, 4605, new Class[]{h.a.class}, Void.TYPE);
        } else if (aVar != null) {
            a3.a(aVar, a3.f10264b.size());
        }
        this.dataCenter.observeForever("data_keyboard_status", this).observeForever("cmd_pk_state_change", this).observeForever("data_interact_debug_info", this).observe("cmd_audience_turn_on_link", this);
        if (LinkCrossRoomDataHolder.a() != LinkCrossRoomDataHolder.f9028b) {
            LinkCrossRoomDataHolder.a().observe("data_pk_state", this);
        }
    }

    public final void h() {
        boolean z;
        boolean z2;
        LinkDialog linkDialog;
        LinkDialog linkDialog2;
        if (PatchProxy.isSupport(new Object[0], this, f12576a, false, 6951, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12576a, false, 6951, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (this.k == null || !this.k.isVisible()) {
                if (PatchProxy.isSupport(new Object[0], this, f12576a, false, 6955, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f12576a, false, 6955, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (Build.VERSION.SDK_INT < 21) {
                    ai.a((int) C0906R.string.d7l);
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (com.bytedance.android.live.uikit.a.a.a() || (this.s.f12592d && !this.s.f12591c)) {
                        if (!this.o) {
                            LinkDialog.a a2 = LinkDialog.a(this.dataCenter, this);
                            if (!this.s.f12592d || this.s.f12591c) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, a2, LinkDialog.a.f10237a, false, 4341, new Class[]{Boolean.TYPE}, LinkDialog.class)) {
                                LinkDialog.a aVar = a2;
                                linkDialog = (LinkDialog) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, aVar, LinkDialog.a.f10237a, false, 4341, new Class[]{Boolean.TYPE}, LinkDialog.class);
                            } else {
                                a2.f10241e = z2;
                                linkDialog = a2.a(6);
                            }
                            this.k = linkDialog;
                            this.k.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                        }
                    } else if (((Boolean) com.bytedance.android.livesdk.w.b.aH.a()).booleanValue()) {
                        LinkDialog.a a3 = LinkDialog.a(this.dataCenter, this);
                        if (PatchProxy.isSupport(new Object[0], a3, LinkDialog.a.f10237a, false, 4342, new Class[0], LinkDialog.class)) {
                            linkDialog2 = (LinkDialog) PatchProxy.accessDispatch(new Object[0], a3, LinkDialog.a.f10237a, false, 4342, new Class[0], LinkDialog.class);
                        } else {
                            linkDialog2 = a3.a(5);
                        }
                        this.k = linkDialog2;
                        this.k.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                    }
                    this.k = LinkDialog.a(this.dataCenter, this).a();
                    this.k.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                }
            }
        }
    }

    public LinkControlWidget(a aVar) {
        this.q = aVar;
    }

    public final void b(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f12576a, false, 6932, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f12576a, false, 6932, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        l.a(this.context, th2, (int) C0906R.string.d7u);
    }

    public final void c(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f12576a, false, 6935, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f12576a, false, 6935, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (th2 instanceof com.bytedance.android.live.a.a.b.a) {
            String prompt = ((com.bytedance.android.live.a.a.b.a) th2).getPrompt();
            if (!TextUtils.isEmpty(prompt)) {
                ai.a(prompt);
                return;
            }
        }
        ai.a((int) C0906R.string.czm);
    }

    public final void b(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f12576a, false, 6954, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f12576a, false, 6954, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        b bVar = this.s;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, bVar, b.f12588a, false, 6974, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            b bVar2 = bVar;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, bVar2, b.f12588a, false, 6974, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        bVar.f12591c = z2;
        if (z2) {
            bVar.f12590b.setVisibility(0);
        }
    }

    public final void d(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f12576a, false, 6952, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f12576a, false, 6952, new Class[]{Throwable.class}, Void.TYPE);
        } else if (isViewValid()) {
            l.a(this.context, th2);
        }
    }

    public final void a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12576a, false, 6938, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12576a, false, 6938, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            j();
            if (i3 != 1 || LinkCrossRoomDataHolder.a().f9032f == 0) {
                LinkCrossRoomDataHolder.a().f9029c = false;
                LinkCrossRoomDataHolder.a().g = 0;
                LinkCrossRoomDataHolder.a().f9032f = 0;
                boolean isSupport = PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12576a, false, 6950, new Class[]{Integer.TYPE}, Integer.TYPE);
                int i4 = C0906R.string.czg;
                if (!isSupport) {
                    switch (i3) {
                        case 2:
                            if (LinkCrossRoomDataHolder.a().p == 1) {
                                i4 = C0906R.string.czh;
                                break;
                            }
                            break;
                        case 3:
                            i4 = C0906R.string.czf;
                            break;
                        case 4:
                            i4 = C0906R.string.cze;
                            break;
                        case 5:
                            break;
                        case 6:
                            i4 = C0906R.string.czd;
                            break;
                        case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                            i4 = C0906R.string.czi;
                            break;
                        default:
                            i4 = C0906R.string.czc;
                            break;
                    }
                } else {
                    i4 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12576a, false, 6950, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                }
                ai.a(i4, 1);
                if (i3 == 2) {
                    k();
                }
                LinkCrossRoomDataHolder.a().c();
            } else {
                bl blVar = this.f12581f;
                if (PatchProxy.isSupport(new Object[0], blVar, bl.f10435a, false, 4720, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], blVar, bl.f10435a, false, 4720, new Class[0], Void.TYPE);
                } else {
                    if (!blVar.f10439e) {
                        if (PatchProxy.isSupport(new Object[0], blVar, bl.f10435a, false, 4723, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], blVar, bl.f10435a, false, 4723, new Class[0], Void.TYPE);
                        } else {
                            ((ab) com.bytedance.android.livesdk.v.j.q().d().a().turnOnV3(blVar.f10436b.f9030d).as(blVar.p())).a(new bp(blVar), new bq(blVar));
                        }
                    }
                }
            }
        }
    }

    private void b(@Mode int i2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12576a, false, 6943, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12576a, false, 6943, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid() && i2 != this.j) {
            if (this.j == 1) {
                this.q.a((Widget) this.f12577b);
                this.q.a((Widget) this.f12578c);
                this.f12577b = null;
                this.f12578c = null;
            } else if (this.j == 2) {
                if (this.i) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("event_page", "live_detail");
                    hashMap.put("room_id", String.valueOf(this.g.getId()));
                    if (this.g.getId() == LinkCrossRoomDataHolder.a().f9030d) {
                        hashMap.put("inviter_id", String.valueOf(this.g.getOwner().getId()));
                        hashMap.put("invitee_id", String.valueOf(LinkCrossRoomDataHolder.a().f9032f));
                    } else {
                        hashMap.put("inviter_id", String.valueOf(LinkCrossRoomDataHolder.a().f9032f));
                        hashMap.put("invitee_id", String.valueOf(this.g.getOwner().getId()));
                    }
                    if (LinkCrossRoomDataHolder.a().p == 1) {
                        str = "random";
                    } else {
                        str = "manual";
                    }
                    hashMap.put("match_type", str);
                    if (LinkCrossRoomDataHolder.a().i == 0) {
                        hashMap.put("connection_type", "anchor");
                    } else {
                        hashMap.put("connection_type", PushConstants.URI_PACKAGE_NAME);
                        hashMap.put("pk_time", String.valueOf(LinkCrossRoomDataHolder.a().i));
                    }
                    hashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.a().f9030d));
                    hashMap.put("pk_id", String.valueOf(LinkCrossRoomDataHolder.a().f9031e));
                    hashMap.put("connection_time", String.valueOf((SystemClock.elapsedRealtime() - this.u) / 1000));
                    com.bytedance.android.livesdk.j.a.a().a("connection_over", hashMap, new j().b("live").f("other"), LinkCrossRoomDataHolder.a().b());
                }
                this.q.a((Widget) this.f12579d);
                this.f12579d = null;
                k();
                this.g.setLinkMicInfo(null);
                LinkCrossRoomDataHolder.a().c();
            } else if (this.j == 3) {
                this.q.a((Widget) this.f12580e);
                this.f12580e = null;
            }
            this.j = i2;
            LinkCrossRoomDataHolder.a().lambda$put$1$DataCenter("data_link_model", Integer.valueOf(this.j));
            if (this.j == 1) {
                if (this.i) {
                    this.f12577b = (LinkInRoomVideoAnchorWidget) this.q.a(0);
                } else {
                    this.f12578c = (LinkInRoomVideoGuestWidget) this.q.a(1);
                }
                this.s.a(0);
                this.s.b(2130841528);
                this.dataCenter.lambda$put$1$DataCenter("data_link_state", 1);
            } else if (this.j == 2) {
                this.u = SystemClock.elapsedRealtime();
                this.f12579d = (LinkCrossRoomWidget) this.q.a(2);
                if (this.i) {
                    this.s.a(0);
                    this.s.b(2130841238);
                } else {
                    this.s.a(8);
                }
                this.dataCenter.lambda$put$1$DataCenter("data_link_state", 2);
            } else if (this.j == 3) {
                this.f12580e = (LinkInRoomAudioWidget) this.q.a(3);
                this.s.a(8);
                this.dataCenter.lambda$put$1$DataCenter("data_link_state", 3);
            } else if (this.i) {
                this.s.a(0);
                this.s.b(2130841528);
                this.dataCenter.lambda$put$1$DataCenter("data_link_state", 0);
            } else {
                this.s.a(8);
                this.dataCenter.lambda$put$1$DataCenter("data_link_state", 0);
            }
        }
    }

    public final void a(boolean z) {
        boolean z2 = z;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f12576a, false, 6953, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f12576a, false, 6953, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        b bVar = this.s;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, bVar, b.f12588a, false, 6975, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            b bVar2 = bVar;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, bVar2, b.f12588a, false, 6975, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            bVar.f12592d = z2;
            if (z2) {
                bVar.f12590b.setVisibility(0);
            }
        }
        View view = this.n.f12597d;
        if (!z2) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r20) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            com.bytedance.ies.sdk.widgets.KVData r8 = (com.bytedance.ies.sdk.widgets.KVData) r8
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f12576a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 6927(0x1b0f, float:9.707E-42)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f12576a
            r3 = 0
            r4 = 6927(0x1b0f, float:9.707E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            boolean r0 = r19.isViewValid()
            if (r0 == 0) goto L_0x0346
            if (r8 == 0) goto L_0x0346
            java.lang.Object r0 = r8.getData()
            if (r0 != 0) goto L_0x0048
            goto L_0x0346
        L_0x0048:
            java.lang.String r0 = r8.getKey()
            r1 = -1
            int r2 = r0.hashCode()
            r11 = 4
            switch(r2) {
                case -1540323875: goto L_0x007e;
                case -1087608658: goto L_0x0074;
                case 1060055221: goto L_0x006a;
                case 1325017518: goto L_0x0060;
                case 1505611330: goto L_0x0056;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x0088
        L_0x0056:
            java.lang.String r2 = "data_pk_state"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0088
            r0 = 3
            goto L_0x0089
        L_0x0060:
            java.lang.String r2 = "cmd_audience_turn_on_link"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0088
            r0 = 4
            goto L_0x0089
        L_0x006a:
            java.lang.String r2 = "data_keyboard_status"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0088
            r0 = 0
            goto L_0x0089
        L_0x0074:
            java.lang.String r2 = "data_interact_debug_info"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0088
            r0 = 2
            goto L_0x0089
        L_0x007e:
            java.lang.String r2 = "cmd_pk_state_change"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0088
            r0 = 1
            goto L_0x0089
        L_0x0088:
            r0 = -1
        L_0x0089:
            switch(r0) {
                case 0: goto L_0x02f1;
                case 1: goto L_0x01a0;
                case 2: goto L_0x0140;
                case 3: goto L_0x0093;
                case 4: goto L_0x008e;
                default: goto L_0x008c;
            }
        L_0x008c:
            goto L_0x0345
        L_0x008e:
            r19.i()
            goto L_0x0345
        L_0x0093:
            java.lang.Object r0 = r8.getData()
            r8 = r0
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r8 = (com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.d) r8
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f12576a
            r3 = 0
            r4 = 6947(0x1b23, float:9.735E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d> r1 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.d.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00cb
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f12576a
            r3 = 0
            r4 = 6947(0x1b23, float:9.735E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d> r1 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.d.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0345
        L_0x00cb:
            boolean r0 = r7.i
            if (r0 == 0) goto L_0x013f
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$b r0 = r7.s
            r0.a((int) r10)
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$c r0 = r7.n
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget.c.f12594a
            r14 = 0
            r15 = 6986(0x1b4a, float:9.79E-42)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x00fc
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget.c.f12594a
            r14 = 0
            r15 = 6986(0x1b4a, float:9.79E-42)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0105
        L_0x00fc:
            android.view.View r1 = r0.f12597d
            if (r1 == 0) goto L_0x0105
            android.view.View r0 = r0.f12597d
            r0.setVisibility(r10)
        L_0x0105:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.a()
            boolean r0 = r0.f9029c
            r1 = 2130841531(0x7f020fbb, float:1.7288132E38)
            r2 = 2130841528(0x7f020fb8, float:1.7288126E38)
            if (r0 == 0) goto L_0x0135
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.d.DISABLED
            if (r8 == r0) goto L_0x0126
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$b r0 = r7.s
            r0.b(r2)
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$c r0 = r7.n
            r1 = 2130841243(0x7f020e9b, float:1.7287548E38)
            r0.a((int) r1)
            goto L_0x0345
        L_0x0126:
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$b r0 = r7.s
            r2 = 2130841238(0x7f020e96, float:1.7287537E38)
            r0.b(r2)
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$c r0 = r7.n
            r0.a((int) r1)
            goto L_0x0345
        L_0x0135:
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$b r0 = r7.s
            r0.b(r2)
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$c r0 = r7.n
            r0.a((int) r1)
        L_0x013f:
            return
        L_0x0140:
            java.lang.Object r0 = r8.getData()
            r8 = r0
            com.bytedance.android.livesdk.chatroom.event.p r8 = (com.bytedance.android.livesdk.chatroom.event.p) r8
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f12576a
            r3 = 0
            r4 = 6944(0x1b20, float:9.73E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.p> r1 = com.bytedance.android.livesdk.chatroom.event.p.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0178
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f12576a
            r3 = 0
            r4 = 6944(0x1b20, float:9.73E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.p> r1 = com.bytedance.android.livesdk.chatroom.event.p.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0345
        L_0x0178:
            com.bytedance.android.livesdk.v.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdkapi.host.d r0 = r0.a()
            java.lang.String r0 = r0.c()
            java.lang.String r1 = "local_test"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x019f
            android.widget.TextView r0 = r7.p
            boolean r1 = r8.f10190a
            if (r1 == 0) goto L_0x0193
            goto L_0x0195
        L_0x0193:
            r10 = 8
        L_0x0195:
            r0.setVisibility(r10)
            android.widget.TextView r0 = r7.p
            java.lang.String r1 = r8.f10191b
            r0.setText(r1)
        L_0x019f:
            return
        L_0x01a0:
            java.lang.Object r0 = r8.getData()
            r8 = r0
            com.bytedance.android.livesdk.chatroom.event.o r8 = (com.bytedance.android.livesdk.chatroom.event.o) r8
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f12576a
            r3 = 0
            r4 = 6946(0x1b22, float:9.733E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.o> r1 = com.bytedance.android.livesdk.chatroom.event.o.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01d8
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f12576a
            r3 = 0
            r4 = 6946(0x1b22, float:9.733E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.o> r1 = com.bytedance.android.livesdk.chatroom.event.o.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0345
        L_0x01d8:
            int r0 = r8.f10187a
            if (r0 != r11) goto L_0x0212
            io.reactivex.disposables.Disposable r0 = r7.r
            if (r0 == 0) goto L_0x01e8
            io.reactivex.disposables.Disposable r0 = r7.r
            boolean r0 = r0.isDisposed()
            if (r0 == 0) goto L_0x02f0
        L_0x01e8:
            r0 = 20
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.Observable r0 = io.reactivex.Observable.timer(r0, r2)
            com.bytedance.android.live.core.rxutils.a r1 = r19.getAutoUnbindTransformer()
            io.reactivex.Observable r0 = r0.compose(r1)
            io.reactivex.Scheduler r1 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r0 = r0.observeOn(r1)
            com.bytedance.android.livesdk.chatroom.viewmodule.ar r1 = new com.bytedance.android.livesdk.chatroom.viewmodule.ar
            r1.<init>(r7)
            com.bytedance.android.livesdk.chatroom.viewmodule.as r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.as
            r2.<init>(r7)
            io.reactivex.disposables.Disposable r0 = r0.subscribe(r1, r2)
            r7.r = r0
            goto L_0x0345
        L_0x0212:
            int r0 = r8.f10187a
            r1 = 5
            if (r0 != r1) goto L_0x02e7
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$c r0 = r7.n
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget.c.f12594a
            r14 = 0
            r15 = 6988(0x1b4c, float:9.792E-42)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0240
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget.c.f12594a
            r14 = 0
            r15 = 6988(0x1b4c, float:9.792E-42)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x02f0
        L_0x0240:
            com.bytedance.android.livesdk.w.c<java.lang.Boolean> r1 = com.bytedance.android.livesdk.w.b.l
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x02f0
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget r1 = com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget.this
            boolean r1 = r1.i
            if (r1 == 0) goto L_0x02f0
            boolean r1 = com.bytedance.android.live.uikit.a.a.g()
            if (r1 == 0) goto L_0x025c
            goto L_0x02f0
        L_0x025c:
            com.bytedance.android.livesdk.w.c<java.lang.Boolean> r1 = com.bytedance.android.livesdk.w.b.l
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r2)
            r0.b()
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget r1 = com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget.this
            android.content.Context r1 = r1.getContext()
            com.bytedance.android.livesdk.popup.d r1 = com.bytedance.android.livesdk.popup.d.a((android.content.Context) r1)
            r2 = 2131691393(0x7f0f0781, float:1.9011857E38)
            com.bytedance.android.livesdk.popup.a r1 = r1.a((int) r2)
            com.bytedance.android.livesdk.popup.d r1 = (com.bytedance.android.livesdk.popup.d) r1
            r2 = 1126170624(0x43200000, float:160.0)
            int r2 = com.bytedance.android.live.core.utils.ac.a((float) r2)
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r11[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.popup.a.f16841a
            r14 = 0
            r15 = 12781(0x31ed, float:1.791E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r10] = r4
            java.lang.Class<com.bytedance.android.livesdk.popup.a> r17 = com.bytedance.android.livesdk.popup.a.class
            r12 = r1
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x02bc
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.popup.a.f16841a
            r14 = 0
            r15 = 12781(0x31ed, float:1.791E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r10] = r3
            java.lang.Class<com.bytedance.android.livesdk.popup.a> r17 = com.bytedance.android.livesdk.popup.a.class
            r12 = r1
            r16 = r2
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            com.bytedance.android.livesdk.popup.a r1 = (com.bytedance.android.livesdk.popup.a) r1
            goto L_0x02c2
        L_0x02bc:
            r1.g = r2
            com.bytedance.android.livesdk.popup.a r1 = r1.a()
        L_0x02c2:
            com.bytedance.android.livesdk.popup.d r1 = (com.bytedance.android.livesdk.popup.d) r1
            com.bytedance.android.livesdk.popup.a r1 = r1.b((boolean) r9)
            com.bytedance.android.livesdk.popup.d r1 = (com.bytedance.android.livesdk.popup.d) r1
            com.bytedance.android.livesdk.popup.a r1 = r1.b()
            r0.f12596c = r1
            com.bytedance.android.livesdk.popup.a r8 = r0.f12596c
            android.view.View r9 = r0.f12597d
            r10 = 1
            r11 = 0
            int r0 = r0.f12595b
            float r0 = (float) r0
            int r12 = com.bytedance.android.live.core.utils.ac.a((float) r0)
            r0 = -1065353216(0xffffffffc0800000, float:-4.0)
            int r13 = com.bytedance.android.live.core.utils.ac.a((float) r0)
            r8.a(r9, r10, r11, r12, r13)
            goto L_0x0345
        L_0x02e7:
            int r0 = r8.f10187a
            if (r0 != r9) goto L_0x02f0
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$c r0 = r7.n
            r0.b()
        L_0x02f0:
            return
        L_0x02f1:
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget r0 = r7.f12579d
            if (r0 != 0) goto L_0x02f6
            return
        L_0x02f6:
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget r0 = r7.f12579d
            java.lang.Object r1 = r8.getData()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r1)
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget.f12600a
            r15 = 0
            r16 = 7011(0x1b63, float:9.825E-42)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r2[r10] = r3
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x033c
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r12[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget.f12600a
            r15 = 0
            r16 = 7011(0x1b63, float:9.825E-42)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r10] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0345
        L_0x033c:
            android.view.View r0 = r0.contentView
            if (r1 == 0) goto L_0x0341
            r10 = 4
        L_0x0341:
            r0.setVisibility(r10)
            return
        L_0x0345:
            return
        L_0x0346:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget.onChanged(java.lang.Object):void");
    }

    public final void a(long j2, com.bytedance.android.live.base.model.user.i iVar) {
        LinkDialog linkDialog;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), iVar}, this, f12576a, false, 6937, new Class[]{Long.TYPE, com.bytedance.android.live.base.model.user.i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), iVar}, this, f12576a, false, 6937, new Class[]{Long.TYPE, com.bytedance.android.live.base.model.user.i.class}, Void.TYPE);
        } else if (isViewValid() && j3 != 0) {
            j();
            String str = LinkCrossRoomDataHolder.a().j;
            com.bytedance.android.livesdk.chatroom.interact.a.a.a().b();
            LinkDialog.a a2 = LinkDialog.a(this.dataCenter, this);
            User from = User.from(iVar);
            if (PatchProxy.isSupport(new Object[]{from, str, new Long(j3)}, a2, LinkDialog.a.f10237a, false, 4345, new Class[]{User.class, String.class, Long.TYPE}, LinkDialog.class)) {
                LinkDialog.a aVar = a2;
                linkDialog = (LinkDialog) PatchProxy.accessDispatch(new Object[]{from, str, new Long(j3)}, aVar, LinkDialog.a.f10237a, false, 4345, new Class[]{User.class, String.class, Long.TYPE}, LinkDialog.class);
            } else {
                LinkDialog a3 = a2.a(1);
                a2.f10238b = from;
                a2.f10240d = str;
                a2.f10239c = j3;
                linkDialog = a3;
            }
            this.k = linkDialog;
            this.k.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
        }
    }

    public final boolean a(Runnable runnable, boolean z) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f12576a, false, 6948, new Class[]{Runnable.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{runnable2, Byte.valueOf(z)}, this, f12576a, false, 6948, new Class[]{Runnable.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!this.i && this.f12578c != null) {
            LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget = this.f12578c;
            if (PatchProxy.isSupport(new Object[]{runnable2, Byte.valueOf(z)}, linkInRoomVideoGuestWidget, LinkInRoomVideoGuestWidget.f10253a, false, 4385, new Class[]{Runnable.class, Boolean.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{runnable2, Byte.valueOf(z)}, linkInRoomVideoGuestWidget, LinkInRoomVideoGuestWidget.f10253a, false, 4385, new Class[]{Runnable.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (2 != ((Integer) e.a().f9041c).intValue()) {
                return false;
            } else {
                new m.a(linkInRoomVideoGuestWidget.getContext()).c((int) C0906R.string.d6v).b(0, (int) C0906R.string.dg_, (DialogInterface.OnClickListener) new com.bytedance.android.livesdk.chatroom.interact.j(linkInRoomVideoGuestWidget, runnable2)).b(1, (int) C0906R.string.cpz, k.f10967b).c();
                return true;
            }
        } else if (this.i || this.f12580e == null) {
            return false;
        } else {
            LinkInRoomAudioWidget linkInRoomAudioWidget = this.f12580e;
            if (PatchProxy.isSupport(new Object[]{runnable2, Byte.valueOf(z)}, linkInRoomAudioWidget, LinkInRoomAudioWidget.f12610a, false, 7043, new Class[]{Runnable.class, Boolean.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{runnable2, Byte.valueOf(z)}, linkInRoomAudioWidget, LinkInRoomAudioWidget.f12610a, false, 7043, new Class[]{Runnable.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (((Integer) e.a().f9041c).intValue() == 0) {
                return false;
            } else {
                new m.a(linkInRoomAudioWidget.getContext()).c((int) C0906R.string.d6v).b(0, (int) C0906R.string.dg_, (DialogInterface.OnClickListener) new bk(linkInRoomAudioWidget, runnable2)).b(1, (int) C0906R.string.cpz, bl.f13031b).c();
                return true;
            }
        }
    }
}
