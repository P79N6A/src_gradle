package com.bytedance.common.utility.persistent;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.os.Build;

public class SharedPrefsEditorCompat {
    static final EditorImpl IMPL;

    static class BaseEditorImpl implements EditorImpl {
        BaseEditorImpl() {
        }

        public void apply(SharedPreferences.Editor editor) {
            editor.commit();
        }
    }

    interface EditorImpl {
        void apply(SharedPreferences.Editor editor);
    }

    static class GingerbreadEditorImpl implements EditorImpl {
        GingerbreadEditorImpl() {
        }

        @TargetApi(9)
        public void apply(SharedPreferences.Editor editor) {
            editor.apply();
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 9) {
            IMPL = new GingerbreadEditorImpl();
        } else {
            IMPL = new BaseEditorImpl();
        }
    }

    public static void apply(SharedPreferences.Editor editor) {
        if (editor != null) {
            IMPL.apply(editor);
        }
    }
}
