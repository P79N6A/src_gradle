package com.bytedance.scene.animation.interaction;

import android.content.Context;
import android.support.v4.os.CancellationSignal;
import android.support.v4.view.ViewCompat;
import com.bytedance.scene.animation.interaction.a.a;
import com.bytedance.scene.b.k;
import com.bytedance.scene.navigation.e;

class InteractionNavigationPopAnimationFactory$1 implements CancellationSignal.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f22048a;

    public void onCancel() {
        a aVar = this.f22048a;
        if (aVar.f22052c) {
            if (aVar.f22052c) {
                for (a next : aVar.f22051b) {
                    next.f22059d = Math.min(1.0f, 0.0f / next.f22058c);
                }
                aVar.f22053d = 0.0f;
            }
            aVar.f22052c = false;
            if (a.k == aVar.j) {
                a.k = null;
            }
            e eVar = aVar.f22050a;
            if (eVar.k.f22187c) {
                ViewCompat.setBackground(eVar.f22094b, k.a((Context) eVar.r()));
            }
            aVar.f22055f.f22094b.setVisibility(aVar.h);
            ViewCompat.setBackground(aVar.f22054e.f22094b, aVar.g);
            if (aVar.i != null) {
                aVar.i.a();
            }
        }
    }
}
