package com.bytedance.ies.uikit.base;

import android.content.Intent;

public interface IComponent {
    boolean isActive();

    boolean isViewValid();

    void startActivityForResult(Intent intent, int i);
}
