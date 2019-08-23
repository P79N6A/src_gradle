package com.ss.android.ugc.aweme.im.sdk.chat.input;

import android.support.annotation.DrawableRes;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c;
import java.util.ArrayList;
import java.util.List;

public class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50332a;
    @DrawableRes

    /* renamed from: b  reason: collision with root package name */
    protected int f50333b;

    /* renamed from: c  reason: collision with root package name */
    protected int f50334c;

    public String b() {
        return "";
    }

    public String c() {
        return "";
    }

    public int e() {
        return 0;
    }

    public int f() {
        return 0;
    }

    public boolean g() {
        return true;
    }

    public int h() {
        return 1;
    }

    public int i() {
        return 0;
    }

    public int a() {
        return this.f50333b;
    }

    public int d() {
        return this.f50334c;
    }

    public void a(int i) {
        this.f50334c = i;
    }

    public List<c> b(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50332a, false, 50519, new Class[]{Integer.TYPE}, List.class)) {
            return new ArrayList(f());
        }
        return (List) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50332a, false, 50519, new Class[]{Integer.TYPE}, List.class);
    }
}
