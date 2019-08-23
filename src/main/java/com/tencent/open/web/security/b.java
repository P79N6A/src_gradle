package com.tencent.open.web.security;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.tencent.open.a.f;

public final class b extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static String f79769a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f79770b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f79771c;

    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            f.c("openSDK_LOG.CaptureInputConnection", "sendKeyEvent");
            f79769a = String.valueOf((char) keyEvent.getUnicodeChar());
            f79771c = true;
            f.b("openSDK_LOG.CaptureInputConnection", "s: " + f79769a);
        }
        f.b("openSDK_LOG.CaptureInputConnection", "-->sendKeyEvent: " + f79769a);
        return super.sendKeyEvent(keyEvent);
    }

    public b(InputConnection inputConnection, boolean z) {
        super(inputConnection, false);
    }

    public final boolean commitText(CharSequence charSequence, int i) {
        f79771c = true;
        f79769a = charSequence.toString();
        f.a("openSDK_LOG.CaptureInputConnection", "-->commitText: " + charSequence.toString());
        return super.commitText(charSequence, i);
    }

    public final boolean setComposingText(CharSequence charSequence, int i) {
        f79771c = true;
        f79769a = charSequence.toString();
        f.a("openSDK_LOG.CaptureInputConnection", "-->setComposingText: " + charSequence.toString());
        return super.setComposingText(charSequence, i);
    }
}
