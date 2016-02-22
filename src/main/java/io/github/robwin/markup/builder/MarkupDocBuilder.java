/*
 *
 *  Copyright 2015 Robert Winkler
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */
package io.github.robwin.markup.builder;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * @author Robert Winkler
 */
public interface MarkupDocBuilder {

    /**
     * Builds a document section {@code title}.
     *
     * @param title title
     * @return this builder
     */
    MarkupDocBuilder documentTitle(String title);

    /**
     * Builds a level 1 section {@code title}.
     *
     * @param title title
     * @return this builder
     */
    MarkupDocBuilder sectionTitleLevel1(String title);

    /**
     * Builds a level 1 section {@code title} with a custom {@code anchor} for later reference.<br/>
     * Specified {@code anchor} will be normalized anyway.
     *
     * @param title title
     * @param anchor custom anchor. If null, auto-generate the anchor from the normalized title.
     * @return this builder
     */
    MarkupDocBuilder sectionTitleWithAnchorLevel1(String title, String anchor);

    /**
     * Builds a level 1 section {@code title} with an auto-generated anchor from the normalized title, for later reference.<br/>
     * This is an alias for {@link #sectionTitleWithAnchorLevel1(String, String) sectionTitleWithAnchorLevel1(title, null)}.
     *
     * @param title title
     * @return this builder
     */
    MarkupDocBuilder sectionTitleWithAnchorLevel1(String title);

    /**
     * Builds a level 2 section {@code title}.
     *
     * @param title title
     * @return this builder
     */
    MarkupDocBuilder sectionTitleLevel2(String title);

    /**
     * Builds a level 2 section {@code title} with a custom {@code anchor} for later reference.<br/>
     * Specified {@code anchor} will be normalized anyway.
     *
     * @param title title
     * @param anchor custom anchor. If null, auto-generate the anchor from the normalized title.
     * @return this builder
     */
    MarkupDocBuilder sectionTitleWithAnchorLevel2(String title, String anchor);

    /**
     * Builds a level 2 section {@code title} with an auto-generated anchor from the normalized title, for later reference.<br/>
     * This is an alias for {@link #sectionTitleWithAnchorLevel2(String, String) sectionTitleWithAnchorLevel2(title, null)}.
     *
     * @param title title
     * @return this builder
     */
    MarkupDocBuilder sectionTitleWithAnchorLevel2(String title);

    /**
     * Builds a level 3 section {@code title}.
     *
     * @param title title
     * @return this builder
     */
    MarkupDocBuilder sectionTitleLevel3(String title);

    /**
     * Builds a level 3 section {@code title} with a custom {@code anchor} for later reference.<br/>
     * Specified {@code anchor} will be normalized anyway.
     *
     * @param title title
     * @param anchor custom anchor. If null, auto-generate the anchor from the normalized title.
     * @return this builder
     */
    MarkupDocBuilder sectionTitleWithAnchorLevel3(String title, String anchor);

    /**
     * Builds a level 3 section {@code title} with an auto-generated anchor from the normalized title, for later reference.<br/>
     * This is an alias for {@link #sectionTitleWithAnchorLevel3(String, String) sectionTitleWithAnchorLevel3(title, null)}.
     *
     * @param title title
     * @return this builder
     */
    MarkupDocBuilder sectionTitleWithAnchorLevel3(String title);

    /**
     * Builds a level 4 section {@code title}.
     *
     * @param title title
     * @return this builder
     */
    MarkupDocBuilder sectionTitleLevel4(String title);

    /**
     * Builds a level 4 section {@code title} with a custom {@code anchor} for later reference.<br/>
     * Specified {@code anchor} will be normalized anyway.
     *
     * @param title title
     * @param anchor custom anchor. If null, auto-generate the anchor from the normalized title.
     * @return this builder
     */
    MarkupDocBuilder sectionTitleWithAnchorLevel4(String title, String anchor);

    /**
     * Builds a level 4 section {@code title} with an auto-generated anchor from the normalized title, for later reference.<br/>
     * This is an alias for {@link #sectionTitleWithAnchorLevel4(String, String) sectionTitleWithAnchorLevel4(title, null)}.
     *
     * @param title title
     * @return this builder
     */
    MarkupDocBuilder sectionTitleWithAnchorLevel4(String title);

