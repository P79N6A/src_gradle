package com.bytedance.frameworks.baselib.network.http.d;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Locale;

public final class b implements Externalizable {
    private c parameters;
    private String primaryType;
    private String subType;

    public final c getParameters() {
        return this.parameters;
    }

    public final String getPrimaryType() {
        return this.primaryType;
    }

    public final String getSubType() {
        return this.subType;
    }

    public b() {
        this.primaryType = "application";
        this.subType = "*";
        this.parameters = new c();
    }

    public final String getBaseType() {
        return this.primaryType + "/" + this.subType;
    }

    public final String toString() {
        return getBaseType() + this.parameters.toString();
    }

    public b(String str) throws d {
        a(str);
    }

    public final boolean match(String str) throws d {
        return match(new b(str));
    }

    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(toString());
        objectOutput.flush();
    }

    private static boolean a(char c2) {
        if (c2 <= ' ' || c2 >= 127 || "()<>@,;:/[]?=\\\"".indexOf(c2) >= 0) {
            return false;
        }
        return true;
    }

    private static boolean b(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!a(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public final String getParameter(String str) {
        return (String) this.parameters.f19851a.get(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public final void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        try {
            a(objectInput.readUTF());
        } catch (d e2) {
            throw new IOException(e2.toString());
        }
    }

    public final void removeParameter(String str) {
        this.parameters.f19851a.remove(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public final void setPrimaryType(String str) throws d {
        if (b(this.primaryType)) {
            this.primaryType = str.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new d("Primary type is invalid.");
    }

    public final void setSubType(String str) throws d {
        if (b(this.subType)) {
            this.subType = str.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new d("Sub type is invalid.");
    }

    public final boolean match(b bVar) {
        if (!this.primaryType.equals(bVar.getPrimaryType()) || (!this.subType.equals("*") && !bVar.getSubType().equals("*") && !this.subType.equals(bVar.getSubType()))) {
            return false;
        }
        return true;
    }

    private void a(String str) throws d {
        int indexOf = str.indexOf(47);
        int indexOf2 = str.indexOf(59);
        if (indexOf < 0 && indexOf2 < 0) {
            throw new d("Unable to find a sub type.");
        } else if (indexOf >= 0 || indexOf2 < 0) {
            if (indexOf >= 0 && indexOf2 < 0) {
                this.primaryType = str.substring(0, indexOf).trim().toLowerCase(Locale.ENGLISH);
                this.subType = str.substring(indexOf + 1).trim().toLowerCase(Locale.ENGLISH);
                this.parameters = new c();
            } else if (indexOf < indexOf2) {
                this.primaryType = str.substring(0, indexOf).trim().toLowerCase(Locale.ENGLISH);
                this.subType = str.substring(indexOf + 1, indexOf2).trim().toLowerCase(Locale.ENGLISH);
                this.parameters = new c(str.substring(indexOf2));
            } else {
                throw new d("Unable to find a sub type.");
            }
            if (!b(this.primaryType)) {
                throw new d("Primary type is invalid.");
            } else if (!b(this.subType)) {
                throw new d("Sub type is invalid.");
            }
        } else {
            throw new d("Unable to find a sub type.");
        }
    }

    public final void setParameter(String str, String str2) {
        this.parameters.f19851a.put(str.trim().toLowerCase(Locale.ENGLISH), str2);
    }

    public b(String str, String str2) throws d {
        if (b(str)) {
            this.primaryType = str.toLowerCase(Locale.ENGLISH);
            if (b(str2)) {
                this.subType = str2.toLowerCase(Locale.ENGLISH);
                this.parameters = new c();
                return;
            }
            throw new d("Sub type is invalid.");
        }
        throw new d("Primary type is invalid.");
    }
}
