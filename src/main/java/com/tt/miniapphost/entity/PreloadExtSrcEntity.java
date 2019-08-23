package com.tt.miniapphost.entity;

import com.tt.miniapphost.process.annotation.AnyProcess;

@AnyProcess
public class PreloadExtSrcEntity {
    private String extsrcid;
    private String extsrcurl;

    @AnyProcess
    public String getExtsrcuid() {
        return this.extsrcid;
    }

    @AnyProcess
    public String getExtsrcurl() {
        return this.extsrcurl;
    }

    @AnyProcess
    public void setExtsrcid(String str) {
        this.extsrcid = str;
    }

    @AnyProcess
    public void setExtsrcurl(String str) {
        this.extsrcurl = str;
    }
}
