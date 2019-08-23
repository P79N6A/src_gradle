package com.bytedance.android.livesdk.gift.effect.doodle.a;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.effect.doodle.c.b;
import com.bytedance.android.livesdk.message.model.q;
import com.bytedance.android.livesdk.message.model.r;
import com.bytedance.android.livesdk.message.model.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14785a;

    public final b a(Object... objArr) {
        User user;
        char c2 = 1;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f14785a, false, 9398, new Class[]{Object[].class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{objArr}, this, f14785a, false, 9398, new Class[]{Object[].class}, b.class);
        }
        q qVar = objArr[0];
        r rVar = qVar.h;
        if (rVar == null || rVar.f16676a == null || rVar.f16676a.isEmpty()) {
            return null;
        }
        b bVar = new b(qVar.baseMessage.f18777d);
        bVar.f14792b = (float) rVar.f16677b;
        bVar.f14793c = (float) rVar.f16678c;
        List<s> list = rVar.f16676a;
        float a2 = (float) list.get(0).a();
        float b2 = (float) list.get(0).b();
        float b3 = (float) list.get(0).b();
        float a3 = (float) list.get(0).a();
        int i = 0;
        while (i < list.size()) {
            s sVar = list.get(i);
            int a4 = sVar.a();
            int b4 = sVar.b();
            String a5 = com.bytedance.android.livesdk.gift.a.a(sVar.f16681c);
            Object[] objArr2 = new Object[3];
            objArr2[0] = Integer.valueOf(a4);
            objArr2[c2] = Integer.valueOf(b4);
            objArr2[2] = a5;
            ChangeQuickRedirect changeQuickRedirect = b.f14791a;
            s sVar2 = sVar;
            Class[] clsArr = new Class[3];
            clsArr[0] = Integer.TYPE;
            clsArr[c2] = Integer.TYPE;
            clsArr[2] = String.class;
            Object[] objArr3 = objArr2;
            String str = a5;
            int i2 = b4;
            int i3 = a4;
            s sVar3 = sVar2;
            float f2 = b3;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect, false, 9399, clsArr, Void.TYPE)) {
                b bVar2 = bVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), Integer.valueOf(i2), str}, bVar2, b.f14791a, false, 9399, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            } else if (str != null) {
                bVar.f14794d.add(new com.bytedance.android.livesdk.gift.effect.doodle.c.a(i3, i2, str));
            }
            if (((float) sVar3.a()) > a2) {
                a2 = (float) sVar3.a();
            } else if (((float) sVar3.a()) < a3) {
                a3 = (float) sVar3.a();
            }
            if (((float) sVar3.b()) > b2) {
                b2 = (float) sVar3.b();
                b3 = f2;
            } else {
                float f3 = f2;
                if (((float) sVar3.b()) < f3) {
                    b3 = (float) sVar3.b();
                } else {
                    b3 = f3;
                }
            }
            i++;
            c2 = 1;
        }
        float f4 = b3;
        if (qVar.f16672c == null || qVar.f16672c.getId() <= 0) {
            user = null;
        } else {
            user = qVar.f16672c;
        }
        float f5 = a2 - a3;
        if (f5 > 0.0f) {
            bVar.f14795e = f5;
        }
        float f6 = b2 - f4;
        if (f6 > 0.0f) {
            bVar.f14796f = f6;
        }
        bVar.g = a3;
        bVar.h = f4;
        bVar.k = qVar.baseMessage.f18779f;
        bVar.l = qVar.f16671b;
        bVar.m = user;
        return bVar;
    }
}
