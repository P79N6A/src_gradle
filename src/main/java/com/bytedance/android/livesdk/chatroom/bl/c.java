package com.bytedance.android.livesdk.chatroom.bl;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.bb;
import com.bytedance.android.livesdk.message.model.be;
import com.bytedance.android.livesdk.message.model.bf;
import com.bytedance.android.livesdk.message.model.bj;
import com.bytedance.android.livesdk.message.model.j;
import com.bytedance.android.livesdkapi.h.b;
import com.bytedance.android.livesdkapi.h.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9787a;

    public static bb a(long j, String str) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, null, f9787a, true, 3958, new Class[]{Long.TYPE, String.class}, bb.class)) {
            return (bb) PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, null, f9787a, true, 3958, new Class[]{Long.TYPE, String.class}, bb.class);
        }
        bb bbVar = new bb();
        b bVar = new b();
        bVar.f18776c = j2;
        bVar.g = true;
        bbVar.baseMessage = bVar;
        bbVar.f16542b = str2;
        return bbVar;
    }

    public static j a(long j, boolean z) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), (byte) 0}, null, f9787a, true, 3955, new Class[]{Long.TYPE, Boolean.TYPE}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{new Long(j2), (byte) 0}, null, f9787a, true, 3955, new Class[]{Long.TYPE, Boolean.TYPE}, j.class);
        }
        j jVar = new j();
        b bVar = new b();
        bVar.f18776c = j2;
        bVar.f18777d = -1;
        bVar.g = true;
        jVar.baseMessage = bVar;
        jVar.f16637b = 1;
        return jVar;
    }

    public static bj a(long j, e eVar, User user) {
        long j2 = j;
        e eVar2 = eVar;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), eVar2, user2}, null, f9787a, true, 3963, new Class[]{Long.TYPE, e.class, User.class}, bj.class)) {
            return (bj) PatchProxy.accessDispatch(new Object[]{new Long(j2), eVar2, user2}, null, f9787a, true, 3963, new Class[]{Long.TYPE, e.class, User.class}, bj.class);
        } else if (eVar2 == null) {
            return null;
        } else {
            b bVar = new b();
            bVar.f18776c = j2;
            bVar.g = true;
            bVar.j = eVar2;
            bj bjVar = new bj();
            bjVar.baseMessage = bVar;
            bjVar.f16576c = user2;
            return bjVar;
        }
    }

    public static be a(long j, ImageModel imageModel, String str, int i, String str2, String str3, String str4, String str5) {
        long j2 = j;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), null, str6, Integer.valueOf(i), str7, str8, str9, str10}, null, f9787a, true, 3959, new Class[]{Long.TYPE, ImageModel.class, String.class, Integer.TYPE, String.class, String.class, String.class, String.class}, be.class)) {
            return (be) PatchProxy.accessDispatch(new Object[]{new Long(j2), null, str6, Integer.valueOf(i), str7, str8, str9, str10}, null, f9787a, true, 3959, new Class[]{Long.TYPE, ImageModel.class, String.class, Integer.TYPE, String.class, String.class, String.class, String.class}, be.class);
        }
        be beVar = new be();
        b bVar = new b();
        bVar.f18776c = j2;
        beVar.baseMessage = bVar;
        bf bfVar = new bf();
        bfVar.f16557d = null;
        bfVar.f16556c = str6;
        bfVar.g = (long) i;
        bfVar.f16554a = str7;
        bfVar.f16555b = str8;
        bfVar.f16559f = str9;
        bfVar.f16558e = str10;
        beVar.f16553b = bfVar;
        return beVar;
    }
}
