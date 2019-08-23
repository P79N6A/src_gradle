package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.accountsdk.a.a;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.e;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.net.y;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.ss.android.ugc.aweme.services.sticker.UnLockSticker;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.f;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.m;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.effectmanager.effect.b.h;
import com.ss.android.ugc.effectmanager.effect.b.i;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

public final class bv {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64837a;

    /* renamed from: b  reason: collision with root package name */
    public g f64838b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f64839c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<String> f64840d;

    /* renamed from: e  reason: collision with root package name */
    public int f64841e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.qrcode.f.a f64842f;
    public Context g;
    @Nullable
    public Music h;
    public String i;
    public boolean j;
    public a k;
    public b l;
    String m;
    public String n;
    public String o;
    public Effect p;
    public boolean q;
    com.ss.android.ugc.aweme.sticker.b r;
    OnUnlockShareFinishListener s;
    public i t;
    private String u;
    private h v;

    public interface a {
        void a(String str, Effect effect);
    }

    public interface b {
        void a();
    }

    class c implements p {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64853a;

        /* renamed from: b  reason: collision with root package name */
        Effect f64854b;

        /* renamed from: c  reason: collision with root package name */
        String f64855c;

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f64853a, false, 73278, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64853a, false, 73278, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.b.a.a.a.b(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64857a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f64857a, false, 73279, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f64857a, false, 73279, new Class[0], Void.TYPE);
                        return;
                    }
                    bv.this.d(c.this.f64854b, c.this.f64855c);
                }
            });
        }

        public final void a(Exception exc) {
            if (PatchProxy.isSupport(new Object[]{exc}, this, f64853a, false, 73277, new Class[]{Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc}, this, f64853a, false, 73277, new Class[]{Exception.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.sticker.unlock.h.a(bv.this.g);
        }

        c(Effect effect, String str) {
            this.f64854b = effect;
            this.f64855c = str;
        }
    }

    public final void a(ArrayList<String> arrayList, boolean z, String str) {
        ArrayList<String> arrayList2 = arrayList;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{arrayList2, (byte) 0, str2}, this, f64837a, false, 73248, new Class[]{ArrayList.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList2, (byte) 0, str2}, this, f64837a, false, 73248, new Class[]{ArrayList.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.o = str2;
        a(arrayList, false, false);
    }

    public final void a(ArrayList<String> arrayList, boolean z, boolean z2) {
        ArrayList<String> arrayList2 = arrayList;
        if (PatchProxy.isSupport(new Object[]{arrayList2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f64837a, false, 73251, new Class[]{ArrayList.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList2, Byte.valueOf(z), Byte.valueOf(z2)}, this, f64837a, false, 73251, new Class[]{ArrayList.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j = z;
        this.f64840d = arrayList2;
        b();
        if (this.f64840d != null && this.f64840d.size() > 0) {
            this.f64839c = false;
            this.f64838b = ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().createEffectPlatform(this.g, e.b(), y.a().b());
            if (z2) {
                this.f64838b.a((List<String>) this.f64840d, this.o, false, this.v);
                return;
            }
            this.f64838b.a(this.f64840d.get(0), this.o, this.t);
        }
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f64837a, false, 73252, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64837a, false, 73252, new Class[0], Void.TYPE);
        } else if (c() && NetworkUtils.isNetworkAvailable(d.a()) && this.q) {
            if (this.f64842f == null) {
                this.f64842f = com.ss.android.ugc.aweme.qrcode.f.a.a(this.g, this.g.getResources().getString(C0906R.string.a8b));
                this.f64842f.setIndeterminate(false);
                return;
            }
            if ((this.g instanceof Activity) && !((Activity) this.g).isFinishing()) {
                this.f64842f.show();
                this.f64842f.a();
            }
        }
    }

    private boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f64837a, false, 73262, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f64837a, false, 73262, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.video.b.h()) {
            com.bytedance.ies.dmt.ui.d.a.b(this.g, (int) C0906R.string.c1x).a();
            return false;
        } else if (com.ss.android.ugc.aweme.video.b.i() >= 20971520) {
            return true;
        } else {
            com.bytedance.ies.dmt.ui.d.a.b(this.g, (int) C0906R.string.c1y).a();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64837a, false, 73261, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64837a, false, 73261, new Class[0], Void.TYPE);
            return;
        }
        this.m = ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().freeFLowCardUrl();
        if (TextUtils.equals(this.m, "")) {
            this.m = "https://lm.189.cn/douyincard/douyincard_index.html?&cmpid=jt-dycard-dyzstz&shopid=lmk.cps.jtdycarddyzstz.100000720";
        }
        new a.C0185a(this.g).b(this.g.getResources().getString(C0906R.string.a5s)).a(this.g.getResources().getString(C0906R.string.bie), bw.f64860b).b(this.g.getResources().getString(C0906R.string.lp), (DialogInterface.OnClickListener) new bx(this)).a().a();
    }

    public bv(Context context) {
        this(context, "prop_reuse");
    }

    public final void a(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = arrayList;
        if (PatchProxy.isSupport(new Object[]{arrayList2}, this, f64837a, false, 73249, new Class[]{ArrayList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList2}, this, f64837a, false, 73249, new Class[]{ArrayList.class}, Void.TYPE);
            return;
        }
        a(arrayList2, true);
    }

    @NonNull
    public static ArrayList<String> a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f64837a, true, 73263, new Class[]{String.class}, ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[]{str2}, null, f64837a, true, 73263, new Class[]{String.class}, ArrayList.class);
        } else if (str2 == null || str.isEmpty()) {
            return new ArrayList<>();
        } else {
            ArrayList<String> arrayList = new ArrayList<>();
            for (String str3 : str2.split(",")) {
                if (!arrayList.contains(str3)) {
                    arrayList.add(str3);
                }
            }
            return arrayList;
        }
    }

    public bv(Context context, String str) {
        this.n = "";
        this.o = "";
        this.q = true;
        this.v = new h() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64843a;

            public final void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
                com.ss.android.ugc.effectmanager.common.e.c cVar2 = cVar;
                if (PatchProxy.isSupport(new Object[]{cVar2}, this, f64843a, false, 73267, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar2}, this, f64843a, false, 73267, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                    return;
                }
                bv.this.t.a(null, cVar2);
            }

            public final void a(List<Effect> list) {
                boolean z;
                boolean z2 = true;
                if (PatchProxy.isSupport(new Object[]{list}, this, f64843a, false, 73266, new Class[]{List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{list}, this, f64843a, false, 73266, new Class[]{List.class}, Void.TYPE);
                    return;
                }
                bv bvVar = bv.this;
                if (PatchProxy.isSupport(new Object[]{list}, bvVar, bv.f64837a, false, 73253, new Class[]{List.class}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{list}, bvVar, bv.f64837a, false, 73253, new Class[]{List.class}, Boolean.TYPE)).booleanValue();
                } else {
                    if (!com.ss.android.g.a.a() && !com.ss.android.ugc.aweme.account.d.a().getCurUser().isFlowcardMember()) {
                        Iterator<Effect> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z = true;
                                break;
                            } else if (!it2.next().getTags().contains("douyin_card")) {
                                z = false;
                                break;
                            } else {
                                bvVar.f64841e++;
                            }
                        }
                        if (z) {
                            if (bvVar.f64842f != null) {
                                bvVar.f64842f.dismiss();
                            }
                            bvVar.a();
                        }
                    }
                    z2 = false;
                }
                if (!z2) {
                    bv.this.f64838b.a(bv.this.f64840d.get(bv.this.f64841e), bv.this.o, bv.this.t);
                }
            }
        };
        this.s = new OnUnlockShareFinishListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64845a;

            public final void onVKShareSucceed(Effect effect) {
            }

            public final void onShareAppFailed() {
                if (PatchProxy.isSupport(new Object[0], this, f64845a, false, 73269, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f64845a, false, 73269, new Class[0], Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.shortvideo.sticker.unlock.h.a(bv.this.g);
            }

            public final void onShareAppSucceed(Effect effect) {
                if (PatchProxy.isSupport(new Object[]{effect}, this, f64845a, false, 73268, new Class[]{Effect.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{effect}, this, f64845a, false, 73268, new Class[]{Effect.class}, Void.TYPE);
                    return;
                }
                if (bv.this.r != null) {
                    m mVar = new m();
                    mVar.f70227a = UnLockSticker.STICKER_UNLOCKED;
                    mVar.f70228b = effect;
                    mVar.f70229c = bv.this.n;
                    bg.b(mVar);
                    com.ss.android.ugc.aweme.shortvideo.sticker.unlock.h.a(bv.this.n);
                    bv.this.p = effect;
                    if (TextUtils.equals(bv.this.n, "prop_page")) {
                        bg.a(new com.ss.android.ugc.aweme.shortvideo.sticker.unlock.e());
                    } else if (TextUtils.equals(bv.this.n, "prop_reuse")) {
                        bg.a(new f());
                    }
                }
            }
        };
        this.t = new i() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64851a;

            public final void b(Effect effect) {
            }

            public final void a(Effect effect) {
                boolean z;
                Effect effect2 = effect;
                if (PatchProxy.isSupport(new Object[]{effect2}, this, f64851a, false, 73271, new Class[]{Effect.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{effect2}, this, f64851a, false, 73271, new Class[]{Effect.class}, Void.TYPE);
                    return;
                }
                bv.this.f64839c = true;
                bc.b(bv.this.f64842f);
                bv bvVar = bv.this;
                if (PatchProxy.isSupport(new Object[]{effect2}, bvVar, bv.f64837a, false, 73254, new Class[]{Effect.class}, Boolean.TYPE)) {
                    bv bvVar2 = bvVar;
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{effect2}, bvVar2, bv.f64837a, false, 73254, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
                } else if (com.ss.android.g.a.a() || com.ss.android.ugc.aweme.account.d.a().getCurUser().isFlowcardMember() || !effect.getTags().contains("douyin_card")) {
                    z = false;
                } else {
                    bvVar.a();
                    z = true;
                }
                if (!z) {
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
                    String uuid = UUID.randomUUID().toString();
                    if (bv.this.k != null) {
                        bv.this.k.a(uuid, effect2);
                    } else {
                        r.a("shoot", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", uuid).a("shoot_way", "prop_reuse").a("_staging_flag", com.ss.android.g.a.b() ^ true ? 1 : 0).a("prop_id", effect2.effect_id).f34114b);
                    }
                    if (TextUtils.equals(bv.this.n, "prop_page")) {
                        FaceStickerBean.sCurPropSource = "prop_page";
                    }
                    if (!com.ss.android.g.a.a() || !((IAVService) ServiceManager.get().getService(IAVService.class)).getStickerUtilsService().isLockSticker(effect2) || (!TextUtils.equals(bv.this.n, "prop_reuse") && !TextUtils.equals(bv.this.n, "prop_page"))) {
                        bv.this.a(effect2, uuid);
                    } else if (effect2.is_busi) {
                        a.i.a((Callable<TResult>) new by<TResult>(effect2)).a((a.g<TResult, TContinuationResult>) new bz<TResult,TContinuationResult>(this, effect2, uuid), a.i.f1052b);
                    } else {
                        bv.this.b(effect2, uuid);
                    }
                    if (bv.this.l != null) {
                        bv.this.l.a();
                    }
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:27:0x010e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(com.ss.android.ugc.effectmanager.effect.model.Effect r11, com.ss.android.ugc.effectmanager.common.e.c r12) {
                /*
                    r10 = this;
                    r7 = 2
                    java.lang.Object[] r0 = new java.lang.Object[r7]
                    r8 = 0
                    r0[r8] = r11
                    r9 = 1
                    r0[r9] = r12
                    com.meituan.robust.ChangeQuickRedirect r2 = f64851a
                    java.lang.Class[] r5 = new java.lang.Class[r7]
                    java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                    r5[r8] = r1
                    java.lang.Class<com.ss.android.ugc.effectmanager.common.e.c> r1 = com.ss.android.ugc.effectmanager.common.e.c.class
                    r5[r9] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 73273(0x11e39, float:1.02677E-40)
                    r1 = r10
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x003f
                    java.lang.Object[] r0 = new java.lang.Object[r7]
                    r0[r8] = r11
                    r0[r9] = r12
                    com.meituan.robust.ChangeQuickRedirect r2 = f64851a
                    r3 = 0
                    r4 = 73273(0x11e39, float:1.02677E-40)
                    java.lang.Class[] r5 = new java.lang.Class[r7]
                    java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                    r5[r8] = r1
                    java.lang.Class<com.ss.android.ugc.effectmanager.common.e.c> r1 = com.ss.android.ugc.effectmanager.common.e.c.class
                    r5[r9] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r10
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x003f:
                    int r0 = r12.f77315a
                    r1 = 2006(0x7d6, float:2.811E-42)
                    r2 = 2003(0x7d3, float:2.807E-42)
                    r3 = 2002(0x7d2, float:2.805E-42)
                    r4 = 2004(0x7d4, float:2.808E-42)
                    if (r0 == r4) goto L_0x006d
                    if (r0 == r3) goto L_0x006d
                    if (r0 == r2) goto L_0x006d
                    if (r0 == r1) goto L_0x006d
                    com.ss.android.ugc.aweme.share.bv r0 = com.ss.android.ugc.aweme.share.bv.this
                    android.content.Context r0 = r0.g
                    com.ss.android.ugc.aweme.share.bv r1 = com.ss.android.ugc.aweme.share.bv.this
                    android.content.Context r1 = r1.g
                    android.content.res.Resources r1 = r1.getResources()
                    r2 = 2131559905(0x7f0d05e1, float:1.8745167E38)
                    java.lang.String r1 = r1.getString(r2)
                    com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (java.lang.String) r1)
                    r0.a()
                    goto L_0x0101
                L_0x006d:
                    com.ss.android.ugc.aweme.share.bv r5 = com.ss.android.ugc.aweme.share.bv.this
                    int r6 = r5.f64841e
                    int r6 = r6 + r9
                    r5.f64841e = r6
                    com.ss.android.ugc.aweme.share.bv r5 = com.ss.android.ugc.aweme.share.bv.this
                    boolean r5 = r5.j
                    if (r5 == 0) goto L_0x00a2
                    com.ss.android.ugc.aweme.share.bv r5 = com.ss.android.ugc.aweme.share.bv.this
                    int r5 = r5.f64841e
                    com.ss.android.ugc.aweme.share.bv r6 = com.ss.android.ugc.aweme.share.bv.this
                    java.util.ArrayList<java.lang.String> r6 = r6.f64840d
                    int r6 = r6.size()
                    if (r5 >= r6) goto L_0x00a2
                    com.ss.android.ugc.aweme.share.bv r0 = com.ss.android.ugc.aweme.share.bv.this
                    com.ss.android.ugc.aweme.effectplatform.g r0 = r0.f64838b
                    com.ss.android.ugc.aweme.share.bv r1 = com.ss.android.ugc.aweme.share.bv.this
                    java.util.ArrayList<java.lang.String> r1 = r1.f64840d
                    com.ss.android.ugc.aweme.share.bv r2 = com.ss.android.ugc.aweme.share.bv.this
                    int r2 = r2.f64841e
                    java.lang.Object r1 = r1.get(r2)
                    java.lang.String r1 = (java.lang.String) r1
                    com.ss.android.ugc.aweme.share.bv r2 = com.ss.android.ugc.aweme.share.bv.this
                    java.lang.String r2 = r2.o
                    r0.a((java.lang.String) r1, (java.lang.String) r2, (com.ss.android.ugc.effectmanager.effect.b.i) r10)
                    goto L_0x0108
                L_0x00a2:
                    com.ss.android.ugc.aweme.share.bv r5 = com.ss.android.ugc.aweme.share.bv.this
                    boolean r5 = r5.f64839c
                    if (r5 != 0) goto L_0x0108
                    if (r0 == r4) goto L_0x00e7
                    if (r0 != r3) goto L_0x00ad
                    goto L_0x00e7
                L_0x00ad:
                    if (r0 != r2) goto L_0x00ca
                    com.ss.android.ugc.aweme.share.bv r0 = com.ss.android.ugc.aweme.share.bv.this
                    android.content.Context r0 = r0.g
                    com.ss.android.ugc.aweme.share.bv r1 = com.ss.android.ugc.aweme.share.bv.this
                    android.content.Context r1 = r1.g
                    android.content.res.Resources r1 = r1.getResources()
                    r2 = 2131559906(0x7f0d05e2, float:1.874517E38)
                    java.lang.String r1 = r1.getString(r2)
                    com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (java.lang.String) r1)
                    r0.a()
                    goto L_0x0101
                L_0x00ca:
                    if (r0 != r1) goto L_0x0101
                    com.ss.android.ugc.aweme.share.bv r0 = com.ss.android.ugc.aweme.share.bv.this
                    android.content.Context r0 = r0.g
                    com.ss.android.ugc.aweme.share.bv r1 = com.ss.android.ugc.aweme.share.bv.this
                    android.content.Context r1 = r1.g
                    android.content.res.Resources r1 = r1.getResources()
                    r2 = 2131559908(0x7f0d05e4, float:1.8745173E38)
                    java.lang.String r1 = r1.getString(r2)
                    com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (java.lang.String) r1)
                    r0.a()
                    goto L_0x0101
                L_0x00e7:
                    com.ss.android.ugc.aweme.share.bv r0 = com.ss.android.ugc.aweme.share.bv.this
                    android.content.Context r0 = r0.g
                    com.ss.android.ugc.aweme.share.bv r1 = com.ss.android.ugc.aweme.share.bv.this
                    android.content.Context r1 = r1.g
                    android.content.res.Resources r1 = r1.getResources()
                    r2 = 2131559907(0x7f0d05e3, float:1.8745171E38)
                    java.lang.String r1 = r1.getString(r2)
                    com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (java.lang.String) r1)
                    r0.a()
                L_0x0101:
                    com.ss.android.ugc.aweme.share.bv r0 = com.ss.android.ugc.aweme.share.bv.this
                    com.ss.android.ugc.aweme.qrcode.f.a r0 = r0.f64842f
                    com.ss.android.ugc.aweme.utils.bc.b(r0)
                L_0x0108:
                    com.ss.android.ugc.aweme.share.bv r0 = com.ss.android.ugc.aweme.share.bv.this
                    com.ss.android.ugc.aweme.share.bv$b r0 = r0.l
                    if (r0 == 0) goto L_0x0115
                    com.ss.android.ugc.aweme.share.bv r0 = com.ss.android.ugc.aweme.share.bv.this
                    com.ss.android.ugc.aweme.share.bv$b r0 = r0.l
                    r0.a()
                L_0x0115:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.bv.AnonymousClass4.a(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.common.e.c):void");
            }
        };
        this.g = context;
        this.u = str;
    }

    private void a(Intent intent, Music music) {
        Intent intent2 = intent;
        Music music2 = music;
        if (PatchProxy.isSupport(new Object[]{intent2, music2}, this, f64837a, false, 73257, new Class[]{Intent.class, Music.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2, music2}, this, f64837a, false, 73257, new Class[]{Intent.class, Music.class}, Void.TYPE);
            return;
        }
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().isOpenStickerRecordWithMusic() && music2 != null && com.ss.android.ugc.aweme.music.util.d.a(com.ss.android.ugc.aweme.music.util.c.f56796b.a(music2), this.g, false)) {
            intent2.putExtra("direct_use_sticker_music", music.getId());
        }
    }

    public final void b(Effect effect, String str) {
        final Effect effect2 = effect;
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{effect2, str2}, this, f64837a, false, 73258, new Class[]{Effect.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2, str2}, this, f64837a, false, 73258, new Class[]{Effect.class, String.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            com.ss.android.ugc.aweme.login.e.a((Activity) this.g, "prop_page", "prop_page");
            AnonymousClass3 r0 = new com.ss.android.ugc.aweme.app.accountsdk.a.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64847a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f64847a, false, 73270, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f64847a, false, 73270, new Class[0], Void.TYPE);
                        return;
                    }
                    if (com.ss.android.ugc.aweme.account.c.d().isLogin()) {
                        if (!ex.b()) {
                            bv.this.c(effect2, str2);
                        } else {
                            return;
                        }
                    }
                    if (PatchProxy.isSupport(new Object[]{this}, null, com.ss.android.ugc.aweme.app.accountsdk.a.a.f33682a, true, 23002, new Class[]{com.ss.android.ugc.aweme.app.accountsdk.a.c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{this}, null, com.ss.android.ugc.aweme.app.accountsdk.a.a.f33682a, true, 23002, new Class[]{com.ss.android.ugc.aweme.app.accountsdk.a.c.class}, Void.TYPE);
                        return;
                    }
                    a.C0433a aVar = com.ss.android.ugc.aweme.app.accountsdk.a.a.f33685d;
                    if (PatchProxy.isSupport(new Object[]{this}, aVar, a.C0433a.f33686a, false, 23008, new Class[]{com.ss.android.ugc.aweme.app.accountsdk.a.c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{this}, aVar, a.C0433a.f33686a, false, 23008, new Class[]{com.ss.android.ugc.aweme.app.accountsdk.a.c.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(this, "listener");
                    com.ss.android.ugc.aweme.app.accountsdk.a.a.f33684c.remove(this);
                }
            };
            if (PatchProxy.isSupport(new Object[]{r0}, null, com.ss.android.ugc.aweme.app.accountsdk.a.a.f33682a, true, 23001, new Class[]{com.ss.android.ugc.aweme.app.accountsdk.a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{r0}, null, com.ss.android.ugc.aweme.app.accountsdk.a.a.f33682a, true, 23001, new Class[]{com.ss.android.ugc.aweme.app.accountsdk.a.c.class}, Void.TYPE);
                return;
            }
            a.C0433a aVar = com.ss.android.ugc.aweme.app.accountsdk.a.a.f33685d;
            if (PatchProxy.isSupport(new Object[]{r0}, aVar, a.C0433a.f33686a, false, 23007, new Class[]{com.ss.android.ugc.aweme.app.accountsdk.a.c.class}, Void.TYPE)) {
                Object[] objArr = {r0};
                Object[] objArr2 = objArr;
                a.C0433a aVar2 = aVar;
                PatchProxy.accessDispatch(objArr2, aVar2, a.C0433a.f33686a, false, 23007, new Class[]{com.ss.android.ugc.aweme.app.accountsdk.a.c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(r0, "listener");
            com.ss.android.ugc.aweme.app.accountsdk.a.a.f33684c.add(r0);
        } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().getUpdateState()) {
            d(effect, str);
        } else {
            c(effect, str);
        }
    }

    public final void c(Effect effect, String str) {
        Effect effect2 = effect;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{effect2, str2}, this, f64837a, false, 73259, new Class[]{Effect.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2, str2}, this, f64837a, false, 73259, new Class[]{Effect.class, String.class}, Void.TYPE);
            return;
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().updateUnlockedIdsFromNet(new c(effect2, str2));
    }

    public final void d(Effect effect, String str) {
        if (PatchProxy.isSupport(new Object[]{effect, str}, this, f64837a, false, 73260, new Class[]{Effect.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect, str}, this, f64837a, false, 73260, new Class[]{Effect.class, String.class}, Void.TYPE);
            return;
        }
        IStickerUtilsService stickerUtilsService = ((IAVService) ServiceManager.get().getService(IAVService.class)).getStickerUtilsService();
        if (stickerUtilsService.hasUnlocked(effect)) {
            com.ss.android.ugc.aweme.shortvideo.sticker.unlock.h.a(this.n);
            a(effect, str);
        } else if (!TextUtils.equals(this.n, "prop_reuse")) {
            com.ss.android.ugc.aweme.shortvideo.sticker.unlock.i iVar = new com.ss.android.ugc.aweme.shortvideo.sticker.unlock.i("prop_page", this.g, effect, this.s, false, false);
            this.r = iVar;
            this.r.a();
        } else if (stickerUtilsService.isStickerPreviewable(effect)) {
            com.ss.android.ugc.aweme.shortvideo.sticker.unlock.h.a(this.n);
            a(effect, str);
        } else {
            com.ss.android.ugc.aweme.shortvideo.sticker.unlock.i iVar2 = new com.ss.android.ugc.aweme.shortvideo.sticker.unlock.i("prop_reuse", this.g, effect, this.s, false, false);
            this.r = iVar2;
            this.r.a();
        }
    }

    public final void a(Effect effect, String str) {
        if (PatchProxy.isSupport(new Object[]{effect, str}, this, f64837a, false, 73256, new Class[]{Effect.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect, str}, this, f64837a, false, 73256, new Class[]{Effect.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.sticker.unlock.h.a(this.n);
        Intent intent = new Intent(this.g, ((IAVService) ServiceManager.get().getService(IAVService.class)).getRecordPermissionActivity());
        intent.putStringArrayListExtra("reuse_sticker_ids", this.f64840d);
        intent.putExtra("first_sticker", effect);
        intent.putExtra("sticker_music", this.h);
        a(intent, this.h);
        intent.putExtra("translation_type", 3);
        intent.putExtra("shoot_way", this.u);
        intent.putExtra("enter_from", this.i);
        intent.putExtra("extra_sticker_from", this.o);
        intent.putExtra("creation_id", str);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity(this.g, intent);
    }

    public final void a(ArrayList<String> arrayList, boolean z) {
        ArrayList<String> arrayList2 = arrayList;
        if (PatchProxy.isSupport(new Object[]{arrayList2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f64837a, false, 73250, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList2, Byte.valueOf(z)}, this, f64837a, false, 73250, new Class[]{ArrayList.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(arrayList2, z, false);
    }
}
