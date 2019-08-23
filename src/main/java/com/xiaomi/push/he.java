package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class he implements hi {

    /* renamed from: a  reason: collision with root package name */
    private String f82149a;

    /* renamed from: a  reason: collision with other field name */
    private List<he> f481a;

    /* renamed from: a  reason: collision with other field name */
    private String[] f482a;

    /* renamed from: b  reason: collision with root package name */
    private String f82150b;

    /* renamed from: b  reason: collision with other field name */
    private String[] f483b;

    /* renamed from: c  reason: collision with root package name */
    private String f82151c;

    public he(String str, String str2, String[] strArr, String[] strArr2) {
        this.f82149a = str;
        this.f82150b = str2;
        this.f482a = strArr;
        this.f483b = strArr2;
    }

    public he(String str, String str2, String[] strArr, String[] strArr2, String str3, List<he> list) {
        this.f82149a = str;
        this.f82150b = str2;
        this.f482a = strArr;
        this.f483b = strArr2;
        this.f82151c = str3;
        this.f481a = list;
    }

    public static he a(Bundle bundle) {
        ArrayList arrayList;
        String string = bundle.getString("ext_ele_name");
        String string2 = bundle.getString("ext_ns");
        String string3 = bundle.getString("ext_text");
        Bundle bundle2 = bundle.getBundle("attributes");
        Set<String> keySet = bundle2.keySet();
        String[] strArr = new String[keySet.size()];
        String[] strArr2 = new String[keySet.size()];
        int i = 0;
        for (String str : keySet) {
            strArr[i] = str;
            strArr2[i] = bundle2.getString(str);
            i++;
        }
        if (bundle.containsKey("children")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("children");
            ArrayList arrayList2 = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList2.add(a((Bundle) parcelable));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        he heVar = new he(string, string2, strArr, strArr2, string3, arrayList);
        return heVar;
    }

    public static Parcelable[] a(List<he> list) {
        return a((he[]) list.toArray(new he[list.size()]));
    }

    public static Parcelable[] a(he[] heVarArr) {
        if (heVarArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[heVarArr.length];
        for (int i = 0; i < heVarArr.length; i++) {
            parcelableArr[i] = heVarArr[i].a();
        }
        return parcelableArr;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.f82149a);
        bundle.putString("ext_ns", this.f82150b);
        bundle.putString("ext_text", this.f82151c);
        Bundle bundle2 = new Bundle();
        if (this.f482a != null && this.f482a.length > 0) {
            for (int i = 0; i < this.f482a.length; i++) {
                bundle2.putString(this.f482a[i], this.f483b[i]);
            }
        }
        bundle.putBundle("attributes", bundle2);
        if (this.f481a != null && this.f481a.size() > 0) {
            bundle.putParcelableArray("children", a(this.f481a));
        }
        return bundle;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Parcelable m359a() {
        return a();
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m360a() {
        return this.f82149a;
    }

    public String a(String str) {
        if (str != null) {
            if (this.f482a != null) {
                for (int i = 0; i < this.f482a.length; i++) {
                    if (str.equals(this.f482a[i])) {
                        return this.f483b[i];
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m361a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f82151c = hs.a(str);
        } else {
            this.f82151c = str;
        }
    }

    public String b() {
        return this.f82150b;
    }

    public String c() {
        return !TextUtils.isEmpty(this.f82151c) ? hs.b(this.f82151c) : this.f82151c;
    }

    public String d() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(this.f82149a);
        if (!TextUtils.isEmpty(this.f82150b)) {
            sb.append(" xmlns=");
            sb.append("\"");
            sb.append(this.f82150b);
            sb.append("\"");
        }
        if (this.f482a != null && this.f482a.length > 0) {
            for (int i = 0; i < this.f482a.length; i++) {
                if (!TextUtils.isEmpty(this.f483b[i])) {
                    sb.append(" ");
                    sb.append(this.f482a[i]);
                    sb.append("=\"");
                    sb.append(hs.a(this.f483b[i]));
                    sb.append("\"");
                }
            }
        }
        if (!TextUtils.isEmpty(this.f82151c)) {
            sb.append(">");
            sb.append(this.f82151c);
        } else if (this.f481a == null || this.f481a.size() <= 0) {
            str = "/>";
            sb.append(str);
            return sb.toString();
        } else {
            sb.append(">");
            for (he d2 : this.f481a) {
                sb.append(d2.d());
            }
        }
        sb.append("</");
        sb.append(this.f82149a);
        str = ">";
        sb.append(str);
        return sb.toString();
    }

    public String toString() {
        return d();
    }
}
