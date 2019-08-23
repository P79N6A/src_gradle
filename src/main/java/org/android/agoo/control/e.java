package org.android.agoo.control;

public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f84010a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f84011b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AgooFactory f84012c;

    public void run() {
        this.f84012c.updateMsgStatus(this.f84010a, this.f84011b);
    }

    e(AgooFactory agooFactory, String str, String str2) {
        this.f84012c = agooFactory;
        this.f84010a = str;
        this.f84011b = str2;
    }
}
