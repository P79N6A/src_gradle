package com.feiliao.oauth.sdk.flipchat.open.impl;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u001a\u0010\u0013\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/KeyBoardUtils;", "", "()V", "DEFAULT_KEYBOARD_HEIGHT", "", "FILE_NAME", "", "KEY_KEYBOARD_HEIGHT", "KEY_KEYBOARD_MAX_HEIGHT", "MIN_KEYBOARD_HEIGHT", "keyboardHeight", "hideKeyboard", "", "context", "Landroid/content/Context;", "window", "Landroid/view/Window;", "windowToken", "Landroid/os/IBinder;", "showKeyboard", "view", "Landroid/view/View;", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f24361a = new l();

    private l() {
    }

    @JvmStatic
    public static final void a(@Nullable Context context) {
        try {
            Object systemService = context.getSystemService("input_method");
            if (systemService != null) {
                Window window = ((Activity) context).getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window, "(context as Activity).window");
                View decorView = window.getDecorView();
                Intrinsics.checkExpressionValueIsNotNull(decorView, "(context as Activity).window.decorView");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(decorView.getWindowToken(), 0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        } catch (Exception unused) {
        }
    }
}
