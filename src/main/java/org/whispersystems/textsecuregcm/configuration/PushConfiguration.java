package org.whispersystems.textsecuregcm.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;

public class PushConfiguration {
  @JsonProperty
  private boolean enabled = true;

  @JsonProperty
  @NotEmpty
  private String host = "127.0.0.1";

  @JsonProperty
  @Min(1)
  private int port = 9090;

  @JsonProperty
  @NotEmpty
  private String username = "default";

  @JsonProperty
  @NotEmpty
  private String password = "default";

  @JsonProperty
  @Min(0)
  private int queueSize = 200;

  public boolean isEnabled() {
    return enabled;
  }

  public String getHost() {
    return host;
  }

  public int getPort() {
    return port;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public int getQueueSize() {
    return queueSize;
  }
}