    /**
     * Builds a regular text line.<br/>
     * This is an alias for {@link #textLine(String, boolean) textLine(text, false)}.
     *
     * @param text text
     * @return this builder
     */
    MarkupDocBuilder textLine(String text);

    /**
     * Builds a regular text line.
     *
     * @param text text
     * @param forceLineBreak add an explicit line break if true.
     * @return this builder
     */
    MarkupDocBuilder textLine(String text, boolean forceLineBreak);

    /**
     * Builds a regular text.
     *
     * @param text text
     * @return this builder
     */
    MarkupDocBuilder text(String text);

    /**
     * Builds a text paragraph.<br/>
     * Explicit line break is enabled for the whole paragraph.
     *
     * @param text multi-line text
     * @return this builder
     */
    MarkupDocBuilder paragraph(String text);

    /**
     * Builds a literal text block.<br/>
     * Line breaks are respected.
     *
     * @param text multi-line text
     * @return this builder
     */
    MarkupDocBuilder listing(String text);

    /**
     * Builds a source code block using the specified {@code language}.<br/>
     * Line breaks are respected.
     *
     * @param text multi-line text
     * @param language source code language
     * @return this builder
     */
    MarkupDocBuilder source(String text, String language);

    /**
     * Builds a bold text line.<br/>
     * This is an alias for {@link #boldTextLine(String, boolean) boldTextLine(text, false)}.
     *
     * @param text text
     * @return this builder
     */
    MarkupDocBuilder boldTextLine(String text);

    /**
     * Builds a bold text line.
     *
     * @param text text
     * @param forceLineBreak add an explicit line break if true.
     * @return this builder
     */
    MarkupDocBuilder boldTextLine(String text, boolean forceLineBreak);

    /**
     * Builds a bold text.
     *
     * @param text text
     * @return this builder
     */
    MarkupDocBuilder boldText(String text);

    /**
     * Builds an italic text line.<br/>
     * This is an alias for {@link #italicTextLine(String, boolean) italicTextLine(text, false)}.
     *
     * @param text text
     * @return this builder
     */
    MarkupDocBuilder italicTextLine(String text);

    /**
     * Builds an italic text line.
     *
     * @param text text
     * @param forceLineBreak add an explicit line break if true.
     * @return this builder
     */
    MarkupDocBuilder italicTextLine(String text, boolean forceLineBreak);

    /**
     * Builds an italic text.
     *
     * @param text text
     * @return this builder
     */
    MarkupDocBuilder italicText(String text);

    /**
     * Builds an unordered item list
     *
     * @param list list of items
     * @return this builder
     */
    MarkupDocBuilder unorderedList(List<String> list);

    /**
     * Builds a single list item
     *
     * @param item item
     * @return this builder
     */
    MarkupDocBuilder unorderedListItem(String item);

    @Deprecated
    MarkupDocBuilder tableWithHeaderRow(List<String> rowsInPSV);

    /**
     * Builds a table without column specifiers, using specified cell values.<br/>
     * This is an alias for {@link #tableWithColumnSpecs(List, List) tableWithColumnSpecs(null, cells)}.<br/>
     * Limited support : Markdown does not support table without headers.
     *
     * @param cells cell values
     * @return this builder
     */
    MarkupDocBuilder table(List<List<String>> cells);

    /**
     * Builds a table with column specifiers, using specified cell values.
     *
     * @param columnSpecs list of column specifiers. Ignored if null.
     * @param cells cell values
     * @return this builder
     */
    MarkupDocBuilder tableWithColumnSpecs(List<MarkupTableColumn> columnSpecs, List<List<String>> cells);

    /**
     * Builds a custom {@code anchor} for later reference.<br/>
     * Specified {@code anchor} will be normalized anyway.<br/>
     * Limited support : Markdown does not support default text for anchors, and will ignore {@code text}.
     *
     * @param anchor custom anchor
     * @param text default text to display when a cross-reference does not have text itself. Ignored if null.
     * @return this builder
     */
    MarkupDocBuilder anchor(String anchor, String text);

    /**
     * Builds a custom {@code anchor} for later reference.<br/>
     * Specified {@code anchor} will be normalized anyway.
     *
     * @param anchor custom anchor
     * @return this builder
     */
    MarkupDocBuilder anchor(String anchor);

