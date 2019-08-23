package com.ss.android.ugc.aweme.cloudcontrol.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class TemplateModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String data;
    private int op;

    public String getData() {
        return this.data;
    }

    public int getOp() {
        return this.op;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setOp(int i) {
        this.op = i;
    }
}
