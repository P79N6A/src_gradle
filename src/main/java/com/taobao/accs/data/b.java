package com.taobao.accs.data;

import java.util.Comparator;

public class b implements Comparator<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f78942a;

    b(a aVar) {
        this.f78942a = aVar;
    }

    /* renamed from: a */
    public int compare(Integer num, Integer num2) {
        return num.intValue() - num2.intValue();
    }
}
