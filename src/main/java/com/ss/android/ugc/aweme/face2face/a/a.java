package com.ss.android.ugc.aweme.face2face.a;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.face2face.net.b;
import com.ss.android.ugc.aweme.utils.bg;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43909a;

    /* renamed from: b  reason: collision with root package name */
    private FragmentActivity f43910b;

    /* renamed from: c  reason: collision with root package name */
    private i f43911c;

    a(FragmentActivity fragmentActivity) {
        this.f43910b = fragmentActivity;
    }

    public final void a(@NonNull b bVar, @NonNull i iVar) {
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{bVar, iVar2}, this, f43909a, false, 39155, new Class[]{b.class, i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, iVar2}, this, f43909a, false, 39155, new Class[]{b.class, i.class}, Void.TYPE);
            return;
        }
        this.f43911c = iVar2;
        bg.c(this);
        String str = bVar.getFroInviteUser().nickName;
        if (!TextUtils.isEmpty(str) && str.length() > 5) {
            String substring = TextUtils.substring(str, 0, 5);
            StringBuilder sb = new StringBuilder();
            sb.append(substring);
            sb.append("...");
        }
    }
}
