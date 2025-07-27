package com.deepresearch.assistant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeminiResponse {

  private List<Candidate> candidates;

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  static class Candidate {

    private Content content;

  }

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  static class Content {

    private List<Part> parts;

  }

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  static class Part {

    private String text;

  }
}
