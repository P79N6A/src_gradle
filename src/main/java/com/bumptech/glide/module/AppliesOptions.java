package com.bumptech.glide.module;

import android.content.Context;
import android.support.annotation.NonNull;
import com.bumptech.glide.GlideBuilder;

@Deprecated
public interface AppliesOptions {
    void applyOptions(@NonNull Context context, @NonNull GlideBuilder glideBuilder);
}
