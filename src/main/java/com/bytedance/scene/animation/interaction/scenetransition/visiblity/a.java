package com.bytedance.scene.animation.interaction.scenetransition.visiblity;

import android.support.annotation.NonNull;
import android.view.View;

public abstract class a implements Cloneable {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    protected View f22064a;

    /* renamed from: b  reason: collision with root package name */
    public long f22065b = 300;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            aVar.f22064a = null;
            return aVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
