package org.greenrobot.eventbus.util;

import android.os.Bundle;

public abstract class b<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final a f84167a;

    /* access modifiers changed from: protected */
    public abstract T a();

    /* access modifiers changed from: protected */
    public final T a(d dVar, boolean z, Bundle bundle) {
        Bundle bundle2;
        int i;
        if (dVar.f84170b) {
            return null;
        }
        if (bundle != null) {
            bundle2 = (Bundle) bundle.clone();
        } else {
            bundle2 = new Bundle();
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.title")) {
            bundle2.putString("de.greenrobot.eventbus.errordialog.title", this.f84167a.f84161a.getString(this.f84167a.f84162b));
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.message")) {
            a aVar = this.f84167a;
            Integer a2 = aVar.f84164d.a(dVar.f84169a);
            if (a2 != null) {
                i = a2.intValue();
            } else {
                i = aVar.f84163c;
            }
            bundle2.putString("de.greenrobot.eventbus.errordialog.message", this.f84167a.f84161a.getString(i));
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.finish_after_dialog")) {
            bundle2.putBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", z);
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.event_type_on_close") && this.f84167a.g != null) {
            bundle2.putSerializable("de.greenrobot.eventbus.errordialog.event_type_on_close", this.f84167a.g);
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.icon_id") && this.f84167a.f84166f != 0) {
            bundle2.putInt("de.greenrobot.eventbus.errordialog.icon_id", this.f84167a.f84166f);
        }
        return a();
    }
}
