package com.ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.feed.b.b;
import com.bytedance.android.livesdkapi.c.a;
import com.bytedance.android.livesdkapi.h;
import com.bytedance.android.livesdkapi.service.c;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.account.util.f;
import com.ss.android.ugc.aweme.live.hostbusiness.e;
import com.ss.android.ugc.aweme.live.livehostimpl.n;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53183a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f53184b;

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f53183a, true, 55352, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f53183a, true, 55352, new Class[0], String.class);
        }
        if (com.ss.android.g.a.b()) {
            return "webcast.musical.ly";
        }
        if (com.ss.android.g.a.c()) {
            return "webcast.tiktokv.com";
        }
        return "webcast.amemv.com";
    }

    public static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f53183a, true, 55353, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f53183a, true, 55353, new Class[0], Void.TYPE);
            return;
        }
        try {
            f.a(String.format("http://%s/", new Object[]{a()}));
        } catch (Exception unused) {
        }
    }

    public static c d() {
        if (PatchProxy.isSupport(new Object[0], null, f53183a, true, 55355, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f53183a, true, 55355, new Class[0], c.class);
        }
        c c2 = c();
        f();
        return c2;
    }

    public static boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f53183a, true, 55363, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f53183a, true, 55363, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (c() == null) {
            z = true;
        }
        return z;
    }

    private static void f() {
        if (PatchProxy.isSupport(new Object[0], null, f53183a, true, 55351, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f53183a, true, 55351, new Class[0], Void.TYPE);
            return;
        }
        if (!f53184b) {
            h.b();
            h.c();
            if (PatchProxy.isSupport(new Object[0], null, d.f53357a, true, 55392, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, d.f53357a, true, 55392, new Class[0], Void.TYPE);
            } else {
                b.a();
            }
            b();
        }
        f53184b = true;
    }

    public static c c() {
        if (PatchProxy.isSupport(new Object[0], null, f53183a, true, 55354, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f53183a, true, 55354, new Class[0], c.class);
        }
        c e2 = h.e();
        if (e2 == null) {
            synchronized (a.class) {
                if (h.e() == null) {
                    if (PatchProxy.isSupport(new Object[0], null, h.f53408a, true, 55428, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, h.f53408a, true, 55428, new Class[0], Void.TYPE);
                    } else if (com.ss.android.g.a.a()) {
                        com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class, new a.C0131a());
                    } else {
                        com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class, new e());
                    }
                    n nVar = new n();
                    if (PatchProxy.isSupport(new Object[]{nVar}, null, d.f53357a, true, 55391, new Class[]{com.bytedance.android.livesdkapi.service.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{nVar}, null, d.f53357a, true, 55391, new Class[]{com.bytedance.android.livesdkapi.service.b.class}, Void.TYPE);
                    } else {
                        b.a(nVar);
                    }
                    if (PatchProxy.isSupport(new Object[]{nVar, (byte) 1}, null, h.f18766a, true, 14901, new Class[]{com.bytedance.android.livesdkapi.service.b.class, Boolean.TYPE}, Boolean.TYPE)) {
                        ((Boolean) PatchProxy.accessDispatch(new Object[]{nVar, (byte) 1}, null, h.f18766a, true, 14901, new Class[]{com.bytedance.android.livesdkapi.service.b.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
                    } else {
                        h.f18768c = nVar.a().a();
                        h.f18769d = nVar;
                        com.bytedance.android.live.base.a.a((com.bytedance.android.live.base.b.b) new com.bytedance.android.live.base.b.b(nVar) {

                            /* renamed from: a */
                            public static ChangeQuickRedirect f18772a;

                            /* renamed from: b */
                            final /* synthetic */ com.bytedance.android.livesdkapi.service.b f18773b;

                            public final <T> T a(
/*
Method generation error in method: com.bytedance.android.livesdkapi.h.1.a(java.lang.Class):T, dex: classes2.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdkapi.h.1.a(java.lang.Class):T, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:260)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:70)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                            
*/
                        });
                        if (PatchProxy.isSupport(new Object[]{nVar}, null, h.f18766a, true, 14902, new Class[]{com.bytedance.android.livesdkapi.service.b.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{nVar}, null, h.f18766a, true, 14902, new Class[]{com.bytedance.android.livesdkapi.service.b.class}, Void.TYPE);
                        } else {
                            com.bytedance.android.livesdkapi.k.a.a("com.bytedance.android.livesdk.TTLiveSDKContext", "initialize", nVar);
                            h.a();
                        }
                    }
                    c e3 = h.e();
                    return e3;
                }
            }
        }
        return e2;
    }

    private static boolean b(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f53183a, true, 55360, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f53183a, true, 55360, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || !user.isSecret()) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean c(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f53183a, true, 55361, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f53183a, true, 55361, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || (user.getFollowStatus() != 1 && user.getFollowStatus() != 2)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f53183a, true, 55359, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f53183a, true, 55359, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || !user.isLive() || !com.ss.android.ugc.aweme.story.a.a()) {
            return false;
        } else {
            if (b(user)) {
                return c(user);
            }
            return true;
        }
    }

    public static void a(Context context, Bundle bundle) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, bundle}, null, f53183a, true, 55362, new Class[]{Context.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, bundle}, null, f53183a, true, 55362, new Class[]{Context.class, Bundle.class}, Void.TYPE);
        } else if (d() != null) {
            b.a(h.f());
            if (PatchProxy.isSupport(new Object[]{context2}, null, LiveFeedActivity.f53169b, true, 55380, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2}, null, LiveFeedActivity.f53169b, true, 55380, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            context2.startActivity(new Intent(context2, LiveFeedActivity.class));
        }
    }

    public static void a(Context context, long j, Bundle bundle, String str) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, new Long(j2), bundle, str}, null, f53183a, true, 55358, new Class[]{Context.class, Long.TYPE, Bundle.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context, new Long(j2), bundle, str};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f53183a, true, 55358, new Class[]{Context.class, Long.TYPE, Bundle.class, String.class}, Void.TYPE);
            return;
        }
        a(context, j, bundle, str, null);
    }

    public static void a(Context context, long j, Bundle bundle, String str, List<Long> list) {
        Context context2 = context;
        long j2 = j;
        Bundle bundle2 = bundle;
        String str2 = str;
        List<Long> list2 = list;
        if (PatchProxy.isSupport(new Object[]{context2, new Long(j2), bundle2, str2, list2}, null, f53183a, true, 55357, new Class[]{Context.class, Long.TYPE, Bundle.class, String.class, List.class}, Void.TYPE)) {
            Object[] objArr = {context2, new Long(j2), bundle2, str2, list2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f53183a, true, 55357, new Class[]{Context.class, Long.TYPE, Bundle.class, String.class, List.class}, Void.TYPE);
        } else if (d() != null) {
            if (!com.ss.android.g.a.a() || d.a().isLogin()) {
                if (NetworkUtils.isWifi(context) || com.bytedance.android.live.base.sp.a.b(context) || !(context2 instanceof Activity) || (!com.ss.android.g.a.a() && (com.ss.android.g.a.a() || com.ss.android.ugc.aweme.freeflowcard.freeflowmember.a.f3325c.b()))) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("enter_from_merge", str2);
                    String string = bundle2.getString("live.intent.extra.ENTER_AWEME_ID");
                    if (!TextUtils.isEmpty(string)) {
                        bundle3.putLong("video_id", Long.valueOf(string).longValue());
                    }
                    String string2 = bundle2.getString("enter_method");
                    if (!TextUtils.isEmpty(string2)) {
                        bundle3.putString("enter_method", string2);
                    }
                    bundle2.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle3);
                    if (!CollectionUtils.isEmpty(list)) {
                        long[] jArr = new long[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            jArr[i] = list2.get(i).longValue();
                        }
                        bundle2.putLongArray("live.intent.extra.ENTER_ROOM_IDS", jArr);
                    }
                    LivePlayActivity.a(context, j, bundle);
                    return;
                }
                a.C0185a b2 = new a.C0185a(context2).b((int) C0906R.string.drf);
                b bVar = new b(context, j, bundle, str, list);
                b2.a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) bVar).b((int) C0906R.string.pm, c.f53335b).a().a();
            } else if (context2 instanceof Activity) {
                Bundle bundle4 = new Bundle();
                bundle2.putBoolean("block_bind_phone", true);
                com.ss.android.ugc.aweme.login.e.a((Activity) context2, "personal_homepage", "click", bundle4, (com.ss.android.ugc.aweme.base.component.f) null);
            }
        }
    }

    static final /* synthetic */ void a(Context context, long j, Bundle bundle, String str, List list, DialogInterface dialogInterface) {
        com.bytedance.android.live.base.sp.a.a(context);
        a(context, j, bundle, str, list);
        dialogInterface.dismiss();
    }
}
