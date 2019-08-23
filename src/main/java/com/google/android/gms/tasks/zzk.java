package com.google.android.gms.tasks;

import android.support.annotation.NonNull;

public interface zzk<TResult> {
    void cancel();

    void onComplete(@NonNull Task<TResult> task);
}
