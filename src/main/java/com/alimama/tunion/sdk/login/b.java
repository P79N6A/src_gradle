package com.alimama.tunion.sdk.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alimama.tunion.sdk.service.ITUnionLoginService;
import com.alimama.tunion.trade.base.ITUnionWebView;

public class b implements ITUnionLoginService {

    /* renamed from: a  reason: collision with root package name */
    protected a f5181a = a.a();

    /* renamed from: b  reason: collision with root package name */
    protected boolean f5182b;

    /* renamed from: c  reason: collision with root package name */
    private String[] f5183c = {"", ""};

    private String a() {
        return this.f5183c[1];
    }

    public String getAvatarUrl() {
        if (!this.f5182b) {
            return null;
        }
        return this.f5181a.d();
    }

    public String getNick() {
        if (!this.f5182b) {
            return null;
        }
        return this.f5181a.c();
    }

    public boolean isLogin() {
        if (!this.f5182b) {
            return false;
        }
        return this.f5181a.b();
    }

    private void a(String str) {
        this.f5183c[1] = this.f5183c[0];
        this.f5183c[0] = str;
    }

    public boolean isLoginUrl(String str) {
        if (!this.f5182b) {
            return false;
        }
        return this.f5181a.a(str);
    }

    public boolean isLogoutUrl(String str) {
        if (!this.f5182b) {
            return false;
        }
        a(str);
        return this.f5181a.b(str);
    }

    public void logout(Activity activity, TUnionLoginCallback tUnionLoginCallback) {
        if (this.f5182b) {
            this.f5181a.a(activity, tUnionLoginCallback);
        }
    }

    public void showLogin(Activity activity, TUnionLoginAuthCallback tUnionLoginAuthCallback) {
        if (this.f5182b) {
            this.f5181a.a(activity, a(), tUnionLoginAuthCallback);
        }
    }

    public void a(Context context, final TUnionLoginCallback tUnionLoginCallback) {
        synchronized (b.class) {
            this.f5181a.a(context, (TUnionLoginCallback) new TUnionLoginCallback() {
                public void onSuccess() {
                    b.this.f5182b = true;
                    if (tUnionLoginCallback != null) {
                        tUnionLoginCallback.onSuccess();
                    }
                }

                public void onFailure(int i, String str) {
                    b.this.f5182b = false;
                    if (tUnionLoginCallback != null) {
                        tUnionLoginCallback.onFailure(i, str);
                    }
                }
            });
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (!this.f5182b) {
            return false;
        }
        return this.f5181a.a(i, i2, intent);
    }

    public boolean shouldOverrideUrlLoading(Activity activity, final ITUnionWebView iTUnionWebView, String str) {
        if (!this.f5182b) {
            return false;
        }
        if (isLoginUrl(str)) {
            showLogin(activity, new TUnionLoginAuthCallback() {
                public void onFailure(int i, String str) {
                }

                public void onSuccess(String str) {
                    if (iTUnionWebView != null) {
                        if (!TextUtils.isEmpty(str)) {
                            iTUnionWebView.loadUrl(str);
                            return;
                        }
                        iTUnionWebView.reload();
                    }
                }
            });
            return true;
        }
        if (isLoginUrl(str)) {
            logout(activity, new TUnionLoginCallback() {
                public void onFailure(int i, String str) {
                }

                public void onSuccess() {
                    if (iTUnionWebView != null) {
                        iTUnionWebView.reload();
                    }
                }
            });
        }
        return false;
    }
}
