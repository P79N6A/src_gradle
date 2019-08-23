package com.ss.android.ugc.aweme.im.service.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52878a;

    /* renamed from: b  reason: collision with root package name */
    public int f52879b;

    /* renamed from: c  reason: collision with root package name */
    public String f52880c;

    /* renamed from: d  reason: collision with root package name */
    public int f52881d;

    /* renamed from: e  reason: collision with root package name */
    public FlipChatSettings f52882e;

    /* renamed from: f  reason: collision with root package name */
    public e f52883f;
    public int g;
    public int h;
    public List<String> i;
    public int j;
    public int k;

    public static d a() {
        if (PatchProxy.isSupport(new Object[0], null, f52878a, true, 54419, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f52878a, true, 54419, new Class[0], d.class);
        }
        d dVar = new d();
        dVar.f52879b = 0;
        dVar.f52880c = "";
        dVar.f52881d = 10;
        dVar.h = 0;
        dVar.j = 0;
        dVar.k = 0;
        return dVar;
    }
}
