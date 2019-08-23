package com.bytedance.ies.dmt.ui.input;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IInputView {

    @Retention(RetentionPolicy.SOURCE)
    public @interface PanelType {
    }

    void a(int i);

    void a(String str, int i);
}
