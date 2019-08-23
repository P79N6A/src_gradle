package com.ss.android.ugc.aweme.shortvideo.ar.senor;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.hardware.Sensor;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.shortvideo.senor.BaseSenorPresenter;
import com.ss.android.ugc.aweme.shortvideo.senor.defult.a;

public class ARSenorPresenter extends BaseSenorPresenter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3893a;

    /* renamed from: d  reason: collision with root package name */
    private a f3894d;

    /* renamed from: e  reason: collision with root package name */
    private MediaRecordPresenter f3895e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3896f;

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
    }

    public void unRegister() {
        if (PatchProxy.isSupport(new Object[0], this, f3893a, false, 75119, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3893a, false, 75119, new Class[0], Void.TYPE);
            return;
        }
        super.unRegister();
        if (this.f3894d != null) {
            this.f3894d.disable();
        }
    }

    public final void a() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (PatchProxy.isSupport(new Object[0], this, f3893a, false, 75114, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3893a, false, 75114, new Class[0], Void.TYPE);
            return;
        }
        MediaRecordPresenter mediaRecordPresenter = this.f3895e;
        if (PatchProxy.isSupport(new Object[0], this, f3893a, false, 75118, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3893a, false, 75118, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            Sensor defaultSensor = b().getDefaultSensor(1);
            if (defaultSensor == null) {
                z = false;
            } else {
                a aVar = new a(this.f3895e, this.f3896f);
                b().registerListener(aVar, defaultSensor, b(defaultSensor.getType(), 0));
                a((com.ss.android.ugc.aweme.shortvideo.senor.a) aVar);
                z = true;
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f3893a, false, 75115, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3893a, false, 75115, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            Sensor defaultSensor2 = b().getDefaultSensor(4);
            if (defaultSensor2 == null) {
                z2 = false;
            } else {
                c cVar = new c(this.f3895e, this.f3896f);
                b().registerListener(cVar, defaultSensor2, b(defaultSensor2.getType(), 0));
                a((com.ss.android.ugc.aweme.shortvideo.senor.a) cVar);
                z2 = true;
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f3893a, false, 75117, new Class[0], Boolean.TYPE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3893a, false, 75117, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            Sensor defaultSensor3 = b().getDefaultSensor(9);
            if (defaultSensor3 == null) {
                this.f3894d = new a(c(), this.f3895e);
                this.f3894d.enable();
                z3 = false;
            } else {
                b bVar = new b(this.f3895e, this.f3896f);
                b().registerListener(bVar, defaultSensor3, b(defaultSensor3.getType(), 0));
                a((com.ss.android.ugc.aweme.shortvideo.senor.a) bVar);
                z3 = true;
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f3893a, false, 75116, new Class[0], Boolean.TYPE)) {
            z4 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3893a, false, 75116, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            Sensor sensor = null;
            if (Build.VERSION.SDK_INT >= 18) {
                sensor = b().getDefaultSensor(15);
            }
            if (sensor == null) {
                sensor = b().getDefaultSensor(11);
                if (sensor == null) {
                    z4 = false;
                }
            }
            d dVar = new d(b(), this.f3895e, this.f3896f);
            b().registerListener(dVar, sensor, b(sensor.getType(), 0));
            a((com.ss.android.ugc.aweme.shortvideo.senor.a) dVar);
            z4 = true;
        }
        boolean z5 = z3;
        boolean z6 = z2;
        boolean z7 = z;
        MediaRecordPresenter mediaRecordPresenter2 = mediaRecordPresenter;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), Byte.valueOf(z4 ? (byte) 1 : 0)}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17660, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            Object[] objArr = {Byte.valueOf(z7 ? (byte) 1 : 0), Byte.valueOf(z6 ? (byte) 1 : 0), Byte.valueOf(z5 ? (byte) 1 : 0), Byte.valueOf(z4)};
            Object[] objArr2 = objArr;
            MediaRecordPresenter mediaRecordPresenter3 = mediaRecordPresenter2;
            ((Integer) PatchProxy.accessDispatch(objArr2, mediaRecordPresenter3, MediaRecordPresenter.f29728a, false, 17660, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        } else {
            mediaRecordPresenter2.j.slamDeviceConfig(z7, z6, z5, z4);
        }
    }

    public ARSenorPresenter(Context context, LifecycleOwner lifecycleOwner, MediaRecordPresenter mediaRecordPresenter, boolean z) {
        super(context, lifecycleOwner);
        this.f3895e = mediaRecordPresenter;
        this.f3896f = z;
    }
}
