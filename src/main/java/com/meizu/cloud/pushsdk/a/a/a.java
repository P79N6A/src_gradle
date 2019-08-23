package com.meizu.cloud.pushsdk.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.q.c;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f26831b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f26832c = new Object();

    /* renamed from: a  reason: collision with root package name */
    String f26833a = "88&*5a9*4&a122ek";

    /* renamed from: d  reason: collision with root package name */
    private byte[] f26834d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f26835e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f26836f;
    private byte[] g;
    private byte[] h;
    private PublicKey i;
    private SharedPreferences j;
    private SharedPreferences k;
    private long l;
    private Context m;

    private a(Context context) {
        this.m = context;
        this.j = c.a(context, "com.x.y.1", 0);
        this.k = c.a(context, "com.x.y.2", 0);
        Integer.parseInt(this.j.getString("keyTimeout", PushConstants.PUSH_TYPE_NOTIFY));
        this.j.getLong("createDate", 0);
        e();
        if (this.f26834d == null || (this.f26834d != null && this.f26834d.length == 0)) {
            this.i = b(this.m);
            if (this.i != null) {
                f();
                return;
            }
            this.j.edit().clear().apply();
            try {
                d();
                this.i = b(this.m);
                if (this.i != null) {
                    f();
                }
            } catch (IOException unused) {
            }
            return;
        }
        if (this.f26835e == null || (this.f26835e != null && this.f26835e.length == 0)) {
            this.i = b(this.m);
            if (this.i != null) {
                h();
            }
        }
    }

    public static a a() {
        if (f26831b != null) {
            return f26831b;
        }
        throw new IllegalStateException("KeyMgr is not initialised - invoke at least once with parameterised init/get");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.io.InputStream r4) {
        /*
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
        L_0x0005:
            int r1 = r4.read()     // Catch:{ IOException -> 0x001d, all -> 0x0018 }
            r2 = -1
            if (r1 == r2) goto L_0x0010
            r0.write(r1)     // Catch:{ IOException -> 0x001d, all -> 0x0018 }
            goto L_0x0005
        L_0x0010:
            java.lang.String r4 = r0.toString()     // Catch:{ IOException -> 0x001d, all -> 0x0018 }
            r0.close()     // Catch:{ IOException -> 0x0021 }
            goto L_0x0021
        L_0x0018:
            r4 = move-exception
            r0.close()     // Catch:{ IOException -> 0x001c }
        L_0x001c:
            throw r4
        L_0x001d:
            r0.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            r4 = 0
        L_0x0021:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.a.a.a.a(java.io.InputStream):java.lang.String");
    }

    public static void a(Context context) {
        if (f26831b == null) {
            synchronized (f26832c) {
                if (f26831b == null) {
                    f26831b = new a(context);
                }
            }
        }
    }

    private PublicKey b(Context context) {
        b("load publicKey from preference");
        String string = this.k.getString("publicKey", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
            }
        }
        return null;
    }

    private void b(String str) {
        DebugLogger.d("HttpKeyMgr", str);
    }

    private void c(String str) {
        DebugLogger.e("HttpKeyMgr", str);
    }

    private void d() throws IOException {
        InputStream inputStream;
        Throwable th;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://norma-external-collect.meizu.com/android/exchange/getpublickey.do").openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            try {
                httpURLConnection.setRequestMethod("GET");
            } catch (ProtocolException unused) {
            }
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            try {
                int responseCode = httpURLConnection.getResponseCode();
                b("code = " + responseCode);
                inputStream = httpURLConnection.getInputStream();
                if (inputStream != null) {
                    try {
                        String a2 = a(inputStream);
                        b("body = " + a2);
                        if (!TextUtils.isEmpty(a2)) {
                            JSONObject jSONObject = new JSONObject(a2);
                            if (jSONObject.getInt("code") == 200) {
                                String string = jSONObject.getString("value");
                                SharedPreferences.Editor edit = this.k.edit();
                                edit.putString("publicKey", string);
                                edit.apply();
                            }
                        }
                    } catch (Exception e2) {
                        c("downloadPublicKey message error " + e2.getMessage());
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                inputStream = null;
                th = th4;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (MalformedURLException unused4) {
        }
    }

    private void e() {
        b("loadKeys");
        String string = this.j.getString("sKey64", "");
        b("saved sKey64: " + string);
        if (!TextUtils.isEmpty(string)) {
            this.h = string.getBytes();
        }
        String string2 = this.j.getString("aKey64", "");
        b("saved aKey64: " + string2);
        if (!TextUtils.isEmpty(string2)) {
            this.g = string2.getBytes();
            this.f26835e = Base64.decode(this.g, 2);
        }
        String string3 = this.j.getString("rKey64", "");
        b("saved rKey64: " + string3);
        if (!TextUtils.isEmpty(string3)) {
            this.f26836f = string3.getBytes();
            this.f26834d = Base64.decode(this.f26836f, 2);
            b("saved rKey: " + new String(this.f26834d));
        }
    }

    private void f() {
        g();
        h();
    }

    private void g() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(SearchJediMixFeedAdapter.f42517f);
            this.f26834d = instance.generateKey().getEncoded();
            this.f26836f = Base64.encode(this.f26834d, 2);
            b("***** rKey64: " + new String(this.f26836f));
            SharedPreferences.Editor edit = this.j.edit();
            edit.putString("rKey64", new String(this.f26836f));
            edit.apply();
        } catch (Exception unused) {
        }
    }

    private void h() {
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, this.i);
            this.f26835e = instance.doFinal(this.f26834d);
            this.g = Base64.encode(this.f26835e, 2);
            b("***** aKey64: " + new String(this.g));
            SharedPreferences.Editor edit = this.j.edit();
            edit.putString("aKey64", new String(this.g));
            edit.apply();
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
        }
    }

    public void a(String str) {
        this.h = str.getBytes();
        SharedPreferences.Editor edit = this.j.edit();
        edit.putString("sKey64", new String(this.h));
        edit.apply();
    }

    public byte[] a(byte[] bArr) {
        String str;
        if (this.f26834d == null || (this.f26834d != null && this.f26834d.length == 0)) {
            str = "rKey null!";
        } else if (bArr == null || (bArr != null && bArr.length == 0)) {
            str = "input null!";
        } else {
            b(">>>>>>>>>> encrypt input >>>>>>>>>>\n" + new String(Base64.encode(bArr, 2)));
            b("<<<<<<<<<< encrypt input <<<<<<<<<<");
            try {
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(1, new SecretKeySpec(this.f26834d, "AES"), new IvParameterSpec(this.f26834d));
                byte[] doFinal = instance.doFinal(bArr);
                b(">>>>>>>>>> encrypt output >>>>>>>>>>\n" + new String(Base64.encode(doFinal, 2)));
                b("<<<<<<<<<< encrypt output <<<<<<<<<<");
                return doFinal;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
                return null;
            }
        }
        c(str);
        return null;
    }

    public byte[] b() {
        return this.g;
    }

    public byte[] c() {
        return this.h;
    }
}
