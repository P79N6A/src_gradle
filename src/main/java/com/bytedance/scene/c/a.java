package com.bytedance.scene.c;

import android.content.Context;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.util.SparseArray;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22086a;

    public a(@NonNull Context context) {
        super(context);
    }

    public final void setSupportRestore(boolean z) {
        this.f22086a = z;
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        if (this.f22086a) {
            super.dispatchRestoreInstanceState(sparseArray);
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        if (this.f22086a) {
            super.dispatchSaveInstanceState(sparseArray);
        }
    }
}
