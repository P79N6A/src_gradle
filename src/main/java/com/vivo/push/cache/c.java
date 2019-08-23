package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.vivo.push.util.f;
import com.vivo.push.util.g;
import com.vivo.push.util.o;
import com.vivo.push.util.v;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class c<T> {
    public static final byte[] CRPYT_IV_BYTE = {34, 32, 33, 37, 33, 34, 32, 33, 33, 33, 34, 41, 35, 35, 32, 32};
    public static final byte[] CRPYT_KEY_BYTE = {33, 34, 35, 36, 37, 38, 39, 40, 41, 32, 38, 37, 33, 35, 34, 33};
    private static int MAX_CLIENT_SAVE_LENGTH = 10000;
    protected static final Object sAppLock = new Object();
    protected Set<T> mAppDatas = new HashSet();
    protected Context mContext;
    private v mSharePreferenceManager;

    /* access modifiers changed from: protected */
    public abstract String generateStrByType();

    /* access modifiers changed from: protected */
    public abstract Set<T> parseAppStr(String str);

    /* access modifiers changed from: protected */
    public abstract String toAppStr(Set<T> set);

    /* access modifiers changed from: protected */
    public void clearData() {
        synchronized (sAppLock) {
            this.mAppDatas.clear();
            this.mSharePreferenceManager.c(generateStrByType());
        }
    }

    public boolean isEmpty() {
        if (this.mAppDatas == null || this.mAppDatas.size() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void loadData() {
        synchronized (sAppLock) {
            g.a(generateStrByType());
            this.mAppDatas.clear();
            String a2 = this.mSharePreferenceManager.a(generateStrByType());
            if (TextUtils.isEmpty(a2)) {
                o.d("IAppManager", "AppManager init strApps empty.");
            } else if (a2.length() > MAX_CLIENT_SAVE_LENGTH) {
                o.d("IAppManager", "sync  strApps lenght too large");
                clearData();
            } else {
                try {
                    String str = new String(f.a(f.a(CRPYT_IV_BYTE), f.a(CRPYT_KEY_BYTE), Base64.decode(a2, 2)), "utf-8");
                    o.d("IAppManager", "AppManager init strApps : ".concat(String.valueOf(str)));
                    Set parseAppStr = parseAppStr(str);
                    if (parseAppStr != null) {
                        this.mAppDatas.addAll(parseAppStr);
                    }
                } catch (Exception e2) {
                    clearData();
                    o.d("IAppManager", o.a((Throwable) e2));
                }
            }
        }
    }

    public c(Context context) {
        this.mContext = context.getApplicationContext();
        this.mSharePreferenceManager = v.b();
        this.mSharePreferenceManager.a(this.mContext);
        loadData();
    }

    /* access modifiers changed from: protected */
    public void addData(T t) {
        synchronized (sAppLock) {
            Iterator<T> it2 = this.mAppDatas.iterator();
            while (it2.hasNext()) {
                if (t.equals(it2.next())) {
                    it2.remove();
                }
            }
            this.mAppDatas.add(t);
            updateDataToSP(this.mAppDatas);
        }
    }

    /* access modifiers changed from: protected */
    public void addDatas(Set<T> set) {
        if (set != null) {
            synchronized (sAppLock) {
                Iterator<T> it2 = this.mAppDatas.iterator();
                while (it2.hasNext()) {
                    if (set.contains(it2.next())) {
                        it2.remove();
                    }
                }
                this.mAppDatas.addAll(set);
                updateDataToSP(this.mAppDatas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void removeData(T t) {
        synchronized (sAppLock) {
            boolean z = false;
            Iterator<T> it2 = this.mAppDatas.iterator();
            while (it2.hasNext()) {
                if (t.equals(it2.next())) {
                    it2.remove();
                    z = true;
                }
            }
            if (z) {
                updateDataToSP(this.mAppDatas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void removeDatas(Set<T> set) {
        synchronized (sAppLock) {
            Iterator<T> it2 = this.mAppDatas.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                if (set.contains(it2.next())) {
                    it2.remove();
                    z = true;
                }
            }
            if (z) {
                updateDataToSP(this.mAppDatas);
            }
        }
    }

    public String updateDataToSP(Set<T> set) {
        String appStr = toAppStr(set);
        try {
            String a2 = f.a(CRPYT_IV_BYTE);
            String a3 = f.a(CRPYT_KEY_BYTE);
            byte[] bytes = appStr.getBytes("utf-8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(a3.getBytes("utf-8"), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(a2.getBytes("utf-8")));
            String encodeToString = Base64.encodeToString(instance.doFinal(bytes), 2);
            if (TextUtils.isEmpty(encodeToString) || encodeToString.length() <= MAX_CLIENT_SAVE_LENGTH) {
                o.d("IAppManager", "sync  strApps: ".concat(String.valueOf(encodeToString)));
                this.mSharePreferenceManager.a(generateStrByType(), encodeToString);
                return appStr;
            }
            o.d("IAppManager", "sync  strApps lenght too large");
            clearData();
            return null;
        } catch (Exception e2) {
            o.d("IAppManager", o.a((Throwable) e2));
            clearData();
            return null;
        }
    }
}