    /**
     * Builds an inter-document cross-reference to {@code document}#{@code anchor} with specified {@code text}.<br/>
     * This is the "raw anchor" version. Use the preferred method {@link #crossReference(String, String, String)} instead.<br/>
     * Specified {@code anchor} is built as-is, without any normalization.
     *
     * @param document document to point to. Reference becomes a simple cross-reference if null.
     * @param anchor anchor to point to
     * @param text display text
     * @return this builder
     */
    MarkupDocBuilder crossReferenceRaw(String document, String anchor, String text);

    /**
     * Builds an cross-reference to local document {@code anchor} with specified {@code text}.<br/>
     * This is the "raw anchor" version. Use the preferred method {@link #crossReference(String, String)} instead.<br/>
     * Specified {@code anchor} is built as-is, without any normalization.
     *
     * @param anchor anchor to point to
     * @param text display text
     * @return this builder
     */
    MarkupDocBuilder crossReferenceRaw(String anchor, String text);

    /**
     * Builds an cross-reference to local document {@code anchor}.<br/>
     * This is the "raw anchor" version. Use the preferred method {@link #crossReference(String)} instead.<br/>
     * Specified {@code anchor} is built as-is, without any normalization.
     *
     * @param anchor anchor to point to
     * @return this builder
     */
    MarkupDocBuilder crossReferenceRaw(String anchor);

    /**
     * Builds an inter-document cross-reference to {@code document}#{@code anchor} with specified {@code text}.<br/>
     * Specified {@code anchor} will be normalized anyway.
     *
     * @param document document to point to. Reference becomes a simple cross-reference if null.
     * @param anchor anchor to point to
     * @param text display text
     * @return this builder
     */
    MarkupDocBuilder crossReference(String document, String anchor, String text);

    /**
     * Builds an cross-reference to local document {@code anchor} with specified {@code text}.<br/>
     * Specified {@code anchor} will be normalized anyway.
     *
     * @param anchor anchor to point to
     * @param text display text
     * @return this builder
     */
    MarkupDocBuilder crossReference(String anchor, String text);

    /**
     * Builds an cross-reference to local document {@code anchor}.<br/>
     * Specified {@code anchor} will be normalized anyway.
     *
     * @param anchor anchor to point to
     * @return this builder
     */
    MarkupDocBuilder crossReference(String anchor);

    /**
     * Builds a newline using {@code System.getProperty("line.separator")}.<br/>
     * This is an alias for {@link #newLine(boolean) newLine(false)}.
     *
     * @return this builder
     */
    MarkupDocBuilder newLine();

    /**
     * Builds a newline using {@code System.getProperty("line.separator")}.
     *
     * @param forceLineBreak add an explicit line break if true.
     * @return this builder
     */
    MarkupDocBuilder newLine(boolean forceLineBreak);

    /**
     * Returns a string representation of the document.
     */
    String toString();

    /**
     * Configure this builder to prefix all generated anchors with {@code prefix}.
     *
     * @param prefix anchor prefix
     * @return this builder
     */
    MarkupDocBuilder withAnchorPrefix(String prefix);

    /**
     * @return anchor prefix configuration
     */
    String getAnchorPrefix();

    /**
     * Builds a new instance of this builder with a state copy.
     *
     * @return new builder instance with a state copy
     */
    MarkupDocBuilder copy();

    /**
     * Add an extension to fileName depending on markup language.
     *
     * @param fileName without extension
     * @return fileName with an extension
     */
    String addfileExtension(String fileName);

    /**
     * Writes the content of the builder to a file and clears the builder.<br/>
     * An extension will be dynamically added to fileName depending on the markup language.
     *
     * @param directory the directory where the generated file should be stored
     * @param fileName the base name of the file without extension
     * @param charset the the charset to use for encoding
     * @throws java.io.IOException if the file cannot be written
     */
    void writeToFile(String directory, String fileName, Charset charset) throws IOException;

    /**
     * Writes the content of the builder to a file and clears the builder.
     *
     * @param directory the directory where the generated file should be stored
     * @param fileName the name of the file
     * @param charset the the charset to use for encoding
     * @throws java.io.IOException if the file cannot be written
     */
     void writeToFileWithoutExtension(String directory, String fileName, Charset charset) throws IOException;

}