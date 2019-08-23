package com.ss.android.downloadlib.a;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import com.ss.android.download.api.config.f;
import com.ss.android.download.api.config.l;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private l f28702a;

    public final boolean a(@Nullable Context context, @NonNull String str) {
        if (context == null || ContextCompat.checkSelfPermission(context, str) != 0) {
            return false;
        }
        return true;
    }

    public final void a(@NonNull String[] strArr, @NonNull int[] iArr) {
        if (iArr.length > 0 && this.f28702a != null) {
            if (iArr[0] == -1) {
                this.f28702a.a(strArr[0]);
            } else if (iArr[0] == 0) {
                this.f28702a.a();
            }
        }
    }

    public final void a(@NonNull Activity activity, @NonNull String[] strArr, l lVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f28702a = lVar;
            activity.requestPermissions(strArr, 1);
            return;
        }
        lVar.a();
    }
}
