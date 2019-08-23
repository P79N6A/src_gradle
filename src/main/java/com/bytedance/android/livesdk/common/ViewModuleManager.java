package com.bytedance.android.livesdk.common;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ViewModuleManager extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13632a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f13633b = ViewModuleManager.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    public Context f13634c;

    /* renamed from: d  reason: collision with root package name */
    public View f13635d;

    /* renamed from: e  reason: collision with root package name */
    public Bundle f13636e;

    /* renamed from: f  reason: collision with root package name */
    public List<a> f13637f = new CopyOnWriteArrayList();
    public int g = 0;

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f13632a, false, 8086, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13632a, false, 8086, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.g = 4;
        Iterator<a> it2 = this.f13637f.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f13632a, false, 8085, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13632a, false, 8085, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.g = 3;
        for (a a2 : this.f13637f) {
            a2.a();
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f13632a, false, 8084, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13632a, false, 8084, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        this.g = 2;
        Iterator<a> it2 = this.f13637f.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f13632a, false, 8088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13632a, false, 8088, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        this.g = 5;
        for (a e2 : this.f13637f) {
            e2.e();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f13632a, false, 8089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13632a, false, 8089, new Class[0], Void.TYPE);
        } else if (this.g != 6) {
            this.g = 6;
            for (a f2 : this.f13637f) {
                f2.f();
            }
            this.f13637f.clear();
            super.onDestroy();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f13632a, false, 8083, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f13632a, false, 8083, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.g = 1;
        for (a a2 : this.f13637f) {
            a2.a(this.f13634c, this.f13635d, this.f13636e);
        }
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f13632a, false, 8087, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f13632a, false, 8087, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        Iterator<a> it2 = this.f13637f.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }
}
