package com.tencent.mm.opensdk.diffdev.a;

import com.tencent.mm.opensdk.diffdev.OAuthListener;
import java.util.ArrayList;

public final class c implements Runnable {
    final /* synthetic */ b ac;

    c(b bVar) {
        this.ac = bVar;
    }

    public final void run() {
        ArrayList<OAuthListener> arrayList = new ArrayList<>();
        arrayList.addAll(this.ac.ab.Y);
        for (OAuthListener onQrcodeScanned : arrayList) {
            onQrcodeScanned.onQrcodeScanned();
        }
    }
}
