package com.bytedance.apm.a.b;

import android.support.annotation.Nullable;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f18877a = ("AAA" + System.currentTimeMillis() + "AAA");

    /* renamed from: b  reason: collision with root package name */
    private HttpURLConnection f18878b;

    /* renamed from: c  reason: collision with root package name */
    private String f18879c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18880d = false;

    /* renamed from: e  reason: collision with root package name */
    private DataOutputStream f18881e;

    /* renamed from: f  reason: collision with root package name */
    private GZIPOutputStream f18882f;

    public final String a() throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        byte[] bytes = ("\r\n--" + this.f18877a + "--\r\n").getBytes();
        if (this.f18880d) {
            this.f18882f.write(bytes);
            this.f18882f.finish();
            this.f18882f.close();
        } else {
            this.f18881e.write(bytes);
            this.f18881e.flush();
            this.f18881e.close();
        }
        int responseCode = this.f18878b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f18878b.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f18878b.disconnect();
            StringBuilder sb = new StringBuilder();
            for (String append : arrayList) {
                sb.append(append);
            }
            return sb.toString();
        }
        throw new IOException("Server returned non-OK status: " + responseCode);
    }

    public final void a(@Nullable JSONObject jSONObject) throws IOException {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f18877a);
        sb.append("\r\nContent-Disposition: form-data; name=\"params.txt\"; filetype=\"common_params\"; logtype=\"env\"; filename=\"params.txt\"\r\n");
        sb.append("Content-Type: text/plain\r\n");
        sb.append("\r\n");
        if (this.f18880d) {
            this.f18882f.write(sb.toString().getBytes());
        } else {
            this.f18881e.write(sb.toString().getBytes());
        }
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("defaultData", "none commonParams");
            } catch (JSONException unused) {
            }
            str = jSONObject2.toString();
        }
        if (this.f18880d) {
            this.f18882f.write(str.getBytes());
        } else {
            this.f18881e.write(str.getBytes());
        }
        if (this.f18880d) {
            this.f18882f.write("\r\n".getBytes());
            return;
        }
        this.f18881e.write("\r\n".getBytes());
        this.f18881e.flush();
    }

    public final void a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f18877a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"\r\n");
        sb.append("Content-Type: text/plain; charset=");
        sb.append(this.f18879c);
        sb.append("\r\n\r\n");
        sb.append(str2);
        sb.append("\r\n");
        try {
            if (this.f18880d) {
                this.f18882f.write(sb.toString().getBytes());
            } else {
                this.f18881e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
    }

    public b(String str, String str2, boolean z) throws IOException {
        this.f18879c = str2;
        this.f18878b = (HttpURLConnection) new URL(str).openConnection();
        this.f18878b.setUseCaches(false);
        this.f18878b.setDoOutput(true);
        this.f18878b.setDoInput(true);
        this.f18878b.setRequestMethod("POST");
        HttpURLConnection httpURLConnection = this.f18878b;
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + this.f18877a);
        this.f18881e = new DataOutputStream(this.f18878b.getOutputStream());
    }

    public final void a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f18877a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Map.Entry next : map.entrySet()) {
            sb.append("; ");
            sb.append((String) next.getKey());
            sb.append("=\"");
            sb.append((String) next.getValue());
            sb.append("\"");
        }
        sb.append("\r\nContent-Transfer-Encoding: binary");
        sb.append("\r\n\r\n");
        if (this.f18880d) {
            this.f18882f.write(sb.toString().getBytes());
        } else {
            this.f18881e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f18880d) {
                this.f18882f.write(bArr, 0, read);
            } else {
                this.f18881e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f18880d) {
            this.f18882f.write("\r\n".getBytes());
            return;
        }
        this.f18881e.write("\r\n".getBytes());
        this.f18881e.flush();
    }
}
