package org.aspectj.a.a;

import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Modifier;
import org.aspectj.lang.a.c;

public final class e extends a implements c {

    /* renamed from: d  reason: collision with root package name */
    Class f84053d;

    /* access modifiers changed from: protected */
    public final String a(h hVar) {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f84056e == -1) {
            this.f84056e = Integer.parseInt(a(0), 16);
        }
        int i = this.f84056e;
        if (!hVar.f84065d) {
            str = "";
        } else {
            String modifier = Modifier.toString(i);
            if (modifier.length() == 0) {
                str = "";
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(modifier);
                stringBuffer2.append(" ");
                str = stringBuffer2.toString();
            }
        }
        stringBuffer.append(str);
        if (hVar.f84063b) {
            if (this.f84053d == null) {
                this.f84053d = b(6);
            }
            stringBuffer.append(hVar.a(this.f84053d));
        }
        if (hVar.f84063b) {
            stringBuffer.append(" ");
        }
        Class c2 = c();
        if (this.g == null) {
            this.g = c().getName();
        }
        stringBuffer.append(hVar.a(c2, this.g, hVar.f84066e));
        stringBuffer.append(ClassUtils.PACKAGE_SEPARATOR);
        if (this.f84057f == null) {
            this.f84057f = a(1);
        }
        stringBuffer.append(this.f84057f);
        Class[] a2 = a();
        if (a2 != null) {
            if (hVar.f84063b) {
                stringBuffer.append("(");
                hVar.a(stringBuffer, a2);
                stringBuffer.append(")");
            } else if (a2.length == 0) {
                stringBuffer.append("()");
            } else {
                stringBuffer.append("(..)");
            }
        }
        Class[] b2 = b();
        if (!(!hVar.f84064c || b2 == null || b2.length == 0)) {
            stringBuffer.append(" throws ");
            hVar.a(stringBuffer, b2);
        }
        return stringBuffer.toString();
    }

    e(int i, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i, str, cls, clsArr, strArr, clsArr2);
        this.f84053d = cls2;
    }
}
