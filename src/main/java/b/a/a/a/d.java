package b.a.a.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.core.encrypt.TTEncryptUtils;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static b f1615a;

    public enum a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        private a(int i) {
            this.nativeInt = i;
        }
    }

    public interface b {
        String a();
    }

    public enum c {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        final int nativeInt;

        public final int getValue() {
            return this.nativeInt;
        }

        private c(int i) {
            this.nativeInt = i;
        }
    }

    private static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static c a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return c.WIFI;
                    }
                    if (type != 0) {
                        return c.MOBILE;
                    }
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                        case 14:
                        case 15:
                            return c.MOBILE_3G;
                        case 13:
                            return c.MOBILE_4G;
                        default:
                            return c.MOBILE;
                    }
                }
            }
            return c.NONE;
        } catch (Throwable unused) {
            return c.MOBILE;
        }
    }

    public static byte[] a(String str, byte[] bArr, a aVar, String str2, boolean z) throws Throwable {
        String str3;
        byte[] bArr2;
        String str4;
        String str5 = null;
        if (str == null) {
            return null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (a.GZIP == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                str5 = "gzip";
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        } else if (a.DEFLATER == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr3 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr3, 0, deflater.deflate(bArr3));
            }
            deflater.end();
            bArr = byteArrayOutputStream2.toByteArray();
            str5 = "deflate";
        }
        byte[] bArr4 = bArr;
        String str6 = str5;
        if (!z) {
            return a(str, bArr4, str2, str6, "POST", true, false);
        }
        byte[] a2 = TTEncryptUtils.a(bArr4, bArr4.length);
        if (a2 != null) {
            str4 = str + "&tt_data=a";
            bArr2 = a2;
            str3 = "application/octet-stream;tt-data=a";
        } else {
            str4 = str;
            str3 = str2;
            bArr2 = bArr4;
        }
        return a(str4, bArr2, str3, str6, "POST", true, true);
    }

    public static byte[] a(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2) throws Throwable {
        URL url;
        byte[] bArr2;
        if (f1615a != null) {
            str = f1615a.a();
        }
        LinkedList<Pair> linkedList = new LinkedList<>();
        if (z2) {
            url = new URL(com.bytedance.frameworks.core.encrypt.a.a(str, (List<Pair<String, String>>) linkedList));
        } else {
            url = new URL(str);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        if (z2 && !linkedList.isEmpty()) {
            for (Pair pair : linkedList) {
                if (pair != null) {
                    httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
                }
            }
        }
        if (z) {
            httpURLConnection.setDoOutput(true);
        } else {
            httpURLConnection.setDoOutput(false);
        }
        if (str2 != null) {
            httpURLConnection.setRequestProperty("Content-Type", str2);
        }
        if (str3 != null) {
            httpURLConnection.setRequestProperty("Content-Encoding", str3);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnection.setRequestMethod(str4);
        if (bArr != null && bArr.length > 0) {
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
            dataOutputStream.close();
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            String contentEncoding = httpURLConnection.getContentEncoding();
            if (TextUtils.isEmpty(contentEncoding) || !contentEncoding.equalsIgnoreCase("gzip")) {
                bArr2 = a(inputStream);
            } else {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
                bArr2 = a((InputStream) gZIPInputStream);
                gZIPInputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            return bArr2;
        }
        throw new b(responseCode, httpURLConnection.getResponseMessage());
    }
}
