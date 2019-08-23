package com.mapbox.android.core.a;

import android.location.Location;
import android.support.annotation.RequiresPermission;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class f {

    /* renamed from: b  reason: collision with root package name */
    public h f25925b;

    /* renamed from: c  reason: collision with root package name */
    protected Integer f25926c = Integer.valueOf(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);

    /* renamed from: d  reason: collision with root package name */
    protected Integer f25927d = Integer.valueOf(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);

    /* renamed from: e  reason: collision with root package name */
    protected Float f25928e = Float.valueOf(3.0f);

    /* renamed from: f  reason: collision with root package name */
    protected CopyOnWriteArrayList<g> f25929f = new CopyOnWriteArrayList<>();

    public enum a {
        GOOGLE_PLAY_SERVICES,
        ANDROID,
        MOCK
    }

    public abstract void a();

    public abstract void b();

    public abstract boolean c();

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    public abstract Location d();

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    public abstract void e();

    public abstract void f();

    public void a(h hVar) {
        this.f25925b = hVar;
    }

    public final boolean b(g gVar) {
        return this.f25929f.remove(gVar);
    }

    public final void a(g gVar) {
        if (!this.f25929f.contains(gVar)) {
            this.f25929f.add(gVar);
        }
    }
}
