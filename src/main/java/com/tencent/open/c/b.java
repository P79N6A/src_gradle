package com.tencent.open.c;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.tencent.open.a.f;
import com.tencent.open.web.security.a;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f79713a;

    /* renamed from: b  reason: collision with root package name */
    private KeyEvent f79714b;

    /* renamed from: c  reason: collision with root package name */
    private com.tencent.open.web.security.b f79715c;

    public b(Context context) {
        super(context);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        f.c("openSDK_LOG.SecureWebView", "-->create input connection, is edit: " + a.f79768a);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        f.a("openSDK_LOG.SecureWebView", "-->onCreateInputConnection, inputConn is " + onCreateInputConnection);
        if (onCreateInputConnection != null) {
            f79713a = true;
            this.f79715c = new com.tencent.open.web.security.b(super.onCreateInputConnection(editorInfo), false);
            return this.f79715c;
        }
        f79713a = false;
        return onCreateInputConnection;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        f.b("openSDK_LOG.SecureWebView", "-->dispatchKeyEvent, is device support: " + f79713a);
        if (!f79713a) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        switch (keyCode) {
            case 66:
                return super.dispatchKeyEvent(keyEvent);
            case 67:
                com.tencent.open.web.security.b.f79770b = true;
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getUnicodeChar() == 0) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                if (a.f79768a) {
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((unicodeChar >= 33 && unicodeChar <= 95) || (unicodeChar >= 97 && unicodeChar <= 125)) {
                        this.f79714b = new KeyEvent(0, 17);
                        return super.dispatchKeyEvent(this.f79714b);
                    }
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        f.b("openSDK_LOG.SecureWebView", "-->onKeyDown, is device support: " + f79713a);
        if (!f79713a) {
            return super.onKeyDown(i, keyEvent);
        }
        if (keyEvent.getAction() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4) {
            return super.onKeyDown(i, keyEvent);
        }
        switch (keyCode) {
            case 66:
                return super.onKeyDown(i, keyEvent);
            case 67:
                com.tencent.open.web.security.b.f79770b = true;
                return super.onKeyDown(i, keyEvent);
            default:
                if (keyEvent.getUnicodeChar() == 0) {
                    return super.onKeyDown(i, keyEvent);
                }
                if (a.f79768a) {
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((unicodeChar >= 33 && unicodeChar <= 95) || (unicodeChar >= 97 && unicodeChar <= 125)) {
                        this.f79714b = new KeyEvent(0, 17);
                        return super.onKeyDown(this.f79714b.getKeyCode(), this.f79714b);
                    }
                }
                return super.onKeyDown(i, keyEvent);
        }
    }
}
