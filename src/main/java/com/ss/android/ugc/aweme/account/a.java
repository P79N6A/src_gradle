package com.ss.android.ugc.aweme.account;

import a.i;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.f;
import com.bytedance.sdk.account.d.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.ui.AccountManagerActivity;
import com.ss.android.ugc.aweme.account.util.r;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31591a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.account.g.a f31592b;

    /* renamed from: c  reason: collision with root package name */
    public String f31593c = "";

    /* renamed from: d  reason: collision with root package name */
    public AccountManagerActivity f31594d;

    /* renamed from: e  reason: collision with root package name */
    private f f31595e;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f31591a, false, 19524, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31591a, false, 19524, new Class[0], Void.TYPE);
            return;
        }
        r.b().b(new b(this), i.f1052b);
    }

    public a(AccountManagerActivity accountManagerActivity) {
        this.f31595e = d.b(accountManagerActivity);
        this.f31594d = accountManagerActivity;
    }

    public final String b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f31591a, false, 19529, new Class[]{String.class}, String.class)) {
            return a(str2, false);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f31591a, false, 19529, new Class[]{String.class}, String.class);
    }

    private String a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f31591a, false, 19530, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f31591a, false, 19530, new Class[]{Integer.TYPE}, String.class);
        } else if (this.f31594d != null) {
            return this.f31594d.getString(i);
        } else {
            return "";
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f31591a, false, 19525, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f31591a, false, 19525, new Class[]{String.class}, Void.TYPE);
        } else if (this.f31594d != null) {
            AccountManagerActivity accountManagerActivity = this.f31594d;
            if (PatchProxy.isSupport(new Object[0], accountManagerActivity, AccountManagerActivity.f32807a, false, 21013, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], accountManagerActivity, AccountManagerActivity.f32807a, false, 21013, new Class[0], Void.TYPE);
            } else {
                accountManagerActivity.f32811e = com.ss.android.ugc.aweme.account.shortvideo.a.a.a(accountManagerActivity, accountManagerActivity.getString(C0906R.string.bc0));
            }
            Intent intent = new Intent(this.f31594d, AuthorizeActivity.class);
            this.f31593c = b(str);
            intent.putExtra("platform", this.f31593c);
            intent.putExtra("is_login", false);
            this.f31594d.startActivityForResult(intent, 10005);
        }
    }

    public final String a(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f31591a, false, 19528, new Class[]{String.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f31591a, false, 19528, new Class[]{String.class, Boolean.TYPE}, String.class);
        }
        String str2 = null;
        if (TextUtils.equals(str, a((int) C0906R.string.dti))) {
            str2 = "weixin";
        } else if (TextUtils.equals(str, a((int) C0906R.string.bu7))) {
            str2 = "qzone_sns";
        } else if (TextUtils.equals(str, a((int) C0906R.string.c8l))) {
            str2 = "sina_weibo";
        } else if (TextUtils.equals(str, a((int) C0906R.string.b3v))) {
            if (z) {
                str2 = "toutiao";
            } else {
                str2 = "toutiao_v2";
            }
        } else if (TextUtils.equals(str, a((int) C0906R.string.afm))) {
            str2 = "flipchat";
        }
        return str2;
    }

    public final void a(String str, int i, String str2, com.bytedance.sdk.account.api.call.a<BaseApiResponse> aVar) {
        String str3 = str;
        String str4 = str2;
        com.bytedance.sdk.account.api.call.a<BaseApiResponse> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str4, aVar2}, this, f31591a, false, 19526, new Class[]{String.class, Integer.TYPE, String.class, com.bytedance.sdk.account.api.call.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str4, aVar2}, this, f31591a, false, 19526, new Class[]{String.class, Integer.TYPE, String.class, com.bytedance.sdk.account.api.call.a.class}, Void.TYPE);
            return;
        }
        this.f31595e.a(str3, i, str4, aVar2);
    }
}
