package guideme.libs.micromark;

import guideme.libs.micromark.commonmark.Attention;
import guideme.libs.micromark.commonmark.AutoLink;
import guideme.libs.micromark.commonmark.BlockQuote;
import guideme.libs.micromark.commonmark.CharacterEscape;
import guideme.libs.micromark.commonmark.CharacterReference;
import guideme.libs.micromark.commonmark.CodeFenced;
import guideme.libs.micromark.commonmark.CodeIndented;
import guideme.libs.micromark.commonmark.CodeText;
import guideme.libs.micromark.commonmark.Definition;
import guideme.libs.micromark.commonmark.HardBreakEscape;
import guideme.libs.micromark.commonmark.HeadingAtx;
import guideme.libs.micromark.commonmark.HtmlFlow;
import guideme.libs.micromark.commonmark.HtmlText;
import guideme.libs.micromark.commonmark.LabelEnd;
import guideme.libs.micromark.commonmark.LabelStartImage;
import guideme.libs.micromark.commonmark.LabelStartLink;
import guideme.libs.micromark.commonmark.ListConstruct;
import guideme.libs.micromark.commonmark.SetextUnderline;
import guideme.libs.micromark.commonmark.ThematicBreak;
import guideme.libs.micromark.symbol.Codes;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DefaultExtension {
    private DefaultExtension() {
    }

    public static Extension create() {
        var extension = new Extension();

        extension.document = new HashMap<>();
        extension.document.put(Codes.asterisk, ListUtils.of(ListConstruct.list));
        extension.document.put(Codes.plusSign, ListUtils.of(ListConstruct.list));
        extension.document.put(Codes.dash, ListUtils.of(ListConstruct.list));
        extension.document.put(Codes.digit0, ListUtils.of(ListConstruct.list));
        extension.document.put(Codes.digit1, ListUtils.of(ListConstruct.list));
        extension.document.put(Codes.digit2, ListUtils.of(ListConstruct.list));
        extension.document.put(Codes.digit3, ListUtils.of(ListConstruct.list));
        extension.document.put(Codes.digit4, ListUtils.of(ListConstruct.list));
        extension.document.put(Codes.digit5, ListUtils.of(ListConstruct.list));
        extension.document.put(Codes.digit6, ListUtils.of(ListConstruct.list));
        extension.document.put(Codes.digit7, ListUtils.of(ListConstruct.list));
        extension.document.put(Codes.digit8, ListUtils.of(ListConstruct.list));
        extension.document.put(Codes.digit9, ListUtils.of(ListConstruct.list));
        extension.document.put(Codes.greaterThan, ListUtils.of(BlockQuote.blockQuote));

        extension.contentInitial = MapUtils.of(
                Codes.leftSquareBracket, ListUtils.of(Definition.definition));

        extension.flowInitial = MapUtils.of(
                Codes.horizontalTab, ListUtils.of(CodeIndented.codeIndented),
                Codes.virtualSpace, ListUtils.of(CodeIndented.codeIndented),
                Codes.space, ListUtils.of(CodeIndented.codeIndented));

        extension.flow = MapUtils.of(
                Codes.numberSign, ListUtils.of(HeadingAtx.headingAtx),
                Codes.asterisk, ListUtils.of(ThematicBreak.thematicBreak),
                Codes.dash, ListUtils.of(SetextUnderline.setextUnderline, ThematicBreak.thematicBreak),
                Codes.lessThan, ListUtils.of(HtmlFlow.htmlFlow),
                Codes.equalsTo, ListUtils.of(SetextUnderline.setextUnderline),
                Codes.underscore, ListUtils.of(ThematicBreak.thematicBreak),
                Codes.graveAccent, ListUtils.of(CodeFenced.codeFenced),
                Codes.tilde, ListUtils.of(CodeFenced.codeFenced));

        extension.string = MapUtils.of(
                Codes.ampersand, ListUtils.of(CharacterReference.characterReference),
                Codes.backslash, ListUtils.of(CharacterEscape.characterEscape));

        extension.text = new HashMap<>();
        extension.text.put(Codes.carriageReturn, ListUtils.of(guideme.libs.micromark.commonmark.LineEnding.lineEnding));
        extension.text.put(Codes.lineFeed, ListUtils.of(guideme.libs.micromark.commonmark.LineEnding.lineEnding));
        extension.text.put(Codes.carriageReturnLineFeed,
            ListUtils.of(guideme.libs.micromark.commonmark.LineEnding.lineEnding));
        extension.text.put(Codes.exclamationMark, ListUtils.of(LabelStartImage.labelStartImage));
        extension.text.put(Codes.ampersand, ListUtils.of(CharacterReference.characterReference));
        extension.text.put(Codes.asterisk, ListUtils.of(Attention.attention));
        extension.text.put(Codes.lessThan, ListUtils.of(AutoLink.autolink, HtmlText.htmlText));
        extension.text.put(Codes.leftSquareBracket, ListUtils.of(LabelStartLink.labelStartLink));
        extension.text.put(Codes.backslash, ListUtils.of(HardBreakEscape.hardBreakEscape, CharacterEscape.characterEscape));
        extension.text.put(Codes.rightSquareBracket, ListUtils.of(LabelEnd.labelEnd));
        extension.text.put(Codes.underscore, ListUtils.of(Attention.attention));
        extension.text.put(Codes.graveAccent, ListUtils.of(CodeText.codeText));

        extension.nullInsideSpan = ListUtils.of(Attention.attention.resolveAll, InitializeText.resolver);

        extension.nullAttentionMarkers = ListUtils.of(Codes.asterisk, Codes.underscore);

        extension.nullDisable = ListUtils.of();

        return extension;
    }

}
