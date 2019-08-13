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
 * Information about a single iteration of the training run.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IterationResult extends com.google.api.client.json.GenericJson {

  /**
   * Information about top clusters for clustering models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ClusterInfo> clusterInfos;

  static {
    // hack to force ProGuard to consider ClusterInfo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ClusterInfo.class);
  }

  /**
   * Time taken to run the iteration in milliseconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long durationMs;

  /**
   * Loss computed on the eval data at the end of iteration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double evalLoss;

  /**
   * Index of the iteration, 0 based.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer index;

  /**
   * Learn rate used for this iteration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double learnRate;

  /**
   * Loss computed on the training data at the end of iteration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double trainingLoss;

  /**
   * Information about top clusters for clustering models.
   * @return value or {@code null} for none
   */
  public java.util.List<ClusterInfo> getClusterInfos() {
    return clusterInfos;
  }

  /**
   * Information about top clusters for clustering models.
   * @param clusterInfos clusterInfos or {@code null} for none
   */
  public IterationResult setClusterInfos(java.util.List<ClusterInfo> clusterInfos) {
    this.clusterInfos = clusterInfos;
    return this;
  }

  /**
   * Time taken to run the iteration in milliseconds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDurationMs() {
    return durationMs;
  }

  /**
   * Time taken to run the iteration in milliseconds.
   * @param durationMs durationMs or {@code null} for none
   */
  public IterationResult setDurationMs(java.lang.Long durationMs) {
    this.durationMs = durationMs;
    return this;
  }

  /**
   * Loss computed on the eval data at the end of iteration.
   * @return value or {@code null} for none
   */
  public java.lang.Double getEvalLoss() {
    return evalLoss;
  }

  /**
   * Loss computed on the eval data at the end of iteration.
   * @param evalLoss evalLoss or {@code null} for none
   */
  public IterationResult setEvalLoss(java.lang.Double evalLoss) {
    this.evalLoss = evalLoss;
    return this;
  }

  /**
   * Index of the iteration, 0 based.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIndex() {
    return index;
  }

  /**
   * Index of the iteration, 0 based.
   * @param index index or {@code null} for none
   */
  public IterationResult setIndex(java.lang.Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Learn rate used for this iteration.
   * @return value or {@code null} for none
   */
  public java.lang.Double getLearnRate() {
    return learnRate;
  }

  /**
   * Learn rate used for this iteration.
   * @param learnRate learnRate or {@code null} for none
   */
  public IterationResult setLearnRate(java.lang.Double learnRate) {
    this.learnRate = learnRate;
    return this;
  }

  /**
   * Loss computed on the training data at the end of iteration.
   * @return value or {@code null} for none
   */
  public java.lang.Double getTrainingLoss() {
    return trainingLoss;
  }

  /**
   * Loss computed on the training data at the end of iteration.
   * @param trainingLoss trainingLoss or {@code null} for none
   */
  public IterationResult setTrainingLoss(java.lang.Double trainingLoss) {
    this.trainingLoss = trainingLoss;
    return this;
  }

  @Override
  public IterationResult set(String fieldName, Object value) {
    return (IterationResult) super.set(fieldName, value);
  }

  @Override
  public IterationResult clone() {
    return (IterationResult) super.clone();
  }

}
