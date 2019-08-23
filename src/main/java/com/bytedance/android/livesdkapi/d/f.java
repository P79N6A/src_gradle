package com.bytedance.android.livesdkapi.d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;

public interface f {
    DialogFragment a(Context context, String str, i iVar);

    @Nullable
    b a(@NonNull Context context);

    @SuppressLint({"TooManyMethodParam"})
    void a(@NonNull Fragment fragment, @NonNull String str, @NonNull String str2, e eVar);

    void a(@NonNull h hVar);

    void a(i iVar, String str);

    void a(boolean z);

    boolean a(@NonNull Activity activity, boolean z);

    void b(boolean z);
}
