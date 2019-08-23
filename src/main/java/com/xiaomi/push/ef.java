package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.LoggerInterface;

public class ef implements LoggerInterface {

    /* renamed from: a  reason: collision with root package name */
    private LoggerInterface f81975a;

    /* renamed from: b  reason: collision with root package name */
    private LoggerInterface f81976b;

    public ef(LoggerInterface loggerInterface, LoggerInterface loggerInterface2) {
        this.f81975a = loggerInterface;
        this.f81976b = loggerInterface2;
    }

    public void log(String str) {
        if (this.f81975a != null) {
            this.f81975a.log(str);
        }
        if (this.f81976b != null) {
            this.f81976b.log(str);
        }
    }

    public void log(String str, Throwable th) {
        if (this.f81975a != null) {
            this.f81975a.log(str, th);
        }
        if (this.f81976b != null) {
            this.f81976b.log(str, th);
        }
    }

    public void setTag(String str) {
    }
}
