package com.bytedance.crash.upload;

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

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final String f19571a = ("AAA" + System.currentTimeMillis() + "AAA");

    /* renamed from: b  reason: collision with root package name */
    private HttpURLConnection f19572b;

    /* renamed from: c  reason: collision with root package name */
    private String f19573c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f19574d;

    /* renamed from: e  reason: collision with root package name */
    private DataOutputStream f19575e;

    /* renamed from: f  reason: collision with root package name */
    private GZIPOutputStream f19576f;

    public final String a() throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        byte[] bytes = ("\r\n--" + this.f19571a + "--\r\n").getBytes();
        if (this.f19574d) {
            this.f19576f.write(bytes);
            this.f19576f.finish();
            this.f19576f.close();
        } else {
            this.f19575e.write(bytes);
            this.f19575e.flush();
            this.f19575e.close();
        }
        int responseCode = this.f19572b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f19572b.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f19572b.disconnect();
            StringBuilder sb = new StringBuilder();
            for (String append : arrayList) {
                sb.append(append);
            }
            return sb.toString();
        }
        throw new IOException("Server returned non-OK status: " + responseCode);
    }

    public final void a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f19571a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"\r\n");
        sb.append("Content-Type: text/plain; charset=");
        sb.append(this.f19573c);
        sb.append("\r\n\r\n");
        sb.append(str2);
        sb.append("\r\n");
        try {
            if (this.f19574d) {
                this.f19576f.write(sb.toString().getBytes());
            } else {
                this.f19575e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
    }

    public final void a(String str, File file) throws IOException {
        String name = file.getName();
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f19571a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(name);
        sb.append("\"\r\n");
        sb.append("Content-Transfer-Encoding: binary\r\n");
        sb.append("\r\n");
        if (this.f19574d) {
            this.f19576f.write(sb.toString().getBytes());
        } else {
            this.f19575e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f19574d) {
                this.f19576f.write(bArr, 0, read);
            } else {
                this.f19575e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f19574d) {
            this.f19576f.write("\r\n".getBytes());
            return;
        }
        this.f19575e.write(sb.toString().getBytes());
        this.f19575e.flush();
    }

    f(String str, String str2, boolean z) throws IOException {
        this.f19573c = str2;
        this.f19574d = z;
        this.f19572b = (HttpURLConnection) new URL(str).openConnection();
        this.f19572b.setUseCaches(false);
        this.f19572b.setDoOutput(true);
        this.f19572b.setDoInput(true);
        this.f19572b.setRequestMethod("POST");
        HttpURLConnection httpURLConnection = this.f19572b;
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + this.f19571a);
        if (z) {
            this.f19572b.setRequestProperty("Content-Encoding", "gzip");
            this.f19576f = new GZIPOutputStream(this.f19572b.getOutputStream());
            return;
        }
        this.f19575e = new DataOutputStream(this.f19572b.getOutputStream());
    }

    public final void a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f19571a);
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
        if (this.f19574d) {
            this.f19576f.write(sb.toString().getBytes());
        } else {
            this.f19575e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f19574d) {
                this.f19576f.write(bArr, 0, read);
            } else {
                this.f19575e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f19574d) {
            this.f19576f.write("\r\n".getBytes());
            return;
        }
        this.f19575e.write("\r\n".getBytes());
        this.f19575e.flush();
    }
}
