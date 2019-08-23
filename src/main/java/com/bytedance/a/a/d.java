package com.bytedance.a.a;

import java.io.Serializable;

public final class d implements Serializable {
    public String content;
    public String name;
    public int type;

    public final String getContent() {
        return this.content;
    }

    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public static d obtainImg(String str) {
        d dVar = new d();
        dVar.setContent(str);
        dVar.setName("img");
        dVar.setType(2);
        return dVar;
    }

    public static d obtainTxt(String str, String str2) {
        d dVar = new d();
        dVar.setContent(str);
        dVar.setName(str2);
        dVar.setType(1);
        return dVar;
    }

    public static d obtainTxtFile(String str, String str2) {
        d dVar = new d();
        dVar.setContent(str);
        dVar.setName(str2);
        dVar.setType(3);
        return dVar;
    }

    public static d obtain(String str, String str2, int i) {
        d dVar = new d();
        dVar.setContent(str2);
        dVar.setName(str);
        dVar.setType(i);
        return dVar;
    }
}
