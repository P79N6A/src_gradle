package com.xiaomi.push;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hf;
import com.xiaomi.push.hj;
import com.xiaomi.push.hl;
import com.xiaomi.push.service.al;
import com.xiaomi.push.service.au;
import com.xiaomi.push.service.e;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class hp {

    /* renamed from: a  reason: collision with root package name */
    private static XmlPullParser f82196a;

    public static he a(String str, String str2, XmlPullParser xmlPullParser) {
        Object a2 = ho.a().a("all", "xm:chat");
        if (a2 == null || !(a2 instanceof e)) {
            return null;
        }
        return ((e) a2).b(xmlPullParser);
    }

    public static hf a(XmlPullParser xmlPullParser, gq gqVar) {
        String attributeValue = xmlPullParser.getAttributeValue("", "id");
        String attributeValue2 = xmlPullParser.getAttributeValue("", "to");
        String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
        String attributeValue4 = xmlPullParser.getAttributeValue("", "chid");
        hf.a a2 = hf.a.a(xmlPullParser.getAttributeValue("", "type"));
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            hashMap.put(attributeName, xmlPullParser.getAttributeValue("", attributeName));
        }
        hr hrVar = null;
        hf hfVar = null;
        hl hlVar = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("error")) {
                    hlVar = a(xmlPullParser);
                } else {
                    hfVar = new hf();
                    hfVar.a(a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("iq")) {
                z = true;
            }
        }
        if (hfVar != null) {
            hrVar = hfVar;
        } else if (hf.a.f82153a == a2 || hf.a.f82154b == a2) {
            hq hqVar = new hq();
            hqVar.k(attributeValue);
            hqVar.m(attributeValue3);
            hqVar.n(attributeValue2);
            hqVar.a(hf.a.f82156d);
            hqVar.l(attributeValue4);
            hqVar.a(new hl(hl.a.f82192e));
            gqVar.a((hh) hqVar);
            b.d("iq usage error. send packet in packet parser.");
            return hrVar;
        } else {
            hrVar = new hr();
        }
        hrVar.k(attributeValue);
        hrVar.m(attributeValue2);
        hrVar.l(attributeValue4);
        hrVar.n(attributeValue3);
        hrVar.a(a2);
        hrVar.a(hlVar);
        hrVar.a((Map<String, String>) hashMap);
        return hrVar;
    }

    public static hh a(XmlPullParser xmlPullParser) {
        String str;
        boolean z = false;
        String str2 = null;
        if (PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(xmlPullParser.getAttributeValue("", NotifyType.SOUND))) {
            String attributeValue = xmlPullParser.getAttributeValue("", "chid");
            String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
            String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
            String attributeValue4 = xmlPullParser.getAttributeValue("", "to");
            String attributeValue5 = xmlPullParser.getAttributeValue("", "type");
            al.b a2 = al.a().a(attributeValue, attributeValue4);
            if (a2 == null) {
                a2 = al.a().a(attributeValue, attributeValue3);
            }
            if (a2 != null) {
                hh hhVar = null;
                while (!z) {
                    int next = xmlPullParser.next();
                    if (next == 2) {
                        if (!NotifyType.SOUND.equals(xmlPullParser.getName())) {
                            throw new hb("error while receiving a encrypted message with wrong format");
                        } else if (xmlPullParser.next() == 4) {
                            String text = xmlPullParser.getText();
                            if ("5".equals(attributeValue) || "6".equals(attributeValue)) {
                                hg hgVar = new hg();
                                hgVar.l(attributeValue);
                                hgVar.b(true);
                                hgVar.n(attributeValue3);
                                hgVar.m(attributeValue4);
                                hgVar.k(attributeValue2);
                                hgVar.f(attributeValue5);
                                he heVar = new he(NotifyType.SOUND, null, null, null);
                                heVar.a(text);
                                hgVar.a(heVar);
                                return hgVar;
                            }
                            a(au.a(au.a(a2.h, attributeValue2), text));
                            f82196a.next();
                            hhVar = a(f82196a);
                        } else {
                            throw new hb("error while receiving a encrypted message with wrong format");
                        }
                    } else if (next == 3 && xmlPullParser.getName().equals("message")) {
                        z = true;
                    }
                }
                if (hhVar != null) {
                    return hhVar;
                }
                throw new hb("error while receiving a encrypted message with wrong format");
            }
            throw new hb("the channel id is wrong while receiving a encrypted message");
        }
        hg hgVar2 = new hg();
        String attributeValue6 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue6 == null) {
            attributeValue6 = "ID_NOT_AVAILABLE";
        }
        hgVar2.k(attributeValue6);
        hgVar2.m(xmlPullParser.getAttributeValue("", "to"));
        hgVar2.n(xmlPullParser.getAttributeValue("", "from"));
        hgVar2.l(xmlPullParser.getAttributeValue("", "chid"));
        hgVar2.a(xmlPullParser.getAttributeValue("", "appid"));
        try {
            str = xmlPullParser.getAttributeValue("", "transient");
        } catch (Exception unused) {
            str = null;
        }
        try {
            String attributeValue7 = xmlPullParser.getAttributeValue("", "seq");
            if (!TextUtils.isEmpty(attributeValue7)) {
                hgVar2.b(attributeValue7);
            }
        } catch (Exception unused2) {
        }
        try {
            String attributeValue8 = xmlPullParser.getAttributeValue("", "mseq");
            if (!TextUtils.isEmpty(attributeValue8)) {
                hgVar2.c(attributeValue8);
            }
        } catch (Exception unused3) {
        }
        try {
            String attributeValue9 = xmlPullParser.getAttributeValue("", "fseq");
            if (!TextUtils.isEmpty(attributeValue9)) {
                hgVar2.d(attributeValue9);
            }
        } catch (Exception unused4) {
        }
        try {
            String attributeValue10 = xmlPullParser.getAttributeValue("", "status");
            if (!TextUtils.isEmpty(attributeValue10)) {
                hgVar2.e(attributeValue10);
            }
        } catch (Exception unused5) {
        }
        hgVar2.a(!TextUtils.isEmpty(str) && str.equalsIgnoreCase("true"));
        hgVar2.f(xmlPullParser.getAttributeValue("", "type"));
        String b2 = b(xmlPullParser);
        if (b2 == null || "".equals(b2.trim())) {
            hh.q();
        } else {
            hgVar2.j(b2);
        }
        while (!z) {
            int next2 = xmlPullParser.next();
            if (next2 == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (TextUtils.isEmpty(namespace)) {
                    namespace = "xm";
                }
                if (name.equals("subject")) {
                    b(xmlPullParser);
                    hgVar2.g(a(xmlPullParser));
                } else if (name.equals("body")) {
                    String attributeValue11 = xmlPullParser.getAttributeValue("", "encode");
                    String a3 = a(xmlPullParser);
                    if (!TextUtils.isEmpty(attributeValue11)) {
                        hgVar2.a(a3, attributeValue11);
                    } else {
                        hgVar2.h(a3);
                    }
                } else if (name.equals("thread")) {
                    if (str2 == null) {
                        str2 = xmlPullParser.nextText();
                    }
                } else if (name.equals("error")) {
                    hgVar2.a(a(xmlPullParser));
                } else {
                    hgVar2.a(a(name, namespace, xmlPullParser));
                }
            } else if (next2 == 3 && xmlPullParser.getName().equals("message")) {
                z = true;
            }
        }
        hgVar2.i(str2);
        return hgVar2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static hj m375a(XmlPullParser xmlPullParser) {
        hj.b bVar = hj.b.available;
        String attributeValue = xmlPullParser.getAttributeValue("", "type");
        if (attributeValue != null && !attributeValue.equals("")) {
            try {
                bVar = hj.b.valueOf(attributeValue);
            } catch (IllegalArgumentException unused) {
                PrintStream printStream = System.err;
                printStream.println("Found invalid presence type " + attributeValue);
            }
        }
        hj hjVar = new hj(bVar);
        hjVar.m(xmlPullParser.getAttributeValue("", "to"));
        hjVar.n(xmlPullParser.getAttributeValue("", "from"));
        hjVar.l(xmlPullParser.getAttributeValue("", "chid"));
        String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue2 == null) {
            attributeValue2 = "ID_NOT_AVAILABLE";
        }
        hjVar.k(attributeValue2);
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("status")) {
                    hjVar.a(xmlPullParser.nextText());
                } else if (name.equals("priority")) {
                    try {
                        hjVar.a(Integer.parseInt(xmlPullParser.nextText()));
                    } catch (NumberFormatException unused2) {
                    } catch (IllegalArgumentException unused3) {
                        hjVar.a(0);
                    }
                } else if (name.equals("show")) {
                    String nextText = xmlPullParser.nextText();
                    try {
                        hjVar.a(hj.a.valueOf(nextText));
                    } catch (IllegalArgumentException unused4) {
                        PrintStream printStream2 = System.err;
                        printStream2.println("Found invalid presence mode " + nextText);
                    }
                } else if (name.equals("error")) {
                    hjVar.a(a(xmlPullParser));
                } else {
                    hjVar.a(a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("presence")) {
                z = true;
            }
        }
        return hjVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static hk m376a(XmlPullParser xmlPullParser) {
        hk hkVar = null;
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                hkVar = new hk(xmlPullParser.getName());
            } else if (next == 3 && xmlPullParser.getName().equals("error")) {
                z = true;
            }
        }
        return hkVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static hl m377a(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        String str = "-1";
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals("code")) {
                str = xmlPullParser.getAttributeValue("", "code");
            }
            if (xmlPullParser.getAttributeName(i).equals("type")) {
                str2 = xmlPullParser.getAttributeValue("", "type");
            }
            if (xmlPullParser.getAttributeName(i).equals("reason")) {
                str3 = xmlPullParser.getAttributeValue("", "reason");
            }
        }
        String str4 = null;
        String str5 = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("text")) {
                    str5 = xmlPullParser.nextText();
                } else {
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    if ("urn:ietf:params:xml:ns:xmpp-stanzas".equals(namespace)) {
                        str4 = name;
                    } else {
                        arrayList.add(a(name, namespace, xmlPullParser));
                    }
                }
            } else if (next == 3) {
                if (xmlPullParser.getName().equals("error")) {
                    z = true;
                }
            } else if (next == 4) {
                str5 = xmlPullParser.getText();
            }
        }
        hl hlVar = new hl(Integer.parseInt(str), str2 == null ? "cancel" : str2, str3, str4, str5, arrayList);
        return hlVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static String m378a(XmlPullParser xmlPullParser) {
        String str = "";
        int depth = xmlPullParser.getDepth();
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getDepth() == depth) {
                return str;
            }
            str = str + xmlPullParser.getText();
        }
    }

    private static void a(byte[] bArr) {
        if (f82196a == null) {
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                f82196a = newPullParser;
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            } catch (XmlPullParserException unused) {
            }
        }
        f82196a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
    }

    private static String b(XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            if ("xml:lang".equals(attributeName) || ("lang".equals(attributeName) && "xml".equals(xmlPullParser.getAttributePrefix(i)))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
