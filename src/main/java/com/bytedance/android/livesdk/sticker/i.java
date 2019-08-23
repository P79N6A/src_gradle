package com.bytedance.android.livesdk.sticker;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.h;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.c;
import com.bytedance.android.livesdk.gift.assets.j;
import com.bytedance.android.livesdk.gift.effect.b.b;
import com.bytedance.android.livesdk.gift.model.g;
import com.bytedance.android.livesdk.message.model.ab;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

public final class i implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17285a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17286b;

    /* renamed from: c  reason: collision with root package name */
    public WeakHandler f17287c = new WeakHandler(this);

    /* renamed from: d  reason: collision with root package name */
    public b f17288d;

    /* renamed from: e  reason: collision with root package name */
    public String f17289e;

    /* renamed from: f  reason: collision with root package name */
    private List<b> f17290f = new LinkedList();
    private b g;
    private c h = new c() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17291a;

        /* renamed from: c  reason: collision with root package name */
        private boolean f17293c;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f17291a, false, 13382, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f17291a, false, 13382, new Class[0], Void.TYPE);
                return;
            }
            this.f17293c = true;
            if (i.this.f17287c.hasMessages(140001)) {
                i.this.f17287c.removeMessages(140001);
            }
            i.this.f17287c.sendMessage(i.this.f17287c.obtainMessage(140001));
        }

        public final void a(ab abVar) {
            if (PatchProxy.isSupport(new Object[]{abVar}, this, f17291a, false, 13381, new Class[]{ab.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{abVar}, this, f17291a, false, 13381, new Class[]{ab.class}, Void.TYPE);
            } else if (!this.f17293c) {
                com.bytedance.android.livesdk.gift.model.b findGiftById = ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).findGiftById(abVar.f16432d);
                if (findGiftById != null && 4 == findGiftById.f15106e) {
                    Observable.create(new l(abVar)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new m(this), n.f17305a);
                }
            }
        }
    };

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f17285a, false, 13368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17285a, false, 13368, new Class[0], Void.TYPE);
            return;
        }
        try {
            ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).setGiftAnimationEngine(com.bytedance.android.live.gift.b.STICKER_GIFT, this.h);
        } catch (Exception e2) {
            a.c("StickerMessageManager", e2.toString());
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f17285a, false, 13370, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17285a, false, 13370, new Class[0], Void.TYPE);
            return;
        }
        if (this.f17286b) {
            this.f17287c.removeMessages(140001);
            this.f17287c.sendMessage(this.f17287c.obtainMessage(140001));
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f17285a, false, 13371, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17285a, false, 13371, new Class[0], Void.TYPE);
        } else if (!this.f17286b && !this.f17290f.isEmpty()) {
            this.f17288d = this.f17290f.remove(0);
            AnonymousClass2 r5 = new j() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17294a;

                public final void a(Throwable th) {
                    i.this.f17286b = false;
                }

                public final void a(long j, String str) {
                    long j2 = j;
                    String str2 = str;
                    boolean z = true;
                    if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, this, f17294a, false, 13385, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, this, f17294a, false, 13385, new Class[]{Long.TYPE, String.class}, Void.TYPE);
                    } else if (str2.equals(i.this.f17288d.f14782d)) {
                        b bVar = i.this.f17288d;
                        if (bVar.r == null || bVar.r.f15124c <= 0 || bVar.r.f15125d <= 0) {
                            z = false;
                        }
                        if (!z || TextUtils.isEmpty(i.this.f17289e)) {
                            i.this.f17287c.postDelayed(new o(this), 1000);
                            return;
                        }
                        i iVar = i.this;
                        if (PatchProxy.isSupport(new Object[0], iVar, i.f17285a, false, 13373, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], iVar, i.f17285a, false, 13373, new Class[0], Void.TYPE);
                            return;
                        }
                        String nickName = iVar.f17288d.g.getNickName();
                        ((StickerGiftApi) com.bytedance.android.livesdk.v.j.q().d().a(StickerGiftApi.class)).checkUserNameLegality(nickName).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new j(iVar, nickName), new k(iVar));
                    }
                }
            };
            this.f17286b = true;
            ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).downloadAssets("effects", this.f17288d.f14780b, r5, 4);
        }
    }

    public final void c() {
        com.bytedance.android.livesdk.sticker.b.a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f17285a, false, 13372, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17285a, false, 13372, new Class[0], Void.TYPE);
            return;
        }
        b bVar = this.g;
        b bVar2 = this.f17288d;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f17285a, false, 13378, new Class[]{b.class}, com.bytedance.android.livesdk.sticker.b.a.class)) {
            aVar = (com.bytedance.android.livesdk.sticker.b.a) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f17285a, false, 13378, new Class[]{b.class}, com.bytedance.android.livesdk.sticker.b.a.class);
        } else {
            aVar = new com.bytedance.android.livesdk.sticker.b.a();
            aVar.f17252d = bVar2.j;
            aVar.r = bVar2.f14782d;
        }
        bVar.a(aVar, this.f17288d.q);
        this.f17287c.sendMessageDelayed(this.f17287c.obtainMessage(140001), this.f17288d.p);
    }

    public i(b bVar) {
        this.g = bVar;
        this.f17289e = h.a(ac.e());
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f17285a, false, 13369, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f17285a, false, 13369, new Class[]{b.class}, Void.TYPE);
        } else if (bVar != null) {
            if (bVar.f14783e) {
                this.f17290f.add(0, bVar);
            } else {
                this.f17290f.add(bVar);
            }
            d();
        }
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f17285a, false, 13375, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f17285a, false, 13375, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (140001 == message.what) {
            this.g.g();
            this.f17288d = null;
            this.f17286b = false;
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f17285a, false, 13374, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f17285a, false, 13374, new Class[]{String.class}, Void.TYPE);
            return;
        }
        g gVar = this.f17288d.r;
        if (TextUtils.isEmpty(str)) {
            str2 = gVar.f15126e;
        } else {
            str2 = str;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = ac.a((int) C0906R.string.d1_);
        }
        String str3 = this.f17289e + File.separator + DigestUtils.md5Hex(str2) + ".png";
        String str4 = gVar.f15123b;
        String str5 = this.f17288d.f14782d + "font.ttf";
        if (!h.a(str3)) {
            gVar.g = "#" + gVar.g;
            gVar.k = str5;
            gVar.f15126e = str2;
            gVar.j = str3;
            com.bytedance.android.livesdk.chatroom.bl.b.a(gVar);
        }
        this.g.b(str4, str3, this.f17288d.q);
        c();
    }
}
