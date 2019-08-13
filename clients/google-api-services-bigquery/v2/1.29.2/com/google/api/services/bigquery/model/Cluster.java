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

package com.google.api.services.bigquery.model;

/**
 * Message containing the information about one cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Cluster extends com.google.api.client.json.GenericJson {

  /**
   * Centroid id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long centroidId;

  /**
   * Count of training data rows that were assigned to this cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long count;

  /**
   * Values of highly variant features for this cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FeatureValue> featureValues;

  /**
   * Centroid id.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCentroidId() {
    return centroidId;
  }

  /**
   * Centroid id.
   * @param centroidId centroidId or {@code null} for none
   */
  public Cluster setCentroidId(java.lang.Long centroidId) {
    this.centroidId = centroidId;
    return this;
  }

  /**
   * Count of training data rows that were assigned to this cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCount() {
    return count;
  }

  /**
   * Count of training data rows that were assigned to this cluster.
   * @param count count or {@code null} for none
   */
  public Cluster setCount(java.lang.Long count) {
    this.count = count;
    return this;
  }

  /**
   * Values of highly variant features for this cluster.
   * @return value or {@code null} for none
   */
  public java.util.List<FeatureValue> getFeatureValues() {
    return featureValues;
  }

  /**
   * Values of highly variant features for this cluster.
   * @param featureValues featureValues or {@code null} for none
   */
  public Cluster setFeatureValues(java.util.List<FeatureValue> featureValues) {
    this.featureValues = featureValues;
    return this;
  }

  @Override
  public Cluster set(String fieldName, Object value) {
    return (Cluster) super.set(fieldName, value);
  }

  @Override
  public Cluster clone() {
    return (Cluster) super.clone();
  }

}
