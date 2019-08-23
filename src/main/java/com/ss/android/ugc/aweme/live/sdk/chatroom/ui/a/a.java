package com.ss.android.ugc.aweme.live.sdk.chatroom.ui.a;

import android.app.Activity;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commerce.live.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53508a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f53509b;

    /* renamed from: c  reason: collision with root package name */
    private ViewGroup f53510c;

    public a(ViewGroup viewGroup) {
        this.f53510c = viewGroup;
    }

    public final void a(f.a aVar) {
        boolean z;
        f.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f53508a, false, 55926, new Class[]{f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f53508a, false, 55926, new Class[]{f.a.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, c.f36963a, true, 28279, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, c.f36963a, true, 28279, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            z = c.f36964b.a();
        }
        if (!z) {
            aVar.a();
            return;
        }
        Activity activity = (Activity) aVar.b().f18760a;
        int height = this.f53510c.getHeight();
        b bVar = new b(this, aVar2);
        if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(height), bVar}, null, c.f36963a, true, 28278, new Class[]{Activity.class, Integer.TYPE, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(height), bVar}, null, c.f36963a, true, 28278, new Class[]{Activity.class, Integer.TYPE, Function1.class}, Void.TYPE);
            return;
        }
        c.a aVar3 = c.f36964b;
        Object[] objArr = {activity, Integer.valueOf(height), bVar};
        if (PatchProxy.isSupport(objArr, aVar3, c.a.f36965a, false, 28281, new Class[]{Activity.class, Integer.TYPE, Function1.class}, Void.TYPE)) {
            Object[] objArr2 = {activity, Integer.valueOf(height), bVar};
            Object[] objArr3 = objArr2;
            c.a aVar4 = aVar3;
            PatchProxy.accessDispatch(objArr3, aVar4, c.a.f36965a, false, 28281, new Class[]{Activity.class, Integer.TYPE, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(bVar, "next");
        if (aVar3.a()) {
            bVar.invoke(0);
        } else {
            bVar.invoke(1);
        }
    }
}
