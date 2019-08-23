package com.ss.android.ugc.aweme.setting.annotation;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63821a;

    /* renamed from: b  reason: collision with root package name */
    public static LinkedHashMap<String, ArrayList<c>> f63822b = new LinkedHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList<c> f63823c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    AbExtraField f63824d;

    /* renamed from: e  reason: collision with root package name */
    public Field f63825e;

    /* renamed from: f  reason: collision with root package name */
    public AbBooleanField f63826f;
    public AbIntField g;
    public ArrayList<String> h = new ArrayList<>();
    public String i;
    private Object j;

    c(Field field, Object obj) {
        String str;
        this.f63825e = field;
        this.j = obj;
        field.setAccessible(true);
        this.f63824d = (AbExtraField) field.getAnnotation(AbExtraField.class);
        this.h.add(field.getName().toLowerCase());
        this.i = field.getName();
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName != null) {
            this.h.add(serializedName.value().toLowerCase());
        }
        this.f63826f = (AbBooleanField) field.getAnnotation(AbBooleanField.class);
        if (this.f63826f != null) {
            this.h.add(this.f63826f.b().toLowerCase());
            this.h.add(this.f63826f.a().toLowerCase());
            try {
                if (((Boolean) field.get(obj)).booleanValue()) {
                    str = this.f63826f.a();
                } else {
                    str = this.f63826f.b();
                }
                this.i = str;
            } catch (Exception unused) {
            }
        }
        this.g = (AbIntField) field.getAnnotation(AbIntField.class);
        if (this.g != null) {
            this.h.add(this.g.a());
            this.i = this.g.a();
        }
        if (this.g != null) {
            this.i = PushConstants.PUSH_TYPE_THROUGH_MESSAGE + this.i.trim().toLowerCase();
            return;
        }
        this.i = PushConstants.PUSH_TYPE_NOTIFY + this.i.trim().toLowerCase();
    }
}
