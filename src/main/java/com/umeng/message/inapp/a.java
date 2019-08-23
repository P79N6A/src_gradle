package com.umeng.message.inapp;

import android.content.ContentValues;
import android.database.Cursor;

public class a {

    /* renamed from: a  reason: collision with root package name */
    long f81228a;

    /* renamed from: b  reason: collision with root package name */
    String f81229b;

    /* renamed from: c  reason: collision with root package name */
    int f81230c;

    /* renamed from: d  reason: collision with root package name */
    int f81231d;

    /* renamed from: e  reason: collision with root package name */
    int f81232e;

    /* renamed from: f  reason: collision with root package name */
    int f81233f;
    int g;
    int h;
    int i;
    int j;

    /* access modifiers changed from: package-private */
    public ContentValues a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("Time", Long.valueOf(this.f81228a));
        contentValues.put("MsgId", this.f81229b);
        contentValues.put("MsgType", Integer.valueOf(this.f81230c));
        contentValues.put("NumDisplay", Integer.valueOf(this.f81231d));
        contentValues.put("NumOpenFull", Integer.valueOf(this.f81232e));
        contentValues.put("NumOpenTop", Integer.valueOf(this.f81233f));
        contentValues.put("NumOpenBottom", Integer.valueOf(this.g));
        contentValues.put("NumClose", Integer.valueOf(this.h));
        contentValues.put("NumDuration", Integer.valueOf(this.i));
        contentValues.put("NumCustom", Integer.valueOf(this.j));
        return contentValues;
    }

    a(Cursor cursor) {
        this.f81229b = cursor.getString(cursor.getColumnIndex("MsgId"));
        this.f81230c = cursor.getInt(cursor.getColumnIndex("MsgType"));
        this.f81231d = cursor.getInt(cursor.getColumnIndex("NumDisplay"));
        this.f81232e = cursor.getInt(cursor.getColumnIndex("NumOpenFull"));
        this.f81233f = cursor.getInt(cursor.getColumnIndex("NumOpenTop"));
        this.g = cursor.getInt(cursor.getColumnIndex("NumOpenBottom"));
        this.h = cursor.getInt(cursor.getColumnIndex("NumClose"));
        this.i = cursor.getInt(cursor.getColumnIndex("NumDuration"));
        this.j = cursor.getInt(cursor.getColumnIndex("NumCustom"));
    }

    a(String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f81228a = System.currentTimeMillis();
        this.f81229b = str;
        this.f81230c = i2;
        this.f81231d = i3;
        this.f81232e = i4;
        this.f81233f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
    }
}
