/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.docs.v1.model;

/**
 * Update the styling of text.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateTextStyleRequest extends com.google.api.client.json.GenericJson {

  /**
   * The fields that should be updated.
   *
   * At least one field must be specified. The root `text_style` is implied and should not be
   * specified. A single `"*"` can be used as short-hand for listing every field.
   *
   * For example, to update the text style to bold, set `fields` to `"bold"`.
   *
   * To reset a property to its default value, include its field name in the field mask but leave
   * the field itself unset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String fields;

  /**
   * The range of text to style.
   *
   * The range may be extended to include adjacent newlines.
   *
   * If the range fully contains a paragraph belonging to a list, the paragraph's bullet is also
   * updated with the matching text style.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Range range;

  /**
   * The styles to set on the text.
   *
   * If the value for a particular style matches that of the parent, that style will be set to
   * inherit.
   *
   * Certain text style changes may cause other changes in order to to mirror the behavior of the
   * Docs editor. See the documentation of TextStyle for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextStyle textStyle;

  /**
   * The fields that should be updated.
   *
   * At least one field must be specified. The root `text_style` is implied and should not be
   * specified. A single `"*"` can be used as short-hand for listing every field.
   *
   * For example, to update the text style to bold, set `fields` to `"bold"`.
   *
   * To reset a property to its default value, include its field name in the field mask but leave
   * the field itself unset.
   * @return value or {@code null} for none
   */
  public String getFields() {
    return fields;
  }

  /**
   * The fields that should be updated.
   *
   * At least one field must be specified. The root `text_style` is implied and should not be
   * specified. A single `"*"` can be used as short-hand for listing every field.
   *
   * For example, to update the text style to bold, set `fields` to `"bold"`.
   *
   * To reset a property to its default value, include its field name in the field mask but leave
   * the field itself unset.
   * @param fields fields or {@code null} for none
   */
  public UpdateTextStyleRequest setFields(String fields) {
    this.fields = fields;
    return this;
  }

  /**
   * The range of text to style.
   *
   * The range may be extended to include adjacent newlines.
   *
   * If the range fully contains a paragraph belonging to a list, the paragraph's bullet is also
   * updated with the matching text style.
   * @return value or {@code null} for none
   */
  public Range getRange() {
    return range;
  }

  /**
   * The range of text to style.
   *
   * The range may be extended to include adjacent newlines.
   *
   * If the range fully contains a paragraph belonging to a list, the paragraph's bullet is also
   * updated with the matching text style.
   * @param range range or {@code null} for none
   */
  public UpdateTextStyleRequest setRange(Range range) {
    this.range = range;
    return this;
  }

  /**
   * The styles to set on the text.
   *
   * If the value for a particular style matches that of the parent, that style will be set to
   * inherit.
   *
   * Certain text style changes may cause other changes in order to to mirror the behavior of the
   * Docs editor. See the documentation of TextStyle for more information.
   * @return value or {@code null} for none
   */
  public TextStyle getTextStyle() {
    return textStyle;
  }

  /**
   * The styles to set on the text.
   *
   * If the value for a particular style matches that of the parent, that style will be set to
   * inherit.
   *
   * Certain text style changes may cause other changes in order to to mirror the behavior of the
   * Docs editor. See the documentation of TextStyle for more information.
   * @param textStyle textStyle or {@code null} for none
   */
  public UpdateTextStyleRequest setTextStyle(TextStyle textStyle) {
    this.textStyle = textStyle;
    return this;
  }

  @Override
  public UpdateTextStyleRequest set(String fieldName, Object value) {
    return (UpdateTextStyleRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateTextStyleRequest clone() {
    return (UpdateTextStyleRequest) super.clone();
  }

}