package com.bytedance.android.live.base.model.d;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.IOException;

public class a extends IOException {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String message;
    public int statusCode;

    public String getMessage() {
        return this.message;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public a(int i, String str) {
        this.statusCode = i;
        this.message = str;
    }
}
