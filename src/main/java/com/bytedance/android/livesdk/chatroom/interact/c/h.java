package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.interact.contract.a;
import com.bytedance.android.livesdk.chatroom.interact.data.b;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkRepository;
import com.bytedance.android.livesdk.chatroom.model.a.i;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.List;

public final class h extends a.C0087a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10784a;

    /* renamed from: c  reason: collision with root package name */
    private final LinkRepository f10785c;

    /* renamed from: d  reason: collision with root package name */
    private Room f10786d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10787e;

    /* renamed from: f  reason: collision with root package name */
    private List<i> f10788f;
    private int g = 1;
    private int h;
    private int i = 2;
    private String j = "";
    private com.bytedance.android.livesdk.sticker.b.a k;
    private String l;
    private boolean m;
    private Disposable n;

    public final int a() {
        return this.i;
    }

    public final String b() {
        return this.j;
    }

    public final boolean d() {
        return this.f10787e;
    }

    public final List<i> f() {
        return this.f10788f;
    }

    public final String g() {
        return this.l;
    }

    public final ImageModel c() {
        if (!PatchProxy.isSupport(new Object[0], this, f10784a, false, 4635, new Class[0], ImageModel.class)) {
            return TTLiveSDKContext.getHostService().k().a().getAvatarThumb();
        }
        return (ImageModel) PatchProxy.accessDispatch(new Object[0], this, f10784a, false, 4635, new Class[0], ImageModel.class);
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f10784a, false, 4632, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10784a, false, 4632, new Class[0], Void.TYPE);
            return;
        }
        super.h();
        if (this.n != null && !this.n.isDisposed()) {
            this.n.dispose();
        }
    }

    public final void e() {
        int i2;
        int i3;
        String str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f10784a, false, 4633, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10784a, false, 4633, new Class[0], Void.TYPE);
        } else if (!this.m) {
            this.m = true;
            e a2 = e.a();
            if (this.f10787e) {
                i iVar = this.f10788f.get(this.h);
                i2 = iVar.f11046a;
                i3 = iVar.f11047b;
                a2.l = true;
                a2.m = i2;
                a2.n = i3;
                str = String.valueOf(i2) + "-" + i3;
            } else {
                a2.l = false;
                a2.m = 0;
                a2.n = 0;
                str = "";
                i3 = 0;
                i2 = 0;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("link_type", String.valueOf(this.g));
            hashMap.put("guest_supported_vendor", String.valueOf(b.f10870f));
            hashMap.put("guest_supported_layout", "15");
            hashMap.put("payed_money", String.valueOf(i2));
            hashMap.put("link_duration", String.valueOf(i3));
            this.n = this.f10785c.apply(this.f10786d.getId(), hashMap).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new i(this), new j(this));
            e.a().i = this.i;
            e.a().j = this.k;
            e.a().k = this.j;
            Room room = this.f10786d;
            if (this.g == 1) {
                z = true;
            }
            aa.a(room, z, str);
        }
    }

    public final void a(int i2) {
        this.g = i2;
    }

    public final void b(int i2) {
        this.h = i2;
    }

    public final void a(com.bytedance.android.livesdk.sticker.b.a aVar) {
        this.k = aVar;
    }

    public final void a(String str) {
        this.j = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(d dVar) throws Exception {
        com.bytedance.android.livesdk.chatroom.model.b bVar = (com.bytedance.android.livesdk.chatroom.model.b) dVar.f7871b;
        this.m = false;
        if (this.f13640b != null) {
            com.bytedance.android.livesdk.app.dataholder.d.a().h = bVar.f11100a;
            com.bytedance.android.livesdk.app.dataholder.d.a().i = bVar.f11101b;
            e.a().a((Integer) 1);
            e.a().o = this.g;
            ((a.b) this.f13640b).b();
        }
    }

    public final /* synthetic */ void a(com.bytedance.android.livesdk.common.e eVar) {
        a.b bVar = (a.b) eVar;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f10784a, false, 4631, new Class[]{a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f10784a, false, 4631, new Class[]{a.b.class}, Void.TYPE);
            return;
        }
        super.a(bVar);
        this.i = TTLiveSDKContext.getHostService().b().b().b(com.bytedance.android.livesdk.w.e.LIVE_INTERACT_BEAUTY_LEVEL);
    }

    public final void c(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10784a, false, 4634, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10784a, false, 4634, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i = i3;
        TTLiveSDKContext.getHostService().b().b().a((d.a) com.bytedance.android.livesdk.w.e.LIVE_INTERACT_BEAUTY_LEVEL, i3);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Throwable th) throws Exception {
        this.m = false;
        if (this.f13640b != null) {
            ((a.b) this.f13640b).a(th);
        }
    }

    public h(Room room, boolean z, List<i> list, String str) {
        this.f10786d = room;
        this.f10787e = z;
        this.f10788f = list;
        this.l = str;
        this.f10785c = (LinkRepository) j.q().d().a(LinkRepository.class);
    }
}
