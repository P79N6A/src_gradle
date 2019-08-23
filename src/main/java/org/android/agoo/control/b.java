package org.android.agoo.control;

import com.taobao.accs.base.TaoBaseService;

public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ byte[] f84002a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f84003b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TaoBaseService.ExtraInfo f84004c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AgooFactory f84005d;

    public void run() {
        this.f84005d.msgReceiverPreHandler(this.f84002a, this.f84003b, this.f84004c, true);
    }

    b(AgooFactory agooFactory, byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo) {
        this.f84005d = agooFactory;
        this.f84002a = bArr;
        this.f84003b = str;
        this.f84004c = extraInfo;
    }
}
