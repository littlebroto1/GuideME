package guideme.style;

import net.minecraft.network.chat.FontDescription;

import guideme.color.ColorValue;

/**
 * Represents the styling of text for rendering.
 */
public record ResolvedTextStyle(float fontScale, boolean bold, boolean italic, boolean underlined,
    boolean strikethrough, boolean obfuscated, FontDescription font, ColorValue color, WhiteSpaceMode whiteSpace,
    TextAlignment alignment, boolean dropShadow) {}
