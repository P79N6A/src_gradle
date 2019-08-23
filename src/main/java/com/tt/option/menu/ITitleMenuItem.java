package com.tt.option.menu;

import android.support.annotation.NonNull;
import com.tt.miniapphost.process.annotation.AnyProcess;

@AnyProcess
public interface ITitleMenuItem {
    @AnyProcess
    @NonNull
    String getKey();

    @AnyProcess
    String getName();

    @AnyProcess
    void onItemClick();
}
