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

package com.google.api.services.safebrowsing.model;

/**
 * The constraints for this update.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Safe Browsing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Constraints extends com.google.api.client.json.GenericJson {

  /**
   * A client's physical location, expressed as a ISO 31166-1 alpha-2 region code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceLocation;

  /**
   * Requests the lists for a specific language. Expects ISO 639 alpha-2 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * Sets the maximum number of entries that the client is willing to have in the local database for
   * the specified list. This should be a power of 2 between 2**10 and 2**20. If zero, no database
   * size limit is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxDatabaseEntries;

  /**
   * The maximum size in number of entries. The update will not contain more entries than this
   * value.  This should be a power of 2 between 2**10 and 2**20.  If zero, no update size limit is
   * set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxUpdateEntries;

  /**
   * Requests the list for a specific geographic location. If not set the server may pick that value
   * based on the user's IP address. Expects ISO 3166-1 alpha-2 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * The compression types supported by the client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> supportedCompressions;

  /**
   * A client's physical location, expressed as a ISO 31166-1 alpha-2 region code.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceLocation() {
    return deviceLocation;
  }

  /**
   * A client's physical location, expressed as a ISO 31166-1 alpha-2 region code.
   * @param deviceLocation deviceLocation or {@code null} for none
   */
  public Constraints setDeviceLocation(java.lang.String deviceLocation) {
    this.deviceLocation = deviceLocation;
    return this;
  }

  /**
   * Requests the lists for a specific language. Expects ISO 639 alpha-2 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * Requests the lists for a specific language. Expects ISO 639 alpha-2 format.
   * @param language language or {@code null} for none
   */
  public Constraints setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  /**
   * Sets the maximum number of entries that the client is willing to have in the local database for
   * the specified list. This should be a power of 2 between 2**10 and 2**20. If zero, no database
   * size limit is set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxDatabaseEntries() {
    return maxDatabaseEntries;
  }

  /**
   * Sets the maximum number of entries that the client is willing to have in the local database for
   * the specified list. This should be a power of 2 between 2**10 and 2**20. If zero, no database
   * size limit is set.
   * @param maxDatabaseEntries maxDatabaseEntries or {@code null} for none
   */
  public Constraints setMaxDatabaseEntries(java.lang.Integer maxDatabaseEntries) {
    this.maxDatabaseEntries = maxDatabaseEntries;
    return this;
  }

  /**
   * The maximum size in number of entries. The update will not contain more entries than this
   * value.  This should be a power of 2 between 2**10 and 2**20.  If zero, no update size limit is
   * set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxUpdateEntries() {
    return maxUpdateEntries;
  }

  /**
   * The maximum size in number of entries. The update will not contain more entries than this
   * value.  This should be a power of 2 between 2**10 and 2**20.  If zero, no update size limit is
   * set.
   * @param maxUpdateEntries maxUpdateEntries or {@code null} for none
   */
  public Constraints setMaxUpdateEntries(java.lang.Integer maxUpdateEntries) {
    this.maxUpdateEntries = maxUpdateEntries;
    return this;
  }

  /**
   * Requests the list for a specific geographic location. If not set the server may pick that value
   * based on the user's IP address. Expects ISO 3166-1 alpha-2 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * Requests the list for a specific geographic location. If not set the server may pick that value
   * based on the user's IP address. Expects ISO 3166-1 alpha-2 format.
   * @param region region or {@code null} for none
   */
  public Constraints setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * The compression types supported by the client.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSupportedCompressions() {
    return supportedCompressions;
  }

  /**
   * The compression types supported by the client.
   * @param supportedCompressions supportedCompressions or {@code null} for none
   */
  public Constraints setSupportedCompressions(java.util.List<java.lang.String> supportedCompressions) {
    this.supportedCompressions = supportedCompressions;
    return this;
  }

  @Override
  public Constraints set(String fieldName, Object value) {
    return (Constraints) super.set(fieldName, value);
  }

  @Override
  public Constraints clone() {
    return (Constraints) super.clone();
  }

}
