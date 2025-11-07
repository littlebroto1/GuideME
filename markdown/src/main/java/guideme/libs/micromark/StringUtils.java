package guideme.libs.micromark;

import java.util.function.Function;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class StringUtils {
    public static String replaceAll(String templateText, Pattern pattern,
                                     Function<MatchResult, String> replacer) {
        Matcher matcher = pattern.matcher(templateText);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, replacer.apply(matcher));
        }
        matcher.appendTail(result);
        return result.toString();
    }
}
