package com.ss.android.j;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.text.TextUtils;
import com.ss.android.j.c;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f29282a = Environment.getRootDirectory().getAbsolutePath();

    /* renamed from: b  reason: collision with root package name */
    private static final String f29283b = Environment.getDataDirectory().getAbsolutePath();

    /* renamed from: c  reason: collision with root package name */
    private static String f29284c = "meta_umeng_channel";

    /* renamed from: d  reason: collision with root package name */
    private static String f29285d = "ss.properties";

    /* renamed from: e  reason: collision with root package name */
    private static String f29286e = "com.ss.android.article.news";

    /* renamed from: f  reason: collision with root package name */
    private static int f29287f = 470;
    private static int g = 636;
    private static final List<File> h = Arrays.asList(new File[]{new File("/system/preload"), new File("/system/delapp"), new File("/data/miui/app"), new File("/cust"), new File("/system/presetapp"), new File("/system/preset_apps"), new File("/system/reserve"), new File("/system/pre-install"), new File("/data/preload"), new File("/system/appbackup"), new File("/system/etc/customization/applications"), new File("/system/etc/property/app"), new File("/apps")});
    private static final List<File> i = Collections.singletonList(new File(f29283b, "gn_apps.zip"));
    private static final List<String> j = Arrays.asList(new String[]{f29282a + "/app", f29282a + "/framework", "/sys", "/proc", "/etc", "/dev", "/res", "/d", "mnt/sdcard", "/sdcard"});

    private static boolean a(File file) {
        try {
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            if (!file.getCanonicalFile().equals(file.getAbsoluteFile())) {
                return true;
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    private static boolean a(String str, Collection<String> collection) {
        if (TextUtils.isEmpty(str) || collection == null) {
            return false;
        }
        for (String next : collection) {
            if (str.equals(next)) {
                return true;
            }
            if (str.startsWith(next + File.separator)) {
                return true;
            }
        }
        return false;
    }

    private static void a(Set<String> set) {
        for (File next : h) {
            if (next.isDirectory() && next.canRead()) {
                set.add(next.getAbsolutePath());
            }
        }
    }

    private static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                zipOutputStream.close();
                return;
            } else if (!nextEntry.isDirectory()) {
                String name = nextEntry.getName();
                if (!"AndroidManifest.xml".equals(name) && !"resources.arsc".equals(name)) {
                    if (!("assets/" + f29285d).equals(name)) {
                        b(zipInputStream, null);
                    }
                }
                zipOutputStream.putNextEntry(nextEntry);
                b(zipInputStream, zipOutputStream);
                zipOutputStream.closeEntry();
            }
        }
    }

    private static String b(c cVar) throws c.a {
        try {
            String a2 = d.a(cVar.f29274a, 1903654775);
            if (TextUtils.isEmpty(a2)) {
                return "";
            }
            return new JSONObject(a2).optString(f29284c, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(Context context) {
        String str;
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            PackageManager packageManager = context.getPackageManager();
            a((Set<String>) linkedHashSet);
            for (ApplicationInfo next : packageManager.getInstalledApplications(0)) {
                File file = new File(next.sourceDir);
                if (next.sourceDir.startsWith(f29282a) && !a(next.sourceDir, (Collection<String>) j) && !a(next.sourceDir, (Collection<String>) linkedHashSet)) {
                    while (!f29282a.equals(file.getParent())) {
                        file = file.getParentFile();
                    }
                    linkedHashSet.add(file.getAbsolutePath());
                }
            }
            a(context, (Set<String>) linkedHashSet);
            c a2 = a(context, (Set<String>) linkedHashSet, (Set<String>) null);
            if (a2 == null) {
                linkedHashSet.addAll(j);
                a2 = a(context, Environment.getRootDirectory().getParentFile(), (Set<String>) linkedHashSet);
            }
            if (a2 == null) {
                return null;
            }
            if (a2 == null) {
                str = null;
            } else if (a2.f29276c < f29287f) {
                str = a2.a().getText(a2.a().getIdentifier(f29284c, "string", a2.f29275b)).toString();
            } else if (a2.f29276c < g) {
                str = a(a2);
            } else {
                str = b(a2);
            }
            a2.b();
            if (context != null) {
                if (context.getFilesDir() != null) {
                    File file2 = new File(context.getFilesDir(), "apks");
                    if (file2.isDirectory()) {
                        file2.delete();
                    }
                }
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String a(c cVar) throws c.a {
        try {
            Properties properties = new Properties();
            InputStream open = cVar.f29278e.open(f29285d);
            properties.load(open);
            open.close();
            return properties.getProperty(f29284c);
        } catch (IOException e2) {
            throw new c.a((Throwable) e2);
        }
    }

    private static void b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read == -1) {
                return;
            }
            if (outputStream != null) {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    private static void a(Context context, Set<String> set) {
        if (context != null && context.getFilesDir() != null) {
            File file = new File(context.getFilesDir(), "apks");
            if (!file.exists()) {
                file.mkdirs();
            } else if (file.isFile()) {
                return;
            }
            for (File next : i) {
                if (next.isFile() && next.getName().endsWith(".zip")) {
                    try {
                        a(file, next);
                    } catch (IOException unused) {
                    }
                }
            }
            set.add(file.getAbsolutePath());
        }
    }

    private static void a(File file, File file2) throws IOException {
        boolean z;
        ZipFile zipFile = new ZipFile(file2);
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                String name = zipEntry.getName();
                if (!zipEntry.isDirectory()) {
                    if (name != null) {
                        if (!name.contains(".." + File.separator)) {
                            z = true;
                            if (z && name.endsWith(".apk")) {
                                a(zipFile.getInputStream(zipEntry), (OutputStream) new FileOutputStream(new File(file, name)));
                            }
                        }
                    }
                    z = false;
                    try {
                        a(zipFile.getInputStream(zipEntry), (OutputStream) new FileOutputStream(new File(file, name)));
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        } finally {
            zipFile.close();
        }
    }

    private static c a(Context context, Set<String> set, Set<String> set2) throws c.a {
        if (context == null || set == null) {
            return null;
        }
        for (String file : set) {
            c a2 = a(context, new File(file), (Set<String>) null);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    private static c a(Context context, File file, Set<String> set) {
        c cVar;
        if (context == null || file == null || a(file.getAbsolutePath(), (Collection<String>) set)) {
            return null;
        }
        if (file.canRead() && file.canWrite() && file.getName() != "apks") {
            return null;
        }
        if (file.isFile() && file.getName().endsWith(".apk") && file.canRead()) {
            try {
                cVar = new c(file);
            } catch (c.a unused) {
                cVar = null;
            }
            if (cVar == null) {
                return null;
            }
            if (f29286e.endsWith(cVar.f29275b)) {
                return cVar;
            }
            cVar.b();
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return null;
            }
            for (File file2 : listFiles) {
                if (file2 == null || !a(file)) {
                    c a2 = a(context, file2, set);
                    if (a2 != null) {
                        return a2;
                    }
                }
            }
        }
        return null;
    }
}
