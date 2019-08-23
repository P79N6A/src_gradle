package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/ScreenFloatValueRegEx;", "", "()V", "value", "Lkotlin/text/Regex;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public final class m {
    @NotNull
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public static final Regex f83774a;

    /* renamed from: b  reason: collision with root package name */
    public static final m f83775b = new m();

    private m() {
    }

    static {
        String str = "[eE][+-]?" + "(\\p{Digit}+)";
        String str2 = "(0[xX]" + "(\\p{XDigit}+)" + "(\\.)?)|(0[xX]" + "(\\p{XDigit}+)" + "?(\\.)" + "(\\p{XDigit}+)" + ')';
        String str3 = "(" + "(\\p{Digit}+)" + "(\\.)?(" + "(\\p{Digit}+)" + "?)(" + str + ")?)|(\\.(" + "(\\p{Digit}+)" + ")(" + str + ")?)|((" + str2 + ")[pP][+-]?" + "(\\p{Digit}+)" + ')';
        f83774a = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + str3 + ")[fFdD]?))[\\x00-\\x20]*");
    }
}
