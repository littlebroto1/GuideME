package guideme.libs.micromark.html;

import guideme.libs.micromark.MapUtils;
import guideme.libs.micromark.StringUtils;

import java.util.Map;
import java.util.regex.Pattern;

public class HtmlEncode {

    private static final Map<String, String> characterReferences = MapUtils.of(
            "\"", "quot",
            "&", "amp",
            "<", "lt",
            ">", "gt");

    private static final Pattern ESCAPE_PATTERN = Pattern.compile("[\"&<>]");

    private HtmlEncode() {
    }

    /**
     * Encode only the dangerous HTML characters.
     * <p>
     * This ensures that certain characters which have special meaning in HTML are dealt with. Technically, we can skip
     * `>` and `"` in many cases, but CM includes them.
     */
    public static String encode(String value) {
        return StringUtils.replaceAll(value, ESCAPE_PATTERN, match -> {
            return "&" + characterReferences.get(match.group()) + ";";
        });
    }

}
