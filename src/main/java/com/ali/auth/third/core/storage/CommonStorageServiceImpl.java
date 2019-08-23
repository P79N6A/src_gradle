package com.ali.auth.third.core.storage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import com.ali.auth.third.core.context.KernelContext;
import com.ali.auth.third.core.exception.SecRuntimeException;
import com.ali.auth.third.core.model.Constants;
import com.ali.auth.third.core.model.HistoryAccount;
import com.ali.auth.third.core.service.StorageService;
import com.ali.auth.third.core.storage.a.a;
import com.ali.auth.third.core.storage.a.b;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.q.c;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.TreeMap;

public class CommonStorageServiceImpl implements StorageService {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f4961a = c.a(this.f4962b, Constants.TB_SESSION, 0);

    /* renamed from: b  reason: collision with root package name */
    private Context f4962b = KernelContext.getApplicationContext();

    /* renamed from: c  reason: collision with root package name */
    private String f4963c;

    public HistoryAccount findHistoryAccount(String str) {
        return null;
    }

    public String getAppKey() {
        try {
            ApplicationInfo applicationInfo = this.f4962b.getPackageManager().getApplicationInfo(this.f4962b.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (applicationInfo.metaData == null) {
                return null;
            }
            Object obj = applicationInfo.metaData.get("com.alibaba.app.appkey");
            if (obj == null) {
                return null;
            }
            return obj.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public byte[] getByteArray(String str) {
        return new byte[0];
    }

    public List<HistoryAccount> getHistoryAccounts() {
        return null;
    }

    public String getUmid() {
        return this.f4963c;
    }

    public String getValue(String str, boolean z) {
        String string = this.f4961a.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return string;
        }
        return symDecrypt(string, b.a(KernelContext.timestamp));
    }

    public HistoryAccount matchHistoryAccount(String str) {
        return null;
    }

    public void putLoginHistory(HistoryAccount historyAccount, String str) {
    }

    @SuppressLint({"NewApi"})
    public void putValue(String str, String str2, boolean z) {
        String symEncrypt = symEncrypt(str2, b.a(KernelContext.timestamp));
        if (Build.VERSION.SDK_INT >= 9) {
            this.f4961a.edit().putString(str, symEncrypt).apply();
        } else {
            this.f4961a.edit().putString(str, symEncrypt).commit();
        }
    }

    public void removeSafeToken(String str) {
    }

    public void removeValue(String str, boolean z) {
        this.f4961a.edit().remove(str);
    }

    public void savePublicKey(byte[] bArr) {
    }

    public void setUmid(String str) {
        this.f4963c = str;
    }

    public String signMap(String str, TreeMap<String, String> treeMap) {
        return null;
    }

    public String symDecrypt(String str, String str2) {
        try {
            return a.b(str2, str);
        } catch (GeneralSecurityException e2) {
            throw new SecRuntimeException(-2, e2);
        }
    }

    public String symEncrypt(String str, String str2) {
        try {
            return a.a(str2, str);
        } catch (GeneralSecurityException e2) {
            throw new SecRuntimeException(-1, e2);
        }
    }
}
