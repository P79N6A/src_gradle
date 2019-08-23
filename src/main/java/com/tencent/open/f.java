package com.tencent.open;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

public abstract class f extends Dialog {

    /* renamed from: e  reason: collision with root package name */
    protected d f79764e;
    @SuppressLint({"NewApi"})

    /* renamed from: f  reason: collision with root package name */
    protected final WebChromeClient f79765f = new WebChromeClient() {
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String str;
            if (consoleMessage == null) {
                return false;
            }
            com.tencent.open.a.f.c("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + consoleMessage.message() + " -- From  111 line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            if (Build.VERSION.SDK_INT > 7) {
                f fVar = f.this;
                if (consoleMessage == null) {
                    str = "";
                } else {
                    str = consoleMessage.message();
                }
                fVar.a(str);
            }
            return true;
        }

        public final void onConsoleMessage(String str, int i, String str2) {
            com.tencent.open.a.f.c("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + str + " -- From 222 line " + i + " of " + str2);
            if (Build.VERSION.SDK_INT == 7) {
                f.this.a(str);
            }
        }
    };

    /* access modifiers changed from: protected */
    public abstract void a(String str);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f79764e = new d();
    }

    public f(Context context, int i) {
        super(context, 16973840);
    }
}
