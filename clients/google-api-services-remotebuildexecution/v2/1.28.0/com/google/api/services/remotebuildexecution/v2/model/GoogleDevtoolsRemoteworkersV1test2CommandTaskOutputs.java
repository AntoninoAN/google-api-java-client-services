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

package com.google.api.services.remotebuildexecution.v2.model;

/**
 * Describes the expected outputs of the command.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs extends com.google.api.client.json.GenericJson {

  /**
   * A list of expected directories, relative to the execution root. All paths MUST be delimited by
   * forward slashes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> directories;

  /**
   * A list of expected files, relative to the execution root. All paths MUST be delimited by
   * forward slashes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> files;

  /**
   * The destination to which any stderr should be sent. The method by which the bot should send the
   * stream contents to that destination is not defined in this API. As examples, the destination
   * could be a file referenced in the `files` field in this message, or it could be a URI that must
   * be written via the ByteStream API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stderrDestination;

  /**
   * The destination to which any stdout should be sent. The method by which the bot should send the
   * stream contents to that destination is not defined in this API. As examples, the destination
   * could be a file referenced in the `files` field in this message, or it could be a URI that must
   * be written via the ByteStream API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stdoutDestination;

  /**
   * A list of expected directories, relative to the execution root. All paths MUST be delimited by
   * forward slashes.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDirectories() {
    return directories;
  }

  /**
   * A list of expected directories, relative to the execution root. All paths MUST be delimited by
   * forward slashes.
   * @param directories directories or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs setDirectories(java.util.List<java.lang.String> directories) {
    this.directories = directories;
    return this;
  }

  /**
   * A list of expected files, relative to the execution root. All paths MUST be delimited by
   * forward slashes.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFiles() {
    return files;
  }

  /**
   * A list of expected files, relative to the execution root. All paths MUST be delimited by
   * forward slashes.
   * @param files files or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs setFiles(java.util.List<java.lang.String> files) {
    this.files = files;
    return this;
  }

  /**
   * The destination to which any stderr should be sent. The method by which the bot should send the
   * stream contents to that destination is not defined in this API. As examples, the destination
   * could be a file referenced in the `files` field in this message, or it could be a URI that must
   * be written via the ByteStream API.
   * @return value or {@code null} for none
   */
  public java.lang.String getStderrDestination() {
    return stderrDestination;
  }

  /**
   * The destination to which any stderr should be sent. The method by which the bot should send the
   * stream contents to that destination is not defined in this API. As examples, the destination
   * could be a file referenced in the `files` field in this message, or it could be a URI that must
   * be written via the ByteStream API.
   * @param stderrDestination stderrDestination or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs setStderrDestination(java.lang.String stderrDestination) {
    this.stderrDestination = stderrDestination;
    return this;
  }

  /**
   * The destination to which any stdout should be sent. The method by which the bot should send the
   * stream contents to that destination is not defined in this API. As examples, the destination
   * could be a file referenced in the `files` field in this message, or it could be a URI that must
   * be written via the ByteStream API.
   * @return value or {@code null} for none
   */
  public java.lang.String getStdoutDestination() {
    return stdoutDestination;
  }

  /**
   * The destination to which any stdout should be sent. The method by which the bot should send the
   * stream contents to that destination is not defined in this API. As examples, the destination
   * could be a file referenced in the `files` field in this message, or it could be a URI that must
   * be written via the ByteStream API.
   * @param stdoutDestination stdoutDestination or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs setStdoutDestination(java.lang.String stdoutDestination) {
    this.stdoutDestination = stdoutDestination;
    return this;
  }

  @Override
  public GoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs set(String fieldName, Object value) {
    return (GoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs clone() {
    return (GoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs) super.clone();
  }

}
