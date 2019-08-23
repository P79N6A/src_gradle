package com.ss.android.j;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f29274a;

    /* renamed from: b  reason: collision with root package name */
    public String f29275b;

    /* renamed from: c  reason: collision with root package name */
    public int f29276c;

    /* renamed from: d  reason: collision with root package name */
    public String f29277d;

    /* renamed from: e  reason: collision with root package name */
    public AssetManager f29278e;

    /* renamed from: f  reason: collision with root package name */
    private Resources f29279f;

    public static class a extends Exception {
        private static final long serialVersionUID = -1169146753281314803L;

        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    public final void b() {
        this.f29278e.close();
    }

    public final Resources a() {
        if (this.f29279f == null) {
            synchronized (this) {
                if (this.f29279f == null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    displayMetrics.setToDefaults();
                    this.f29279f = new Resources(this.f29278e, displayMetrics, null);
                }
            }
        }
        return this.f29279f;
    }

    public c(File file) throws a {
        String absolutePath = file.getAbsolutePath();
        try {
            this.f29278e = new AssetManager();
            int addAssetPath = this.f29278e.addAssetPath(absolutePath);
            if (addAssetPath != 0) {
                try {
                    XmlResourceParser openXmlResourceParser = this.f29278e.openXmlResourceParser(addAssetPath, "AndroidManifest.xml");
                    a(openXmlResourceParser);
                    this.f29274a = absolutePath;
                    this.f29275b = a(openXmlResourceParser, null, "package");
                    String a2 = a(openXmlResourceParser, "http://schemas.android.com/apk/res/android", "versionCode");
                    if (!TextUtils.isEmpty(a2) && TextUtils.isDigitsOnly(a2)) {
                        this.f29276c = Integer.parseInt(a2);
                    }
                    this.f29277d = a(openXmlResourceParser, "http://schemas.android.com/apk/res/android", "versionName");
                    openXmlResourceParser.close();
                } catch (IOException e2) {
                    throw new a((Throwable) e2);
                }
            } else {
                throw new a("cannot add " + absolutePath + " to asset manager.");
            }
        } finally {
            a aVar = new a(e2);
        }
    }

    private static void a(XmlPullParser xmlPullParser) throws a {
        int next;
        do {
            try {
                next = xmlPullParser.next();
                if (next == 1) {
                    throw new a("No start tag found");
                }
            } catch (XmlPullParserException e2) {
                throw new a((Throwable) e2);
            } catch (IOException e3) {
                throw new a((Throwable) e3);
            }
        } while (next != 2);
    }

    private static String a(XmlPullParser xmlPullParser, String str, String str2) throws a {
        if ("manifest".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(str, str2);
            if (attributeValue == null || attributeValue.length() == 0) {
                return "";
            }
            return attributeValue.intern();
        }
        throw new a("No <manifest> tag");
    }
}
