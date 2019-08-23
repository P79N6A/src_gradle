package com.ss.android.ugc.aweme.detail.operators;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.challenge.c.a;
import com.ss.android.ugc.aweme.common.f.b;

public final class d extends a<a, b<a>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41221a;

    /* renamed from: e  reason: collision with root package name */
    private String f41222e;

    public final int a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41221a, false, 34758, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41221a, false, 34758, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (TextUtils.equals("from_discovery_challenge", this.f41222e)) {
            return 9000;
        } else {
            return i + PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
        }
    }

    public d(@Nullable com.ss.android.ugc.aweme.common.f.a aVar, String str) {
        a aVar2;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
        } else {
            aVar2 = new a();
        }
        this.f41200c = aVar2;
        this.f41201d = new b();
        this.f41222e = str;
        if (PatchProxy.isSupport(new Object[0], this, f41221a, false, 34757, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41221a, false, 34757, new Class[0], Void.TYPE);
            return;
        }
        if (TextUtils.equals("from_discovery_challenge", this.f41222e) && this.f41200c != null) {
            a aVar3 = (a) this.f41200c;
            if (PatchProxy.isSupport(new Object[]{"discovery_challenge_video"}, aVar3, a.f35360a, false, 25853, new Class[]{String.class}, Void.TYPE)) {
                a aVar4 = aVar3;
                PatchProxy.accessDispatch(new Object[]{"discovery_challenge_video"}, aVar4, a.f35360a, false, 25853, new Class[]{String.class}, Void.TYPE);
            } else if (!TextUtils.isEmpty("discovery_challenge_video")) {
                aVar3.f35361b = "discovery_challenge_video";
            }
        }
    }

    public final void a(int i, @NonNull com.ss.android.ugc.aweme.feed.param.b bVar, int i2, boolean z) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f41221a, false, 34759, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f41221a, false, 34759, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.feed.param.b.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        b bVar2 = this.f41201d;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = bVar.getChallengeId();
        objArr[2] = Integer.valueOf(bVar.getVideoType());
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, this, f41221a, false, 34760, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f41221a, false, 34760, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (a() && !com.ss.android.g.a.a() && z) {
            z2 = true;
        }
        objArr[3] = Boolean.valueOf(z2);
        bVar2.a(objArr);
    }
}
