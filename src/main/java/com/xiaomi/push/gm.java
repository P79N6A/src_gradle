package com.xiaomi.push;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class gm {

    /* renamed from: a  reason: collision with root package name */
    private XmlPullParser f82113a;

    gm() {
        try {
            this.f82113a = XmlPullParserFactory.newInstance().newPullParser();
            this.f82113a.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        } catch (XmlPullParserException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public hh a(byte[] bArr, gq gqVar) {
        String name;
        String str;
        this.f82113a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
        this.f82113a.next();
        int eventType = this.f82113a.getEventType();
        String name2 = this.f82113a.getName();
        if (eventType == 2) {
            if (name2.equals("message")) {
                return hp.a(this.f82113a);
            }
            if (name2.equals("iq")) {
                return hp.a(this.f82113a, gqVar);
            }
            if (name2.equals("presence")) {
                return hp.a(this.f82113a);
            }
            if (!this.f82113a.getName().equals("stream")) {
                if (!this.f82113a.getName().equals("error")) {
                    if (this.f82113a.getName().equals("warning")) {
                        this.f82113a.next();
                        name = this.f82113a.getName();
                        str = "multi-login";
                    } else {
                        name = this.f82113a.getName();
                        str = "bind";
                    }
                    boolean equals = name.equals(str);
                } else {
                    throw new hb(hp.a(this.f82113a));
                }
            }
        }
        return null;
    }
}
