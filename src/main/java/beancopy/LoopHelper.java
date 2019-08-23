package beancopy;

import java.util.ArrayList;
import java.util.List;

public class LoopHelper {
    public static Object object2object(Object obj, Object obj2) {
        return null;
    }

    public static Object[] List2Array(List list, Object[] objArr) {
        if (list == null) {
            return objArr;
        }
        if (list.isEmpty()) {
            return new Object[0];
        }
        Object[] objArr2 = new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {
            objArr2[i] = object2object(list.get(i), null);
        }
        return objArr2;
    }

    public static List List2List(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object object2object : list) {
            arrayList.add(object2object(object2object, null));
        }
        return arrayList;
    }

    public static int[] ListInteger2ArrayInt(List<Integer> list, int[] iArr) {
        if (list == null) {
            return iArr;
        }
        if (list.isEmpty()) {
            return new int[0];
        }
        int[] iArr2 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr2[i] = BuiltInConvert.Integer2I(list.get(i));
        }
        return iArr2;
    }

    public static String[] ListString2ArrayString(List<String> list, String[] strArr) {
        if (list == null) {
            return strArr;
        }
        if (list.isEmpty()) {
            return new String[0];
        }
        String[] strArr2 = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr2[i] = list.get(i);
        }
        return strArr2;
    }
}
