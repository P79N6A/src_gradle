package com.ss.android.common.http;

import com.ss.android.common.util.c;
import com.ss.android.common.util.d;
import com.ss.android.common.util.h;
import com.ss.android.http.a.a;
import com.ss.android.http.a.b.e;
import com.ss.android.http.a.b.f;
import java.util.List;
import org.apache.http.client.RedirectHandler;

public interface b {
    String a(int i, int i2, String str, List<a> list) throws Exception;

    String a(int i, int i2, String str, List<e> list, com.ss.android.common.http.a.a aVar, d[] dVarArr) throws Exception;

    String a(int i, int i2, String str, List<a> list, boolean z, boolean z2, f fVar, boolean z3) throws Exception;

    String a(int i, int i2, String str, List<e> list, boolean z, d[] dVarArr, List<a> list2) throws Exception;

    String a(int i, int i2, String str, byte[] bArr, String str2, String str3) throws Exception;

    String a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<a> list) throws Exception;

    String a(int i, String str, com.ss.android.common.http.a.a aVar, d<Long> dVar, long j, d[] dVarArr) throws Exception;

    boolean a(int i, String str, String str2, String str3, String str4, c<String> cVar, String str5, h hVar, List<e> list, String[] strArr, int[] iArr) throws Exception;

    boolean a(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, c<String> cVar, String str2, h hVar, List<e> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) throws Exception;

    byte[] a(int i, String str) throws Exception;

    String b(int i, int i2, String str, List<e> list, boolean z, d[] dVarArr, List<a> list2) throws Exception;

    String b(int i, int i2, String str, byte[] bArr, String str2, String str3, List<a> list) throws Exception;
}
