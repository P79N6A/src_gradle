package com.ss.android.d.b.a.a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public final AccountManager f28357a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<String, String> f28358b = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private Account f28359d;

    public a(Context context) {
        this.f28357a = AccountManager.get(context);
    }

    /* access modifiers changed from: protected */
    public final String a(String str) {
        if (this.f28359d == null) {
            return null;
        }
        try {
            String userData = this.f28357a.getUserData(this.f28359d, str);
            Logger.debug();
            return userData;
        } catch (Throwable unused) {
            Logger.debug();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String[] b(String str) {
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return a2.split("\n");
    }

    public final void a(final Account account) {
        if (account != null) {
            this.f28359d = account;
            if (this.f28358b != null && this.f28358b.size() > 0) {
                ThreadPlus.submitRunnable(new Runnable() {
                    public final void run() {
                        try {
                            if (a.this.f28358b != null && a.this.f28358b.size() > 0) {
                                if (a.this.f28357a != null) {
                                    for (Map.Entry next : a.this.f28358b.entrySet()) {
                                        if (next != null) {
                                            a.this.f28357a.setUserData(account, (String) next.getKey(), (String) next.getValue());
                                        }
                                    }
                                    a.this.f28358b.clear();
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void c(String str) {
        if (this.f28358b != null && this.f28358b.containsKey(str)) {
            this.f28358b.remove(str);
        }
        try {
            if (!(this.f28359d == null || this.f28357a == null)) {
                this.f28357a.setUserData(this.f28359d, str, null);
            }
        } catch (Exception unused) {
        }
        super.c(str);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String[] strArr) {
        if (strArr != null) {
            a(str, TextUtils.join("\n", strArr));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2) {
        if (this.f28359d == null) {
            this.f28358b.put(str, str2);
        } else if (str != null && str2 != null) {
            try {
                Logger.debug();
                this.f28357a.setUserData(this.f28359d, str, str2);
            } catch (Throwable unused) {
                Logger.debug();
            }
        }
    }
}
