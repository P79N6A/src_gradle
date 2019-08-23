package com.ss.android.ugc.aweme.shortvideo.senor.defult;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.hardware.Sensor;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.shortvideo.senor.BaseSenorPresenter;
import com.ss.android.ugc.aweme.shortvideo.senor.a;

public class DefaultSenorPresenter extends BaseSenorPresenter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69163a;

    /* renamed from: d  reason: collision with root package name */
    private a f69164d;

    /* renamed from: e  reason: collision with root package name */
    private MediaRecordPresenter f69165e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f69166f;

    public void unRegister() {
        if (PatchProxy.isSupport(new Object[0], this, f69163a, false, 78495, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69163a, false, 78495, new Class[0], Void.TYPE);
            return;
        }
        super.unRegister();
        if (this.f69164d != null) {
            this.f69164d.disable();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f69163a, false, 78492, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69163a, false, 78492, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f69163a, false, 78493, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69163a, false, 78493, new Class[0], Void.TYPE);
        } else {
            Sensor defaultSensor = b().getDefaultSensor(9);
            if (defaultSensor == null) {
                this.f69164d = new a(c(), this.f69165e);
                this.f69164d.enable();
            } else {
                b bVar = new b(this.f69165e, this.f69166f);
                b().registerListener(bVar, defaultSensor, b(defaultSensor.getType(), 100000));
                a((a) bVar);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f69163a, false, 78494, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69163a, false, 78494, new Class[0], Void.TYPE);
            return;
        }
        Sensor sensor = null;
        if (Build.VERSION.SDK_INT >= 18) {
            sensor = b().getDefaultSensor(15);
        }
        if (sensor == null) {
            sensor = b().getDefaultSensor(11);
        }
        if (sensor != null) {
            c cVar = new c(this.f69165e, this.f69166f);
            b().registerListener(cVar, sensor, b(sensor.getType(), 100000));
            a((a) cVar);
        }
    }

    public DefaultSenorPresenter(Context context, LifecycleOwner lifecycleOwner, MediaRecordPresenter mediaRecordPresenter, boolean z) {
        super(context, lifecycleOwner);
        this.f69165e = mediaRecordPresenter;
        this.f69166f = z;
    }
}
