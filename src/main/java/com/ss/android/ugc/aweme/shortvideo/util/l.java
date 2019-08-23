package com.ss.android.ugc.aweme.shortvideo.util;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71140a;

    /* renamed from: b  reason: collision with root package name */
    public ProgressDialog f71141b;

    /* renamed from: c  reason: collision with root package name */
    public Context f71142c;

    public interface a {
        void a(Exception exc);

        void a(String str);
    }

    public l(@NonNull Context context, @NonNull ProgressDialog progressDialog) {
        this.f71142c = context.getApplicationContext();
        this.f71141b = progressDialog;
    }
}
