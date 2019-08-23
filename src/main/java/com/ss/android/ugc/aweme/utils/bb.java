package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.utils.ay;
import com.ss.android.ugc.aweme.utils.az;
import java.util.concurrent.Callable;

public final /* synthetic */ class bb implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75585a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f75586b;

    bb(Context context) {
        this.f75586b = context;
    }

    public final Object call() {
        ay.a aVar;
        ay.c cVar;
        ay.d dVar;
        ay.b bVar;
        long j;
        long j2;
        long j3;
        if (PatchProxy.isSupport(new Object[0], this, f75585a, false, 88212, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f75585a, false, 88212, new Class[0], Object.class);
        }
        Context context = this.f75586b;
        az.a aVar2 = new az.a();
        if (PatchProxy.isSupport(new Object[]{context}, null, ay.f75549a, true, 88193, new Class[]{Context.class}, ay.a.class)) {
            aVar = (ay.a) PatchProxy.accessDispatch(new Object[]{context}, null, ay.f75549a, true, 88193, new Class[]{Context.class}, ay.a.class);
        } else {
            aVar = new ay.a();
            aVar.f75552a = ay.d();
            aVar.f75553b = ay.b() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            aVar.f75554c = ay.a();
        }
        aVar2.f75578a = aVar;
        if (PatchProxy.isSupport(new Object[]{context}, null, ay.f75549a, true, 88192, new Class[]{Context.class}, ay.c.class)) {
            cVar = (ay.c) PatchProxy.accessDispatch(new Object[]{context}, null, ay.f75549a, true, 88192, new Class[]{Context.class}, ay.c.class);
        } else {
            cVar = new ay.c();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                cVar.f75557a = displayMetrics.densityDpi;
                cVar.f75558b = displayMetrics.widthPixels;
                cVar.f75559c = displayMetrics.heightPixels;
            }
        }
        aVar2.f75579b = cVar;
        if (PatchProxy.isSupport(new Object[]{context}, null, ay.f75549a, true, 88194, new Class[]{Context.class}, ay.d.class)) {
            dVar = (ay.d) PatchProxy.accessDispatch(new Object[]{context}, null, ay.f75549a, true, 88194, new Class[]{Context.class}, ay.d.class);
        } else {
            dVar = new ay.d();
            dVar.f75564e = ay.c(context);
            long j4 = -1;
            if (PatchProxy.isSupport(new Object[0], null, ay.f75549a, true, 88183, new Class[0], Long.TYPE)) {
                j = ((Long) PatchProxy.accessDispatch(new Object[0], null, ay.f75549a, true, 88183, new Class[0], Long.TYPE)).longValue();
            } else {
                j = (!ay.c() || Environment.getExternalStorageDirectory() == null) ? -1 : ay.a(Environment.getExternalStorageDirectory().getPath());
            }
            dVar.f75560a = j;
            if (PatchProxy.isSupport(new Object[0], null, ay.f75549a, true, 88181, new Class[0], Long.TYPE)) {
                j2 = ((Long) PatchProxy.accessDispatch(new Object[0], null, ay.f75549a, true, 88181, new Class[0], Long.TYPE)).longValue();
            } else {
                j2 = Environment.getRootDirectory() != null ? ay.a(Environment.getRootDirectory().getPath()) : -1;
            }
            dVar.f75562c = j2;
            if (PatchProxy.isSupport(new Object[0], null, ay.f75549a, true, 88184, new Class[0], Long.TYPE)) {
                j3 = ((Long) PatchProxy.accessDispatch(new Object[0], null, ay.f75549a, true, 88184, new Class[0], Long.TYPE)).longValue();
            } else {
                j3 = (!ay.c() || Environment.getExternalStorageDirectory() == null) ? -1 : ay.b(Environment.getExternalStorageDirectory().getPath());
            }
            dVar.f75561b = j3;
            if (PatchProxy.isSupport(new Object[0], null, ay.f75549a, true, 88182, new Class[0], Long.TYPE)) {
                j4 = ((Long) PatchProxy.accessDispatch(new Object[0], null, ay.f75549a, true, 88182, new Class[0], Long.TYPE)).longValue();
            } else if (Environment.getRootDirectory() != null) {
                j4 = ay.b(Environment.getRootDirectory().getPath());
            }
            dVar.f75563d = j4;
        }
        aVar2.f75580c = dVar;
        if (PatchProxy.isSupport(new Object[]{context}, null, ay.f75549a, true, 88195, new Class[]{Context.class}, ay.b.class)) {
            bVar = (ay.b) PatchProxy.accessDispatch(new Object[]{context}, null, ay.f75549a, true, 88195, new Class[]{Context.class}, ay.b.class);
        } else {
            bVar = new ay.b();
            bVar.f75555a = ay.a(context);
            bVar.f75556b = ay.b(context);
        }
        aVar2.f75581d = bVar;
        return aVar2;
    }
}
