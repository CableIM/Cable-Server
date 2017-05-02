/**
 * Copyright (C) 2013 Open WhisperSystems
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.whispersystems.textsecuregcm.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class S3Configuration {

  @NotEmpty
  @JsonProperty
  private String accessKey;

  @NotEmpty
  @JsonProperty
  private String accessSecret;

  @NotEmpty
  @JsonProperty
  private String attachmentsBucket;

  @JsonProperty
  private String endpoint;

  @JsonProperty
  private String region;

  @JsonProperty
  private String signerAlgorithm;

  @JsonProperty
  private boolean pathStyleAccess = false;

  @JsonProperty
  private boolean disableAccelerate = false;

  public String getAccessKey() {
    return accessKey;
  }

  public String getAccessSecret() {
    return accessSecret;
  }

  public String getAttachmentsBucket() {
    return attachmentsBucket;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public String getRegion() {
    return region;
  }

  public String getSignerAlgorithm() {
    return signerAlgorithm;
  }

  public boolean getPathStyleAccess() {
    return pathStyleAccess;
  }

  public boolean getDisableAccelerate() {
    return disableAccelerate;
  }

}
